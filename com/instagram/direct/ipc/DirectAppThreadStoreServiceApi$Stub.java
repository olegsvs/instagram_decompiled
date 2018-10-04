package com.instagram.direct.ipc;

import X.AnonymousClass0cQ;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class DirectAppThreadStoreServiceApi$Stub extends Binder implements DirectAppThreadStoreServiceApi {

    /* renamed from: com.instagram.direct.ipc.DirectAppThreadStoreServiceApi$Stub$Proxy */
    public final class Proxy implements DirectAppThreadStoreServiceApi {
        /* renamed from: B */
        private IBinder f65507B;

        public Proxy(IBinder iBinder) {
            int I = AnonymousClass0cQ.I(this, 872848796);
            this.f65507B = iBinder;
            AnonymousClass0cQ.H(this, -986241796, I);
        }

        public final void CJA(String str, DirectAppThreadStoreServiceClientApi directAppThreadStoreServiceClientApi) {
            int I = AnonymousClass0cQ.I(this, 166810557);
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.instagram.direct.ipc.DirectAppThreadStoreServiceApi");
                obtain.writeString(str);
                obtain.writeStrongBinder(directAppThreadStoreServiceClientApi != null ? directAppThreadStoreServiceClientApi.asBinder() : null);
                this.f65507B.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
                AnonymousClass0cQ.H(this, -81864557, I);
            }
        }

        public final IBinder asBinder() {
            int I = AnonymousClass0cQ.I(this, 525778809);
            IBinder iBinder = this.f65507B;
            AnonymousClass0cQ.H(this, -2101289031, I);
            return iBinder;
        }

        public final void oVA(String str, DirectAppThreadStoreServiceClientApi directAppThreadStoreServiceClientApi) {
            int I = AnonymousClass0cQ.I(this, 1583496144);
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.instagram.direct.ipc.DirectAppThreadStoreServiceApi");
                obtain.writeString(str);
                obtain.writeStrongBinder(directAppThreadStoreServiceClientApi != null ? directAppThreadStoreServiceClientApi.asBinder() : null);
                this.f65507B.transact(2, obtain, null, 1);
            } finally {
                obtain.recycle();
                AnonymousClass0cQ.H(this, 1953606797, I);
            }
        }
    }

    public DirectAppThreadStoreServiceApi$Stub() {
        int I = AnonymousClass0cQ.I(this, -847359288);
        attachInterface(this, "com.instagram.direct.ipc.DirectAppThreadStoreServiceApi");
        AnonymousClass0cQ.H(this, 1425356812, I);
    }

    /* renamed from: B */
    public static DirectAppThreadStoreServiceApi m27240B(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.instagram.direct.ipc.DirectAppThreadStoreServiceApi");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof DirectAppThreadStoreServiceApi)) {
            return new Proxy(iBinder);
        }
        return (DirectAppThreadStoreServiceApi) queryLocalInterface;
    }

    public final IBinder asBinder() {
        AnonymousClass0cQ.H(this, 1956542337, AnonymousClass0cQ.I(this, -488562455));
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int I = AnonymousClass0cQ.I(this, 331460749);
        if (i != 1598968902) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.instagram.direct.ipc.DirectAppThreadStoreServiceApi");
                    CJA(parcel.readString(), DirectAppThreadStoreServiceClientApi$Stub.B(parcel.readStrongBinder()));
                    AnonymousClass0cQ.H(this, -1258466236, I);
                    return true;
                case 2:
                    parcel.enforceInterface("com.instagram.direct.ipc.DirectAppThreadStoreServiceApi");
                    oVA(parcel.readString(), DirectAppThreadStoreServiceClientApi$Stub.B(parcel.readStrongBinder()));
                    AnonymousClass0cQ.H(this, -66380859, I);
                    return true;
                default:
                    boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
                    AnonymousClass0cQ.H(this, 355029341, I);
                    return onTransact;
            }
        }
        parcel2.writeString("com.instagram.direct.ipc.DirectAppThreadStoreServiceApi");
        AnonymousClass0cQ.H(this, 391074694, I);
        return true;
    }
}
