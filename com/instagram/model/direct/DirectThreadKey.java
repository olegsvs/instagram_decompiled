package com.instagram.model.direct;

import X.AnonymousClass0Ck;
import X.AnonymousClass0LH;
import X.AnonymousClass1DY;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DirectThreadKey implements Parcelable, Comparable {
    public static final Creator CREATOR = new AnonymousClass1DY();
    /* renamed from: B */
    public List f5870B;
    /* renamed from: C */
    public String f5871C;

    public final int describeContents() {
        return 0;
    }

    public DirectThreadKey(Parcel parcel) {
        this.f5871C = parcel.readString();
        this.f5870B = parcel.createStringArrayList();
    }

    public DirectThreadKey(String str) {
        this(str, (List) null);
    }

    public DirectThreadKey(String str, Collection collection) {
        this(str, collection == null ? null : m4989C(collection));
    }

    public DirectThreadKey(String str, List list) {
        boolean z;
        List list2;
        if (str == null) {
            if (list == null) {
                z = false;
                AnonymousClass0LH.m2924B(z);
                this.f5871C = str;
                this.f5870B = list;
                list2 = this.f5870B;
                if (list2 != null) {
                    Collections.sort(list2);
                }
            }
        }
        z = true;
        AnonymousClass0LH.m2924B(z);
        this.f5871C = str;
        this.f5870B = list;
        list2 = this.f5870B;
        if (list2 != null) {
            Collections.sort(list2);
        }
    }

    /* renamed from: A */
    public final int m4990A(DirectThreadKey directThreadKey) {
        String str = this.f5871C;
        if (str != null) {
            String str2 = directThreadKey.f5871C;
            if (str2 != null) {
                return str.compareTo(str2);
            }
        }
        int i = -1;
        if (this.f5871C == null && directThreadKey.f5871C == null) {
            int size = this.f5870B.size();
            int size2 = directThreadKey.f5870B.size();
            if (size == size2) {
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    size2 = ((String) this.f5870B.get(i2)).compareTo((String) directThreadKey.f5870B.get(i2));
                    if (size2 != 0) {
                        return size2;
                    }
                }
            } else {
                if (size < size2) {
                }
                return 1;
            }
        }
        if (this.f5871C == null) {
        }
        return 1;
        return i;
    }

    /* renamed from: B */
    public static List m4988B(Collection collection) {
        collection = m4989C(collection);
        Collections.sort(collection);
        return collection;
    }

    /* renamed from: C */
    private static List m4989C(Collection collection) {
        List arrayList = new ArrayList(collection.size());
        for (AnonymousClass0Ck id : collection) {
            arrayList.add(id.getId());
        }
        return arrayList;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return m4990A((DirectThreadKey) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectThreadKey)) {
            return false;
        }
        boolean equals;
        DirectThreadKey directThreadKey = (DirectThreadKey) obj;
        String str = this.f5871C;
        if (str != null) {
            equals = str.equals(directThreadKey.f5871C);
        } else {
            equals = this.f5870B.equals(directThreadKey.f5870B);
        }
        return equals;
    }

    public final int hashCode() {
        String str = this.f5871C;
        return str != null ? str.hashCode() : this.f5870B.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5871C);
        parcel.writeStringList(this.f5870B);
    }
}
