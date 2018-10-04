package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.0h7 */
public final class AnonymousClass0h7 implements AnonymousClass0RL {
    /* renamed from: B */
    public final /* synthetic */ IgImageView f8347B;

    public AnonymousClass0h7(IgImageView igImageView) {
        this.f8347B = igImageView;
    }

    public final void Ao(AnonymousClass0aa anonymousClass0aa) {
        if (this.f8347B.f2563W == anonymousClass0aa) {
            if (!this.f8347B.f2548H) {
                this.f8347B.m1964F();
            }
            if (this.f8347B.f2557Q != null) {
                this.f8347B.f2557Q.dl();
            }
        }
    }

    public final void Bo(AnonymousClass0aa anonymousClass0aa, int i) {
        if (!this.f8347B.f2550J && this.f8347B.f2563W == anonymousClass0aa && this.f8347B.f2558R != null) {
            this.f8347B.f2558R.f14359B.f9967J.setProgress(i);
        }
    }

    public final void Se(AnonymousClass0aa anonymousClass0aa, Bitmap bitmap) {
        if (this.f8347B.f2563W == anonymousClass0aa) {
            this.f8347B.f2542B = bitmap;
            IgImageView igImageView = this.f8347B;
            igImageView.f2550J = true;
            igImageView.f2544D = -1;
            if (this.f8347B.f2545E != null) {
                this.f8347B.f2545E.f25946B = -1;
            }
            IgImageView.m1956B(this.f8347B, bitmap);
            if (this.f8347B.f2557Q != null) {
                this.f8347B.f2557Q.kp(bitmap);
            }
        }
    }
}
