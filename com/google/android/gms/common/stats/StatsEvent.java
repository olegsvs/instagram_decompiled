package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

public abstract class StatsEvent extends zza implements ReflectedParcelable {
    /* renamed from: A */
    public abstract int mo3056A();

    /* renamed from: B */
    public abstract long mo3057B();

    /* renamed from: C */
    public abstract long mo3058C();

    /* renamed from: D */
    public abstract String mo3059D();

    public final String toString() {
        long B = mo3057B();
        String str = "\t";
        String valueOf = String.valueOf(str);
        int A = mo3056A();
        String valueOf2 = String.valueOf(str);
        long C = mo3058C();
        String valueOf3 = String.valueOf(mo3059D());
        StringBuilder stringBuilder = new StringBuilder(((String.valueOf(valueOf).length() + 51) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append(B);
        stringBuilder.append(valueOf);
        stringBuilder.append(A);
        stringBuilder.append(valueOf2);
        stringBuilder.append(C);
        stringBuilder.append(valueOf3);
        return stringBuilder.toString();
    }
}
