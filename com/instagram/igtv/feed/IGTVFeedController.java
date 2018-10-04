package com.instagram.igtv.feed;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ca;
import X.AnonymousClass0Cm;
import X.AnonymousClass0E6;
import X.AnonymousClass0F4;
import X.AnonymousClass0F8;
import X.AnonymousClass0HV;
import X.AnonymousClass0IC;
import X.AnonymousClass0Ix;
import X.AnonymousClass0LQ;
import X.AnonymousClass0Nm;
import X.AnonymousClass0P7;
import X.AnonymousClass0PZ;
import X.AnonymousClass0TJ;
import X.AnonymousClass0TK;
import X.AnonymousClass0TL;
import X.AnonymousClass0TP;
import X.AnonymousClass0bN;
import X.AnonymousClass0bP;
import X.AnonymousClass0dd;
import X.AnonymousClass0eZ;
import X.AnonymousClass0ih;
import X.AnonymousClass0n1;
import X.AnonymousClass0n2;
import X.AnonymousClass0n3;
import X.AnonymousClass0n4;
import X.AnonymousClass0n5;
import X.AnonymousClass0n7;
import X.AnonymousClass0n8;
import X.AnonymousClass0n9;
import X.AnonymousClass22q;
import X.AnonymousClass2CP;
import X.AnonymousClass2CQ;
import X.AnonymousClass2CW;
import X.AnonymousClass3RF;
import X.AnonymousClass4uO;
import X.AnonymousClass4vg;
import X.AnonymousClass5YH;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.facebook.C0164R;
import com.instagram.igtv.logging.IGTVLaunchAnalytics;
import java.util.ArrayList;
import java.util.List;

public class IGTVFeedController implements AnonymousClass0TK, AnonymousClass0TL {
    /* renamed from: B */
    public AnonymousClass0eZ f5134B;
    /* renamed from: C */
    public AnonymousClass0ih f5135C;
    /* renamed from: D */
    public final List f5136D = new ArrayList();
    /* renamed from: E */
    public AnonymousClass4uO f5137E;
    /* renamed from: F */
    public boolean f5138F;
    /* renamed from: G */
    public final AnonymousClass2CW f5139G;
    /* renamed from: H */
    public final List f5140H = new ArrayList();
    /* renamed from: I */
    public final Context f5141I;
    /* renamed from: J */
    public boolean f5142J;
    /* renamed from: K */
    public boolean f5143K;
    /* renamed from: L */
    public int f5144L = 0;
    /* renamed from: M */
    public boolean f5145M;
    /* renamed from: N */
    public final AnonymousClass0Cm f5146N;
    /* renamed from: O */
    private final AnonymousClass3RF f5147O;
    /* renamed from: P */
    private final Drawable f5148P;
    /* renamed from: Q */
    private final Drawable f5149Q;
    /* renamed from: R */
    private final AnonymousClass0F8 f5150R = new AnonymousClass0n1(this);
    public ImageView mEntryPointButton;
    public AnonymousClass0n5 mPendingMediaObserver;

    public final void Ry(Bundle bundle) {
    }

    public final void cBA() {
    }

    public final void ei() {
    }

    public final void onStart() {
    }

    public final void wh(View view) {
    }

    public final void xc(int i, int i2, Intent intent) {
    }

    public IGTVFeedController(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0PZ anonymousClass0PZ) {
        Context context2 = context;
        this.f5141I = context2;
        this.f5146N = anonymousClass0Cm;
        this.f5147O = new AnonymousClass3RF(anonymousClass0PZ);
        this.f5139G = AnonymousClass2CP.f27395B.A(this.f5146N);
        if (((Boolean) AnonymousClass0E6.m1316B(AnonymousClass0CC.PI)).booleanValue()) {
            this.f5135C = new AnonymousClass0ih(context2, C0164R.drawable.igtv_navbar, C0164R.drawable.igtv_navbar, C0164R.color.grey_9, C0164R.color.grey_9, null, false, C0164R.color.white, C0164R.color.red_5, 30);
        } else {
            this.f5135C = new AnonymousClass0ih(context2, C0164R.drawable.igtv_navbar, C0164R.drawable.igtv_navbar_badged, C0164R.color.grey_9, C0164R.color.white, Integer.valueOf(C0164R.drawable.igtv_gradient), true, C0164R.color.grey_9_20_transparent, C0164R.color.white, 30);
        }
        this.f5148P = AnonymousClass0TJ.m4495K(context2, C0164R.drawable.igtv_profile_badge_uploading, C0164R.color.grey_9);
        this.f5149Q = AnonymousClass0TJ.m4495K(context2, C0164R.drawable.igtv_profile_badge_error, C0164R.color.red_5);
        context2.getResources();
        if (!AnonymousClass0n2.m7591B(context2).exists()) {
            AnonymousClass0n2.f9980L.schedule(new AnonymousClass0n3(new AnonymousClass0n4(context2, System.currentTimeMillis())));
        }
    }

    /* renamed from: A */
    public final void m4500A() {
        if (AnonymousClass2CP.f27395B.H(this.f5141I, this.f5146N)) {
            if (this.f5142J) {
                m4501B();
            }
            AnonymousClass0Ix.m2384D(AnonymousClass4vg.B(AnonymousClass4vg.D(this.f5146N), true, new AnonymousClass0n9(this)));
        }
    }

    /* renamed from: B */
    public final void m4501B() {
        AnonymousClass0HV.m2008D(this.f5146N).HA(AnonymousClass0HV.m2008D(this.f5146N).m2028P());
    }

    /* renamed from: B */
    public static void m4497B(IGTVFeedController iGTVFeedController, Activity activity, String str, String str2) {
        iGTVFeedController.m4502C();
        boolean z = true;
        boolean booleanValue = ((Boolean) AnonymousClass0CC.TO.m846H(iGTVFeedController.f5146N)).booleanValue() ^ true;
        AnonymousClass0TP anonymousClass0TP = new AnonymousClass0TP(AnonymousClass2CQ.f27402I, System.currentTimeMillis());
        anonymousClass0TP.f5197K = AnonymousClass0Nm.m3433L(iGTVFeedController.mEntryPointButton);
        anonymousClass0TP.f5193G = str;
        anonymousClass0TP.f5195I = str2;
        anonymousClass0TP.f5190D = booleanValue;
        anonymousClass0TP.f5189C = true;
        IGTVLaunchAnalytics iGTVLaunchAnalytics = new IGTVLaunchAnalytics();
        ImageView imageView = iGTVFeedController.mEntryPointButton;
        boolean z2 = imageView != null && imageView.isActivated();
        iGTVLaunchAnalytics.f13866C = Boolean.valueOf(z2);
        AnonymousClass0eZ anonymousClass0eZ = iGTVFeedController.f5134B;
        if (anonymousClass0eZ == null || !anonymousClass0eZ.m6374D()) {
            z = false;
        }
        iGTVLaunchAnalytics.f13865B = Boolean.valueOf(z);
        iGTVLaunchAnalytics.f13867D = str2;
        anonymousClass0TP.f5192F = iGTVLaunchAnalytics;
        anonymousClass0TP.m4515D(activity, iGTVFeedController.f5146N, iGTVFeedController.f5139G);
    }

    /* renamed from: C */
    public final void m4502C() {
        AnonymousClass0HV.m2008D(this.f5146N).LA(AnonymousClass0HV.m2008D(this.f5146N).m2028P());
    }

    /* renamed from: C */
    public static void m4498C(IGTVFeedController iGTVFeedController) {
        if (iGTVFeedController.mEntryPointButton == null) {
            return;
        }
        if (iGTVFeedController.f5143K) {
            boolean B = AnonymousClass0n5.m7597B(iGTVFeedController.f5139G.D());
            boolean C = AnonymousClass0n5.m7598C(iGTVFeedController.f5139G.D());
            Drawable drawable = null;
            AnonymousClass0ih anonymousClass0ih;
            if (B) {
                drawable = iGTVFeedController.f5148P;
                anonymousClass0ih = iGTVFeedController.f5135C;
                AnonymousClass0Ca.m937C(anonymousClass0ih.f8882E, C0164R.color.grey_9_20_transparent);
                anonymousClass0ih.invalidateSelf();
                anonymousClass0ih = iGTVFeedController.f5135C;
                anonymousClass0ih.f8879B = AnonymousClass0Ca.m937C(anonymousClass0ih.f8882E, C0164R.color.white);
                anonymousClass0ih.invalidateSelf();
                iGTVFeedController.f5135C.m7018A(C0164R.color.grey_9_20_transparent);
            } else if (C) {
                drawable = iGTVFeedController.f5149Q;
                anonymousClass0ih = iGTVFeedController.f5135C;
                AnonymousClass0Ca.m937C(anonymousClass0ih.f8882E, C0164R.color.grey_9_20_transparent);
                anonymousClass0ih.invalidateSelf();
                anonymousClass0ih = iGTVFeedController.f5135C;
                anonymousClass0ih.f8879B = AnonymousClass0Ca.m937C(anonymousClass0ih.f8882E, C0164R.color.white);
                anonymousClass0ih.invalidateSelf();
                iGTVFeedController.f5135C.m7018A(C0164R.color.red_5);
            }
            iGTVFeedController.f5135C.m7019B(drawable);
            boolean z = false;
            ImageView imageView;
            if (iGTVFeedController.m4504E()) {
                if (drawable == null && ((Boolean) AnonymousClass0E6.m1316B(AnonymousClass0CC.PI)).booleanValue()) {
                    iGTVFeedController.f5135C.m7020C();
                }
                if (((Boolean) AnonymousClass0CC.gO.m846H(iGTVFeedController.f5146N)).booleanValue()) {
                    imageView = iGTVFeedController.mEntryPointButton;
                    if (drawable != null) {
                        z = true;
                    }
                    imageView.setActivated(z);
                } else {
                    iGTVFeedController.mEntryPointButton.setActivated(true);
                }
                if (iGTVFeedController.f5134B != null && (AnonymousClass0LQ.m2954B(AnonymousClass0HV.m2008D(iGTVFeedController.f5146N).m2028P(), AnonymousClass0HV.m2008D(iGTVFeedController.f5146N).f2646B.getString("felix_last_banner_display_newness_token", null)) ^ 1) != 0) {
                    iGTVFeedController.m4499D(iGTVFeedController.f5136D);
                    return;
                }
                return;
            }
            imageView = iGTVFeedController.mEntryPointButton;
            if (drawable != null) {
                z = true;
            }
            imageView.setActivated(z);
        }
    }

    /* renamed from: D */
    public final void m4503D(AnonymousClass5YH anonymousClass5YH) {
        if (this.f5134B != null) {
            AnonymousClass4uO anonymousClass4uO = this.f5137E;
            if (anonymousClass4uO != null) {
                if (anonymousClass4uO.iK() != null) {
                    this.f5134B.m6378C(true);
                    m4501B();
                    anonymousClass5YH = this.f5147O;
                    AnonymousClass0P7 iK = this.f5137E.iK();
                    AnonymousClass0bP G = AnonymousClass0bN.m5543G("igtv_banner_hide", anonymousClass5YH.f41202B);
                    G.QC = iK.getId();
                    G.f6757g = iK.MA().getId();
                    AnonymousClass0bN.m5568f(G.m5577B(), AnonymousClass0dd.REGULAR);
                }
            }
        }
    }

    /* renamed from: D */
    private void m4499D(List list) {
        boolean z;
        AnonymousClass0eZ anonymousClass0eZ;
        if (list.isEmpty()) {
            z = true;
            anonymousClass0eZ = this.f5134B;
            if (anonymousClass0eZ == null) {
                return;
            }
        }
        this.f5140H.clear();
        for (AnonymousClass0n7 anonymousClass0n7 : list) {
            AnonymousClass0n8 C = this.f5139G.C(anonymousClass0n7.f10004B);
            AnonymousClass0P7 anonymousClass0P7 = (AnonymousClass0P7) C.f10009E.get(anonymousClass0n7.f10005C);
            if (!(anonymousClass0P7 == null || TextUtils.isEmpty(anonymousClass0P7.vC) || anonymousClass0P7.MA() == null)) {
                if (!TextUtils.isEmpty(anonymousClass0P7.MA().uT())) {
                    this.f5140H.add(new AnonymousClass0IC(C.f10006B, anonymousClass0P7));
                }
            }
        }
        if (this.f5140H.isEmpty()) {
            z = true;
            anonymousClass0eZ = this.f5134B;
            if (anonymousClass0eZ == null) {
                return;
            }
        } else {
            AnonymousClass4uO anonymousClass4uO = this.f5137E;
            if (anonymousClass4uO != null) {
                anonymousClass4uO.INA(this.f5140H);
            }
            this.f5134B.m6383H(this.f5138F ^ true, this.mEntryPointButton, this.f5144L);
            if (!(this.f5138F || this.f5137E.iK() == null)) {
                AnonymousClass3RF anonymousClass3RF = this.f5147O;
                AnonymousClass0P7 iK = this.f5137E.iK();
                AnonymousClass0bP G = AnonymousClass0bN.m5543G("igtv_banner_show", anonymousClass3RF.f41202B);
                G.QC = iK.getId();
                G.f6757g = iK.MA().getId();
                AnonymousClass0bN.m5568f(G.m5577B(), AnonymousClass0dd.REGULAR);
            }
            this.f5138F = false;
            if (this.f5134B.m6374D()) {
                this.f5145M = true;
                return;
            }
            return;
        }
        anonymousClass0eZ.m6378C(z);
    }

    /* renamed from: E */
    public final boolean m4504E() {
        String P = AnonymousClass0HV.m2008D(this.f5146N).m2028P();
        String string = AnonymousClass0HV.m2008D(this.f5146N).f2646B.getString("felix_last_viewer_seen_newness_token", null);
        if (P == "felix_never_fetched") {
            return false;
        }
        return AnonymousClass0LQ.m2954B(P, string) ^ 1;
    }

    public final void PGA(View view, Bundle bundle) {
        this.mPendingMediaObserver = new AnonymousClass0n5(view.getContext(), this.f5146N, this, this.f5139G);
        this.mPendingMediaObserver.m7600B();
        AnonymousClass0F4.f2058E.m1504A(AnonymousClass22q.class, this.f5150R);
    }

    public final void St() {
        this.f5143K = false;
        this.f5138F = false;
        if (this.f5145M) {
            m4501B();
            this.f5145M = false;
        }
    }

    public final void gi() {
        AnonymousClass0n5 anonymousClass0n5 = this.mPendingMediaObserver;
        if (anonymousClass0n5 != null) {
            anonymousClass0n5.f9998D.m3096B();
            anonymousClass0n5.f9998D = null;
        }
        IGTVFeedControllerLifecycleUtil.cleanupReferences(this);
        AnonymousClass0F4.f2058E.m1507D(AnonymousClass22q.class, this.f5150R);
        this.f5134B = null;
    }

    public final void gx() {
        this.f5143K = true;
        m4498C(this);
    }

    public final void oh() {
        m4500A();
    }

    public final void xn(boolean z, boolean z2) {
        m4498C(this);
    }
}
