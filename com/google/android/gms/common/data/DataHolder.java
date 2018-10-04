package com.google.android.gms.common.data;

import X.AnonymousClass1z8;
import X.AnonymousClass1zC;
import X.AnonymousClass2SY;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.io.Closeable;

@KeepName
public final class DataHolder extends zza implements Closeable {
    public static final Creator CREATOR = new AnonymousClass1z8();
    /* renamed from: B */
    public boolean f25001B = false;
    /* renamed from: C */
    public final String[] f25002C;
    /* renamed from: D */
    public Bundle f25003D;
    /* renamed from: E */
    public final CursorWindow[] f25004E;
    /* renamed from: F */
    public int[] f25005F;
    /* renamed from: G */
    private final Bundle f25006G;
    /* renamed from: H */
    private boolean f25007H = true;
    /* renamed from: I */
    private int f25008I;
    /* renamed from: J */
    private final int f25009J;

    static {
        AnonymousClass2SY anonymousClass2SY = new AnonymousClass2SY(new String[0], null);
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f25008I = i;
        this.f25002C = strArr;
        this.f25004E = cursorWindowArr;
        this.f25009J = i2;
        this.f25006G = bundle;
    }

    public final void close() {
        synchronized (this) {
            if (!this.f25001B) {
                this.f25001B = true;
                for (CursorWindow close : this.f25004E) {
                    close.close();
                }
            }
        }
    }

    public final void finalize() {
        try {
            if (this.f25007H && this.f25004E.length > 0) {
                boolean z;
                synchronized (this) {
                    z = this.f25001B;
                }
                if (!z) {
                    close();
                    String valueOf = String.valueOf(toString());
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 178);
                    stringBuilder.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                    stringBuilder.append(valueOf);
                    stringBuilder.append(")");
                    Log.e("DataBuffer", stringBuilder.toString());
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.m14073U(parcel);
        AnonymousClass1zC.m14067O(parcel, 1, this.f25002C, false);
        AnonymousClass1zC.m14066N(parcel, 2, this.f25004E, i, false);
        AnonymousClass1zC.m14071S(parcel, 3, this.f25009J);
        AnonymousClass1zC.m14056D(parcel, 4, this.f25006G, false);
        AnonymousClass1zC.m14071S(parcel, JsonMappingException.MAX_REFS_TO_LIST, this.f25008I);
        AnonymousClass1zC.m14054B(parcel, U);
    }
}
