package X;

/* renamed from: X.1Sy */
public final class AnonymousClass1Sy {
    /* renamed from: B */
    public static AnonymousClass0Vw m11515B(AnonymousClass0Cm anonymousClass0Cm, String str) {
        try {
            AnonymousClass0Vw parseFromJson = AnonymousClass1So.parseFromJson(str);
            parseFromJson.f5802B = anonymousClass0Cm.m1037B();
            parseFromJson.m4971q(AnonymousClass0X7.m5221F(anonymousClass0Cm, parseFromJson.m4938J()));
            return parseFromJson;
        } catch (AnonymousClass0Cm anonymousClass0Cm2) {
            AnonymousClass0Gn.m1883J("DirectThreadSummaryFactory", "Error parsing json string", anonymousClass0Cm2);
            return null;
        }
    }
}
