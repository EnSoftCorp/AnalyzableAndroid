AnalyzableAndroid
=================

Full source and bytecode Eclipse projects of various Android releases suitable for analyzing with Atlas.  Additionally some projects have [PScout](http://pscout.csl.toronto.edu/) mapping results.

Android releases should be referred to by their official branch names.  See [https://source.android.com/source/build-numbers.html](https://source.android.com/source/build-numbers.html). 

## Basic strategy for obtaining Java source project

0) Set up the build environment according to Google's instructions. 

See [https://source.android.com/source/building.html](https://source.android.com/source/building.html).

1) Clone Android's repository to the desired tag state

Set up to track the desired branch (replace android-4.4.4_r1 with your desired release)

`repo init -u https://android.googlesource.com/platform/manifest -b android-4.4.4_r1`

Pull down remote source and any changes for all projects on branch

`repo sync`

Check out a release tag for all projects (replace android-4.4.4_r1 with your desired release)

`repo forall -c 'git checkout tags/android-4.4.4_r1'`

2) Configure to build for the target environment using production mode

Put important scripts on the path

`source build/envsetup.sh`

Configure for target device (may be different for your release, but `-user` option should be used if possible)

`lunch full_mako-user`

3) Create a fake javac binary and put it on the path to spy on the build process. The big picture: look at what sources the build is asking to compile, copy them over into a separate spy directory, then allow the real javac to actually compile source.

4) Build Android with spying enabled

Parallel Build (replace 24 with the number of cores you wish to dedicate to the build)
make -j24

5) Utilize Tom's OrganizeJava tool to crawl through the captured source and organize it in a unified folder structure

6) Copy the organized source into an empty Eclipse Java project. Delete the JRE (and any other JARs) from the build path.

7) Iteratively fix compilation errors

    - Correct imports using find/replace
    - Change method and field visibility where required
    - Where duplicates of the same file were found, choose desired version.
        - Usually we desire the version with more information, so prefer those with comments.
    - Move source which was not correctly organized into correct packages.
    - Delete completely unused packages with errors rather than trying to fix them. Utilize Eclipse references feature to determine if used.
    - Fix other misc errors like file name not matching top level type name
    - Sometimes a clean/build helps for stale build errors

8) Confirm that all source compiles and is free of errors with no JARs on the build path

9) Confirm that all packages/types in the Android API appear to be present

## Building bytecode Eclipse project
Edit and run the [gatherjars.sh](https://github.com/EnSoftCorp/AnalyzableAndroid/blob/master/Tools/gatherjars.sh) script to gather Android jars.  Then create an empty Eclipse project, remove all existing project Jars, and add the gathered Jars to the project.

## Running PScout

Use update PScout source at [https://github.com/dweinstein/pscout](https://github.com/dweinstein/pscout).

PScout wants to run over the `full-eng` build of Android, so you will probably have to `make clean`, `lunch full-eng`, and `make -j24` again before running PScout.

Follow PScout directions at [https://github.com/dweinstein/pscout/blob/master/README.txt](https://github.com/dweinstein/pscout/blob/master/README.txt).

PScout results can be used in the [Android Essentials Toolbox project](https://github.com/EnSoftCorp/android-essentials-toolbox).
