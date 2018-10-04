package com.facebook.push.fbns.ipc;

import X.AnonymousClass0cQ;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IFbnsAIDLService extends IInterface {

    public abstract class Stub extends Binder implements IFbnsAIDLService {

        public final class Proxy implements IFbnsAIDLService {
            /* renamed from: B */
            private IBinder f15861B;

            public Proxy(IBinder iBinder) {
                int I = AnonymousClass0cQ.m5859I(this, 502217712);
                this.f15861B = iBinder;
                AnonymousClass0cQ.m5858H(this, 1131072382, I);
            }

            public final FbnsAIDLResult WIA(FbnsAIDLRequest fbnsAIDLRequest) {
                int I = AnonymousClass0cQ.m5859I(this, 1819998277);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.push.fbns.ipc.IFbnsAIDLService");
                    if (fbnsAIDLRequest != null) {
                        obtain.writeInt(1);
                        fbnsAIDLRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15861B.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    FbnsAIDLResult fbnsAIDLResult = obtain2.readInt() != 0 ? (FbnsAIDLResult) FbnsAIDLResult.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -413372834, I);
                    return fbnsAIDLResult;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -1651473098, I);
                }
            }

            public final IBinder asBinder() {
                int I = AnonymousClass0cQ.m5859I(this, -335947478);
                IBinder iBinder = this.f15861B;
                AnonymousClass0cQ.m5858H(this, -1666669739, I);
                return iBinder;
            }

            public final void tVA(FbnsAIDLRequest fbnsAIDLRequest) {
                int I = AnonymousClass0cQ.m5859I(this, 1204005627);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.push.fbns.ipc.IFbnsAIDLService");
                    if (fbnsAIDLRequest != null) {
                        obtain.writeInt(1);
                        fbnsAIDLRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15861B.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, 1041951890, I);
                }
            }
        }

        public Stub() {
            int I = AnonymousClass0cQ.m5859I(this, -986241021);
            attachInterface(this, "com.facebook.push.fbns.ipc.IFbnsAIDLService");
            AnonymousClass0cQ.m5858H(this, -1802141584, I);
        }

        /* renamed from: C */
        public static IFbnsAIDLService m10178C(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.push.fbns.ipc.IFbnsAIDLService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IFbnsAIDLService)) {
                return new Proxy(iBinder);
            }
            return (IFbnsAIDLService) queryLocalInterface;
        }

        public final IBinder asBinder() {
            AnonymousClass0cQ.m5858H(this, 920453875, AnonymousClass0cQ.m5859I(this, 1307666724));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int I = AnonymousClass0cQ.m5859I(this, -761289823);
            if (i != 1598968902) {
                FbnsAIDLRequest fbnsAIDLRequest = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.facebook.push.fbns.ipc.IFbnsAIDLService");
                        if (parcel.readInt() != 0) {
                            fbnsAIDLRequest = (FbnsAIDLRequest) FbnsAIDLRequest.CREATOR.createFromParcel(parcel);
                        }
                        FbnsAIDLResult WIA = WIA(fbnsAIDLRequest);
                        parcel2.writeNoException();
                        if (WIA != null) {
                            parcel2.writeInt(1);
                            WIA.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        AnonymousClass0cQ.m5858H(this, -925902130, I);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.facebook.push.fbns.ipc.IFbnsAIDLService");
                        if (parcel.readInt() != 0) {
                            fbnsAIDLRequest = (FbnsAIDLRequest) FbnsAIDLRequest.CREATOR.createFromParcel(parcel);
                        }
                        tVA(fbnsAIDLRequest);
                        AnonymousClass0cQ.m5858H(this, 987443338, I);
                        return true;
                    default:
                        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
                        AnonymousClass0cQ.m5858H(this, -1143376027, I);
                        return onTransact;
                }
            }
            parcel2.writeString("com.facebook.push.fbns.ipc.IFbnsAIDLService");
            AnonymousClass0cQ.m5858H(this, -1081379517, I);
            return true;
        }
    }

    FbnsAIDLResult WIA(FbnsAIDLRequest fbnsAIDLRequest);

    void tVA(FbnsAIDLRequest fbnsAIDLRequest);
}
