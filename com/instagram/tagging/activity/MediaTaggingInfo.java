package com.instagram.tagging.activity;

import X.AnonymousClass0ON;
import X.AnonymousClass3hY;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.instagram.model.fbfriend.FbFriendTag;
import com.instagram.model.people.PeopleTag;
import com.instagram.model.shopping.ProductTag;
import java.util.ArrayList;

public class MediaTaggingInfo implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass3hY();
    /* renamed from: B */
    public int f43447B;
    /* renamed from: C */
    public float f43448C = 1.0f;
    /* renamed from: D */
    public ArrayList f43449D = new ArrayList();
    /* renamed from: E */
    public boolean f43450E;
    /* renamed from: F */
    public String f43451F;
    /* renamed from: G */
    public AnonymousClass0ON f43452G;
    /* renamed from: H */
    public String f43453H;
    /* renamed from: I */
    public ArrayList f43454I = new ArrayList();
    /* renamed from: J */
    public ArrayList f43455J = new ArrayList();

    public final int describeContents() {
        return 0;
    }

    public MediaTaggingInfo(Parcel parcel) {
        this.f43451F = parcel.readString();
        this.f43453H = parcel.readString();
        this.f43454I = parcel.createTypedArrayList(PeopleTag.CREATOR);
        this.f43447B = parcel.readInt();
        this.f43449D = parcel.createTypedArrayList(FbFriendTag.CREATOR);
        this.f43448C = parcel.readFloat();
        this.f43455J = parcel.createTypedArrayList(ProductTag.CREATOR);
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.f43450E = z;
        this.f43452G = (AnonymousClass0ON) parcel.readSerializable();
    }

    public MediaTaggingInfo(String str, String str2, AnonymousClass0ON anonymousClass0ON, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f43451F = str;
        this.f43453H = str2;
        this.f43452G = anonymousClass0ON;
        if (arrayList != null) {
            this.f43454I.addAll(arrayList);
        }
        if (arrayList2 != null) {
            this.f43449D.addAll(arrayList2);
        }
        if (arrayList3 != null) {
            this.f43455J.addAll(arrayList3);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f43451F);
        parcel.writeString(this.f43453H);
        parcel.writeTypedList(this.f43454I);
        parcel.writeInt(this.f43447B);
        parcel.writeTypedList(this.f43449D);
        parcel.writeFloat(this.f43448C);
        parcel.writeTypedList(this.f43455J);
        parcel.writeInt(this.f43450E);
        parcel.writeSerializable(this.f43452G);
    }
}
