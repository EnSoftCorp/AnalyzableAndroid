/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Telephony/common/src/com/android/services/telephony/common/ICallCommandService.aidl
 */
package com.android.services.telephony.common;
/**
 * Service implemented by TelephonyService and used by In-call UI to control
 * phone calls on the device.
 * TODO: Move this out of opt/telephony and into opt/call or similar. This interface
 *       makes sense even without the telephony layer (think VOIP).
 */
public interface ICallCommandService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.services.telephony.common.ICallCommandService
{
private static final java.lang.String DESCRIPTOR = "com.android.services.telephony.common.ICallCommandService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.services.telephony.common.ICallCommandService interface,
 * generating a proxy if needed.
 */
public static com.android.services.telephony.common.ICallCommandService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.services.telephony.common.ICallCommandService))) {
return ((com.android.services.telephony.common.ICallCommandService)iin);
}
return new com.android.services.telephony.common.ICallCommandService.Stub.Proxy(obj);
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
case TRANSACTION_answerCall:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.answerCall(_arg0);
return true;
}
case TRANSACTION_rejectCall:
{
data.enforceInterface(DESCRIPTOR);
com.android.services.telephony.common.Call _arg0;
if ((0!=data.readInt())) {
_arg0 = com.android.services.telephony.common.Call.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
java.lang.String _arg2;
_arg2 = data.readString();
this.rejectCall(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_disconnectCall:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.disconnectCall(_arg0);
return true;
}
case TRANSACTION_separateCall:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.separateCall(_arg0);
return true;
}
case TRANSACTION_hold:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.hold(_arg0, _arg1);
return true;
}
case TRANSACTION_merge:
{
data.enforceInterface(DESCRIPTOR);
this.merge();
return true;
}
case TRANSACTION_swap:
{
data.enforceInterface(DESCRIPTOR);
this.swap();
return true;
}
case TRANSACTION_addCall:
{
data.enforceInterface(DESCRIPTOR);
this.addCall();
return true;
}
case TRANSACTION_mute:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.mute(_arg0);
return true;
}
case TRANSACTION_speaker:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.speaker(_arg0);
return true;
}
case TRANSACTION_playDtmfTone:
{
data.enforceInterface(DESCRIPTOR);
char _arg0;
_arg0 = (char)data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.playDtmfTone(_arg0, _arg1);
return true;
}
case TRANSACTION_stopDtmfTone:
{
data.enforceInterface(DESCRIPTOR);
this.stopDtmfTone();
return true;
}
case TRANSACTION_setAudioMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setAudioMode(_arg0);
return true;
}
case TRANSACTION_postDialCancel:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.postDialCancel(_arg0);
return true;
}
case TRANSACTION_postDialWaitContinue:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.postDialWaitContinue(_arg0);
return true;
}
case TRANSACTION_setSystemBarNavigationEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setSystemBarNavigationEnabled(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.services.telephony.common.ICallCommandService
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
     * Answer a ringing call.
     */
@Override public void answerCall(int callId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(callId);
mRemote.transact(Stub.TRANSACTION_answerCall, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Reject a ringing call.
     */
@Override public void rejectCall(com.android.services.telephony.common.Call call, boolean rejectWithMessage, java.lang.String message) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((call!=null)) {
_data.writeInt(1);
call.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((rejectWithMessage)?(1):(0)));
_data.writeString(message);
mRemote.transact(Stub.TRANSACTION_rejectCall, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Disconnect an active call.
     */
@Override public void disconnectCall(int callId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(callId);
mRemote.transact(Stub.TRANSACTION_disconnectCall, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Separate a conference call.
     */
@Override public void separateCall(int callId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(callId);
mRemote.transact(Stub.TRANSACTION_separateCall, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Place call on hold.
     */
@Override public void hold(int callId, boolean hold) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(callId);
_data.writeInt(((hold)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_hold, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Merge foreground and background calls.
     */
@Override public void merge() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_merge, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Swap foreground and background calls.
     */
@Override public void swap() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_swap, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Add another call.
     * TODO(klp): Should this go through the service at all?
     *            It could just as easily call dialer directly.
     */
@Override public void addCall() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_addCall, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Mute the phone.
     */
@Override public void mute(boolean onOff) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((onOff)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_mute, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Turn on or off speaker.
     * TODO(klp): Remove in favor of setAudioMode
     */
@Override public void speaker(boolean onOff) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((onOff)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_speaker, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Start playing DTMF tone for the specified digit.
     */
@Override public void playDtmfTone(char digit, boolean timedShortTone) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((int)digit));
_data.writeInt(((timedShortTone)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_playDtmfTone, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Stop playing DTMF tone for the specified digit.
     */
@Override public void stopDtmfTone() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopDtmfTone, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Sets the audio mode for the active phone call.
     * {@see AudioMode}
     */
@Override public void setAudioMode(int mode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(mode);
mRemote.transact(Stub.TRANSACTION_setAudioMode, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void postDialCancel(int callId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(callId);
mRemote.transact(Stub.TRANSACTION_postDialCancel, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void postDialWaitContinue(int callId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(callId);
mRemote.transact(Stub.TRANSACTION_postDialWaitContinue, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Enables or disables navigation using the system bar, and also prevents the
     * notification shade from being dragged down.
     * Hides or shows the home, recent and back buttons in the navigation bar if the
     * device has soft navigation buttons.
     */
@Override public void setSystemBarNavigationEnabled(boolean enable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setSystemBarNavigationEnabled, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_answerCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_rejectCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_disconnectCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_separateCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_hold = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_merge = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_swap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_addCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_mute = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_speaker = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_playDtmfTone = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_stopDtmfTone = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_setAudioMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_postDialCancel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_postDialWaitContinue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_setSystemBarNavigationEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
}
/**
     * Answer a ringing call.
     */
public void answerCall(int callId) throws android.os.RemoteException;
/**
     * Reject a ringing call.
     */
public void rejectCall(com.android.services.telephony.common.Call call, boolean rejectWithMessage, java.lang.String message) throws android.os.RemoteException;
/**
     * Disconnect an active call.
     */
public void disconnectCall(int callId) throws android.os.RemoteException;
/**
     * Separate a conference call.
     */
public void separateCall(int callId) throws android.os.RemoteException;
/**
     * Place call on hold.
     */
public void hold(int callId, boolean hold) throws android.os.RemoteException;
/**
     * Merge foreground and background calls.
     */
public void merge() throws android.os.RemoteException;
/**
     * Swap foreground and background calls.
     */
public void swap() throws android.os.RemoteException;
/**
     * Add another call.
     * TODO(klp): Should this go through the service at all?
     *            It could just as easily call dialer directly.
     */
public void addCall() throws android.os.RemoteException;
/**
     * Mute the phone.
     */
public void mute(boolean onOff) throws android.os.RemoteException;
/**
     * Turn on or off speaker.
     * TODO(klp): Remove in favor of setAudioMode
     */
public void speaker(boolean onOff) throws android.os.RemoteException;
/**
     * Start playing DTMF tone for the specified digit.
     */
public void playDtmfTone(char digit, boolean timedShortTone) throws android.os.RemoteException;
/**
     * Stop playing DTMF tone for the specified digit.
     */
public void stopDtmfTone() throws android.os.RemoteException;
/**
     * Sets the audio mode for the active phone call.
     * {@see AudioMode}
     */
public void setAudioMode(int mode) throws android.os.RemoteException;
public void postDialCancel(int callId) throws android.os.RemoteException;
public void postDialWaitContinue(int callId) throws android.os.RemoteException;
/**
     * Enables or disables navigation using the system bar, and also prevents the
     * notification shade from being dragged down.
     * Hides or shows the home, recent and back buttons in the navigation bar if the
     * device has soft navigation buttons.
     */
public void setSystemBarNavigationEnabled(boolean enable) throws android.os.RemoteException;
}
