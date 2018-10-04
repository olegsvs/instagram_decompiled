package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.1Y3 */
public final class AnonymousClass1Y3 implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new SavedCollection(parcel);
    }

    public final Object[] newArray(int i) {
        return new SavedCollection[i];
    }
}
