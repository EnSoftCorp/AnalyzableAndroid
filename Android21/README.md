# Analysis steps for android-5.0.2_r1

## 1) Create VM
Create VM with Ubuntu 14.04 64bit, 120 GB HD, 16 GB RAM, 4 processors x 2 cores

## 2) Install Dependencies
`sudo apt-get update`

`sudo apt-get install openjdk-7-jdk`

`sudo update-alternatives --config java`

`sudo update-alternatives --config javac`

`sudo apt-get install bison g++-multilib git gperf libxml2-utils`

`sudo apt-get install curl`

## 3) Download source
`mkdir WORKING_DIRECTORY`

`cd WORKING_DIRECTORY`

`mkdir ~/bin`

`PATH=~/bin:$PATH`

`git config --global user.email "android@exaple.com"`

`git config --global user.name "Android"`

`curl https://storage.googleapis.com/git-repo-downloads/repo > ~/bin/repo`

`chmod a+x ~/bin/repo`

`repo init -u https://android.googlesource.com/platform/manifest -b android-5.0.2_r1`

`repo sync`

Checkout release version of all projects

`repo forall -c 'git checkout tags/android-5.0.2_r1'`

Note: It seems this tagged version had some build errors ("error while loading shared libraries: libz.so.1:cannot open shared object file : No such file or directory") that were later fixed.  I needed to update some libraries to get around the issue.

`sudo apt-get install -y libc6:i386 libgcc1:i386 libstdc++6:i386 libz1:i386`

See [http://askubuntu.com/a/498660/288472](http://askubuntu.com/a/498660/288472)

## 4) Verify source (optional)

See [https://source.android.com/source/downloading.html#verifying-git-tags](https://source.android.com/source/downloading.html#verifying-git-tags)

## 5) Configure build target

`source build/envsetup.sh`

`lunch aosp_arm-user`

## 6) Install fake javac

Edit Tools/javac to point at a folder in your home directory.  Then follow technique 1 or 2.  Technique 1 is confirmed working.

Make sure javac has unix style line endings and not Windows!  It will fail otherwise.  You can use `dos2unix` utility to convert.

`sudo apt-get install dos2unix`

`dos2unix Tools/javac Tools/javac`

After following one of the techniques below, verify that the javac commands are being intercepted by running `javac -help` and checking that the command is logged in the javac.txt file at the base directory (defined in the script).  If the directory does not exist you may need to created it.

After setting up technique 1 or 2, make sure `make clean` gets logged to the spy directory before proceeding (it should log `javac -v` when it displays the version).

### Technique 1 (replace javac system link)
`sudo mv /usr/bin/javac /usr/bin/javac2`

`sudo cp Tools/javac /usr/bin/javac`

`sudo chmod 777 /usr/bin/javac`

Edit build/core/find-jdk-tools-jar.sh to run `which javac2` instead of `which javac`.

Run `make clean` and verify that javac is capturing.  The `make clean` command calls `javac -v` to get the version.  If this doesn't happen try restarting the terminal in case some environment variables or something got cached.

### Technique 2 (be the first javac on path)

`mkdir ~/bin`

`cp Tools/javac ~/bin/javac`

`export PATH=~/bin:$PATH`

`echo $PATH`

`which javac`

You may need to set ANDROID\_JAVA\_HOME environment variable so that build/core/find-jdk-tools-jar.sh does not get confused.

`export ANDROID_JAVA_HOME=$JAVA_HOME`

## 7) Compile source

`make -j8`

## 8) Save and organize captured source
Zip up and save the fake javac output directory (aka spy directory).  Using the OrganizeJava program, you can feed the spy directory in as input and output a directory organized by the Java source files packages.  From here you will need to do some manual massaging to get the source to compile as an eclipse project.  Best strategy ended up being to pull all sources (without ignoring any packages) and then manually pruning out unrelated packages and test code.  One odd thing was in he camera and the wallpaper packages the source was intentionally causing a few package collisions to replace base class functionalities, which made for a few very confusing cases to resolve until I realized what was happening.

# Building bytecode (Jimple) project

Download and run the [gather_intermediate_jars.pl](https://github.com/EnSoftCorp/AnalyzableAndroid/blob/master/Tools/gather_intermediate_jars.pl) script (you probably need to make the script executable).  The script outputs a directory called "jars" in the same directory that it is run from.  Create an empty Eclipse project and delete all the current jars including the runtime libraries.  Then create a folder called "apps" and "framework" and place the corresponding jars in each folder.  Add just the "framework" jars to the project's class path.  Add all the newly added jars to the classpath.  Export the project as an executable jar with the "extract required libraries into generated JAR" option enabled (choosing any one of the existing main methods) and name the jar as "android.jar".  Then remove all jars from the class path, add the android.jar to the root of the Eclipse project and add it to the class path.  Export the entire file system of the project.

# PScout

## Install dependencies 

Use source at: [https://github.com/benjholla/pscout](https://github.com/benjholla/pscout)

`sudo apt-get install libexpat1-dev`

`sudo apt-get install libxml-simple-perl`

`sudo perl -MCPAN -e shell`

`install XML::Simple` (should already be installed, for some reason doing this directly failed earlier)

`exit` (type exit to quit the shell)

## Setup environment

PScout wants Android to be built with all binaries (not just the user production mode binaries).

`cd WORKING_DIRECTORY`

`make clean`

`lunch full-eng`

`make -j8`

Move out of Android build directory and download PScout.

` cd ..`

`git clone https://github.com/benjholla/pscout`

`cd pscout`

`mkdir ANDROID_CLASS_DIR`

`cd ANDROID_CLASS_DIR`

Configure PScout to know where Android Source directory is (should already be built with `full-eng`).

`../bin/setupanalysis.sh <ANDROID_SOURCE_DIR>` 

## Run PScout analysis commands
`../bin/dumpclass.sh`

`../bin/postprocess_1.sh`

`../bin/intentpermissioncheck.sh`

`../bin/postprocess_2.sh`

The output results will be in `ANDROID_CLASS_DIR` (not `results`).  

Save the following files: `allmappings`, `contentproviderfieldpermission`, `contentproviderpermission`, `intentpermissions`, and `publishedapimapping`.

## Convert to XML for Android Essentials Toolbox

See [https://github.com/EnSoftCorp/android-essentials-toolbox/blob/master/AndroidPermissionGenerator/src/com/ensoftcorp/open/ConvertPScoutToXML.java](https://github.com/EnSoftCorp/android-essentials-toolbox/blob/master/AndroidPermissionGenerator/src/com/ensoftcorp/open/ConvertPScoutToXML.java).

Run from Eclipse or command line with the following arguments.

args[0] = /path/to/publishedapimapping

args[1] = 21
