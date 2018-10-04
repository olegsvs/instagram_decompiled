package X;

import android.view.Surface;

/* renamed from: X.44q */
public final class AnonymousClass44q extends AnonymousClass3zk {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3zl f49548B;
    /* renamed from: C */
    private AnonymousClass42q f49549C;
    /* renamed from: D */
    private AnonymousClass0PN f49550D;

    public AnonymousClass44q(AnonymousClass3zl anonymousClass3zl, AnonymousClass3oW anonymousClass3oW, AnonymousClass42q anonymousClass42q, AnonymousClass0PN anonymousClass0PN) {
        this.f49548B = anonymousClass3zl;
        super(anonymousClass3zl, anonymousClass3oW);
        this.f49549C = anonymousClass42q;
        this.f49550D = anonymousClass0PN;
        anonymousClass3oW.m20757F(this.f49549C);
    }

    /* renamed from: A */
    public final void mo5097A() {
        m22702C();
    }

    /* renamed from: B */
    private void m22701B() {
        synchronized (this.f49548B.f39876H) {
            this.f49548B.f48004D.a(new Surface(this.f49549C.m22275A()), -1, -1);
            this.f49549C.m22275A().setOnFrameAvailableListener(this.f49548B);
            this.f49548B.f48004D.f20554L = this.f49548B;
            this.f49548B.f48004D.f20553K = this.f49548B;
            this.f49548B.f48004D.c(0.0f);
            try {
                this.f49548B.f48004D.R();
                this.f49548B.f48006F = true;
                this.f49548B.f39877I = true;
                this.f49548B.f48005E = false;
                this.f49548B.f48007G = -1;
            } catch (Throwable e) {
                AnonymousClass0Gn.K("MediaPlayerManager", "Error during MediaPlayer prepare", e, 1);
                throw e;
            }
        }
        AnonymousClass0OR.D(this.f49548B.f39872D, new AnonymousClass3Hq(this), 1162737978);
    }

    /* renamed from: C */
    private void m22702C() {
        synchronized (this.f49548B.f39876H) {
            if (this.f49548B.f39877I) {
                this.f49548B.f39877I = false;
                this.f49548B.f48008H = false;
                if (this.f49548B.f48004D != null) {
                    this.f49548B.f48004D.f20546D = null;
                    this.f49548B.f48004D.f20553K = null;
                    this.f49548B.f48004D.S();
                }
                this.f49548B.f48004D = null;
            }
        }
    }

    /* renamed from: F */
    public final void mo5098F() {
        this.f49550D.FE();
        this.f44808B.m20756E(AnonymousClass3oV.RENDER_WHEN_DIRTY);
        this.f49548B.m21910S();
        m22701B();
        this.f49549C.m22276B(this.f49548B.f39870B);
    }

    /* renamed from: G */
    public final void mo5099G() {
        m22702C();
    }

    /* renamed from: I */
    public final void mo5100I() {
        this.f49548B.m21910S();
        m22701B();
    }

    /* renamed from: J */
    public final void mo5101J() {
        this.f49549C.m22278D(false);
        if (this.f49548B.f39874F != null) {
            AnonymousClass0OR.D(this.f49548B.f39872D, new AnonymousClass3Ho(this), -323846315);
        }
        if (this.f49548B.f39878J != null) {
            AnonymousClass0OR.D(this.f49548B.f39872D, new AnonymousClass3Hp(this), 1594704562);
        }
    }

    /* renamed from: M */
    public final AnonymousClass42q mo5317M() {
        return this.f49549C;
    }
}
