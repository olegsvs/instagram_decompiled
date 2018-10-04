package android.support.v4.view;

import X.AnonymousClass1cJ;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public abstract class AbsSavedState implements Parcelable {
    /* renamed from: C */
    public static final AbsSavedState f13608C = new C00491();
    public static final Creator CREATOR = new AnonymousClass1cJ();
    /* renamed from: B */
    public final Parcelable f13609B;

    /* renamed from: android.support.v4.view.AbsSavedState$1 */
    public final class C00491 extends AbsSavedState {
    }

    public final int describeContents() {
        return 0;
    }

    public AbsSavedState() {
        this.f13609B = null;
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        if (readParcelable == null) {
            readParcelable = f13608C;
        }
        this.f13609B = readParcelable;
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            if (parcelable == f13608C) {
                parcelable = null;
            }
            this.f13609B = parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f13609B, i);
    }
}
