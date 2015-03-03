/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/app/INotificationManager.aidl
 */
package android.app;
/** {@hide} */
public interface INotificationManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.INotificationManager
{
private static final java.lang.String DESCRIPTOR = "android.app.INotificationManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.INotificationManager interface,
 * generating a proxy if needed.
 */
public static android.app.INotificationManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.INotificationManager))) {
return ((android.app.INotificationManager)iin);
}
return new android.app.INotificationManager.Stub.Proxy(obj);
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
case TRANSACTION_cancelAllNotifications:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.cancelAllNotifications(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_enqueueToast:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.app.ITransientNotification _arg1;
_arg1 = android.app.ITransientNotification.Stub.asInterface(data.readStrongBinder());
int _arg2;
_arg2 = data.readInt();
this.enqueueToast(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_cancelToast:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.app.ITransientNotification _arg1;
_arg1 = android.app.ITransientNotification.Stub.asInterface(data.readStrongBinder());
this.cancelToast(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_enqueueNotificationWithTag:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
int _arg3;
_arg3 = data.readInt();
android.app.Notification _arg4;
if ((0!=data.readInt())) {
_arg4 = android.app.Notification.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
int[] _arg5;
_arg5 = data.createIntArray();
int _arg6;
_arg6 = data.readInt();
this.enqueueNotificationWithTag(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
reply.writeNoException();
reply.writeIntArray(_arg5);
return true;
}
case TRANSACTION_cancelNotificationWithTag:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.cancelNotificationWithTag(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_setNotificationsEnabledForPackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setNotificationsEnabledForPackage(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_areNotificationsEnabledForPackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.areNotificationsEnabledForPackage(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getActiveNotifications:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.service.notification.StatusBarNotification[] _result = this.getActiveNotifications(_arg0);
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_getHistoricalNotifications:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.service.notification.StatusBarNotification[] _result = this.getHistoricalNotifications(_arg0, _arg1);
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_registerListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
android.content.ComponentName _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
this.registerListener(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
this.unregisterListener(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_cancelNotificationFromListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
int _arg3;
_arg3 = data.readInt();
this.cancelNotificationFromListener(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_cancelAllNotificationsFromListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
this.cancelAllNotificationsFromListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getActiveNotificationsFromListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
android.service.notification.StatusBarNotification[] _result = this.getActiveNotificationsFromListener(_arg0);
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.INotificationManager
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
@Override public void cancelAllNotifications(java.lang.String pkg, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_cancelAllNotifications, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void enqueueToast(java.lang.String pkg, android.app.ITransientNotification callback, int duration) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
_data.writeInt(duration);
mRemote.transact(Stub.TRANSACTION_enqueueToast, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void cancelToast(java.lang.String pkg, android.app.ITransientNotification callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_cancelToast, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void enqueueNotificationWithTag(java.lang.String pkg, java.lang.String basePkg, java.lang.String tag, int id, android.app.Notification notification, int[] idReceived, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeString(basePkg);
_data.writeString(tag);
_data.writeInt(id);
if ((notification!=null)) {
_data.writeInt(1);
notification.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeIntArray(idReceived);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_enqueueNotificationWithTag, _data, _reply, 0);
_reply.readException();
_reply.readIntArray(idReceived);
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void cancelNotificationWithTag(java.lang.String pkg, java.lang.String tag, int id, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeString(tag);
_data.writeInt(id);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_cancelNotificationWithTag, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setNotificationsEnabledForPackage(java.lang.String pkg, int uid, boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(uid);
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setNotificationsEnabledForPackage, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean areNotificationsEnabledForPackage(java.lang.String pkg, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_areNotificationsEnabledForPackage, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.service.notification.StatusBarNotification[] getActiveNotifications(java.lang.String callingPkg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.service.notification.StatusBarNotification[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPkg);
mRemote.transact(Stub.TRANSACTION_getActiveNotifications, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.service.notification.StatusBarNotification.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.service.notification.StatusBarNotification[] getHistoricalNotifications(java.lang.String callingPkg, int count) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.service.notification.StatusBarNotification[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPkg);
_data.writeInt(count);
mRemote.transact(Stub.TRANSACTION_getHistoricalNotifications, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.service.notification.StatusBarNotification.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void registerListener(android.service.notification.INotificationListener listener, android.content.ComponentName component, int userid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
if ((component!=null)) {
_data.writeInt(1);
component.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userid);
mRemote.transact(Stub.TRANSACTION_registerListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterListener(android.service.notification.INotificationListener listener, int userid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
_data.writeInt(userid);
mRemote.transact(Stub.TRANSACTION_unregisterListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void cancelNotificationFromListener(android.service.notification.INotificationListener token, java.lang.String pkg, java.lang.String tag, int id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeString(pkg);
_data.writeString(tag);
_data.writeInt(id);
mRemote.transact(Stub.TRANSACTION_cancelNotificationFromListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void cancelAllNotificationsFromListener(android.service.notification.INotificationListener token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_cancelAllNotificationsFromListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.service.notification.StatusBarNotification[] getActiveNotificationsFromListener(android.service.notification.INotificationListener token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.service.notification.StatusBarNotification[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_getActiveNotificationsFromListener, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.service.notification.StatusBarNotification.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_cancelAllNotifications = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_enqueueToast = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_cancelToast = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_enqueueNotificationWithTag = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_cancelNotificationWithTag = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_setNotificationsEnabledForPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_areNotificationsEnabledForPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getActiveNotifications = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getHistoricalNotifications = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_registerListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_unregisterListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_cancelNotificationFromListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_cancelAllNotificationsFromListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_getActiveNotificationsFromListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
}
public void cancelAllNotifications(java.lang.String pkg, int userId) throws android.os.RemoteException;
public void enqueueToast(java.lang.String pkg, android.app.ITransientNotification callback, int duration) throws android.os.RemoteException;
public void cancelToast(java.lang.String pkg, android.app.ITransientNotification callback) throws android.os.RemoteException;
public void enqueueNotificationWithTag(java.lang.String pkg, java.lang.String basePkg, java.lang.String tag, int id, android.app.Notification notification, int[] idReceived, int userId) throws android.os.RemoteException;
public void cancelNotificationWithTag(java.lang.String pkg, java.lang.String tag, int id, int userId) throws android.os.RemoteException;
public void setNotificationsEnabledForPackage(java.lang.String pkg, int uid, boolean enabled) throws android.os.RemoteException;
public boolean areNotificationsEnabledForPackage(java.lang.String pkg, int uid) throws android.os.RemoteException;
public android.service.notification.StatusBarNotification[] getActiveNotifications(java.lang.String callingPkg) throws android.os.RemoteException;
public android.service.notification.StatusBarNotification[] getHistoricalNotifications(java.lang.String callingPkg, int count) throws android.os.RemoteException;
public void registerListener(android.service.notification.INotificationListener listener, android.content.ComponentName component, int userid) throws android.os.RemoteException;
public void unregisterListener(android.service.notification.INotificationListener listener, int userid) throws android.os.RemoteException;
public void cancelNotificationFromListener(android.service.notification.INotificationListener token, java.lang.String pkg, java.lang.String tag, int id) throws android.os.RemoteException;
public void cancelAllNotificationsFromListener(android.service.notification.INotificationListener token) throws android.os.RemoteException;
public android.service.notification.StatusBarNotification[] getActiveNotificationsFromListener(android.service.notification.INotificationListener token) throws android.os.RemoteException;
}
