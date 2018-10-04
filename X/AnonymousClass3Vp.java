package X;

import android.text.TextUtils;

/* renamed from: X.3Vp */
public final class AnonymousClass3Vp {
    /* renamed from: B */
    public final int f41792B;
    /* renamed from: C */
    public final long f41793C;
    /* renamed from: D */
    public final int f41794D;
    /* renamed from: E */
    public final int f41795E;
    /* renamed from: F */
    public final AnonymousClass3Vr[] f41796F;
    /* renamed from: G */
    public final String f41797G;
    /* renamed from: H */
    public final int f41798H;
    /* renamed from: I */
    public final int f41799I;

    public AnonymousClass3Vp(String str, int i, String str2, AnonymousClass3Vr[] anonymousClass3VrArr) {
        this(str, i, str2, anonymousClass3VrArr, 0, Long.MAX_VALUE);
    }

    public AnonymousClass3Vp(String str, int i, String str2, AnonymousClass3Vr[] anonymousClass3VrArr, int i2, long j) {
        String B = AnonymousClass0Dt.f1941C.B();
        this.f41799I = i;
        this.f41797G = str2;
        this.f41796F = anonymousClass3VrArr;
        this.f41792B = i2;
        if (i2 >= anonymousClass3VrArr.length) {
            throw new IllegalArgumentException("Deploy group does not exist.");
        } else if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Salt cannot be empty.");
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(B);
            this.f41798H = (int) (AnonymousClass3Vp.m19776C(stringBuilder.toString()) % ((long) i));
            int i3 = 0;
            int i4 = 0;
            for (AnonymousClass3Vr anonymousClass3Vr : anonymousClass3VrArr) {
                i3 += anonymousClass3Vr.f41804C;
                if (this.f41798H >= i3) {
                    i4++;
                }
            }
            if (i3 <= i) {
                if (i4 < anonymousClass3VrArr.length) {
                    i2 = i4;
                }
                this.f41794D = i2;
                this.f41795E = i3;
                this.f41793C = j;
                return;
            }
            throw new IllegalArgumentException("Total group size exceeds number of segments.");
        }
    }

    /* renamed from: A */
    public final AnonymousClass3Vr m19777A() {
        String B = m19778B();
        if (B != null) {
            return m19775B(B);
        }
        return this.f41796F[this.f41794D];
    }

    /* renamed from: B */
    private AnonymousClass3Vr m19775B(String str) {
        for (AnonymousClass3Vr anonymousClass3Vr : this.f41796F) {
            if (anonymousClass3Vr.f41803B.equals(str)) {
                return anonymousClass3Vr;
            }
        }
        return this.f41796F[0];
    }

    /* renamed from: B */
    public final String m19778B() {
        AnonymousClass0FZ B = AnonymousClass0FZ.B();
        return B.f2177B.getString(this.f41797G, null);
    }

    /* renamed from: C */
    private static long m19776C(java.lang.String r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = 0;
        r0 = "MD5";	 Catch:{ NoSuchAlgorithmException -> 0x0028 }
        r1 = java.security.MessageDigest.getInstance(r0);	 Catch:{ NoSuchAlgorithmException -> 0x0028 }
        r0 = r6.getBytes();
        r3 = r1.digest(r0);
        r1 = 0;
        r0 = r3.length;
        r0 = r0 + -4;
        r2 = java.lang.Math.max(r1, r0);
    L_0x0018:
        r0 = r3.length;
        if (r2 >= r0) goto L_0x0027;
    L_0x001b:
        r0 = 8;
        r4 = r4 << r0;
        r0 = r3[r2];
        r0 = r0 & 255;
        r0 = (long) r0;
        r4 = r4 | r0;
        r2 = r2 + 1;
        goto L_0x0018;
    L_0x0027:
        return r4;
    L_0x0028:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.3Vp.C(java.lang.String):long");
    }
}
