/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/telephony/java/com/android/internal/telephony/IMms.aidl
 */
package com.android.internal.telephony;
/**
 * Service interface to handle MMS API requests
 */
public interface IMms extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.IMms
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.IMms";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.telephony.IMms interface,
 * generating a proxy if needed.
 */
public static com.android.internal.telephony.IMms asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.telephony.IMms))) {
return ((com.android.internal.telephony.IMms)iin);
}
return new com.android.internal.telephony.IMms.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_sendMessage:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
java.lang.String _arg1;
_arg1 = data.readString();
android.net.Uri _arg2;
if ((0!=data.readInt())) {
_arg2 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
java.lang.String _arg3;
_arg3 = data.readString();
android.os.Bundle _arg4;
if ((0!=data.readInt())) {
_arg4 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
android.app.PendingIntent _arg5;
if ((0!=data.readInt())) {
_arg5 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg5 = null;
}
this.sendMessage(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
case TRANSACTION_downloadMessage:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
android.net.Uri _arg3;
if ((0!=data.readInt())) {
_arg3 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
android.os.Bundle _arg4;
if ((0!=data.readInt())) {
_arg4 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
android.app.PendingIntent _arg5;
if ((0!=data.readInt())) {
_arg5 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg5 = null;
}
this.downloadMessage(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
case TRANSACTION_updateMmsSendStatus:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
byte[] _arg1;
_arg1 = data.createByteArray();
int _arg2;
_arg2 = data.readInt();
this.updateMmsSendStatus(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_updateMmsDownloadStatus:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.updateMmsDownloadStatus(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getCarrierConfigValues:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
android.os.Bundle _result = this.getCarrierConfigValues(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_importTextMessage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
java.lang.String _arg3;
_arg3 = data.readString();
long _arg4;
_arg4 = data.readLong();
boolean _arg5;
_arg5 = (0!=data.readInt());
boolean _arg6;
_arg6 = (0!=data.readInt());
android.net.Uri _result = this.importTextMessage(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_importMultimediaMessage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.net.Uri _arg1;
if ((0!=data.readInt())) {
_arg1 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.lang.String _arg2;
_arg2 = data.readString();
long _arg3;
_arg3 = data.readLong();
boolean _arg4;
_arg4 = (0!=data.readInt());
boolean _arg5;
_arg5 = (0!=data.readInt());
android.net.Uri _result = this.importMultimediaMessage(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_deleteStoredMessage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.net.Uri _arg1;
if ((0!=data.readInt())) {
_arg1 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
boolean _result = this.deleteStoredMessage(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_deleteStoredConversation:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _arg1;
_arg1 = data.readLong();
boolean _result = this.deleteStoredConversation(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_updateStoredMessageStatus:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.net.Uri _arg1;
if ((0!=data.readInt())) {
_arg1 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.content.ContentValues _arg2;
if ((0!=data.readInt())) {
_arg2 = android.content.ContentValues.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
boolean _result = this.updateStoredMessageStatus(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_archiveStoredConversation:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _arg1;
_arg1 = data.readLong();
boolean _arg2;
_arg2 = (0!=data.readInt());
boolean _result = this.archiveStoredConversation(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_addTextMessageDraft:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
android.net.Uri _result = this.addTextMessageDraft(_arg0, _arg1, _arg2);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_addMultimediaMessageDraft:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.net.Uri _arg1;
if ((0!=data.readInt())) {
_arg1 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.net.Uri _result = this.addMultimediaMessageDraft(_arg0, _arg1);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_sendStoredMessage:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
java.lang.String _arg1;
_arg1 = data.readString();
android.net.Uri _arg2;
if ((0!=data.readInt())) {
_arg2 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
android.os.Bundle _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
android.app.PendingIntent _arg4;
if ((0!=data.readInt())) {
_arg4 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
this.sendStoredMessage(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_setAutoPersisting:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setAutoPersisting(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getAutoPersisting:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.getAutoPersisting();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.telephony.IMms
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
/**
     * Send an MMS message
     *
     * @param subId the SIM id
     * @param callingPkg the package name of the calling app
     * @param contentUri the content uri from which to read MMS message encoded in standard MMS
     *  PDU format
     * @param locationUrl the optional location url for where this message should be sent to
     * @param configOverrides the carrier-specific messaging configuration values to override for
     *  sending the message. See {@link android.telephony.MessagingConfigurationManager} for the
     *  value names and types.
     * @param sentIntent if not NULL this <code>PendingIntent</code> is
     *  broadcast when the message is successfully sent, or failed
     */
@Override public void sendMessage(long subId, java.lang.String callingPkg, android.net.Uri contentUri, java.lang.String locationUrl, android.os.Bundle configOverrides, android.app.PendingIntent sentIntent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(subId);
_data.writeString(callingPkg);
if ((contentUri!=null)) {
_data.writeInt(1);
contentUri.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(locationUrl);
if ((configOverrides!=null)) {
_data.writeInt(1);
configOverrides.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((sentIntent!=null)) {
_data.writeInt(1);
sentIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_sendMessage, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Download an MMS message using known location and transaction id
     *
     * @param subId the SIM id
     * @param callingPkg the package name of the calling app
     * @param locationUrl the location URL of the MMS message to be downloaded, usually obtained
     *  from the MMS WAP push notification
     * @param contentUri a contentUri to which the downloaded MMS message will be written
     * @param configOverrides the carrier-specific messaging configuration values to override for
     *  downloading the message. See {@link android.telephony.MessagingConfigurationManager} for the
     *  value names and types.
     * @param downloadedIntent if not NULL this <code>PendingIntent</code> is
     *  broadcast when the message is downloaded, or the download is failed
     */
@Override public void downloadMessage(long subId, java.lang.String callingPkg, java.lang.String locationUrl, android.net.Uri contentUri, android.os.Bundle configOverrides, android.app.PendingIntent downloadedIntent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(subId);
_data.writeString(callingPkg);
_data.writeString(locationUrl);
if ((contentUri!=null)) {
_data.writeInt(1);
contentUri.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((configOverrides!=null)) {
_data.writeInt(1);
configOverrides.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((downloadedIntent!=null)) {
_data.writeInt(1);
downloadedIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_downloadMessage, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Update the status of a pending (send-by-IP) MMS message handled by the carrier app.
     * If the carrier app fails to send this message, it may be resent via carrier network
     * depending on the status code.
     *
     * The caller should have carrier privileges.
     * @see android.telephony.TelephonyManager.hasCarrierPrivileges
     *
     * @param messageRef the reference number of the MMS message.
     * @param pdu non-empty (contains the SendConf PDU) if the message was sent successfully,
     *   otherwise, this param should be null.
     * @param status send status. It can be Activity.RESULT_OK or one of the MMS error codes.
     *   If status is Activity.RESULT_OK, the MMS was sent successfully.
     *   If status is MMS_ERROR_RETRY, this message would be resent via carrier
     *   network. The message will not be resent for other MMS error statuses.
     */
@Override public void updateMmsSendStatus(int messageRef, byte[] pdu, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(messageRef);
_data.writeByteArray(pdu);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_updateMmsSendStatus, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Update the status of a pending (download-by-IP) MMS message handled by the carrier app.
     * If the carrier app fails to download this message, it may be re-downloaded via carrier
     * network depending on the status code.
     *
     * The caller should have carrier privileges.
     * @see android.telephony.TelephonyManager.hasCarrierPrivileges
     *
     * @param messageRef the reference number of the MMS message.
     * @param status download status.  It can be Activity.RESULT_OK or one of the MMS error codes.
     *   If status is Activity.RESULT_OK, the MMS was downloaded successfully.
     *   If status is MMS_ERROR_RETRY, this message would be re-downloaded via carrier
     *   network. The message will not be re-downloaded for other MMS error statuses.
     */
@Override public void updateMmsDownloadStatus(int messageRef, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(messageRef);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_updateMmsDownloadStatus, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Get carrier-dependent configuration values.
     *
     * @param subId the SIM id
     */
@Override public android.os.Bundle getCarrierConfigValues(long subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Bundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(subId);
mRemote.transact(Stub.TRANSACTION_getCarrierConfigValues, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.Bundle.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Import a text message into system's SMS store
     *
     * @param callingPkg the calling app's package name
     * @param address the destination address of the message
     * @param type the type of the message
     * @param text the message text
     * @param timestampMillis the message timestamp in milliseconds
     * @param seen if the message is seen
     * @param read if the message is read
     * @return the message URI, null if failed
     */
@Override public android.net.Uri importTextMessage(java.lang.String callingPkg, java.lang.String address, int type, java.lang.String text, long timestampMillis, boolean seen, boolean read) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.Uri _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPkg);
_data.writeString(address);
_data.writeInt(type);
_data.writeString(text);
_data.writeLong(timestampMillis);
_data.writeInt(((seen)?(1):(0)));
_data.writeInt(((read)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_importTextMessage, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.Uri.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
      * Import a multimedia message into system's MMS store
      *
      * @param callingPkg the package name of the calling app
      * @param contentUri the content uri from which to read PDU of the message to import
      * @param messageId the optional message id
      * @param timestampSecs the message timestamp in seconds
      * @param seen if the message is seen
      * @param read if the message is read
      * @return the message URI, null if failed
      */
@Override public android.net.Uri importMultimediaMessage(java.lang.String callingPkg, android.net.Uri contentUri, java.lang.String messageId, long timestampSecs, boolean seen, boolean read) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.Uri _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPkg);
if ((contentUri!=null)) {
_data.writeInt(1);
contentUri.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(messageId);
_data.writeLong(timestampSecs);
_data.writeInt(((seen)?(1):(0)));
_data.writeInt(((read)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_importMultimediaMessage, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.Uri.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Delete a system stored SMS or MMS message
     *
     * @param callingPkg the package name of the calling app
     * @param messageUri the URI of the stored message
     * @return true if deletion is successful, false otherwise
     */
@Override public boolean deleteStoredMessage(java.lang.String callingPkg, android.net.Uri messageUri) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPkg);
if ((messageUri!=null)) {
_data.writeInt(1);
messageUri.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_deleteStoredMessage, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Delete a system stored SMS or MMS thread
     *
     * @param callingPkg the package name of the calling app
     * @param conversationId the ID of the message conversation
     * @return true if deletion is successful, false otherwise
     */
@Override public boolean deleteStoredConversation(java.lang.String callingPkg, long conversationId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPkg);
_data.writeLong(conversationId);
mRemote.transact(Stub.TRANSACTION_deleteStoredConversation, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Update the status properties of a system stored SMS or MMS message, e.g.
     * the read status of a message, etc.
     *
     * @param callingPkg the package name of the calling app
     * @param messageUri the URI of the stored message
     * @param statusValues a list of status properties in key-value pairs to update
     * @return true if deletion is successful, false otherwise
     */
@Override public boolean updateStoredMessageStatus(java.lang.String callingPkg, android.net.Uri messageUri, android.content.ContentValues statusValues) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPkg);
if ((messageUri!=null)) {
_data.writeInt(1);
messageUri.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((statusValues!=null)) {
_data.writeInt(1);
statusValues.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateStoredMessageStatus, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Archive or unarchive a stored conversation
     *
     * @param callingPkg the package name of the calling app
     * @param conversationId the ID of the message conversation
     * @param archived true to archive the conversation, false otherwise
     * @return true if update is successful, false otherwise
     */
@Override public boolean archiveStoredConversation(java.lang.String callingPkg, long conversationId, boolean archived) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPkg);
_data.writeLong(conversationId);
_data.writeInt(((archived)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_archiveStoredConversation, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Add a text message draft to system SMS store
     *
     * @param callingPkg the package name of the calling app
     * @param address the destination address of message
     * @param text the body of the message to send
     * @return the URI of the stored draft message
     */
@Override public android.net.Uri addTextMessageDraft(java.lang.String callingPkg, java.lang.String address, java.lang.String text) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.Uri _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPkg);
_data.writeString(address);
_data.writeString(text);
mRemote.transact(Stub.TRANSACTION_addTextMessageDraft, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.Uri.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Add a multimedia message draft to system MMS store
     *
     * @param callingPkg the package name of the calling app
     * @param contentUri the content Uri from which to read PDU data of the draft MMS
     * @return the URI of the stored draft message
     */
@Override public android.net.Uri addMultimediaMessageDraft(java.lang.String callingPkg, android.net.Uri contentUri) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.Uri _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPkg);
if ((contentUri!=null)) {
_data.writeInt(1);
contentUri.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addMultimediaMessageDraft, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.net.Uri.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Send a system stored MMS message
     *
     * This is used for sending a previously sent, but failed-to-send, message or
     * for sending a text message that has been stored as a draft.
     *
     * @param subId the SIM id
     * @param callingPkg the package name of the calling app
     * @param messageUri the URI of the stored message
     * @param configOverrides the carrier-specific messaging configuration values to override for
     *  sending the message. See {@link android.telephony.MessagingConfigurationManager} for the
     *  value names and types.
     * @param sentIntent if not NULL this <code>PendingIntent</code> is
     *  broadcast when the message is successfully sent, or failed
     */
@Override public void sendStoredMessage(long subId, java.lang.String callingPkg, android.net.Uri messageUri, android.os.Bundle configOverrides, android.app.PendingIntent sentIntent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(subId);
_data.writeString(callingPkg);
if ((messageUri!=null)) {
_data.writeInt(1);
messageUri.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((configOverrides!=null)) {
_data.writeInt(1);
configOverrides.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((sentIntent!=null)) {
_data.writeInt(1);
sentIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_sendStoredMessage, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Turns on/off the flag to automatically write sent/received SMS/MMS messages into system
     *
     * When this flag is on, all SMS/MMS sent/received are stored by system automatically
     * When this flag is off, only SMS/MMS sent by non-default SMS apps are stored by system
     * automatically
     *
     * This flag can only be changed by default SMS apps
     *
     * @param callingPkg the name of the calling app package
     * @param enabled Whether to enable message auto persisting
     */
@Override public void setAutoPersisting(java.lang.String callingPkg, boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPkg);
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setAutoPersisting, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Get the value of the flag to automatically write sent/received SMS/MMS messages into system
     *
     * When this flag is on, all SMS/MMS sent/received are stored by system automatically
     * When this flag is off, only SMS/MMS sent by non-default SMS apps are stored by system
     * automatically
     *
     * @return the current value of the auto persist flag
     */
@Override public boolean getAutoPersisting() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAutoPersisting, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_sendMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_downloadMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_updateMmsSendStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_updateMmsDownloadStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getCarrierConfigValues = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_importTextMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_importMultimediaMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_deleteStoredMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_deleteStoredConversation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_updateStoredMessageStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_archiveStoredConversation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_addTextMessageDraft = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_addMultimediaMessageDraft = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_sendStoredMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_setAutoPersisting = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_getAutoPersisting = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
}
/**
     * Send an MMS message
     *
     * @param subId the SIM id
     * @param callingPkg the package name of the calling app
     * @param contentUri the content uri from which to read MMS message encoded in standard MMS
     *  PDU format
     * @param locationUrl the optional location url for where this message should be sent to
     * @param configOverrides the carrier-specific messaging configuration values to override for
     *  sending the message. See {@link android.telephony.MessagingConfigurationManager} for the
     *  value names and types.
     * @param sentIntent if not NULL this <code>PendingIntent</code> is
     *  broadcast when the message is successfully sent, or failed
     */
public void sendMessage(long subId, java.lang.String callingPkg, android.net.Uri contentUri, java.lang.String locationUrl, android.os.Bundle configOverrides, android.app.PendingIntent sentIntent) throws android.os.RemoteException;
/**
     * Download an MMS message using known location and transaction id
     *
     * @param subId the SIM id
     * @param callingPkg the package name of the calling app
     * @param locationUrl the location URL of the MMS message to be downloaded, usually obtained
     *  from the MMS WAP push notification
     * @param contentUri a contentUri to which the downloaded MMS message will be written
     * @param configOverrides the carrier-specific messaging configuration values to override for
     *  downloading the message. See {@link android.telephony.MessagingConfigurationManager} for the
     *  value names and types.
     * @param downloadedIntent if not NULL this <code>PendingIntent</code> is
     *  broadcast when the message is downloaded, or the download is failed
     */
public void downloadMessage(long subId, java.lang.String callingPkg, java.lang.String locationUrl, android.net.Uri contentUri, android.os.Bundle configOverrides, android.app.PendingIntent downloadedIntent) throws android.os.RemoteException;
/**
     * Update the status of a pending (send-by-IP) MMS message handled by the carrier app.
     * If the carrier app fails to send this message, it may be resent via carrier network
     * depending on the status code.
     *
     * The caller should have carrier privileges.
     * @see android.telephony.TelephonyManager.hasCarrierPrivileges
     *
     * @param messageRef the reference number of the MMS message.
     * @param pdu non-empty (contains the SendConf PDU) if the message was sent successfully,
     *   otherwise, this param should be null.
     * @param status send status. It can be Activity.RESULT_OK or one of the MMS error codes.
     *   If status is Activity.RESULT_OK, the MMS was sent successfully.
     *   If status is MMS_ERROR_RETRY, this message would be resent via carrier
     *   network. The message will not be resent for other MMS error statuses.
     */
public void updateMmsSendStatus(int messageRef, byte[] pdu, int status) throws android.os.RemoteException;
/**
     * Update the status of a pending (download-by-IP) MMS message handled by the carrier app.
     * If the carrier app fails to download this message, it may be re-downloaded via carrier
     * network depending on the status code.
     *
     * The caller should have carrier privileges.
     * @see android.telephony.TelephonyManager.hasCarrierPrivileges
     *
     * @param messageRef the reference number of the MMS message.
     * @param status download status.  It can be Activity.RESULT_OK or one of the MMS error codes.
     *   If status is Activity.RESULT_OK, the MMS was downloaded successfully.
     *   If status is MMS_ERROR_RETRY, this message would be re-downloaded via carrier
     *   network. The message will not be re-downloaded for other MMS error statuses.
     */
public void updateMmsDownloadStatus(int messageRef, int status) throws android.os.RemoteException;
/**
     * Get carrier-dependent configuration values.
     *
     * @param subId the SIM id
     */
public android.os.Bundle getCarrierConfigValues(long subId) throws android.os.RemoteException;
/**
     * Import a text message into system's SMS store
     *
     * @param callingPkg the calling app's package name
     * @param address the destination address of the message
     * @param type the type of the message
     * @param text the message text
     * @param timestampMillis the message timestamp in milliseconds
     * @param seen if the message is seen
     * @param read if the message is read
     * @return the message URI, null if failed
     */
public android.net.Uri importTextMessage(java.lang.String callingPkg, java.lang.String address, int type, java.lang.String text, long timestampMillis, boolean seen, boolean read) throws android.os.RemoteException;
/**
      * Import a multimedia message into system's MMS store
      *
      * @param callingPkg the package name of the calling app
      * @param contentUri the content uri from which to read PDU of the message to import
      * @param messageId the optional message id
      * @param timestampSecs the message timestamp in seconds
      * @param seen if the message is seen
      * @param read if the message is read
      * @return the message URI, null if failed
      */
public android.net.Uri importMultimediaMessage(java.lang.String callingPkg, android.net.Uri contentUri, java.lang.String messageId, long timestampSecs, boolean seen, boolean read) throws android.os.RemoteException;
/**
     * Delete a system stored SMS or MMS message
     *
     * @param callingPkg the package name of the calling app
     * @param messageUri the URI of the stored message
     * @return true if deletion is successful, false otherwise
     */
public boolean deleteStoredMessage(java.lang.String callingPkg, android.net.Uri messageUri) throws android.os.RemoteException;
/**
     * Delete a system stored SMS or MMS thread
     *
     * @param callingPkg the package name of the calling app
     * @param conversationId the ID of the message conversation
     * @return true if deletion is successful, false otherwise
     */
public boolean deleteStoredConversation(java.lang.String callingPkg, long conversationId) throws android.os.RemoteException;
/**
     * Update the status properties of a system stored SMS or MMS message, e.g.
     * the read status of a message, etc.
     *
     * @param callingPkg the package name of the calling app
     * @param messageUri the URI of the stored message
     * @param statusValues a list of status properties in key-value pairs to update
     * @return true if deletion is successful, false otherwise
     */
public boolean updateStoredMessageStatus(java.lang.String callingPkg, android.net.Uri messageUri, android.content.ContentValues statusValues) throws android.os.RemoteException;
/**
     * Archive or unarchive a stored conversation
     *
     * @param callingPkg the package name of the calling app
     * @param conversationId the ID of the message conversation
     * @param archived true to archive the conversation, false otherwise
     * @return true if update is successful, false otherwise
     */
public boolean archiveStoredConversation(java.lang.String callingPkg, long conversationId, boolean archived) throws android.os.RemoteException;
/**
     * Add a text message draft to system SMS store
     *
     * @param callingPkg the package name of the calling app
     * @param address the destination address of message
     * @param text the body of the message to send
     * @return the URI of the stored draft message
     */
public android.net.Uri addTextMessageDraft(java.lang.String callingPkg, java.lang.String address, java.lang.String text) throws android.os.RemoteException;
/**
     * Add a multimedia message draft to system MMS store
     *
     * @param callingPkg the package name of the calling app
     * @param contentUri the content Uri from which to read PDU data of the draft MMS
     * @return the URI of the stored draft message
     */
public android.net.Uri addMultimediaMessageDraft(java.lang.String callingPkg, android.net.Uri contentUri) throws android.os.RemoteException;
/**
     * Send a system stored MMS message
     *
     * This is used for sending a previously sent, but failed-to-send, message or
     * for sending a text message that has been stored as a draft.
     *
     * @param subId the SIM id
     * @param callingPkg the package name of the calling app
     * @param messageUri the URI of the stored message
     * @param configOverrides the carrier-specific messaging configuration values to override for
     *  sending the message. See {@link android.telephony.MessagingConfigurationManager} for the
     *  value names and types.
     * @param sentIntent if not NULL this <code>PendingIntent</code> is
     *  broadcast when the message is successfully sent, or failed
     */
public void sendStoredMessage(long subId, java.lang.String callingPkg, android.net.Uri messageUri, android.os.Bundle configOverrides, android.app.PendingIntent sentIntent) throws android.os.RemoteException;
/**
     * Turns on/off the flag to automatically write sent/received SMS/MMS messages into system
     *
     * When this flag is on, all SMS/MMS sent/received are stored by system automatically
     * When this flag is off, only SMS/MMS sent by non-default SMS apps are stored by system
     * automatically
     *
     * This flag can only be changed by default SMS apps
     *
     * @param callingPkg the name of the calling app package
     * @param enabled Whether to enable message auto persisting
     */
public void setAutoPersisting(java.lang.String callingPkg, boolean enabled) throws android.os.RemoteException;
/**
     * Get the value of the flag to automatically write sent/received SMS/MMS messages into system
     *
     * When this flag is on, all SMS/MMS sent/received are stored by system automatically
     * When this flag is off, only SMS/MMS sent by non-default SMS apps are stored by system
     * automatically
     *
     * @return the current value of the auto persist flag
     */
public boolean getAutoPersisting() throws android.os.RemoteException;
}
