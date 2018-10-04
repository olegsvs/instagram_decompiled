package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.creation.base.PhotoSession;

/* renamed from: X.1Qh */
public final class AnonymousClass1Qh implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new PhotoSession(parcel);
    }

    public final Object[] newArray(int i) {
        return new PhotoSession[i];
    }
}
