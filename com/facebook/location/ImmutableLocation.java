package com.facebook.location;

import X.AnonymousClass1Cy;
import X.AnonymousClass1G4;
import X.AnonymousClass1da;
import android.location.Location;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.common.dextricks.StartupQEsConfig;

public class ImmutableLocation implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1da();
    /* renamed from: B */
    public final Location f16188B;
    /* renamed from: C */
    private final Boolean f16189C;

    public final int describeContents() {
        return 0;
    }

    public ImmutableLocation(Location location, Boolean bool) {
        boolean z;
        if (location.getLatitude() == StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) {
            if (location.getLongitude() == StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) {
                z = false;
                AnonymousClass1Cy.m9950E(z, "location must have latitude/longitude");
                this.f16188B = location;
                this.f16189C = bool;
            }
        }
        z = true;
        AnonymousClass1Cy.m9950E(z, "location must have latitude/longitude");
        this.f16188B = location;
        this.f16189C = bool;
    }

    /* renamed from: A */
    public final Float m10414A() {
        return this.f16188B.hasAccuracy() ? Float.valueOf(this.f16188B.getAccuracy()) : null;
    }

    /* renamed from: B */
    public static ImmutableLocation m10409B(Location location) {
        return AnonymousClass1G4.m10426B(location) ? m10411D(location) : null;
    }

    /* renamed from: B */
    public final Double m10415B() {
        return this.f16188B.hasAltitude() ? Double.valueOf(this.f16188B.getAltitude()) : null;
    }

    /* renamed from: C */
    public static ImmutableLocation m10410C(Location location) {
        return location == null ? null : m10411D(location);
    }

    /* renamed from: C */
    public final Float m10416C() {
        return this.f16188B.hasBearing() ? Float.valueOf(this.f16188B.getBearing()) : null;
    }

    /* renamed from: D */
    public static ImmutableLocation m10411D(Location location) {
        AnonymousClass1Cy.m9952G(location);
        return new ImmutableLocation(new Location(location), null);
    }

    /* renamed from: D */
    public final Float m10417D(ImmutableLocation immutableLocation) {
        Long K = m10424K();
        Long K2 = immutableLocation.m10424K();
        return (K == null || K2 == null) ? null : Float.valueOf((float) (K.longValue() - K2.longValue()));
    }

    /* renamed from: E */
    public static Boolean m10412E(Parcel parcel) {
        switch (parcel.readByte()) {
            case null:
                return Boolean.valueOf(null);
            case 1:
                return Boolean.valueOf(true);
            default:
                return null;
        }
    }

    /* renamed from: E */
    public final Long m10418E() {
        if (VERSION.SDK_INT < 17) {
            return null;
        }
        return m10413F();
    }

    /* renamed from: F */
    public final double m10419F() {
        return this.f16188B.getLatitude();
    }

    /* renamed from: F */
    private Long m10413F() {
        AnonymousClass1Cy.m9956K(VERSION.SDK_INT >= 17);
        long elapsedRealtimeNanos = this.f16188B.getElapsedRealtimeNanos();
        if (elapsedRealtimeNanos == 0) {
            return null;
        }
        return Long.valueOf(elapsedRealtimeNanos);
    }

    /* renamed from: G */
    public final double m10420G() {
        return this.f16188B.getLongitude();
    }

    /* renamed from: H */
    public final Location m10421H() {
        return new Location(this.f16188B);
    }

    /* renamed from: I */
    public final String m10422I() {
        String provider = this.f16188B.getProvider();
        return provider == null ? null : provider;
    }

    /* renamed from: J */
    public final Float m10423J() {
        return this.f16188B.hasSpeed() ? Float.valueOf(this.f16188B.getSpeed()) : null;
    }

    /* renamed from: K */
    public final Long m10424K() {
        long time = this.f16188B.getTime();
        if (time == 0) {
            return null;
        }
        return Long.valueOf(time);
    }

    /* renamed from: L */
    public final Boolean m10425L() {
        if (VERSION.SDK_INT < 18) {
            return null;
        }
        boolean booleanValue;
        Boolean bool = this.f16189C;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            booleanValue = this.f16188B.isFromMockProvider();
        }
        return Boolean.valueOf(booleanValue);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImmutableLocation)) {
            return false;
        }
        return this.f16188B.equals(((ImmutableLocation) obj).f16188B);
    }

    public final int hashCode() {
        Location location = this.f16188B;
        return 527 + (location == null ? 0 : location.hashCode());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(m10421H(), i);
        Boolean bool = this.f16189C;
        if (bool == null) {
            parcel.writeByte((byte) 2);
        } else {
            parcel.writeByte(bool.booleanValue());
        }
    }
}
