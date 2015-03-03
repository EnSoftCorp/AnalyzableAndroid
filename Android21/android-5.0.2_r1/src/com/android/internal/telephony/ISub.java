/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/telephony/java/com/android/internal/telephony/ISub.aidl
 */
package com.android.internal.telephony;
public interface ISub extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.ISub
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.ISub";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.telephony.ISub interface,
 * generating a proxy if needed.
 */
public static com.android.internal.telephony.ISub asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.telephony.ISub))) {
return ((com.android.internal.telephony.ISub)iin);
}
return new com.android.internal.telephony.ISub.Stub.Proxy(obj);
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
case TRANSACTION_getSubInfoForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
android.telephony.SubInfoRecord _result = this.getSubInfoForSubscriber(_arg0);
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
case TRANSACTION_getSubInfoUsingIccId:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.util.List<android.telephony.SubInfoRecord> _result = this.getSubInfoUsingIccId(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getSubInfoUsingSlotId:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.util.List<android.telephony.SubInfoRecord> _result = this.getSubInfoUsingSlotId(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getAllSubInfoList:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.telephony.SubInfoRecord> _result = this.getAllSubInfoList();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getActiveSubInfoList:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.telephony.SubInfoRecord> _result = this.getActiveSubInfoList();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getAllSubInfoCount:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getAllSubInfoCount();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getActiveSubInfoCount:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getActiveSubInfoCount();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_addSubInfoRecord:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _result = this.addSubInfoRecord(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setColor:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
long _arg1;
_arg1 = data.readLong();
int _result = this.setColor(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setDisplayName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _arg1;
_arg1 = data.readLong();
int _result = this.setDisplayName(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setDisplayNameUsingSrc:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _arg1;
_arg1 = data.readLong();
long _arg2;
_arg2 = data.readLong();
int _result = this.setDisplayNameUsingSrc(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setDisplayNumber:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _arg1;
_arg1 = data.readLong();
int _result = this.setDisplayNumber(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setDisplayNumberFormat:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
long _arg1;
_arg1 = data.readLong();
int _result = this.setDisplayNumberFormat(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setDataRoaming:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
long _arg1;
_arg1 = data.readLong();
int _result = this.setDataRoaming(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getSlotId:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int _result = this.getSlotId(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getSubId:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
long[] _result = this.getSubId(_arg0);
reply.writeNoException();
reply.writeLongArray(_result);
return true;
}
case TRANSACTION_getDefaultSubId:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getDefaultSubId();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_clearSubInfo:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.clearSubInfo();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getPhoneId:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int _result = this.getPhoneId(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getDefaultDataSubId:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getDefaultDataSubId();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_setDefaultDataSubId:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.setDefaultDataSubId(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getDefaultVoiceSubId:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getDefaultVoiceSubId();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_setDefaultVoiceSubId:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.setDefaultVoiceSubId(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getDefaultSmsSubId:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getDefaultSmsSubId();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_setDefaultSmsSubId:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.setDefaultSmsSubId(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_clearDefaultsForInactiveSubIds:
{
data.enforceInterface(DESCRIPTOR);
this.clearDefaultsForInactiveSubIds();
reply.writeNoException();
return true;
}
case TRANSACTION_getActiveSubIdList:
{
data.enforceInterface(DESCRIPTOR);
long[] _result = this.getActiveSubIdList();
reply.writeNoException();
reply.writeLongArray(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.telephony.ISub
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
     * Get the SubInfoRecord according to an index
     * @param subId The unique SubInfoRecord index in database
     * @return SubInfoRecord, maybe null
     */
@Override public android.telephony.SubInfoRecord getSubInfoForSubscriber(long subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.telephony.SubInfoRecord _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(subId);
mRemote.transact(Stub.TRANSACTION_getSubInfoForSubscriber, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.telephony.SubInfoRecord.CREATOR.createFromParcel(_reply);
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
/**
     * Get the SubInfoRecord according to an IccId
     * @param iccId the IccId of SIM card
     * @return SubInfoRecord, maybe null
     */
@Override public java.util.List<android.telephony.SubInfoRecord> getSubInfoUsingIccId(java.lang.String iccId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.telephony.SubInfoRecord> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iccId);
mRemote.transact(Stub.TRANSACTION_getSubInfoUsingIccId, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.telephony.SubInfoRecord.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Get the SubInfoRecord according to slotId
     * @param slotId the slot which the SIM is inserted
     * @return SubInfoRecord, maybe null
     */
@Override public java.util.List<android.telephony.SubInfoRecord> getSubInfoUsingSlotId(int slotId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.telephony.SubInfoRecord> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
mRemote.transact(Stub.TRANSACTION_getSubInfoUsingSlotId, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.telephony.SubInfoRecord.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Get all the SubInfoRecord(s) in subinfo database
     * @return Array list of all SubInfoRecords in database, include thsoe that were inserted before
     */
@Override public java.util.List<android.telephony.SubInfoRecord> getAllSubInfoList() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.telephony.SubInfoRecord> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAllSubInfoList, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.telephony.SubInfoRecord.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Get the SubInfoRecord(s) of the currently inserted SIM(s)
     * @return Array list of currently inserted SubInfoRecord(s)
     */
@Override public java.util.List<android.telephony.SubInfoRecord> getActiveSubInfoList() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.telephony.SubInfoRecord> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getActiveSubInfoList, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.telephony.SubInfoRecord.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Get the SUB count of all SUB(s) in subinfo database
     * @return all SIM count in database, include what was inserted before
     */
@Override public int getAllSubInfoCount() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAllSubInfoCount, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Get the count of active SUB(s)
     * @return active SIM count
     */
@Override public int getActiveSubInfoCount() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getActiveSubInfoCount, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Add a new SubInfoRecord to subinfo database if needed
     * @param iccId the IccId of the SIM card
     * @param slotId the slot which the SIM is inserted
     * @return the URL of the newly created row or the updated row
     */
@Override public int addSubInfoRecord(java.lang.String iccId, int slotId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iccId);
_data.writeInt(slotId);
mRemote.transact(Stub.TRANSACTION_addSubInfoRecord, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Set SIM color by simInfo index
     * @param color the color of the SIM
     * @param subId the unique SubInfoRecord index in database
     * @return the number of records updated
     */
@Override public int setColor(int color, long subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(color);
_data.writeLong(subId);
mRemote.transact(Stub.TRANSACTION_setColor, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Set display name by simInfo index
     * @param displayName the display name of SIM card
     * @param subId the unique SubInfoRecord index in database
     * @return the number of records updated
     */
@Override public int setDisplayName(java.lang.String displayName, long subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(displayName);
_data.writeLong(subId);
mRemote.transact(Stub.TRANSACTION_setDisplayName, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Set display name by simInfo index with name source
     * @param displayName the display name of SIM card
     * @param subId the unique SubInfoRecord index in database
     * @param nameSource, 0: DEFAULT_SOURCE, 1: SIM_SOURCE, 2: USER_INPUT
     * @return the number of records updated
     */
@Override public int setDisplayNameUsingSrc(java.lang.String displayName, long subId, long nameSource) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(displayName);
_data.writeLong(subId);
_data.writeLong(nameSource);
mRemote.transact(Stub.TRANSACTION_setDisplayNameUsingSrc, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Set phone number by subId
     * @param number the phone number of the SIM
     * @param subId the unique SubInfoRecord index in database
     * @return the number of records updated
     */
@Override public int setDisplayNumber(java.lang.String number, long subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(number);
_data.writeLong(subId);
mRemote.transact(Stub.TRANSACTION_setDisplayNumber, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Set number display format. 0: none, 1: the first four digits, 2: the last four digits
     * @param format the display format of phone number
     * @param subId the unique SubInfoRecord index in database
     * @return the number of records updated
     */
@Override public int setDisplayNumberFormat(int format, long subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(format);
_data.writeLong(subId);
mRemote.transact(Stub.TRANSACTION_setDisplayNumberFormat, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Set data roaming by simInfo index
     * @param roaming 0:Don't allow data when roaming, 1:Allow data when roaming
     * @param subId the unique SubInfoRecord index in database
     * @return the number of records updated
     */
@Override public int setDataRoaming(int roaming, long subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(roaming);
_data.writeLong(subId);
mRemote.transact(Stub.TRANSACTION_setDataRoaming, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getSlotId(long subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(subId);
mRemote.transact(Stub.TRANSACTION_getSlotId, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long[] getSubId(int slotId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
mRemote.transact(Stub.TRANSACTION_getSubId, _data, _reply, 0);
_reply.readException();
_result = _reply.createLongArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long getDefaultSubId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDefaultSubId, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int clearSubInfo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_clearSubInfo, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getPhoneId(long subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(subId);
mRemote.transact(Stub.TRANSACTION_getPhoneId, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Get the default data subscription
     * @return Id of the data subscription
     */
@Override public long getDefaultDataSubId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDefaultDataSubId, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setDefaultDataSubId(long subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(subId);
mRemote.transact(Stub.TRANSACTION_setDefaultDataSubId, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public long getDefaultVoiceSubId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDefaultVoiceSubId, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setDefaultVoiceSubId(long subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(subId);
mRemote.transact(Stub.TRANSACTION_setDefaultVoiceSubId, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public long getDefaultSmsSubId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDefaultSmsSubId, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setDefaultSmsSubId(long subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(subId);
mRemote.transact(Stub.TRANSACTION_setDefaultSmsSubId, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clearDefaultsForInactiveSubIds() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_clearDefaultsForInactiveSubIds, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public long[] getActiveSubIdList() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getActiveSubIdList, _data, _reply, 0);
_reply.readException();
_result = _reply.createLongArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getSubInfoForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getSubInfoUsingIccId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getSubInfoUsingSlotId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getAllSubInfoList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getActiveSubInfoList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getAllSubInfoCount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getActiveSubInfoCount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_addSubInfoRecord = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_setColor = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_setDisplayName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_setDisplayNameUsingSrc = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_setDisplayNumber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_setDisplayNumberFormat = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_setDataRoaming = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_getSlotId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_getSubId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_getDefaultSubId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_clearSubInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_getPhoneId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_getDefaultDataSubId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_setDefaultDataSubId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_getDefaultVoiceSubId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_setDefaultVoiceSubId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_getDefaultSmsSubId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_setDefaultSmsSubId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_clearDefaultsForInactiveSubIds = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_getActiveSubIdList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
}
/**
     * Get the SubInfoRecord according to an index
     * @param subId The unique SubInfoRecord index in database
     * @return SubInfoRecord, maybe null
     */
public android.telephony.SubInfoRecord getSubInfoForSubscriber(long subId) throws android.os.RemoteException;
/**
     * Get the SubInfoRecord according to an IccId
     * @param iccId the IccId of SIM card
     * @return SubInfoRecord, maybe null
     */
public java.util.List<android.telephony.SubInfoRecord> getSubInfoUsingIccId(java.lang.String iccId) throws android.os.RemoteException;
/**
     * Get the SubInfoRecord according to slotId
     * @param slotId the slot which the SIM is inserted
     * @return SubInfoRecord, maybe null
     */
public java.util.List<android.telephony.SubInfoRecord> getSubInfoUsingSlotId(int slotId) throws android.os.RemoteException;
/**
     * Get all the SubInfoRecord(s) in subinfo database
     * @return Array list of all SubInfoRecords in database, include thsoe that were inserted before
     */
public java.util.List<android.telephony.SubInfoRecord> getAllSubInfoList() throws android.os.RemoteException;
/**
     * Get the SubInfoRecord(s) of the currently inserted SIM(s)
     * @return Array list of currently inserted SubInfoRecord(s)
     */
public java.util.List<android.telephony.SubInfoRecord> getActiveSubInfoList() throws android.os.RemoteException;
/**
     * Get the SUB count of all SUB(s) in subinfo database
     * @return all SIM count in database, include what was inserted before
     */
public int getAllSubInfoCount() throws android.os.RemoteException;
/**
     * Get the count of active SUB(s)
     * @return active SIM count
     */
public int getActiveSubInfoCount() throws android.os.RemoteException;
/**
     * Add a new SubInfoRecord to subinfo database if needed
     * @param iccId the IccId of the SIM card
     * @param slotId the slot which the SIM is inserted
     * @return the URL of the newly created row or the updated row
     */
public int addSubInfoRecord(java.lang.String iccId, int slotId) throws android.os.RemoteException;
/**
     * Set SIM color by simInfo index
     * @param color the color of the SIM
     * @param subId the unique SubInfoRecord index in database
     * @return the number of records updated
     */
public int setColor(int color, long subId) throws android.os.RemoteException;
/**
     * Set display name by simInfo index
     * @param displayName the display name of SIM card
     * @param subId the unique SubInfoRecord index in database
     * @return the number of records updated
     */
public int setDisplayName(java.lang.String displayName, long subId) throws android.os.RemoteException;
/**
     * Set display name by simInfo index with name source
     * @param displayName the display name of SIM card
     * @param subId the unique SubInfoRecord index in database
     * @param nameSource, 0: DEFAULT_SOURCE, 1: SIM_SOURCE, 2: USER_INPUT
     * @return the number of records updated
     */
public int setDisplayNameUsingSrc(java.lang.String displayName, long subId, long nameSource) throws android.os.RemoteException;
/**
     * Set phone number by subId
     * @param number the phone number of the SIM
     * @param subId the unique SubInfoRecord index in database
     * @return the number of records updated
     */
public int setDisplayNumber(java.lang.String number, long subId) throws android.os.RemoteException;
/**
     * Set number display format. 0: none, 1: the first four digits, 2: the last four digits
     * @param format the display format of phone number
     * @param subId the unique SubInfoRecord index in database
     * @return the number of records updated
     */
public int setDisplayNumberFormat(int format, long subId) throws android.os.RemoteException;
/**
     * Set data roaming by simInfo index
     * @param roaming 0:Don't allow data when roaming, 1:Allow data when roaming
     * @param subId the unique SubInfoRecord index in database
     * @return the number of records updated
     */
public int setDataRoaming(int roaming, long subId) throws android.os.RemoteException;
public int getSlotId(long subId) throws android.os.RemoteException;
public long[] getSubId(int slotId) throws android.os.RemoteException;
public long getDefaultSubId() throws android.os.RemoteException;
public int clearSubInfo() throws android.os.RemoteException;
public int getPhoneId(long subId) throws android.os.RemoteException;
/**
     * Get the default data subscription
     * @return Id of the data subscription
     */
public long getDefaultDataSubId() throws android.os.RemoteException;
public void setDefaultDataSubId(long subId) throws android.os.RemoteException;
public long getDefaultVoiceSubId() throws android.os.RemoteException;
public void setDefaultVoiceSubId(long subId) throws android.os.RemoteException;
public long getDefaultSmsSubId() throws android.os.RemoteException;
public void setDefaultSmsSubId(long subId) throws android.os.RemoteException;
public void clearDefaultsForInactiveSubIds() throws android.os.RemoteException;
public long[] getActiveSubIdList() throws android.os.RemoteException;
}
