package X;

/* renamed from: X.2yQ */
public final class AnonymousClass2yQ {
    /* renamed from: B */
    public static final int[] f36509B = new int[]{0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    /* renamed from: C */
    private static final int[] f36510C = new int[]{96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    /* renamed from: D */
    public static final byte[] f36511D = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 1};

    /* renamed from: B */
    public static int m18018B(AnonymousClass2yb anonymousClass2yb) {
        int E = anonymousClass2yb.m18042E(5);
        return E == 31 ? anonymousClass2yb.m18042E(6) + 32 : E;
    }

    /* renamed from: C */
    public static int m18019C(AnonymousClass2yb anonymousClass2yb) {
        int E = anonymousClass2yb.m18042E(4);
        if (E == 15) {
            return anonymousClass2yb.m18042E(24);
        }
        AnonymousClass2yO.m18013B(E < 13);
        return f36510C[E];
    }
}
