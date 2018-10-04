package X;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.instagram.creation.fragment.FollowersShareFragment;

/* renamed from: X.4VT */
public final class AnonymousClass4VT implements OnLongClickListener {
    /* renamed from: B */
    public final /* synthetic */ FollowersShareFragment f54741B;

    public AnonymousClass4VT(FollowersShareFragment followersShareFragment) {
        this.f54741B = followersShareFragment;
    }

    public final boolean onLongClick(View view) {
        this.f54741B.f64923G.C(AnonymousClass0xq.FEED_SHARE_SHEET);
        return true;
    }
}
