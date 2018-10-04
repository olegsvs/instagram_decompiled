package com.instagram.ui.widget.search;

import X.AnonymousClass0Ca;
import X.AnonymousClass0G5;
import X.AnonymousClass0Nm;
import X.AnonymousClass0QP;
import X.AnonymousClass0VA;
import X.AnonymousClass0cN;
import X.AnonymousClass0cQ;
import X.AnonymousClass0dh;
import X.AnonymousClass0e6;
import X.AnonymousClass0e8;
import X.AnonymousClass0eT;
import X.AnonymousClass3jm;
import X.AnonymousClass3jn;
import X.AnonymousClass3jo;
import X.AnonymousClass3jp;
import X.AnonymousClass3jq;
import X.AnonymousClass3jr;
import X.AnonymousClass3js;
import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Adapter;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;

public class StickySearchBarAnimationHelper extends AnonymousClass0VA implements AnonymousClass0QP, OnScrollListener, AnonymousClass3jn {
    /* renamed from: B */
    public int f48703B;
    /* renamed from: C */
    public int f48704C;
    /* renamed from: D */
    public final int f48705D;
    /* renamed from: E */
    private final Drawable f48706E;
    /* renamed from: F */
    private final ArgbEvaluator f48707F;
    /* renamed from: G */
    private final DataSetObserver f48708G = new AnonymousClass3jr(this);
    /* renamed from: H */
    private boolean f48709H;
    /* renamed from: I */
    private final Adapter f48710I;
    /* renamed from: J */
    private boolean f48711J;
    /* renamed from: K */
    private boolean f48712K;
    /* renamed from: L */
    private final int f48713L;
    /* renamed from: M */
    private final int f48714M;
    /* renamed from: N */
    private final int f48715N;
    /* renamed from: O */
    private final int f48716O;
    /* renamed from: P */
    private final AnonymousClass0cN f48717P;
    /* renamed from: Q */
    private final Runnable f48718Q = new AnonymousClass3jq(this);
    public Activity mActivity;
    public ListView mListView;
    public SearchController mSearchController;

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void Cl() {
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void Iz(String str) {
    }

    public final boolean KV(SearchController searchController) {
        return true;
    }

    public StickySearchBarAnimationHelper(Activity activity, SearchController searchController, ListView listView, Adapter adapter, int i) {
        this.mActivity = activity;
        this.f48709H = AnonymousClass0e8.D(this.mActivity);
        this.mSearchController = searchController;
        this.mListView = listView;
        this.f48710I = adapter;
        this.f48705D = i;
        Resources resources = this.mActivity.getResources();
        this.f48715N = resources.getDimensionPixelSize(C0164R.dimen.font_medium);
        this.f48714M = resources.getDimensionPixelSize(C0164R.dimen.font_large);
        this.f48716O = (int) AnonymousClass0Nm.C(this.mActivity, 16);
        this.f48713L = AnonymousClass0G5.D(activity, C0164R.attr.searchControllerBackgroundColor);
        this.f48706E = AnonymousClass0Ca.E(activity, C0164R.drawable.action_bar_default_button_background);
        this.f48707F = new ArgbEvaluator();
        AnonymousClass0cN C = AnonymousClass0e6.B().C();
        C.f7108F = true;
        this.f48717P = C;
        this.mSearchController.mViewHolder.f43857E.setVisibility(0);
        adapter.registerDataSetObserver(this.f48708G);
    }

    /* renamed from: A */
    public final void m22225A(float f, float f2, int i) {
        if (!this.mSearchController.m22214B()) {
            if (!r4.mSearchController.m22216D()) {
                float f3;
                float f4;
                AnonymousClass3jp anonymousClass3jp = r4.mSearchController.mViewHolder;
                View view = anonymousClass3jp.f43859G;
                View view2 = anonymousClass3jp.f43862J;
                View view3 = anonymousClass3jp.f43863K;
                View view4 = anonymousClass3jp.f43854B;
                View view5 = anonymousClass3jp.f43855C;
                View view6 = anonymousClass3jp.f43857E;
                View view7 = anonymousClass3jp.f43856D;
                TextView textView = anonymousClass3jp.f43858F;
                float f5 = f;
                if (f > 0.0f) {
                    double d = (double) f5;
                    float C = (float) AnonymousClass0dh.C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) r4.f48716O, (double) ((-m22224F(r4)) + r4.f48716O));
                    float f6 = 1.0f - f5;
                    int i2 = i;
                    f3 = ((float) i2) * f6;
                    view.setVisibility(0);
                    view.setTranslationY(f3);
                    f3 = ((float) (r4.f48709H ? -1 : 1)) * (C - ((float) view5.getWidth()));
                    view6.setTranslationX(f3);
                    view6.setAlpha(f6);
                    view5.setAlpha(0.0f);
                    view7.setTranslationX(f3);
                    view7.setAlpha(1.0f);
                    view4.setAlpha(1.0f);
                    m22223E(r4, f2, i2);
                    textView.setPivotX(0.0f);
                    textView.setPivotY(((float) textView.getHeight()) / 2.0f);
                    if (f5 < 1.0f) {
                        float C2 = (float) AnonymousClass0dh.C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) r4.f48715N, (double) r4.f48714M);
                        int i3 = r4.f48715N;
                        C2 /= (float) i3;
                        textView.setTextSize(0, (float) i3);
                        textView.setScaleX(C2);
                        textView.setScaleY(C2);
                        f3 = 1.0f;
                    } else {
                        textView.setTextSize(0, (float) r4.f48714M);
                        f3 = 1.0f;
                        textView.setScaleX(1.0f);
                        textView.setScaleY(1.0f);
                    }
                    f4 = 0.0f;
                } else {
                    f3 = 1.0f;
                    view.setVisibility(4);
                    f4 = 0.0f;
                    view.setTranslationY(0.0f);
                    view.setAlpha(1.0f);
                    view4.setBackgroundColor(-1);
                    view3.setAlpha(1.0f);
                    view2.setAlpha(0.0f);
                    view6.setAlpha(1.0f);
                    view7.setOnClickListener(null);
                }
                if (f5 == f3) {
                    r4.f48712K = true;
                    if (r4.f48711J) {
                        r4.mSearchController.m22219G(true, f4);
                        r4.f48711J = false;
                        return;
                    }
                    return;
                }
                r4.f48712K = false;
            }
        }
    }

    /* renamed from: B */
    public static void m22220B(StickySearchBarAnimationHelper stickySearchBarAnimationHelper) {
        stickySearchBarAnimationHelper.f48711J = true;
        stickySearchBarAnimationHelper.f48704C = stickySearchBarAnimationHelper.mListView.getChildAt(stickySearchBarAnimationHelper.f48705D - stickySearchBarAnimationHelper.mListView.getFirstVisiblePosition()).getTop();
        stickySearchBarAnimationHelper.f48717P.L(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED).N(1.0d);
    }

    /* renamed from: C */
    public static void m22221C(StickySearchBarAnimationHelper stickySearchBarAnimationHelper) {
        stickySearchBarAnimationHelper.f48703B = 0;
        m22222D(stickySearchBarAnimationHelper, 0);
        stickySearchBarAnimationHelper.mListView.removeCallbacks(stickySearchBarAnimationHelper.f48718Q);
        stickySearchBarAnimationHelper.mListView.post(stickySearchBarAnimationHelper.f48718Q);
    }

    /* renamed from: D */
    public static void m22222D(StickySearchBarAnimationHelper stickySearchBarAnimationHelper, int i) {
        stickySearchBarAnimationHelper.f48710I.unregisterDataSetObserver(stickySearchBarAnimationHelper.f48708G);
        ((AnonymousClass3js) stickySearchBarAnimationHelper.f48710I).COA(i);
        stickySearchBarAnimationHelper.f48710I.registerDataSetObserver(stickySearchBarAnimationHelper.f48708G);
    }

    /* renamed from: E */
    private static void m22223E(StickySearchBarAnimationHelper stickySearchBarAnimationHelper, float f, int i) {
        AnonymousClass3jp anonymousClass3jp = stickySearchBarAnimationHelper.mSearchController.mViewHolder;
        View view = anonymousClass3jp.f43862J;
        View view2 = anonymousClass3jp.f43863K;
        View view3 = anonymousClass3jp.f43854B;
        float B = (float) AnonymousClass0dh.B(AnonymousClass0dh.C((double) f, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 0.5d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d);
        int intValue = ((Integer) stickySearchBarAnimationHelper.f48707F.evaluate(B, Integer.valueOf(-1), Integer.valueOf(stickySearchBarAnimationHelper.f48713L))).intValue();
        view.setAlpha(Math.min(2.0f * B, 1.0f));
        view2.setTranslationY(B * ((float) i));
        view3.setBackgroundColor(intValue);
    }

    /* renamed from: F */
    private static int m22224F(StickySearchBarAnimationHelper stickySearchBarAnimationHelper) {
        stickySearchBarAnimationHelper = stickySearchBarAnimationHelper.mSearchController.mViewHolder.f43857E;
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) stickySearchBarAnimationHelper.getLayoutParams();
        return (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin) + stickySearchBarAnimationHelper.getWidth();
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        this.mListView.setSelectionFromTop(this.f48705D, (int) Math.round(AnonymousClass0dh.C((double) ((float) anonymousClass0cN.E()), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) this.f48704C, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED)));
    }

    public final void PGA(View view, Bundle bundle) {
        this.f48710I.registerDataSetObserver(this.f48708G);
    }

    public final void St() {
        this.f48717P.J(this);
    }

    public final void UBA(SearchController searchController, AnonymousClass3jo anonymousClass3jo, AnonymousClass3jo anonymousClass3jo2) {
        if (anonymousClass3jo == AnonymousClass3jo.HIDDEN) {
            m22221C(this);
        }
    }

    public final float UI(SearchController searchController, AnonymousClass3jm anonymousClass3jm) {
        return (float) AnonymousClass0eT.E(this.mActivity).f7727C.getHeight();
    }

    public final void Vd(SearchController searchController, float f, float f2, AnonymousClass3jm anonymousClass3jm) {
        int i;
        float f3 = f;
        AnonymousClass3jp anonymousClass3jp = searchController.mViewHolder;
        View view = anonymousClass3jp.f43860H;
        View view2 = anonymousClass3jp.f43855C;
        View view3 = anonymousClass3jp.f43856D;
        AnonymousClass3jm anonymousClass3jm2 = anonymousClass3jm;
        if (anonymousClass3jm2 != AnonymousClass3jm.REVEALING) {
            f3 = 1.0f - f;
        }
        double d = (double) f3;
        float width = ((float) (((-m22224F(this)) + this.f48716O) - view2.getWidth())) + ((float) AnonymousClass0dh.C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, (double) (view2.getWidth() - this.f48716O)));
        float C = (float) AnonymousClass0dh.C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) (-view2.getWidth()), 0.0f);
        if (anonymousClass3jm2 == AnonymousClass3jm.REVEALING) {
            m22223E(r5, f3, AnonymousClass0eT.E(r5.mActivity).f7727C.getHeight());
        }
        int i2 = 0;
        if (f3 != 1.0f) {
            if (f3 != 0.0f) {
                i = 2;
                view.setLayerType(i, null);
                view.setAlpha(f3);
                view2.setAlpha(f3);
                if (view.getAlpha() > 0.0f) {
                    i2 = 8;
                }
                view.setVisibility(i2);
                i2 = -1;
                view2.setTranslationX(((float) (r5.f48709H ? -1 : 1)) * C);
                if (r5.f48709H) {
                    i2 = 1;
                }
                view3.setTranslationX(((float) i2) * width);
                if (f3 != 1.0f) {
                    view2.setBackground(r5.f48706E);
                } else {
                    view2.setBackground(null);
                }
            }
        }
        i = 0;
        view.setLayerType(i, null);
        view.setAlpha(f3);
        view2.setAlpha(f3);
        if (view.getAlpha() > 0.0f) {
            i2 = 8;
        }
        view.setVisibility(i2);
        i2 = -1;
        if (r5.f48709H) {
        }
        view2.setTranslationX(((float) (r5.f48709H ? -1 : 1)) * C);
        if (r5.f48709H) {
            i2 = 1;
        }
        view3.setTranslationX(((float) i2) * width);
        if (f3 != 1.0f) {
            view2.setBackground(null);
        } else {
            view2.setBackground(r5.f48706E);
        }
    }

    public final void gi() {
        this.f48710I.unregisterDataSetObserver(this.f48708G);
        StickySearchBarAnimationHelperLifecycleUtil.cleanupReferences(this);
    }

    public final void gx() {
        this.f48717P.A(this);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AnonymousClass0cQ.H(this, -157628097, AnonymousClass0cQ.I(this, -241824944));
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        AnonymousClass0cQ.H(this, 671979689, AnonymousClass0cQ.I(this, -1457450299));
    }

    public final void zy(SearchController searchController, boolean z) {
        if (!z) {
            return;
        }
        if (!this.mSearchController.m22214B()) {
            if (this.f48712K) {
                this.mSearchController.m22219G(true, 0.0f);
                this.f48711J = false;
                return;
            }
            m22220B(this);
        }
    }
}
