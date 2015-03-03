Process for obtaining Java source project:

0) Set up the build environment on Ubuntu 14.04 according to Google's instructions. 
https://source.android.com/source/building.html

1) Clone Android's repository to the desired tag state
# Set up to track the desired branch
repo init -u https://android.googlesource.com/platform/manifest -b android-4.4.4_r1
# Pull down remote changes for all projects on branch
repo sync
# Check out a release tag for all projects
repo forall -c 'git checkout tags/android-4.4.4_r1'

2) Configure to build for the Nexus 4 device.
# Put important scripts on the path
source build/envsetup.sh
# Configure for Nexus 4
lunch full_mako-user

3) Create a fake javac binary and put it on the path to spy on the build process. The big picture: look at what sources the build is asking to compile, copy them over into a separate spy directory,
then allow the real javac to actually compile.

4) Build Android with spying enabled.
# Parallel Build
make -j24

5) Utilize Tom's OrganizeJava tool to crawl through the captured source and organize it in a unified folder structure.

6) Copy the organized source into an empty Eclipse Java project. Delete the JRE (and any other JARs) from the build path.

7) Iteratively fix compilation errors.

    - Correct imports using find/replace
    - Change method and field visibility where required
    - Where duplicates of the same file were found, choose desired version.
        - Usually we desire the version with more information, so prefer those with comments.
    - Move source which was not correctly organized into correct packages.
    - Delete completely unused packages with errors rather than trying to fix them. Utilize Eclipse references feature to determine if used.
    - Fix other misc errors like file name not matching top level type name

8) Confirm that all source compiles and is free of errors with no JARs on the build path.

9) Confirm that all packages/types in the Android 19 API appear to be present.
