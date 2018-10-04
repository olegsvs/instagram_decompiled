package X;

import android.app.Activity;
import com.instagram.common.util.gradient.BackgroundGradientColors;

/* renamed from: X.3f8 */
public final class AnonymousClass3f8 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3fB f43095B;
    /* renamed from: C */
    public final /* synthetic */ Activity f43096C;

    public AnonymousClass3f8(AnonymousClass3fB anonymousClass3fB, Activity activity) {
        this.f43095B = anonymousClass3fB;
        this.f43096C = activity;
    }

    public final void run() {
        AnonymousClass3fB anonymousClass3fB = this.f43095B;
        anonymousClass3fB.f43114G = AnonymousClass3fB.m20346B(anonymousClass3fB, anonymousClass3fB.f43117J, this.f43096C, "share_content_");
        anonymousClass3fB = this.f43095B;
        anonymousClass3fB.f43110C = AnonymousClass3fB.m20346B(anonymousClass3fB, anonymousClass3fB.f43111D, this.f43096C, "share_content_interactive_");
        if (this.f43095B.f43110C != null) {
            this.f43095B.f43110C.f30914D = new BackgroundGradientColors(this.f43095B.f43118K, this.f43095B.f43109B);
        }
        this.f43096C.runOnUiThread(new AnonymousClass3f7(this));
    }
}
