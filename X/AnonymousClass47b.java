package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.location.signalpackage.ActivityRecognitionResult;
import com.facebook.location.signalpackage.DetectedActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.47b */
public final class AnonymousClass47b implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        List arrayList = new ArrayList();
        parcel.readTypedList(arrayList, DetectedActivity.CREATOR);
        return new ActivityRecognitionResult(arrayList, readLong, readLong2);
    }

    public final Object[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
