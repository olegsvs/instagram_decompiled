package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.C0164R;

/* renamed from: X.0ri */
public final class AnonymousClass0ri implements AnonymousClass0Qe {
    /* renamed from: B */
    public View f11253B;
    /* renamed from: C */
    public View f11254C;
    /* renamed from: D */
    public View f11255D;
    /* renamed from: E */
    public View f11256E;
    /* renamed from: F */
    public ImageView f11257F;
    /* renamed from: G */
    public View f11258G;
    /* renamed from: H */
    public ImageView f11259H;
    /* renamed from: I */
    public AnonymousClass0OA f11260I;
    /* renamed from: J */
    public ProgressBar f11261J;
    /* renamed from: K */
    public View f11262K;
    /* renamed from: L */
    public TextView f11263L;
    /* renamed from: M */
    public View f11264M;
    /* renamed from: N */
    public TextView f11265N;
    /* renamed from: O */
    public AnonymousClass0Cm f11266O;

    /* renamed from: A */
    public final void m7967A() {
        m7970D().m1786B(this.f11260I, AnonymousClass0iY.m6920C(m7969C()));
        AnonymousClass0g3.CaptureFlowCanceled.m6584A().m3298F("reason", "pending_media_cancel_tap").m3310R();
    }

    /* renamed from: B */
    public final void m7968B(boolean z) {
        Context C = m7969C();
        if (z) {
            String str = this.f11260I.WB;
            AnonymousClass18W anonymousClass18W = AnonymousClass18W.VIDEO_RENDER_ERROR;
            Object obj = (str == null || anonymousClass18W == null || !str.startsWith(anonymousClass18W.name())) ? null : 1;
            if (obj != null) {
                new AnonymousClass0Sb(C).m4375Q(C0164R.string.pending_media_video_render_fail_title).m4366H(C0164R.string.pending_media_video_render_fail_message).m4370L(C0164R.string.pending_media_discard_button, new AnonymousClass3LY(this, this)).m4363E(true).m4364F(true).m4373O(C0164R.string.pending_media_try_again_button, new AnonymousClass3LX(this, this)).m4361C().show();
                return;
            }
        }
        m7970D().m1789E(this.f11260I, AnonymousClass0iY.m6920C(C));
        AnonymousClass0Nr anonymousClass0Nr = new AnonymousClass0Nr(C);
        if (!anonymousClass0Nr.m3468B(false) && anonymousClass0Nr.m3469C()) {
            Toast.makeText(C, C0164R.string.pending_media_airplane_mode_warning, 0).show();
        }
    }

    /* renamed from: C */
    public final Context m7969C() {
        return this.f11263L.getContext();
    }

    public final void Cv(AnonymousClass0OA anonymousClass0OA) {
        this.f11261J.post(new AnonymousClass3LW(this, anonymousClass0OA));
    }

    /* renamed from: D */
    public final AnonymousClass0GK m7970D() {
        return AnonymousClass0GK.m1771E(m7969C(), this.f11266O);
    }
}
