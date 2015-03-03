/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/com/android/internal/statusbar/IStatusBar.aidl
 */
package com.android.internal.statusbar;
/** @hide */
public interface IStatusBar extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.statusbar.IStatusBar
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.statusbar.IStatusBar";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.statusbar.IStatusBar interface,
 * generating a proxy if needed.
 */
public static com.android.internal.statusbar.IStatusBar asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.statusbar.IStatusBar))) {
return ((com.android.internal.statusbar.IStatusBar)iin);
}
return new com.android.internal.statusbar.IStatusBar.Stub.Proxy(obj);
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
case TRANSACTION_setIcon:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
com.android.internal.statusbar.StatusBarIcon _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.internal.statusbar.StatusBarIcon.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.setIcon(_arg0, _arg1);
return true;
}
case TRANSACTION_removeIcon:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.removeIcon(_arg0);
return true;
}
case TRANSACTION_addNotification:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.service.notification.StatusBarNotification _arg1;
if ((0!=data.readInt())) {
_arg1 = android.service.notification.StatusBarNotification.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.addNotification(_arg0, _arg1);
return true;
}
case TRANSACTION_updateNotification:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.service.notification.StatusBarNotification _arg1;
if ((0!=data.readInt())) {
_arg1 = android.service.notification.StatusBarNotification.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.updateNotification(_arg0, _arg1);
return true;
}
case TRANSACTION_removeNotification:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.removeNotification(_arg0);
return true;
}
case TRANSACTION_disable:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.disable(_arg0);
return true;
}
case TRANSACTION_animateExpandNotificationsPanel:
{
data.enforceInterface(DESCRIPTOR);
this.animateExpandNotificationsPanel();
return true;
}
case TRANSACTION_animateExpandSettingsPanel:
{
data.enforceInterface(DESCRIPTOR);
this.animateExpandSettingsPanel();
return true;
}
case TRANSACTION_animateCollapsePanels:
{
data.enforceInterface(DESCRIPTOR);
this.animateCollapsePanels();
return true;
}
case TRANSACTION_setSystemUiVisibility:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.setSystemUiVisibility(_arg0, _arg1);
return true;
}
case TRANSACTION_topAppWindowChanged:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.topAppWindowChanged(_arg0);
return true;
}
case TRANSACTION_setImeWindowStatus:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setImeWindowStatus(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_setHardKeyboardStatus:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setHardKeyboardStatus(_arg0, _arg1);
return true;
}
case TRANSACTION_toggleRecentApps:
{
data.enforceInterface(DESCRIPTOR);
this.toggleRecentApps();
return true;
}
case TRANSACTION_preloadRecentApps:
{
data.enforceInterface(DESCRIPTOR);
this.preloadRecentApps();
return true;
}
case TRANSACTION_cancelPreloadRecentApps:
{
data.enforceInterface(DESCRIPTOR);
this.cancelPreloadRecentApps();
return true;
}
case TRANSACTION_setWindowState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.setWindowState(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.statusbar.IStatusBar
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
@Override public void setIcon(int index, com.android.internal.statusbar.StatusBarIcon icon) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(index);
if ((icon!=null)) {
_data.writeInt(1);
icon.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setIcon, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void removeIcon(int index) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(index);
mRemote.transact(Stub.TRANSACTION_removeIcon, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void addNotification(android.os.IBinder key, android.service.notification.StatusBarNotification notification) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(key);
if ((notification!=null)) {
_data.writeInt(1);
notification.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addNotification, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void updateNotification(android.os.IBinder key, android.service.notification.StatusBarNotification notification) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(key);
if ((notification!=null)) {
_data.writeInt(1);
notification.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateNotification, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void removeNotification(android.os.IBinder key) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(key);
mRemote.transact(Stub.TRANSACTION_removeNotification, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void disable(int state) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(state);
mRemote.transact(Stub.TRANSACTION_disable, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void animateExpandNotificationsPanel() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_animateExpandNotificationsPanel, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void animateExpandSettingsPanel() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_animateExpandSettingsPanel, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void animateCollapsePanels() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_animateCollapsePanels, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setSystemUiVisibility(int vis, int mask) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(vis);
_data.writeInt(mask);
mRemote.transact(Stub.TRANSACTION_setSystemUiVisibility, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void topAppWindowChanged(boolean menuVisible) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((menuVisible)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_topAppWindowChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setImeWindowStatus(android.os.IBinder token, int vis, int backDisposition) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(token);
_data.writeInt(vis);
_data.writeInt(backDisposition);
mRemote.transact(Stub.TRANSACTION_setImeWindowStatus, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setHardKeyboardStatus(boolean available, boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((available)?(1):(0)));
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setHardKeyboardStatus, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void toggleRecentApps() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_toggleRecentApps, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void preloadRecentApps() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_preloadRecentApps, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void cancelPreloadRecentApps() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_cancelPreloadRecentApps, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void setWindowState(int window, int state) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(window);
_data.writeInt(state);
mRemote.transact(Stub.TRANSACTION_setWindowState, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_setIcon = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_removeIcon = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_addNotification = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_updateNotification = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_removeNotification = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_disable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_animateExpandNotificationsPanel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_animateExpandSettingsPanel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_animateCollapsePanels = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_setSystemUiVisibility = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_topAppWindowChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_setImeWindowStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_setHardKeyboardStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_toggleRecentApps = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_preloadRecentApps = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_cancelPreloadRecentApps = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_setWindowState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
}
public void setIcon(int index, com.android.internal.statusbar.StatusBarIcon icon) throws android.os.RemoteException;
public void removeIcon(int index) throws android.os.RemoteException;
public void addNotification(android.os.IBinder key, android.service.notification.StatusBarNotification notification) throws android.os.RemoteException;
public void updateNotification(android.os.IBinder key, android.service.notification.StatusBarNotification notification) throws android.os.RemoteException;
public void removeNotification(android.os.IBinder key) throws android.os.RemoteException;
public void disable(int state) throws android.os.RemoteException;
public void animateExpandNotificationsPanel() throws android.os.RemoteException;
public void animateExpandSettingsPanel() throws android.os.RemoteException;
public void animateCollapsePanels() throws android.os.RemoteException;
public void setSystemUiVisibility(int vis, int mask) throws android.os.RemoteException;
public void topAppWindowChanged(boolean menuVisible) throws android.os.RemoteException;
public void setImeWindowStatus(android.os.IBinder token, int vis, int backDisposition) throws android.os.RemoteException;
public void setHardKeyboardStatus(boolean available, boolean enabled) throws android.os.RemoteException;
public void toggleRecentApps() throws android.os.RemoteException;
public void preloadRecentApps() throws android.os.RemoteException;
public void cancelPreloadRecentApps() throws android.os.RemoteException;
public void setWindowState(int window, int state) throws android.os.RemoteException;
}
