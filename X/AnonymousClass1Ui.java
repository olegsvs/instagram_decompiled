package X;

import android.graphics.RectF;
import android.view.View;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.reels.fragment.ReelViewerFragment;

/* renamed from: X.1Ui */
public final class AnonymousClass1Ui extends AnonymousClass14I {
    /* renamed from: B */
    public final /* synthetic */ boolean f19140B;
    /* renamed from: C */
    public final /* synthetic */ IgImageView f19141C;
    /* renamed from: D */
    public final /* synthetic */ float f19142D;
    /* renamed from: E */
    public final /* synthetic */ float f19143E;
    /* renamed from: F */
    public final /* synthetic */ float f19144F;
    /* renamed from: G */
    public final /* synthetic */ float f19145G;
    /* renamed from: H */
    public final /* synthetic */ float f19146H;
    /* renamed from: I */
    public final /* synthetic */ float f19147I;
    /* renamed from: J */
    public final /* synthetic */ AnonymousClass5wc f19148J;
    /* renamed from: K */
    public final /* synthetic */ RectF f19149K;
    /* renamed from: L */
    public final /* synthetic */ AnonymousClass14Z f19150L;
    /* renamed from: M */
    public final /* synthetic */ AnonymousClass3Uy f19151M;
    /* renamed from: N */
    public final /* synthetic */ AnonymousClass3bH f19152N;
    /* renamed from: O */
    public final /* synthetic */ AnonymousClass0MI f19153O;
    /* renamed from: P */
    public final /* synthetic */ AnonymousClass0Pj f19154P;
    /* renamed from: Q */
    public final /* synthetic */ float f19155Q;
    /* renamed from: R */
    public final /* synthetic */ View f19156R;
    /* renamed from: S */
    public final /* synthetic */ View f19157S;
    /* renamed from: T */
    public final /* synthetic */ float f19158T;
    /* renamed from: U */
    public final /* synthetic */ float f19159U;
    /* renamed from: V */
    public final /* synthetic */ float f19160V;
    /* renamed from: W */
    public final /* synthetic */ float f19161W;

    public AnonymousClass1Ui(float f, RectF rectF, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, View view, AnonymousClass3bH anonymousClass3bH, AnonymousClass14Z anonymousClass14Z, AnonymousClass3Uy anonymousClass3Uy, boolean z, IgImageView igImageView, float f11, View view2, AnonymousClass0MI anonymousClass0MI, AnonymousClass0Pj anonymousClass0Pj, AnonymousClass5wc anonymousClass5wc) {
        this.f19160V = f;
        this.f19149K = rectF;
        this.f19159U = f2;
        this.f19158T = f3;
        this.f19161W = f4;
        this.f19143E = f5;
        this.f19146H = f6;
        this.f19144F = f7;
        this.f19147I = f8;
        this.f19142D = f9;
        this.f19145G = f10;
        this.f19156R = view;
        this.f19152N = anonymousClass3bH;
        this.f19150L = anonymousClass14Z;
        this.f19151M = anonymousClass3Uy;
        this.f19140B = z;
        this.f19141C = igImageView;
        this.f19155Q = f11;
        this.f19157S = view2;
        this.f19153O = anonymousClass0MI;
        this.f19154P = anonymousClass0Pj;
        this.f19148J = anonymousClass5wc;
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
        this.f19152N.B(this.f19153O, this.f19154P);
        AnonymousClass5wc anonymousClass5wc = this.f19148J;
        ReelViewerFragment.m3990O(anonymousClass5wc.f70187B);
        anonymousClass5wc.f70187B.f4337h = false;
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        float E = (float) anonymousClass0cN.m5760E();
        double d = (double) E;
        float C = (float) AnonymousClass0dh.m6103C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) this.f19160V, (double) this.f19149K.centerY());
        float C2 = (float) AnonymousClass0dh.m6103C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) this.f19159U, (double) this.f19149K.centerX());
        float max = Math.max((float) AnonymousClass0dh.m6103C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) this.f19158T, (double) this.f19161W), 0.0f);
        float C3 = (float) AnonymousClass0dh.m6103C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) this.f19143E, (double) this.f19146H);
        float C4 = (float) AnonymousClass0dh.m6103C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) this.f19144F, (double) this.f19147I);
        float max2 = Math.max((float) AnonymousClass0dh.m6103C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) this.f19142D, (double) this.f19145G), 0.0f);
        this.f19156R.setTranslationX(C2);
        this.f19156R.setTranslationY(C);
        this.f19156R.setScaleX(max);
        this.f19156R.setScaleY(max);
        if (this.f19152N.H()) {
            AnonymousClass14Z anonymousClass14Z = r0.f19150L;
            if (anonymousClass14Z != null) {
                anonymousClass14Z.f13930T.setAlpha(1.0f - E);
                r0.f19150L.f13931U.setAlpha(E);
                r0.f19156R.setAlpha(1.0f - (E * (1.0f - r0.f19151M.f41700B)));
            }
        }
        if (!r0.f19140B) {
            r0.f19141C.setTranslationX(C3);
            r0.f19141C.setTranslationY(C4);
            r0.f19141C.setScaleX(max2);
            r0.f19141C.setScaleY(max2);
        }
        AnonymousClass5Bl.B(r0.f19157S, 1.0f - ((float) AnonymousClass0dh.m6103C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) (1.0f - r0.f19155Q), 1.0d)));
    }
}
