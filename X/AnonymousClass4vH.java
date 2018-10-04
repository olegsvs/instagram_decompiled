package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.igtv.uploadflow.IGTVUploadMetadataFragment;

/* renamed from: X.4vH */
public final class AnonymousClass4vH implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ IGTVUploadMetadataFragment f58477B;

    public AnonymousClass4vH(IGTVUploadMetadataFragment iGTVUploadMetadataFragment) {
        this.f58477B = iGTVUploadMetadataFragment;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -350936870);
        if (this.f58477B.isResumed()) {
            this.f58477B.Z().onBackPressed();
        }
        AnonymousClass0cQ.L(this, 2034062692, M);
    }
}
