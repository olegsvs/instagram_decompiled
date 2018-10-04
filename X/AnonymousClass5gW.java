package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.business.instantexperiences.IGInstantExperiencesParameters;

/* renamed from: X.5gW */
public final class AnonymousClass5gW implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        try {
            return new IGInstantExperiencesParameters(JsonProperty.USE_DEFAULT_NAME, Long.valueOf(0));
        } catch (Throwable e) {
            AnonymousClass0Dc.G(IGInstantExperiencesParameters.f72924K, "Failed to create class IGInstantExperiencesParameters", e);
            return null;
        }
    }

    public final Object[] newArray(int i) {
        return new IGInstantExperiencesParameters[i];
    }
}
