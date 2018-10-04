package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.igtv.uploadflow.IGTVUploadGalleryFragment;

/* renamed from: X.4v2 */
public final class AnonymousClass4v2 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ IGTVUploadGalleryFragment f58456B;

    public AnonymousClass4v2(IGTVUploadGalleryFragment iGTVUploadGalleryFragment) {
        this.f58456B = iGTVUploadGalleryFragment;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 197629557);
        if (this.f58456B.isResumed()) {
            this.f58456B.Z().onBackPressed();
        }
        AnonymousClass0cQ.L(this, -279293365, M);
    }
}
