package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;

/* renamed from: X.2wD */
public final class AnonymousClass2wD implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new TextInformationFrame(parcel);
    }

    public final Object[] newArray(int i) {
        return new TextInformationFrame[i];
    }
}
