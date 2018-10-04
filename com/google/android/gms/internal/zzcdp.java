package com.google.android.gms.internal;

import X.AnonymousClass1zC;
import X.AnonymousClass5fn;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.location.zzj;
import com.google.android.gms.location.zzk;
import com.google.android.gms.location.zzm;
import com.google.android.gms.location.zzn;

public final class zzcdp extends zza {
    public static final Creator CREATOR = new AnonymousClass5fn();
    /* renamed from: B */
    private PendingIntent f68015B;
    /* renamed from: C */
    private int f68016C;
    /* renamed from: D */
    private zzcdn f68017D;
    /* renamed from: E */
    private zzm f68018E;
    /* renamed from: F */
    private zzj f68019F;
    /* renamed from: G */
    private zzccu f68020G;

    public zzcdp(int i, zzcdn zzcdn, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.f68016C = i;
        this.f68017D = zzcdn;
        zzccu zzccu = null;
        this.f68018E = iBinder == null ? null : zzn.m29439B(iBinder);
        this.f68015B = pendingIntent;
        this.f68019F = iBinder2 == null ? null : zzk.m29438B(iBinder2);
        if (iBinder3 != null) {
            if (iBinder3 != null) {
                IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                zzccu = queryLocalInterface instanceof zzccu ? (zzccu) queryLocalInterface : new zzccw(iBinder3);
            }
        }
        this.f68020G = zzccu;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.S(parcel, 1, this.f68016C);
        AnonymousClass1zC.G(parcel, 2, this.f68017D, i, false);
        zzm zzm = this.f68018E;
        IBinder iBinder = null;
        AnonymousClass1zC.E(parcel, 3, zzm == null ? null : zzm.asBinder(), false);
        AnonymousClass1zC.G(parcel, 4, this.f68015B, i, false);
        zzj zzj = this.f68019F;
        AnonymousClass1zC.E(parcel, 5, zzj == null ? null : zzj.asBinder(), false);
        zzccu zzccu = this.f68020G;
        if (zzccu != null) {
            iBinder = zzccu.asBinder();
        }
        AnonymousClass1zC.E(parcel, 6, iBinder, false);
        AnonymousClass1zC.B(parcel, U);
    }
}
