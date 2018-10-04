package com.instagram.model.reelpresharemediainfo;

import X.AnonymousClass0ON;
import X.AnonymousClass3Ud;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

public class ReelPreShareMediaInfo implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass3Ud();
    /* renamed from: B */
    public List f41637B;
    /* renamed from: C */
    public String f41638C;
    /* renamed from: D */
    public String f41639D;
    /* renamed from: E */
    public List f41640E;
    /* renamed from: F */
    public List f41641F;
    /* renamed from: G */
    public AnonymousClass0ON f41642G;
    /* renamed from: H */
    public List f41643H;

    public final int describeContents() {
        return 0;
    }

    public ReelPreShareMediaInfo(Parcel parcel) {
        this.f41639D = parcel.readString();
        this.f41642G = AnonymousClass0ON.B(parcel.readInt());
        this.f41638C = parcel.readString();
        this.f41643H = parcel.createStringArrayList();
        this.f41640E = parcel.createStringArrayList();
        this.f41641F = parcel.createStringArrayList();
        this.f41637B = parcel.createStringArrayList();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f41639D);
        parcel.writeInt(this.f41642G.A());
        parcel.writeString(this.f41638C);
        parcel.writeStringList(this.f41643H);
        parcel.writeStringList(this.f41640E);
        parcel.writeStringList(this.f41641F);
        parcel.writeStringList(this.f41637B);
    }
}
