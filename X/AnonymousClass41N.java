package X;

import android.graphics.RectF;
import com.instagram.common.ui.widget.calendar.CalendarRecyclerView;

/* renamed from: X.41N */
public final class AnonymousClass41N extends AnonymousClass3bH {
    /* renamed from: B */
    public final AnonymousClass2zo f48439B;
    /* renamed from: C */
    private final CalendarRecyclerView f48440C;
    /* renamed from: D */
    private final AnonymousClass1oG f48441D;
    /* renamed from: E */
    private final RectF f48442E = new RectF();

    /* renamed from: G */
    public final void mo4988G(AnonymousClass0MI anonymousClass0MI) {
    }

    public AnonymousClass41N(CalendarRecyclerView calendarRecyclerView, AnonymousClass2zo anonymousClass2zo, AnonymousClass3bG anonymousClass3bG) {
        super(anonymousClass3bG);
        this.f48440C = calendarRecyclerView;
        this.f48441D = (AnonymousClass1oG) calendarRecyclerView.getLayoutManager();
        this.f48439B = anonymousClass2zo;
    }

    /* renamed from: A */
    public final void mo4985A(AnonymousClass0MI anonymousClass0MI, AnonymousClass0Pj anonymousClass0Pj) {
        m22070C(anonymousClass0MI);
        anonymousClass0Pj = mo4993B(anonymousClass0MI, anonymousClass0Pj);
        if (anonymousClass0Pj != null) {
            anonymousClass0Pj.f10370B.setAlpha(0.0f);
            anonymousClass0Pj.f10370B.setScaleX(0.7f);
            anonymousClass0Pj.f10370B.setScaleY(0.7f);
        }
    }

    /* renamed from: B */
    private AnonymousClass0oo mo4993B(AnonymousClass0MI anonymousClass0MI, AnonymousClass0Pj anonymousClass0Pj) {
        int Z = this.f48439B.m18148Z(anonymousClass0MI);
        if (Z == -1) {
            return null;
        }
        return this.f48440C.a(Z);
    }

    /* renamed from: B */
    public final void m22072B(AnonymousClass0MI anonymousClass0MI, AnonymousClass0Pj anonymousClass0Pj) {
        super.mo4993B(anonymousClass0MI, anonymousClass0Pj);
        this.f48439B.f36722D = anonymousClass0MI.getId();
        AnonymousClass0oo B = mo4993B(anonymousClass0MI, anonymousClass0Pj);
        if (B != null) {
            B.f10370B.setVisibility(0);
            AnonymousClass14H B2 = AnonymousClass14H.C(B.f10370B).E(1.0f, -1.0f).F(1.0f, -1.0f).B(1.0f);
            B2.f13848N = new AnonymousClass3bN(this);
            B2.N();
        }
    }

    /* renamed from: C */
    public final AnonymousClass3Uy mo4986C(AnonymousClass0MI anonymousClass0MI, AnonymousClass0Pj anonymousClass0Pj) {
        AnonymousClass3Uy C = AnonymousClass3Uy.m19746C();
        AnonymousClass0oo B = mo4993B(anonymousClass0MI, anonymousClass0Pj);
        if (B == null) {
            return C;
        }
        AnonymousClass0Nm.M(B.f10370B, this.f48442E);
        RectF rectF = this.f48442E;
        rectF.set(rectF.centerX(), this.f48442E.centerY(), this.f48442E.centerX(), this.f48442E.centerY());
        return AnonymousClass3Uy.m19745B(this.f48442E);
    }

    /* renamed from: C */
    private void m22070C(AnonymousClass0MI anonymousClass0MI) {
        int Z = this.f48439B.m18148Z(anonymousClass0MI);
        if (Z != -1) {
            int ZA = this.f48441D.ZA();
            int bA = this.f48441D.bA();
            if (Z < ZA || Z > bA) {
                this.f48441D.JA(Z);
            }
        }
    }

    /* renamed from: F */
    public final void mo4987F(AnonymousClass0MI anonymousClass0MI, AnonymousClass0Pj anonymousClass0Pj) {
        m22070C(anonymousClass0MI);
    }
}
