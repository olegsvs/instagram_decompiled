package X;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: X.1z8 */
public final class AnonymousClass1z8 implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = AnonymousClass1zA.m14036O(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < O) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 != JsonMappingException.MAX_REFS_TO_LIST) {
                switch (i3) {
                    case 1:
                        strArr = AnonymousClass1zA.m14023B(parcel, readInt);
                        break;
                    case 2:
                        cursorWindowArr = (CursorWindow[]) AnonymousClass1zA.m14033L(parcel, readInt, CursorWindow.CREATOR);
                        break;
                    case 3:
                        i2 = AnonymousClass1zA.m14037P(parcel, readInt);
                        break;
                    case 4:
                        bundle = AnonymousClass1zA.m14046Y(parcel, readInt);
                        break;
                    default:
                        AnonymousClass1zA.m14032K(parcel, readInt);
                        break;
                }
            }
            i = AnonymousClass1zA.m14037P(parcel, readInt);
        }
        AnonymousClass1zA.m14028G(parcel, O);
        DataHolder dataHolder = new DataHolder(i, strArr, cursorWindowArr, i2, bundle);
        dataHolder.f25003D = new Bundle();
        O = 0;
        int i4 = 0;
        while (true) {
            String[] strArr2 = dataHolder.f25002C;
            if (i4 < strArr2.length) {
                dataHolder.f25003D.putInt(strArr2[i4], i4);
                i4++;
            } else {
                dataHolder.f25005F = new int[dataHolder.f25004E.length];
                readInt = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr2 = dataHolder.f25004E;
                    if (O >= cursorWindowArr2.length) {
                        return dataHolder;
                    }
                    dataHolder.f25005F[O] = readInt;
                    readInt += dataHolder.f25004E[O].getNumRows() - (readInt - cursorWindowArr2[O].getStartPosition());
                    O++;
                }
            }
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }
}
