package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;

/* renamed from: X.3GO */
public final class AnonymousClass3GO implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new PhotoFilter(parcel);
    }

    public final Object[] newArray(int i) {
        return new PhotoFilter[i];
    }
}
