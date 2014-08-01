/* This file is auto-generated.  DO NOT MODIFY.
 * Source file: packages/apps/PackageInstaller/src/com/android/packageinstaller/EventLogTags.logtags
 */

package com.android.packageinstaller;

/**
 * @hide
 */
public class EventLogTags {
  private EventLogTags() { }  // don't instantiate

  /** 90300 install_package_attempt (result_and_flags|1),(total_time|1|3),(time_till_pkg_info_obtained|1|3),(time_till_install_clicked|1|3),(package_digest|3) */
  public static final int INSTALL_PACKAGE_ATTEMPT = 90300;

  public static void writeInstallPackageAttempt(int resultAndFlags, int totalTime, int timeTillPkgInfoObtained, int timeTillInstallClicked, String packageDigest) {
    android.util.EventLog.writeEvent(INSTALL_PACKAGE_ATTEMPT, resultAndFlags, totalTime, timeTillPkgInfoObtained, timeTillInstallClicked, packageDigest);
  }
}
