package X;

import com.instagram.pendingmedia.model.PendingRecipient;

/* renamed from: X.18M */
public final class AnonymousClass18M extends AnonymousClass0Ut {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass18J f14910B;

    public AnonymousClass18M(AnonymousClass18J anonymousClass18J, AnonymousClass0Cm anonymousClass0Cm) {
        this.f14910B = anonymousClass18J;
        super(anonymousClass0Cm);
    }

    /* renamed from: F */
    public final /* bridge */ /* synthetic */ void mo1341F(AnonymousClass0Cm anonymousClass0Cm, Object obj) {
        int I = AnonymousClass0cQ.m5859I(this, 717392466);
        AnonymousClass0XK anonymousClass0XK = (AnonymousClass0XK) obj;
        int I2 = AnonymousClass0cQ.m5859I(this, 427524522);
        AnonymousClass0Tw anonymousClass0Tw = this.f14910B.f14904K;
        int i = anonymousClass0XK.f6139E;
        synchronized (anonymousClass0Tw) {
            anonymousClass0Tw.f5283C.f5981I = i;
        }
        anonymousClass0Tw = this.f14910B.f14904K;
        PendingRecipient pendingRecipient = anonymousClass0XK.f6138D;
        synchronized (anonymousClass0Tw) {
            anonymousClass0Tw.f5283C.f5980H = pendingRecipient;
        }
        AnonymousClass0Tw anonymousClass0Tw2 = this.f14910B.f14904K;
        AnonymousClass0XM anonymousClass0XM = anonymousClass0XK.f6137C;
        synchronized (anonymousClass0Tw2) {
            anonymousClass0Tw2.f5289I = anonymousClass0XM;
        }
        AnonymousClass0F4.f2058E.m1505B(new AnonymousClass0XN());
        AnonymousClass0cQ.m5858H(this, 1625217611, I2);
        AnonymousClass0cQ.m5858H(this, 671122128, I);
    }
}
