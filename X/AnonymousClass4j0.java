package X;

import com.instagram.common.gallery.Medium;
import com.instagram.direct.share.ui.mediacomposer.DirectInlineGalleryView;

/* renamed from: X.4j0 */
public final class AnonymousClass4j0 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ DirectInlineGalleryView f56524B;
    /* renamed from: C */
    public final /* synthetic */ Medium f56525C;

    public AnonymousClass4j0(DirectInlineGalleryView directInlineGalleryView, Medium medium) {
        this.f56524B = directInlineGalleryView;
        this.f56525C = medium;
    }

    public final void run() {
        this.f56524B.post(new AnonymousClass4iz(this, DirectInlineGalleryView.m24873H(this.f56525C, this.f56524B.getContext())));
    }
}
