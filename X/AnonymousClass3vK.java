package X;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Stack;

/* renamed from: X.3vK */
public final class AnonymousClass3vK implements AnonymousClass2vV {
    /* renamed from: B */
    public AnonymousClass2vW f46833B;
    /* renamed from: C */
    public final byte[] f46834C = new byte[8];
    /* renamed from: D */
    private long f46835D;
    /* renamed from: E */
    private int f46836E;
    /* renamed from: F */
    private int f46837F;
    /* renamed from: G */
    private final Stack f46838G = new Stack();
    /* renamed from: H */
    private final AnonymousClass2va f46839H = new AnonymousClass2va();

    /* renamed from: B */
    public static long m21488B(AnonymousClass3vK anonymousClass3vK, AnonymousClass2vK anonymousClass2vK, int i) {
        int i2 = 0;
        anonymousClass2vK.readFully(anonymousClass3vK.f46834C, 0, i);
        long j = 0;
        while (i2 < i) {
            j = (j << 8) | ((long) (anonymousClass3vK.f46834C[i2] & 255));
            i2++;
        }
        return j;
    }

    /* renamed from: C */
    private static String m21489C(AnonymousClass2vK anonymousClass2vK, int i) {
        if (i == 0) {
            return JsonProperty.USE_DEFAULT_NAME;
        }
        byte[] bArr = new byte[i];
        anonymousClass2vK.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == (byte) 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    public final void CW(AnonymousClass2vW anonymousClass2vW) {
        this.f46833B = anonymousClass2vW;
    }

    public final boolean fIA(AnonymousClass2vK anonymousClass2vK) {
        AnonymousClass2yO.m18017F(this.f46833B != null);
        while (true) {
            if (this.f46838G.isEmpty() || anonymousClass2vK.gP() < ((AnonymousClass2vU) this.f46838G.peek()).f35804B) {
                long A;
                int C;
                int B;
                if (this.f46837F == 0) {
                    A = this.f46839H.m17784A(anonymousClass2vK, true, false, 4);
                    if (A == -2) {
                        anonymousClass2vK.MLA();
                        while (true) {
                            anonymousClass2vK.JHA(this.f46834C, 0, 4);
                            C = AnonymousClass2va.m17783C(this.f46834C[0]);
                            if (C != -1 && C <= 4) {
                                B = (int) AnonymousClass2va.m17782B(this.f46834C, C, false);
                                if (this.f46833B.nX(B)) {
                                    anonymousClass2vK.MUA(C);
                                    A = (long) B;
                                }
                            }
                            anonymousClass2vK.MUA(1);
                        }
                    }
                    if (A == -1) {
                        return false;
                    }
                    this.f46836E = (int) A;
                    this.f46837F = 1;
                }
                if (this.f46837F == 1) {
                    this.f46835D = this.f46839H.m17784A(anonymousClass2vK, false, true, 8);
                    this.f46837F = 2;
                }
                C = this.f46833B.YL(this.f46836E);
                StringBuilder stringBuilder;
                switch (C) {
                    case 0:
                        anonymousClass2vK.MUA((int) this.f46835D);
                        this.f46837F = 0;
                    case 1:
                        long gP = anonymousClass2vK.gP();
                        this.f46838G.add(new AnonymousClass2vU(this.f46836E, this.f46835D + gP));
                        this.f46833B.iUA(this.f46836E, gP, this.f46835D);
                        this.f46837F = 0;
                        return true;
                    case 2:
                        long j = this.f46835D;
                        if (j <= 8) {
                            this.f46833B.YW(this.f46836E, AnonymousClass3vK.m21488B(this, anonymousClass2vK, (int) j));
                            this.f46837F = 0;
                            return true;
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Invalid integer size: ");
                        stringBuilder.append(this.f46835D);
                        throw new AnonymousClass2uR(stringBuilder.toString());
                    case 3:
                        A = this.f46835D;
                        if (A <= 2147483647L) {
                            this.f46833B.HVA(this.f46836E, AnonymousClass3vK.m21489C(anonymousClass2vK, (int) A));
                            this.f46837F = 0;
                            return true;
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("String element size: ");
                        stringBuilder.append(this.f46835D);
                        throw new AnonymousClass2uR(stringBuilder.toString());
                    case 4:
                        this.f46833B.nC(this.f46836E, (int) this.f46835D, anonymousClass2vK);
                        this.f46837F = 0;
                        return true;
                    case 5:
                        double intBitsToFloat;
                        A = this.f46835D;
                        if (A != 4) {
                            if (A != 8) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Invalid float size: ");
                                stringBuilder.append(this.f46835D);
                                throw new AnonymousClass2uR(stringBuilder.toString());
                            }
                        }
                        AnonymousClass2vW anonymousClass2vW = this.f46833B;
                        int i = this.f46836E;
                        B = (int) this.f46835D;
                        A = AnonymousClass3vK.m21488B(this, anonymousClass2vK, B);
                        if (B == 4) {
                            intBitsToFloat = (double) Float.intBitsToFloat((int) A);
                        } else {
                            intBitsToFloat = Double.longBitsToDouble(A);
                        }
                        anonymousClass2vW.lH(i, intBitsToFloat);
                        this.f46837F = 0;
                        return true;
                    default:
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Invalid element type ");
                        stringBuilder2.append(C);
                        throw new AnonymousClass2uR(stringBuilder2.toString());
                }
            }
            this.f46833B.LH(((AnonymousClass2vU) this.f46838G.pop()).f35805C);
            return true;
        }
    }

    public final void reset() {
        this.f46837F = 0;
        this.f46838G.clear();
        AnonymousClass2va anonymousClass2va = this.f46839H;
        anonymousClass2va.f35859C = 0;
        anonymousClass2va.f35858B = 0;
    }
}
