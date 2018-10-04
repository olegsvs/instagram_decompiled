package X;

/* renamed from: X.265 */
public final class AnonymousClass265 {
    /* renamed from: B */
    public AnonymousClass264 f25926B;
    /* renamed from: C */
    public boolean f25927C;
    /* renamed from: D */
    public boolean f25928D;
    /* renamed from: E */
    public boolean f25929E;
    /* renamed from: F */
    private boolean f25930F;

    /* renamed from: A */
    public final synchronized void m14418A(AnonymousClass264 anonymousClass264) {
        anonymousClass264.f25908D = true;
        if (this.f25926B == anonymousClass264) {
            this.f25926B = null;
        }
        notifyAll();
    }

    /* renamed from: B */
    public static void m14417B(AnonymousClass265 anonymousClass265) {
        if (!anonymousClass265.f25930F) {
            if (AnonymousClass2V0.f30978N >= 131072) {
                anonymousClass265.f25929E = true;
            }
            anonymousClass265.f25930F = true;
        }
    }

    /* renamed from: B */
    public final boolean m14419B(AnonymousClass264 anonymousClass264) {
        AnonymousClass264 anonymousClass2642 = this.f25926B;
        if (anonymousClass2642 != anonymousClass264) {
            if (anonymousClass2642 != null) {
                AnonymousClass265.m14417B(this);
                if (this.f25929E) {
                    return true;
                }
                AnonymousClass264 anonymousClass2643 = this.f25926B;
                if (anonymousClass2643 != null) {
                    anonymousClass2643.f25921Q = true;
                    AnonymousClass2V0.f30979O.notifyAll();
                }
                return false;
            }
        }
        this.f25926B = anonymousClass264;
        notifyAll();
        return true;
    }
}
