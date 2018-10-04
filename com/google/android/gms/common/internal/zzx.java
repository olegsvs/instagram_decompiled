package com.google.android.gms.common.internal;

import X.AnonymousClass1zC;
import X.AnonymousClass1zb;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.zzc;

public final class zzx extends zza {
    public static final Creator CREATOR = new AnonymousClass1zb();
    /* renamed from: B */
    public Account f25091B;
    /* renamed from: C */
    public zzc[] f25092C;
    /* renamed from: D */
    public String f25093D;
    /* renamed from: E */
    public IBinder f25094E;
    /* renamed from: F */
    public Scope[] f25095F;
    /* renamed from: G */
    public Bundle f25096G;
    /* renamed from: H */
    private int f25097H;
    /* renamed from: I */
    private int f25098I;
    /* renamed from: J */
    private int f25099J;

    public zzx(int i) {
        this.f25097H = 3;
        this.f25099J = 11020000;
        this.f25098I = i;
    }

    public zzx(int r5, int r6, int r7, java.lang.String r8, android.os.IBinder r9, com.google.android.gms.common.api.Scope[] r10, android.os.Bundle r11, android.accounts.Account r12, com.google.android.gms.common.zzc[] r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r4.<init>();
        r4.f25097H = r5;
        r4.f25098I = r6;
        r4.f25099J = r7;
        r0 = "com.google.android.gms";
        r0 = r0.equals(r8);
        if (r0 == 0) goto L_0x0016;
    L_0x0011:
        r0 = "com.google.android.gms";
        r4.f25093D = r0;
        goto L_0x0018;
    L_0x0016:
        r4.f25093D = r8;
    L_0x0018:
        r0 = 2;
        if (r5 >= r0) goto L_0x0054;
    L_0x001b:
        r1 = 0;
        if (r9 == 0) goto L_0x0051;
    L_0x001e:
        if (r9 != 0) goto L_0x0021;
    L_0x0020:
        goto L_0x0033;
    L_0x0021:
        r0 = "com.google.android.gms.common.internal.IAccountAccessor";
        r1 = r9.queryLocalInterface(r0);
        r0 = r1 instanceof com.google.android.gms.common.internal.zzal;
        if (r0 == 0) goto L_0x002e;
    L_0x002b:
        r1 = (com.google.android.gms.common.internal.zzal) r1;
        goto L_0x0033;
    L_0x002e:
        r1 = new com.google.android.gms.common.internal.zzan;
        r1.<init>(r9);
    L_0x0033:
        if (r1 == 0) goto L_0x0050;
    L_0x0035:
        r2 = android.os.Binder.clearCallingIdentity();
        r1 = r1.EI();	 Catch:{ RemoteException -> 0x0046 }
        android.os.Binder.restoreCallingIdentity(r2);
        goto L_0x0051;
    L_0x0041:
        r0 = move-exception;
        android.os.Binder.restoreCallingIdentity(r2);
        throw r0;
    L_0x0046:
        r1 = "AccountAccessor";	 Catch:{ all -> 0x0041 }
        r0 = "Remote account accessor probably died";	 Catch:{ all -> 0x0041 }
        android.util.Log.w(r1, r0);	 Catch:{ all -> 0x0041 }
        android.os.Binder.restoreCallingIdentity(r2);
    L_0x0050:
        r1 = 0;
    L_0x0051:
        r4.f25091B = r1;
        goto L_0x0058;
    L_0x0054:
        r4.f25094E = r9;
        r4.f25091B = r12;
    L_0x0058:
        r4.f25095F = r10;
        r4.f25096G = r11;
        r4.f25092C = r13;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzx.<init>(int, int, int, java.lang.String, android.os.IBinder, com.google.android.gms.common.api.Scope[], android.os.Bundle, android.accounts.Account, com.google.android.gms.common.zzc[]):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.m14073U(parcel);
        AnonymousClass1zC.m14071S(parcel, 1, this.f25097H);
        AnonymousClass1zC.m14071S(parcel, 2, this.f25098I);
        AnonymousClass1zC.m14071S(parcel, 3, this.f25099J);
        AnonymousClass1zC.m14061I(parcel, 4, this.f25093D, false);
        AnonymousClass1zC.m14057E(parcel, 5, this.f25094E, false);
        AnonymousClass1zC.m14066N(parcel, 6, this.f25095F, i, false);
        AnonymousClass1zC.m14056D(parcel, 7, this.f25096G, false);
        AnonymousClass1zC.m14059G(parcel, 8, this.f25091B, i, false);
        AnonymousClass1zC.m14066N(parcel, 10, this.f25092C, i, false);
        AnonymousClass1zC.m14054B(parcel, U);
    }
}
