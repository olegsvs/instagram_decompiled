package X;

/* renamed from: X.193 */
public final class AnonymousClass193 extends AnonymousClass0Tb {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0bB f15061B;

    public AnonymousClass193(AnonymousClass0bB anonymousClass0bB) {
        this.f15061B = anonymousClass0bB;
    }

    /* renamed from: C */
    public final void mo1401C(AnonymousClass0a8 anonymousClass0a8, AnonymousClass0aA anonymousClass0aA) {
        AnonymousClass0bB anonymousClass0bB = this.f15061B;
        synchronized (anonymousClass0bB.f6662C) {
            anonymousClass0bB.f6665F.remove(anonymousClass0a8);
            anonymousClass0bB.f6664E.remove(anonymousClass0a8);
            if (anonymousClass0aA.f6460H == AnonymousClass0Qv.API) {
                anonymousClass0bB.f6661B.remove(anonymousClass0a8);
            }
            if (anonymousClass0aA.f6460H == AnonymousClass0Qv.Image) {
                anonymousClass0bB.f6663D--;
            } else if (anonymousClass0aA.f6460H == AnonymousClass0Qv.Video) {
                anonymousClass0bB.f6666G--;
            }
            anonymousClass0bB.m5526A();
        }
    }
}
