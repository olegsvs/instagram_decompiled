package com.facebook.android.instantexperiences.jscall;

import X.AnonymousClass5d9;
import X.AnonymousClass5dA;
import X.AnonymousClass5dB;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public class InstantExperienceGenericErrorResult extends InstantExperiencesCallResult {
    public static final Creator CREATOR = new AnonymousClass5dB();

    public final int describeContents() {
        return 0;
    }

    public InstantExperienceGenericErrorResult(AnonymousClass5d9 anonymousClass5d9) {
        super(anonymousClass5d9.f67476B, anonymousClass5d9.getMessage());
    }

    public InstantExperienceGenericErrorResult(AnonymousClass5dA anonymousClass5dA, String str) {
        super(anonymousClass5dA, str);
    }

    public InstantExperienceGenericErrorResult(Parcel parcel) {
        super(parcel);
    }
}
