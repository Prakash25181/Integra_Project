package com.onkyo.jp.upnp;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class UpnpClient extends Disposable {
    public long _nativePtr = 0;
    public long _delegatePtr = 0;
    public ArrayList<Delegate> _delegate = new ArrayList<>();
    public Handler _handler = new Handler();
    public ArrayList<UpnpAdvDevice> _devices = new ArrayList<>();
    public boolean _running = false;

    /* loaded from: classes.dex */
    public interface Delegate {
        void onDeviceDiscovered(UpnpAdvDevice upnpAdvDevice);

        void onDeviceLost(UpnpAdvDevice upnpAdvDevice);
    }

    static {
        System.loadLibrary("onkupnp");
    }

    public UpnpClient() {
        nativeCreate();
    }

    private native UpnpAdvDevice[] nativeCopyDevices();

    private native boolean nativeCreate();

    /* JADX INFO: Access modifiers changed from: private */
    public native UpnpAdvDevice nativeCreateAdvDevice(String str);

    private native void nativeDestroy();

    private native UpnpAdvDevice nativeFindDeviceByIpAddress(String str);

    private native boolean nativeStart();

    private native void nativeStartDiscovery();

    private native void nativeStop();

    private native void nativeStopDiscovery();

    private void onDeviceDiscovered(final String str) {
        this._handler.post(new Runnable() { // from class: com.onkyo.jp.upnp.UpnpClient.1
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList;
                synchronized (UpnpClient.this._devices) {
                    Iterator it = UpnpClient.this._devices.iterator();
                    while (it.hasNext()) {
                        if (((UpnpAdvDevice) it.next()).deviceId().equals(str)) {
                            return;
                        }
                    }
                    UpnpAdvDevice nativeCreateAdvDevice = UpnpClient.this.nativeCreateAdvDevice(str);
                    if (nativeCreateAdvDevice != null) {
                        UpnpClient.this._devices.add(nativeCreateAdvDevice);
                    }
                    if (nativeCreateAdvDevice != null) {
                        synchronized (UpnpClient.this._delegate) {
                            arrayList = new ArrayList(UpnpClient.this._delegate);
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((Delegate) it2.next()).onDeviceDiscovered(nativeCreateAdvDevice);
                        }
                    }
                }
            }
        });
    }

    private void onDeviceLost(final String str) {
        this._handler.post(new Runnable() { // from class: com.onkyo.jp.upnp.UpnpClient.2
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList;
                UpnpAdvDevice removeDevice = UpnpClient.this.removeDevice(str);
                if (removeDevice != null) {
                    synchronized (UpnpClient.this._delegate) {
                        arrayList = new ArrayList(UpnpClient.this._delegate);
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Delegate) it.next()).onDeviceLost(removeDevice);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public UpnpAdvDevice removeDevice(String str) {
        synchronized (this._devices) {
            Iterator<UpnpAdvDevice> it = this._devices.iterator();
            while (it.hasNext()) {
                UpnpAdvDevice next = it.next();
                if (next.deviceId().equals(str)) {
                    this._devices.remove(next);
                    return next;
                }
            }
            return null;
        }
    }

    public void addObserver(Delegate delegate) {
        synchronized (this._delegate) {
            this._delegate.add(delegate);
        }
    }

    public UpnpAdvDevice[] copyDevices() {
        UpnpAdvDevice[] upnpAdvDeviceArr;
        synchronized (this._devices) {
            upnpAdvDeviceArr = new UpnpAdvDevice[this._devices.size()];
            for (int i = 0; i < this._devices.size(); i++) {
                upnpAdvDeviceArr[i] = this._devices.get(i);
            }
        }
        return upnpAdvDeviceArr;
    }

    @Override // com.onkyo.jp.upnp.Disposable
    public void disposeObjects() {
        stopDiscovery();
        stop();
        nativeDestroy();
        this._delegate.clear();
        super.disposeObjects();
    }

    public UpnpAdvDevice findDeviceByIpAddress(String str) {
        return nativeFindDeviceByIpAddress(str);
    }

    public void removeObserver(Delegate delegate) {
        synchronized (this._delegate) {
            this._delegate.remove(delegate);
        }
    }

    public boolean start() {
        if (!this._running) {
            this._running = nativeStart();
        }
        return this._running;
    }

    public void startDiscovery() {
        nativeStartDiscovery();
    }

    public void stop() {
        nativeStop();
        this._running = false;
        this._devices.clear();
    }

    public void stopDiscovery() {
        nativeStopDiscovery();
    }
}
