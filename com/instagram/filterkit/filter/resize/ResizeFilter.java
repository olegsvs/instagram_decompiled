package com.instagram.filterkit.filter.resize;

import X.AnonymousClass0Dc;
import X.AnonymousClass0Gn;
import X.AnonymousClass0g3;
import X.AnonymousClass28k;
import X.AnonymousClass2Vh;
import X.AnonymousClass2Vi;
import X.AnonymousClass3Ow;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.filterkit.filter.IgFilter;

public class ResizeFilter implements IgFilter {
    public static final Creator CREATOR = new AnonymousClass3Ow();
    /* renamed from: E */
    private static final Class f48270E = ResizeFilter.class;
    /* renamed from: B */
    private final IdentityFilter f48271B = new IdentityFilter();
    /* renamed from: C */
    private final IgFilter f48272C = new LanczosFilter();
    /* renamed from: D */
    private boolean f48273D;

    public final boolean EY() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public ResizeFilter(boolean z) {
        this.f48273D = z;
    }

    /* renamed from: B */
    private void m22023B(AnonymousClass28k anonymousClass28k, AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi) {
        int i = 1;
        for (int jQ = (int) ((((float) anonymousClass2Vi.jQ()) * 1.9f) + 0.5f); anonymousClass2Vh.getWidth() > jQ; jQ = (int) ((((float) jQ) * 1.9f) + 0.5f)) {
            i++;
        }
        while (i > 1) {
            AnonymousClass2Vi F = anonymousClass28k.m14594F((int) ((((float) anonymousClass2Vh.getWidth()) / 1.9f) + 0.5f), (int) ((((float) anonymousClass2Vh.getHeight()) / 1.9f) + 0.5f));
            this.f48271B.yJA(anonymousClass28k, anonymousClass2Vh, F);
            anonymousClass28k.m14596H(anonymousClass2Vh, null);
            i--;
            Object obj = F;
        }
        this.f48271B.yJA(anonymousClass28k, anonymousClass2Vh, anonymousClass2Vi);
        anonymousClass28k.m14596H(anonymousClass2Vh, null);
    }

    public final void QE(AnonymousClass28k anonymousClass28k) {
        this.f48272C.QE(anonymousClass28k);
        this.f48271B.QE(anonymousClass28k);
    }

    public final void QPA(int i) {
        this.f48272C.QPA(i);
        this.f48271B.QPA(i);
    }

    public final void cb() {
        this.f48271B.cb();
        this.f48272C.cb();
    }

    public final void invalidate() {
        this.f48272C.invalidate();
        this.f48271B.invalidate();
    }

    public final boolean kX() {
        return this.f48273D ? this.f48272C.kX() : this.f48271B.kX();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f48273D);
    }

    public final void yJA(AnonymousClass28k anonymousClass28k, AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi) {
        if (this.f48273D) {
            try {
                this.f48272C.yJA(anonymousClass28k, anonymousClass2Vh, anonymousClass2Vi);
                AnonymousClass0g3.HighQualityResize.C();
                return;
            } catch (Throwable e) {
                AnonymousClass0Dc.C(f48270E, "Advanced resize failed", e);
                AnonymousClass0Gn.G("ResizeFilter Render exception", e);
                this.f48273D = false;
                this.f48272C.QE(anonymousClass28k);
                AnonymousClass0g3.BasicResizeFallback.C();
                m22023B(anonymousClass28k, anonymousClass2Vh, anonymousClass2Vi);
                return;
            }
        }
        AnonymousClass0g3.BasicResizePreference.C();
        m22023B(anonymousClass28k, anonymousClass2Vh, anonymousClass2Vi);
    }
}
