/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/service/trust/ITrustAgentService.aidl
 */
package android.service.trust;
/**
 * Communication channel from TrustManagerService to the TrustAgent.
 * @hide
 */
public interface ITrustAgentService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.trust.ITrustAgentService
{
private static final java.lang.String DESCRIPTOR = "android.service.trust.ITrustAgentService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.trust.ITrustAgentService interface,
 * generating a proxy if needed.
 */
public static android.service.trust.ITrustAgentService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.trust.ITrustAgentService))) {
return ((android.service.trust.ITrustAgentService)iin);
}
return new android.service.trust.ITrustAgentService.Stub.Proxy(obj);
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
case TRANSACTION_onUnlockAttempt:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onUnlockAttempt(_arg0);
return true;
}
case TRANSACTION_onTrustTimeout:
{
data.enforceInterface(DESCRIPTOR);
this.onTrustTimeout();
return true;
}
case TRANSACTION_setCallback:
{
data.enforceInterface(DESCRIPTOR);
android.service.trust.ITrustAgentServiceCallback _arg0;
_arg0 = android.service.trust.ITrustAgentServiceCallback.Stub.asInterface(data.readStrongBinder());
this.setCallback(_arg0);
return true;
}
case TRANSACTION_setTrustAgentFeaturesEnabled:
{
data.enforceInterface(DESCRIPTOR);
android.os.Bundle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
this.setTrustAgentFeaturesEnabled(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.trust.ITrustAgentService
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
@Override public void onUnlockAttempt(boolean successful) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((successful)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onUnlockAttempt, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onTrustTimeout() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onTrustTimeout, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setCallback(android.service.trust.ITrustAgentServiceCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setCallback, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setTrustAgentFeaturesEnabled(android.os.Bundle options, android.os.IBinder token) throws android.os.RemoteException
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
_data.writeStrongBinder(token);
mRemote.transact(Stub.TRANSACTION_setTrustAgentFeaturesEnabled, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onUnlockAttempt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onTrustTimeout = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setTrustAgentFeaturesEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public void onUnlockAttempt(boolean successful) throws android.os.RemoteException;
public void onTrustTimeout() throws android.os.RemoteException;
public void setCallback(android.service.trust.ITrustAgentServiceCallback callback) throws android.os.RemoteException;
public void setTrustAgentFeaturesEnabled(android.os.Bundle options, android.os.IBinder token) throws android.os.RemoteException;
}
