package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.4K6 */
public final class AnonymousClass4K6 implements AnonymousClass0QP, OnFocusChangeListener, AnonymousClass15J, AnonymousClass0VE {
    /* renamed from: B */
    public final AnonymousClass4K5 f52765B;
    /* renamed from: C */
    public final AnonymousClass0cN f52766C;
    /* renamed from: D */
    public final SearchEditText f52767D;
    /* renamed from: E */
    private final View f52768E = this.f52772I.findViewById(C0164R.id.back_button);
    /* renamed from: F */
    private final View f52769F;
    /* renamed from: G */
    private final int f52770G;
    /* renamed from: H */
    private final int f52771H;
    /* renamed from: I */
    private final View f52772I;
    /* renamed from: J */
    private final int f52773J;
    /* renamed from: K */
    private final View f52774K;
    /* renamed from: L */
    private final AnonymousClass4K8 f52775L;

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void Fz(SearchEditText searchEditText, String str) {
    }

    public final void Xq(View view) {
    }

    public AnonymousClass4K6(AnonymousClass4K5 anonymousClass4K5, View view, AnonymousClass4K8 anonymousClass4K8) {
        this.f52772I = view;
        Context context = view.getContext();
        Resources resources = this.f52772I.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C0164R.dimen.asset_search_margin);
        Drawable anonymousClass2Lj = new AnonymousClass2Lj(context, AnonymousClass0Nm.B(context, 0.5f), C0164R.color.white_80_transparent, 80);
        anonymousClass2Lj.m15172A(dimensionPixelSize, 0, dimensionPixelSize, 0);
        this.f52772I.setBackground(anonymousClass2Lj);
        AnonymousClass15z anonymousClass15z = new AnonymousClass15z(this.f52768E);
        anonymousClass15z.f14385E = this;
        anonymousClass15z.f14386F = true;
        anonymousClass15z.f14393M = true;
        anonymousClass15z.A();
        this.f52769F = this.f52772I.findViewById(C0164R.id.clear_button);
        anonymousClass15z = new AnonymousClass15z(this.f52769F);
        anonymousClass15z.f14385E = this;
        anonymousClass15z.f14386F = true;
        anonymousClass15z.f14393M = true;
        anonymousClass15z.A();
        this.f52774K = this.f52772I.findViewById(C0164R.id.search_icon);
        this.f52771H = resources.getDimensionPixelSize(C0164R.dimen.font_medium);
        this.f52770G = resources.getDimensionPixelSize(C0164R.dimen.font_large);
        this.f52765B = anonymousClass4K5;
        AnonymousClass0cN C = AnonymousClass0e6.B().C();
        C.f7108F = true;
        this.f52766C = C.A(this);
        SearchEditText searchEditText = (SearchEditText) this.f52772I.findViewById(C0164R.id.search_bar);
        this.f52767D = searchEditText;
        searchEditText.setAllowTextSelection(true);
        this.f52767D.setOnFilterTextListener(this);
        this.f52767D.setOnFocusChangeListener(this);
        this.f52773J = resources.getDimensionPixelOffset(C0164R.dimen.asset_search_bar_translation);
        this.f52775L = anonymousClass4K8;
        m23863F();
    }

    /* renamed from: A */
    public final void m23858A() {
        this.f52767D.setText(JsonProperty.USE_DEFAULT_NAME);
    }

    /* renamed from: B */
    public final void m23859B() {
        m23861D();
        this.f52766C.N(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        this.f52765B.jd();
        m23863F();
        m23858A();
    }

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
        this.f52768E.setVisibility(0);
        this.f52767D.setTextSize(0, (float) this.f52771H);
        this.f52774K.setVisibility(0);
    }

    /* renamed from: C */
    public final String m23860C() {
        return this.f52767D.getText().toString();
    }

    /* renamed from: D */
    public final void m23861D() {
        if (this.f52767D.isFocused()) {
            this.f52767D.clearFocus();
            AnonymousClass0Nm.N(this.f52767D);
        }
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
        this.f52767D.setScaleX(1.0f);
        this.f52767D.setScaleY(1.0f);
        if (anonymousClass0cN.E() == 1.0d) {
            this.f52767D.setTextSize(0, (float) this.f52770G);
        } else if (anonymousClass0cN.E() == StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) {
            this.f52767D.setTextSize(0, (float) this.f52771H);
        }
    }

    /* renamed from: E */
    public final boolean m23862E() {
        if (this.f52766C.f7106D != 1.0d) {
            return false;
        }
        m23859B();
        return true;
    }

    /* renamed from: F */
    public final void m23863F() {
        switch (this.f52775L.cI().ordinal()) {
            case 0:
                this.f52767D.setHint(C0164R.string.search_music);
                return;
            case 1:
                this.f52767D.setHint(C0164R.string.search_giphy);
                return;
            default:
                this.f52767D.setHint(C0164R.string.search);
                return;
        }
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        float E = (float) anonymousClass0cN.E();
        this.f52768E.setAlpha(E);
        this.f52774K.setAlpha(1.0f - E);
        double d = (double) E;
        E = (float) AnonymousClass0dh.C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, 1.0d, (double) (((float) this.f52770G) / ((float) this.f52771H)));
        float C = (float) AnonymousClass0dh.C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, (double) this.f52773J);
        this.f52767D.setPivotX(0.0f);
        SearchEditText searchEditText = this.f52767D;
        searchEditText.setPivotY(((float) searchEditText.getHeight()) / 2.0f);
        this.f52767D.setScaleX(E);
        this.f52767D.setScaleY(E);
        this.f52767D.setTranslationX(C);
    }

    public final void Gz(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        String charSequence2 = charSequence.toString();
        this.f52765B.ld(charSequence2);
        if (charSequence2.isEmpty()) {
            AnonymousClass14H.E(true, new View[]{this.f52769F});
            return;
        }
        AnonymousClass14H.H(true, new View[]{this.f52769F});
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.f52765B.kd();
            this.f52766C.N(1.0d);
            return;
        }
        AnonymousClass0Nm.N(this.f52767D);
        if (TextUtils.isEmpty(m23860C())) {
            m23859B();
        }
    }

    public final boolean yCA(View view) {
        if (view == this.f52768E) {
            m23859B();
            return true;
        } else if (view != this.f52769F) {
            return false;
        } else {
            m23858A();
            return true;
        }
    }
}
