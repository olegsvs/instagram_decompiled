package X;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.support.v7.widget.RecyclerView.SavedState;

/* renamed from: X.1cK */
public final class AnonymousClass1cK implements ClassLoaderCreator {
    public final Object createFromParcel(Parcel parcel) {
        return new SavedState(parcel, null);
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new SavedState(parcel, classLoader);
    }

    public final Object[] newArray(int i) {
        return new SavedState[i];
    }
}
