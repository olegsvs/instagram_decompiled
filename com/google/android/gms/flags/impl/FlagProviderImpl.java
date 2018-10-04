package com.google.android.gms.flags.impl;

import X.AnonymousClass0cQ;
import X.AnonymousClass1ht;
import X.AnonymousClass2Sh;
import X.AnonymousClass2Si;
import X.AnonymousClass2Sj;
import android.content.SharedPreferences;
import com.google.android.gms.internal.zzcad;

public class FlagProviderImpl extends zzcad {
    /* renamed from: B */
    private SharedPreferences f31887B;
    /* renamed from: C */
    private boolean f31888C = false;

    public FlagProviderImpl() {
        int I = AnonymousClass0cQ.I(this, -1741199633);
        AnonymousClass0cQ.H(this, -1023645763, I);
    }

    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        int I = AnonymousClass0cQ.I(this, -2070042418);
        if (this.f31888C) {
            boolean booleanValue = AnonymousClass2Sh.m15806B(this.f31887B, str, Boolean.valueOf(z)).booleanValue();
            AnonymousClass0cQ.H(this, 1630667707, I);
            return booleanValue;
        }
        AnonymousClass0cQ.H(this, 1788763518, I);
        return z;
    }

    public int getIntFlagValue(String str, int i, int i2) {
        int I = AnonymousClass0cQ.I(this, 2065136014);
        if (this.f31888C) {
            int intValue = AnonymousClass2Si.m15807B(this.f31887B, str, Integer.valueOf(i)).intValue();
            AnonymousClass0cQ.H(this, 716281568, I);
            return intValue;
        }
        AnonymousClass0cQ.H(this, -697527951, I);
        return i;
    }

    public long getLongFlagValue(String str, long j, int i) {
        int I = AnonymousClass0cQ.I(this, -2136135437);
        if (this.f31888C) {
            long longValue = AnonymousClass2Sj.m15808B(this.f31887B, str, Long.valueOf(j)).longValue();
            AnonymousClass0cQ.H(this, -2105866292, I);
            return longValue;
        }
        AnonymousClass0cQ.H(this, 1634664166, I);
        return j;
    }

    public String getStringFlagValue(String str, String str2, int i) {
        int I = AnonymousClass0cQ.I(this, -1939083101);
        if (this.f31888C) {
            String B = AnonymousClass1ht.B(this.f31887B, str, str2);
            AnonymousClass0cQ.H(this, -1556420234, I);
            return B;
        }
        AnonymousClass0cQ.H(this, 440927957, I);
        return str2;
    }

    public void init(com.google.android.gms.dynamic.IObjectWrapper r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = -1400581887; // 0xffffffffac84d101 float:-3.7748697E-12 double:NaN;
        r4 = X.AnonymousClass0cQ.I(r5, r0);
        r2 = com.google.android.gms.dynamic.zzn.B(r6);
        r2 = (android.content.Context) r2;
        r0 = r5.f31888C;
        if (r0 == 0) goto L_0x0018;
    L_0x0011:
        r0 = 1138904607; // 0x43e24e1f float:452.61032 double:5.6269364E-315;
    L_0x0014:
        X.AnonymousClass0cQ.H(r5, r0, r4);
        return;
    L_0x0018:
        r1 = "com.google.android.gms";	 Catch:{ NameNotFoundException -> 0x0063, Exception -> 0x003f }
        r0 = 0;	 Catch:{ NameNotFoundException -> 0x0063, Exception -> 0x003f }
        r2 = r2.createPackageContext(r1, r0);	 Catch:{ NameNotFoundException -> 0x0063, Exception -> 0x003f }
        r1 = android.content.SharedPreferences.class;	 Catch:{ NameNotFoundException -> 0x0063, Exception -> 0x003f }
        monitor-enter(r1);	 Catch:{ NameNotFoundException -> 0x0063, Exception -> 0x003f }
        r0 = X.AnonymousClass1zq.f25121B;	 Catch:{ all -> 0x0067 }
        if (r0 != 0) goto L_0x0033;	 Catch:{ all -> 0x0067 }
    L_0x0026:
        r0 = new X.1zr;	 Catch:{ all -> 0x0067 }
        r0.<init>(r2);	 Catch:{ all -> 0x0067 }
        r0 = X.AnonymousClass20z.m14172B(r0);	 Catch:{ all -> 0x0067 }
        r0 = (android.content.SharedPreferences) r0;	 Catch:{ all -> 0x0067 }
        X.AnonymousClass1zq.f25121B = r0;	 Catch:{ all -> 0x0067 }
    L_0x0033:
        r0 = X.AnonymousClass1zq.f25121B;	 Catch:{ all -> 0x0067 }
        monitor-exit(r1);	 Catch:{ all -> 0x0067 }
        r5.f31887B = r0;	 Catch:{ NameNotFoundException -> 0x0063, Exception -> 0x003f }
        r0 = 1;	 Catch:{ NameNotFoundException -> 0x0063, Exception -> 0x003f }
        r5.f31888C = r0;	 Catch:{ NameNotFoundException -> 0x0063, Exception -> 0x003f }
        r0 = -752775161; // 0xffffffffd3219007 float:-6.9390611E11 double:NaN;	 Catch:{ NameNotFoundException -> 0x0063, Exception -> 0x003f }
        goto L_0x0014;	 Catch:{ NameNotFoundException -> 0x0063, Exception -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        r3 = "FlagProviderImpl";
        r2 = "Could not retrieve sdk flags, continuing with defaults: ";
        r0 = r0.getMessage();
        r1 = java.lang.String.valueOf(r0);
        r0 = r1.length();
        if (r0 == 0) goto L_0x0057;
    L_0x0052:
        r0 = r2.concat(r1);
        goto L_0x005c;
    L_0x0057:
        r0 = new java.lang.String;
        r0.<init>(r2);
    L_0x005c:
        android.util.Log.w(r3, r0);
        r0 = -537315490; // 0xffffffffdff9375e float:-3.591585E19 double:NaN;
        goto L_0x0014;
    L_0x0063:
        r0 = 190901158; // 0xb60eba6 float:4.3318113E-32 double:9.4317704E-316;
        goto L_0x0014;
    L_0x0067:
        r0 = move-exception;	 Catch:{ all -> 0x0067 }
        monitor-exit(r1);	 Catch:{ all -> 0x0067 }
        throw r0;	 Catch:{ NameNotFoundException -> 0x0063, Exception -> 0x003f }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.flags.impl.FlagProviderImpl.init(com.google.android.gms.dynamic.IObjectWrapper):void");
    }
}
