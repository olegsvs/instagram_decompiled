package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.C0164R;

/* renamed from: X.5U8 */
public final class AnonymousClass5U8 implements AnonymousClass4TQ {
    /* renamed from: B */
    public AnonymousClass5TJ f64769B;
    /* renamed from: C */
    private final ImageView f64770C;
    /* renamed from: D */
    private final ImageView f64771D;
    /* renamed from: E */
    private final ImageView f64772E;
    /* renamed from: F */
    private final Context f64773F;
    /* renamed from: G */
    private final View f64774G;
    /* renamed from: H */
    private final ImageView f64775H;
    /* renamed from: I */
    private final ViewGroup f64776I;
    /* renamed from: J */
    private final ImageView f64777J;
    /* renamed from: K */
    private final View f64778K;
    /* renamed from: L */
    private final View f64779L;
    /* renamed from: M */
    private final View f64780M;
    /* renamed from: N */
    private final float f64781N;
    /* renamed from: O */
    private final AnonymousClass4TL f64782O = new AnonymousClass4TL();
    /* renamed from: P */
    private final AnonymousClass0Cm f64783P;
    /* renamed from: Q */
    private final View f64784Q;

    public final void eNA(AnonymousClass5TI anonymousClass5TI) {
    }

    public final void oRA(float f) {
    }

    public final void pRA(boolean z) {
    }

    public AnonymousClass5U8(Context context, AnonymousClass0Cm anonymousClass0Cm, ViewStub viewStub, int i) {
        AnonymousClass15z anonymousClass15z;
        Resources resources = context.getResources();
        this.f64783P = anonymousClass0Cm;
        this.f64781N = (float) resources.getDimensionPixelOffset(C0164R.dimen.quick_capture_shutter_translation_y);
        this.f64773F = context;
        viewStub.setLayoutResource(AnonymousClass4TN.E(this.f64783P));
        View inflate = viewStub.inflate();
        AnonymousClass4TN.D(inflate, C0164R.layout.layout_post_capture_button_share_container_direct_breeze_sheet);
        this.f64776I = (ViewGroup) inflate.findViewById(C0164R.id.edit_buttons_toolbar);
        this.f64770C = (ImageView) inflate.findViewById(C0164R.id.asset_button);
        this.f64772E = (ImageView) inflate.findViewById(C0164R.id.add_text_button);
        this.f64775H = (ImageView) inflate.findViewById(C0164R.id.draw_button);
        this.f64774G = inflate.findViewById(C0164R.id.done_button);
        this.f64771D = (ImageView) inflate.findViewById(C0164R.id.cancel_button);
        this.f64777J = (ImageView) inflate.findViewById(C0164R.id.video_mute_button);
        this.f64780M = ((ViewStub) inflate.findViewById(C0164R.id.top_save_button_view_stub)).inflate();
        this.f64779L = inflate.findViewById(C0164R.id.breeze_sheet_picker_button);
        View view = null;
        this.f64784Q = i == 2 ? ((ViewStub) inflate.findViewById(C0164R.id.view_mode_toggle_button_stub)).inflate() : null;
        if (((Boolean) AnonymousClass0CC.tD.G()).booleanValue()) {
            view = ((ViewStub) inflate.findViewById(C0164R.id.post_capture_facefilter_button_stub)).inflate();
        }
        this.f64778K = view;
        View view2 = this.f64778K;
        if (view2 != null) {
            anonymousClass15z = new AnonymousClass15z(view2);
            anonymousClass15z.f14385E = new AnonymousClass4Sw(this);
            anonymousClass15z.A();
        }
        anonymousClass15z = new AnonymousClass15z(this.f64770C);
        anonymousClass15z.f14385E = new AnonymousClass4Sx(this);
        anonymousClass15z.A();
        anonymousClass15z = new AnonymousClass15z(this.f64772E);
        anonymousClass15z.f14385E = new AnonymousClass4Sy(this);
        anonymousClass15z.A();
        anonymousClass15z = new AnonymousClass15z(this.f64777J);
        anonymousClass15z.f14385E = new AnonymousClass4Sz(this);
        anonymousClass15z.A();
        anonymousClass15z = new AnonymousClass15z(this.f64775H);
        anonymousClass15z.f14385E = new AnonymousClass4T0(this);
        anonymousClass15z.A();
        anonymousClass15z = new AnonymousClass15z(this.f64771D);
        anonymousClass15z.f14385E = new AnonymousClass4T1(this);
        anonymousClass15z.A();
        anonymousClass15z = new AnonymousClass15z(this.f64774G);
        anonymousClass15z.f14385E = new AnonymousClass4T2(this);
        anonymousClass15z.A();
        anonymousClass15z = new AnonymousClass15z(this.f64780M);
        anonymousClass15z.f14385E = new AnonymousClass4T3(this);
        anonymousClass15z.A();
        anonymousClass15z = new AnonymousClass15z(this.f64779L);
        anonymousClass15z.f14385E = new AnonymousClass4T4(this);
        anonymousClass15z.A();
    }

    public final void DPA(AnonymousClass5TJ anonymousClass5TJ) {
        this.f64769B = anonymousClass5TJ;
    }

    public final void LRA(float f) {
        ((ImageView) this.f64780M).setImageAlpha((int) (f * 255.0f));
    }

    public final void XBA(float f) {
        AnonymousClass4TN.B(f, this.f64781N, new View[]{this.f64771D, this.f64770C, this.f64772E, this.f64775H, this.f64778K, this.f64780M});
        if (this.f64784Q != null) {
            AnonymousClass4TN.B(f, this.f64781N, new View[]{r2});
        }
        if (this.f64777J.isEnabled()) {
            AnonymousClass4TN.B(f, this.f64781N, new View[]{this.f64777J});
        }
        if (f > 0.6f) {
            AnonymousClass4TN.G(new View[]{this.f64779L});
            return;
        }
        AnonymousClass4TN.F(new View[]{this.f64779L});
    }

    public final void kDA() {
        AnonymousClass4TN.G(new View[]{this.f64778K, this.f64770C, this.f64772E, this.f64775H, this.f64771D, this.f64780M, this.f64779L});
        if (this.f64777J.isEnabled()) {
            AnonymousClass4TN.G(new View[]{this.f64777J});
        }
    }

    public final void lDA(boolean z) {
        AnonymousClass4TN.F(new View[]{this.f64778K, this.f64770C, this.f64772E, this.f64775H, this.f64771D, this.f64780M, this.f64779L});
        if (this.f64777J.isEnabled()) {
            AnonymousClass4TN.F(new View[]{this.f64777J});
        }
    }

    public final void oPA(AnonymousClass4TP anonymousClass4TP) {
        AnonymousClass4TN.I(this.f64777J, anonymousClass4TP);
    }

    public final void wTA(boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass4TN.I(this.f64777J, z2 ? AnonymousClass4TP.SOUND_ON : AnonymousClass4TP.HIDDEN);
        this.f64782O.A(this.f64783P, this.f64776I, this.f64777J, this.f64780M, null, this.f64773F.getResources().getDimensionPixelSize(C0164R.dimen.quick_capture_edit_button_dim));
    }
}
