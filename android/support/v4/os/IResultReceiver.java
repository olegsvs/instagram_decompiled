package android.support.v4.os;

import X.AnonymousClass0cQ;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IResultReceiver extends IInterface {

    public abstract class Stub extends Binder implements IResultReceiver {

        public final class Proxy implements IResultReceiver {
            /* renamed from: B */
            private IBinder f29925B;

            public Proxy(IBinder iBinder) {
                int I = AnonymousClass0cQ.I(this, -719786202);
                this.f29925B = iBinder;
                AnonymousClass0cQ.H(this, -735258490, I);
            }

            public final void CMA(int i, Bundle bundle) {
                int I = AnonymousClass0cQ.I(this, -128159714);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f29925B.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, -1123239563, I);
                }
            }

            public final IBinder asBinder() {
                int I = AnonymousClass0cQ.I(this, -72646489);
                IBinder iBinder = this.f29925B;
                AnonymousClass0cQ.H(this, -139497637, I);
                return iBinder;
            }
        }

        public Stub() {
            int I = AnonymousClass0cQ.I(this, 44809228);
            attachInterface(this, "android.support.v4.os.IResultReceiver");
            AnonymousClass0cQ.H(this, -331523751, I);
        }

        /* renamed from: B */
        public static IResultReceiver m15419B(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IResultReceiver)) {
                return new Proxy(iBinder);
            }
            return (IResultReceiver) queryLocalInterface;
        }

        public final IBinder asBinder() {
            AnonymousClass0cQ.H(this, 2117509100, AnonymousClass0cQ.I(this, 897597318));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int I = AnonymousClass0cQ.I(this, -250147080);
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                CMA(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                AnonymousClass0cQ.H(this, -798119436, I);
                return true;
            } else if (i != 1598968902) {
                boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
                AnonymousClass0cQ.H(this, 151958997, I);
                return onTransact;
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                AnonymousClass0cQ.H(this, 1297152264, I);
                return true;
            }
        }
    }

    void CMA(int i, Bundle bundle);
}
