package X;

import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.creation.capture.MediaCaptureFragment;

/* renamed from: X.4Hk */
public final class AnonymousClass4Hk implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5ST f52371B;
    /* renamed from: C */
    public final /* synthetic */ Uri f52372C;

    public AnonymousClass4Hk(AnonymousClass5ST anonymousClass5ST, Uri uri) {
        this.f52371B = anonymousClass5ST;
        this.f52372C = uri;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 135886086);
        AnonymousClass0FH.f2099C.f2100B.edit().putBoolean("has_seen_layout_dialog", true).apply();
        if (this.f52371B.f52317B != null) {
            MediaCaptureFragment mediaCaptureFragment = this.f52371B.f52317B;
            mediaCaptureFragment.f64003B.m20350B(AnonymousClass3fD.LAYOUT, this.f52372C, "ig_gallery_upsell");
        }
        AnonymousClass5ST.E(this.f52371B, false);
        AnonymousClass0cQ.L(this, 1527112053, M);
    }
}
