package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.video.heroplayer.ipc.VideoPrefetchRequest;

/* renamed from: X.17S */
public final class AnonymousClass17S implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new VideoPrefetchRequest(parcel);
    }

    public final Object[] newArray(int i) {
        return new VideoPrefetchRequest[i];
    }
}
