package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.instagram.creation.fragment.FollowersShareFragment;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;

/* renamed from: X.4Wv */
public final class AnonymousClass4Wv implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4X4 f54914B;

    public AnonymousClass4Wv(AnonymousClass4X4 anonymousClass4X4) {
        this.f54914B = anonymousClass4X4;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1617738502);
        FollowersShareFragment followersShareFragment = this.f54914B.f54930C;
        FollowersShareFragment.K(followersShareFragment);
        FollowersShareFragment.H(followersShareFragment, null, -1);
        AnonymousClass0OA anonymousClass0OA = followersShareFragment.f64927K;
        anonymousClass0OA.ZB = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
        anonymousClass0OA.aB = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
        followersShareFragment.mShareTable.A(followersShareFragment.f64927K);
        PendingMediaStoreSerializer.C().C();
        AnonymousClass4X4.m24423B(this.f54914B, AnonymousClass4X3.LOCATION_OFF);
        AnonymousClass0cQ.L(this, -841678923, M);
    }
}
