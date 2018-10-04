package android.support.v4.app;

import X.AnonymousClass1lX;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

public class FragmentTabHost$SavedState extends BaseSavedState {
    public static final Creator CREATOR = new AnonymousClass1lX();
    /* renamed from: B */
    public String f22494B;

    public FragmentTabHost$SavedState(Parcel parcel) {
        super(parcel);
        this.f22494B = parcel.readString();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FragmentTabHost.SavedState{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" curTab=");
        stringBuilder.append(this.f22494B);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f22494B);
    }
}
