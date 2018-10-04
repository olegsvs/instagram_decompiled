package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzbgp;
import com.google.android.gms.internal.zzbgq;
import java.util.ArrayList;

/* renamed from: X.20v */
public final class AnonymousClass20v implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = AnonymousClass1zA.m14036O(parcel);
        String str = null;
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < O) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = AnonymousClass1zA.m14037P(parcel, readInt);
                    break;
                case 2:
                    str = AnonymousClass1zA.m14044W(parcel, readInt);
                    break;
                case 3:
                    arrayList = AnonymousClass1zA.m14034M(parcel, readInt, zzbgq.CREATOR);
                    break;
                default:
                    AnonymousClass1zA.m14032K(parcel, readInt);
                    break;
            }
        }
        AnonymousClass1zA.m14028G(parcel, O);
        return new zzbgp(i, str, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbgp[i];
    }
}
