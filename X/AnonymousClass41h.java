package X;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.41h */
public final class AnonymousClass41h implements AnonymousClass3e1, AnonymousClass0VB {
    /* renamed from: B */
    public final AnonymousClass3dw f48517B;
    /* renamed from: C */
    public Object f48518C;
    /* renamed from: D */
    public boolean f48519D;
    /* renamed from: E */
    public AnonymousClass0VB f48520E;
    /* renamed from: F */
    public String f48521F;
    /* renamed from: G */
    public Object f48522G;
    /* renamed from: H */
    public final AnonymousClass3e1 f48523H;
    /* renamed from: I */
    private boolean f48524I;
    /* renamed from: J */
    private AnonymousClass0IP f48525J;

    public AnonymousClass41h(AnonymousClass0IP anonymousClass0IP, AnonymousClass3e1 anonymousClass3e1, AnonymousClass3dw anonymousClass3dw, Boolean bool) {
        this.f48525J = anonymousClass0IP;
        this.f48523H = anonymousClass3e1;
        this.f48517B = anonymousClass3dw;
        this.f48524I = bool.booleanValue();
        mQA(JsonProperty.USE_DEFAULT_NAME);
    }

    public final void EPA(AnonymousClass0VB anonymousClass0VB) {
        if (this.f48520E != anonymousClass0VB) {
            this.f48520E = anonymousClass0VB;
            AnonymousClass0VB anonymousClass0VB2 = this.f48520E;
            if (anonymousClass0VB2 != null) {
                anonymousClass0VB2.Pv(this);
            }
        }
    }

    public final String LQ() {
        AnonymousClass3e1 anonymousClass3e1 = this.f48523H;
        return anonymousClass3e1 != null ? anonymousClass3e1.LQ() : this.f48521F;
    }

    public final void Pv(AnonymousClass3e1 anonymousClass3e1) {
        AnonymousClass0LH.E(this.f48523H);
        if (this.f48523H.LQ().equals(this.f48521F)) {
            this.f48522G = this.f48517B.mE(this.f48518C, this.f48523H.uQ());
            AnonymousClass0VB anonymousClass0VB = this.f48520E;
            if (anonymousClass0VB != null) {
                anonymousClass0VB.Pv(this);
            }
        }
    }

    public final String QQ() {
        AnonymousClass3e1 anonymousClass3e1 = this.f48523H;
        return anonymousClass3e1 == null ? null : anonymousClass3e1.QQ();
    }

    public final boolean UX() {
        AnonymousClass3e1 anonymousClass3e1 = this.f48523H;
        return anonymousClass3e1 != null && anonymousClass3e1.UX();
    }

    public final void WLA() {
        AnonymousClass3e1 anonymousClass3e1 = this.f48523H;
        if (anonymousClass3e1 != null) {
            anonymousClass3e1.WLA();
        }
    }

    public final void mQA(String str) {
        this.f48521F = str;
        this.f48518C = null;
        this.f48522G = this.f48517B.AH();
        if (str.isEmpty()) {
            if (!this.f48524I) {
                AnonymousClass3e1 anonymousClass3e1 = this.f48523H;
                if (anonymousClass3e1 != null) {
                    anonymousClass3e1.mQA(str);
                    return;
                }
                return;
            }
        }
        this.f48519D = true;
        this.f48525J.schedule(new AnonymousClass3dv(this, str));
    }

    public final Object uQ() {
        return this.f48522G;
    }

    public final boolean uX() {
        if (!this.f48519D) {
            AnonymousClass3e1 anonymousClass3e1 = this.f48523H;
            if (anonymousClass3e1 == null || !anonymousClass3e1.uX()) {
                return false;
            }
        }
        return true;
    }
}
