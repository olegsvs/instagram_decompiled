package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.video.heroplayer.ipc.DeviceOrientationFrame;

/* renamed from: X.1xc */
public final class AnonymousClass1xc implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new DeviceOrientationFrame(parcel);
    }

    public final Object[] newArray(int i) {
        return new DeviceOrientationFrame[i];
    }
}
