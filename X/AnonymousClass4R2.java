package X;

/* renamed from: X.4R2 */
public final class AnonymousClass4R2 {
    /* renamed from: B */
    public final AnonymousClass4R0 f54018B;
    /* renamed from: C */
    public final AnonymousClass4RE f54019C;
    /* renamed from: D */
    public final AnonymousClass4Tr f54020D;
    /* renamed from: E */
    public final AnonymousClass4RF f54021E;

    public AnonymousClass4R2(AnonymousClass4Tr anonymousClass4Tr, AnonymousClass4R0 anonymousClass4R0, AnonymousClass4RE anonymousClass4RE, AnonymousClass4RF anonymousClass4RF) {
        this.f54020D = anonymousClass4Tr;
        this.f54018B = anonymousClass4R0;
        this.f54019C = anonymousClass4RE;
        this.f54021E = anonymousClass4RF;
    }

    /* renamed from: A */
    public final AnonymousClass0OA m24205A() {
        AnonymousClass4RE anonymousClass4RE = this.f54019C;
        if (anonymousClass4RE != null) {
            return anonymousClass4RE.f54059E;
        }
        AnonymousClass4RF anonymousClass4RF = this.f54021E;
        if (anonymousClass4RF != null) {
            return anonymousClass4RF.f54062C;
        }
        throw new IllegalStateException("No pending media associated with saved edits");
    }
}
