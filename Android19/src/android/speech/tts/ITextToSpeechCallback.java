/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/speech/tts/ITextToSpeechCallback.aidl
 */
package android.speech.tts;
/**
 * Interface for callbacks from TextToSpeechService
 *
 * {@hide}
 */
public interface ITextToSpeechCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.speech.tts.ITextToSpeechCallback
{
private static final java.lang.String DESCRIPTOR = "android.speech.tts.ITextToSpeechCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.speech.tts.ITextToSpeechCallback interface,
 * generating a proxy if needed.
 */
public static android.speech.tts.ITextToSpeechCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.speech.tts.ITextToSpeechCallback))) {
return ((android.speech.tts.ITextToSpeechCallback)iin);
}
return new android.speech.tts.ITextToSpeechCallback.Stub.Proxy(obj);
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
case TRANSACTION_onStart:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.onStart(_arg0);
return true;
}
case TRANSACTION_onDone:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.onDone(_arg0);
return true;
}
case TRANSACTION_onError:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.onError(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.speech.tts.ITextToSpeechCallback
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
@Override public void onStart(java.lang.String utteranceId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(utteranceId);
mRemote.transact(Stub.TRANSACTION_onStart, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onDone(java.lang.String utteranceId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(utteranceId);
mRemote.transact(Stub.TRANSACTION_onDone, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onError(java.lang.String utteranceId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(utteranceId);
mRemote.transact(Stub.TRANSACTION_onError, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onStart = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onDone = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public void onStart(java.lang.String utteranceId) throws android.os.RemoteException;
public void onDone(java.lang.String utteranceId) throws android.os.RemoteException;
public void onError(java.lang.String utteranceId) throws android.os.RemoteException;
}
