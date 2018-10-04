package X;

import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import com.facebook.C0164R;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.ui.widget.imagebutton.IgImageButton;

/* renamed from: X.3Nt */
public final class AnonymousClass3Nt implements AnonymousClass0z0 {
    /* renamed from: B */
    public final /* synthetic */ IgImageButton f40694B;

    public final void dl() {
    }

    public AnonymousClass3Nt(IgImageButton igImageButton) {
        this.f40694B = igImageButton;
    }

    public final void kp(Bitmap bitmap) {
        this.f40694B.setImageBitmap(BlurUtil.blur(bitmap, 0.1f, 6));
        IgImageButton igImageButton = this.f40694B;
        igImageButton.setColorFilter(AnonymousClass0Ca.C(igImageButton.getContext(), C0164R.color.black_25_transparent), Mode.SRC_OVER);
        this.f40694B.setAlpha(128);
    }
}
