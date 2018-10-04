package com.instagram.creation.capture;

import X.AnonymousClass4Hz;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GalleryPickerView$SavedState extends BaseSavedState {
    public static final Creator CREATOR = new AnonymousClass4Hz();
    /* renamed from: B */
    public float[] f52416B;
    /* renamed from: C */
    public int f52417C;
    /* renamed from: D */
    public String f52418D;
    /* renamed from: E */
    public boolean f52419E;
    /* renamed from: F */
    public boolean f52420F;
    /* renamed from: G */
    public Map f52421G;
    /* renamed from: H */
    public String f52422H;
    /* renamed from: I */
    public String[] f52423I;

    public GalleryPickerView$SavedState(Parcel parcel) {
        super(parcel);
        this.f52416B = new float[9];
        this.f52421G = new HashMap();
        this.f52417C = parcel.readInt();
        this.f52418D = parcel.readString();
        this.f52422H = parcel.readString();
        boolean z = true;
        this.f52419E = parcel.readInt() == 1;
        parcel.readFloatArray(this.f52416B);
        this.f52423I = parcel.createStringArray();
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.f52420F = z;
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.f52421G.put(parcel.readString(), (GalleryPreviewInfo) parcel.readParcelable(GalleryPreviewInfo.class.getClassLoader()));
        }
    }

    public GalleryPickerView$SavedState(Parcelable parcelable) {
        super(parcelable);
        this.f52416B = new float[9];
        this.f52421G = new HashMap();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GalleryPickerView.SavedState{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" folderId=");
        stringBuilder.append(this.f52417C);
        stringBuilder.append(" folderName=");
        stringBuilder.append(this.f52418D);
        stringBuilder.append(" mediumId=");
        stringBuilder.append(this.f52422H);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f52417C);
        parcel.writeString(this.f52418D);
        parcel.writeString(this.f52422H);
        parcel.writeInt(this.f52419E);
        parcel.writeFloatArray(this.f52416B);
        parcel.writeStringArray(this.f52423I);
        parcel.writeInt(this.f52420F);
        parcel.writeInt(this.f52421G.size());
        for (Entry entry : this.f52421G.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
    }
}
