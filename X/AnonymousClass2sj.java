package X;

/* renamed from: X.2sj */
public final class AnonymousClass2sj {
    /* renamed from: B */
    private static final int[] f35302B = new int[]{AnonymousClass2u6.m17654G("isom"), AnonymousClass2u6.m17654G("iso2"), AnonymousClass2u6.m17654G("iso3"), AnonymousClass2u6.m17654G("iso4"), AnonymousClass2u6.m17654G("iso5"), AnonymousClass2u6.m17654G("iso6"), AnonymousClass2u6.m17654G("avc1"), AnonymousClass2u6.m17654G("hvc1"), AnonymousClass2u6.m17654G("hev1"), AnonymousClass2u6.m17654G("mp41"), AnonymousClass2u6.m17654G("mp42"), AnonymousClass2u6.m17654G("3g2a"), AnonymousClass2u6.m17654G("3g2b"), AnonymousClass2u6.m17654G("3gr6"), AnonymousClass2u6.m17654G("3gs6"), AnonymousClass2u6.m17654G("3ge6"), AnonymousClass2u6.m17654G("3gg6"), AnonymousClass2u6.m17654G("M4V "), AnonymousClass2u6.m17654G("M4A "), AnonymousClass2u6.m17654G("f4v "), AnonymousClass2u6.m17654G("kddi"), AnonymousClass2u6.m17654G("M4VP"), AnonymousClass2u6.m17654G("qt  "), AnonymousClass2u6.m17654G("MSNV")};

    /* renamed from: B */
    public static boolean m17570B(AnonymousClass2sO anonymousClass2sO, int i, boolean z) {
        boolean z2;
        long length = anonymousClass2sO.getLength();
        if (length == -1 || length > ((long) i)) {
            length = (long) i;
        }
        int i2 = (int) length;
        AnonymousClass2tw anonymousClass2tw = new AnonymousClass2tw(64);
        Object obj = null;
        long I;
        for (int i3 = 0; i3 < i2; i3 = (int) (((long) i3) + I)) {
            int i4;
            anonymousClass2sO.JHA(anonymousClass2tw.f35498B, 0, 8);
            anonymousClass2tw.m17638O(0);
            I = anonymousClass2tw.m17632I();
            int D = anonymousClass2tw.m17627D();
            if (I == 1) {
                anonymousClass2sO.JHA(anonymousClass2tw.f35498B, 8, 8);
                I = anonymousClass2tw.m17629F();
                i4 = 16;
            } else {
                i4 = 8;
            }
            if (I < ((long) i4)) {
                return false;
            }
            int i5 = ((int) I) - i4;
            if (D == AnonymousClass2sa.f35253b) {
                if (i5 < 8) {
                    return false;
                }
                i4 = ((i5 - 8) / 4) + 2;
                anonymousClass2sO.JHA(anonymousClass2tw.f35498B, 0, i4 * 4);
                for (int i6 = 0; i6 < i4; i6++) {
                    if (i6 != 1) {
                        if (AnonymousClass2sj.m17571C(anonymousClass2tw.m17627D())) {
                            obj = 1;
                            break;
                        }
                    }
                }
                if (obj == null) {
                    return false;
                }
            } else if (D == AnonymousClass2sa.f35266o) {
                z2 = true;
                break;
            } else if (i5 == 0) {
                continue;
            } else if (((long) i3) + I >= ((long) i2)) {
                break;
            } else {
                anonymousClass2sO.IC(i5);
            }
        }
        z2 = false;
        if (obj == null || z != r0) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    private static boolean m17571C(int i) {
        if ((i >>> 8) != AnonymousClass2u6.m17654G("3gp")) {
            int[] iArr = f35302B;
            int length = iArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (iArr[i2] != i) {
                    i2++;
                }
            }
            return false;
        }
        return true;
    }
}
