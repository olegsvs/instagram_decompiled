package X;

import android.graphics.Bitmap;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.1AM */
public final class AnonymousClass1AM implements AnonymousClass0z0 {
    /* renamed from: B */
    public final /* synthetic */ IgProgressImageView f15262B;

    public AnonymousClass1AM(IgProgressImageView igProgressImageView) {
        this.f15262B = igProgressImageView;
    }

    public final void dl() {
        this.f15262B.f9963F = false;
    }

    public final void kp(Bitmap bitmap) {
        IgProgressImageView.m7583C(this.f15262B, AnonymousClass15w.LOADING_WITHOUT_PROGRESS_DISPLAY);
        if (this.f15262B.f9964G != null) {
            this.f15262B.f9964G.kp(bitmap);
        }
        this.f15262B.f9963F = true;
    }
}
