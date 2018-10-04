package X;

/* renamed from: X.11X */
public final class AnonymousClass11X {
    /* renamed from: B */
    private static final AnonymousClass0PZ f13419B = new AnonymousClass1J9();
    /* renamed from: C */
    public static long f13420C;

    /* renamed from: B */
    public static AnonymousClass0bP m8803B(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("instagram_ad_async_ad_");
        stringBuilder.append(str);
        return AnonymousClass0bN.m5543G(stringBuilder.toString(), f13419B);
    }

    /* renamed from: C */
    public static void m8804C(String str, int i, String str2, int i2, int i3) {
        AnonymousClass0bP B = AnonymousClass11X.m8803B("controller_action_fail");
        B.EE = str;
        B.f6740P = i;
        B.f6753c = str2;
        B.f6741Q = Integer.valueOf(i2).intValue();
        B.f6743S = i3;
        B.f6744T = AnonymousClass0Gd.m1838C() - f13420C;
        B.m5577B().m3311S();
    }

    /* renamed from: D */
    public static void m8805D(String str, int i, String str2, int i2, String str3, int i3, int i4) {
        AnonymousClass0bP B = AnonymousClass11X.m8803B("controller_action_fail");
        B.EE = str;
        B.f6740P = i;
        B.f6753c = str2;
        B.f6741Q = Integer.valueOf(i2).intValue();
        B.zB = str3;
        B.f6747W = i3;
        B.f6743S = i4;
        B.m5577B().m3311S();
    }

    /* renamed from: E */
    public static void m8806E(boolean z, boolean z2, int i) {
        AnonymousClass0bP B = AnonymousClass11X.m8803B("rti_status");
        B.f6750Z = Boolean.valueOf(z);
        B.f6755e = Boolean.valueOf(false);
        B.f6745U = Boolean.valueOf(z2);
        B.f6748X = i;
        B.m5577B().m3311S();
    }
}
