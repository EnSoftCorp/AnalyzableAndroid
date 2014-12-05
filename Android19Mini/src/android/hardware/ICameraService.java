/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/hardware/ICameraService.aidl
 */
package android.hardware;
/** @hide */
public interface ICameraService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.ICameraService
{
private static final java.lang.String DESCRIPTOR = "android.hardware.ICameraService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.ICameraService interface,
 * generating a proxy if needed.
 */
public static android.hardware.ICameraService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.ICameraService))) {
return ((android.hardware.ICameraService)iin);
}
return new android.hardware.ICameraService.Stub.Proxy(obj);
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
case TRANSACTION_getNumberOfCameras:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getNumberOfCameras();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getCameraInfo:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.hardware.CameraInfo _arg1;
_arg1 = new android.hardware.CameraInfo();
int _result = this.getCameraInfo(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
if ((_arg1!=null)) {
reply.writeInt(1);
_arg1.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_connect:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.ICameraClient _arg0;
_arg0 = android.hardware.ICameraClient.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
int _arg3;
_arg3 = data.readInt();
android.hardware.camera2.utils.BinderHolder _arg4;
_arg4 = new android.hardware.camera2.utils.BinderHolder();
int _result = this.connect(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
reply.writeInt(_result);
if ((_arg4!=null)) {
reply.writeInt(1);
_arg4.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_connectPro:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.IProCameraCallbacks _arg0;
_arg0 = android.hardware.IProCameraCallbacks.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
int _arg3;
_arg3 = data.readInt();
android.hardware.camera2.utils.BinderHolder _arg4;
_arg4 = new android.hardware.camera2.utils.BinderHolder();
int _result = this.connectPro(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
reply.writeInt(_result);
if ((_arg4!=null)) {
reply.writeInt(1);
_arg4.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_connectDevice:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.camera2.ICameraDeviceCallbacks _arg0;
_arg0 = android.hardware.camera2.ICameraDeviceCallbacks.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
int _arg3;
_arg3 = data.readInt();
android.hardware.camera2.utils.BinderHolder _arg4;
_arg4 = new android.hardware.camera2.utils.BinderHolder();
int _result = this.connectDevice(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
reply.writeInt(_result);
if ((_arg4!=null)) {
reply.writeInt(1);
_arg4.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_addListener:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.ICameraServiceListener _arg0;
_arg0 = android.hardware.ICameraServiceListener.Stub.asInterface(data.readStrongBinder());
int _result = this.addListener(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_removeListener:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.ICameraServiceListener _arg0;
_arg0 = android.hardware.ICameraServiceListener.Stub.asInterface(data.readStrongBinder());
int _result = this.removeListener(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getCameraCharacteristics:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.hardware.camera2.impl.CameraMetadataNative _arg1;
_arg1 = new android.hardware.camera2.impl.CameraMetadataNative();
int _result = this.getCameraCharacteristics(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
if ((_arg1!=null)) {
reply.writeInt(1);
_arg1.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.ICameraService
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
     * Keep up-to-date with frameworks/av/include/camera/ICameraService.h
     */
@Override public int getNumberOfCameras() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getNumberOfCameras, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// rest of 'int' return values in this file are actually status_t

@Override public int getCameraInfo(int cameraId, android.hardware.CameraInfo info) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(cameraId);
mRemote.transact(Stub.TRANSACTION_getCameraInfo, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
if ((0!=_reply.readInt())) {
info.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int connect(android.hardware.ICameraClient client, int cameraId, java.lang.String clientPackageName, int clientUid, android.hardware.camera2.utils.BinderHolder device) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
_data.writeInt(cameraId);
_data.writeString(clientPackageName);
_data.writeInt(clientUid);
mRemote.transact(Stub.TRANSACTION_connect, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
if ((0!=_reply.readInt())) {
device.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int connectPro(android.hardware.IProCameraCallbacks callbacks, int cameraId, java.lang.String clientPackageName, int clientUid, android.hardware.camera2.utils.BinderHolder device) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callbacks!=null))?(callbacks.asBinder()):(null)));
_data.writeInt(cameraId);
_data.writeString(clientPackageName);
_data.writeInt(clientUid);
mRemote.transact(Stub.TRANSACTION_connectPro, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
if ((0!=_reply.readInt())) {
device.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int connectDevice(android.hardware.camera2.ICameraDeviceCallbacks callbacks, int cameraId, java.lang.String clientPackageName, int clientUid, android.hardware.camera2.utils.BinderHolder device) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callbacks!=null))?(callbacks.asBinder()):(null)));
_data.writeInt(cameraId);
_data.writeString(clientPackageName);
_data.writeInt(clientUid);
mRemote.transact(Stub.TRANSACTION_connectDevice, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
if ((0!=_reply.readInt())) {
device.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int addListener(android.hardware.ICameraServiceListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_addListener, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int removeListener(android.hardware.ICameraServiceListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_removeListener, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getCameraCharacteristics(int cameraId, android.hardware.camera2.impl.CameraMetadataNative info) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(cameraId);
mRemote.transact(Stub.TRANSACTION_getCameraCharacteristics, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
if ((0!=_reply.readInt())) {
info.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getNumberOfCameras = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getCameraInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_connect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_connectPro = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_connectDevice = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_addListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_removeListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getCameraCharacteristics = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
/**
     * Keep up-to-date with frameworks/av/include/camera/ICameraService.h
     */
public int getNumberOfCameras() throws android.os.RemoteException;
// rest of 'int' return values in this file are actually status_t

public int getCameraInfo(int cameraId, android.hardware.CameraInfo info) throws android.os.RemoteException;
public int connect(android.hardware.ICameraClient client, int cameraId, java.lang.String clientPackageName, int clientUid, android.hardware.camera2.utils.BinderHolder device) throws android.os.RemoteException;
public int connectPro(android.hardware.IProCameraCallbacks callbacks, int cameraId, java.lang.String clientPackageName, int clientUid, android.hardware.camera2.utils.BinderHolder device) throws android.os.RemoteException;
public int connectDevice(android.hardware.camera2.ICameraDeviceCallbacks callbacks, int cameraId, java.lang.String clientPackageName, int clientUid, android.hardware.camera2.utils.BinderHolder device) throws android.os.RemoteException;
public int addListener(android.hardware.ICameraServiceListener listener) throws android.os.RemoteException;
public int removeListener(android.hardware.ICameraServiceListener listener) throws android.os.RemoteException;
public int getCameraCharacteristics(int cameraId, android.hardware.camera2.impl.CameraMetadataNative info) throws android.os.RemoteException;
}
