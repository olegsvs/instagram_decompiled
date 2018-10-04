package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.location.signalpackage.LocationSignalPackage;
import com.instagram.location.impl.LocationSignalPackageImpl;

/* renamed from: X.5jg */
public final class AnonymousClass5jg implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new LocationSignalPackageImpl((LocationSignalPackage) parcel.readParcelable(LocationSignalPackage.class.getClassLoader()));
    }

    public final Object[] newArray(int i) {
        return new LocationSignalPackageImpl[i];
    }
}
