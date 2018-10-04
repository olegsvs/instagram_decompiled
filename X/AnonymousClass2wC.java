package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;

/* renamed from: X.2wC */
public final class AnonymousClass2wC implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new PrivFrame(parcel);
    }

    public final Object[] newArray(int i) {
        return new PrivFrame[i];
    }
}
