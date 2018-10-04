package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.PaintDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import java.util.List;

/* renamed from: X.3z1 */
public final class AnonymousClass3z1 implements AnonymousClass0QP, AnonymousClass3Ff {
    /* renamed from: B */
    public final boolean f47805B;
    /* renamed from: C */
    public boolean f47806C;
    /* renamed from: D */
    public final View f47807D;
    /* renamed from: E */
    public final PaintDrawable f47808E;
    /* renamed from: F */
    public final int f47809F;
    /* renamed from: G */
    public final TouchInterceptorFrameLayout f47810G;
    /* renamed from: H */
    public final AnonymousClass3Fy f47811H;
    /* renamed from: I */
    public final boolean f47812I;
    /* renamed from: J */
    public final AnonymousClass10o f47813J;
    /* renamed from: K */
    public final AnonymousClass3Fm f47814K;
    /* renamed from: L */
    public final int f47815L;
    /* renamed from: M */
    public final RecyclerView f47816M = ((RecyclerView) this.f47810G.findViewById(C0164R.id.media_thumbnail_tray));
    /* renamed from: N */
    public final AnonymousClass3Fg f47817N;
    /* renamed from: O */
    private final AnonymousClass3Fo f47818O;
    /* renamed from: P */
    private final AnonymousClass0rr f47819P;
    /* renamed from: Q */
    private final AnonymousClass0cN f47820Q;

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public AnonymousClass3z1(Context context, TouchInterceptorFrameLayout touchInterceptorFrameLayout, AnonymousClass3Fg anonymousClass3Fg, AnonymousClass3Fy anonymousClass3Fy, boolean z) {
        this.f47810G = touchInterceptorFrameLayout;
        this.f47817N = anonymousClass3Fg;
        this.f47811H = anonymousClass3Fy;
        this.f47805B = z;
        this.f47812I = AnonymousClass0e8.D(this.f47816M.getContext());
        AnonymousClass0nJ anonymousClass3Fo = new AnonymousClass3Fo(context, anonymousClass3Fg, this);
        this.f47818O = anonymousClass3Fo;
        anonymousClass3Fo.O(true);
        this.f47819P = new AnonymousClass0rr(context, 0, false);
        AnonymousClass10o anonymousClass10n = new AnonymousClass10n();
        this.f47813J = anonymousClass10n;
        anonymousClass10n.f13322B = false;
        Resources resources = context.getResources();
        this.f47816M.setHasFixedSize(true);
        this.f47816M.setAdapter(this.f47818O);
        this.f47816M.setLayoutManager(this.f47819P);
        this.f47816M.setItemAnimator(this.f47813J);
        this.f47816M.setNestedScrollingEnabled(false);
        this.f47815L = resources.getDimensionPixelSize(C0164R.dimen.media_thumbnail_tray_item_padding);
        this.f47809F = resources.getDimensionPixelSize(C0164R.dimen.media_thumbnail_tray_button_shadow_gradient_width);
        this.f47816M.A(new AnonymousClass3Fq(this));
        this.f47816M.D(new AnonymousClass3Fr(this));
        AnonymousClass0cN C = AnonymousClass0e6.B().C();
        C.f7108F = true;
        this.f47820Q = C.A(this).L(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        anonymousClass3Fg.nB(this);
        this.f47814K = new AnonymousClass3Fm(context);
        this.f47807D = this.f47810G.findViewById(C0164R.id.media_thumbnail_tray_button);
        AnonymousClass15z anonymousClass15z = new AnonymousClass15z(this.f47807D);
        anonymousClass15z.f14385E = new AnonymousClass3Fs(this);
        anonymousClass15z.f14386F = true;
        anonymousClass15z.A();
        PaintDrawable paintDrawable = new PaintDrawable();
        this.f47808E = paintDrawable;
        paintDrawable.setPadding(new Rect());
        this.f47810G.B(new AnonymousClass3Ft(this), new AnonymousClass3Fu(this));
        AnonymousClass0Nm.T(this.f47807D, new AnonymousClass3Fv(this));
    }

    /* renamed from: A */
    public final void m21849A(boolean z) {
        if (z) {
            this.f47820Q.N(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        } else {
            this.f47820Q.L(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        }
    }

    /* renamed from: B */
    public static int m21846B(AnonymousClass3z1 anonymousClass3z1) {
        if (!anonymousClass3z1.f47812I) {
            return (anonymousClass3z1.f47816M.computeHorizontalScrollRange() - anonymousClass3z1.f47816M.computeHorizontalScrollExtent()) - anonymousClass3z1.f47816M.computeHorizontalScrollOffset();
        }
        int computeHorizontalScrollOffset = anonymousClass3z1.f47816M.computeHorizontalScrollOffset();
        return computeHorizontalScrollOffset > 0 ? -computeHorizontalScrollOffset : 0;
    }

    /* renamed from: B */
    public final void m21850B(boolean z) {
        if (z) {
            this.f47820Q.N(1.0d);
        } else {
            this.f47820Q.L(1.0d);
        }
    }

    public final void Bp(AnonymousClass3Fh anonymousClass3Fh, int i) {
        if (this.f47818O.B() == 0) {
            AnonymousClass14H.E(true, new View[]{this.f47810G});
            return;
        }
        this.f47818O.G(i);
        if (this.f47816M.computeHorizontalScrollRange() > this.f47816M.computeHorizontalScrollExtent() && this.f47817N.cR() >= 0) {
            this.f47816M.FA(this.f47817N.cR());
        }
    }

    /* renamed from: C */
    public static void m21847C(AnonymousClass3z1 anonymousClass3z1, AnonymousClass3G0 anonymousClass3G0, int i) {
        if (anonymousClass3z1.f47817N.getCount() > 1) {
            anonymousClass3z1.f47814K.m19146C(anonymousClass3G0.f10370B, i, true, new AnonymousClass3z0(anonymousClass3z1, i));
        }
    }

    public final void Cp(AnonymousClass3Fh anonymousClass3Fh, int i) {
        if (this.f47816M.computeHorizontalScrollRange() > this.f47816M.computeHorizontalScrollExtent()) {
            this.f47816M.LA(i);
        }
    }

    /* renamed from: D */
    public static void m21848D(AnonymousClass3z1 anonymousClass3z1, int i) {
        if (anonymousClass3z1.f47805B) {
            if (!anonymousClass3z1.f47817N.isEmpty()) {
                if (i != anonymousClass3z1.f47817N.cR()) {
                    anonymousClass3z1.f47818O.C(anonymousClass3z1.f47817N.cR());
                    if (i < anonymousClass3z1.f47819P.aA() || i > anonymousClass3z1.f47819P.cA()) {
                        anonymousClass3z1.f47818O.C(i);
                    } else {
                        ((AnonymousClass3G0) anonymousClass3z1.f47816M.c(i)).m19155W(true);
                    }
                    anonymousClass3z1.f47817N.SRA(i);
                }
            }
        }
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        float E = (float) anonymousClass0cN.E();
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.f47810G;
        touchInterceptorFrameLayout.setTranslationY((1.0f - E) * ((float) touchInterceptorFrameLayout.getHeight()));
    }

    public final void Hp() {
        this.f47818O.notifyDataSetChanged();
        this.f47810G.post(new AnonymousClass3Fp(this));
    }

    public final void Ip(List list) {
        this.f47818O.notifyDataSetChanged();
        this.f47816M.FA(0);
        AnonymousClass14H.H(false, new View[]{this.f47810G});
    }

    public final void oo(AnonymousClass3Fh anonymousClass3Fh, int i) {
        if (this.f47818O.B() == 1) {
            AnonymousClass14H.H(true, new View[]{this.f47810G});
            this.f47818O.notifyDataSetChanged();
        } else {
            this.f47818O.f10044B.E(i, 1);
        }
        this.f47806C = true;
        this.f47816M.postOnAnimation(new AnonymousClass3Fx(this));
    }
}
