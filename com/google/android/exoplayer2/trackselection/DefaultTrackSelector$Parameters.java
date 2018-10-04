package com.google.android.exoplayer2.trackselection;

import X.AnonymousClass2xz;
import X.AnonymousClass2yi;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class DefaultTrackSelector$Parameters implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2xz();
    /* renamed from: T */
    public static final DefaultTrackSelector$Parameters f36431T = new DefaultTrackSelector$Parameters();
    /* renamed from: B */
    public final boolean f36432B;
    /* renamed from: C */
    public final boolean f36433C;
    /* renamed from: D */
    public final int f36434D;
    /* renamed from: E */
    public final boolean f36435E;
    /* renamed from: F */
    public final boolean f36436F;
    /* renamed from: G */
    public final boolean f36437G;
    /* renamed from: H */
    public final int f36438H;
    /* renamed from: I */
    public final int f36439I;
    /* renamed from: J */
    public final int f36440J;
    /* renamed from: K */
    public final String f36441K;
    /* renamed from: L */
    public final String f36442L;
    /* renamed from: M */
    public final SparseBooleanArray f36443M;
    /* renamed from: N */
    public final boolean f36444N;
    /* renamed from: O */
    public final SparseArray f36445O;
    /* renamed from: P */
    public final int f36446P;
    /* renamed from: Q */
    public final int f36447Q;
    /* renamed from: R */
    public final boolean f36448R;
    /* renamed from: S */
    public final int f36449S;

    public final int describeContents() {
        return 0;
    }

    private DefaultTrackSelector$Parameters() {
        this(new SparseArray(), new SparseBooleanArray(), null, null, false, 0, false, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true, 0);
    }

    public DefaultTrackSelector$Parameters(Parcel parcel) {
        int readInt = parcel.readInt();
        SparseArray sparseArray = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            Map hashMap = new HashMap(readInt3);
            for (int i2 = 0; i2 < readInt3; i2++) {
                hashMap.put((TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader()), (DefaultTrackSelector$SelectionOverride) parcel.readParcelable(DefaultTrackSelector$SelectionOverride.class.getClassLoader()));
            }
            sparseArray.put(readInt2, hashMap);
        }
        this.f36445O = sparseArray;
        this.f36443M = parcel.readSparseBooleanArray();
        this.f36441K = parcel.readString();
        this.f36442L = parcel.readString();
        this.f36444N = AnonymousClass2yi.m18104Y(parcel);
        this.f36434D = parcel.readInt();
        this.f36437G = AnonymousClass2yi.m18104Y(parcel);
        this.f36432B = AnonymousClass2yi.m18104Y(parcel);
        this.f36433C = AnonymousClass2yi.m18104Y(parcel);
        this.f36440J = parcel.readInt();
        this.f36439I = parcel.readInt();
        this.f36438H = parcel.readInt();
        this.f36436F = AnonymousClass2yi.m18104Y(parcel);
        this.f36435E = AnonymousClass2yi.m18104Y(parcel);
        this.f36449S = parcel.readInt();
        this.f36447Q = parcel.readInt();
        this.f36448R = AnonymousClass2yi.m18104Y(parcel);
        this.f36446P = parcel.readInt();
    }

    public DefaultTrackSelector$Parameters(SparseArray sparseArray, SparseBooleanArray sparseBooleanArray, String str, String str2, boolean z, int i, boolean z2, boolean z3, boolean z4, int i2, int i3, int i4, boolean z5, boolean z6, int i5, int i6, boolean z7, int i7) {
        this.f36445O = sparseArray;
        this.f36443M = sparseBooleanArray;
        this.f36441K = AnonymousClass2yi.m18101V(str);
        this.f36442L = AnonymousClass2yi.m18101V(str2);
        this.f36444N = z;
        this.f36434D = i;
        this.f36437G = z2;
        this.f36432B = z3;
        this.f36433C = z4;
        this.f36440J = i2;
        this.f36439I = i3;
        this.f36438H = i4;
        this.f36436F = z5;
        this.f36435E = z6;
        this.f36449S = i5;
        this.f36447Q = i6;
        this.f36448R = z7;
        this.f36446P = i7;
    }

    /* renamed from: B */
    private static boolean m17994B(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray.size();
        if (sparseBooleanArray2.size() == size) {
            int i = 0;
            while (i < size) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) >= 0) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: C */
    private static boolean m17995C(SparseArray sparseArray, SparseArray sparseArray2) {
        int size = sparseArray.size();
        if (sparseArray2.size() == size) {
            int i = 0;
            while (i < size) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (indexOfKey >= 0) {
                    if (m17996D((Map) sparseArray.valueAt(i), (Map) sparseArray2.valueAt(indexOfKey))) {
                        i++;
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: D */
    private static boolean m17996D(Map map, Map map2) {
        if (map2.size() == map.size()) {
            for (Entry entry : map.entrySet()) {
                TrackGroupArray trackGroupArray = (TrackGroupArray) entry.getKey();
                if (map2.containsKey(trackGroupArray)) {
                    if (!AnonymousClass2yi.m18082C(entry.getValue(), map2.get(trackGroupArray))) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    DefaultTrackSelector$Parameters defaultTrackSelector$Parameters = (DefaultTrackSelector$Parameters) obj;
                    if (this.f36444N != defaultTrackSelector$Parameters.f36444N || this.f36434D != defaultTrackSelector$Parameters.f36434D || this.f36437G != defaultTrackSelector$Parameters.f36437G || this.f36432B != defaultTrackSelector$Parameters.f36432B || this.f36433C != defaultTrackSelector$Parameters.f36433C || this.f36440J != defaultTrackSelector$Parameters.f36440J || this.f36439I != defaultTrackSelector$Parameters.f36439I || this.f36436F != defaultTrackSelector$Parameters.f36436F || this.f36435E != defaultTrackSelector$Parameters.f36435E || this.f36448R != defaultTrackSelector$Parameters.f36448R || this.f36449S != defaultTrackSelector$Parameters.f36449S || this.f36447Q != defaultTrackSelector$Parameters.f36447Q || this.f36438H != defaultTrackSelector$Parameters.f36438H || this.f36446P != defaultTrackSelector$Parameters.f36446P || !TextUtils.equals(this.f36441K, defaultTrackSelector$Parameters.f36441K) || !TextUtils.equals(this.f36442L, defaultTrackSelector$Parameters.f36442L) || !m17994B(this.f36443M, defaultTrackSelector$Parameters.f36443M) || !m17995C(this.f36445O, defaultTrackSelector$Parameters.f36445O)) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((this.f36444N * 31) + this.f36434D) * 31) + this.f36437G) * 31) + this.f36432B) * 31) + this.f36433C) * 31) + this.f36440J) * 31) + this.f36439I) * 31) + this.f36436F) * 31) + this.f36435E) * 31) + this.f36448R) * 31) + this.f36449S) * 31) + this.f36447Q) * 31) + this.f36438H) * 31) + this.f36446P) * 31) + this.f36441K.hashCode()) * 31) + this.f36442L.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        SparseArray sparseArray = this.f36445O;
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            Map map = (Map) sparseArray.valueAt(i2);
            int size2 = map.size();
            parcel.writeInt(keyAt);
            parcel.writeInt(size2);
            for (Entry entry : map.entrySet()) {
                parcel.writeParcelable((Parcelable) entry.getKey(), 0);
                parcel.writeParcelable((Parcelable) entry.getValue(), 0);
            }
        }
        parcel.writeSparseBooleanArray(this.f36443M);
        parcel.writeString(this.f36441K);
        parcel.writeString(this.f36442L);
        parcel.writeInt(this.f36444N);
        parcel.writeInt(this.f36434D);
        parcel.writeInt(this.f36437G);
        parcel.writeInt(this.f36432B);
        parcel.writeInt(this.f36433C);
        parcel.writeInt(this.f36440J);
        parcel.writeInt(this.f36439I);
        parcel.writeInt(this.f36438H);
        parcel.writeInt(this.f36436F);
        parcel.writeInt(this.f36435E);
        parcel.writeInt(this.f36449S);
        parcel.writeInt(this.f36447Q);
        parcel.writeInt(this.f36448R);
        parcel.writeInt(this.f36446P);
    }
}
