package X;

import android.location.Location;

/* renamed from: X.4Kz */
public final class AnonymousClass4Kz implements AnonymousClass1DP {
    public final void nk(Exception exception) {
    }

    public AnonymousClass4Kz(AnonymousClass4L1 anonymousClass4L1) {
    }

    public final void onLocationChanged(Location location) {
        AnonymousClass0JI.getInstance().removeLocationUpdates(this);
    }
}
