package com.instagram.model.sharelater;

import X.AnonymousClass0ON;
import X.AnonymousClass0P7;
import X.AnonymousClass0ZS;
import X.AnonymousClass3V8;
import X.AnonymousClass3V9;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.model.mediatype.IgShareLaterMedia;
import com.instagram.model.venue.Venue;

public class ShareLaterMedia implements IgShareLaterMedia {
    public static final Creator CREATOR = new AnonymousClass3V8();
    /* renamed from: B */
    public String f41719B;
    /* renamed from: C */
    public String f41720C;
    /* renamed from: D */
    public AnonymousClass0ON f41721D;
    /* renamed from: E */
    public String f41722E;
    /* renamed from: F */
    private boolean f41723F;
    /* renamed from: G */
    private boolean f41724G;
    /* renamed from: H */
    private boolean f41725H;
    /* renamed from: I */
    private boolean f41726I;
    /* renamed from: J */
    private boolean f41727J;
    /* renamed from: K */
    private boolean f41728K;
    /* renamed from: L */
    private boolean f41729L;
    /* renamed from: M */
    private Venue f41730M;

    public final boolean Cc() {
        return false;
    }

    public final boolean HV() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public ShareLaterMedia(AnonymousClass0P7 anonymousClass0P7) {
        this(anonymousClass0P7, anonymousClass0P7.HA());
    }

    public ShareLaterMedia(AnonymousClass0P7 anonymousClass0P7, String str) {
        if (anonymousClass0P7.f4028c != null) {
            this.f41719B = anonymousClass0P7.f4028c.f4910d;
        }
        this.f41720C = anonymousClass0P7.getId();
        this.f41721D = anonymousClass0P7.TO();
        this.f41722E = str;
        this.f41730M = anonymousClass0P7.AD;
        this.f41725H = anonymousClass0P7.TA();
        boolean z = (anonymousClass0P7.g() == null || anonymousClass0P7.h() == null) ? false : true;
        this.f41726I = z;
    }

    public ShareLaterMedia(Parcel parcel) {
        this.f41719B = parcel.readString();
        this.f41720C = parcel.readString();
        this.f41721D = AnonymousClass0ON.B(parcel.readInt());
        this.f41722E = parcel.readString();
        this.f41730M = (Venue) parcel.readParcelable(Venue.class.getClassLoader());
        boolean z = false;
        this.f41725H = parcel.readInt() == 1;
        boolean[] zArr = new boolean[AnonymousClass3V9.values().length];
        parcel.readBooleanArray(zArr);
        this.f41729L = zArr[AnonymousClass3V9.TWITTER.ordinal()];
        this.f41724G = zArr[AnonymousClass3V9.FACEBOOK.ordinal()];
        this.f41728K = zArr[AnonymousClass3V9.TUMBLR.ordinal()];
        this.f41723F = zArr[AnonymousClass3V9.AMEBA.ordinal()];
        this.f41727J = zArr[AnonymousClass3V9.ODNOKLASSNIKI.ordinal()];
        if (parcel.readInt() != 0) {
            z = true;
        }
        this.f41726I = z;
    }

    public final boolean CY() {
        return this.f41727J;
    }

    public final boolean IV() {
        return this.f41725H;
    }

    public final boolean TX() {
        return this.f41724G;
    }

    public final AnonymousClass0ZS eI() {
        return AnonymousClass0ZS.DEFAULT;
    }

    public final boolean gW() {
        return this.f41723F;
    }

    public final void hOA(boolean z) {
        this.f41723F = z;
    }

    public final void lOA(boolean z) {
        this.f41724G = z;
    }

    public final boolean rY() {
        return this.f41728K;
    }

    public final boolean sY() {
        return this.f41729L;
    }

    public final void tOA(boolean z) {
        this.f41727J = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f41719B);
        parcel.writeString(this.f41720C);
        parcel.writeInt(this.f41721D.A());
        parcel.writeString(this.f41722E);
        parcel.writeParcelable(this.f41730M, i);
        parcel.writeInt(this.f41725H);
        parcel.writeBooleanArray(new boolean[]{this.f41729L, this.f41724G, this.f41728K, this.f41723F, this.f41727J});
        parcel.writeInt(this.f41726I);
    }

    public final void xOA(boolean z) {
        this.f41728K = z;
    }

    public final void yOA(boolean z) {
        this.f41729L = z;
    }
}
