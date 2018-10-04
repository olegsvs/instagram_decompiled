package com.facebook.video.heroplayer.ipc;

import X.AnonymousClass0cQ;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface VideoLicenseListener extends IInterface {

    public abstract class Stub extends Binder implements VideoLicenseListener {

        public final class Proxy implements VideoLicenseListener {
            /* renamed from: B */
            private IBinder f30528B;

            public Proxy(IBinder iBinder) {
                int I = AnonymousClass0cQ.I(this, 2104678032);
                this.f30528B = iBinder;
                AnonymousClass0cQ.H(this, 345394943, I);
            }

            public final String DU(String str, String str2) {
                int I = AnonymousClass0cQ.I(this, 842767076);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.VideoLicenseListener");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f30528B.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, 1503042290, I);
                }
            }

            public final IBinder asBinder() {
                int I = AnonymousClass0cQ.I(this, -818818611);
                IBinder iBinder = this.f30528B;
                AnonymousClass0cQ.H(this, -308040739, I);
                return iBinder;
            }
        }

        /* renamed from: B */
        public static VideoLicenseListener m15765B(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.video.heroplayer.ipc.VideoLicenseListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof VideoLicenseListener)) {
                return new Proxy(iBinder);
            }
            return (VideoLicenseListener) queryLocalInterface;
        }
    }

    String DU(String str, String str2);
}
