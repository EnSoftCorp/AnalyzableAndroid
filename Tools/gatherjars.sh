#!/bin/bash

# Directory where Android has put its output JARs
FRAMEWORK_DIR=/home/tdeering/android/out/working/target/product/generic/system/framework
# Directory to stage classes.dex files from framework JARs
DEX_DIR=/home/tdeering/android/out/dex
# Directory for output of JARs of class files
CLASS_JAR_DIR=/home/tdeering/out/jar
# dex2jar script
DEX2JAR="/home/tdeering/Downloads/dex2jar-0.0.9.15/d2j-dex2jar.sh"

mkdir "$DEX_DIR"
mkdir "$CLASS_JAR_DIR"
JAR=".jar"

for DEX_JAR in `find $FRAMEWORK_DIR -type f -name "*.jar"`
do
# Get name of component
NAME=${DEX_JAR##*/}

# Extract classes.dex, renamed to component name
unzip -p $DEX_JAR "classes.dex" >"$DEX_DIR/$NAME.dex"

# Convert to JAR of class files
sh $DEX2JAR "$DEX_DIR/$NAME.dex" -f -o "$CLASS_JAR_DIR/$NAME.jar"

done
