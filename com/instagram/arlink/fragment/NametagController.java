package com.instagram.arlink.fragment;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ca;
import X.AnonymousClass0Ci;
import X.AnonymousClass0Cm;
import X.AnonymousClass0IJ;
import X.AnonymousClass0TK;
import X.AnonymousClass0VA;
import X.AnonymousClass0ca;
import X.AnonymousClass0dG;
import X.AnonymousClass0hj;
import X.AnonymousClass15z;
import X.AnonymousClass1Ba;
import X.AnonymousClass31B;
import X.AnonymousClass3Ax;
import X.AnonymousClass3B0;
import X.AnonymousClass49h;
import X.AnonymousClass49o;
import X.AnonymousClass49p;
import X.AnonymousClass49q;
import X.AnonymousClass49v;
import X.AnonymousClass49w;
import X.AnonymousClass4A7;
import X.AnonymousClass4AB;
import X.AnonymousClass4AN;
import X.AnonymousClass4Am;
import X.AnonymousClass4QZ;
import X.AnonymousClass5Ru;
import android.app.Activity;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.ui.widget.nametag.NametagCardView;

public class NametagController extends AnonymousClass0VA implements AnonymousClass0dG {
    /* renamed from: B */
    public final Activity f63529B;
    /* renamed from: C */
    public final NametagBackgroundController f63530C;
    /* renamed from: D */
    public final AnonymousClass49h f63531D;
    /* renamed from: E */
    public final AnonymousClass0IJ f63532E;
    /* renamed from: F */
    public final AnonymousClass4AB f63533F;
    /* renamed from: G */
    public final Handler f63534G = new Handler(Looper.getMainLooper());
    /* renamed from: H */
    public final boolean f63535H;
    /* renamed from: I */
    public AnonymousClass0Ci f63536I;
    /* renamed from: J */
    public boolean f63537J;
    /* renamed from: K */
    public boolean f63538K = true;
    /* renamed from: L */
    public AnonymousClass49w f63539L = AnonymousClass49w.SELF_CARD;
    /* renamed from: M */
    public final AnonymousClass0Cm f63540M;
    /* renamed from: N */
    private final AnonymousClass5Ru f63541N;
    /* renamed from: O */
    private final AnonymousClass4AN f63542O;
    public View mBottomBar;
    public TextView mBottomButton;
    public NametagCardView mCardView;
    public View mGradientOverlay;
    public ViewGroup mRootView;
    public View mTopBar;

    public final void Ym(boolean z, boolean z2, float f, float f2) {
    }

    public final void xDA() {
    }

    public NametagController(Activity activity, AnonymousClass0IJ anonymousClass0IJ, ViewGroup viewGroup, AnonymousClass0Cm anonymousClass0Cm, String str, String str2, RectF rectF, boolean z, AnonymousClass4Am anonymousClass4Am, AnonymousClass4QZ anonymousClass4QZ, AnonymousClass0hj anonymousClass0hj) {
        NametagController nametagController = this;
        this.f63529B = activity;
        AnonymousClass0IJ anonymousClass0IJ2 = anonymousClass0IJ;
        this.f63532E = anonymousClass0IJ;
        AnonymousClass4QZ anonymousClass4QZ2 = anonymousClass4QZ;
        anonymousClass4QZ2.A(this);
        View view = viewGroup;
        this.mRootView = viewGroup;
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        this.f63540M = anonymousClass0Cm;
        this.mGradientOverlay = viewGroup.findViewById(C0164R.id.gradient_overlay);
        NametagCardView nametagCardView = (NametagCardView) viewGroup.findViewById(C0164R.id.card_view);
        this.mCardView = nametagCardView;
        String str3 = str;
        nametagCardView.setName(str3, str2);
        this.mTopBar = viewGroup.findViewById(C0164R.id.top_bar);
        AnonymousClass15z anonymousClass15z = new AnonymousClass15z(viewGroup.findViewById(C0164R.id.close_button));
        anonymousClass15z.f14385E = new AnonymousClass49o(this);
        anonymousClass15z.A();
        anonymousClass15z = new AnonymousClass15z(viewGroup.findViewById(C0164R.id.share_button));
        anonymousClass15z.f14385E = new AnonymousClass49p(this, str3);
        anonymousClass15z.A();
        this.mBottomBar = viewGroup.findViewById(C0164R.id.bottom_bar);
        this.mBottomButton = (TextView) viewGroup.findViewById(C0164R.id.bottom_button);
        this.mBottomButton.setCompoundDrawablesWithIntrinsicBounds(AnonymousClass0Ca.E(activity, C0164R.drawable.instagram_camera_outline_24), null, null, null);
        anonymousClass15z = new AnonymousClass15z(this.mBottomButton);
        anonymousClass15z.f14385E = new AnonymousClass49q(this);
        anonymousClass15z.f14386F = true;
        anonymousClass15z.f14393M = true;
        anonymousClass15z.A();
        if (VERSION.SDK_INT < 21) {
            this.mBottomButton.getPaint().setFakeBoldText(true);
        }
        AnonymousClass4AB anonymousClass4AB = new AnonymousClass4AB(activity, (TouchInterceptorFrameLayout) view);
        this.f63533F = anonymousClass4AB;
        if (!anonymousClass4AB.f51050L.contains(this)) {
            anonymousClass4AB.f51050L.add(this);
        }
        AnonymousClass4AB anonymousClass4AB2 = this.f63533F;
        anonymousClass4AB2.f51043E.B(anonymousClass4AB2.f51053O, anonymousClass4AB2.f51052N);
        AnonymousClass0TK nametagBackgroundController = new NametagBackgroundController(this.f63529B, anonymousClass0IJ2, view, anonymousClass0Cm2, anonymousClass4Am, this.f63533F, anonymousClass0hj);
        nametagController.f63530C = nametagBackgroundController;
        anonymousClass4QZ2.A(nametagBackgroundController);
        boolean z2 = z;
        nametagController.f63541N = new AnonymousClass5Ru(activity, anonymousClass0IJ, viewGroup, anonymousClass0Cm, nametagController.f63533F, nametagController);
        anonymousClass4QZ2.A(nametagController.f63541N);
        RectF rectF2 = rectF;
        nametagController.f63542O = new AnonymousClass4AN(nametagController.f63529B, nametagController.f63532E, nametagController, rectF2, rectF2);
        anonymousClass4QZ2.A(nametagController.f63542O);
        nametagController.f63531D = new AnonymousClass49h(viewGroup);
        nametagController.f63535H = z2;
        if (z) {
            nametagController.f63539L = AnonymousClass49w.CAMERA_DELAY_INIT;
        }
        AnonymousClass49w anonymousClass49w = nametagController.f63539L;
        if (anonymousClass49w == null || (anonymousClass49w == AnonymousClass49w.RESULT_CARD && nametagController.f63536I == null)) {
            nametagController.f63539L = AnonymousClass49w.SELF_CARD;
        }
        if (nametagController.f63539L == AnonymousClass49w.CAMERA_SCAN || nametagController.f63539L == AnonymousClass49w.CAMERA_DELAY_INIT || nametagController.f63539L == AnonymousClass49w.RESULT_CARD) {
            nametagController.f63538K = false;
            nametagController.mCardView.setVisibility(8);
            nametagController.mBottomButton.setText(nametagController.f63535H ? C0164R.string.go_to_your_nametag : C0164R.string.back_to_your_nametag);
            nametagController.mBottomButton.setCompoundDrawablesWithIntrinsicBounds(C0164R.drawable.ic_nametag, 0, 0, 0);
            nametagController.f63530C.m28073A(0.0f);
        }
        m26563B(nametagController, nametagController.f63539L, null);
    }

    /* renamed from: A */
    public final boolean m26565A() {
        if (this.f63539L == AnonymousClass49w.CAMERA_PERMISSION) {
            return false;
        }
        if (!this.f63530C.m28075C()) {
            if (!this.f63541N.m26578B()) {
                this.f63542O.A();
                return true;
            }
        }
        return true;
    }

    /* renamed from: B */
    public static void m26563B(NametagController nametagController, AnonymousClass49w anonymousClass49w, AnonymousClass49w anonymousClass49w2) {
        switch (AnonymousClass49v.f51004B[anonymousClass49w.ordinal()]) {
            case 1:
                nametagController.mBottomButton.setText(C0164R.string.scan_a_nametag);
                nametagController.mBottomButton.setCompoundDrawablesWithIntrinsicBounds(C0164R.drawable.instagram_camera_outline_24, 0, 0, 0);
                if (anonymousClass49w2 != AnonymousClass49w.CAMERA_SCAN) {
                    if (anonymousClass49w2 == null) {
                        nametagController.f63530C.m28077G();
                        break;
                    }
                }
                nametagController.f63541N.m26583H(true);
                nametagController.mBottomButton.getCompoundDrawables()[0].mutate().setColorFilter(AnonymousClass0ca.B(-1));
                break;
                break;
            case 2:
                nametagController.mGradientOverlay.setVisibility(0);
                return;
            case 3:
                if (!AnonymousClass1Ba.D(nametagController.f63529B, "android.permission.CAMERA")) {
                    if (anonymousClass49w2 == null || anonymousClass49w2 == AnonymousClass49w.CAMERA_DELAY_INIT) {
                        nametagController.f63539L = AnonymousClass49w.CAMERA_PERMISSION;
                    } else {
                        nametagController.f63539L = anonymousClass49w2;
                    }
                    nametagController.f63541N.m26579C();
                    nametagController.mBottomButton.setEnabled(true);
                    break;
                }
                nametagController.f63541N.m26582G();
                if (anonymousClass49w2 == AnonymousClass49w.SELF_CARD) {
                    nametagController.mBottomButton.setText(nametagController.f63535H ? C0164R.string.go_to_your_nametag : C0164R.string.back_to_your_nametag);
                    nametagController.mBottomButton.setCompoundDrawablesWithIntrinsicBounds(C0164R.drawable.ic_nametag, 0, 0, 0);
                    nametagController.f63530C.m28077G();
                    break;
                }
                break;
            case 4:
                AnonymousClass0Ci anonymousClass0Ci = nametagController.f63536I;
                if (anonymousClass0Ci != null) {
                    anonymousClass49w = nametagController.f63541N;
                    anonymousClass49w.m26583H(false);
                    if (AnonymousClass5Ru.m26573D(anonymousClass49w) && anonymousClass49w.f63582J == null && anonymousClass49w.f63585M != null) {
                        anonymousClass49w2 = ((Boolean) AnonymousClass0CC.ci.H(anonymousClass49w.f63598Z)).booleanValue() ? 6 : 15;
                        nametagController = new AnonymousClass3Ax(anonymousClass49w.f63583K, new View[]{anonymousClass49w.f63588P, anonymousClass49w.f63585M});
                        nametagController.f38605D = 15;
                        nametagController.f38603B = anonymousClass49w2;
                        nametagController.f38607F = AnonymousClass0Ca.C(anonymousClass49w.f63578F.getContext(), C0164R.color.white_30_transparent);
                        AnonymousClass3B0 A = nametagController.A();
                        anonymousClass49w.f63582J = A;
                        A.setVisible(true, false);
                    }
                    anonymousClass49w.f63596X.D(anonymousClass0Ci);
                    return;
                }
                return;
            default:
                return;
        }
        nametagController.f63536I = null;
    }

    /* renamed from: C */
    public static void m26564C(NametagController nametagController, AnonymousClass49w anonymousClass49w) {
        AnonymousClass49w anonymousClass49w2 = nametagController.f63539L;
        if (anonymousClass49w2 != anonymousClass49w) {
            nametagController.f63539L = anonymousClass49w;
            m26563B(nametagController, anonymousClass49w, anonymousClass49w2);
        }
    }

    public final boolean Jn(boolean z, boolean z2, float f, float f2, float f3, float f4, float f5) {
        if (z2) {
            if (this.f63539L == AnonymousClass49w.CAMERA_SCAN) {
                AnonymousClass4A7 anonymousClass4A7 = this.f63541N.f63587O;
                if (anonymousClass4A7 != null) {
                    anonymousClass4A7.B(f2);
                }
            } else if (this.f63539L == AnonymousClass49w.SELF_CARD) {
                return this.f63530C.m28074B(f2);
            }
        }
        return false;
    }

    public final void gi() {
        this.f63533F.f51043E.A(null);
        NametagControllerLifecycleUtil.cleanupReferences(this);
    }

    public final void qy(boolean z, boolean z2, float f, float f2, float f3, float f4) {
        if (!z2) {
            return;
        }
        if (this.f63539L == AnonymousClass49w.CAMERA_SCAN) {
            AnonymousClass4A7 anonymousClass4A7 = this.f63541N.f63587O;
            if (anonymousClass4A7 != null) {
                anonymousClass4A7.A(f2);
            }
        } else if (this.f63539L == AnonymousClass49w.SELF_CARD) {
            NametagBackgroundController nametagBackgroundController = this.f63530C;
            if (nametagBackgroundController.f67391C == AnonymousClass31B.EMOJI) {
                nametagBackgroundController.f67393E.m26555A(f2);
            }
        }
    }
}
