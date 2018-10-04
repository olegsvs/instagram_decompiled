package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.ui.widget.refresh.RefreshableListView;

/* renamed from: X.1g4 */
public final class AnonymousClass1g4 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ UserDetailFragment f21293B;
    /* renamed from: C */
    public final /* synthetic */ RefreshableListView f21294C;

    public AnonymousClass1g4(UserDetailFragment userDetailFragment, RefreshableListView refreshableListView) {
        this.f21293B = userDetailFragment;
        this.f21294C = refreshableListView;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.m5863M(this, -1053514772);
        this.f21294C.setIsLoading(true);
        AnonymousClass0EE anonymousClass0EE = this.f21293B;
        if (!anonymousClass0EE.uX()) {
            if (anonymousClass0EE.UX()) {
                AnonymousClass0iY.m6919B(AnonymousClass0NN.m3291B("action_bar_feed_retry", anonymousClass0EE), anonymousClass0EE.getContext()).m3310R();
            }
            anonymousClass0EE.bH(true);
            anonymousClass0EE.f8245d.m4482A();
        }
        AnonymousClass0cQ.m5862L(this, -396520292, M);
    }
}
