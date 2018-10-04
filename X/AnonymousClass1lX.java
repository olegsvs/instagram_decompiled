package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.FragmentTabHost$SavedState;

/* renamed from: X.1lX */
public final class AnonymousClass1lX implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new FragmentTabHost$SavedState(parcel);
    }

    public final Object[] newArray(int i) {
        return new FragmentTabHost$SavedState[i];
    }
}
