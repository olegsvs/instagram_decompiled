package X;

import android.location.Location;
import com.instagram.creation.fragment.FollowersShareFragment;

/* renamed from: X.4Vi */
public final class AnonymousClass4Vi implements AnonymousClass1DP {
    /* renamed from: B */
    public final /* synthetic */ FollowersShareFragment f54758B;

    public final void nk(Exception exception) {
    }

    public AnonymousClass4Vi(FollowersShareFragment followersShareFragment) {
        this.f54758B = followersShareFragment;
    }

    public final void onLocationChanged(Location location) {
        if (AnonymousClass0JI.getInstance().isAccurateEnough(location)) {
            FollowersShareFragment.C(this.f54758B, location);
        }
    }
}
