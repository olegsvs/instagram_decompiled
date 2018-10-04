package com.google.android.gms.common;

import X.AnonymousClass1hj;
import X.AnonymousClass1zC;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzas;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.internal.zzee;

public final class zzm extends zza {
    public static final Creator CREATOR = new AnonymousClass1hj();
    /* renamed from: B */
    private final String f25106B;
    /* renamed from: C */
    private final zzg f25107C;
    /* renamed from: D */
    private final boolean f25108D;

    public zzm(String str, IBinder iBinder, boolean z) {
        this.f25106B = str;
        this.f25107C = m14122B(iBinder);
        this.f25108D = z;
    }

    /* renamed from: B */
    private static zzg m14122B(IBinder iBinder) {
        zzg zzg = null;
        if (iBinder != null) {
            try {
                IObjectWrapper VYA = zzas.C(iBinder).VYA();
                byte[] bArr = VYA == null ? null : (byte[]) zzn.B(VYA);
                if (bArr != null) {
                    zzg = new zzh(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (Throwable e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
                return null;
            }
        }
        return zzg;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int U = AnonymousClass1zC.m14073U(parcel);
        AnonymousClass1zC.m14061I(parcel, 1, this.f25106B, false);
        zzee zzee = this.f25107C;
        if (zzee == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            iBinder = null;
        } else {
            iBinder = zzee.asBinder();
        }
        AnonymousClass1zC.m14057E(parcel, 2, iBinder, false);
        AnonymousClass1zC.m14063K(parcel, 3, this.f25108D);
        AnonymousClass1zC.m14054B(parcel, U);
    }
}
