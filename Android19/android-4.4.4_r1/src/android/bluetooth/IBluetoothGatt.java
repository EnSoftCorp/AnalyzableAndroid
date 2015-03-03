/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/bluetooth/IBluetoothGatt.aidl
 */
package android.bluetooth;
/**
 * API for interacting with BLE / GATT
 * @hide
 */
public interface IBluetoothGatt extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothGatt
{
private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothGatt";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.bluetooth.IBluetoothGatt interface,
 * generating a proxy if needed.
 */
public static android.bluetooth.IBluetoothGatt asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.bluetooth.IBluetoothGatt))) {
return ((android.bluetooth.IBluetoothGatt)iin);
}
return new android.bluetooth.IBluetoothGatt.Stub.Proxy(obj);
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
case TRANSACTION_getDevicesMatchingConnectionStates:
{
data.enforceInterface(DESCRIPTOR);
int[] _arg0;
_arg0 = data.createIntArray();
java.util.List<android.bluetooth.BluetoothDevice> _result = this.getDevicesMatchingConnectionStates(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_startScan:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.startScan(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_startScanWithUuids:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
android.os.ParcelUuid[] _arg2;
_arg2 = data.createTypedArray(android.os.ParcelUuid.CREATOR);
this.startScanWithUuids(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_stopScan:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.stopScan(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_registerClient:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelUuid _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.bluetooth.IBluetoothGattCallback _arg1;
_arg1 = android.bluetooth.IBluetoothGattCallback.Stub.asInterface(data.readStrongBinder());
this.registerClient(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterClient:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.unregisterClient(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_clientConnect:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.clientConnect(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_clientDisconnect:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.clientDisconnect(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_startAdvertising:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.startAdvertising(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_stopAdvertising:
{
data.enforceInterface(DESCRIPTOR);
this.stopAdvertising();
reply.writeNoException();
return true;
}
case TRANSACTION_setAdvServiceData:
{
data.enforceInterface(DESCRIPTOR);
byte[] _arg0;
_arg0 = data.createByteArray();
boolean _result = this.setAdvServiceData(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getAdvServiceData:
{
data.enforceInterface(DESCRIPTOR);
byte[] _result = this.getAdvServiceData();
reply.writeNoException();
reply.writeByteArray(_result);
return true;
}
case TRANSACTION_setAdvManufacturerCodeAndData:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
byte[] _arg1;
_arg1 = data.createByteArray();
boolean _result = this.setAdvManufacturerCodeAndData(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getAdvManufacturerData:
{
data.enforceInterface(DESCRIPTOR);
byte[] _result = this.getAdvManufacturerData();
reply.writeNoException();
reply.writeByteArray(_result);
return true;
}
case TRANSACTION_getAdvServiceUuids:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.os.ParcelUuid> _result = this.getAdvServiceUuids();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_removeAdvManufacturerCodeAndData:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.removeAdvManufacturerCodeAndData(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isAdvertising:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isAdvertising();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_refreshDevice:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.refreshDevice(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_discoverServices:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.discoverServices(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_readCharacteristic:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
android.os.ParcelUuid _arg4;
if ((0!=data.readInt())) {
_arg4 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
int _arg5;
_arg5 = data.readInt();
android.os.ParcelUuid _arg6;
if ((0!=data.readInt())) {
_arg6 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg6 = null;
}
int _arg7;
_arg7 = data.readInt();
this.readCharacteristic(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
reply.writeNoException();
return true;
}
case TRANSACTION_writeCharacteristic:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
android.os.ParcelUuid _arg4;
if ((0!=data.readInt())) {
_arg4 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
int _arg5;
_arg5 = data.readInt();
android.os.ParcelUuid _arg6;
if ((0!=data.readInt())) {
_arg6 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg6 = null;
}
int _arg7;
_arg7 = data.readInt();
int _arg8;
_arg8 = data.readInt();
byte[] _arg9;
_arg9 = data.createByteArray();
this.writeCharacteristic(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9);
reply.writeNoException();
return true;
}
case TRANSACTION_readDescriptor:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
android.os.ParcelUuid _arg4;
if ((0!=data.readInt())) {
_arg4 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
int _arg5;
_arg5 = data.readInt();
android.os.ParcelUuid _arg6;
if ((0!=data.readInt())) {
_arg6 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg6 = null;
}
int _arg7;
_arg7 = data.readInt();
android.os.ParcelUuid _arg8;
if ((0!=data.readInt())) {
_arg8 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg8 = null;
}
int _arg9;
_arg9 = data.readInt();
this.readDescriptor(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9);
reply.writeNoException();
return true;
}
case TRANSACTION_writeDescriptor:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
android.os.ParcelUuid _arg4;
if ((0!=data.readInt())) {
_arg4 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
int _arg5;
_arg5 = data.readInt();
android.os.ParcelUuid _arg6;
if ((0!=data.readInt())) {
_arg6 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg6 = null;
}
int _arg7;
_arg7 = data.readInt();
android.os.ParcelUuid _arg8;
if ((0!=data.readInt())) {
_arg8 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg8 = null;
}
int _arg9;
_arg9 = data.readInt();
int _arg10;
_arg10 = data.readInt();
byte[] _arg11;
_arg11 = data.createByteArray();
this.writeDescriptor(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9, _arg10, _arg11);
reply.writeNoException();
return true;
}
case TRANSACTION_registerForNotification:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
android.os.ParcelUuid _arg4;
if ((0!=data.readInt())) {
_arg4 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
int _arg5;
_arg5 = data.readInt();
android.os.ParcelUuid _arg6;
if ((0!=data.readInt())) {
_arg6 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg6 = null;
}
boolean _arg7;
_arg7 = (0!=data.readInt());
this.registerForNotification(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
reply.writeNoException();
return true;
}
case TRANSACTION_beginReliableWrite:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.beginReliableWrite(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_endReliableWrite:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.endReliableWrite(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_readRemoteRssi:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.readRemoteRssi(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_registerServer:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelUuid _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.bluetooth.IBluetoothGattServerCallback _arg1;
_arg1 = android.bluetooth.IBluetoothGattServerCallback.Stub.asInterface(data.readStrongBinder());
this.registerServer(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterServer:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.unregisterServer(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_serverConnect:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.serverConnect(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_serverDisconnect:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.serverDisconnect(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_beginServiceDeclaration:
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
android.os.ParcelUuid _arg4;
if ((0!=data.readInt())) {
_arg4 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
boolean _arg5;
_arg5 = (0!=data.readInt());
this.beginServiceDeclaration(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
case TRANSACTION_addIncludedService:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
android.os.ParcelUuid _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
this.addIncludedService(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_addCharacteristic:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.os.ParcelUuid _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.addCharacteristic(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_addDescriptor:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.os.ParcelUuid _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
this.addDescriptor(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_endServiceDeclaration:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.endServiceDeclaration(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_removeService:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
android.os.ParcelUuid _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
this.removeService(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_clearServices:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.clearServices(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_sendResponse:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
byte[] _arg5;
_arg5 = data.createByteArray();
this.sendResponse(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
case TRANSACTION_sendNotification:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
android.os.ParcelUuid _arg4;
if ((0!=data.readInt())) {
_arg4 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
int _arg5;
_arg5 = data.readInt();
android.os.ParcelUuid _arg6;
if ((0!=data.readInt())) {
_arg6 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg6 = null;
}
boolean _arg7;
_arg7 = (0!=data.readInt());
byte[] _arg8;
_arg8 = data.createByteArray();
this.sendNotification(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.bluetooth.IBluetoothGatt
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
@Override public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] states) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.bluetooth.BluetoothDevice> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeIntArray(states);
mRemote.transact(Stub.TRANSACTION_getDevicesMatchingConnectionStates, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.bluetooth.BluetoothDevice.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void startScan(int appIf, boolean isServer) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(appIf);
_data.writeInt(((isServer)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_startScan, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void startScanWithUuids(int appIf, boolean isServer, android.os.ParcelUuid[] ids) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(appIf);
_data.writeInt(((isServer)?(1):(0)));
_data.writeTypedArray(ids, 0);
mRemote.transact(Stub.TRANSACTION_startScanWithUuids, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stopScan(int appIf, boolean isServer) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(appIf);
_data.writeInt(((isServer)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_stopScan, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void registerClient(android.os.ParcelUuid appId, android.bluetooth.IBluetoothGattCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((appId!=null)) {
_data.writeInt(1);
appId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerClient, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterClient(int clientIf) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
mRemote.transact(Stub.TRANSACTION_unregisterClient, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clientConnect(int clientIf, java.lang.String address, boolean isDirect) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
_data.writeInt(((isDirect)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_clientConnect, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clientDisconnect(int clientIf, java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_clientDisconnect, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void startAdvertising(int appIf) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(appIf);
mRemote.transact(Stub.TRANSACTION_startAdvertising, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stopAdvertising() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopAdvertising, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean setAdvServiceData(byte[] serviceData) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(serviceData);
mRemote.transact(Stub.TRANSACTION_setAdvServiceData, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public byte[] getAdvServiceData() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
byte[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAdvServiceData, _data, _reply, 0);
_reply.readException();
_result = _reply.createByteArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setAdvManufacturerCodeAndData(int manufactureCode, byte[] manufacturerData) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(manufactureCode);
_data.writeByteArray(manufacturerData);
mRemote.transact(Stub.TRANSACTION_setAdvManufacturerCodeAndData, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public byte[] getAdvManufacturerData() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
byte[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAdvManufacturerData, _data, _reply, 0);
_reply.readException();
_result = _reply.createByteArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.os.ParcelUuid> getAdvServiceUuids() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.os.ParcelUuid> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAdvServiceUuids, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.os.ParcelUuid.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void removeAdvManufacturerCodeAndData(int manufacturerCode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(manufacturerCode);
mRemote.transact(Stub.TRANSACTION_removeAdvManufacturerCodeAndData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isAdvertising() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isAdvertising, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void refreshDevice(int clientIf, java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_refreshDevice, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void discoverServices(int clientIf, java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_discoverServices, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void readCharacteristic(int clientIf, java.lang.String address, int srvcType, int srvcInstanceId, android.os.ParcelUuid srvcId, int charInstanceId, android.os.ParcelUuid charId, int authReq) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
_data.writeInt(srvcType);
_data.writeInt(srvcInstanceId);
if ((srvcId!=null)) {
_data.writeInt(1);
srvcId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(charInstanceId);
if ((charId!=null)) {
_data.writeInt(1);
charId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(authReq);
mRemote.transact(Stub.TRANSACTION_readCharacteristic, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void writeCharacteristic(int clientIf, java.lang.String address, int srvcType, int srvcInstanceId, android.os.ParcelUuid srvcId, int charInstanceId, android.os.ParcelUuid charId, int writeType, int authReq, byte[] value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
_data.writeInt(srvcType);
_data.writeInt(srvcInstanceId);
if ((srvcId!=null)) {
_data.writeInt(1);
srvcId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(charInstanceId);
if ((charId!=null)) {
_data.writeInt(1);
charId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(writeType);
_data.writeInt(authReq);
_data.writeByteArray(value);
mRemote.transact(Stub.TRANSACTION_writeCharacteristic, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void readDescriptor(int clientIf, java.lang.String address, int srvcType, int srvcInstanceId, android.os.ParcelUuid srvcId, int charInstanceId, android.os.ParcelUuid charId, int descrInstanceId, android.os.ParcelUuid descrUuid, int authReq) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
_data.writeInt(srvcType);
_data.writeInt(srvcInstanceId);
if ((srvcId!=null)) {
_data.writeInt(1);
srvcId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(charInstanceId);
if ((charId!=null)) {
_data.writeInt(1);
charId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(descrInstanceId);
if ((descrUuid!=null)) {
_data.writeInt(1);
descrUuid.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(authReq);
mRemote.transact(Stub.TRANSACTION_readDescriptor, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void writeDescriptor(int clientIf, java.lang.String address, int srvcType, int srvcInstanceId, android.os.ParcelUuid srvcId, int charInstanceId, android.os.ParcelUuid charId, int descrInstanceId, android.os.ParcelUuid descrId, int writeType, int authReq, byte[] value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
_data.writeInt(srvcType);
_data.writeInt(srvcInstanceId);
if ((srvcId!=null)) {
_data.writeInt(1);
srvcId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(charInstanceId);
if ((charId!=null)) {
_data.writeInt(1);
charId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(descrInstanceId);
if ((descrId!=null)) {
_data.writeInt(1);
descrId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(writeType);
_data.writeInt(authReq);
_data.writeByteArray(value);
mRemote.transact(Stub.TRANSACTION_writeDescriptor, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void registerForNotification(int clientIf, java.lang.String address, int srvcType, int srvcInstanceId, android.os.ParcelUuid srvcId, int charInstanceId, android.os.ParcelUuid charId, boolean enable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
_data.writeInt(srvcType);
_data.writeInt(srvcInstanceId);
if ((srvcId!=null)) {
_data.writeInt(1);
srvcId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(charInstanceId);
if ((charId!=null)) {
_data.writeInt(1);
charId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((enable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_registerForNotification, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void beginReliableWrite(int clientIf, java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_beginReliableWrite, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void endReliableWrite(int clientIf, java.lang.String address, boolean execute) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
_data.writeInt(((execute)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_endReliableWrite, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void readRemoteRssi(int clientIf, java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(clientIf);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_readRemoteRssi, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void registerServer(android.os.ParcelUuid appId, android.bluetooth.IBluetoothGattServerCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((appId!=null)) {
_data.writeInt(1);
appId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerServer, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterServer(int serverIf) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(serverIf);
mRemote.transact(Stub.TRANSACTION_unregisterServer, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void serverConnect(int servertIf, java.lang.String address, boolean isDirect) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(servertIf);
_data.writeString(address);
_data.writeInt(((isDirect)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_serverConnect, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void serverDisconnect(int serverIf, java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(serverIf);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_serverDisconnect, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void beginServiceDeclaration(int serverIf, int srvcType, int srvcInstanceId, int minHandles, android.os.ParcelUuid srvcId, boolean advertisePreferred) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(serverIf);
_data.writeInt(srvcType);
_data.writeInt(srvcInstanceId);
_data.writeInt(minHandles);
if ((srvcId!=null)) {
_data.writeInt(1);
srvcId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((advertisePreferred)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_beginServiceDeclaration, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void addIncludedService(int serverIf, int srvcType, int srvcInstanceId, android.os.ParcelUuid srvcId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(serverIf);
_data.writeInt(srvcType);
_data.writeInt(srvcInstanceId);
if ((srvcId!=null)) {
_data.writeInt(1);
srvcId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addIncludedService, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void addCharacteristic(int serverIf, android.os.ParcelUuid charId, int properties, int permissions) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(serverIf);
if ((charId!=null)) {
_data.writeInt(1);
charId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(properties);
_data.writeInt(permissions);
mRemote.transact(Stub.TRANSACTION_addCharacteristic, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void addDescriptor(int serverIf, android.os.ParcelUuid descId, int permissions) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(serverIf);
if ((descId!=null)) {
_data.writeInt(1);
descId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(permissions);
mRemote.transact(Stub.TRANSACTION_addDescriptor, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void endServiceDeclaration(int serverIf) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(serverIf);
mRemote.transact(Stub.TRANSACTION_endServiceDeclaration, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removeService(int serverIf, int srvcType, int srvcInstanceId, android.os.ParcelUuid srvcId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(serverIf);
_data.writeInt(srvcType);
_data.writeInt(srvcInstanceId);
if ((srvcId!=null)) {
_data.writeInt(1);
srvcId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_removeService, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clearServices(int serverIf) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(serverIf);
mRemote.transact(Stub.TRANSACTION_clearServices, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void sendResponse(int serverIf, java.lang.String address, int requestId, int status, int offset, byte[] value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(serverIf);
_data.writeString(address);
_data.writeInt(requestId);
_data.writeInt(status);
_data.writeInt(offset);
_data.writeByteArray(value);
mRemote.transact(Stub.TRANSACTION_sendResponse, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void sendNotification(int serverIf, java.lang.String address, int srvcType, int srvcInstanceId, android.os.ParcelUuid srvcId, int charInstanceId, android.os.ParcelUuid charId, boolean confirm, byte[] value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(serverIf);
_data.writeString(address);
_data.writeInt(srvcType);
_data.writeInt(srvcInstanceId);
if ((srvcId!=null)) {
_data.writeInt(1);
srvcId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(charInstanceId);
if ((charId!=null)) {
_data.writeInt(1);
charId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((confirm)?(1):(0)));
_data.writeByteArray(value);
mRemote.transact(Stub.TRANSACTION_sendNotification, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getDevicesMatchingConnectionStates = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_startScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_startScanWithUuids = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_stopScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_registerClient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_unregisterClient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_clientConnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_clientDisconnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_startAdvertising = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_stopAdvertising = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_setAdvServiceData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getAdvServiceData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_setAdvManufacturerCodeAndData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_getAdvManufacturerData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_getAdvServiceUuids = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_removeAdvManufacturerCodeAndData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_isAdvertising = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_refreshDevice = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_discoverServices = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_readCharacteristic = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_writeCharacteristic = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_readDescriptor = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_writeDescriptor = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_registerForNotification = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_beginReliableWrite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_endReliableWrite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_readRemoteRssi = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_registerServer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_unregisterServer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_serverConnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_serverDisconnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_beginServiceDeclaration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_addIncludedService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_addCharacteristic = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
static final int TRANSACTION_addDescriptor = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
static final int TRANSACTION_endServiceDeclaration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
static final int TRANSACTION_removeService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
static final int TRANSACTION_clearServices = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
static final int TRANSACTION_sendResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
static final int TRANSACTION_sendNotification = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
}
public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] states) throws android.os.RemoteException;
public void startScan(int appIf, boolean isServer) throws android.os.RemoteException;
public void startScanWithUuids(int appIf, boolean isServer, android.os.ParcelUuid[] ids) throws android.os.RemoteException;
public void stopScan(int appIf, boolean isServer) throws android.os.RemoteException;
public void registerClient(android.os.ParcelUuid appId, android.bluetooth.IBluetoothGattCallback callback) throws android.os.RemoteException;
public void unregisterClient(int clientIf) throws android.os.RemoteException;
public void clientConnect(int clientIf, java.lang.String address, boolean isDirect) throws android.os.RemoteException;
public void clientDisconnect(int clientIf, java.lang.String address) throws android.os.RemoteException;
public void startAdvertising(int appIf) throws android.os.RemoteException;
public void stopAdvertising() throws android.os.RemoteException;
public boolean setAdvServiceData(byte[] serviceData) throws android.os.RemoteException;
public byte[] getAdvServiceData() throws android.os.RemoteException;
public boolean setAdvManufacturerCodeAndData(int manufactureCode, byte[] manufacturerData) throws android.os.RemoteException;
public byte[] getAdvManufacturerData() throws android.os.RemoteException;
public java.util.List<android.os.ParcelUuid> getAdvServiceUuids() throws android.os.RemoteException;
public void removeAdvManufacturerCodeAndData(int manufacturerCode) throws android.os.RemoteException;
public boolean isAdvertising() throws android.os.RemoteException;
public void refreshDevice(int clientIf, java.lang.String address) throws android.os.RemoteException;
public void discoverServices(int clientIf, java.lang.String address) throws android.os.RemoteException;
public void readCharacteristic(int clientIf, java.lang.String address, int srvcType, int srvcInstanceId, android.os.ParcelUuid srvcId, int charInstanceId, android.os.ParcelUuid charId, int authReq) throws android.os.RemoteException;
public void writeCharacteristic(int clientIf, java.lang.String address, int srvcType, int srvcInstanceId, android.os.ParcelUuid srvcId, int charInstanceId, android.os.ParcelUuid charId, int writeType, int authReq, byte[] value) throws android.os.RemoteException;
public void readDescriptor(int clientIf, java.lang.String address, int srvcType, int srvcInstanceId, android.os.ParcelUuid srvcId, int charInstanceId, android.os.ParcelUuid charId, int descrInstanceId, android.os.ParcelUuid descrUuid, int authReq) throws android.os.RemoteException;
public void writeDescriptor(int clientIf, java.lang.String address, int srvcType, int srvcInstanceId, android.os.ParcelUuid srvcId, int charInstanceId, android.os.ParcelUuid charId, int descrInstanceId, android.os.ParcelUuid descrId, int writeType, int authReq, byte[] value) throws android.os.RemoteException;
public void registerForNotification(int clientIf, java.lang.String address, int srvcType, int srvcInstanceId, android.os.ParcelUuid srvcId, int charInstanceId, android.os.ParcelUuid charId, boolean enable) throws android.os.RemoteException;
public void beginReliableWrite(int clientIf, java.lang.String address) throws android.os.RemoteException;
public void endReliableWrite(int clientIf, java.lang.String address, boolean execute) throws android.os.RemoteException;
public void readRemoteRssi(int clientIf, java.lang.String address) throws android.os.RemoteException;
public void registerServer(android.os.ParcelUuid appId, android.bluetooth.IBluetoothGattServerCallback callback) throws android.os.RemoteException;
public void unregisterServer(int serverIf) throws android.os.RemoteException;
public void serverConnect(int servertIf, java.lang.String address, boolean isDirect) throws android.os.RemoteException;
public void serverDisconnect(int serverIf, java.lang.String address) throws android.os.RemoteException;
public void beginServiceDeclaration(int serverIf, int srvcType, int srvcInstanceId, int minHandles, android.os.ParcelUuid srvcId, boolean advertisePreferred) throws android.os.RemoteException;
public void addIncludedService(int serverIf, int srvcType, int srvcInstanceId, android.os.ParcelUuid srvcId) throws android.os.RemoteException;
public void addCharacteristic(int serverIf, android.os.ParcelUuid charId, int properties, int permissions) throws android.os.RemoteException;
public void addDescriptor(int serverIf, android.os.ParcelUuid descId, int permissions) throws android.os.RemoteException;
public void endServiceDeclaration(int serverIf) throws android.os.RemoteException;
public void removeService(int serverIf, int srvcType, int srvcInstanceId, android.os.ParcelUuid srvcId) throws android.os.RemoteException;
public void clearServices(int serverIf) throws android.os.RemoteException;
public void sendResponse(int serverIf, java.lang.String address, int requestId, int status, int offset, byte[] value) throws android.os.RemoteException;
public void sendNotification(int serverIf, java.lang.String address, int srvcType, int srvcInstanceId, android.os.ParcelUuid srvcId, int charInstanceId, android.os.ParcelUuid charId, boolean confirm, byte[] value) throws android.os.RemoteException;
}
