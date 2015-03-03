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

Close the terminal and reopen to make sure an environment variables are set properly.  Seems one of these two steps in 5 messes up the javac steps.  So make sure `make clean` still gets logged here before proceeding.

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
Zip up and save the fake javac output directory (aka spy directory).  Using the OrganizeJava program, you can feed the spy directory in as input and output a directory organized by the Java source files packages.  From here you will need to do some manual massaging to get the source to compile as an eclipse project.

# PScout

## Install dependencies 

Use source at: [https://github.com/dweinstein/pscout](https://github.com/dweinstein/pscout)

`sudo apt-get install libexpat1-dev`

`sudo apt-get install libxml-simple-perl`

`sudo perl -MCPAN -e shell`

`install XML::Simple` (should already be installed, for some reason doing this directly failed earlier)

## Setup environment

PScout wants Android to be built with all binaries (not just the user production mode binaries).

`cd WORKING_DIRECTORY`

`make clean`

`lunch full-eng`

`make -j8`

Move out of Android build directory and download PScout.

` cd ..`

`git clone https://github.com/dweinstein/pscout`

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

args[0] = /path/to/allmappings

args[1] = 21
