package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.internal.zzarp;

/* renamed from: X.5fe */
public final class AnonymousClass5fe implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = AnonymousClass1zA.O(parcel);
        int i = 0;
        Credential credential = null;
        while (parcel.dataPosition() < O) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                credential = (Credential) AnonymousClass1zA.I(parcel, readInt, Credential.CREATOR);
            } else if (i2 != JsonMappingException.MAX_REFS_TO_LIST) {
                AnonymousClass1zA.K(parcel, readInt);
            } else {
                i = AnonymousClass1zA.P(parcel, readInt);
            }
        }
        AnonymousClass1zA.G(parcel, O);
        return new zzarp(i, credential);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzarp[i];
    }
}
