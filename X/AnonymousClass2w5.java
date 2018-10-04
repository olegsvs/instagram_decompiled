package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;

/* renamed from: X.2w5 */
public final class AnonymousClass2w5 implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new ApicFrame(parcel);
    }

    public final Object[] newArray(int i) {
        return new ApicFrame[i];
    }
}
