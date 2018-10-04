package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.metadata.Metadata;

/* renamed from: X.2w2 */
public final class AnonymousClass2w2 implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new Metadata(parcel);
    }

    public final Object[] newArray(int i) {
        return new Metadata[0];
    }
}
