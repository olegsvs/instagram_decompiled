package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.ui.widget.base.BoundedLinearLayout;

/* renamed from: X.5U7 */
public final class AnonymousClass5U7 implements AnonymousClass4TQ {
    /* renamed from: B */
    public Drawable f64735B;
    /* renamed from: C */
    public final View f64736C;
    /* renamed from: D */
    public final Context f64737D;
    /* renamed from: E */
    public final BoundedLinearLayout f64738E;
    /* renamed from: F */
    public final ImageView f64739F;
    /* renamed from: G */
    public boolean f64740G;
    /* renamed from: H */
    public AnonymousClass5TJ f64741H;
    /* renamed from: I */
    public final BoundedLinearLayout f64742I;
    /* renamed from: J */
    public final View f64743J;
    /* renamed from: K */
    public final BoundedLinearLayout f64744K;
    /* renamed from: L */
    public AnonymousClass0RL f64745L;
    /* renamed from: M */
    public final AnonymousClass0Cm f64746M;
    /* renamed from: N */
    private final ImageView f64747N;
    /* renamed from: O */
    private final ImageView f64748O;
    /* renamed from: P */
    private final TextView f64749P;
    /* renamed from: Q */
    private final ImageView f64750Q;
    /* renamed from: R */
    private final ImageView f64751R;
    /* renamed from: S */
    private AnonymousClass5TI f64752S;
    /* renamed from: T */
    private final View f64753T;
    /* renamed from: U */
    private final ImageView f64754U;
    /* renamed from: V */
    private final ViewGroup f64755V;
    /* renamed from: W */
    private final boolean f64756W;
    /* renamed from: X */
    private final ImageView f64757X;
    /* renamed from: Y */
    private final TextView f64758Y;
    /* renamed from: Z */
    private final View f64759Z;
    /* renamed from: a */
    private final ImageView f64760a;
    /* renamed from: b */
    private final TextView f64761b;
    /* renamed from: c */
    private final ImageView f64762c;
    /* renamed from: d */
    private boolean f64763d = true;
    /* renamed from: e */
    private boolean f64764e;
    /* renamed from: f */
    private final float f64765f;
    /* renamed from: g */
    private final AnonymousClass4TL f64766g;
    /* renamed from: h */
    private final ImageView f64767h;
    /* renamed from: i */
    private final View f64768i;

    public AnonymousClass5U7(Context context, AnonymousClass0Cm anonymousClass0Cm, ViewStub viewStub, boolean z, int i) {
        AnonymousClass15z anonymousClass15z;
        this.f64737D = context;
        this.f64746M = anonymousClass0Cm;
        Resources resources = context.getResources();
        this.f64765f = (float) resources.getDimensionPixelOffset(C0164R.dimen.quick_capture_shutter_translation_y);
        this.f64756W = z;
        this.f64766g = new AnonymousClass4TL();
        viewStub.setLayoutResource(AnonymousClass4TN.E(this.f64746M));
        View inflate = viewStub.inflate();
        AnonymousClass4TN.D(inflate, C0164R.layout.layout_post_capture_button_share_container_default);
        this.f64755V = (ViewGroup) inflate.findViewById(C0164R.id.edit_buttons_toolbar);
        this.f64747N = (ImageView) inflate.findViewById(C0164R.id.asset_button);
        this.f64751R = (ImageView) inflate.findViewById(C0164R.id.add_text_button);
        this.f64754U = (ImageView) inflate.findViewById(C0164R.id.draw_button);
        this.f64753T = inflate.findViewById(C0164R.id.done_button);
        this.f64750Q = (ImageView) inflate.findViewById(C0164R.id.cancel_button);
        this.f64757X = (ImageView) inflate.findViewById(C0164R.id.video_mute_button);
        this.f64743J = inflate.findViewById(C0164R.id.recipients_picker_button);
        this.f64767h = (ImageView) ((ViewStub) inflate.findViewById(C0164R.id.top_save_button_view_stub)).inflate();
        View findViewById = inflate.findViewById(C0164R.id.bottom_save_button);
        this.f64736C = findViewById;
        this.f64748O = (ImageView) findViewById.findViewById(C0164R.id.camera_save_button_icon);
        this.f64749P = (TextView) this.f64736C.findViewById(C0164R.id.camera_save_button_label);
        ImageView imageView = null;
        this.f64768i = i == 2 ? ((ViewStub) inflate.findViewById(C0164R.id.view_mode_toggle_button_stub)).inflate() : null;
        this.f64759Z = ((Boolean) AnonymousClass0CC.tD.H(anonymousClass0Cm)).booleanValue() ? ((ViewStub) inflate.findViewById(C0164R.id.post_capture_facefilter_button_stub)).inflate() : null;
        if (i == 1) {
            AnonymousClass0Nm.W(this.f64736C, resources.getDimensionPixelOffset(C0164R.dimen.quick_capture_share_options_padding) + resources.getDimensionPixelOffset(C0164R.dimen.quick_capture_picker_label_size));
        }
        ViewStub viewStub2 = (ViewStub) inflate.findViewById(C0164R.id.share_controls_stub);
        viewStub2.setLayoutResource(!AnonymousClass0yJ.C() ? C0164R.layout.layout_share_controls : C0164R.layout.layout_share_controls_favorites_v2);
        viewStub2.inflate();
        BoundedLinearLayout boundedLinearLayout = (BoundedLinearLayout) inflate.findViewById(C0164R.id.my_story_button);
        this.f64742I = boundedLinearLayout;
        this.f64758Y = boundedLinearLayout != null ? (TextView) boundedLinearLayout.findViewById(C0164R.id.my_story_button_label) : null;
        boundedLinearLayout = m26987C() ? (BoundedLinearLayout) inflate.findViewById(C0164R.id.story_sharing_options_button) : null;
        this.f64744K = boundedLinearLayout;
        this.f64761b = boundedLinearLayout != null ? (TextView) boundedLinearLayout.findViewById(C0164R.id.story_sharing_options_button_label) : null;
        this.f64738E = AnonymousClass0yJ.C() ? (BoundedLinearLayout) inflate.findViewById(C0164R.id.my_story_favorites_button) : null;
        if (AnonymousClass0yJ.C()) {
            this.f64760a = (ImageView) inflate.findViewById(C0164R.id.my_story_avatar);
            this.f64739F = (ImageView) inflate.findViewById(C0164R.id.favorites_story_avatar);
            BoundedLinearLayout boundedLinearLayout2 = this.f64744K;
            if (boundedLinearLayout2 != null) {
                imageView = (ImageView) boundedLinearLayout2.findViewById(C0164R.id.story_sharing_options_button_icon);
            }
            this.f64762c = imageView;
            this.f64745L = new AnonymousClass4Sm(this);
            AnonymousClass0Gs.f2431j.D(this.f64746M.B().DQ()).C(this.f64745L).B();
            Context context2 = this.f64737D;
            this.f64739F.setImageDrawable(AnonymousClass31T.D(this.f64737D, new LayerDrawable(new Drawable[]{AnonymousClass31T.G(), AnonymousClass31T.C(context2, C0164R.drawable.close_friends_star)})));
        } else if (m26988D()) {
            this.f64760a = (ImageView) inflate.findViewById(C0164R.id.my_story_avatar);
            this.f64739F = null;
            if (m26987C()) {
                imageView = (ImageView) inflate.findViewById(C0164R.id.story_sharing_options_button_icon);
            }
            this.f64762c = imageView;
        } else {
            this.f64760a = null;
            this.f64739F = null;
            this.f64762c = null;
        }
        View view = this.f64759Z;
        if (view != null) {
            anonymousClass15z = new AnonymousClass15z(view);
            anonymousClass15z.f14385E = new AnonymousClass4Sn(this);
            anonymousClass15z.A();
        }
        anonymousClass15z = new AnonymousClass15z(this.f64747N);
        anonymousClass15z.f14385E = new AnonymousClass4So(this);
        anonymousClass15z.A();
        anonymousClass15z = new AnonymousClass15z(this.f64751R);
        anonymousClass15z.f14385E = new AnonymousClass4Sp(this);
        anonymousClass15z.A();
        anonymousClass15z = new AnonymousClass15z(this.f64757X);
        anonymousClass15z.f14385E = new AnonymousClass4Sq(this);
        anonymousClass15z.A();
        anonymousClass15z = new AnonymousClass15z(this.f64754U);
        anonymousClass15z.f14385E = new AnonymousClass4Sr(this);
        anonymousClass15z.A();
        anonymousClass15z = new AnonymousClass15z(this.f64750Q);
        anonymousClass15z.f14385E = new AnonymousClass4Ss(this);
        anonymousClass15z.A();
        anonymousClass15z = new AnonymousClass15z(this.f64753T);
        anonymousClass15z.f14385E = new AnonymousClass4St(this);
        anonymousClass15z.A();
        AnonymousClass15J anonymousClass4Su = new AnonymousClass4Su(this);
        anonymousClass15z = new AnonymousClass15z(this.f64767h);
        anonymousClass15z.f14385E = anonymousClass4Su;
        anonymousClass15z.A();
        anonymousClass15z = new AnonymousClass15z(this.f64736C);
        anonymousClass15z.f14385E = anonymousClass4Su;
        anonymousClass15z.A();
        anonymousClass15z = new AnonymousClass15z(this.f64743J);
        anonymousClass15z.f14385E = new AnonymousClass4Sv(this);
        anonymousClass15z.A();
        if (this.f64756W) {
            view = this.f64742I;
            if (view != null) {
                anonymousClass15z = new AnonymousClass15z(view);
                anonymousClass15z.f14385E = new AnonymousClass4Si(this);
                anonymousClass15z.A();
            }
            view = this.f64738E;
            if (view != null) {
                anonymousClass15z = new AnonymousClass15z(view);
                anonymousClass15z.f14385E = new AnonymousClass4Sj(this);
                anonymousClass15z.A();
            }
            view = this.f64744K;
            if (view != null) {
                anonymousClass15z = new AnonymousClass15z(view);
                anonymousClass15z.f14385E = new AnonymousClass4Sk(this);
                anonymousClass15z.A();
            }
            AnonymousClass0Nm.T(this.f64743J, new AnonymousClass4Sl(this));
        }
    }

    /* renamed from: B */
    public static void m26986B(AnonymousClass5U7 anonymousClass5U7) {
        if (anonymousClass5U7.f64742I != null && anonymousClass5U7.f64760a != null && anonymousClass5U7.f64758Y != null) {
            Drawable layerDrawable;
            if (AnonymousClass0yJ.C()) {
                if (anonymousClass5U7.f64740G) {
                    Drawable drawable = anonymousClass5U7.f64735B;
                    if (drawable != null) {
                        Drawable E = AnonymousClass0Ca.E(anonymousClass5U7.f64737D, C0164R.drawable.fb_story_shortcut);
                        float intrinsicWidth = (((float) E.getIntrinsicWidth()) / ((float) E.getIntrinsicHeight())) * ((float) drawable.getIntrinsicHeight());
                        layerDrawable = new LayerDrawable(new Drawable[]{E, drawable});
                        layerDrawable.setLayerInset(1, 0, 0, ((int) intrinsicWidth) - drawable.getIntrinsicWidth(), 0);
                    }
                }
                layerDrawable = anonymousClass5U7.f64735B;
            } else if (anonymousClass5U7.f64740G) {
                layerDrawable = AnonymousClass0Ca.E(anonymousClass5U7.f64737D, C0164R.drawable.ig_fb_shortcut_outline_44);
            } else {
                layerDrawable = AnonymousClass0Ca.E(anonymousClass5U7.f64737D, C0164R.drawable.instagram_new_story_outline_44);
            }
            anonymousClass5U7.f64760a.setImageDrawable(layerDrawable);
            anonymousClass5U7.f64758Y.setText(anonymousClass5U7.f64740G ? C0164R.string.your_stories_button_text : C0164R.string.your_story_button_text);
        }
    }

    /* renamed from: C */
    private boolean m26987C() {
        return AnonymousClass2MX.B(this.f64746M) && ((Boolean) AnonymousClass0CC.bd.H(this.f64746M)).booleanValue() && m26989E();
    }

    /* renamed from: D */
    private boolean m26988D() {
        return AnonymousClass2MX.B(this.f64746M) && ((Boolean) AnonymousClass0CC.ad.H(this.f64746M)).booleanValue() && m26989E();
    }

    public final void DPA(AnonymousClass5TJ anonymousClass5TJ) {
        this.f64741H = anonymousClass5TJ;
    }

    /* renamed from: E */
    private boolean m26989E() {
        if (!AnonymousClass0yJ.C() || ((Boolean) AnonymousClass0CC.cd.H(this.f64746M)).booleanValue()) {
            if (((Boolean) AnonymousClass0CC.dd.H(this.f64746M)).booleanValue()) {
                if (AnonymousClass0a2.K(this.f64746M)) {
                }
            }
            return true;
        }
        return false;
    }

    public final void LRA(float f) {
        int i = (int) (255.0f * f);
        if (this.f64764e) {
            this.f64748O.setImageAlpha(i);
            this.f64749P.setAlpha(f);
            return;
        }
        this.f64767h.setImageAlpha(i);
    }

    public final void XBA(float f) {
        ImageView imageView;
        AnonymousClass4TN.B(f, this.f64765f, new View[]{this.f64750Q, this.f64747N, this.f64751R, this.f64754U});
        if (this.f64757X.isEnabled()) {
            AnonymousClass4TN.B(f, this.f64765f, new View[]{this.f64757X});
        }
        View view = this.f64759Z;
        if (view != null && view.isEnabled()) {
            AnonymousClass4TN.B(f, this.f64765f, new View[]{this.f64759Z});
        }
        AnonymousClass5TI anonymousClass5TI = this.f64752S;
        if (anonymousClass5TI == null) {
            imageView = null;
        } else {
            imageView = anonymousClass5TI.f64385B.f66859Z.f64392G;
        }
        if (imageView != null) {
            AnonymousClass4TN.B(f, this.f64765f, new View[]{imageView});
        }
        if (this.f64768i != null) {
            AnonymousClass4TN.B(f, this.f64765f, new View[]{this.f64768i});
        }
        if (this.f64764e) {
            AnonymousClass4TN.C(f, this.f64765f, new View[]{this.f64736C});
        } else {
            AnonymousClass4TN.B(f, this.f64765f, new View[]{this.f64767h});
        }
        if (this.f64763d) {
            AnonymousClass5TJ anonymousClass5TJ;
            if (this.f64756W && this.f64742I != null) {
                AnonymousClass4TN.C(f, this.f64765f, new View[]{this.f64742I});
            }
            AnonymousClass4TN.C(f, this.f64765f, new View[]{this.f64743J});
            if (this.f64756W && this.f64738E != null) {
                AnonymousClass4TN.C(f, this.f64765f, new View[]{this.f64738E});
                anonymousClass5TJ = this.f64741H;
                if (anonymousClass5TJ != null && f == 1.0f) {
                    View view2 = this.f64738E;
                    AnonymousClass0dF anonymousClass0dF = anonymousClass5TJ.f64386B.f66841H;
                    if (((AnonymousClass3AN) anonymousClass0dF.f7372L.f5584B) == AnonymousClass3AN.POST_CAPTURE && ((Boolean) AnonymousClass0CC.Lf.H(anonymousClass0dF.f7407u)).booleanValue()) {
                        anonymousClass0dF.f7405s.B(anonymousClass0dF.f7389c, view2, anonymousClass0dF.f7370J.B() == AnonymousClass3FK.PHOTO ? AnonymousClass4Uc.CAMERA_FAVORITES_SHARE_PHOTO_BUTTON : AnonymousClass4Uc.CAMERA_FAVORITES_SHARE_VIDEO_BUTTON);
                    }
                }
            }
            if (this.f64756W && this.f64744K != null) {
                AnonymousClass4TN.C(f, this.f64765f, new View[]{this.f64744K});
                anonymousClass5TJ = this.f64741H;
                if (anonymousClass5TJ != null && f == 1.0f) {
                    View view3 = this.f64744K;
                    AnonymousClass0dF anonymousClass0dF2 = anonymousClass5TJ.f64386B.f66841H;
                    anonymousClass0dF2.f7405s.B(anonymousClass0dF2.f7389c, view3, AnonymousClass4Uc.CAMERA_SHARING_OPTIONS_BUTTON);
                }
            }
        }
    }

    public final void eNA(AnonymousClass5TI anonymousClass5TI) {
        this.f64752S = anonymousClass5TI;
    }

    public final void kDA() {
        View[] viewArr = new View[5];
        viewArr[0] = this.f64747N;
        viewArr[1] = this.f64751R;
        viewArr[2] = this.f64754U;
        viewArr[3] = this.f64750Q;
        viewArr[4] = this.f64764e ? this.f64736C : this.f64767h;
        AnonymousClass4TN.G(viewArr);
        if (this.f64757X.isEnabled()) {
            AnonymousClass4TN.G(new View[]{this.f64757X});
        }
        View view = this.f64759Z;
        if (view != null && view.isEnabled()) {
            AnonymousClass4TN.G(new View[]{this.f64759Z});
        }
        if (this.f64763d) {
            if (this.f64756W && this.f64742I != null) {
                AnonymousClass4TN.G(new View[]{this.f64742I});
            }
            if (this.f64756W && this.f64738E != null) {
                AnonymousClass4TN.G(new View[]{this.f64738E});
            }
            if (this.f64756W && this.f64744K != null) {
                AnonymousClass4TN.G(new View[]{this.f64744K});
            }
            AnonymousClass4TN.G(new View[]{this.f64743J});
        }
    }

    public final void lDA(boolean z) {
        View[] viewArr = new View[6];
        viewArr[0] = this.f64759Z;
        viewArr[1] = this.f64747N;
        viewArr[2] = this.f64751R;
        viewArr[3] = this.f64754U;
        viewArr[4] = this.f64750Q;
        viewArr[5] = this.f64764e ? this.f64736C : this.f64767h;
        AnonymousClass4TN.F(viewArr);
        if (!z) {
            AnonymousClass4TN.F(new View[]{this.f64743J});
        }
        if (this.f64757X.isEnabled()) {
            AnonymousClass4TN.F(new View[]{this.f64757X});
        }
        View view = this.f64759Z;
        if (view != null && view.isEnabled()) {
            AnonymousClass4TN.F(new View[]{this.f64759Z});
        }
        if (this.f64742I != null) {
            AnonymousClass4TN.F(new View[]{this.f64742I});
        }
        if (this.f64738E != null) {
            AnonymousClass4TN.F(new View[]{this.f64738E});
        }
        if (this.f64744K != null) {
            AnonymousClass4TN.F(new View[]{this.f64744K});
        }
    }

    public final void oPA(AnonymousClass4TP anonymousClass4TP) {
        AnonymousClass4TN.I(this.f64757X, anonymousClass4TP);
    }

    public final void oRA(float f) {
        if (this.f64744K != null) {
            this.f64762c.setImageAlpha((int) (255.0f * f));
            this.f64761b.setAlpha(f);
        }
    }

    public final void pRA(boolean z) {
        if (m26988D() && this.f64740G != z) {
            this.f64740G = z;
            AnonymousClass5U7.m26986B(this);
        }
    }

    public final void wTA(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f64763d = z;
        this.f64764e = z3;
        AnonymousClass4TN.I(this.f64757X, z2 ? AnonymousClass4TP.SOUND_ON : AnonymousClass4TP.HIDDEN);
        if (this.f64764e) {
            AnonymousClass14H.E(false, new View[]{this.f64767h});
            AnonymousClass14H.H(false, new View[]{this.f64736C});
        } else {
            AnonymousClass14H.E(false, new View[]{this.f64736C});
            AnonymousClass14H.H(false, new View[]{this.f64767h});
        }
        AnonymousClass4TN.H(this.f64759Z, z4);
        this.f64743J.setEnabled(z);
        BoundedLinearLayout boundedLinearLayout = this.f64742I;
        if (boundedLinearLayout != null) {
            boundedLinearLayout.setEnabled(z);
        }
        boundedLinearLayout = this.f64738E;
        if (boundedLinearLayout != null) {
            boundedLinearLayout.setEnabled(z);
        }
        boundedLinearLayout = this.f64744K;
        if (boundedLinearLayout != null) {
            boundedLinearLayout.setEnabled(z);
        }
        ImageView imageView = this.f64739F;
        if (imageView != null) {
            imageView.setEnabled(z);
        }
        imageView = this.f64760a;
        if (imageView != null) {
            imageView.setEnabled(z);
        }
        imageView = this.f64762c;
        if (imageView != null) {
            imageView.setEnabled(z);
        }
        AnonymousClass4TL anonymousClass4TL = this.f64766g;
        AnonymousClass0Cm anonymousClass0Cm = this.f64746M;
        ViewGroup viewGroup = this.f64755V;
        View view = this.f64757X;
        View view2 = null;
        View view3 = this.f64764e ? null : this.f64767h;
        AnonymousClass5TI anonymousClass5TI = this.f64752S;
        if (anonymousClass5TI != null) {
            view2 = anonymousClass5TI.f64385B.f66859Z.f64392G;
        }
        anonymousClass4TL.A(anonymousClass0Cm, viewGroup, view, view3, view2, this.f64737D.getResources().getDimensionPixelSize(C0164R.dimen.quick_capture_edit_button_dim));
    }
}
