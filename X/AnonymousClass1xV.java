package X;

import android.os.Build;
import android.os.SystemClock;
import java.util.Random;

/* renamed from: X.1xV */
public final class AnonymousClass1xV {
    /* renamed from: H */
    public static final String f24665H = String.format("PLY:AND:%03d", new Object[]{Integer.valueOf(AnonymousClass1xV.m13921C())});
    /* renamed from: B */
    public final long f24666B;
    /* renamed from: C */
    public final AnonymousClass1xY[] f24667C;
    /* renamed from: D */
    public final String f24668D;
    /* renamed from: E */
    public final String f24669E;
    /* renamed from: F */
    public final String f24670F = f24665H;
    /* renamed from: G */
    public final String f24671G;

    private AnonymousClass1xV(String str, AnonymousClass1xY[] anonymousClass1xYArr, String str2, String str3, long j) {
        this.f24671G = str;
        this.f24667C = anonymousClass1xYArr;
        this.f24668D = str2;
        this.f24669E = str3;
        this.f24666B = j;
    }

    /* renamed from: B */
    public static X.AnonymousClass1xV m13920B(java.lang.String r18, java.util.Map r19, boolean r20) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "x-fb-video-livetrace-ids";
        r8 = r19;
        r0 = r8.get(r0);
        r0 = (java.util.List) r0;
        r14 = 0;
        if (r0 == 0) goto L_0x0076;
    L_0x000d:
        r7 = 0;
        r1 = r0.get(r7);
        r1 = (java.lang.String) r1;
        r10 = new java.util.ArrayList;
        r10.<init>();
        r0 = ",[\\s]*";
        r12 = r1.split(r0);
        r11 = r12.length;
        r13 = 0;
        r9 = 0;
    L_0x0022:
        if (r9 >= r11) goto L_0x0047;
    L_0x0024:
        r1 = r12[r9];
        r0 = ":";	 Catch:{ NumberFormatException -> 0x0044 }
        r1 = r1.split(r0);	 Catch:{ NumberFormatException -> 0x0044 }
        r6 = new X.1xY;	 Catch:{ NumberFormatException -> 0x0044 }
        r0 = r1[r13];	 Catch:{ NumberFormatException -> 0x0044 }
        r4 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x0044 }
        r0 = 1;	 Catch:{ NumberFormatException -> 0x0044 }
        r0 = r1[r0];	 Catch:{ NumberFormatException -> 0x0044 }
        r2 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x0044 }
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ NumberFormatException -> 0x0044 }
        r2 = r2 * r0;	 Catch:{ NumberFormatException -> 0x0044 }
        r6.<init>(r4, r2);	 Catch:{ NumberFormatException -> 0x0044 }
        r10.add(r6);	 Catch:{ NumberFormatException -> 0x0044 }
    L_0x0044:
        r9 = r9 + 1;
        goto L_0x0022;
    L_0x0047:
        r0 = r10.size();
        r0 = new X.AnonymousClass1xY[r0];
        r13 = r10.toArray(r0);
        r13 = (X.AnonymousClass1xY[]) r13;
        r0 = "x-fb-video-livetrace-parentsource";
        r0 = r8.get(r0);
        r0 = (java.util.List) r0;
        if (r0 == 0) goto L_0x0063;
    L_0x005d:
        r14 = r0.get(r7);
        r14 = (java.lang.String) r14;
    L_0x0063:
        if (r20 == 0) goto L_0x0068;
    L_0x0065:
        r15 = "SUCCESS";
        goto L_0x006a;
    L_0x0068:
        r15 = "ERROR";
    L_0x006a:
        r11 = new X.1xV;
        r16 = java.lang.System.currentTimeMillis();
        r12 = r18;
        r11.<init>(r12, r13, r14, r15, r16);
        return r11;
    L_0x0076:
        return r14;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1xV.B(java.lang.String, java.util.Map, boolean):X.1xV");
    }

    /* renamed from: C */
    private static int m13921C() {
        String str = Build.SERIAL;
        if (str != null) {
            return Math.abs(str.hashCode()) % 997;
        }
        return new Random(SystemClock.elapsedRealtime()).nextInt(997);
    }
}
