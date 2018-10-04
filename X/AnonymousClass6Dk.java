package X;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/* renamed from: X.6Dk */
public final class AnonymousClass6Dk implements AnonymousClass5k1 {
    public AnonymousClass6Dk(AnonymousClass0dC anonymousClass0dC) {
    }

    public final void PHA(FragmentActivity fragmentActivity, AnonymousClass0Cm anonymousClass0Cm, Bundle bundle) {
        String string = bundle.getString("ARGUMENT_SCHOOL_ID");
        String string2 = bundle.getString("ARGUMENT_ENTRY_POINT");
        String string3 = bundle.getString("ARGUMENT_LOGGING_TAG");
        AnonymousClass0dC.F(anonymousClass0Cm, fragmentActivity);
        AnonymousClass0JF.C(string2, string, string3, fragmentActivity, true);
    }
}
