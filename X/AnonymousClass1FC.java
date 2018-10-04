package X;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: X.1FC */
public final class AnonymousClass1FC {
    static {
        AnonymousClass1FC.class.getClassLoader();
    }

    private AnonymousClass1FC() {
    }

    /* renamed from: B */
    public static Parcelable m10312B(Parcel parcel, Creator creator) {
        return parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: C */
    public static void m10313C(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: D */
    public static void m10314D(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: E */
    public static boolean m10315E(Parcel parcel) {
        return parcel.readInt() == 1;
    }
}
