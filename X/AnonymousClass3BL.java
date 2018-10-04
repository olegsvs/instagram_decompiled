package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView.SavedState;

/* renamed from: X.3BL */
public final class AnonymousClass3BL implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new SavedState(parcel);
    }

    public final Object[] newArray(int i) {
        return new SavedState[i];
    }
}
