package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.C0164R;
import com.instagram.direct.share.ui.mediacomposer.DirectInlineGalleryView;

/* renamed from: X.4it */
public final class AnonymousClass4it implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ DirectInlineGalleryView f56512B;

    public AnonymousClass4it(DirectInlineGalleryView directInlineGalleryView) {
        this.f56512B = directInlineGalleryView;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 298593123);
        DirectInlineGalleryView directInlineGalleryView = this.f56512B;
        String str = "android.permission.READ_EXTERNAL_STORAGE";
        Object obj = (AnonymousClass1Ba.D(DirectInlineGalleryView.getRootActivity(directInlineGalleryView), str) || AnonymousClass1Ba.E(DirectInlineGalleryView.getRootActivity(directInlineGalleryView), str)) ? null : 1;
        if (obj != null) {
            AnonymousClass1Ba.G(DirectInlineGalleryView.getRootActivity(this.f56512B), C0164R.string.storage_permission_name);
        } else {
            DirectInlineGalleryView.m24877L(this.f56512B);
        }
        AnonymousClass0cQ.L(this, 2069168660, M);
    }
}
