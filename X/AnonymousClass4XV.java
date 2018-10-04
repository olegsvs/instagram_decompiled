package X;

import android.location.Location;
import com.instagram.creation.location.NearbyVenuesService;
import com.instagram.location.intf.LocationSignalPackage;

/* renamed from: X.4XV */
public final class AnonymousClass4XV extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ Location f54975B;
    /* renamed from: C */
    public final /* synthetic */ LocationSignalPackage f54976C;

    public AnonymousClass4XV(Location location, LocationSignalPackage locationSignalPackage) {
        this.f54975B = location;
        this.f54976C = locationSignalPackage;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -658547154);
        super.onFail(anonymousClass0Q6);
        NearbyVenuesService.m24430E(null);
        AnonymousClass0cQ.H(this, -1449185850, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 1676170757);
        AnonymousClass4XT anonymousClass4XT = (AnonymousClass4XT) obj;
        int I2 = AnonymousClass0cQ.I(this, 742269217);
        super.onSuccess(anonymousClass4XT);
        Location location = this.f54975B;
        LocationSignalPackage locationSignalPackage = this.f54976C;
        synchronized (NearbyVenuesService.class) {
            NearbyVenuesService.f54977B = anonymousClass4XT;
            NearbyVenuesService.f54978C = location;
            NearbyVenuesService.f54979D = locationSignalPackage;
        }
        NearbyVenuesService.m24430E(anonymousClass4XT);
        AnonymousClass0cQ.H(this, -1110333155, I2);
        AnonymousClass0cQ.H(this, -794889464, I);
    }
}
