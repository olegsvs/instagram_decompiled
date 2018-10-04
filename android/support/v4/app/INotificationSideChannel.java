package android.support.v4.app;

import X.AnonymousClass0cQ;
import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface INotificationSideChannel extends IInterface {

    public abstract class Stub extends Binder implements INotificationSideChannel {

        public final class Proxy implements INotificationSideChannel {
            /* renamed from: B */
            private IBinder f29890B;

            public Proxy(IBinder iBinder) {
                int I = AnonymousClass0cQ.I(this, 219225009);
                this.f29890B = iBinder;
                AnonymousClass0cQ.H(this, -1334049216, I);
            }

            public final void AE(String str) {
                int I = AnonymousClass0cQ.I(this, -159688271);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    this.f29890B.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, -440027980, I);
                }
            }

            public final void Sc(String str, int i, String str2, Notification notification) {
                int I = AnonymousClass0cQ.I(this, -2076004475);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f29890B.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, 1140712066, I);
                }
            }

            public final IBinder asBinder() {
                int I = AnonymousClass0cQ.I(this, -606491721);
                IBinder iBinder = this.f29890B;
                AnonymousClass0cQ.H(this, 538711793, I);
                return iBinder;
            }

            public final void yD(String str, int i, String str2) {
                int I = AnonymousClass0cQ.I(this, 437703714);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    this.f29890B.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, 1325811550, I);
                }
            }
        }

        /* renamed from: B */
        public static INotificationSideChannel m15408B(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof INotificationSideChannel)) {
                return new Proxy(iBinder);
            }
            return (INotificationSideChannel) queryLocalInterface;
        }
    }

    void AE(String str);

    void Sc(String str, int i, String str2, Notification notification);

    void yD(String str, int i, String str2);
}
