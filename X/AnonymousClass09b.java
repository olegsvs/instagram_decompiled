package X;

/* renamed from: X.09b */
public final class AnonymousClass09b {
    /* renamed from: B */
    private AnonymousClass4ib f1092B;
    /* renamed from: C */
    private final AnonymousClass0U3 f1093C;
    /* renamed from: D */
    private final String f1094D;
    /* renamed from: E */
    private final AnonymousClass0Oc f1095E;

    public AnonymousClass09b(String str, AnonymousClass0Oc anonymousClass0Oc, AnonymousClass0U3 anonymousClass0U3) {
        this.f1094D = str;
        this.f1095E = anonymousClass0Oc;
        this.f1093C = anonymousClass0U3;
    }

    /* renamed from: A */
    public final AnonymousClass09b m627A(AnonymousClass4ib anonymousClass4ib) {
        this.f1092B = anonymousClass4ib;
        return this;
    }

    /* renamed from: B */
    public final void m628B() {
        AnonymousClass0Xq.f6205B.m3630A(this.f1094D, this.f1095E);
        String str = this.f1094D;
        AnonymousClass0U3 anonymousClass0U3 = this.f1093C;
        synchronized (AnonymousClass0Xg.class) {
            boolean z = !AnonymousClass0Xg.f6183C.containsKey(str);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DirectMutationProcessor already defined for type: ");
            stringBuilder.append(str);
            AnonymousClass0LH.m2925C(z, stringBuilder.toString());
            AnonymousClass0Xg.f6183C.put(str, anonymousClass0U3);
        }
        AnonymousClass4ib anonymousClass4ib = this.f1092B;
        if (anonymousClass4ib != null) {
            String str2 = this.f1094D;
            z = AnonymousClass5WY.f65646C.containsKey(str2) ^ 1;
            stringBuilder = new StringBuilder();
            stringBuilder.append("DirectMutationLogger already defined for type: ");
            stringBuilder.append(str2);
            AnonymousClass0LH.m2925C(z, stringBuilder.toString());
            AnonymousClass5WY.f65646C.put(str2, anonymousClass4ib);
        }
    }
}
