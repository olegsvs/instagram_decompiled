package X;

/* renamed from: X.0fF */
public final class AnonymousClass0fF {
    /* renamed from: B */
    public long f7879B;
    /* renamed from: C */
    public int f7880C;
    /* renamed from: D */
    public String f7881D;
    /* renamed from: E */
    public long f7882E;

    public AnonymousClass0fF() {
        throw new IllegalStateException("New instances of this class not supported");
    }

    public AnonymousClass0fF(AnonymousClass0fD anonymousClass0fD) {
        this.f7881D = AnonymousClass0fF.m6519B(anonymousClass0fD.f7875D);
        this.f7880C = (int) (anonymousClass0fD.f7876E * 100.0f);
        this.f7882E = anonymousClass0fD.f7878G;
        this.f7879B = anonymousClass0fD.f7877F.m6534A();
    }

    /* renamed from: B */
    public static String m6519B(String str) {
        String[] split = str.split("[_\\-]");
        if (split.length == 2) {
            return split[0];
        }
        if (split.length != 4) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(split[0]);
        stringBuilder.append("-");
        stringBuilder.append(split[2]);
        return stringBuilder.toString();
    }
}
