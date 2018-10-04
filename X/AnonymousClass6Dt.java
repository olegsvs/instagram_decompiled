package X;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.facebook.proxygen.TraceEventType;

/* renamed from: X.6Dt */
public final class AnonymousClass6Dt implements AnonymousClass5k1 {
    public AnonymousClass6Dt(AnonymousClass0dC anonymousClass0dC) {
    }

    public final void PHA(FragmentActivity fragmentActivity, AnonymousClass0Cm anonymousClass0Cm, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("ExplorePeopleFragment.ARGUMENT_ENTRY_POINT", TraceEventType.Push);
        AnonymousClass0dC.F(anonymousClass0Cm, fragmentActivity);
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(fragmentActivity);
        AnonymousClass3Ip.f39973B.A();
        bundle2.putInt("DiscoverPeopleFragment.EXTRA_CURRENT_MODE", AnonymousClass3m7.B(bundle.getString("type")));
        AnonymousClass0IL anonymousClass4mV = new AnonymousClass4mV();
        anonymousClass4mV.setArguments(bundle2);
        anonymousClass0IZ.f2754D = anonymousClass4mV;
        anonymousClass0IZ.B();
    }
}
