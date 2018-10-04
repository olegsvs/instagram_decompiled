package X;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.filterkit.filter.VideoFilter;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3zz */
public final class AnonymousClass3zz implements AnonymousClass3Ct, OnClickListener, AnonymousClass3IV {
    /* renamed from: B */
    public boolean f48150B;
    /* renamed from: C */
    public AnonymousClass4Q5 f48151C;
    /* renamed from: D */
    public AnonymousClass3Hn f48152D;
    /* renamed from: E */
    public int f48153E;
    /* renamed from: F */
    public int f48154F;
    /* renamed from: G */
    public boolean f48155G;
    /* renamed from: H */
    public AnonymousClass3Hl f48156H;
    /* renamed from: I */
    public AnonymousClass0OA f48157I;
    /* renamed from: J */
    public AnonymousClass3Hm f48158J;
    /* renamed from: K */
    public AnonymousClass4Q4 f48159K;
    /* renamed from: L */
    public AnonymousClass4Ps f48160L;
    /* renamed from: M */
    private Context f48161M;
    /* renamed from: N */
    private final Map f48162N;
    /* renamed from: O */
    private AnonymousClass3zy f48163O;
    /* renamed from: P */
    private long f48164P;
    /* renamed from: Q */
    private final AnonymousClass0PJ f48165Q;
    /* renamed from: R */
    private final AnonymousClass0PN f48166R;
    /* renamed from: S */
    private AnonymousClass0Cm f48167S;
    /* renamed from: T */
    private boolean f48168T;

    public final boolean NVA() {
        return true;
    }

    public AnonymousClass3zz(Context context, AnonymousClass0PJ anonymousClass0PJ, AnonymousClass0PN anonymousClass0PN, AnonymousClass3zy anonymousClass3zy, boolean z, boolean z2, AnonymousClass0Cm anonymousClass0Cm) {
        this.f48162N = new HashMap();
        this.f48153E = -1;
        this.f48154F = 100;
        this.f48161M = context;
        this.f48165Q = anonymousClass0PJ;
        this.f48166R = anonymousClass0PN;
        this.f48163O = anonymousClass3zy;
        this.f48150B = z;
        this.f48168T = z2;
        this.f48167S = anonymousClass0Cm;
    }

    public AnonymousClass3zz(Context context, AnonymousClass3zy anonymousClass3zy, boolean z, boolean z2, AnonymousClass0Cm anonymousClass0Cm) {
        Context context2 = context;
        this(context2, (AnonymousClass0PJ) context2, (AnonymousClass0PN) context2, anonymousClass3zy, z, z2, anonymousClass0Cm);
    }

    /* renamed from: A */
    public final void m21968A() {
        AnonymousClass3Hn anonymousClass3Hn = this.f48152D;
        if (anonymousClass3Hn != null) {
            anonymousClass3Hn.mo4857C().f44808B.m20752A();
        }
    }

    /* renamed from: B */
    public final int m21969B() {
        AnonymousClass3Hn anonymousClass3Hn = this.f48152D;
        return anonymousClass3Hn != null ? anonymousClass3Hn.mo4856B() : 0;
    }

    /* renamed from: C */
    public final VideoFilter m21970C() {
        AnonymousClass3Hn anonymousClass3Hn = this.f48152D;
        if (anonymousClass3Hn == null || anonymousClass3Hn.mo4857C() == null || this.f48152D.mo4857C().mo5317M() == null) {
            return null;
        }
        return this.f48152D.mo4857C().mo5317M().f48858F;
    }

    /* renamed from: D */
    public final boolean m21971D() {
        AnonymousClass3Hn anonymousClass3Hn = this.f48152D;
        return anonymousClass3Hn != null ? anonymousClass3Hn.mo4858H() : false;
    }

    /* renamed from: E */
    public final boolean m21972E() {
        AnonymousClass3Hn anonymousClass3Hn = this.f48152D;
        return anonymousClass3Hn != null ? anonymousClass3Hn.mo4859I() : false;
    }

    /* renamed from: F */
    public final void m21973F() {
        AnonymousClass3Hn anonymousClass3Hn = this.f48152D;
        if (anonymousClass3Hn != null) {
            anonymousClass3Hn.mo4857C().f44808B.m20753B();
        }
    }

    /* renamed from: G */
    public final void m21974G() {
        if (this.f48152D != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f48164P > 35) {
                this.f48152D.mo4857C().m20766L();
                this.f48164P = currentTimeMillis;
            }
        }
    }

    /* renamed from: H */
    public final void m21975H() {
        AnonymousClass3Hn anonymousClass3Hn = this.f48152D;
        if (anonymousClass3Hn != null) {
            anonymousClass3Hn.mo4857C().f44808B.m20755D();
        }
    }

    /* renamed from: I */
    public final void m21976I() {
        AnonymousClass3Hn anonymousClass3Hn = this.f48152D;
        if (anonymousClass3Hn != null) {
            anonymousClass3Hn.mo4860J();
        }
    }

    /* renamed from: J */
    public final void m21977J() {
        AnonymousClass3Hn anonymousClass3Hn = this.f48152D;
        if (anonymousClass3Hn != null) {
            anonymousClass3Hn.mo4861K();
        }
    }

    /* renamed from: K */
    public final void m21978K(AnonymousClass4Q5 anonymousClass4Q5) {
        this.f48151C = anonymousClass4Q5;
        AnonymousClass3Hn anonymousClass3Hn = this.f48152D;
        if (anonymousClass3Hn != null) {
            anonymousClass3Hn.f39871C = anonymousClass4Q5;
        }
    }

    /* renamed from: L */
    public final void m21979L(int i, int i2) {
        m21980M(i, i2, null, false, null);
    }

    /* renamed from: M */
    public final void m21980M(int i, int i2, AnonymousClass1Oi anonymousClass1Oi, boolean z, BackgroundGradientColors backgroundGradientColors) {
        this.f48153E = i;
        this.f48154F = i2;
        if (this.f48152D != null) {
            if (!this.f48162N.containsKey(Integer.valueOf(this.f48153E))) {
                this.f48162N.put(Integer.valueOf(this.f48153E), AnonymousClass3Ie.m19307C(this.f48161M, i));
            }
            VideoFilter videoFilter = (VideoFilter) this.f48162N.get(Integer.valueOf(this.f48153E));
            videoFilter.f49577R = i2;
            videoFilter.f49572M = this.f48155G;
            if (anonymousClass1Oi != null) {
                videoFilter.m22731I(anonymousClass1Oi.f18003J);
            }
            videoFilter.f49565F = z;
            if (backgroundGradientColors != null) {
                videoFilter.m22728F(backgroundGradientColors.f26047C, backgroundGradientColors.f26046B);
            }
            this.f48152D.mo4857C().mo5317M().m22277C(videoFilter);
        }
    }

    /* renamed from: N */
    public final void m21981N(int i, int i2, int i3, boolean z) {
        if (this.f48152D != null) {
            int min;
            if (!this.f48162N.containsKey(Integer.valueOf(i))) {
                this.f48162N.put(Integer.valueOf(i), AnonymousClass3Ie.m19307C(this.f48161M, i));
            }
            VideoFilter videoFilter = (VideoFilter) this.f48162N.get(Integer.valueOf(i));
            if (z) {
                videoFilter.m22731I(null);
            }
            videoFilter.f49577R = i3;
            i = this.f48152D.mo4857C().mo5317M();
            int width = i.f48863K.getWidth();
            if (i.f48858F.f49571L != videoFilter.f49571L && i2 <= width) {
                if (i2 >= 0) {
                    i.f48859G = videoFilter;
                    if (videoFilter != null) {
                        videoFilter.f49568I = i.f48854B;
                        i.f48859G.m22729G(i2, i2 + width);
                    }
                    if (i.f48858F != null) {
                        min = Math.min(i2, width);
                        i.f48858F.m22729G(min - width, min);
                    }
                }
            }
            i.f48859G = null;
            if (i.f48858F != null) {
                min = Math.min(i2, width);
                i.f48858F.m22729G(min - width, min);
            }
        }
    }

    /* renamed from: O */
    public final void m21982O(int i) {
        this.f48154F = i;
        if (m21970C() != null) {
            m21970C().f49577R = i;
        }
    }

    /* renamed from: P */
    public final void m21983P(AnonymousClass3Hl anonymousClass3Hl) {
        this.f48156H = anonymousClass3Hl;
        AnonymousClass3Hn anonymousClass3Hn = this.f48152D;
        if (anonymousClass3Hn != null) {
            anonymousClass3Hn.f39874F = anonymousClass3Hl;
        }
    }

    /* renamed from: Q */
    public final void m21984Q(AnonymousClass0OA anonymousClass0OA) {
        this.f48157I = anonymousClass0OA;
        AnonymousClass3Hn anonymousClass3Hn = this.f48152D;
        if (anonymousClass3Hn != null) {
            anonymousClass3Hn.f39875G = anonymousClass0OA;
            anonymousClass3Hn.f39870B = anonymousClass0OA.bC;
        }
    }

    /* renamed from: R */
    public final void m21985R(AnonymousClass3Hm anonymousClass3Hm) {
        this.f48158J = anonymousClass3Hm;
        AnonymousClass3Hn anonymousClass3Hn = this.f48152D;
        if (anonymousClass3Hn != null) {
            anonymousClass3Hn.f39878J = anonymousClass3Hm;
        }
    }

    /* renamed from: S */
    public final void m21986S(AnonymousClass4Q4 anonymousClass4Q4) {
        this.f48159K = anonymousClass4Q4;
        AnonymousClass3Hn anonymousClass3Hn = this.f48152D;
        if (anonymousClass3Hn != null) {
            anonymousClass3Hn.f39879K = anonymousClass4Q4;
        }
    }

    /* renamed from: T */
    public final void m21987T(AnonymousClass4Ps anonymousClass4Ps) {
        this.f48160L = anonymousClass4Ps;
        AnonymousClass3Hn anonymousClass3Hn = this.f48152D;
        if (anonymousClass3Hn != null) {
            anonymousClass3Hn.f39880L = anonymousClass4Ps;
        }
    }

    /* renamed from: U */
    public final void m21988U(boolean z) {
        AnonymousClass3Hn anonymousClass3Hn = this.f48152D;
        if (anonymousClass3Hn != null) {
            anonymousClass3Hn.mo4865O(z);
        }
    }

    /* renamed from: V */
    public final void m21989V() {
        AnonymousClass3zy anonymousClass3zy = this.f48163O;
        View view = anonymousClass3zy.f48146D;
        if (view != null) {
            view.clearAnimation();
            anonymousClass3zy.f48146D.setVisibility(4);
        }
        View view2 = this.f48163O.f48149G;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    public final void hw(AnonymousClass3oW anonymousClass3oW, AnonymousClass42q anonymousClass42q) {
        this.f48152D = new AnonymousClass3zl(this.f48161M, this.f48163O, anonymousClass3oW, anonymousClass42q, this.f48166R, this.f48150B, this.f48168T, this.f48167S);
        this.f48165Q.HJA(new AnonymousClass3Ii(this));
    }

    public final void iw(AnonymousClass3oW anonymousClass3oW) {
        this.f48152D.f39874F = null;
        this.f48152D.mo4857C().f44808B.m20752A();
        this.f48152D = null;
        this.f48162N.clear();
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -685985987);
        this.f48152D.mo4866P();
        AnonymousClass0cQ.L(this, -15327710, M);
    }

    public final void vJA() {
        this.f48152D.mo4864N();
    }
}
