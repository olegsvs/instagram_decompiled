package X;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* renamed from: X.2iC */
public final class AnonymousClass2iC implements LocationListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2iD f32780B;

    public final void onProviderDisabled(String str) {
    }

    public final void onProviderEnabled(String str) {
    }

    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public AnonymousClass2iC(AnonymousClass2iD anonymousClass2iD) {
        this.f32780B = anonymousClass2iD;
    }

    public final void onLocationChanged(Location location) {
        if (this.f32780B.f32783D != null) {
            this.f32780B.f32783D.onNewDataAvailable(location.getSpeed() * 3.6f);
        }
    }
}
