package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.media.RatingCompat;

/* renamed from: X.1mC */
public final class AnonymousClass1mC implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new RatingCompat(parcel.readInt(), parcel.readFloat());
    }

    public final Object[] newArray(int i) {
        return new RatingCompat[i];
    }
}
