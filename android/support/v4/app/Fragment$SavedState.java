package android.support.v4.app;

import X.AnonymousClass1lL;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Fragment$SavedState implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1lL();
    /* renamed from: B */
    public final Bundle f22474B;

    public final int describeContents() {
        return 0;
    }

    public Fragment$SavedState(Bundle bundle) {
        this.f22474B = bundle;
    }

    public Fragment$SavedState(Parcel parcel, ClassLoader classLoader) {
        this.f22474B = parcel.readBundle();
        if (classLoader != null) {
            Bundle bundle = this.f22474B;
            if (bundle != null) {
                bundle.setClassLoader(classLoader);
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f22474B);
    }
}
