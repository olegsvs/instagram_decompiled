package com.instagram.igtv.viewer.tvguide;

import X.AnonymousClass0Ca;
import X.AnonymousClass0Cm;
import X.AnonymousClass0IJ;
import X.AnonymousClass0Iu;
import X.AnonymousClass0Nm;
import X.AnonymousClass0Pn;
import X.AnonymousClass0Pt;
import X.AnonymousClass0Pu;
import X.AnonymousClass0Q6;
import X.AnonymousClass0Rq;
import X.AnonymousClass0TJ;
import X.AnonymousClass0VA;
import X.AnonymousClass0n8;
import X.AnonymousClass1W1;
import X.AnonymousClass25o;
import X.AnonymousClass2I2;
import X.AnonymousClass2Uu;
import X.AnonymousClass3RA;
import X.AnonymousClass3RB;
import X.AnonymousClass3RC;
import X.AnonymousClass3dy;
import X.AnonymousClass3e0;
import X.AnonymousClass3e3;
import X.AnonymousClass3jj;
import X.AnonymousClass3jk;
import X.AnonymousClass3jm;
import X.AnonymousClass3jn;
import X.AnonymousClass3jo;
import X.AnonymousClass41j;
import X.AnonymousClass4ur;
import X.AnonymousClass4v0;
import X.AnonymousClass4x0;
import X.AnonymousClass4xD;
import X.AnonymousClass5Ya;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.igtv.viewer.IGTVViewerFragment;
import com.instagram.ui.widget.search.SearchController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class IGTVSearchController extends AnonymousClass0VA implements AnonymousClass2I2, AnonymousClass3jn, AnonymousClass3dy {
    /* renamed from: B */
    public final IGTVViewerFragment f66206B;
    /* renamed from: C */
    public String f66207C = JsonProperty.USE_DEFAULT_NAME;
    /* renamed from: D */
    public AnonymousClass2Uu f66208D;
    /* renamed from: E */
    public final AnonymousClass4x0 f66209E;
    /* renamed from: F */
    public SearchController f66210F;
    /* renamed from: G */
    public AnonymousClass4xD f66211G = AnonymousClass4xD.LOADING;
    /* renamed from: H */
    public final AnonymousClass0Cm f66212H;
    /* renamed from: I */
    public final AnonymousClass1W1 f66213I;
    /* renamed from: J */
    private final ViewGroup f66214J;
    /* renamed from: K */
    private AnonymousClass3e0 f66215K;
    public ImageView mCustomLoadingSpinnerView;

    public final void Fx(String str) {
    }

    public final void ILA(float f, float f2) {
    }

    public final boolean KV(SearchController searchController) {
        return false;
    }

    public final void Lx(String str) {
    }

    public final float UI(SearchController searchController, AnonymousClass3jm anonymousClass3jm) {
        return 0.0f;
    }

    public final void Vd(SearchController searchController, float f, float f2, AnonymousClass3jm anonymousClass3jm) {
    }

    public final void destroy() {
    }

    public final void zy(SearchController searchController, boolean z) {
    }

    public IGTVSearchController(AnonymousClass0IJ anonymousClass0IJ, ViewGroup viewGroup, AnonymousClass0Cm anonymousClass0Cm, IGTVViewerFragment iGTVViewerFragment, AnonymousClass1W1 anonymousClass1W1) {
        AnonymousClass0IJ anonymousClass0IJ2 = anonymousClass0IJ;
        Context context = anonymousClass0IJ2.getContext();
        this.f66209E = new AnonymousClass4x0(context, this);
        this.f66212H = anonymousClass0Cm;
        this.f66206B = iGTVViewerFragment;
        this.f66214J = viewGroup;
        this.f66213I = anonymousClass1W1;
        Drawable D = AnonymousClass0TJ.D(context, C0164R.drawable.instagram_arrow_back_24, C0164R.color.white, C0164R.drawable.instagram_arrow_back_24, C0164R.color.white_50_transparent);
        AnonymousClass3jj anonymousClass3jj = new AnonymousClass3jj();
        anonymousClass3jj.f43831G = AnonymousClass0Ca.C(context, C0164R.color.black_60_transparent);
        anonymousClass3jj.f43830F = AnonymousClass0Ca.C(context, C0164R.color.transparent);
        anonymousClass3jj.f43835K = AnonymousClass0Ca.C(context, C0164R.color.transparent);
        anonymousClass3jj.f43827C = D;
        anonymousClass3jj.f43826B = AnonymousClass0Ca.C(context, C0164R.color.transparent);
        anonymousClass3jj.f43834J = AnonymousClass0Ca.C(context, C0164R.color.black_60_transparent);
        anonymousClass3jj.f43829E = AnonymousClass0Ca.C(context, C0164R.color.black_90_transparent);
        anonymousClass3jj.f43828D = AnonymousClass0Ca.C(context, C0164R.color.black_60_transparent);
        anonymousClass3jj.f43833I = AnonymousClass0Ca.C(context, C0164R.color.white_90_transparent);
        AnonymousClass3jk anonymousClass3jk = new AnonymousClass3jk(anonymousClass3jj.f43831G, anonymousClass3jj.f43830F, anonymousClass3jj.f43835K, anonymousClass3jj.f43834J, anonymousClass3jj.f43829E, anonymousClass3jj.f43828D, anonymousClass3jj.f43827C, anonymousClass3jj.f43826B, anonymousClass3jj.f43832H, anonymousClass3jj.f43833I);
        Activity activity = anonymousClass0IJ2.getActivity();
        this.f66210F = new SearchController(activity, this.f66214J, 0, this.f66209E, this, null, anonymousClass3jk);
        AnonymousClass25o B = AnonymousClass4ur.m25348B(context);
        this.f66208D = B;
        B.E(1.0f);
        this.f66208D.D(true);
        this.mCustomLoadingSpinnerView = new ImageView(context);
        int C = (int) AnonymousClass0Nm.C(context, 128);
        this.mCustomLoadingSpinnerView.setLayoutParams(new LayoutParams(C, C, 17));
        this.mCustomLoadingSpinnerView.setImageDrawable(this.f66208D);
        this.f66210F.mViewHolder.f43859G.addView(this.mCustomLoadingSpinnerView);
        this.f66215K = new AnonymousClass3e0(anonymousClass0IJ2, new AnonymousClass41j());
        this.f66215K.f42947D = this;
        this.f66215K.C(this.f66207C);
        AnonymousClass4v0.m25353B(activity).m25356A(new AnonymousClass5Ya(this));
    }

    /* renamed from: A */
    public final boolean m27535A() {
        if (!this.f66210F.D()) {
            if (!this.f66210F.B()) {
                return false;
            }
        }
        return true;
    }

    public final void Ax(String str, AnonymousClass0Q6 anonymousClass0Q6) {
        this.f66211G = AnonymousClass4xD.FAILED;
        m27534C(this, new ArrayList(), false, this.f66207C, null);
    }

    /* renamed from: B */
    public static void m27533B(IGTVSearchController iGTVSearchController, AnonymousClass4xD anonymousClass4xD) {
        iGTVSearchController.f66211G = anonymousClass4xD;
        boolean equals = AnonymousClass4xD.LOADING.equals(iGTVSearchController.f66211G);
        iGTVSearchController.mCustomLoadingSpinnerView.setVisibility(equals ? 0 : 8);
        iGTVSearchController.f66208D.D(equals);
    }

    /* renamed from: C */
    public static void m27534C(IGTVSearchController iGTVSearchController, List list, boolean z, String str, String str2) {
        Collection arrayList = new ArrayList();
        for (AnonymousClass3RC anonymousClass3RC : list) {
            if (anonymousClass3RC.f41198B != null) {
                arrayList.add(anonymousClass3RC.f41198B);
            }
        }
        AnonymousClass0Rq anonymousClass0Rq = iGTVSearchController.f66209E;
        Object obj = (AnonymousClass4xD.LOADING.equals(iGTVSearchController.f66211G) || arrayList.size() != 0) ? null : 1;
        anonymousClass0Rq.f58752I.clear();
        anonymousClass0Rq.f58752I.addAll(arrayList);
        anonymousClass0Rq.f58754K = z;
        anonymousClass0Rq.f58750G = str;
        anonymousClass0Rq.f58751H = str2;
        anonymousClass0Rq.C();
        if (obj != null) {
            anonymousClass0Rq.A(anonymousClass0Rq.f58748E, anonymousClass0Rq.f58747D);
        } else {
            anonymousClass0Rq.A(anonymousClass0Rq.f58754K ? anonymousClass0Rq.f58755L : anonymousClass0Rq.f58753J, anonymousClass0Rq.f58756M);
            for (AnonymousClass0n8 A : anonymousClass0Rq.f58752I) {
                anonymousClass0Rq.A(A, anonymousClass0Rq.f58745B);
            }
            anonymousClass0Rq.A(null, anonymousClass0Rq.f58746C);
        }
        anonymousClass0Rq.E();
    }

    public final void Cl() {
        AnonymousClass4x0 anonymousClass4x0 = this.f66209E;
        anonymousClass4x0.f58752I.clear();
        anonymousClass4x0.f58754K = true;
    }

    public final void Iz(String str) {
        this.f66207C = str;
        AnonymousClass3e3 KQ = this.f66215K.f42945B.KQ(this.f66207C);
        if (KQ.f42954D != null) {
            m27533B(this, AnonymousClass4xD.LOADED);
            m27534C(this, KQ.f42954D, TextUtils.isEmpty(this.f66207C), this.f66207C, KQ.f42955E);
        } else if (!TextUtils.isEmpty(this.f66207C)) {
            this.f66215K.C(this.f66207C);
            m27533B(this, AnonymousClass4xD.LOADING);
            m27534C(this, Collections.emptyList(), false, this.f66207C, null);
        }
    }

    public final /* bridge */ /* synthetic */ void Qx(String str, AnonymousClass0Pn anonymousClass0Pn) {
        AnonymousClass3RA anonymousClass3RA = (AnonymousClass3RA) anonymousClass0Pn;
        if (this.f66207C.equals(str)) {
            m27533B(this, AnonymousClass4xD.LOADED);
            m27534C(this, anonymousClass3RA.VN(), TextUtils.isEmpty(str), str, anonymousClass3RA.QQ());
        }
    }

    public final void St() {
        this.f66210F.St();
    }

    public final void UBA(SearchController searchController, AnonymousClass3jo anonymousClass3jo, AnonymousClass3jo anonymousClass3jo2) {
        if (anonymousClass3jo2 == AnonymousClass3jo.REVEALED) {
            this.f66206B.m27488h();
        }
    }

    public final boolean Uo(MotionEvent motionEvent) {
        if (m27535A()) {
            this.f66214J.requestDisallowInterceptTouchEvent(true);
            if ((this.f66209E.f58752I.isEmpty() ^ 1) != 0) {
                AnonymousClass0Nm.N(this.f66210F.mViewHolder.f43858F);
            }
        }
        return false;
    }

    public final void gi() {
        this.mCustomLoadingSpinnerView = null;
        this.f66210F.gi();
        IGTVSearchControllerLifecycleUtil.cleanupReferences(this);
    }

    public final void gx() {
        this.f66210F.gx();
    }

    public final AnonymousClass0Iu tF(String str) {
        if (TextUtils.isEmpty(str)) {
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(this.f66212H);
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
            anonymousClass0Pt.f4229M = "igtv/suggested_searches/";
            return anonymousClass0Pt.D("query", str).M(AnonymousClass3RB.class).H();
        }
        anonymousClass0Pt = new AnonymousClass0Pt(this.f66212H);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        anonymousClass0Pt.f4229M = "igtv/search/";
        return anonymousClass0Pt.D("query", str).M(AnonymousClass3RB.class).H();
    }

    public final boolean zDA(MotionEvent motionEvent) {
        return m27535A();
    }
}
