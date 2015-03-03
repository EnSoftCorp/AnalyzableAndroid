/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Telephony/common/src/com/android/services/telephony/common/ICallHandlerService.aidl
 */
package com.android.services.telephony.common;
/**
 * Service implemented by clients that would like to control and know the status
 * of phone calls on the device.
 * TODO: Rename interface.  This not only monitors but controls calls, too. Come
 *       up with a name that doesn't conflict with current CallManager and
 *       CallController classes.
 * TODO: Move this out of opt/telephony and into opt/call or similar. This interface
 *       makes sense even without the telephony layer (think VOIP).
 */
public interface ICallHandlerService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.services.telephony.common.ICallHandlerService
{
private static final java.lang.String DESCRIPTOR = "com.android.services.telephony.common.ICallHandlerService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.services.telephony.common.ICallHandlerService interface,
 * generating a proxy if needed.
 */
public static com.android.services.telephony.common.ICallHandlerService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.services.telephony.common.ICallHandlerService))) {
return ((com.android.services.telephony.common.ICallHandlerService)iin);
}
return new com.android.services.telephony.common.ICallHandlerService.Stub.Proxy(obj);
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
case TRANSACTION_startCallService:
{
data.enforceInterface(DESCRIPTOR);
com.android.services.telephony.common.ICallCommandService _arg0;
_arg0 = com.android.services.telephony.common.ICallCommandService.Stub.asInterface(data.readStrongBinder());
this.startCallService(_arg0);
return true;
}
case TRANSACTION_onIncoming:
{
data.enforceInterface(DESCRIPTOR);
com.android.services.telephony.common.Call _arg0;
if ((0!=data.readInt())) {
_arg0 = com.android.services.telephony.common.Call.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.util.List<java.lang.String> _arg1;
_arg1 = data.createStringArrayList();
this.onIncoming(_arg0, _arg1);
return true;
}
case TRANSACTION_onUpdate:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<com.android.services.telephony.common.Call> _arg0;
_arg0 = data.createTypedArrayList(com.android.services.telephony.common.Call.CREATOR);
this.onUpdate(_arg0);
return true;
}
case TRANSACTION_onDisconnect:
{
data.enforceInterface(DESCRIPTOR);
com.android.services.telephony.common.Call _arg0;
if ((0!=data.readInt())) {
_arg0 = com.android.services.telephony.common.Call.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onDisconnect(_arg0);
return true;
}
case TRANSACTION_onAudioModeChange:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.onAudioModeChange(_arg0, _arg1);
return true;
}
case TRANSACTION_onSupportedAudioModeChange:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onSupportedAudioModeChange(_arg0);
return true;
}
case TRANSACTION_bringToForeground:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.bringToForeground(_arg0);
return true;
}
case TRANSACTION_onPostDialWait:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.onPostDialWait(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.services.telephony.common.ICallHandlerService
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
     * First call made when we are ready to start sending events to the service.
     * Hands a command interface to the CallHandlerService through which
     * the call monitor can control the phone calls.
     */
@Override public void startCallService(com.android.services.telephony.common.ICallCommandService callCommandService) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callCommandService!=null))?(callCommandService.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_startCallService, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when there is an incoming call.
     */
@Override public void onIncoming(com.android.services.telephony.common.Call call, java.util.List<java.lang.String> textReponses) throws android.os.RemoteException
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
_data.writeStringList(textReponses);
mRemote.transact(Stub.TRANSACTION_onIncoming, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when the state of a call changes.
     */
@Override public void onUpdate(java.util.List<com.android.services.telephony.common.Call> call) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(call);
mRemote.transact(Stub.TRANSACTION_onUpdate, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when a call disconnects.
     */
@Override public void onDisconnect(com.android.services.telephony.common.Call call) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_onDisconnect, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when the audio mode changes.
     * {@see AudioMode}
     */
@Override public void onAudioModeChange(int mode, boolean muted) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(mode);
_data.writeInt(((muted)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onAudioModeChange, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when the supported audio modes change.
     * {@see AudioMode}
     */
@Override public void onSupportedAudioModeChange(int modeMask) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(modeMask);
mRemote.transact(Stub.TRANSACTION_onSupportedAudioModeChange, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when the system wants to bring the in-call UI into the foreground.
     */
@Override public void bringToForeground(boolean showDialpad) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((showDialpad)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_bringToForeground, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onPostDialWait(int callId, java.lang.String remainingChars) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(callId);
_data.writeString(remainingChars);
mRemote.transact(Stub.TRANSACTION_onPostDialWait, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_startCallService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onIncoming = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onUpdate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onDisconnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onAudioModeChange = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onSupportedAudioModeChange = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_bringToForeground = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_onPostDialWait = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
/**
     * First call made when we are ready to start sending events to the service.
     * Hands a command interface to the CallHandlerService through which
     * the call monitor can control the phone calls.
     */
public void startCallService(com.android.services.telephony.common.ICallCommandService callCommandService) throws android.os.RemoteException;
/**
     * Called when there is an incoming call.
     */
public void onIncoming(com.android.services.telephony.common.Call call, java.util.List<java.lang.String> textReponses) throws android.os.RemoteException;
/**
     * Called when the state of a call changes.
     */
public void onUpdate(java.util.List<com.android.services.telephony.common.Call> call) throws android.os.RemoteException;
/**
     * Called when a call disconnects.
     */
public void onDisconnect(com.android.services.telephony.common.Call call) throws android.os.RemoteException;
/**
     * Called when the audio mode changes.
     * {@see AudioMode}
     */
public void onAudioModeChange(int mode, boolean muted) throws android.os.RemoteException;
/**
     * Called when the supported audio modes change.
     * {@see AudioMode}
     */
public void onSupportedAudioModeChange(int modeMask) throws android.os.RemoteException;
/**
     * Called when the system wants to bring the in-call UI into the foreground.
     */
public void bringToForeground(boolean showDialpad) throws android.os.RemoteException;
public void onPostDialWait(int callId, java.lang.String remainingChars) throws android.os.RemoteException;
}
