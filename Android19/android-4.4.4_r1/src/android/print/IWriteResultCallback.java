/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/print/IWriteResultCallback.aidl
 */
package android.print;
/**
 * Callback for observing the result of android.print.DocuemntAdapter#onWrite.
 *
 * @hide
 */
public interface IWriteResultCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.print.IWriteResultCallback
{
private static final java.lang.String DESCRIPTOR = "android.print.IWriteResultCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.print.IWriteResultCallback interface,
 * generating a proxy if needed.
 */
public static android.print.IWriteResultCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.print.IWriteResultCallback))) {
return ((android.print.IWriteResultCallback)iin);
}
return new android.print.IWriteResultCallback.Stub.Proxy(obj);
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
case TRANSACTION_onWriteFinished:
{
data.enforceInterface(DESCRIPTOR);
android.print.PageRange[] _arg0;
_arg0 = data.createTypedArray(android.print.PageRange.CREATOR);
int _arg1;
_arg1 = data.readInt();
this.onWriteFinished(_arg0, _arg1);
return true;
}
case TRANSACTION_onWriteFailed:
{
data.enforceInterface(DESCRIPTOR);
java.lang.CharSequence _arg0;
if ((0!=data.readInt())) {
_arg0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.onWriteFailed(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.print.IWriteResultCallback
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
@Override public void onWriteFinished(android.print.PageRange[] pages, int sequence) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedArray(pages, 0);
_data.writeInt(sequence);
mRemote.transact(Stub.TRANSACTION_onWriteFinished, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onWriteFailed(java.lang.CharSequence error, int sequence) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((error!=null)) {
_data.writeInt(1);
android.text.TextUtils.writeToParcel(error, _data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(sequence);
mRemote.transact(Stub.TRANSACTION_onWriteFailed, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onWriteFinished = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onWriteFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void onWriteFinished(android.print.PageRange[] pages, int sequence) throws android.os.RemoteException;
public void onWriteFailed(java.lang.CharSequence error, int sequence) throws android.os.RemoteException;
}
