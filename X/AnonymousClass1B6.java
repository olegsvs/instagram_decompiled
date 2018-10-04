package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.model.people.PeopleTag;

/* renamed from: X.1B6 */
public final class AnonymousClass1B6 implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new PeopleTag(parcel);
    }

    public final Object[] newArray(int i) {
        return new PeopleTag[i];
    }
}
