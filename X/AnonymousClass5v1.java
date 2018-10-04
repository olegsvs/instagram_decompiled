package X;

import android.os.Handler;
import com.facebook.C0164R;
import com.instagram.reels.fragment.ReelDashboardFragment;
import java.util.Map;

/* renamed from: X.5v1 */
public final class AnonymousClass5v1 implements AnonymousClass0TV {
    /* renamed from: B */
    public final /* synthetic */ ReelDashboardFragment f70001B;

    public AnonymousClass5v1(ReelDashboardFragment reelDashboardFragment) {
        this.f70001B = reelDashboardFragment;
    }

    public final void Zt(Map map) {
        if (((AnonymousClass1Bb) map.get("android.permission.WRITE_EXTERNAL_STORAGE")) == AnonymousClass1Bb.GRANTED) {
            AnonymousClass0OR.D(new Handler(), new AnonymousClass5v0(this), 1948673266);
        } else {
            AnonymousClass0IG.C(this.f70001B.getActivity(), C0164R.string.reel_save_all_permission);
        }
    }
}
