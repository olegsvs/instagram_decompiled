package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride;

/* renamed from: X.2y1 */
public final class AnonymousClass2y1 implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new DefaultTrackSelector$SelectionOverride(parcel);
    }

    public final Object[] newArray(int i) {
        return new DefaultTrackSelector$SelectionOverride[i];
    }
}
