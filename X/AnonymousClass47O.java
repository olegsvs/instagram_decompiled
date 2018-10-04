package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.location.FbLocationContinuousListenerParams;

/* renamed from: X.47O */
public final class AnonymousClass47O implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new FbLocationContinuousListenerParams(parcel);
    }

    public final Object[] newArray(int i) {
        return new FbLocationContinuousListenerParams[i];
    }
}
