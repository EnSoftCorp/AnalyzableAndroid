/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/hardware/hdmi/IHdmiVendorCommandListener.aidl
 */
package android.hardware.hdmi;
/**
 * Callback interface definition for HDMI client to get the vendor-specific
 * commands.
 *
 * @hide
 */
public interface IHdmiVendorCommandListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.hdmi.IHdmiVendorCommandListener
{
private static final java.lang.String DESCRIPTOR = "android.hardware.hdmi.IHdmiVendorCommandListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.hdmi.IHdmiVendorCommandListener interface,
 * generating a proxy if needed.
 */
public static android.hardware.hdmi.IHdmiVendorCommandListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.hdmi.IHdmiVendorCommandListener))) {
return ((android.hardware.hdmi.IHdmiVendorCommandListener)iin);
}
return new android.hardware.hdmi.IHdmiVendorCommandListener.Stub.Proxy(obj);
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
case TRANSACTION_onReceived:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
byte[] _arg1;
_arg1 = data.createByteArray();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.onReceived(_arg0, _arg1, _arg2);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.hdmi.IHdmiVendorCommandListener
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
@Override public void onReceived(int logicalAddress, byte[] operands, boolean hasVendorId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(logicalAddress);
_data.writeByteArray(operands);
_data.writeInt(((hasVendorId)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onReceived, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void onReceived(int logicalAddress, byte[] operands, boolean hasVendorId) throws android.os.RemoteException;
}
