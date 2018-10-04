package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.android.instantexperiences.autofill.model.NameAutofillData;

/* renamed from: X.5d0 */
public final class AnonymousClass5d0 implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new NameAutofillData(parcel);
    }

    public final Object[] newArray(int i) {
        return new NameAutofillData[i];
    }
}
