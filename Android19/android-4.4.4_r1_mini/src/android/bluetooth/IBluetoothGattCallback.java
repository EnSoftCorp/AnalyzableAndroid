/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/bluetooth/IBluetoothGattCallback.aidl
 */
package android.bluetooth;
/**
 * Callback definitions for interacting with BLE / GATT
 * @hide
 */
public interface IBluetoothGattCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothGattCallback
{
private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothGattCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.bluetooth.IBluetoothGattCallback interface,
 * generating a proxy if needed.
 */
public static android.bluetooth.IBluetoothGattCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.bluetooth.IBluetoothGattCallback))) {
return ((android.bluetooth.IBluetoothGattCallback)iin);
}
return new android.bluetooth.IBluetoothGattCallback.Stub.Proxy(obj);
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
case TRANSACTION_onClientRegistered:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onClientRegistered(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_onClientConnectionState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
java.lang.String _arg3;
_arg3 = data.readString();
this.onClientConnectionState(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_onScanResult:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
byte[] _arg2;
_arg2 = data.createByteArray();
this.onScanResult(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_onGetService:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
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
this.onGetService(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_onGetIncludedService:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
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
int _arg4;
_arg4 = data.readInt();
int _arg5;
_arg5 = data.readInt();
android.os.ParcelUuid _arg6;
if ((0!=data.readInt())) {
_arg6 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg6 = null;
}
this.onGetIncludedService(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
reply.writeNoException();
return true;
}
case TRANSACTION_onGetCharacteristic:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
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
int _arg4;
_arg4 = data.readInt();
android.os.ParcelUuid _arg5;
if ((0!=data.readInt())) {
_arg5 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg5 = null;
}
int _arg6;
_arg6 = data.readInt();
this.onGetCharacteristic(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
reply.writeNoException();
return true;
}
case TRANSACTION_onGetDescriptor:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
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
int _arg4;
_arg4 = data.readInt();
android.os.ParcelUuid _arg5;
if ((0!=data.readInt())) {
_arg5 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg5 = null;
}
int _arg6;
_arg6 = data.readInt();
android.os.ParcelUuid _arg7;
if ((0!=data.readInt())) {
_arg7 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg7 = null;
}
this.onGetDescriptor(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
reply.writeNoException();
return true;
}
case TRANSACTION_onSearchComplete:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.onSearchComplete(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_onCharacteristicRead:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
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
int _arg5;
_arg5 = data.readInt();
android.os.ParcelUuid _arg6;
if ((0!=data.readInt())) {
_arg6 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg6 = null;
}
byte[] _arg7;
_arg7 = data.createByteArray();
this.onCharacteristicRead(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
reply.writeNoException();
return true;
}
case TRANSACTION_onCharacteristicWrite:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
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
int _arg5;
_arg5 = data.readInt();
android.os.ParcelUuid _arg6;
if ((0!=data.readInt())) {
_arg6 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg6 = null;
}
this.onCharacteristicWrite(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
reply.writeNoException();
return true;
}
case TRANSACTION_onExecuteWrite:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.onExecuteWrite(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_onDescriptorRead:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
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
byte[] _arg9;
_arg9 = data.createByteArray();
this.onDescriptorRead(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9);
reply.writeNoException();
return true;
}
case TRANSACTION_onDescriptorWrite:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
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
this.onDescriptorWrite(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8);
reply.writeNoException();
return true;
}
case TRANSACTION_onNotify:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
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
int _arg4;
_arg4 = data.readInt();
android.os.ParcelUuid _arg5;
if ((0!=data.readInt())) {
_arg5 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg5 = null;
}
byte[] _arg6;
_arg6 = data.createByteArray();
this.onNotify(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
reply.writeNoException();
return true;
}
case TRANSACTION_onReadRemoteRssi:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.onReadRemoteRssi(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_onAdvertiseStateChange:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onAdvertiseStateChange(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.bluetooth.IBluetoothGattCallback
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
@Override public void onClientRegistered(int status, int clientIf) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
_data.writeInt(clientIf);
mRemote.transact(Stub.TRANSACTION_onClientRegistered, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onClientConnectionState(int status, int clientIf, boolean connected, java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
_data.writeInt(clientIf);
_data.writeInt(((connected)?(1):(0)));
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_onClientConnectionState, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onScanResult(java.lang.String address, int rssi, byte[] advData) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(rssi);
_data.writeByteArray(advData);
mRemote.transact(Stub.TRANSACTION_onScanResult, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onGetService(java.lang.String address, int srvcType, int srvcInstId, android.os.ParcelUuid srvcUuid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(srvcType);
_data.writeInt(srvcInstId);
if ((srvcUuid!=null)) {
_data.writeInt(1);
srvcUuid.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onGetService, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onGetIncludedService(java.lang.String address, int srvcType, int srvcInstId, android.os.ParcelUuid srvcUuid, int inclSrvcType, int inclSrvcInstId, android.os.ParcelUuid inclSrvcUuid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(srvcType);
_data.writeInt(srvcInstId);
if ((srvcUuid!=null)) {
_data.writeInt(1);
srvcUuid.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(inclSrvcType);
_data.writeInt(inclSrvcInstId);
if ((inclSrvcUuid!=null)) {
_data.writeInt(1);
inclSrvcUuid.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onGetIncludedService, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onGetCharacteristic(java.lang.String address, int srvcType, int srvcInstId, android.os.ParcelUuid srvcUuid, int charInstId, android.os.ParcelUuid charUuid, int charProps) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(srvcType);
_data.writeInt(srvcInstId);
if ((srvcUuid!=null)) {
_data.writeInt(1);
srvcUuid.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(charInstId);
if ((charUuid!=null)) {
_data.writeInt(1);
charUuid.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(charProps);
mRemote.transact(Stub.TRANSACTION_onGetCharacteristic, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onGetDescriptor(java.lang.String address, int srvcType, int srvcInstId, android.os.ParcelUuid srvcUuid, int charInstId, android.os.ParcelUuid charUuid, int descrInstId, android.os.ParcelUuid descrUuid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(srvcType);
_data.writeInt(srvcInstId);
if ((srvcUuid!=null)) {
_data.writeInt(1);
srvcUuid.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(charInstId);
if ((charUuid!=null)) {
_data.writeInt(1);
charUuid.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(descrInstId);
if ((descrUuid!=null)) {
_data.writeInt(1);
descrUuid.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onGetDescriptor, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onSearchComplete(java.lang.String address, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onSearchComplete, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onCharacteristicRead(java.lang.String address, int status, int srvcType, int srvcInstId, android.os.ParcelUuid srvcUuid, int charInstId, android.os.ParcelUuid charUuid, byte[] value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(status);
_data.writeInt(srvcType);
_data.writeInt(srvcInstId);
if ((srvcUuid!=null)) {
_data.writeInt(1);
srvcUuid.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(charInstId);
if ((charUuid!=null)) {
_data.writeInt(1);
charUuid.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeByteArray(value);
mRemote.transact(Stub.TRANSACTION_onCharacteristicRead, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onCharacteristicWrite(java.lang.String address, int status, int srvcType, int srvcInstId, android.os.ParcelUuid srvcUuid, int charInstId, android.os.ParcelUuid charUuid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(status);
_data.writeInt(srvcType);
_data.writeInt(srvcInstId);
if ((srvcUuid!=null)) {
_data.writeInt(1);
srvcUuid.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(charInstId);
if ((charUuid!=null)) {
_data.writeInt(1);
charUuid.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onCharacteristicWrite, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onExecuteWrite(java.lang.String address, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onExecuteWrite, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onDescriptorRead(java.lang.String address, int status, int srvcType, int srvcInstId, android.os.ParcelUuid srvcUuid, int charInstId, android.os.ParcelUuid charUuid, int descrInstId, android.os.ParcelUuid descrUuid, byte[] value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(status);
_data.writeInt(srvcType);
_data.writeInt(srvcInstId);
if ((srvcUuid!=null)) {
_data.writeInt(1);
srvcUuid.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(charInstId);
if ((charUuid!=null)) {
_data.writeInt(1);
charUuid.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(descrInstId);
if ((descrUuid!=null)) {
_data.writeInt(1);
descrUuid.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeByteArray(value);
mRemote.transact(Stub.TRANSACTION_onDescriptorRead, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onDescriptorWrite(java.lang.String address, int status, int srvcType, int srvcInstId, android.os.ParcelUuid srvcUuid, int charInstId, android.os.ParcelUuid charUuid, int descrInstId, android.os.ParcelUuid descrUuid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(status);
_data.writeInt(srvcType);
_data.writeInt(srvcInstId);
if ((srvcUuid!=null)) {
_data.writeInt(1);
srvcUuid.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(charInstId);
if ((charUuid!=null)) {
_data.writeInt(1);
charUuid.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(descrInstId);
if ((descrUuid!=null)) {
_data.writeInt(1);
descrUuid.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onDescriptorWrite, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onNotify(java.lang.String address, int srvcType, int srvcInstId, android.os.ParcelUuid srvcUuid, int charInstId, android.os.ParcelUuid charUuid, byte[] value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(srvcType);
_data.writeInt(srvcInstId);
if ((srvcUuid!=null)) {
_data.writeInt(1);
srvcUuid.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(charInstId);
if ((charUuid!=null)) {
_data.writeInt(1);
charUuid.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeByteArray(value);
mRemote.transact(Stub.TRANSACTION_onNotify, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onReadRemoteRssi(java.lang.String address, int rssi, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
_data.writeInt(rssi);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onReadRemoteRssi, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onAdvertiseStateChange(int advertiseState, int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(advertiseState);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_onAdvertiseStateChange, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onClientRegistered = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onClientConnectionState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onScanResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onGetService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onGetIncludedService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onGetCharacteristic = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onGetDescriptor = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_onSearchComplete = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_onCharacteristicRead = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_onCharacteristicWrite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_onExecuteWrite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_onDescriptorRead = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_onDescriptorWrite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_onNotify = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_onReadRemoteRssi = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_onAdvertiseStateChange = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
}
public void onClientRegistered(int status, int clientIf) throws android.os.RemoteException;
public void onClientConnectionState(int status, int clientIf, boolean connected, java.lang.String address) throws android.os.RemoteException;
public void onScanResult(java.lang.String address, int rssi, byte[] advData) throws android.os.RemoteException;
public void onGetService(java.lang.String address, int srvcType, int srvcInstId, android.os.ParcelUuid srvcUuid) throws android.os.RemoteException;
public void onGetIncludedService(java.lang.String address, int srvcType, int srvcInstId, android.os.ParcelUuid srvcUuid, int inclSrvcType, int inclSrvcInstId, android.os.ParcelUuid inclSrvcUuid) throws android.os.RemoteException;
public void onGetCharacteristic(java.lang.String address, int srvcType, int srvcInstId, android.os.ParcelUuid srvcUuid, int charInstId, android.os.ParcelUuid charUuid, int charProps) throws android.os.RemoteException;
public void onGetDescriptor(java.lang.String address, int srvcType, int srvcInstId, android.os.ParcelUuid srvcUuid, int charInstId, android.os.ParcelUuid charUuid, int descrInstId, android.os.ParcelUuid descrUuid) throws android.os.RemoteException;
public void onSearchComplete(java.lang.String address, int status) throws android.os.RemoteException;
public void onCharacteristicRead(java.lang.String address, int status, int srvcType, int srvcInstId, android.os.ParcelUuid srvcUuid, int charInstId, android.os.ParcelUuid charUuid, byte[] value) throws android.os.RemoteException;
public void onCharacteristicWrite(java.lang.String address, int status, int srvcType, int srvcInstId, android.os.ParcelUuid srvcUuid, int charInstId, android.os.ParcelUuid charUuid) throws android.os.RemoteException;
public void onExecuteWrite(java.lang.String address, int status) throws android.os.RemoteException;
public void onDescriptorRead(java.lang.String address, int status, int srvcType, int srvcInstId, android.os.ParcelUuid srvcUuid, int charInstId, android.os.ParcelUuid charUuid, int descrInstId, android.os.ParcelUuid descrUuid, byte[] value) throws android.os.RemoteException;
public void onDescriptorWrite(java.lang.String address, int status, int srvcType, int srvcInstId, android.os.ParcelUuid srvcUuid, int charInstId, android.os.ParcelUuid charUuid, int descrInstId, android.os.ParcelUuid descrUuid) throws android.os.RemoteException;
public void onNotify(java.lang.String address, int srvcType, int srvcInstId, android.os.ParcelUuid srvcUuid, int charInstId, android.os.ParcelUuid charUuid, byte[] value) throws android.os.RemoteException;
public void onReadRemoteRssi(java.lang.String address, int rssi, int status) throws android.os.RemoteException;
public void onAdvertiseStateChange(int advertiseState, int status) throws android.os.RemoteException;
}
