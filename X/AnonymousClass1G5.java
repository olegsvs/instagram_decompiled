package X;

import android.location.Location;
import com.instagram.location.impl.LocationPluginImpl;

/* renamed from: X.1G5 */
public final class AnonymousClass1G5 implements AnonymousClass1DP {
    /* renamed from: B */
    public final /* synthetic */ LocationPluginImpl f16190B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass2kT f16191C;

    public AnonymousClass1G5(LocationPluginImpl locationPluginImpl, AnonymousClass2kT anonymousClass2kT) {
        this.f16190B = locationPluginImpl;
        this.f16191C = anonymousClass2kT;
    }

    public final void nk(Exception exception) {
        this.f16191C.B(exception);
        this.f16190B.removeLocationUpdates(this);
    }

    public final void onLocationChanged(Location location) {
        this.f16191C.A(location);
        this.f16190B.removeLocationUpdates(this);
    }
}
