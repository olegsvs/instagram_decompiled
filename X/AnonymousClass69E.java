package X;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.video.live.ui.streaming.IgLiveWithInviteFragment;

/* renamed from: X.69E */
public final class AnonymousClass69E implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ IgLiveWithInviteFragment f72292B;

    public AnonymousClass69E(IgLiveWithInviteFragment igLiveWithInviteFragment) {
        this.f72292B = igLiveWithInviteFragment;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 1880444373);
        this.f72292B.f73723H = true;
        ((Activity) this.f72292B.getContext()).onBackPressed();
        AnonymousClass0cQ.L(this, 1350834972, M);
    }
}
