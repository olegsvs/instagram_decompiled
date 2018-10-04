package android.support.v4.app;

import X.AnonymousClass0hg;
import X.AnonymousClass0m9;
import X.AnonymousClass1Kt;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;

public final class BackStackState implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1Kt();
    /* renamed from: B */
    public final int f17246B;
    /* renamed from: C */
    public final CharSequence f17247C;
    /* renamed from: D */
    public final int f17248D;
    /* renamed from: E */
    public final CharSequence f17249E;
    /* renamed from: F */
    public final int f17250F;
    /* renamed from: G */
    public final String f17251G;
    /* renamed from: H */
    public final int[] f17252H;
    /* renamed from: I */
    public final boolean f17253I;
    /* renamed from: J */
    public final ArrayList f17254J;
    /* renamed from: K */
    public final ArrayList f17255K;
    /* renamed from: L */
    public final int f17256L;
    /* renamed from: M */
    public final int f17257M;

    public final int describeContents() {
        return 0;
    }

    public BackStackState(AnonymousClass0hg anonymousClass0hg) {
        int size = anonymousClass0hg.f8513O.size();
        this.f17252H = new int[(size * 6)];
        if (anonymousClass0hg.f8500B) {
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                AnonymousClass0m9 anonymousClass0m9 = (AnonymousClass0m9) anonymousClass0hg.f8513O.get(i2);
                int i3 = i + 1;
                this.f17252H[i] = anonymousClass0m9.f9720B;
                int i4 = i3 + 1;
                this.f17252H[i3] = anonymousClass0m9.f9723E != null ? anonymousClass0m9.f9723E.mIndex : -1;
                i3 = i4 + 1;
                this.f17252H[i4] = anonymousClass0m9.f9721C;
                i4 = i3 + 1;
                this.f17252H[i3] = anonymousClass0m9.f9722D;
                i3 = i4 + 1;
                this.f17252H[i4] = anonymousClass0m9.f9724F;
                i = i3 + 1;
                this.f17252H[i3] = anonymousClass0m9.f9725G;
            }
            this.f17256L = anonymousClass0hg.f8519U;
            this.f17257M = anonymousClass0hg.f8520V;
            this.f17251G = anonymousClass0hg.f8512N;
            this.f17250F = anonymousClass0hg.f8510L;
            this.f17248D = anonymousClass0hg.f8504F;
            this.f17249E = anonymousClass0hg.f8505G;
            this.f17246B = anonymousClass0hg.f8502D;
            this.f17247C = anonymousClass0hg.f8503E;
            this.f17254J = anonymousClass0hg.f8517S;
            this.f17255K = anonymousClass0hg.f8518T;
            this.f17253I = anonymousClass0hg.f8516R;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public BackStackState(Parcel parcel) {
        this.f17252H = parcel.createIntArray();
        this.f17256L = parcel.readInt();
        this.f17257M = parcel.readInt();
        this.f17251G = parcel.readString();
        this.f17250F = parcel.readInt();
        this.f17248D = parcel.readInt();
        this.f17249E = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f17246B = parcel.readInt();
        this.f17247C = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f17254J = parcel.createStringArrayList();
        this.f17255K = parcel.createStringArrayList();
        this.f17253I = parcel.readInt() != 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f17252H);
        parcel.writeInt(this.f17256L);
        parcel.writeInt(this.f17257M);
        parcel.writeString(this.f17251G);
        parcel.writeInt(this.f17250F);
        parcel.writeInt(this.f17248D);
        TextUtils.writeToParcel(this.f17249E, parcel, 0);
        parcel.writeInt(this.f17246B);
        TextUtils.writeToParcel(this.f17247C, parcel, 0);
        parcel.writeStringList(this.f17254J);
        parcel.writeStringList(this.f17255K);
        parcel.writeInt(this.f17253I);
    }
}
