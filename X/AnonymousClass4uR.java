package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.igtv.feed.IGTVFeedTrayControllerImpl;

/* renamed from: X.4uR */
public final class AnonymousClass4uR implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ IGTVFeedTrayControllerImpl f58364B;

    public AnonymousClass4uR(IGTVFeedTrayControllerImpl iGTVFeedTrayControllerImpl) {
        this.f58364B = iGTVFeedTrayControllerImpl;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1667366119);
        AnonymousClass0TP anonymousClass0TP = new AnonymousClass0TP(this.f58364B.f66053J, System.currentTimeMillis());
        anonymousClass0TP.f5197K = AnonymousClass0Nm.L(view);
        anonymousClass0TP.B().D(this.f58364B.f66052I.getActivity(), this.f58364B.f66055L, this.f58364B.f66046C);
        AnonymousClass0cQ.L(this, -847149827, M);
    }
}
