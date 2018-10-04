package X;

/* renamed from: X.47I */
public final class AnonymousClass47I implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Rg f50415B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass5Rh f50416C;

    public AnonymousClass47I(AnonymousClass5Rg anonymousClass5Rg, AnonymousClass5Rh anonymousClass5Rh) {
        this.f50415B = anonymousClass5Rg;
        this.f50416C = anonymousClass5Rh;
    }

    public final void run() {
        if (this.f50416C.f63440V != null) {
            this.f50416C.f63440V.f72221B.f72227G.C("onRtmpFinished");
        }
        this.f50415B.f63418B.clear();
        AnonymousClass0Gb.D(this, getClass().getSimpleName());
    }
}
