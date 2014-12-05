/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/hardware/location/IGeofenceHardwareMonitorCallback.aidl
 */
package android.hardware.location;
/** @hide */
public interface IGeofenceHardwareMonitorCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.location.IGeofenceHardwareMonitorCallback
{
private static final java.lang.String DESCRIPTOR = "android.hardware.location.IGeofenceHardwareMonitorCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.location.IGeofenceHardwareMonitorCallback interface,
 * generating a proxy if needed.
 */
public static android.hardware.location.IGeofenceHardwareMonitorCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.location.IGeofenceHardwareMonitorCallback))) {
return ((android.hardware.location.IGeofenceHardwareMonitorCallback)iin);
}
return new android.hardware.location.IGeofenceHardwareMonitorCallback.Stub.Proxy(obj);
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
case TRANSACTION_onMonitoringSystemChange:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
android.location.Location _arg2;
if ((0!=data.readInt())) {
_arg2 = android.location.Location.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.onMonitoringSystemChange(_arg0, _arg1, _arg2);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.location.IGeofenceHardwareMonitorCallback
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
@Override public void onMonitoringSystemChange(int monitoringType, boolean available, android.location.Location location) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(monitoringType);
_data.writeInt(((available)?(1):(0)));
if ((location!=null)) {
_data.writeInt(1);
location.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onMonitoringSystemChange, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onMonitoringSystemChange = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void onMonitoringSystemChange(int monitoringType, boolean available, android.location.Location location) throws android.os.RemoteException;
}
