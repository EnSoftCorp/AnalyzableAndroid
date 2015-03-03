/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/com/android/internal/widget/ILockSettingsObserver.aidl
 */
package com.android.internal.widget;
/** {@hide} */
public interface ILockSettingsObserver extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.widget.ILockSettingsObserver
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.widget.ILockSettingsObserver";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.widget.ILockSettingsObserver interface,
 * generating a proxy if needed.
 */
public static com.android.internal.widget.ILockSettingsObserver asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.widget.ILockSettingsObserver))) {
return ((com.android.internal.widget.ILockSettingsObserver)iin);
}
return new com.android.internal.widget.ILockSettingsObserver.Stub.Proxy(obj);
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
case TRANSACTION_onLockSettingChanged:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.onLockSettingChanged(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.widget.ILockSettingsObserver
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
@Override public void onLockSettingChanged(java.lang.String key, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_onLockSettingChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onLockSettingChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void onLockSettingChanged(java.lang.String key, int userId) throws android.os.RemoteException;
}
