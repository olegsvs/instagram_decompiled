package X;

import java.util.List;

/* renamed from: X.66B */
public final class AnonymousClass66B extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass66C f71715B;

    public AnonymousClass66B(AnonymousClass66C anonymousClass66C) {
        this.f71715B = anonymousClass66C;
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, 1432849999);
        if (this.f71715B.f71718D != null) {
            AnonymousClass0OR.F(this.f71715B.f71718D, new AnonymousClass66A(this), 3000, 239311098);
        }
        AnonymousClass0cQ.H(this, 477690532, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 233618519);
        AnonymousClass5Me anonymousClass5Me = (AnonymousClass5Me) obj;
        int I2 = AnonymousClass0cQ.I(this, 145692570);
        this.f71715B.f71720F = Math.max(anonymousClass5Me.f62650E, this.f71715B.f71720F);
        if (this.f71715B.f71721G) {
            AnonymousClass6G0 anonymousClass6G0 = this.f71715B.f71717C;
            int i = anonymousClass5Me.f62648C;
            List list = anonymousClass5Me.f62649D;
            AnonymousClass6GG anonymousClass6GG = anonymousClass6G0.f73538D;
            if (anonymousClass6GG != null) {
                anonymousClass6GG.m29744J(i, list);
            }
            anonymousClass6G0 = this.f71715B.f71717C;
            i = anonymousClass5Me.f62647B;
            anonymousClass6GG = anonymousClass6G0.f73538D;
            if (anonymousClass6GG != null) {
                anonymousClass6GG.m29742H(i, 0);
            }
        }
        AnonymousClass0cQ.H(this, 1628119570, I2);
        AnonymousClass0cQ.H(this, 423073047, I);
    }
}
