/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/com/android/internal/app/IMediaContainerService.aidl
 */
package com.android.internal.app;
public interface IMediaContainerService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IMediaContainerService
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.app.IMediaContainerService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.app.IMediaContainerService interface,
 * generating a proxy if needed.
 */
public static com.android.internal.app.IMediaContainerService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.app.IMediaContainerService))) {
return ((com.android.internal.app.IMediaContainerService)iin);
}
return new com.android.internal.app.IMediaContainerService.Stub.Proxy(obj);
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
case TRANSACTION_copyResourceToContainer:
{
data.enforceInterface(DESCRIPTOR);
android.net.Uri _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
java.lang.String _arg4;
_arg4 = data.readString();
boolean _arg5;
_arg5 = (0!=data.readInt());
boolean _arg6;
_arg6 = (0!=data.readInt());
java.lang.String _result = this.copyResourceToContainer(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_copyResource:
{
data.enforceInterface(DESCRIPTOR);
android.net.Uri _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.content.pm.ContainerEncryptionParams _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.pm.ContainerEncryptionParams.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.os.ParcelFileDescriptor _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
int _result = this.copyResource(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getMinimalPackageInfo:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
long _arg2;
_arg2 = data.readLong();
android.content.pm.PackageInfoLite _result = this.getMinimalPackageInfo(_arg0, _arg1, _arg2);
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
case TRANSACTION_checkInternalFreeStorage:
{
data.enforceInterface(DESCRIPTOR);
android.net.Uri _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
long _arg2;
_arg2 = data.readLong();
boolean _result = this.checkInternalFreeStorage(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_checkExternalFreeStorage:
{
data.enforceInterface(DESCRIPTOR);
android.net.Uri _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
boolean _result = this.checkExternalFreeStorage(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getObbInfo:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.content.res.ObbInfo _result = this.getObbInfo(_arg0);
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
case TRANSACTION_calculateDirectorySize:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _result = this.calculateDirectorySize(_arg0);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getFileSystemStats:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long[] _result = this.getFileSystemStats(_arg0);
reply.writeNoException();
reply.writeLongArray(_result);
return true;
}
case TRANSACTION_clearDirectory:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.clearDirectory(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_calculateInstalledSize:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
long _result = this.calculateInstalledSize(_arg0, _arg1);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.app.IMediaContainerService
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
@Override public java.lang.String copyResourceToContainer(android.net.Uri packageURI, java.lang.String containerId, java.lang.String key, java.lang.String resFileName, java.lang.String publicResFileName, boolean isExternal, boolean isForwardLocked) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((packageURI!=null)) {
_data.writeInt(1);
packageURI.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(containerId);
_data.writeString(key);
_data.writeString(resFileName);
_data.writeString(publicResFileName);
_data.writeInt(((isExternal)?(1):(0)));
_data.writeInt(((isForwardLocked)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_copyResourceToContainer, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int copyResource(android.net.Uri packageURI, android.content.pm.ContainerEncryptionParams encryptionParams, android.os.ParcelFileDescriptor outStream) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((packageURI!=null)) {
_data.writeInt(1);
packageURI.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((encryptionParams!=null)) {
_data.writeInt(1);
encryptionParams.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((outStream!=null)) {
_data.writeInt(1);
outStream.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_copyResource, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.content.pm.PackageInfoLite getMinimalPackageInfo(java.lang.String packagePath, int flags, long threshold) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.PackageInfoLite _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packagePath);
_data.writeInt(flags);
_data.writeLong(threshold);
mRemote.transact(Stub.TRANSACTION_getMinimalPackageInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.PackageInfoLite.CREATOR.createFromParcel(_reply);
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
@Override public boolean checkInternalFreeStorage(android.net.Uri fileUri, boolean isForwardLocked, long threshold) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((fileUri!=null)) {
_data.writeInt(1);
fileUri.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((isForwardLocked)?(1):(0)));
_data.writeLong(threshold);
mRemote.transact(Stub.TRANSACTION_checkInternalFreeStorage, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean checkExternalFreeStorage(android.net.Uri fileUri, boolean isForwardLocked) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((fileUri!=null)) {
_data.writeInt(1);
fileUri.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((isForwardLocked)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_checkExternalFreeStorage, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.content.res.ObbInfo getObbInfo(java.lang.String filename) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.res.ObbInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(filename);
mRemote.transact(Stub.TRANSACTION_getObbInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.res.ObbInfo.CREATOR.createFromParcel(_reply);
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
@Override public long calculateDirectorySize(java.lang.String directory) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(directory);
mRemote.transact(Stub.TRANSACTION_calculateDirectorySize, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/** Return file system stats: [0] is total bytes, [1] is available bytes */
@Override public long[] getFileSystemStats(java.lang.String path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(path);
mRemote.transact(Stub.TRANSACTION_getFileSystemStats, _data, _reply, 0);
_reply.readException();
_result = _reply.createLongArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void clearDirectory(java.lang.String directory) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(directory);
mRemote.transact(Stub.TRANSACTION_clearDirectory, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public long calculateInstalledSize(java.lang.String packagePath, boolean isForwardLocked) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packagePath);
_data.writeInt(((isForwardLocked)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_calculateInstalledSize, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_copyResourceToContainer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_copyResource = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getMinimalPackageInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_checkInternalFreeStorage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_checkExternalFreeStorage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getObbInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_calculateDirectorySize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getFileSystemStats = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_clearDirectory = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_calculateInstalledSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
}
public java.lang.String copyResourceToContainer(android.net.Uri packageURI, java.lang.String containerId, java.lang.String key, java.lang.String resFileName, java.lang.String publicResFileName, boolean isExternal, boolean isForwardLocked) throws android.os.RemoteException;
public int copyResource(android.net.Uri packageURI, android.content.pm.ContainerEncryptionParams encryptionParams, android.os.ParcelFileDescriptor outStream) throws android.os.RemoteException;
public android.content.pm.PackageInfoLite getMinimalPackageInfo(java.lang.String packagePath, int flags, long threshold) throws android.os.RemoteException;
public boolean checkInternalFreeStorage(android.net.Uri fileUri, boolean isForwardLocked, long threshold) throws android.os.RemoteException;
public boolean checkExternalFreeStorage(android.net.Uri fileUri, boolean isForwardLocked) throws android.os.RemoteException;
public android.content.res.ObbInfo getObbInfo(java.lang.String filename) throws android.os.RemoteException;
public long calculateDirectorySize(java.lang.String directory) throws android.os.RemoteException;
/** Return file system stats: [0] is total bytes, [1] is available bytes */
public long[] getFileSystemStats(java.lang.String path) throws android.os.RemoteException;
public void clearDirectory(java.lang.String directory) throws android.os.RemoteException;
public long calculateInstalledSize(java.lang.String packagePath, boolean isForwardLocked) throws android.os.RemoteException;
}
