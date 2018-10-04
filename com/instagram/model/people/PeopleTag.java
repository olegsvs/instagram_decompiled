package com.instagram.model.people;

import X.AnonymousClass0Ci;
import X.AnonymousClass1B6;
import X.AnonymousClass1B7;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.tagging.model.Tag;
import com.instagram.tagging.model.TaggableModel;

public class PeopleTag extends Tag {
    public static final Creator CREATOR = new AnonymousClass1B6();
    /* renamed from: B */
    public UserInfo f15362B;

    public class UserInfo implements TaggableModel {
        public static final Creator CREATOR = new AnonymousClass1B7();
        /* renamed from: B */
        public String f15364B;
        /* renamed from: C */
        public String f15365C;
        /* renamed from: D */
        public String f15366D;
        /* renamed from: E */
        public String f15367E;

        public final int describeContents() {
            return 0;
        }

        public UserInfo(AnonymousClass0Ci anonymousClass0Ci) {
            this.f15367E = anonymousClass0Ci.uT();
            this.f15366D = anonymousClass0Ci.getId();
            this.f15364B = anonymousClass0Ci.f1757z;
            this.f15365C = anonymousClass0Ci.DQ();
        }

        public UserInfo(Parcel parcel) {
            this.f15366D = parcel.readString();
            this.f15367E = parcel.readString();
            this.f15364B = parcel.readString();
            this.f15365C = parcel.readString();
        }

        public final void XOA(String str) {
            this.f15366D = str;
        }

        public final boolean equals(Object obj) {
            boolean z = true;
            if (this != obj) {
                if (obj != null) {
                    if (getClass() == obj.getClass()) {
                        UserInfo userInfo = (UserInfo) obj;
                        if (!TextUtils.equals(this.f15367E, userInfo.f15367E) || !TextUtils.equals(this.f15366D, userInfo.f15366D)) {
                            z = false;
                        }
                    }
                }
                return false;
            }
            return z;
        }

        public final String getId() {
            return this.f15366D;
        }

        public final int hashCode() {
            return (this.f15366D.hashCode() * 31) + this.f15367E.hashCode();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f15366D);
            parcel.writeString(this.f15367E);
            parcel.writeString(this.f15364B);
            parcel.writeString(this.f15365C);
        }
    }

    /* renamed from: B */
    public final String mo2198B() {
        return MemoryDumpUploadJob.EXTRA_USER_ID;
    }

    public PeopleTag() {
        this.f15362B = new UserInfo();
    }

    public PeopleTag(AnonymousClass0Ci anonymousClass0Ci) {
        this.f15362B = new UserInfo(anonymousClass0Ci);
    }

    public PeopleTag(AnonymousClass0Ci anonymousClass0Ci, PointF pointF) {
        this.f15363B = pointF;
        this.f15362B = new UserInfo(anonymousClass0Ci);
    }

    public PeopleTag(Parcel parcel) {
        super(parcel, UserInfo.class.getClassLoader());
    }

    /* renamed from: C */
    public final /* bridge */ /* synthetic */ TaggableModel mo2199C() {
        return this.f15362B;
    }

    /* renamed from: D */
    public final /* bridge */ /* synthetic */ void mo2200D(TaggableModel taggableModel) {
        this.f15362B = (UserInfo) taggableModel;
    }

    /* renamed from: E */
    public final String m9780E() {
        return this.f15362B.f15367E;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                return this.f15362B.equals(((PeopleTag) obj).f15362B);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f15362B.hashCode();
    }
}
