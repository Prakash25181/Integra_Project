package com.onkyo.jp.upnp;

/* loaded from: classes.dex */
public abstract class Disposable {
    public boolean _isDisposed;

    public final void dispose() {
        if (isDisposed()) {
            return;
        }
        disposeObjects();
        if (!isDisposed()) {
            throw new RuntimeException("super.disposeObjects not called");
        }
    }

    public void disposeObjects() {
        this._isDisposed = true;
    }

    public void finalize() {
        dispose();
        super.finalize();
    }

    public final boolean isDisposed() {
        return this._isDisposed;
    }
}
