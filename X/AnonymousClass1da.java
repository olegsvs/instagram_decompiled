package X;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.location.ImmutableLocation;

/* renamed from: X.1da */
public final class AnonymousClass1da implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new ImmutableLocation((Location) AnonymousClass1Cy.m9952G(parcel.readParcelable(Location.class.getClassLoader())), ImmutableLocation.m10412E(parcel));
    }

    public final Object[] newArray(int i) {
        return new ImmutableLocation[i];
    }
}
