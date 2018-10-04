package X;

/* renamed from: X.5PH */
public final class AnonymousClass5PH {
    /* renamed from: B */
    public static AnonymousClass5NV m26427B(AnonymousClass5PG anonymousClass5PG) {
        return new AnonymousClass5NV(anonymousClass5PG.m26426B(), AnonymousClass5PH.m26429D(anonymousClass5PG, 1));
    }

    /* renamed from: C */
    public static AnonymousClass5NV m26428C(AnonymousClass5PG anonymousClass5PG, int i) {
        return new AnonymousClass5NV(anonymousClass5PG.m26426B(), AnonymousClass5PH.m26429D(anonymousClass5PG, i));
    }

    /* renamed from: D */
    private static String m26429D(AnonymousClass5PG anonymousClass5PG, int i) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            stringBuilder.appendCodePoint(anonymousClass5PG.m26425A());
        }
        return stringBuilder.toString();
    }
}
