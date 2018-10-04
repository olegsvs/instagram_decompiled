package com.instagram.filterkit.filter;

import X.AnonymousClass28k;
import android.os.Parcel;

public abstract class BaseFilter implements IgFilter {
    /* renamed from: B */
    public boolean f48221B = true;

    public boolean EY() {
        return false;
    }

    public void QE(AnonymousClass28k anonymousClass28k) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    public BaseFilter(Parcel parcel) {
    }

    public void QPA(int i) {
        throw new UnsupportedOperationException("Not implemented at this time");
    }

    public void cb() {
        this.f48221B = false;
    }

    public void invalidate() {
        this.f48221B = true;
    }

    public boolean kX() {
        return this.f48221B;
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
