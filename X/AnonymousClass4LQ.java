package X;

/* renamed from: X.4LQ */
public final class AnonymousClass4LQ {
    /* renamed from: B */
    public static AnonymousClass4LO m23944B(AnonymousClass0Cm anonymousClass0Cm, String str, AnonymousClass4LO[] anonymousClass4LOArr, AnonymousClass4LO anonymousClass4LO) {
        if (str != null) {
            String string = AnonymousClass0HV.D(anonymousClass0Cm).f2646B.getString(AnonymousClass0HV.G(str), null);
            if (string != null) {
                AnonymousClass4LO B = AnonymousClass4LO.m23940B(string);
                if (AnonymousClass4LQ.m23945C(B, anonymousClass4LOArr)) {
                    return B;
                }
            }
        }
        return anonymousClass4LO;
    }

    /* renamed from: C */
    private static boolean m23945C(AnonymousClass4LO anonymousClass4LO, AnonymousClass4LO[] anonymousClass4LOArr) {
        for (AnonymousClass4LO anonymousClass4LO2 : anonymousClass4LOArr) {
            if (anonymousClass4LO2 == anonymousClass4LO) {
                return true;
            }
        }
        return false;
    }
}
