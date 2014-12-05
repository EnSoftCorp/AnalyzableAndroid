/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/com/android/internal/app/IAppOpsService.aidl
 */
package com.android.internal.app;
public interface IAppOpsService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IAppOpsService
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.app.IAppOpsService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.app.IAppOpsService interface,
 * generating a proxy if needed.
 */
public static com.android.internal.app.IAppOpsService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.app.IAppOpsService))) {
return ((com.android.internal.app.IAppOpsService)iin);
}
return new com.android.internal.app.IAppOpsService.Stub.Proxy(obj);
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
case TRANSACTION_checkOperation:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
int _result = this.checkOperation(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_noteOperation:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
int _result = this.noteOperation(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_startOperation:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
java.lang.String _arg3;
_arg3 = data.readString();
int _result = this.startOperation(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_finishOperation:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
java.lang.String _arg3;
_arg3 = data.readString();
this.finishOperation(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_startWatchingMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
com.android.internal.app.IAppOpsCallback _arg2;
_arg2 = com.android.internal.app.IAppOpsCallback.Stub.asInterface(data.readStrongBinder());
this.startWatchingMode(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_stopWatchingMode:
{
data.enforceInterface(DESCRIPTOR);
com.android.internal.app.IAppOpsCallback _arg0;
_arg0 = com.android.internal.app.IAppOpsCallback.Stub.asInterface(data.readStrongBinder());
this.stopWatchingMode(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getToken:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.os.IBinder _result = this.getToken(_arg0);
reply.writeNoException();
reply.writeStrongBinder(_result);
return true;
}
case TRANSACTION_checkPackage:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.checkPackage(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getPackagesForOps:
{
data.enforceInterface(DESCRIPTOR);
int[] _arg0;
_arg0 = data.createIntArray();
java.util.List<android.app.AppOpsManager.PackageOps> _result = this.getPackagesForOps(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getOpsForPackage:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int[] _arg2;
_arg2 = data.createIntArray();
java.util.List<android.app.AppOpsManager.PackageOps> _result = this.getOpsForPackage(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_setMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
int _arg3;
_arg3 = data.readInt();
this.setMode(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_resetAllModes:
{
data.enforceInterface(DESCRIPTOR);
this.resetAllModes();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.app.IAppOpsService
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
// These first methods are also called by native code, so must
// be kept in sync with frameworks/native/include/binder/IAppOpsService.h

@Override public int checkOperation(int code, int uid, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(code);
_data.writeInt(uid);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_checkOperation, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int noteOperation(int code, int uid, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(code);
_data.writeInt(uid);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_noteOperation, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int startOperation(android.os.IBinder token, int code, int uid, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(code);
_data.writeInt(uid);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_startOperation, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void finishOperation(android.os.IBinder token, int code, int uid, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(code);
_data.writeInt(uid);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_finishOperation, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void startWatchingMode(int op, java.lang.String packageName, com.android.internal.app.IAppOpsCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(op);
_data.writeString(packageName);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_startWatchingMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stopWatchingMode(com.android.internal.app.IAppOpsCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_stopWatchingMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.os.IBinder getToken(android.os.IBinder clientToken) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.IBinder _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(clientToken);
mRemote.transact(Stub.TRANSACTION_getToken, _data, _reply, 0);
_reply.readException();
_result = _reply.readStrongBinder();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Remaining methods are only used in Java.

@Override public int checkPackage(int uid, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_checkPackage, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.app.AppOpsManager.PackageOps> getPackagesForOps(int[] ops) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.app.AppOpsManager.PackageOps> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeIntArray(ops);
mRemote.transact(Stub.TRANSACTION_getPackagesForOps, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.app.AppOpsManager.PackageOps.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.app.AppOpsManager.PackageOps> getOpsForPackage(int uid, java.lang.String packageName, int[] ops) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.app.AppOpsManager.PackageOps> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeString(packageName);
_data.writeIntArray(ops);
mRemote.transact(Stub.TRANSACTION_getOpsForPackage, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.app.AppOpsManager.PackageOps.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setMode(int code, int uid, java.lang.String packageName, int mode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(code);
_data.writeInt(uid);
_data.writeString(packageName);
_data.writeInt(mode);
mRemote.transact(Stub.TRANSACTION_setMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void resetAllModes() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_resetAllModes, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_checkOperation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_noteOperation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_startOperation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_finishOperation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_startWatchingMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_stopWatchingMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_checkPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getPackagesForOps = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getOpsForPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_setMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_resetAllModes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
}
// These first methods are also called by native code, so must
// be kept in sync with frameworks/native/include/binder/IAppOpsService.h

public int checkOperation(int code, int uid, java.lang.String packageName) throws android.os.RemoteException;
public int noteOperation(int code, int uid, java.lang.String packageName) throws android.os.RemoteException;
public int startOperation(android.os.IBinder token, int code, int uid, java.lang.String packageName) throws android.os.RemoteException;
public void finishOperation(android.os.IBinder token, int code, int uid, java.lang.String packageName) throws android.os.RemoteException;
public void startWatchingMode(int op, java.lang.String packageName, com.android.internal.app.IAppOpsCallback callback) throws android.os.RemoteException;
public void stopWatchingMode(com.android.internal.app.IAppOpsCallback callback) throws android.os.RemoteException;
public android.os.IBinder getToken(android.os.IBinder clientToken) throws android.os.RemoteException;
// Remaining methods are only used in Java.

public int checkPackage(int uid, java.lang.String packageName) throws android.os.RemoteException;
public java.util.List<android.app.AppOpsManager.PackageOps> getPackagesForOps(int[] ops) throws android.os.RemoteException;
public java.util.List<android.app.AppOpsManager.PackageOps> getOpsForPackage(int uid, java.lang.String packageName, int[] ops) throws android.os.RemoteException;
public void setMode(int code, int uid, java.lang.String packageName, int mode) throws android.os.RemoteException;
public void resetAllModes() throws android.os.RemoteException;
}
