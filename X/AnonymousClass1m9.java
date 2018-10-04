package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.media.MediaBrowserCompat$MediaItem;

/* renamed from: X.1m9 */
public final class AnonymousClass1m9 implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new MediaBrowserCompat$MediaItem(parcel);
    }

    public final Object[] newArray(int i) {
        return new MediaBrowserCompat$MediaItem[i];
    }
}
