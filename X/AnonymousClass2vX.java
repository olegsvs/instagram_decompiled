package X;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.nio.ByteBuffer;

/* renamed from: X.2vX */
public final class AnonymousClass2vX {
    /* renamed from: B */
    public int f35806B = -1;
    /* renamed from: C */
    public int f35807C = 1;
    /* renamed from: D */
    public long f35808D = 0;
    /* renamed from: E */
    public String f35809E;
    /* renamed from: F */
    public byte[] f35810F;
    /* renamed from: G */
    public int f35811G = -1;
    /* renamed from: H */
    public int f35812H = -1;
    /* renamed from: I */
    public int f35813I = -1;
    /* renamed from: J */
    public AnonymousClass2vS f35814J;
    /* renamed from: K */
    public int f35815K;
    /* renamed from: L */
    public int f35816L = -1;
    /* renamed from: M */
    public int f35817M = 0;
    /* renamed from: N */
    public int f35818N = -1;
    /* renamed from: O */
    public DrmInitData f35819O;
    /* renamed from: P */
    public boolean f35820P = true;
    /* renamed from: Q */
    public boolean f35821Q;
    /* renamed from: R */
    public boolean f35822R = false;
    /* renamed from: S */
    public boolean f35823S;
    /* renamed from: T */
    public int f35824T = -1;
    /* renamed from: U */
    public String f35825U = "eng";
    /* renamed from: V */
    public int f35826V = JsonMappingException.MAX_REFS_TO_LIST;
    /* renamed from: W */
    public int f35827W = 200;
    /* renamed from: X */
    public float f35828X = -1.0f;
    /* renamed from: Y */
    public float f35829Y = -1.0f;
    /* renamed from: Z */
    public int f35830Z;
    /* renamed from: a */
    public int f35831a;
    /* renamed from: b */
    public AnonymousClass2vT f35832b;
    /* renamed from: c */
    public float f35833c = -1.0f;
    /* renamed from: d */
    public float f35834d = -1.0f;
    /* renamed from: e */
    public float f35835e = -1.0f;
    /* renamed from: f */
    public float f35836f = -1.0f;
    /* renamed from: g */
    public float f35837g = -1.0f;
    /* renamed from: h */
    public float f35838h = -1.0f;
    /* renamed from: i */
    public byte[] f35839i = null;
    /* renamed from: j */
    public int f35840j = 8000;
    /* renamed from: k */
    public byte[] f35841k;
    /* renamed from: l */
    public long f35842l = 0;
    /* renamed from: m */
    public int f35843m = -1;
    /* renamed from: n */
    public AnonymousClass2vY f35844n;
    /* renamed from: o */
    public int f35845o;
    /* renamed from: p */
    public float f35846p = -1.0f;
    /* renamed from: q */
    public float f35847q = -1.0f;
    /* renamed from: r */
    public int f35848r = -1;

    /* renamed from: B */
    public static byte[] m17775B(AnonymousClass2vX anonymousClass2vX) {
        if (!(anonymousClass2vX.f35837g == -1.0f || anonymousClass2vX.f35838h == -1.0f || anonymousClass2vX.f35835e == -1.0f || anonymousClass2vX.f35836f == -1.0f || anonymousClass2vX.f35833c == -1.0f || anonymousClass2vX.f35834d == -1.0f || anonymousClass2vX.f35846p == -1.0f || anonymousClass2vX.f35847q == -1.0f || anonymousClass2vX.f35828X == -1.0f)) {
            if (anonymousClass2vX.f35829Y != -1.0f) {
                byte[] bArr = new byte[25];
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                wrap.put((byte) 0);
                wrap.putShort((short) ((int) ((anonymousClass2vX.f35837g * 50000.0f) + 0.5f)));
                wrap.putShort((short) ((int) ((anonymousClass2vX.f35838h * 50000.0f) + 0.5f)));
                wrap.putShort((short) ((int) ((anonymousClass2vX.f35835e * 50000.0f) + 0.5f)));
                wrap.putShort((short) ((int) ((anonymousClass2vX.f35836f * 50000.0f) + 0.5f)));
                wrap.putShort((short) ((int) ((anonymousClass2vX.f35833c * 50000.0f) + 0.5f)));
                wrap.putShort((short) ((int) ((anonymousClass2vX.f35834d * 50000.0f) + 0.5f)));
                wrap.putShort((short) ((int) ((anonymousClass2vX.f35846p * 50000.0f) + 0.5f)));
                wrap.putShort((short) ((int) ((anonymousClass2vX.f35847q * 50000.0f) + 0.5f)));
                wrap.putShort((short) ((int) (anonymousClass2vX.f35828X + 0.5f)));
                wrap.putShort((short) ((int) (anonymousClass2vX.f35829Y + 0.5f)));
                wrap.putShort((short) anonymousClass2vX.f35826V);
                wrap.putShort((short) anonymousClass2vX.f35827W);
                return bArr;
            }
        }
        return null;
    }

    /* renamed from: C */
    public static android.util.Pair m17776C(X.AnonymousClass2yc r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 16;
        r8.m18065U(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r5 = r8.f36537B;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r1 = r8.f36539D;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r0 = r1 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r8.f36539D = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r0 = r5[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r3 = (long) r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r3 = r3 & r6;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r1 = r8.f36539D;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r0 = r1 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r8.f36539D = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r0 = r5[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r1 = (long) r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r1 = r1 & r6;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r0 = 8;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r1 = r1 << r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r3 = r3 | r1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r1 = r8.f36539D;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r0 = r1 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r8.f36539D = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r0 = r5[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r1 = (long) r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r1 = r1 & r6;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r0 = 16;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r1 = r1 << r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r3 = r3 | r1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r1 = r8.f36539D;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r0 = r1 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r8.f36539D = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r0 = r5[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r0 = (long) r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r6 = r6 & r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r0 = 24;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r6 = r6 << r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r3 = r3 | r6;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r0 = 1482049860; // 0x58564944 float:9.4244065E14 double:7.322299212E-315;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1));	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r2 = 0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        if (r0 != 0) goto L_0x004d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
    L_0x0045:
        r1 = new android.util.Pair;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r0 = "video/3gpp";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r1.<init>(r0, r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        return r1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
    L_0x004d:
        r0 = 826496599; // 0x31435657 float:2.8425313E-9 double:4.08343576E-315;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1));	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        if (r0 != 0) goto L_0x0094;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
    L_0x0054:
        r0 = r8.f36539D;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r3 = r0 + 20;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r2 = r8.f36537B;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
    L_0x005a:
        r0 = r2.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r0 = r0 + -4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        if (r3 >= r0) goto L_0x008c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
    L_0x005f:
        r0 = r2[r3];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        if (r0 != 0) goto L_0x0089;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
    L_0x0063:
        r0 = r3 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r0 = r2[r0];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        if (r0 != 0) goto L_0x0089;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
    L_0x0069:
        r0 = r3 + 2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r1 = r2[r0];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r0 = 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        if (r1 != r0) goto L_0x0089;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
    L_0x0070:
        r0 = r3 + 3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r1 = r2[r0];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r0 = 15;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        if (r1 != r0) goto L_0x0089;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
    L_0x0078:
        r0 = r2.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r0 = java.util.Arrays.copyOfRange(r2, r3, r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r2 = new android.util.Pair;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r1 = "video/wvc1";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r0 = java.util.Collections.singletonList(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r2.<init>(r1, r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        return r2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
    L_0x0089:
        r3 = r3 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        goto L_0x005a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
    L_0x008c:
        r1 = new X.2uR;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r0 = "Failed to find FourCC VC1 initialization data";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        r1.<init>(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
        throw r1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a3 }
    L_0x0094:
        r1 = "MatroskaExtractor";
        r0 = "Unknown FourCC. Setting mimeType to video/x-unknown";
        android.util.Log.w(r1, r0);
        r1 = new android.util.Pair;
        r0 = "video/x-unknown";
        r1.<init>(r0, r2);
        return r1;
    L_0x00a3:
        r1 = new X.2uR;
        r0 = "Error parsing FourCC private data";
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2vX.C(X.2yc):android.util.Pair");
    }

    /* renamed from: D */
    public static boolean m17777D(X.AnonymousClass2yc r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = r5.f36537B;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
        r1 = r5.f36539D;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
        r0 = r1 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
        r5.f36539D = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
        r0 = r2[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
        r3 = r0 & 255;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
        r1 = r5.f36539D;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
        r0 = r1 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
        r5.f36539D = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
        r0 = r2[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
        r0 = r0 & 255;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
        r2 = r0 << 8;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
        r2 = r2 | r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
        r4 = 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
        if (r2 != r4) goto L_0x001d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
    L_0x001c:
        return r4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
    L_0x001d:
        r1 = 65534; // 0xfffe float:9.1833E-41 double:3.2378E-319;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
        r0 = 0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
        if (r2 != r1) goto L_0x0047;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
    L_0x0023:
        r0 = 24;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
        r5.m18064T(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
        r2 = r5.m18050F();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
        r0 = X.AnonymousClass3vN.FB;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
        r0 = r0.getMostSignificantBits();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
        if (r0 != 0) goto L_0x0045;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
    L_0x0036:
        r2 = r5.m18050F();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
        r0 = X.AnonymousClass3vN.FB;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
        r0 = r0.getLeastSignificantBits();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
        if (r0 != 0) goto L_0x0045;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
    L_0x0044:
        goto L_0x001c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
    L_0x0045:
        r4 = 0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
        goto L_0x001c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
    L_0x0047:
        return r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
    L_0x0048:
        r1 = new X.2uR;
        r0 = "Error parsing MS/ACM codec private";
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2vX.D(X.2yc):boolean");
    }
}
