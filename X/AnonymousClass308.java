package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.308 */
public final class AnonymousClass308 implements AnonymousClass0z0 {
    /* renamed from: B */
    public final /* synthetic */ Context f36774B;
    /* renamed from: C */
    public final /* synthetic */ IgImageView f36775C;

    public final void dl() {
    }

    public AnonymousClass308(Context context, IgImageView igImageView) {
        this.f36774B = context;
        this.f36775C = igImageView;
    }

    public final void kp(Bitmap bitmap) {
        AnonymousClass30n anonymousClass30n = AnonymousClass30Y.m18171E().f36821B;
        if (anonymousClass30n != null) {
            int dimensionPixelSize = this.f36774B.getResources().getDimensionPixelSize(C0164R.dimen.cover_image_thumbnail_size);
            this.f36775C.setImageBitmap(AnonymousClass0rm.N(bitmap, dimensionPixelSize, dimensionPixelSize, AnonymousClass2Mh.m15232D(AnonymousClass2Mh.m15235G(bitmap.getWidth(), bitmap.getHeight(), 1, 1, anonymousClass30n.f36862C))));
        }
    }
}
