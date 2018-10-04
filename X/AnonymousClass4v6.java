package X;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.igtv.uploadflow.IGTVUploadGalleryFragment;

/* renamed from: X.4v6 */
public final class AnonymousClass4v6 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ IGTVUploadGalleryFragment f58461B;

    public AnonymousClass4v6(IGTVUploadGalleryFragment iGTVUploadGalleryFragment) {
        this.f58461B = iGTVUploadGalleryFragment;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 1664507639);
        ((Activity) this.f58461B.getContext()).onBackPressed();
        AnonymousClass0cQ.L(this, 1626848452, M);
    }
}
