package com.instagram.location.impl;

import X.AnonymousClass0Lm;
import X.AnonymousClass1hI;
import X.AnonymousClass1i6;
import X.AnonymousClass1kF;
import X.AnonymousClass1kM;
import X.AnonymousClass1kO;
import X.AnonymousClass5jg;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.location.ImmutableLocation;
import com.fasterxml.jackson.core.JsonGenerator;
import com.instagram.location.intf.LocationSignalPackage;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;

public class LocationSignalPackageImpl implements LocationSignalPackage {
    public static final Creator CREATOR = new AnonymousClass5jg();
    /* renamed from: B */
    private final com.facebook.location.signalpackage.LocationSignalPackage f68606B;

    public final int describeContents() {
        return 0;
    }

    public LocationSignalPackageImpl(com.facebook.location.signalpackage.LocationSignalPackage locationSignalPackage) {
        this.f68606B = locationSignalPackage;
    }

    public final String bVA() {
        AnonymousClass1kF C = AnonymousClass1i6.C(null, Collections.singletonList(this.f68606B), null);
        AnonymousClass1hI anonymousClass1hI = new AnonymousClass1hI(C.f22079C, C.f22082F);
        try {
            Writer stringWriter = new StringWriter();
            JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
            createGenerator.writeStartObject();
            if (anonymousClass1hI.f21494C != null) {
                createGenerator.writeFieldName("wifi_info");
                AnonymousClass1kM.B(createGenerator, anonymousClass1hI.f21494C, true);
            }
            if (anonymousClass1hI.f21493B != null) {
                createGenerator.writeFieldName("bluetooth_info");
                AnonymousClass1kO.B(createGenerator, anonymousClass1hI.f21493B, true);
            }
            createGenerator.writeEndObject();
            createGenerator.close();
            return stringWriter.toString();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                return this.f68606B.equals(((LocationSignalPackageImpl) obj).f68606B);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f68606B.hashCode();
    }

    public final Location pN() {
        ImmutableLocation immutableLocation = this.f68606B.f21594L;
        return immutableLocation != null ? immutableLocation.H() : null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f68606B, 0);
    }
}
