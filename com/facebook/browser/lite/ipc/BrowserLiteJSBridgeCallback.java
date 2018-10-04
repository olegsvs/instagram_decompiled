package com.facebook.browser.lite.ipc;

import X.AnonymousClass0cQ;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public interface BrowserLiteJSBridgeCallback extends IInterface {

    public abstract class Stub extends Binder implements BrowserLiteJSBridgeCallback {

        public final class Proxy implements BrowserLiteJSBridgeCallback {
            /* renamed from: B */
            private IBinder f30203B;

            public Proxy(IBinder iBinder) {
                int I = AnonymousClass0cQ.I(this, 1706335356);
                this.f30203B = iBinder;
                AnonymousClass0cQ.H(this, 2128347639, I);
            }

            public final IBinder asBinder() {
                int I = AnonymousClass0cQ.I(this, -1923025637);
                IBinder iBinder = this.f30203B;
                AnonymousClass0cQ.H(this, -541048375, I);
                return iBinder;
            }
        }

        /* renamed from: B */
        public static BrowserLiteJSBridgeCallback m15608B(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof BrowserLiteJSBridgeCallback)) {
                return new Proxy(iBinder);
            }
            return (BrowserLiteJSBridgeCallback) queryLocalInterface;
        }
    }
}
