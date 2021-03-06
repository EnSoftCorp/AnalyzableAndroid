/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/apps/Email/emailcommon/src/com/android/emailcommon/service/IEmailService.aidl
 */
package com.android.emailcommon.service;
public interface IEmailService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.emailcommon.service.IEmailService
{
private static final java.lang.String DESCRIPTOR = "com.android.emailcommon.service.IEmailService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.emailcommon.service.IEmailService interface,
 * generating a proxy if needed.
 */
public static com.android.emailcommon.service.IEmailService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.emailcommon.service.IEmailService))) {
return ((com.android.emailcommon.service.IEmailService)iin);
}
return new com.android.emailcommon.service.IEmailService.Stub.Proxy(obj);
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
case TRANSACTION_sendMail:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.sendMail(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_loadAttachment:
{
data.enforceInterface(DESCRIPTOR);
com.android.emailcommon.service.IEmailServiceCallback _arg0;
_arg0 = com.android.emailcommon.service.IEmailServiceCallback.Stub.asInterface(data.readStrongBinder());
long _arg1;
_arg1 = data.readLong();
long _arg2;
_arg2 = data.readLong();
boolean _arg3;
_arg3 = (0!=data.readInt());
this.loadAttachment(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_updateFolderList:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.updateFolderList(_arg0);
return true;
}
case TRANSACTION_sync:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
boolean _arg1;
_arg1 = (0!=data.readInt());
int _arg2;
_arg2 = data.readInt();
long[] _arg3;
_arg3 = data.createLongArray();
this.sync(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_pushModify:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.pushModify(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_validate:
{
data.enforceInterface(DESCRIPTOR);
com.android.emailcommon.provider.HostAuth _arg0;
if ((0!=data.readInt())) {
_arg0 = com.android.emailcommon.provider.HostAuth.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.Bundle _result = this.validate(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_searchMessages:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
com.android.emailcommon.service.SearchParams _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.emailcommon.service.SearchParams.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
long _arg2;
_arg2 = data.readLong();
int _result = this.searchMessages(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_sendMeetingResponse:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int _arg1;
_arg1 = data.readInt();
this.sendMeetingResponse(_arg0, _arg1);
return true;
}
case TRANSACTION_autoDiscover:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
android.os.Bundle _result = this.autoDiscover(_arg0, _arg1);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_setLogging:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setLogging(_arg0);
return true;
}
case TRANSACTION_deleteAccountPIMData:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.deleteAccountPIMData(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.emailcommon.service.IEmailService
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
// Core email operations.
// TODO: is sendMail really necessary, or should we standardize on sync(outbox)?

@Override public void sendMail(long accountId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(accountId);
mRemote.transact(Stub.TRANSACTION_sendMail, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void loadAttachment(com.android.emailcommon.service.IEmailServiceCallback cb, long accountId, long attachmentId, boolean background) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
_data.writeLong(accountId);
_data.writeLong(attachmentId);
_data.writeInt(((background)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_loadAttachment, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void updateFolderList(long accountId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(accountId);
mRemote.transact(Stub.TRANSACTION_updateFolderList, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void sync(long accountId, boolean updateFolderList, int mailboxType, long[] foldersToSync) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(accountId);
_data.writeInt(((updateFolderList)?(1):(0)));
_data.writeInt(mailboxType);
_data.writeLongArray(foldersToSync);
mRemote.transact(Stub.TRANSACTION_sync, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// Push-related functionality.
// Notify the service that the push configuration has changed for an account.

@Override public void pushModify(long accountId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(accountId);
mRemote.transact(Stub.TRANSACTION_pushModify, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// Other email operations.
// TODO: Decouple this call from HostAuth (i.e. use a dedicated data structure, or just pass
// the necessary strings directly).

@Override public android.os.Bundle validate(com.android.emailcommon.provider.HostAuth hostauth) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Bundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((hostauth!=null)) {
_data.writeInt(1);
hostauth.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_validate, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.Bundle.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int searchMessages(long accountId, com.android.emailcommon.service.SearchParams params, long destMailboxId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(accountId);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeLong(destMailboxId);
mRemote.transact(Stub.TRANSACTION_searchMessages, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// PIM functionality (not strictly EAS specific).

@Override public void sendMeetingResponse(long messageId, int response) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(messageId);
_data.writeInt(response);
mRemote.transact(Stub.TRANSACTION_sendMeetingResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// Specific to EAS protocol.

@Override public android.os.Bundle autoDiscover(java.lang.String userName, java.lang.String password) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Bundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(userName);
_data.writeString(password);
mRemote.transact(Stub.TRANSACTION_autoDiscover, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.Bundle.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Service control operations (i.e. does not generate a client-server message).

@Override public void setLogging(int on) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(on);
mRemote.transact(Stub.TRANSACTION_setLogging, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// Needs to get moved into Email since this is NOT a client-server command.

@Override public void deleteAccountPIMData(java.lang.String emailAddress) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(emailAddress);
mRemote.transact(Stub.TRANSACTION_deleteAccountPIMData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_sendMail = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_loadAttachment = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_updateFolderList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_sync = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_pushModify = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_validate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_searchMessages = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_sendMeetingResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_autoDiscover = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_setLogging = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_deleteAccountPIMData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
}
// Core email operations.
// TODO: is sendMail really necessary, or should we standardize on sync(outbox)?

public void sendMail(long accountId) throws android.os.RemoteException;
public void loadAttachment(com.android.emailcommon.service.IEmailServiceCallback cb, long accountId, long attachmentId, boolean background) throws android.os.RemoteException;
public void updateFolderList(long accountId) throws android.os.RemoteException;
public void sync(long accountId, boolean updateFolderList, int mailboxType, long[] foldersToSync) throws android.os.RemoteException;
// Push-related functionality.
// Notify the service that the push configuration has changed for an account.

public void pushModify(long accountId) throws android.os.RemoteException;
// Other email operations.
// TODO: Decouple this call from HostAuth (i.e. use a dedicated data structure, or just pass
// the necessary strings directly).

public android.os.Bundle validate(com.android.emailcommon.provider.HostAuth hostauth) throws android.os.RemoteException;
public int searchMessages(long accountId, com.android.emailcommon.service.SearchParams params, long destMailboxId) throws android.os.RemoteException;
// PIM functionality (not strictly EAS specific).

public void sendMeetingResponse(long messageId, int response) throws android.os.RemoteException;
// Specific to EAS protocol.

public android.os.Bundle autoDiscover(java.lang.String userName, java.lang.String password) throws android.os.RemoteException;
// Service control operations (i.e. does not generate a client-server message).

public void setLogging(int on) throws android.os.RemoteException;
// Needs to get moved into Email since this is NOT a client-server command.

public void deleteAccountPIMData(java.lang.String emailAddress) throws android.os.RemoteException;
}
