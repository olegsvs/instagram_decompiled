package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.creation.base.MediaSession;

/* renamed from: X.3CC */
public final class AnonymousClass3CC implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new MediaSession(parcel);
    }

    public final Object[] newArray(int i) {
        return new MediaSession[i];
    }
}
