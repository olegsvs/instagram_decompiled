package com.instagram.direct.ipc;

import X.AnonymousClass0cQ;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class DirectAppThreadStoreServiceClientApi$Stub extends Binder implements DirectAppThreadStoreServiceClientApi {

    /* renamed from: com.instagram.direct.ipc.DirectAppThreadStoreServiceClientApi$Stub$Proxy */
    public final class Proxy implements DirectAppThreadStoreServiceClientApi {
        /* renamed from: B */
        private IBinder f56025B;

        public Proxy(IBinder iBinder) {
            int I = AnonymousClass0cQ.I(this, -46748569);
            this.f56025B = iBinder;
            AnonymousClass0cQ.H(this, 491587881, I);
        }

        public final void Ie(String str, int i) {
            int I = AnonymousClass0cQ.I(this, 523916689);
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.instagram.direct.ipc.DirectAppThreadStoreServiceClientApi");
                obtain.writeString(str);
                obtain.writeInt(i);
                this.f56025B.transact(2, obtain, null, 1);
            } finally {
                obtain.recycle();
                AnonymousClass0cQ.H(this, -1486524527, I);
            }
        }

        public final void Qw(boolean z) {
            int I = AnonymousClass0cQ.I(this, -1521640426);
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.instagram.direct.ipc.DirectAppThreadStoreServiceClientApi");
                obtain.writeInt(z ? 1 : 0);
                this.f56025B.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
                AnonymousClass0cQ.H(this, 2068757409, I);
            }
        }

        public final IBinder asBinder() {
            int I = AnonymousClass0cQ.I(this, -1713038582);
            IBinder iBinder = this.f56025B;
            AnonymousClass0cQ.H(this, 1837548296, I);
            return iBinder;
        }
    }

    public DirectAppThreadStoreServiceClientApi$Stub() {
        int I = AnonymousClass0cQ.I(this, -831096195);
        attachInterface(this, "com.instagram.direct.ipc.DirectAppThreadStoreServiceClientApi");
        AnonymousClass0cQ.H(this, 1111388492, I);
    }

    /* renamed from: B */
    public static DirectAppThreadStoreServiceClientApi m24663B(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.instagram.direct.ipc.DirectAppThreadStoreServiceClientApi");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof DirectAppThreadStoreServiceClientApi)) {
            return new Proxy(iBinder);
        }
        return (DirectAppThreadStoreServiceClientApi) queryLocalInterface;
    }

    public final IBinder asBinder() {
        AnonymousClass0cQ.H(this, 307674474, AnonymousClass0cQ.I(this, -1503500753));
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int I = AnonymousClass0cQ.I(this, -612475812);
        if (i != 1598968902) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.instagram.direct.ipc.DirectAppThreadStoreServiceClientApi");
                    Qw(parcel.readInt() != 0);
                    AnonymousClass0cQ.H(this, -1145226224, I);
                    return true;
                case 2:
                    parcel.enforceInterface("com.instagram.direct.ipc.DirectAppThreadStoreServiceClientApi");
                    Ie(parcel.readString(), parcel.readInt());
                    AnonymousClass0cQ.H(this, -797033202, I);
                    return true;
                default:
                    boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
                    AnonymousClass0cQ.H(this, 1253841842, I);
                    return onTransact;
            }
        }
        parcel2.writeString("com.instagram.direct.ipc.DirectAppThreadStoreServiceClientApi");
        AnonymousClass0cQ.H(this, -1299668881, I);
        return true;
    }
}
