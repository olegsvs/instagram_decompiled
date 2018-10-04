package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.exoplayer.ipc.VideoPlayerStreamFormat;

/* renamed from: X.2l5 */
public final class AnonymousClass2l5 implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new VideoPlayerStreamFormat(parcel);
    }

    public final Object[] newArray(int i) {
        return new VideoPlayerStreamFormat[i];
    }
}
