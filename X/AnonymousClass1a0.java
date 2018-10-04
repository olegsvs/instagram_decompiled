package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.video.heroplayer.ipc.ParcelableXProcessTrafficShapingCommunication;

/* renamed from: X.1a0 */
public final class AnonymousClass1a0 implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new ParcelableXProcessTrafficShapingCommunication(parcel);
    }

    public final Object[] newArray(int i) {
        return new ParcelableXProcessTrafficShapingCommunication[i];
    }
}
