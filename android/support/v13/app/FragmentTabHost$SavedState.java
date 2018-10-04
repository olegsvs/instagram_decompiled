package android.support.v13.app;

import X.AnonymousClass1l2;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

public class FragmentTabHost$SavedState extends BaseSavedState {
    public static final Creator CREATOR = new AnonymousClass1l2();
    /* renamed from: B */
    public String f22441B;

    public FragmentTabHost$SavedState(Parcel parcel) {
        super(parcel);
        this.f22441B = parcel.readString();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FragmentTabHost.SavedState{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" curTab=");
        stringBuilder.append(this.f22441B);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f22441B);
    }
}
