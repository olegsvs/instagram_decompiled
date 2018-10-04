package X;

import android.content.Context;
import com.facebook.C0164R;

/* renamed from: X.6EU */
public final class AnonymousClass6EU implements AnonymousClass5q1 {
    public final int cU(Context context, AnonymousClass0Cm anonymousClass0Cm) {
        return 0;
    }

    public final long lLA() {
        return 0;
    }

    public final int WO(AnonymousClass0Cm anonymousClass0Cm) {
        return AnonymousClass0HV.D(anonymousClass0Cm).f2646B.getBoolean("has_saved_media", false) ? C0164R.string.save_self_profile_has_saved_nux : C0164R.string.save_self_profile_has_not_saved_nux;
    }

    public final AnonymousClass1ff fP() {
        return AnonymousClass1ff.SAVE;
    }

    public final int fU(Context context, boolean z) {
        int C = (int) AnonymousClass0Nm.C(context, 14);
        return !z ? -C : C;
    }

    public final boolean lTA(boolean z, AnonymousClass0Cm anonymousClass0Cm) {
        return z && !AnonymousClass0HV.D(anonymousClass0Cm).f2646B.getBoolean("seen_save_home_nux", false);
    }

    public final void tDA(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0HV.D(anonymousClass0Cm).AA(true);
    }
}
