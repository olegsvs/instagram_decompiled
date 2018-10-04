package X;

import android.content.Context;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.4k9 */
public final class AnonymousClass4k9 extends AnonymousClass0Ut {
    /* renamed from: B */
    public final /* synthetic */ Context f56721B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass1Sc f56722C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Tw f56723D;
    /* renamed from: E */
    public final /* synthetic */ DirectThreadKey f56724E;

    public AnonymousClass4k9(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Tw anonymousClass0Tw, DirectThreadKey directThreadKey, AnonymousClass1Sc anonymousClass1Sc, Context context) {
        this.f56723D = anonymousClass0Tw;
        this.f56724E = directThreadKey;
        this.f56722C = anonymousClass1Sc;
        this.f56721B = context;
        super(anonymousClass0Cm);
    }

    /* renamed from: A */
    public final void m24953A(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -1743283049);
        this.f56723D.r(this.f56724E, AnonymousClass0X8.UPLOADED);
        AnonymousClass4Zf.m24510B(this.f56721B, anonymousClass0Q6.B());
        AnonymousClass0cQ.H(this, 1629763547, I);
    }

    /* renamed from: D */
    public final void m24954D(AnonymousClass0Cm anonymousClass0Cm) {
        int I = AnonymousClass0cQ.I(this, 813715573);
        this.f56723D.r(this.f56724E, AnonymousClass0X8.UPDATING);
        if (this.f56724E.f5871C != null) {
            this.f56722C.B(this.f56724E.f5871C);
        }
        AnonymousClass0cQ.H(this, 94672296, I);
    }

    /* renamed from: E */
    public final /* bridge */ /* synthetic */ void m24955E(AnonymousClass0Cm anonymousClass0Cm, Object obj) {
        int I = AnonymousClass0cQ.I(this, -1544823086);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.I(this, -936076093);
        this.f56723D.n(this.f56724E);
        AnonymousClass0cQ.H(this, -357153685, I2);
        AnonymousClass0cQ.H(this, -735882430, I);
    }
}
