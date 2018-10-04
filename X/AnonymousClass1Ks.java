package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.FragmentState;

/* renamed from: X.1Ks */
public final class AnonymousClass1Ks implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new FragmentState(parcel);
    }

    public final Object[] newArray(int i) {
        return new FragmentState[i];
    }
}
