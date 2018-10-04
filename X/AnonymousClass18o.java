package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.model.venue.Venue;

/* renamed from: X.18o */
public final class AnonymousClass18o implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new Venue(parcel);
    }

    public final Object[] newArray(int i) {
        return new Venue[i];
    }
}
