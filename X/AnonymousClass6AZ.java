package X;

import android.os.Handler;
import java.lang.ref.WeakReference;

/* renamed from: X.6AZ */
public final class AnonymousClass6AZ {
    /* renamed from: B */
    public AnonymousClass6Gv f72538B;
    /* renamed from: C */
    public final AnonymousClass0Qp f72539C;
    /* renamed from: D */
    public final AnonymousClass1RM f72540D = new AnonymousClass1RM(this);
    /* renamed from: E */
    public final AnonymousClass6AY f72541E;
    /* renamed from: F */
    public final Handler f72542F;
    /* renamed from: G */
    public final AnonymousClass0HT f72543G;
    /* renamed from: H */
    public final AnonymousClass6B4 f72544H;
    /* renamed from: I */
    private final AnonymousClass0F4 f72545I;
    /* renamed from: J */
    private final AnonymousClass0F8 f72546J = new AnonymousClass6AX(this);

    public AnonymousClass6AZ(AnonymousClass6B4 anonymousClass6B4, AnonymousClass0F4 anonymousClass0F4, AnonymousClass6AY anonymousClass6AY, Handler handler, AnonymousClass0Qp anonymousClass0Qp, AnonymousClass0HT anonymousClass0HT) {
        this.f72544H = anonymousClass6B4;
        this.f72545I = anonymousClass0F4;
        this.f72541E = anonymousClass6AY;
        this.f72542F = handler;
        this.f72543G = anonymousClass0HT;
        this.f72539C = anonymousClass0Qp;
    }

    /* renamed from: A */
    public final void m29275A(AnonymousClass6Gv anonymousClass6Gv) {
        this.f72538B = anonymousClass6Gv;
        if (anonymousClass6Gv != null) {
            this.f72545I.A(AnonymousClass0RN.class, this.f72546J);
        } else {
            this.f72545I.D(AnonymousClass0RN.class, this.f72546J);
        }
    }

    /* renamed from: B */
    public final void m29276B() {
        this.f72543G.A();
        this.f72544H.f72668B.m29850B();
    }

    /* renamed from: C */
    public final void m29277C() {
        this.f72541E.removeCallbacksAndMessages(null);
        this.f72541E.f72536C = new WeakReference(null);
    }
}
