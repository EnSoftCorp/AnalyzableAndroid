/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/net/INetworkManagementEventObserver.aidl
 */
package android.net;
/**
 * Callback class for receiving events from an INetworkManagementService
 *
 * @hide
 */
public interface INetworkManagementEventObserver extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.INetworkManagementEventObserver
{
private static final java.lang.String DESCRIPTOR = "android.net.INetworkManagementEventObserver";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.INetworkManagementEventObserver interface,
 * generating a proxy if needed.
 */
public static android.net.INetworkManagementEventObserver asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.INetworkManagementEventObserver))) {
return ((android.net.INetworkManagementEventObserver)iin);
}
return new android.net.INetworkManagementEventObserver.Stub.Proxy(obj);
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
case TRANSACTION_interfaceStatusChanged:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.interfaceStatusChanged(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_interfaceLinkStateChanged:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.interfaceLinkStateChanged(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_interfaceAdded:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.interfaceAdded(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_interfaceRemoved:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.interfaceRemoved(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_addressUpdated:
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
this.addressUpdated(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_addressRemoved:
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
this.addressRemoved(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_limitReached:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.limitReached(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_interfaceClassDataActivityChanged:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.interfaceClassDataActivityChanged(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.net.INetworkManagementEventObserver
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
     * Interface configuration status has changed.
     *
     * @param iface The interface.
     * @param up True if the interface has been enabled.
     */
@Override public void interfaceStatusChanged(java.lang.String iface, boolean up) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iface);
_data.writeInt(((up)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_interfaceStatusChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Interface physical-layer link state has changed.  For Ethernet,
     * this method is invoked when the cable is plugged in or unplugged.
     *
     * @param iface The interface.
     * @param up  True if the physical link-layer connection signal is valid.
     */
@Override public void interfaceLinkStateChanged(java.lang.String iface, boolean up) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iface);
_data.writeInt(((up)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_interfaceLinkStateChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * An interface has been added to the system
     *
     * @param iface The interface.
     */
@Override public void interfaceAdded(java.lang.String iface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iface);
mRemote.transact(Stub.TRANSACTION_interfaceAdded, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * An interface has been removed from the system
     *
     * @param iface The interface.
     */
@Override public void interfaceRemoved(java.lang.String iface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iface);
mRemote.transact(Stub.TRANSACTION_interfaceRemoved, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * An interface address has been added or updated
     *
     * @param address The address.
     * @param iface The interface.
     * @param flags The address flags.
     * @param scope The address scope.
     */
@Override public void addressUpdated(java.lang.String address, java.lang.String iface, int flags, int scope) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeString(iface);
_data.writeInt(flags);
_data.writeInt(scope);
mRemote.transact(Stub.TRANSACTION_addressUpdated, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * An interface address has been removed
     *
     * @param address The address.
     * @param iface The interface.
     * @param flags The address flags.
     * @param scope The address scope.
     */
@Override public void addressRemoved(java.lang.String address, java.lang.String iface, int flags, int scope) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeString(iface);
_data.writeInt(flags);
_data.writeInt(scope);
mRemote.transact(Stub.TRANSACTION_addressRemoved, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * A networking quota limit has been reached. The quota might not
     * be specific to an interface.
     *
     * @param limitName The name of the limit that triggered.
     * @param iface The interface on which the limit was detected.
     */
@Override public void limitReached(java.lang.String limitName, java.lang.String iface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(limitName);
_data.writeString(iface);
mRemote.transact(Stub.TRANSACTION_limitReached, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Interface data activity status is changed.
     *
     * @param iface The interface.
     * @param active  True if the interface is actively transmitting data, false if it is idle.
     */
@Override public void interfaceClassDataActivityChanged(java.lang.String label, boolean active) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(label);
_data.writeInt(((active)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_interfaceClassDataActivityChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_interfaceStatusChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_interfaceLinkStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_interfaceAdded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_interfaceRemoved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_addressUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_addressRemoved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_limitReached = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_interfaceClassDataActivityChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
/**
     * Interface configuration status has changed.
     *
     * @param iface The interface.
     * @param up True if the interface has been enabled.
     */
public void interfaceStatusChanged(java.lang.String iface, boolean up) throws android.os.RemoteException;
/**
     * Interface physical-layer link state has changed.  For Ethernet,
     * this method is invoked when the cable is plugged in or unplugged.
     *
     * @param iface The interface.
     * @param up  True if the physical link-layer connection signal is valid.
     */
public void interfaceLinkStateChanged(java.lang.String iface, boolean up) throws android.os.RemoteException;
/**
     * An interface has been added to the system
     *
     * @param iface The interface.
     */
public void interfaceAdded(java.lang.String iface) throws android.os.RemoteException;
/**
     * An interface has been removed from the system
     *
     * @param iface The interface.
     */
public void interfaceRemoved(java.lang.String iface) throws android.os.RemoteException;
/**
     * An interface address has been added or updated
     *
     * @param address The address.
     * @param iface The interface.
     * @param flags The address flags.
     * @param scope The address scope.
     */
public void addressUpdated(java.lang.String address, java.lang.String iface, int flags, int scope) throws android.os.RemoteException;
/**
     * An interface address has been removed
     *
     * @param address The address.
     * @param iface The interface.
     * @param flags The address flags.
     * @param scope The address scope.
     */
public void addressRemoved(java.lang.String address, java.lang.String iface, int flags, int scope) throws android.os.RemoteException;
/**
     * A networking quota limit has been reached. The quota might not
     * be specific to an interface.
     *
     * @param limitName The name of the limit that triggered.
     * @param iface The interface on which the limit was detected.
     */
public void limitReached(java.lang.String limitName, java.lang.String iface) throws android.os.RemoteException;
/**
     * Interface data activity status is changed.
     *
     * @param iface The interface.
     * @param active  True if the interface is actively transmitting data, false if it is idle.
     */
public void interfaceClassDataActivityChanged(java.lang.String label, boolean active) throws android.os.RemoteException;
}
