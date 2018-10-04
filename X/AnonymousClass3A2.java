package X;

/* renamed from: X.3A2 */
public final class AnonymousClass3A2 {
    /* renamed from: B */
    public static void m18790B(AnonymousClass399 anonymousClass399, AnonymousClass3A1 anonymousClass3A1, int i) {
        if (i < anonymousClass3A1.f38500C.size() && anonymousClass3A1.f38500C.get(i) != null) {
            anonymousClass3A1.f38500C.remove(i);
        }
        switch (anonymousClass399.ordinal()) {
            case 1:
                anonymousClass3A1.f38500C.add(new AnonymousClass3A7(AnonymousClass3A8.m18794C(anonymousClass3A1.f38499B)));
                break;
            case 2:
                anonymousClass3A1.f38500C.add(new AnonymousClass39y(AnonymousClass39z.m18789C(anonymousClass3A1.f38499B)));
                break;
            default:
                break;
        }
        if (anonymousClass3A1.f38499B.getChildAt(i) != null) {
            anonymousClass3A1.f38499B.removeViewAt(i);
        }
        anonymousClass3A1.f38499B.addView(((AnonymousClass0oo) anonymousClass3A1.f38500C.get(i)).f10370B, i);
    }
}
