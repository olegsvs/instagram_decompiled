package com.facebook.video.heroplayer.ipc;

import X.AnonymousClass0cQ;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public interface TigonTraceListener extends IInterface {

    public abstract class Stub extends Binder implements TigonTraceListener {

        public final class Proxy implements TigonTraceListener {
            /* renamed from: B */
            private IBinder f30526B;

            public Proxy(IBinder iBinder) {
                int I = AnonymousClass0cQ.I(this, -842770865);
                this.f30526B = iBinder;
                AnonymousClass0cQ.H(this, -1804548714, I);
            }

            public final IBinder asBinder() {
                int I = AnonymousClass0cQ.I(this, -1932317029);
                IBinder iBinder = this.f30526B;
                AnonymousClass0cQ.H(this, -18971738, I);
                return iBinder;
            }
        }

        /* renamed from: B */
        public static TigonTraceListener m15763B(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.video.heroplayer.ipc.TigonTraceListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof TigonTraceListener)) {
                return new Proxy(iBinder);
            }
            return (TigonTraceListener) queryLocalInterface;
        }
    }
}
