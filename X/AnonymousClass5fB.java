package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import java.util.List;

/* renamed from: X.5fB */
public final class AnonymousClass5fB implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = AnonymousClass1zA.O(parcel);
        String str = null;
        List list = null;
        List list2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < O) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 != JsonMappingException.MAX_REFS_TO_LIST) {
                switch (i4) {
                    case 1:
                        str = AnonymousClass1zA.W(parcel, readInt);
                        break;
                    case 2:
                        list = AnonymousClass1zA.D(parcel, readInt);
                        break;
                    case 3:
                        list2 = AnonymousClass1zA.C(parcel, readInt);
                        break;
                    case 4:
                        i2 = AnonymousClass1zA.P(parcel, readInt);
                        break;
                    case 5:
                        i3 = AnonymousClass1zA.P(parcel, readInt);
                        break;
                    default:
                        AnonymousClass1zA.K(parcel, readInt);
                        break;
                }
            }
            i = AnonymousClass1zA.P(parcel, readInt);
        }
        AnonymousClass1zA.G(parcel, O);
        return new PasswordSpecification(i, str, list, list2, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PasswordSpecification[i];
    }
}
