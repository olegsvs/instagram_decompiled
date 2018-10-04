package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.filterkit.filter.resize.IdentityFilter;

/* renamed from: X.3Ou */
public final class AnonymousClass3Ou implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new IdentityFilter(parcel);
    }

    public final Object[] newArray(int i) {
        return new IdentityFilter[i];
    }
}
