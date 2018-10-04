package com.instagram.ui.widget.search;

import X.AnonymousClass0G5;
import X.AnonymousClass0IE;
import X.AnonymousClass0Nm;
import X.AnonymousClass0QP;
import X.AnonymousClass0Qd;
import X.AnonymousClass0VA;
import X.AnonymousClass0VE;
import X.AnonymousClass0cN;
import X.AnonymousClass0cQ;
import X.AnonymousClass0dh;
import X.AnonymousClass0e6;
import X.AnonymousClass0hj;
import X.AnonymousClass0mE;
import X.AnonymousClass3jk;
import X.AnonymousClass3jl;
import X.AnonymousClass3jm;
import X.AnonymousClass3jn;
import X.AnonymousClass3jo;
import X.AnonymousClass3jp;
import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListAdapter;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.ui.widget.searchedittext.SearchEditText;

public class SearchController extends AnonymousClass0VA implements OnClickListener, AnonymousClass0QP, OnFocusChangeListener, AnonymousClass0VE, AnonymousClass0Qd {
    /* renamed from: B */
    public final Activity f48690B;
    /* renamed from: C */
    public AnonymousClass3jm f48691C;
    /* renamed from: D */
    public final ArgbEvaluator f48692D;
    /* renamed from: E */
    public final AnonymousClass3jn f48693E;
    /* renamed from: F */
    public boolean f48694F;
    /* renamed from: G */
    public final int f48695G;
    /* renamed from: H */
    public final int f48696H;
    /* renamed from: I */
    public float f48697I;
    /* renamed from: J */
    public float f48698J;
    /* renamed from: K */
    private final int f48699K;
    /* renamed from: L */
    private final AnonymousClass0hj f48700L;
    /* renamed from: M */
    private final AnonymousClass0cN f48701M;
    /* renamed from: N */
    private AnonymousClass3jo f48702N;
    public AnonymousClass3jp mViewHolder;

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void Fz(SearchEditText searchEditText, String str) {
    }

    private SearchController(Activity activity, ViewGroup viewGroup, int i, AnonymousClass3jn anonymousClass3jn, boolean z, AnonymousClass3jk anonymousClass3jk, boolean z2) {
        this.f48702N = AnonymousClass3jo.HIDDEN;
        this.f48690B = activity;
        AnonymousClass0cN C = AnonymousClass0e6.B().C();
        C.f7108F = true;
        this.f48701M = C;
        this.f48693E = anonymousClass3jn;
        this.f48692D = new ArgbEvaluator();
        int i2 = (anonymousClass3jk == null || anonymousClass3jk.f43838D == -1) ? -1 : anonymousClass3jk.f43838D;
        this.f48695G = i2;
        if (anonymousClass3jk == null || anonymousClass3jk.f43839E == -1) {
            i2 = AnonymousClass0G5.D(activity, C0164R.attr.searchControllerBackgroundColor);
        } else {
            i2 = anonymousClass3jk.f43839E;
        }
        this.f48696H = i2;
        this.f48700L = new AnonymousClass0hj();
        ImeBackButtonHandlerFrameLayout imeBackButtonHandlerFrameLayout = (ImeBackButtonHandlerFrameLayout) LayoutInflater.from(activity).inflate(C0164R.layout.search_overlay, viewGroup, false);
        this.f48699K = i;
        AnonymousClass3jp anonymousClass3jp = new AnonymousClass3jp(imeBackButtonHandlerFrameLayout, anonymousClass3jk, z2);
        this.mViewHolder = anonymousClass3jp;
        anonymousClass3jp.f43859G.setBackListener(this);
        this.mViewHolder.f43855C.setOnClickListener(this);
        this.mViewHolder.f43858F.setOnFilterTextListener(this);
        this.mViewHolder.f43858F.setOnFocusChangeListener(this);
        this.mViewHolder.f43858F.setOnKeyboardListener(this);
        viewGroup.addView(this.mViewHolder.f43859G);
        if (z) {
            AnonymousClass0Nm.e(this.mViewHolder.f43854B, AnonymousClass0mE.D(this.mViewHolder.f43854B) + activity.getResources().getDimensionPixelOffset(C0164R.dimen.direct_one_tap_fast_scroll_separator_width));
        }
    }

    public SearchController(Activity activity, ViewGroup viewGroup, int i, ListAdapter listAdapter, AnonymousClass3jn anonymousClass3jn, boolean z, AnonymousClass3jk anonymousClass3jk) {
        this(activity, viewGroup, i, anonymousClass3jn, z, anonymousClass3jk, false);
        this.mViewHolder.f43861I.setAdapter(listAdapter);
    }

    /* renamed from: A */
    public final void m22213A(boolean z, float f) {
        m22217E(z, AnonymousClass3jm.HIDING, 0.0f, f);
    }

    /* renamed from: B */
    public static void m22212B(SearchController searchController, AnonymousClass3jo anonymousClass3jo) {
        AnonymousClass3jo anonymousClass3jo2 = searchController.f48702N;
        if (anonymousClass3jo != anonymousClass3jo2) {
            searchController.f48702N = anonymousClass3jo;
            switch (anonymousClass3jo2.ordinal()) {
                case 0:
                    searchController.mViewHolder.f43858F.A();
                    AnonymousClass0Nm.k(searchController.mViewHolder.f43858F);
                    break;
                case 1:
                    break;
                case 2:
                    searchController.mViewHolder.f43858F.setText(JsonProperty.USE_DEFAULT_NAME);
                    searchController.mViewHolder.f43858F.clearFocus();
                    AnonymousClass0Nm.N(searchController.mViewHolder.f43858F);
                    break;
                default:
                    break;
            }
            searchController.f48693E.UBA(searchController, searchController.f48702N, anonymousClass3jo2);
        }
    }

    /* renamed from: B */
    public final boolean m22214B() {
        return this.f48702N == AnonymousClass3jo.ANIMATING;
    }

    /* renamed from: C */
    public final boolean m22215C() {
        return this.f48702N == AnonymousClass3jo.HIDDEN;
    }

    /* renamed from: D */
    public final boolean m22216D() {
        return this.f48702N == AnonymousClass3jo.REVEALED;
    }

    /* renamed from: E */
    public final void m22217E(boolean z, AnonymousClass3jm anonymousClass3jm, float f, float f2) {
        if (this.f48701M.G()) {
            this.f48691C = anonymousClass3jm;
            this.f48701M.L(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
            this.f48697I = f;
            this.f48698J = f2;
            if (z) {
                this.f48701M.N(1.0d);
            } else {
                this.f48701M.L(1.0d);
            }
        }
    }

    /* renamed from: F */
    public final boolean m22218F() {
        this.f48693E.Cl();
        m22213A(true, this.f48693E.UI(this, AnonymousClass3jm.HIDING));
        return true;
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        float E = (float) anonymousClass0cN.E();
        double d = (double) E;
        float C = (float) AnonymousClass0dh.C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) this.f48697I, (double) this.f48698J);
        if (!this.f48693E.KV(this)) {
            AnonymousClass3jm anonymousClass3jm = r0.f48691C;
            AnonymousClass3jm anonymousClass3jm2 = AnonymousClass3jm.REVEALING;
            double d2 = 1.0d;
            double d3 = anonymousClass3jm == anonymousClass3jm2 ? StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED : 1.0d;
            if (r0.f48691C != anonymousClass3jm2) {
                d2 = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
            }
            float C2 = (float) AnonymousClass0dh.C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, d3, d2);
            int intValue = ((Integer) r0.f48692D.evaluate(E, Integer.valueOf(r0.f48695G), Integer.valueOf(r0.f48696H))).intValue();
            int i = 0;
            r0.mViewHolder.f43859G.setVisibility(C2 > 0.0f ? 0 : 4);
            View view = r0.mViewHolder.f43860H;
            if (C2 <= 0.0f) {
                i = 4;
            }
            view.setVisibility(i);
            r0.mViewHolder.f43862J.setAlpha(C2);
            r0.mViewHolder.f43855C.setAlpha(C2);
            r0.mViewHolder.f43863K.setAlpha(1.0f - C2);
            r0.mViewHolder.f43854B.setBackgroundColor(intValue);
            r0.mViewHolder.f43854B.setAlpha(C2);
            r0.mViewHolder.f43860H.setAlpha(C2);
            r0.mViewHolder.f43859G.setTranslationY(C);
        }
        r0.f48693E.Vd(r0, E, C, r0.f48691C);
        if (E == 1.0f) {
            m22212B(r0, r0.f48691C == AnonymousClass3jm.REVEALING ? AnonymousClass3jo.REVEALED : AnonymousClass3jo.HIDDEN);
        } else {
            m22212B(r0, AnonymousClass3jo.ANIMATING);
        }
    }

    /* renamed from: G */
    public final void m22219G(boolean z, float f) {
        m22217E(z, AnonymousClass3jm.REVEALING, f, 0.0f);
    }

    public final void Gz(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        this.f48693E.Iz(AnonymousClass0IE.G(searchEditText.getSearchString()));
    }

    public final void Sp(int i, boolean z) {
        int i2 = 0;
        this.f48694F = i > 0;
        AnonymousClass3jp anonymousClass3jp = this.mViewHolder;
        if (anonymousClass3jp != null) {
            LayoutParams layoutParams = anonymousClass3jp.f43859G.getLayoutParams();
            layoutParams.height = ((ViewGroup) this.mViewHolder.f43859G.getParent()).getHeight() - i;
            int i3 = layoutParams.height;
            if (this.f48694F) {
                i2 = this.f48699K;
            }
            layoutParams.height = i3 + i2;
            this.mViewHolder.f43859G.post(new AnonymousClass3jl(this, layoutParams));
        }
    }

    public final void St() {
        this.f48701M.J(this);
        this.f48700L.D(this);
        this.f48700L.C();
    }

    public final void gi() {
        SearchControllerLifecycleUtil.cleanupReferences(this);
    }

    public final void gx() {
        this.f48701M.A(this);
        this.f48700L.B(this.f48690B);
        this.f48700L.A(this);
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -2082710107);
        if (view == this.mViewHolder.f43855C) {
            m22218F();
        }
        AnonymousClass0cQ.L(this, -1365146296, M);
    }

    public final void onFocusChange(View view, boolean z) {
        this.f48693E.zy(this, z);
    }
}
