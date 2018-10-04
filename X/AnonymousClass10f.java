package X;

/* renamed from: X.10f */
public final class AnonymousClass10f {
    /* renamed from: B */
    public static int m8723B(AnonymousClass0MI anonymousClass0MI) {
        return anonymousClass0MI.getId().hashCode();
    }

    /* renamed from: C */
    public static void m8724C(AnonymousClass0MI anonymousClass0MI) {
        AnonymousClass0Ea.f1980C.markerEnd(17301505, AnonymousClass10f.m8723B(anonymousClass0MI), (short) 2);
    }

    /* renamed from: D */
    public static void m8725D(AnonymousClass0MI anonymousClass0MI, int i, AnonymousClass0Qf anonymousClass0Qf) {
        AnonymousClass14t anonymousClass14t = new AnonymousClass14t(anonymousClass0MI);
        AnonymousClass0Ea.f1980C.markerStart(17301505, AnonymousClass10f.m8723B(anonymousClass0MI));
        AnonymousClass0Ea.f1980C.markerAnnotate(17301505, AnonymousClass10f.m8723B(anonymousClass0MI), "reel_id", anonymousClass0MI.getId());
        AnonymousClass0Ea.f1980C.markerAnnotate(17301505, AnonymousClass10f.m8723B(anonymousClass0MI), "reel_position", Integer.toString(i));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(AnonymousClass3am.B(anonymousClass14t));
        stringBuilder.append(anonymousClass0Qf.m4038A());
        AnonymousClass0Ea.f1980C.markerAnnotate(17301505, AnonymousClass10f.m8723B(anonymousClass0MI), "entry_point", stringBuilder.toString());
    }

    /* renamed from: E */
    public static void m8726E(AnonymousClass0MI anonymousClass0MI, String str) {
        AnonymousClass0Ea.f1980C.markerAnnotate(17301505, AnonymousClass10f.m8723B(anonymousClass0MI), "cancel_reason", str);
        AnonymousClass0Ea.f1980C.markerEnd(17301505, AnonymousClass10f.m8723B(anonymousClass0MI), (short) 4);
    }
}
