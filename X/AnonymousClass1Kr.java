package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.FragmentManagerState;

/* renamed from: X.1Kr */
public final class AnonymousClass1Kr implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new FragmentManagerState(parcel);
    }

    public final Object[] newArray(int i) {
        return new FragmentManagerState[i];
    }
}
