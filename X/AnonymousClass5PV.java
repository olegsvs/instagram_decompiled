package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.C0164R;

/* renamed from: X.5PV */
public final class AnonymousClass5PV {
    /* renamed from: B */
    public View f63125B;
    /* renamed from: C */
    public final View f63126C;
    /* renamed from: D */
    public View f63127D;
    /* renamed from: E */
    public View f63128E;
    /* renamed from: F */
    public View f63129F;
    /* renamed from: G */
    public final View f63130G;
    /* renamed from: H */
    public View f63131H;
    /* renamed from: I */
    public View f63132I;
    /* renamed from: J */
    public final View f63133J;
    /* renamed from: K */
    public View f63134K;
    /* renamed from: L */
    public View f63135L;

    public AnonymousClass5PV(View view, int i, AnonymousClass5PU anonymousClass5PU) {
        this.f63133J = view;
        ViewStub viewStub = (ViewStub) view.findViewById(C0164R.id.iglive_buttons_container_stub);
        if (viewStub != null) {
            viewStub.setLayoutResource(i);
            this.f63126C = viewStub.inflate();
        } else {
            this.f63126C = view.findViewById(C0164R.id.iglive_buttons_container);
        }
        this.f63130G = view.findViewById(C0164R.id.comment_composer_post_button);
        if (anonymousClass5PU.f63119D) {
            View findViewById = this.f63133J.findViewById(C0164R.id.comment_composer_options_button);
            this.f63129F = findViewById;
            findViewById.setVisibility(0);
        }
        if (anonymousClass5PU.f63123H) {
            findViewById = this.f63126C.findViewById(C0164R.id.direct_share_button);
            this.f63135L = findViewById;
            findViewById.setVisibility(0);
        }
        if (anonymousClass5PU.f63124I) {
            findViewById = this.f63126C.findViewById(C0164R.id.camera_switch_button);
            this.f63128E = findViewById;
            findViewById.setVisibility(0);
        }
        if (anonymousClass5PU.f63120E) {
            findViewById = this.f63126C.findViewById(C0164R.id.heart_button);
            this.f63131H = findViewById;
            findViewById.setVisibility(0);
        }
        if (anonymousClass5PU.f63121F) {
            findViewById = this.f63126C.findViewById(C0164R.id.invite_cobroadcaster_button_with_badge);
            this.f63132I = findViewById;
            findViewById.setVisibility(0);
        }
        if (anonymousClass5PU.f63118C) {
            m26437A();
        }
        if (anonymousClass5PU.f63122G) {
            m26438B();
        }
        if (anonymousClass5PU.f63117B) {
            findViewById = this.f63126C.findViewById(C0164R.id.ama_mode_button);
            this.f63125B = findViewById;
            findViewById.setVisibility(0);
        }
    }

    /* renamed from: A */
    public final void m26437A() {
        View findViewById = this.f63126C.findViewById(C0164R.id.camera_ar_effect_button);
        this.f63127D = findViewById;
        findViewById.setVisibility(0);
    }

    /* renamed from: B */
    public final void m26438B() {
        View findViewById = this.f63126C.findViewById(C0164R.id.ssi_broadcaster_button);
        this.f63134K = findViewById;
        findViewById.setVisibility(0);
    }
}
