package X;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzctn;

/* renamed from: X.218 */
public final class AnonymousClass218 implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = AnonymousClass1zA.m14036O(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < O) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = AnonymousClass1zA.m14037P(parcel, readInt);
                    break;
                case 2:
                    i2 = AnonymousClass1zA.m14037P(parcel, readInt);
                    break;
                case 3:
                    intent = (Intent) AnonymousClass1zA.m14030I(parcel, readInt, Intent.CREATOR);
                    break;
                default:
                    AnonymousClass1zA.m14032K(parcel, readInt);
                    break;
            }
        }
        AnonymousClass1zA.m14028G(parcel, O);
        return new zzctn(i, i2, intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzctn[i];
    }
}
