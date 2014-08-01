/* This file is auto-generated.  DO NOT MODIFY.
 * Source file: packages/apps/Nfc/src/com/android/nfc/EventLogTags.logtags
 */

package com.android.nfc;

/**
 * @hide
 */
public class EventLogTags {
  private EventLogTags() { }  // don't instantiate

  /** 90000 nfc_first_share */
  public static final int NFC_FIRST_SHARE = 90000;

  /** 90001 nfc_share (size|1|2),(tnf|1),(type|3),(aar_present|1),(duration|1|3) */
  public static final int NFC_SHARE = 90001;

  /** 90002 nfc_share_fail (size|1|2),(tnf|1),(type|3),(aar_present|1) */
  public static final int NFC_SHARE_FAIL = 90002;

  /** 90003 nfc_ndef_received (size|1|2),(tnf|1),(type|3),(aar_present|1) */
  public static final int NFC_NDEF_RECEIVED = 90003;

  public static void writeNfcFirstShare() {
    android.util.EventLog.writeEvent(NFC_FIRST_SHARE);
  }

  public static void writeNfcShare(int size, int tnf, String type, int aarPresent, int duration) {
    android.util.EventLog.writeEvent(NFC_SHARE, size, tnf, type, aarPresent, duration);
  }

  public static void writeNfcShareFail(int size, int tnf, String type, int aarPresent) {
    android.util.EventLog.writeEvent(NFC_SHARE_FAIL, size, tnf, type, aarPresent);
  }

  public static void writeNfcNdefReceived(int size, int tnf, String type, int aarPresent) {
    android.util.EventLog.writeEvent(NFC_NDEF_RECEIVED, size, tnf, type, aarPresent);
  }
}
