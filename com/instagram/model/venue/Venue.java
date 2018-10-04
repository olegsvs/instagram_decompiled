package com.instagram.model.venue;

import X.AnonymousClass0LQ;
import X.AnonymousClass0PA;
import X.AnonymousClass0x8;
import X.AnonymousClass18o;
import X.AnonymousClass18p;
import X.AnonymousClass18q;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.core.JsonParser;
import java.util.Collection;

public class Venue implements Parcelable, AnonymousClass0PA {
    public static final Creator CREATOR = new AnonymousClass18o();
    /* renamed from: B */
    public String f6705B;
    /* renamed from: C */
    public String f6706C;
    /* renamed from: D */
    public String f6707D;
    /* renamed from: E */
    public String f6708E;
    /* renamed from: F */
    public String f6709F;
    /* renamed from: G */
    public String f6710G;
    /* renamed from: H */
    public String f6711H;
    /* renamed from: I */
    public String f6712I;
    /* renamed from: J */
    public Double f6713J;
    /* renamed from: K */
    public Double f6714K;
    /* renamed from: L */
    public boolean f6715L;
    /* renamed from: M */
    public String f6716M;
    /* renamed from: N */
    public String f6717N;

    public final boolean DY() {
        return true;
    }

    public final boolean bX() {
        return true;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean eY() {
        return false;
    }

    public final void yC() {
    }

    public final String zR() {
        return null;
    }

    public Venue(Parcel parcel) {
        this.f6710G = parcel.readString();
        this.f6716M = parcel.readString();
        this.f6717N = parcel.readString();
        this.f6705B = parcel.readString();
        this.f6706C = parcel.readString();
        this.f6707D = parcel.readString();
        this.f6712I = parcel.readString();
        this.f6711H = parcel.readString();
        this.f6713J = (Double) parcel.readValue(null);
        this.f6714K = (Double) parcel.readValue(null);
    }

    public final AnonymousClass0x8 FR() {
        return this.f6715L ? AnonymousClass0x8.SAVED : AnonymousClass0x8.NOT_SAVED;
    }

    public final Collection GR() {
        throw new UnsupportedOperationException("Saving location in collections isn't supported yet.");
    }

    public final void MRA(AnonymousClass0x8 anonymousClass0x8) {
        this.f6715L = anonymousClass0x8 == AnonymousClass0x8.SAVED;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    Venue venue = (Venue) obj;
                    if (!AnonymousClass0LQ.m2954B(this.f6716M, venue.f6716M) || !AnonymousClass0LQ.m2954B(this.f6705B, venue.f6705B) || !AnonymousClass0LQ.m2954B(this.f6713J, venue.f6713J) || !AnonymousClass0LQ.m2954B(this.f6714K, venue.f6714K)) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final String getId() {
        return this.f6710G;
    }

    public final int hashCode() {
        return AnonymousClass0LQ.m2956D(this.f6716M, this.f6705B, this.f6713J, this.f6714K);
    }

    public static Venue parseFromJson(JsonParser jsonParser, boolean z) {
        jsonParser = AnonymousClass18p.parseFromJson(jsonParser);
        if (!z) {
            return jsonParser;
        }
        AnonymousClass18q anonymousClass18q = AnonymousClass18q.f15035B;
        Venue venue = (Venue) anonymousClass18q.get(jsonParser.getId());
        if (venue != null) {
            String str = jsonParser.f6710G;
            if (str != null) {
                venue.f6710G = str;
            }
            str = jsonParser.f6716M;
            if (str != null) {
                venue.f6716M = str;
            }
            str = jsonParser.f6717N;
            if (str != null) {
                venue.f6717N = str;
            }
            str = jsonParser.f6705B;
            if (str != null) {
                venue.f6705B = str;
            }
            str = jsonParser.f6706C;
            if (str != null) {
                venue.f6706C = str;
            }
            str = jsonParser.f6707D;
            if (str != null) {
                venue.f6707D = str;
            }
            str = jsonParser.f6712I;
            if (str != null) {
                venue.f6712I = str;
            }
            str = jsonParser.f6711H;
            if (str != null) {
                venue.f6711H = str;
            }
            Double d = jsonParser.f6713J;
            if (d != null) {
                venue.f6713J = d;
            }
            d = jsonParser.f6714K;
            if (d != null) {
                venue.f6714K = d;
            }
            return venue;
        }
        anonymousClass18q.put(jsonParser.getId(), jsonParser);
        return jsonParser;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6710G);
        parcel.writeString(this.f6716M);
        parcel.writeString(this.f6717N);
        parcel.writeString(this.f6705B);
        parcel.writeString(this.f6706C);
        parcel.writeString(this.f6707D);
        parcel.writeString(this.f6712I);
        parcel.writeString(this.f6711H);
        parcel.writeValue(this.f6713J);
        parcel.writeValue(this.f6714K);
    }
}
