package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.ui.slidecardpageadapter.SlideCardViewModel;

/* renamed from: X.3j8 */
public final class AnonymousClass3j8 implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new SlideCardViewModel(parcel);
    }

    public final Object[] newArray(int i) {
        return new SlideCardViewModel[i];
    }
}
