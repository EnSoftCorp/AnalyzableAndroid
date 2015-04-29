#!/bin/bash
# A script which finds the JARs that Android built, 
# converts those JARS from DEX to CLASS bytecode
# extracts the JARS into a unified folder structure
# combines them into one super jar
#
# The goal is to be able to get Jimple from DEX that Android built and installed for the platform.

# Directory where Android has put its output JARs
FRAMEWORK_DIR=/home/tdeering/android/out/working/target/product/generic/system/framework
# Directory to stage classes.dex files from framework JARs
DEX_DIR=/home/tdeering/android/out/dex
# Directory for output of JARs of class files
CLASS_DIR=/home/tdeering/android/out/jar
# dex2jar script
DEX2JAR=/home/tdeering/git/AnalyzableAndroid/Tools/dex2jar-0.0.9.15/d2j-dex2jar.sh

mkdir "$DEX_DIR"
mkdir "$CLASS_DIR"

for DEX_JAR in `find $FRAMEWORK_DIR -type f -name "*.jar"`
do
# Get name of component
NAME=${DEX_JAR##*/}

# Extract classes.dex, renamed to component name
unzip -p $DEX_JAR "classes.dex" >"$DEX_DIR/$NAME.dex"

# Convert to JAR of class files
sh $DEX2JAR "$DEX_DIR/$NAME.dex" -f -o "$CLASS_DIR/$NAME"

done

cd $CLASS_DIR
mkdir tmp
cd tmp

for CLASS_JAR in `find $CLASS_DIR -type f -name "*.jar"`
do
# Extract class files into this directory
jar -xvf $CLASS_JAR
done

cd $CLASS_DIR
jar -cvf android.jar -C tmp .
