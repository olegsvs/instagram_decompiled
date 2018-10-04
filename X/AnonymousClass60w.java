package X;

/* renamed from: X.60w */
public final class AnonymousClass60w implements AnonymousClass1DQ {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass60y f70904B;

    public final boolean XTA() {
        return true;
    }

    public AnonymousClass60w(AnonymousClass60y anonymousClass60y) {
        this.f70904B = anonymousClass60y;
    }

    public final void Yt(AnonymousClass1Bb anonymousClass1Bb) {
        AnonymousClass60s anonymousClass60s = this.f70904B.f70906B;
        boolean isLocationEnabled = AnonymousClass0JI.isLocationEnabled(this.f70904B.getContext());
        boolean z = anonymousClass1Bb == AnonymousClass1Bb.GRANTED;
        AnonymousClass5EY anonymousClass5EY = anonymousClass60s.f70894D;
        anonymousClass5EY.f61487B = isLocationEnabled;
        anonymousClass5EY.f61488C = z;
        AnonymousClass60s.m28767B(anonymousClass60s);
    }
}
