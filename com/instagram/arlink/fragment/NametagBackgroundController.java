package com.instagram.arlink.fragment;

import X.AnonymousClass0Ca;
import X.AnonymousClass0Cm;
import X.AnonymousClass0Cn;
import X.AnonymousClass0GA;
import X.AnonymousClass0IJ;
import X.AnonymousClass0Ix;
import X.AnonymousClass0Lu;
import X.AnonymousClass0Nc;
import X.AnonymousClass0Pt;
import X.AnonymousClass0Pu;
import X.AnonymousClass0VA;
import X.AnonymousClass0ca;
import X.AnonymousClass15J;
import X.AnonymousClass27h;
import X.AnonymousClass27i;
import X.AnonymousClass27l;
import X.AnonymousClass2Fo;
import X.AnonymousClass2Hj;
import X.AnonymousClass2VF;
import X.AnonymousClass2mu;
import X.AnonymousClass311;
import X.AnonymousClass314;
import X.AnonymousClass31B;
import X.AnonymousClass31D;
import X.AnonymousClass44N;
import X.AnonymousClass49m;
import X.AnonymousClass49n;
import X.AnonymousClass4AB;
import X.AnonymousClass4Ai;
import X.AnonymousClass4Am;
import X.AnonymousClass4J9;
import X.AnonymousClass5Rr;
import X.AnonymousClass5SZ;
import X.AnonymousClass5cN;
import android.animation.ArgbEvaluator;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.arlink.ui.GridPatternView;
import com.instagram.common.gallery.Medium;
import com.instagram.ui.widget.nametag.NametagCardView;
import java.util.List;

public class NametagBackgroundController extends AnonymousClass0VA implements AnonymousClass15J, AnonymousClass5cN {
    /* renamed from: B */
    public int f67390B;
    /* renamed from: C */
    public AnonymousClass31B f67391C = AnonymousClass31B.COLOR;
    /* renamed from: D */
    public int f67392D = -16777216;
    /* renamed from: E */
    public final AnonymousClass5Rr f67393E;
    /* renamed from: F */
    public String f67394F;
    /* renamed from: G */
    public final AnonymousClass0IJ f67395G;
    /* renamed from: H */
    public final AnonymousClass4Am f67396H;
    /* renamed from: I */
    public int f67397I;
    /* renamed from: J */
    public final AnonymousClass0Cm f67398J;
    /* renamed from: K */
    private final ArgbEvaluator f67399K = new ArgbEvaluator();
    /* renamed from: L */
    private final AnonymousClass4AB f67400L;
    /* renamed from: M */
    private final AnonymousClass5SZ f67401M;
    /* renamed from: N */
    private final AnonymousClass4Ai f67402N;
    public View mBackgroundModeButton;
    public TextView mBackgroundModeLabel;
    public TextView mBottomButton;
    public NametagCardView mCardView;
    public ImageView mCloseButton;
    public View mGradientView;
    public GridPatternView mGridPatternView;
    public View mRootView;
    public View mSelfieButton;
    public ImageView mShareButton;

    public final void Cn(Medium medium) {
    }

    public final boolean JY() {
        return false;
    }

    public final long LL() {
        return 0;
    }

    public final void Qs() {
    }

    public final void Ss() {
    }

    public final void Xq(View view) {
    }

    public final void ZBA(AnonymousClass27l anonymousClass27l) {
    }

    public final void aBA(AnonymousClass27l anonymousClass27l, Drawable drawable) {
    }

    public final void xm(AnonymousClass2Fo anonymousClass2Fo, Drawable drawable, List list) {
    }

    public final boolean zX() {
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NametagBackgroundController(android.app.Activity r8, X.AnonymousClass0IJ r9, android.view.View r10, X.AnonymousClass0Cm r11, X.AnonymousClass4Am r12, X.AnonymousClass4AB r13, X.AnonymousClass0hj r14) {
        /*
        r7 = this;
        r5 = r7;
        r7.<init>();
        r0 = new android.animation.ArgbEvaluator;
        r0.<init>();
        r7.f67399K = r0;
        r0 = X.AnonymousClass31B.COLOR;
        r7.f67391C = r0;
        r0 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r7.f67392D = r0;
        r7.f67395G = r9;
        r3 = r10;
        r7.mRootView = r10;
        r7.f67396H = r12;
        r0 = 2131296815; // 0x7f09022f float:1.8211557E38 double:1.0530005374E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r7.mCloseButton = r0;
        r0 = 2131296494; // 0x7f0900ee float:1.8210906E38 double:1.053000379E-314;
        r0 = r10.findViewById(r0);
        r7.mBackgroundModeButton = r0;
        r1 = new X.15z;
        r0 = r7.mBackgroundModeButton;
        r1.<init>(r0);
        r1.f14385E = r7;
        r0 = 1;
        r1.f14386F = r0;
        r0 = 1;
        r1.f14393M = r0;
        r1.A();
        r0 = 2131296495; // 0x7f0900ef float:1.8210908E38 double:1.0530003793E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r7.mBackgroundModeLabel = r0;
        r0 = 2131299389; // 0x7f090c3d float:1.8216778E38 double:1.053001809E-314;
        r0 = r10.findViewById(r0);
        r7.mSelfieButton = r0;
        r1 = new X.15z;
        r0 = r7.mSelfieButton;
        r1.<init>(r0);
        r1.f14385E = r7;
        r1.A();
        r0 = 2131299418; // 0x7f090c5a float:1.8216837E38 double:1.0530018234E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r7.mShareButton = r0;
        r0 = 2131297571; // 0x7f090523 float:1.821309E38 double:1.053000911E-314;
        r1 = r10.findViewById(r0);
        r7.mGradientView = r1;
        r0 = new X.49k;
        r0.<init>(r7);
        r1.setOnClickListener(r0);
        r0 = 2131297581; // 0x7f09052d float:1.821311E38 double:1.053000916E-314;
        r0 = r10.findViewById(r0);
        r0 = (com.instagram.arlink.ui.GridPatternView) r0;
        r7.mGridPatternView = r0;
        r0.setColorUpdateCallback(r7);
        r1 = r7.mGridPatternView;
        r0 = new X.49l;
        r0.<init>(r7);
        r1.setOnClickListener(r0);
        r0 = 2131296740; // 0x7f0901e4 float:1.8211405E38 double:1.0530005003E-314;
        r0 = r10.findViewById(r0);
        r0 = (com.instagram.ui.widget.nametag.NametagCardView) r0;
        r7.mCardView = r0;
        r0 = 2131296549; // 0x7f090125 float:1.8211018E38 double:1.053000406E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r7.mBottomButton = r0;
        r4 = r11;
        r7.f67398J = r11;
        r6 = r13;
        r7.f67400L = r13;
        r2 = new X.5Rr;
        r7 = r14;
        r2.<init>(r3, r4, r5, r6, r7);
        r5.f67393E = r2;
        r0 = new X.5SZ;
        r0.<init>(r11);
        r5.f67401M = r0;
        r0 = new X.4Ai;
        r0.<init>(r8, r10, r11, r5);
        r5.f67402N = r0;
        r0 = r5.f67398J;
        r0 = r0.B();
        r1 = r0.iB;
        if (r1 == 0) goto L_0x00e8;
    L_0x00d0:
        r0 = r1.f3306E;
        r0 = X.AnonymousClass31B.B(r0);
        r5.f67391C = r0;
        r0 = r1.f3305D;
        r5.f67390B = r0;
        r0 = r1.f3303B;
        r5.f67394F = r0;
        r0 = r1.f3304C;
        r5.f67392D = r0;
        r0 = r1.f3307F;
        r5.f67397I = r0;
    L_0x00e8:
        r1 = r5.f67390B;
        r0 = com.instagram.ui.widget.nametag.NametagCardView.f43797M;
        r0 = r0.length;
        r2 = 0;
        if (r1 < r0) goto L_0x00f2;
    L_0x00f0:
        r5.f67390B = r2;
    L_0x00f2:
        r0 = r5.f67394F;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x0107;
    L_0x00fa:
        r1 = r5.f67394F;
        r0 = new android.graphics.Paint;
        r0.<init>();
        r0 = X.AnonymousClass1m0.B(r0, r1);
        if (r0 != 0) goto L_0x0111;
    L_0x0107:
        r0 = X.AnonymousClass2Hj.E();
        r0 = r0[r2];
        r0 = r0.f28577D;
        r5.f67394F = r0;
    L_0x0111:
        r0 = r5.f67392D;
        if (r0 != 0) goto L_0x0119;
    L_0x0115:
        r0 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r5.f67392D = r0;
    L_0x0119:
        r1 = r5.f67397I;
        r0 = X.AnonymousClass31D.values();
        r0 = r0.length;
        if (r1 < r0) goto L_0x0124;
    L_0x0122:
        r5.f67397I = r2;
    L_0x0124:
        r0 = r5.f67396H;
        r0.D(r5);
        r10.requestFocus();
        m28069C(r5);
        r5.m28072F();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.arlink.fragment.NametagBackgroundController.<init>(android.app.Activity, X.0IJ, android.view.View, X.0Cm, X.4Am, X.4AB, X.0hj):void");
    }

    /* renamed from: A */
    public final void m28073A(float f) {
        int i = 8;
        if (this.f67391C == AnonymousClass31B.COLOR) {
            this.mGradientView.setAlpha(f);
            this.mGradientView.setVisibility(f > 0.0f ? 0 : 8);
        } else {
            this.mGridPatternView.setAlpha(f);
            this.mGridPatternView.setVisibility(f > 0.0f ? 0 : 8);
        }
        ArgbEvaluator argbEvaluator = this.f67399K;
        int i2 = -1;
        Integer valueOf = Integer.valueOf(-1);
        if (!this.f67391C.f36955C) {
            i2 = AnonymousClass0Ca.C(this.mRootView.getContext(), C0164R.color.grey_9);
        }
        int intValue = ((Integer) argbEvaluator.evaluate(f, valueOf, Integer.valueOf(i2))).intValue();
        ColorFilter B = AnonymousClass0ca.B(intValue);
        this.mCloseButton.setColorFilter(B);
        this.mBackgroundModeButton.setAlpha(f);
        this.mBackgroundModeButton.setVisibility(f > 0.0f ? 0 : 8);
        this.mShareButton.setAlpha(f);
        this.mShareButton.setVisibility(f > 0.0f ? 0 : 8);
        if (this.f67391C == AnonymousClass31B.SELFIE) {
            this.mSelfieButton.setAlpha(f);
            View view = this.mSelfieButton;
            if (f > 0.0f) {
                i = 0;
            }
            view.setVisibility(i);
        }
        this.mBottomButton.setTextColor(intValue);
        this.mBottomButton.getCompoundDrawables()[0].mutate().setColorFilter(B);
    }

    /* renamed from: B */
    public static void m28068B(NametagBackgroundController nametagBackgroundController) {
        AnonymousClass31D B = AnonymousClass31D.B(nametagBackgroundController.f67397I);
        if (nametagBackgroundController.f67396H.C()) {
            nametagBackgroundController.mGridPatternView.setSelfieWithSticker(nametagBackgroundController.f67396H.A(B));
        } else {
            nametagBackgroundController.mGridPatternView.setSticker(B.f36965B);
        }
        nametagBackgroundController.mGridPatternView.setVisibility(0);
    }

    /* renamed from: B */
    public final boolean m28074B(float f) {
        return this.f67391C == AnonymousClass31B.EMOJI ? this.f67393E.m26556B(f, true) : false;
    }

    /* renamed from: C */
    public static void m28069C(NametagBackgroundController nametagBackgroundController) {
        Object obj;
        View view;
        int C = AnonymousClass0Ca.C(nametagBackgroundController.mRootView.getContext(), nametagBackgroundController.f67391C.f36955C ? C0164R.color.white : C0164R.color.grey_9);
        ColorFilter B = AnonymousClass0ca.B(C);
        nametagBackgroundController.mCloseButton.setColorFilter(B);
        nametagBackgroundController.mShareButton.setColorFilter(B);
        nametagBackgroundController.mBackgroundModeLabel.setBackgroundResource(nametagBackgroundController.f67391C.f36955C ? C0164R.drawable.mode_button_background_light : C0164R.drawable.mode_button_background_dark);
        nametagBackgroundController.mBackgroundModeLabel.setText(nametagBackgroundController.f67391C.f36954B);
        nametagBackgroundController.mBackgroundModeLabel.setTextColor(C);
        nametagBackgroundController.mBottomButton.setTextColor(C);
        C = 0;
        nametagBackgroundController.mBottomButton.getCompoundDrawables()[0].mutate().setColorFilter(B);
        if (nametagBackgroundController.f67391C.f36955C) {
            nametagBackgroundController.mBackgroundModeLabel.setShadowLayer(8.0f, 0.0f, 0.0f, AnonymousClass0Ca.C(nametagBackgroundController.mRootView.getContext(), C0164R.color.black_20_transparent));
        } else {
            nametagBackgroundController.mBackgroundModeLabel.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
        if (nametagBackgroundController.f67391C == AnonymousClass31B.SELFIE) {
            if (!nametagBackgroundController.f67396H.B()) {
                obj = null;
                nametagBackgroundController.mCloseButton.setVisibility(obj == null ? 0 : 8);
                nametagBackgroundController.mShareButton.setVisibility(obj == null ? 0 : 8);
                nametagBackgroundController.mBottomButton.setVisibility(obj == null ? 0 : 8);
                view = nametagBackgroundController.mSelfieButton;
                if (nametagBackgroundController.f67391C == AnonymousClass31B.SELFIE) {
                    C = 8;
                }
                view.setVisibility(C);
            }
        }
        obj = 1;
        if (obj == null) {
        }
        nametagBackgroundController.mCloseButton.setVisibility(obj == null ? 0 : 8);
        if (obj == null) {
        }
        nametagBackgroundController.mShareButton.setVisibility(obj == null ? 0 : 8);
        if (obj == null) {
        }
        nametagBackgroundController.mBottomButton.setVisibility(obj == null ? 0 : 8);
        view = nametagBackgroundController.mSelfieButton;
        if (nametagBackgroundController.f67391C == AnonymousClass31B.SELFIE) {
            C = 8;
        }
        view.setVisibility(C);
    }

    /* renamed from: C */
    public final boolean m28075C() {
        if (this.f67393E.m26558D() && this.f67393E.m26559E()) {
            return true;
        }
        if (!this.f67402N.B() || !this.f67396H.B()) {
            return false;
        }
        AnonymousClass311.CONFIG_SELFIE_RETAKE_CANCELLED.B();
        m28068B(this);
        this.f67402N.A(true);
        return true;
    }

    /* renamed from: D */
    public final void m28076D() {
        if (this.f67395G.isResumed() && this.f67391C == AnonymousClass31B.SELFIE) {
            m28068B(this);
        }
    }

    /* renamed from: D */
    public static void m28070D(NametagBackgroundController nametagBackgroundController) {
        Drawable gradientDrawable = new GradientDrawable(Orientation.TR_BL, NametagCardView.f43797M[nametagBackgroundController.f67390B]);
        gradientDrawable.setDither(true);
        nametagBackgroundController.mGradientView.setBackground(gradientDrawable);
        nametagBackgroundController.mCardView.setGradientTintColors(nametagBackgroundController.f67390B);
    }

    /* renamed from: E */
    private void m28071E() {
        Object obj;
        AnonymousClass0Lu anonymousClass0Lu = this.f67398J.B().iB;
        Object obj2 = 1;
        if (anonymousClass0Lu == null) {
            anonymousClass0Lu = new AnonymousClass0Lu(this.f67391C.f36956D);
            obj = 1;
        } else {
            obj = null;
        }
        if (anonymousClass0Lu.f3306E != this.f67391C.f36956D) {
            anonymousClass0Lu.f3306E = this.f67391C.f36956D;
            obj = 1;
        }
        int i = anonymousClass0Lu.f3305D;
        int i2 = this.f67390B;
        if (i != i2) {
            anonymousClass0Lu.f3305D = i2;
            obj = 1;
        }
        if (!this.f67394F.equals(anonymousClass0Lu.f3303B)) {
            anonymousClass0Lu.f3303B = this.f67394F;
            obj = 1;
        }
        i = anonymousClass0Lu.f3304C;
        i2 = this.f67392D;
        if (i != i2) {
            anonymousClass0Lu.f3304C = i2;
            obj = 1;
        }
        i = anonymousClass0Lu.f3307F;
        i2 = this.f67397I;
        if (i != i2) {
            anonymousClass0Lu.f3307F = i2;
        } else {
            obj2 = obj;
        }
        if (obj2 != null) {
            this.f67398J.B().iB = anonymousClass0Lu;
            AnonymousClass0Cn anonymousClass0Cn = this.f67398J;
            int i3 = this.f67391C.f36956D;
            int i4 = this.f67390B;
            String str = this.f67394F;
            int i5 = this.f67392D;
            int i6 = this.f67397I;
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
            anonymousClass0Pt.f4229M = "users/nametag_config/";
            AnonymousClass0GA H = anonymousClass0Pt.D("mode", String.valueOf(i3)).D("gradient", String.valueOf(i4)).D("emoji", str).D("emoji_color", String.valueOf(i5)).D("selfie_sticker", String.valueOf(i6)).M(AnonymousClass314.class).N().H();
            H.f2849B = new AnonymousClass49m(this, this.f67398J);
            AnonymousClass0Ix.D(H);
        }
    }

    /* renamed from: F */
    private void m28072F() {
        switch (AnonymousClass49n.f50994B[this.f67391C.ordinal()]) {
            case 1:
                this.mGradientView.setVisibility(0);
                this.mGridPatternView.setVisibility(8);
                this.f67402N.A(false);
                m28070D(this);
                break;
            case 2:
                this.mGradientView.setVisibility(8);
                this.mGridPatternView.setVisibility(0);
                this.mGridPatternView.setEmoji(this.f67394F);
                Integer dominantColor = this.mGridPatternView.getDominantColor();
                if (dominantColor == null) {
                    this.mCardView.setTintColor(this.f67392D);
                    break;
                } else {
                    this.mCardView.setTintColor(dominantColor.intValue());
                    break;
                }
            case 3:
                this.mGradientView.setVisibility(8);
                this.mGridPatternView.setVisibility(0);
                AnonymousClass31D B = AnonymousClass31D.B(this.f67397I);
                if (this.f67396H.C()) {
                    this.mGridPatternView.setSelfieWithSticker(this.f67396H.A(B));
                } else if (!this.f67396H.B()) {
                    this.f67402N.C(this.f67397I, false, false);
                    this.mGridPatternView.setSticker(B.f36965B);
                }
                this.mCardView.setTintColor(-16777216);
                break;
            default:
                break;
        }
        boolean z = true;
        this.f67393E.m26557C(true);
        AnonymousClass4AB anonymousClass4AB = this.f67400L;
        if (this.f67391C != AnonymousClass31B.EMOJI) {
            z = false;
        }
        anonymousClass4AB.f51047I = z;
    }

    /* renamed from: G */
    public final void m28077G() {
        int C = AnonymousClass0Ca.C(this.mRootView.getContext(), this.f67391C.f36955C ? C0164R.color.white : C0164R.color.grey_9);
        ColorFilter B = AnonymousClass0ca.B(C);
        this.mBottomButton.setTextColor(C);
        this.mBottomButton.getCompoundDrawables()[0].mutate().setColorFilter(B);
    }

    public final void St() {
        if (this.f67402N.B()) {
            AnonymousClass4Ai anonymousClass4Ai = this.f67402N;
            if (anonymousClass4Ai.f51125F.gX()) {
                AnonymousClass0Nc B = AnonymousClass44N.B(anonymousClass4Ai.f51125F);
                B.f3636p.C(new AnonymousClass2mu(B), "stop_preview", null);
                anonymousClass4Ai.f51126G.setSurfaceTextureListener(null);
            }
        }
        m28071E();
    }

    public final void Tk(AnonymousClass2Hj anonymousClass2Hj, Drawable drawable) {
        this.f67394F = anonymousClass2Hj.f28577D;
        this.mGridPatternView.setEmoji(this.f67394F);
        this.f67393E.m26557C(true);
        this.f67401M.C(new AnonymousClass2VF(anonymousClass2Hj));
        AnonymousClass311.CONFIG_EMOJI_CHANGED.A().F("value", this.f67394F).R();
    }

    public final void gd(AnonymousClass27h anonymousClass27h, Drawable drawable) {
        if (anonymousClass27h.eT() == AnonymousClass27i.EMOJI) {
            Tk(anonymousClass27h.ZL(), drawable);
        }
    }

    public final void gi() {
        m28071E();
        AnonymousClass5Rr anonymousClass5Rr = this.f67393E;
        if (anonymousClass5Rr.f63491H != null) {
            anonymousClass5Rr.f63487D.setBackground(null);
            anonymousClass5Rr.f63491H.B();
            anonymousClass5Rr.f63491H = null;
        }
        AnonymousClass4J9 anonymousClass4J9 = anonymousClass5Rr.f63485B;
        if (anonymousClass4J9 != null) {
            anonymousClass4J9.B();
        }
        AnonymousClass4Ai anonymousClass4Ai = this.f67402N;
        anonymousClass4Ai.A(false);
        if (anonymousClass4Ai.f51123D != null) {
            anonymousClass4Ai.f51124E.setBackground(null);
            anonymousClass4Ai.f51123D.B();
            anonymousClass4Ai.f51123D = null;
        }
        if (this.f67391C == AnonymousClass31B.SELFIE && !this.f67396H.B()) {
            this.f67391C = AnonymousClass31B.EMOJI;
            m28071E();
        }
        NametagBackgroundControllerLifecycleUtil.cleanupReferences(this);
    }

    public final void gx() {
        if (this.f67402N.B()) {
            AnonymousClass4Ai.C(this.f67402N);
        }
    }

    public final boolean yCA(View view) {
        if (view.getId() == C0164R.id.background_mode_button) {
            int length = (this.f67391C.f36956D + 1) % AnonymousClass31B.values().length;
            this.f67391C = AnonymousClass31B.B(length);
            AnonymousClass311.CONFIG_MODE_CHANGED.A().B("mode", length).R();
            m28069C(this);
            m28072F();
            return true;
        } else if (view.getId() != C0164R.id.selfie_button) {
            return false;
        } else {
            if (this.f67391C == AnonymousClass31B.SELFIE) {
                AnonymousClass311.CONFIG_SELFIE_RETAKE_TAPPED.B();
                this.f67402N.C(this.f67397I, true, true);
            }
            return true;
        }
    }
}
