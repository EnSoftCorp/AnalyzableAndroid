/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/com/android/internal/policy/IKeyguardService.aidl
 */
package com.android.internal.policy;
public interface IKeyguardService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.policy.IKeyguardService
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.policy.IKeyguardService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.policy.IKeyguardService interface,
 * generating a proxy if needed.
 */
public static com.android.internal.policy.IKeyguardService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.policy.IKeyguardService))) {
return ((com.android.internal.policy.IKeyguardService)iin);
}
return new com.android.internal.policy.IKeyguardService.Stub.Proxy(obj);
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
case TRANSACTION_isShowing:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isShowing();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isSecure:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isSecure();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isShowingAndNotOccluded:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isShowingAndNotOccluded();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isInputRestricted:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isInputRestricted();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isDismissable:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isDismissable();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_verifyUnlock:
{
data.enforceInterface(DESCRIPTOR);
com.android.internal.policy.IKeyguardExitCallback _arg0;
_arg0 = com.android.internal.policy.IKeyguardExitCallback.Stub.asInterface(data.readStrongBinder());
this.verifyUnlock(_arg0);
return true;
}
case TRANSACTION_keyguardDone:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _arg1;
_arg1 = (0!=data.readInt());
this.keyguardDone(_arg0, _arg1);
return true;
}
case TRANSACTION_setOccluded:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
int _result = this.setOccluded(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_dismiss:
{
data.enforceInterface(DESCRIPTOR);
this.dismiss();
return true;
}
case TRANSACTION_onDreamingStarted:
{
data.enforceInterface(DESCRIPTOR);
this.onDreamingStarted();
return true;
}
case TRANSACTION_onDreamingStopped:
{
data.enforceInterface(DESCRIPTOR);
this.onDreamingStopped();
return true;
}
case TRANSACTION_onScreenTurnedOff:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onScreenTurnedOff(_arg0);
return true;
}
case TRANSACTION_onScreenTurnedOn:
{
data.enforceInterface(DESCRIPTOR);
com.android.internal.policy.IKeyguardShowCallback _arg0;
_arg0 = com.android.internal.policy.IKeyguardShowCallback.Stub.asInterface(data.readStrongBinder());
this.onScreenTurnedOn(_arg0);
return true;
}
case TRANSACTION_setKeyguardEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setKeyguardEnabled(_arg0);
return true;
}
case TRANSACTION_onSystemReady:
{
data.enforceInterface(DESCRIPTOR);
this.onSystemReady();
return true;
}
case TRANSACTION_doKeyguardTimeout:
{
data.enforceInterface(DESCRIPTOR);
android.os.Bundle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.doKeyguardTimeout(_arg0);
return true;
}
case TRANSACTION_setCurrentUser:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setCurrentUser(_arg0);
return true;
}
case TRANSACTION_showAssistant:
{
data.enforceInterface(DESCRIPTOR);
this.showAssistant();
return true;
}
case TRANSACTION_dispatch:
{
data.enforceInterface(DESCRIPTOR);
android.view.MotionEvent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.view.MotionEvent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.dispatch(_arg0);
return true;
}
case TRANSACTION_launchCamera:
{
data.enforceInterface(DESCRIPTOR);
this.launchCamera();
return true;
}
case TRANSACTION_onBootCompleted:
{
data.enforceInterface(DESCRIPTOR);
this.onBootCompleted();
return true;
}
case TRANSACTION_startKeyguardExitAnimation:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
long _arg1;
_arg1 = data.readLong();
this.startKeyguardExitAnimation(_arg0, _arg1);
return true;
}
case TRANSACTION_onActivityDrawn:
{
data.enforceInterface(DESCRIPTOR);
this.onActivityDrawn();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.policy.IKeyguardService
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
@Override public boolean isShowing() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isShowing, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isSecure() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isSecure, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isShowingAndNotOccluded() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isShowingAndNotOccluded, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isInputRestricted() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isInputRestricted, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isDismissable() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isDismissable, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void verifyUnlock(com.android.internal.policy.IKeyguardExitCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_verifyUnlock, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void keyguardDone(boolean authenticated, boolean wakeup) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((authenticated)?(1):(0)));
_data.writeInt(((wakeup)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_keyguardDone, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Sets the Keyguard as occluded when a window dismisses the Keyguard with flag
     * FLAG_SHOW_ON_LOCK_SCREEN.
     *
     * @param isOccluded Whether the Keyguard is occluded by another window.
     * @return See IKeyguardServiceConstants.KEYGUARD_SERVICE_SET_OCCLUDED_*. This is needed because
     *         PhoneWindowManager needs to set these flags immediately and can't wait for the
     *         Keyguard thread to pick it up. In the hidden case, PhoneWindowManager is solely
     *         responsible to make sure that the flags are unset.
     */
@Override public int setOccluded(boolean isOccluded) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((isOccluded)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setOccluded, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void dismiss() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_dismiss, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onDreamingStarted() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onDreamingStarted, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onDreamingStopped() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onDreamingStopped, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onScreenTurnedOff(int reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(reason);
mRemote.transact(Stub.TRANSACTION_onScreenTurnedOff, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onScreenTurnedOn(com.android.internal.policy.IKeyguardShowCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_onScreenTurnedOn, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setKeyguardEnabled(boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setKeyguardEnabled, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onSystemReady() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onSystemReady, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void doKeyguardTimeout(android.os.Bundle options) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((options!=null)) {
_data.writeInt(1);
options.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_doKeyguardTimeout, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setCurrentUser(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_setCurrentUser, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void showAssistant() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_showAssistant, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void dispatch(android.view.MotionEvent event) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((event!=null)) {
_data.writeInt(1);
event.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_dispatch, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void launchCamera() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_launchCamera, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onBootCompleted() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onBootCompleted, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Notifies that the activity behind has now been drawn and it's safe to remove the wallpaper
     * and keyguard flag.
     *
     * @param startTime the start time of the animation in uptime milliseconds
     * @param fadeoutDuration the duration of the exit animation, in milliseconds
     */
@Override public void startKeyguardExitAnimation(long startTime, long fadeoutDuration) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(startTime);
_data.writeLong(fadeoutDuration);
mRemote.transact(Stub.TRANSACTION_startKeyguardExitAnimation, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Notifies the Keyguard that the activity that was starting has now been drawn and it's safe
     * to start the keyguard dismiss sequence.
     */
@Override public void onActivityDrawn() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onActivityDrawn, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_isShowing = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_isSecure = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_isShowingAndNotOccluded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_isInputRestricted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_isDismissable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_verifyUnlock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_keyguardDone = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_setOccluded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_dismiss = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_onDreamingStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_onDreamingStopped = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_onScreenTurnedOff = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_onScreenTurnedOn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_setKeyguardEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_onSystemReady = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_doKeyguardTimeout = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_setCurrentUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_showAssistant = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_dispatch = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_launchCamera = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_onBootCompleted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_startKeyguardExitAnimation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_onActivityDrawn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
}
public boolean isShowing() throws android.os.RemoteException;
public boolean isSecure() throws android.os.RemoteException;
public boolean isShowingAndNotOccluded() throws android.os.RemoteException;
public boolean isInputRestricted() throws android.os.RemoteException;
public boolean isDismissable() throws android.os.RemoteException;
public void verifyUnlock(com.android.internal.policy.IKeyguardExitCallback callback) throws android.os.RemoteException;
public void keyguardDone(boolean authenticated, boolean wakeup) throws android.os.RemoteException;
/**
     * Sets the Keyguard as occluded when a window dismisses the Keyguard with flag
     * FLAG_SHOW_ON_LOCK_SCREEN.
     *
     * @param isOccluded Whether the Keyguard is occluded by another window.
     * @return See IKeyguardServiceConstants.KEYGUARD_SERVICE_SET_OCCLUDED_*. This is needed because
     *         PhoneWindowManager needs to set these flags immediately and can't wait for the
     *         Keyguard thread to pick it up. In the hidden case, PhoneWindowManager is solely
     *         responsible to make sure that the flags are unset.
     */
public int setOccluded(boolean isOccluded) throws android.os.RemoteException;
public void dismiss() throws android.os.RemoteException;
public void onDreamingStarted() throws android.os.RemoteException;
public void onDreamingStopped() throws android.os.RemoteException;
public void onScreenTurnedOff(int reason) throws android.os.RemoteException;
public void onScreenTurnedOn(com.android.internal.policy.IKeyguardShowCallback callback) throws android.os.RemoteException;
public void setKeyguardEnabled(boolean enabled) throws android.os.RemoteException;
public void onSystemReady() throws android.os.RemoteException;
public void doKeyguardTimeout(android.os.Bundle options) throws android.os.RemoteException;
public void setCurrentUser(int userId) throws android.os.RemoteException;
public void showAssistant() throws android.os.RemoteException;
public void dispatch(android.view.MotionEvent event) throws android.os.RemoteException;
public void launchCamera() throws android.os.RemoteException;
public void onBootCompleted() throws android.os.RemoteException;
/**
     * Notifies that the activity behind has now been drawn and it's safe to remove the wallpaper
     * and keyguard flag.
     *
     * @param startTime the start time of the animation in uptime milliseconds
     * @param fadeoutDuration the duration of the exit animation, in milliseconds
     */
public void startKeyguardExitAnimation(long startTime, long fadeoutDuration) throws android.os.RemoteException;
/**
     * Notifies the Keyguard that the activity that was starting has now been drawn and it's safe
     * to start the keyguard dismiss sequence.
     */
public void onActivityDrawn() throws android.os.RemoteException;
}
