package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.5UA */
public final class AnonymousClass5UA implements AnonymousClass4TQ {
    /* renamed from: B */
    public AnonymousClass5TJ f64803B;
    /* renamed from: C */
    private final ImageView f64804C;
    /* renamed from: D */
    private final ImageView f64805D;
    /* renamed from: E */
    private final ImageView f64806E;
    /* renamed from: F */
    private final View f64807F;
    /* renamed from: G */
    private final ImageView f64808G;
    /* renamed from: H */
    private final ViewGroup f64809H;
    /* renamed from: I */
    private final ImageView f64810I;
    /* renamed from: J */
    private final View f64811J;
    /* renamed from: K */
    private final View f64812K;
    /* renamed from: L */
    private final ImageView f64813L;
    /* renamed from: M */
    private final TextView f64814M;
    /* renamed from: N */
    private final boolean f64815N = (AnonymousClass0kV.C() ^ true);
    /* renamed from: O */
    private final float f64816O;
    /* renamed from: P */
    private final AnonymousClass4TL f64817P = new AnonymousClass4TL();
    /* renamed from: Q */
    private final AnonymousClass0Cm f64818Q;
    /* renamed from: R */
    private final View f64819R;

    public final void eNA(AnonymousClass5TI anonymousClass5TI) {
    }

    public final void oRA(float f) {
    }

    public final void pRA(boolean z) {
    }

    public AnonymousClass5UA(Context context, AnonymousClass0Cm anonymousClass0Cm, ViewStub viewStub, int i) {
        View inflate;
        AnonymousClass15z anonymousClass15z;
        Resources resources = context.getResources();
        this.f64818Q = anonymousClass0Cm;
        this.f64816O = (float) resources.getDimensionPixelOffset(C0164R.dimen.quick_capture_shutter_translation_y);
        viewStub.setLayoutResource(AnonymousClass4TN.E(this.f64818Q));
        View inflate2 = viewStub.inflate();
        AnonymousClass4TN.D(inflate2, C0164R.layout.layout_post_capture_button_share_container_direct_reply);
        this.f64809H = (ViewGroup) inflate2.findViewById(C0164R.id.edit_buttons_toolbar);
        this.f64804C = (ImageView) inflate2.findViewById(C0164R.id.asset_button);
        this.f64806E = (ImageView) inflate2.findViewById(C0164R.id.add_text_button);
        this.f64808G = (ImageView) inflate2.findViewById(C0164R.id.draw_button);
        this.f64807F = inflate2.findViewById(C0164R.id.done_button);
        this.f64805D = (ImageView) inflate2.findViewById(C0164R.id.cancel_button);
        this.f64810I = (ImageView) inflate2.findViewById(C0164R.id.video_mute_button);
        if (this.f64815N) {
            inflate = ((ViewStub) inflate2.findViewById(C0164R.id.bottom_save_button_view_stub)).inflate();
        } else {
            inflate = ((ViewStub) inflate2.findViewById(C0164R.id.top_save_button_view_stub)).inflate();
        }
        this.f64812K = inflate;
        this.f64813L = (ImageView) inflate.findViewById(C0164R.id.camera_save_button_icon);
        this.f64814M = (TextView) this.f64812K.findViewById(C0164R.id.camera_save_button_label);
        inflate = null;
        this.f64819R = i == 2 ? ((ViewStub) inflate2.findViewById(C0164R.id.view_mode_toggle_button_stub)).inflate() : null;
        if (((Boolean) AnonymousClass0CC.tD.G()).booleanValue()) {
            inflate = ((ViewStub) inflate2.findViewById(C0164R.id.post_capture_facefilter_button_stub)).inflate();
        }
        this.f64811J = inflate;
        View view = this.f64811J;
        if (view != null) {
            anonymousClass15z = new AnonymousClass15z(view);
            anonymousClass15z.f14385E = new AnonymousClass4TD(this);
            anonymousClass15z.A();
        }
        anonymousClass15z = new AnonymousClass15z(this.f64804C);
        anonymousClass15z.f14385E = new AnonymousClass4TE(this);
        anonymousClass15z.A();
        anonymousClass15z = new AnonymousClass15z(this.f64806E);
        anonymousClass15z.f14385E = new AnonymousClass4TF(this);
        anonymousClass15z.A();
        anonymousClass15z = new AnonymousClass15z(this.f64810I);
        anonymousClass15z.f14385E = new AnonymousClass4TG(this);
        anonymousClass15z.A();
        anonymousClass15z = new AnonymousClass15z(this.f64808G);
        anonymousClass15z.f14385E = new AnonymousClass4TH(this);
        anonymousClass15z.A();
        anonymousClass15z = new AnonymousClass15z(this.f64805D);
        anonymousClass15z.f14385E = new AnonymousClass4TI(this);
        anonymousClass15z.A();
        anonymousClass15z = new AnonymousClass15z(this.f64807F);
        anonymousClass15z.f14385E = new AnonymousClass4TJ(this);
        anonymousClass15z.A();
        anonymousClass15z = new AnonymousClass15z(this.f64812K);
        anonymousClass15z.f14385E = new AnonymousClass4TK(this);
        anonymousClass15z.A();
        if (this.f64815N && i == 1) {
            AnonymousClass0Nm.W(this.f64812K, resources.getDimensionPixelOffset(C0164R.dimen.quick_capture_share_options_padding) + resources.getDimensionPixelOffset(C0164R.dimen.quick_capture_picker_label_size));
        }
    }

    public final void DPA(AnonymousClass5TJ anonymousClass5TJ) {
        this.f64803B = anonymousClass5TJ;
    }

    public final void LRA(float f) {
        int i = (int) (255.0f * f);
        if (this.f64815N) {
            this.f64813L.setImageAlpha(i);
            this.f64814M.setAlpha(f);
            return;
        }
        ((ImageView) this.f64812K).setImageAlpha(i);
    }

    public final void XBA(float f) {
        AnonymousClass4TN.B(f, this.f64816O, new View[]{this.f64805D, this.f64804C, this.f64806E, this.f64808G, this.f64811J});
        if (this.f64810I.isEnabled()) {
            AnonymousClass4TN.B(f, this.f64816O, new View[]{this.f64810I});
        }
        if (this.f64819R != null) {
            AnonymousClass4TN.B(f, this.f64816O, new View[]{r2});
        }
        if (this.f64815N) {
            AnonymousClass4TN.C(f, this.f64816O, new View[]{this.f64812K});
            return;
        }
        AnonymousClass4TN.B(f, this.f64816O, new View[]{this.f64812K});
    }

    public final void kDA() {
        AnonymousClass4TN.G(new View[]{this.f64811J, this.f64804C, this.f64806E, this.f64808G, this.f64805D, this.f64812K});
        if (this.f64810I.isEnabled()) {
            AnonymousClass4TN.G(new View[]{this.f64810I});
        }
    }

    public final void lDA(boolean z) {
        AnonymousClass4TN.F(new View[]{this.f64811J, this.f64804C, this.f64806E, this.f64808G, this.f64805D, this.f64812K});
        if (this.f64810I.isEnabled()) {
            AnonymousClass4TN.F(new View[]{this.f64810I});
        }
    }

    public final void oPA(AnonymousClass4TP anonymousClass4TP) {
        AnonymousClass4TN.I(this.f64810I, anonymousClass4TP);
    }

    public final void wTA(boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass4TN.I(this.f64810I, z2 ? AnonymousClass4TP.SOUND_ON : AnonymousClass4TP.HIDDEN);
        this.f64817P.A(this.f64818Q, this.f64809H, this.f64810I, this.f64815N ? null : this.f64812K, null, this.f64810I.getResources().getDimensionPixelSize(C0164R.dimen.quick_capture_edit_button_dim));
    }
}
