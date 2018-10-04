package X;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: X.6Dn */
public final class AnonymousClass6Dn implements AnonymousClass5k1 {
    /* renamed from: B */
    public final /* synthetic */ boolean f73068B;

    public AnonymousClass6Dn(AnonymousClass0dC anonymousClass0dC, boolean z) {
        this.f73068B = z;
    }

    public final void PHA(FragmentActivity fragmentActivity, AnonymousClass0Cm anonymousClass0Cm, Bundle bundle) {
        ArrayList stringArrayList = bundle.getStringArrayList("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SELECTED_REEL_IDS");
        if (stringArrayList != null) {
            AnonymousClass1Q8 anonymousClass1Q8 = new AnonymousClass1Q8();
            anonymousClass1Q8.f18310N = stringArrayList;
            anonymousClass1Q8.f18313Q = stringArrayList;
            anonymousClass1Q8.f18316T = UUID.randomUUID().toString();
            anonymousClass1Q8.f18309M = AnonymousClass0Qf.PUSH_NOTIFICATION;
            anonymousClass1Q8.f18299C = true;
            anonymousClass1Q8.f18302F = bundle.getString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_PUSH_NOTIF_TYPE");
            anonymousClass1Q8.f18306J = new AnonymousClass0op();
            anonymousClass1Q8.f18312P = this.f73068B;
            HashMap hashMap = (HashMap) bundle.getSerializable("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_MEDIA_REQUEST_PARAMS");
            if (hashMap != null) {
                anonymousClass1Q8.f18298B = hashMap;
            }
            hashMap = (HashMap) bundle.getSerializable("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_REEL_TO_REEL_ITEM_IDS_FILTER");
            if (hashMap != null) {
                anonymousClass1Q8.f18305I = hashMap;
            }
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(fragmentActivity);
            anonymousClass0IZ.f2754D = AnonymousClass0Jd.f2931B.H().C(anonymousClass1Q8.A());
            anonymousClass0IZ.B();
        }
    }
}
