package com.facebook.video.heroplayer.ipc;

import X.AnonymousClass0cQ;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public interface TigonTrafficShapingListener extends IInterface {

    public abstract class Stub extends Binder implements TigonTrafficShapingListener {

        public final class Proxy implements TigonTrafficShapingListener {
            /* renamed from: B */
            private IBinder f30527B;

            public Proxy(IBinder iBinder) {
                int I = AnonymousClass0cQ.I(this, 1970630303);
                this.f30527B = iBinder;
                AnonymousClass0cQ.H(this, 166128701, I);
            }

            public final IBinder asBinder() {
                int I = AnonymousClass0cQ.I(this, -634209311);
                IBinder iBinder = this.f30527B;
                AnonymousClass0cQ.H(this, -411256928, I);
                return iBinder;
            }
        }

        /* renamed from: B */
        public static TigonTrafficShapingListener m15764B(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.video.heroplayer.ipc.TigonTrafficShapingListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof TigonTrafficShapingListener)) {
                return new Proxy(iBinder);
            }
            return (TigonTrafficShapingListener) queryLocalInterface;
        }
    }
}
