package com.google.android.p001a;

import X.AnonymousClass0cQ;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.a.a */
public class C0052a implements IInterface {
    /* renamed from: B */
    private final IBinder f24922B;
    /* renamed from: C */
    private final String f24923C;

    public C0052a(IBinder iBinder, String str) {
        int I = AnonymousClass0cQ.I(this, -475732737);
        this.f24922B = iBinder;
        this.f24923C = str;
        AnonymousClass0cQ.H(this, -558831364, I);
    }

    /* renamed from: A */
    public final Parcel m13966A() {
        int I = AnonymousClass0cQ.I(this, -1458361947);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f24923C);
        AnonymousClass0cQ.H(this, 915631584, I);
        return obtain;
    }

    /* renamed from: B */
    public final void m13967B(int i, Parcel parcel) {
        int I = AnonymousClass0cQ.I(this, 897711928);
        try {
            this.f24922B.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
            AnonymousClass0cQ.H(this, 2078060474, I);
        }
    }

    public final IBinder asBinder() {
        int I = AnonymousClass0cQ.I(this, 1395309843);
        IBinder iBinder = this.f24922B;
        AnonymousClass0cQ.H(this, -1227504701, I);
        return iBinder;
    }
}
