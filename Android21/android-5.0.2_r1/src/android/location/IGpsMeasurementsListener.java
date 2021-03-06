/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/location/java/android/location/IGpsMeasurementsListener.aidl
 */
package android.location;
/**
 * {@hide}
 */
public interface IGpsMeasurementsListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.location.IGpsMeasurementsListener
{
private static final java.lang.String DESCRIPTOR = "android.location.IGpsMeasurementsListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.location.IGpsMeasurementsListener interface,
 * generating a proxy if needed.
 */
public static android.location.IGpsMeasurementsListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.location.IGpsMeasurementsListener))) {
return ((android.location.IGpsMeasurementsListener)iin);
}
return new android.location.IGpsMeasurementsListener.Stub.Proxy(obj);
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
case TRANSACTION_onGpsMeasurementsReceived:
{
data.enforceInterface(DESCRIPTOR);
android.location.GpsMeasurementsEvent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.location.GpsMeasurementsEvent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onGpsMeasurementsReceived(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.location.IGpsMeasurementsListener
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
@Override public void onGpsMeasurementsReceived(android.location.GpsMeasurementsEvent event) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_onGpsMeasurementsReceived, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onGpsMeasurementsReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void onGpsMeasurementsReceived(android.location.GpsMeasurementsEvent event) throws android.os.RemoteException;
}
