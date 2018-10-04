package com.google.android.gms.iid;

import X.AnonymousClass1zw;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class MessengerCompat implements ReflectedParcelable {
    public static final Creator CREATOR = new AnonymousClass1zw();
    /* renamed from: B */
    private Messenger f25131B;
    /* renamed from: C */
    private zzb f25132C;

    public MessengerCompat(IBinder iBinder) {
        if (VERSION.SDK_INT >= 21) {
            this.f25131B = new Messenger(iBinder);
            return;
        }
        zzb zzb;
        if (iBinder == null) {
            zzb = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.iid.IMessengerCompat");
            zzb = queryLocalInterface instanceof zzb ? (zzb) queryLocalInterface : new zzc(iBinder);
        }
        this.f25132C = zzb;
    }

    /* renamed from: B */
    private final IBinder m14125B() {
        Messenger messenger = this.f25131B;
        return messenger != null ? messenger.getBinder() : this.f25132C.asBinder();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r2 = 0;
        if (r4 != 0) goto L_0x0004;
    L_0x0003:
        return r2;
    L_0x0004:
        r1 = r3.m14125B();	 Catch:{ ClassCastException -> 0x0013 }
        r4 = (com.google.android.gms.iid.MessengerCompat) r4;	 Catch:{ ClassCastException -> 0x0013 }
        r0 = r4.m14125B();	 Catch:{ ClassCastException -> 0x0013 }
        r0 = r1.equals(r0);	 Catch:{ ClassCastException -> 0x0013 }
        return r0;	 Catch:{ ClassCastException -> 0x0013 }
    L_0x0013:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.MessengerCompat.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return m14125B().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f25131B;
        parcel.writeStrongBinder(messenger != null ? messenger.getBinder() : this.f25132C.asBinder());
    }
}
