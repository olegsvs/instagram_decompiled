package com.instagram.model.fbfriend;

import X.AnonymousClass2EB;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.tagging.model.Tag;
import com.instagram.tagging.model.TaggableModel;

public class FbFriendTag extends Tag {
    public static final Creator CREATOR = new AnonymousClass2EB();
    /* renamed from: B */
    public FbFriend f27813B;
    /* renamed from: C */
    public String f27814C;
    /* renamed from: D */
    public String f27815D;

    /* renamed from: B */
    public final String m14771B() {
        return "fb_id";
    }

    public FbFriendTag() {
        this.f27813B = new FbFriend();
    }

    public FbFriendTag(Parcel parcel) {
        super(parcel, FbFriend.class.getClassLoader());
    }

    public FbFriendTag(FbFriend fbFriend, PointF pointF) {
        this.f15363B = pointF;
        this.f27813B = fbFriend;
    }

    /* renamed from: C */
    public final /* bridge */ /* synthetic */ TaggableModel m14772C() {
        return this.f27813B;
    }

    /* renamed from: D */
    public final /* bridge */ /* synthetic */ void m14773D(TaggableModel taggableModel) {
        this.f27813B = (FbFriend) taggableModel;
    }

    /* renamed from: E */
    public final String m14774E() {
        FbFriend fbFriend = this.f27813B;
        if (fbFriend != null) {
            return fbFriend.f9869C;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    if (super.equals(obj)) {
                        FbFriendTag fbFriendTag = (FbFriendTag) obj;
                        FbFriend fbFriend = this.f27813B;
                        if (fbFriend != null) {
                            return fbFriend.equals(fbFriendTag.f27813B);
                        }
                        if (fbFriendTag.f27813B != null) {
                            z = false;
                        }
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        FbFriend fbFriend = this.f27813B;
        return fbFriend != null ? fbFriend.hashCode() : 0;
    }
}
