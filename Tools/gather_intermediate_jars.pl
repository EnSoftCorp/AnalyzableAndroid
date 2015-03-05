#!/usr/bin/perl

# get the user name
$USER =  $ENV{'USER'};

# YOU PROBABLY NEED TO UPDATE THIS PATH!
$SOURCE_DIRECTORY="/home/$USER/Desktop/WORKING_DIRECTORY";
unless(-e $SOURCE_DIRECTORY) {
  die "Unable to find Android Source directory $SOURCE_DIRECTORY";
}

# THE PATH YOU WANT TO SAVE JARS TO, YOU MAY WANT TO CHANGE THIS!
$JAR_OUTPUT_DIRECTORY="jars";
unless(-e $JAR_OUTPUT_DIRECTORY or mkdir $JAR_OUTPUT_DIRECTORY) {
  die "Unable to create directory $JAR_OUTPUT_DIRECTORY";
}

# YOU MAY NEED TO UPDATE THIS PATH IF YOU CHANGED THE DEFAULT ANDROID BUILD CONFIGURATION!
$BUILD_OUTPUT_DIRECTORY="$SOURCE_DIRECTORY/out/target";
unless(-e $BUILD_OUTPUT_DIRECTORY) {
  die "Unable to find Android build output directory $BUILD_OUTPUT_DIRECTORY, did you remember to build Android?";
}

# Defines various build output paths
$INSTALLED="$BUILD_OUTPUT_DIRECTORY/product/generic/installed-files.txt";
$SYSTEM_APPS_DIRECTORY="$BUILD_OUTPUT_DIRECTORY/common/obj/APPS";
$JAVA_LIBRARIES_DIRECTORY="$BUILD_OUTPUT_DIRECTORY/common/obj/JAVA_LIBRARIES";

open FILE, "<$INSTALLED" or die $!;
while (<FILE>) {
	chomp($_);
        # copy out system app libraries (prioritizing non-debug builds)
        if ($_ =~ m/  \/system\/app\/(.*).apk/) {
		$APP = $1; # file path like "Calendar/Calendar"
                @APP_PARTS = split m%/%, $APP; # splits on /
                $APP = shift @APP_PARTS; # grabs first array element, ie "Calendar"
		if (-e "$SYSTEM_APPS_DIRECTORY/$APP"."_intermediates/classes.jar") {
			system("cp $SYSTEM_APPS_DIRECTORY/$APP"."_intermediates/classes.jar $JAR_OUTPUT_DIRECTORY/$APP.jar");
		} elsif (-e "$SYSTEM_APPS_DIRECTORY/$APP"."_intermediates/classes-full-debug.jar") {
			system("cp $SYSTEM_APPS_DIRECTORY/$APP"."_intermediates/classes-full-debug.jar $JAR_OUTPUT_DIRECTORY/$APP.jar");
		} else {
			print "Could not find compiled classes for $SYSTEM_APPS_DIRECTORY/$APP"."_intermediates/classes.jar!\n";
		}
	}
        # copy out the framework libraries (prioritize non-debug builds)
        if ($_ =~ m/  \/system\/framework\/(.*).jar/) {
		$JAR = $1;
		if (-e "$JAVA_LIBRARIES_DIRECTORY/$JAR"."_intermediates/classes.jar") {
			system("cp $JAVA_LIBRARIES_DIRECTORY/$JAR"."_intermediates/classes.jar $JAR_OUTPUT_DIRECTORY/$JAR.jar");
		} elsif (-e "$JAVA_LIBRARIES_DIRECTORY/$JAR"."_intermediates/classes-full-debug.jar") {
			system("cp $JAVA_LIBRARIES_DIRECTORY/$JAR"."_intermediates/classes-full-debug.jar $JAR_OUTPUT_DIRECTORY/$JAR.jar");
		} else {
			print "Could not find compiled classes for $JAR!\n";
		}
	}
}
close FILE;
print "Finished.\n";
