package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.model.videocall.VideoCallAudience;

/* renamed from: X.3VA */
public final class AnonymousClass3VA implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new VideoCallAudience(parcel);
    }

    public final Object[] newArray(int i) {
        return new VideoCallAudience[i];
    }
}
