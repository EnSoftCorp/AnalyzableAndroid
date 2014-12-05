/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/hardware/camera2/ICameraDeviceCallbacks.aidl
 */
package android.hardware.camera2;
/** @hide */
public interface ICameraDeviceCallbacks extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.camera2.ICameraDeviceCallbacks
{
private static final java.lang.String DESCRIPTOR = "android.hardware.camera2.ICameraDeviceCallbacks";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.camera2.ICameraDeviceCallbacks interface,
 * generating a proxy if needed.
 */
public static android.hardware.camera2.ICameraDeviceCallbacks asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.camera2.ICameraDeviceCallbacks))) {
return ((android.hardware.camera2.ICameraDeviceCallbacks)iin);
}
return new android.hardware.camera2.ICameraDeviceCallbacks.Stub.Proxy(obj);
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
case TRANSACTION_onCameraError:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onCameraError(_arg0);
return true;
}
case TRANSACTION_onCameraIdle:
{
data.enforceInterface(DESCRIPTOR);
this.onCameraIdle();
return true;
}
case TRANSACTION_onCaptureStarted:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
long _arg1;
_arg1 = data.readLong();
this.onCaptureStarted(_arg0, _arg1);
return true;
}
case TRANSACTION_onResultReceived:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.hardware.camera2.impl.CameraMetadataNative _arg1;
if ((0!=data.readInt())) {
_arg1 = android.hardware.camera2.impl.CameraMetadataNative.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.onResultReceived(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.camera2.ICameraDeviceCallbacks
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
     * Keep up-to-date with frameworks/av/include/camera/camera2/ICameraDeviceCallbacks.h
     */
@Override public void onCameraError(int errorCode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(errorCode);
mRemote.transact(Stub.TRANSACTION_onCameraError, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onCameraIdle() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onCameraIdle, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onCaptureStarted(int requestId, long timestamp) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(requestId);
_data.writeLong(timestamp);
mRemote.transact(Stub.TRANSACTION_onCaptureStarted, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onResultReceived(int requestId, android.hardware.camera2.impl.CameraMetadataNative result) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(requestId);
if ((result!=null)) {
_data.writeInt(1);
result.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onResultReceived, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onCameraError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onCameraIdle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onCaptureStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onResultReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
/**
     * Keep up-to-date with frameworks/av/include/camera/camera2/ICameraDeviceCallbacks.h
     */
public void onCameraError(int errorCode) throws android.os.RemoteException;
public void onCameraIdle() throws android.os.RemoteException;
public void onCaptureStarted(int requestId, long timestamp) throws android.os.RemoteException;
public void onResultReceived(int requestId, android.hardware.camera2.impl.CameraMetadataNative result) throws android.os.RemoteException;
}
