package X;

import android.graphics.RectF;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.4Zr */
public final class AnonymousClass4Zr implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass18Q f55441B;
    /* renamed from: C */
    public final /* synthetic */ RectF f55442C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Vw f55443D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0HV f55444E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass5bS f55445F;
    /* renamed from: G */
    public final /* synthetic */ int f55446G;

    public AnonymousClass4Zr(AnonymousClass18Q anonymousClass18Q, AnonymousClass0HV anonymousClass0HV, int i, AnonymousClass0Vw anonymousClass0Vw, RectF rectF, AnonymousClass5bS anonymousClass5bS) {
        this.f55441B = anonymousClass18Q;
        this.f55444E = anonymousClass0HV;
        this.f55446G = i;
        this.f55443D = anonymousClass0Vw;
        this.f55442C = rectF;
        this.f55445F = anonymousClass5bS;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 1245730158);
        int i = this.f55446G + 1;
        this.f55444E.f2646B.edit().putInt("zero_rating_direct_video_nux_count", i).apply();
        AnonymousClass18O.Q(this.f55441B.f14964B, this.f55443D, this.f55442C, this.f55445F);
        AnonymousClass0cQ.L(this, 485998061, M);
    }
}
