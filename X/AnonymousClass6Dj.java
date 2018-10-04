package X;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import java.util.ArrayList;
import java.util.UUID;

/* renamed from: X.6Dj */
public final class AnonymousClass6Dj implements AnonymousClass5k1 {
    public AnonymousClass6Dj(AnonymousClass0dC anonymousClass0dC) {
    }

    public final void PHA(FragmentActivity fragmentActivity, AnonymousClass0Cm anonymousClass0Cm, Bundle bundle) {
        ArrayList stringArrayList = bundle.getStringArrayList("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SELECTED_REEL_IDS");
        if (stringArrayList != null) {
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(fragmentActivity);
            AnonymousClass0ST H = AnonymousClass0Jd.f2931B.H();
            AnonymousClass1Q8 anonymousClass1Q8 = new AnonymousClass1Q8();
            anonymousClass1Q8.f18310N = stringArrayList;
            anonymousClass1Q8.f18313Q = stringArrayList;
            anonymousClass1Q8.f18299C = true;
            anonymousClass1Q8.f18316T = UUID.randomUUID().toString();
            anonymousClass1Q8.f18309M = AnonymousClass0Qf.PUSH_NOTIFICATION;
            anonymousClass1Q8.f18302F = bundle.getString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_PUSH_NOTIF_TYPE");
            anonymousClass1Q8.f18306J = new AnonymousClass0op();
            anonymousClass0IZ.f2754D = H.C(anonymousClass1Q8.A());
            anonymousClass0IZ.B();
        }
    }
}
