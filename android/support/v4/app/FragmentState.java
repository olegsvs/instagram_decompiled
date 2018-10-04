package android.support.v4.app;

import X.AnonymousClass0IL;
import X.AnonymousClass1Ks;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class FragmentState implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1Ks();
    /* renamed from: B */
    public final Bundle f17234B;
    /* renamed from: C */
    public final String f17235C;
    /* renamed from: D */
    public final int f17236D;
    /* renamed from: E */
    public final boolean f17237E;
    /* renamed from: F */
    public final int f17238F;
    /* renamed from: G */
    public final boolean f17239G;
    /* renamed from: H */
    public final boolean f17240H;
    /* renamed from: I */
    public final int f17241I;
    /* renamed from: J */
    public AnonymousClass0IL f17242J;
    /* renamed from: K */
    public final boolean f17243K;
    /* renamed from: L */
    public Bundle f17244L;
    /* renamed from: M */
    public final String f17245M;

    public final int describeContents() {
        return 0;
    }

    public FragmentState(AnonymousClass0IL anonymousClass0IL) {
        this.f17235C = anonymousClass0IL.getClass().getName();
        this.f17241I = anonymousClass0IL.mIndex;
        this.f17239G = anonymousClass0IL.mFromLayout;
        this.f17238F = anonymousClass0IL.mFragmentId;
        this.f17236D = anonymousClass0IL.mContainerId;
        this.f17245M = anonymousClass0IL.mTag;
        this.f17243K = anonymousClass0IL.mRetainInstance;
        this.f17237E = anonymousClass0IL.mDetached;
        this.f17234B = anonymousClass0IL.mArguments;
        this.f17240H = anonymousClass0IL.mHidden;
    }

    public FragmentState(Parcel parcel) {
        this.f17235C = parcel.readString();
        this.f17241I = parcel.readInt();
        boolean z = true;
        this.f17239G = parcel.readInt() != 0;
        this.f17238F = parcel.readInt();
        this.f17236D = parcel.readInt();
        this.f17245M = parcel.readString();
        this.f17243K = parcel.readInt() != 0;
        this.f17237E = parcel.readInt() != 0;
        this.f17234B = parcel.readBundle();
        if (parcel.readInt() == 0) {
            z = false;
        }
        this.f17240H = z;
        this.f17244L = parcel.readBundle();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17235C);
        parcel.writeInt(this.f17241I);
        parcel.writeInt(this.f17239G);
        parcel.writeInt(this.f17238F);
        parcel.writeInt(this.f17236D);
        parcel.writeString(this.f17245M);
        parcel.writeInt(this.f17243K);
        parcel.writeInt(this.f17237E);
        parcel.writeBundle(this.f17234B);
        parcel.writeInt(this.f17240H);
        parcel.writeBundle(this.f17244L);
    }
}
