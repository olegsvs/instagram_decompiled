package android.support.v4.app;

import X.AnonymousClass1Kr;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class FragmentManagerState implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1Kr();
    /* renamed from: B */
    public FragmentState[] f17229B;
    /* renamed from: C */
    public int[] f17230C;
    /* renamed from: D */
    public BackStackState[] f17231D;
    /* renamed from: E */
    public int f17232E;
    /* renamed from: F */
    public int f17233F = -1;

    public final int describeContents() {
        return 0;
    }

    public FragmentManagerState(Parcel parcel) {
        this.f17229B = (FragmentState[]) parcel.createTypedArray(FragmentState.CREATOR);
        this.f17230C = parcel.createIntArray();
        this.f17231D = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f17233F = parcel.readInt();
        this.f17232E = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f17229B, i);
        parcel.writeIntArray(this.f17230C);
        parcel.writeTypedArray(this.f17231D, i);
        parcel.writeInt(this.f17233F);
        parcel.writeInt(this.f17232E);
    }
}
