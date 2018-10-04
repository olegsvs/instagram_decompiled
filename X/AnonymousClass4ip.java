package X;

import com.instagram.direct.share.ui.mediacomposer.DirectInlineGalleryView;

/* renamed from: X.4ip */
public final class AnonymousClass4ip implements AnonymousClass14J {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4iq f56505B;

    public AnonymousClass4ip(AnonymousClass4iq anonymousClass4iq) {
        this.f56505B = anonymousClass4iq;
    }

    public final void onFinish() {
        DirectInlineGalleryView directInlineGalleryView = this.f56505B.f56506B;
        if (directInlineGalleryView.f56543I) {
            directInlineGalleryView.m24879A();
        } else if (DirectInlineGalleryView.m24870E(directInlineGalleryView)) {
            DirectInlineGalleryView.m24868C(directInlineGalleryView);
        } else if (DirectInlineGalleryView.m24871F(directInlineGalleryView)) {
            DirectInlineGalleryView.m24869D(directInlineGalleryView);
        }
    }
}
