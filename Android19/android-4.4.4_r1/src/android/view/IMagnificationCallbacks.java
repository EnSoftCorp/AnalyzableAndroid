/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/view/IMagnificationCallbacks.aidl
 */
package android.view;
/**
 * {@hide}
 */
public interface IMagnificationCallbacks extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.view.IMagnificationCallbacks
{
private static final java.lang.String DESCRIPTOR = "android.view.IMagnificationCallbacks";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.view.IMagnificationCallbacks interface,
 * generating a proxy if needed.
 */
public static android.view.IMagnificationCallbacks asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.view.IMagnificationCallbacks))) {
return ((android.view.IMagnificationCallbacks)iin);
}
return new android.view.IMagnificationCallbacks.Stub.Proxy(obj);
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
case TRANSACTION_onMagnifedBoundsChanged:
{
data.enforceInterface(DESCRIPTOR);
android.graphics.Region _arg0;
if ((0!=data.readInt())) {
_arg0 = android.graphics.Region.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onMagnifedBoundsChanged(_arg0);
return true;
}
case TRANSACTION_onRectangleOnScreenRequested:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.onRectangleOnScreenRequested(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_onRotationChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onRotationChanged(_arg0);
return true;
}
case TRANSACTION_onUserContextChanged:
{
data.enforceInterface(DESCRIPTOR);
this.onUserContextChanged();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.view.IMagnificationCallbacks
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
@Override public void onMagnifedBoundsChanged(android.graphics.Region bounds) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((bounds!=null)) {
_data.writeInt(1);
bounds.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onMagnifedBoundsChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onRectangleOnScreenRequested(int left, int top, int right, int bottom) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(left);
_data.writeInt(top);
_data.writeInt(right);
_data.writeInt(bottom);
mRemote.transact(Stub.TRANSACTION_onRectangleOnScreenRequested, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onRotationChanged(int rotation) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(rotation);
mRemote.transact(Stub.TRANSACTION_onRotationChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onUserContextChanged() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onUserContextChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onMagnifedBoundsChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onRectangleOnScreenRequested = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onRotationChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onUserContextChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public void onMagnifedBoundsChanged(android.graphics.Region bounds) throws android.os.RemoteException;
public void onRectangleOnScreenRequested(int left, int top, int right, int bottom) throws android.os.RemoteException;
public void onRotationChanged(int rotation) throws android.os.RemoteException;
public void onUserContextChanged() throws android.os.RemoteException;
}
