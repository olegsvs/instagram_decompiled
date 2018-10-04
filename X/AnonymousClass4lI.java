package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.4lI */
public final class AnonymousClass4lI implements AnonymousClass0p8 {
    public final void AKA(IgImageView igImageView, Bitmap bitmap) {
        igImageView.setImageBitmap(BlurUtil.blur(bitmap, 0.3f, 20));
    }
}
