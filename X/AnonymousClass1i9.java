package X;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.facebook.location.ImmutableLocation;

/* renamed from: X.1i9 */
public final class AnonymousClass1i9 implements LocationListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1GH f21613B;

    public final void onProviderDisabled(String str) {
    }

    public final void onProviderEnabled(String str) {
    }

    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public AnonymousClass1i9(AnonymousClass1GH anonymousClass1GH) {
        this.f21613B = anonymousClass1GH;
    }

    public final void onLocationChanged(Location location) {
        ImmutableLocation fixedLocation = this.f21613B.getFixedLocation(location);
        if (fixedLocation != null) {
            this.f21613B.m10403B(fixedLocation);
        }
    }
}
