package android.support.v4.view;

import X.AnonymousClass1mt;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ViewPager$SavedState extends AbsSavedState {
    public static final Creator CREATOR = new AnonymousClass1mt();
    /* renamed from: B */
    public Parcelable f22637B;
    /* renamed from: C */
    public ClassLoader f22638C;
    /* renamed from: D */
    public int f22639D;

    public ViewPager$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        this.f22639D = parcel.readInt();
        this.f22637B = parcel.readParcelable(classLoader);
        this.f22638C = classLoader;
    }

    public ViewPager$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FragmentPager.SavedState{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" position=");
        stringBuilder.append(this.f22639D);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f22639D);
        parcel.writeParcelable(this.f22637B, i);
    }
}
