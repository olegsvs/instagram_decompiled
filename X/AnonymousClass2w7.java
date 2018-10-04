package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;

/* renamed from: X.2w7 */
public final class AnonymousClass2w7 implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new ChapterFrame(parcel);
    }

    public final Object[] newArray(int i) {
        return new ChapterFrame[i];
    }
}
