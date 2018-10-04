package X;

/* renamed from: X.5zh */
public final class AnonymousClass5zh implements AnonymousClass0mc {
    /* renamed from: B */
    private boolean f70706B = false;
    /* renamed from: C */
    private final String f70707C;

    public AnonymousClass5zh(AnonymousClass0Ci anonymousClass0Ci, AnonymousClass26y anonymousClass26y) {
        this.f70707C = anonymousClass0Ci.getId();
        if (anonymousClass26y == AnonymousClass26y.Invited) {
            this.f70706B = true;
        }
    }

    public final boolean ON() {
        return this.f70706B;
    }

    public final String getId() {
        return this.f70707C;
    }

    public final void oOA(boolean z) {
        this.f70706B = z;
    }
}
