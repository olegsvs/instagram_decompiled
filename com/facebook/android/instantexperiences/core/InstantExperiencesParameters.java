package com.facebook.android.instantexperiences.core;

import android.net.Uri;
import android.os.Parcelable;

public interface InstantExperiencesParameters extends Parcelable {
    long JN();

    Boolean RI();

    String XI();

    InstantExperiencesFeatureEnabledList mL();

    Uri nT();

    boolean tY(String str);
}
