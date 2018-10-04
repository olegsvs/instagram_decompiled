package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;

/* renamed from: X.2w9 */
public final class AnonymousClass2w9 implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new CommentFrame(parcel);
    }

    public final Object[] newArray(int i) {
        return new CommentFrame[i];
    }
}
