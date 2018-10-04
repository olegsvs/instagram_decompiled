package X;

import android.view.View;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.4HB */
public final class AnonymousClass4HB {
    /* renamed from: B */
    public MediaFrameLayout f52301B;
    /* renamed from: C */
    public IgImageView f52302C;

    public AnonymousClass4HB(View view) {
        view.findViewById(C0164R.id.preview_image_spinner).setVisibility(8);
        this.f52301B = (MediaFrameLayout) view.findViewById(C0164R.id.preview_image_frame);
        this.f52302C = (IgImageView) view.findViewById(C0164R.id.preview_image);
    }
}
