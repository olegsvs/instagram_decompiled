package X;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;

/* renamed from: X.1z7 */
public final class AnonymousClass1z7 implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = AnonymousClass1zA.m14036O(parcel);
        int i = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        int i2 = 0;
        while (parcel.dataPosition() < O) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = AnonymousClass1zA.m14037P(parcel, readInt);
                    break;
                case 2:
                    parcelFileDescriptor = (ParcelFileDescriptor) AnonymousClass1zA.m14030I(parcel, readInt, ParcelFileDescriptor.CREATOR);
                    break;
                case 3:
                    i2 = AnonymousClass1zA.m14037P(parcel, readInt);
                    break;
                default:
                    AnonymousClass1zA.m14032K(parcel, readInt);
                    break;
            }
        }
        AnonymousClass1zA.m14028G(parcel, O);
        return new BitmapTeleporter(i, parcelFileDescriptor, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BitmapTeleporter[i];
    }
}
