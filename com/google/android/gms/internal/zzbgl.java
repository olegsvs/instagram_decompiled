package com.google.android.gms.internal;

import X.AnonymousClass20q;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public abstract class zzbgl extends AnonymousClass20q implements SafeParcelable {
    /* renamed from: C */
    public Object mo3127C(String str) {
        return null;
    }

    /* renamed from: D */
    public boolean mo3128D(String str) {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().isInstance(obj)) {
                AnonymousClass20q anonymousClass20q = (AnonymousClass20q) obj;
                for (zzbgj zzbgj : mo3543E().values()) {
                    if (m14165A(zzbgj)) {
                        if (anonymousClass20q.m14165A(zzbgj)) {
                            if (m14166B(zzbgj).equals(anonymousClass20q.m14166B(zzbgj))) {
                            }
                        }
                    } else if (anonymousClass20q.m14165A(zzbgj)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (zzbgj zzbgj : mo3543E().values()) {
            if (m14165A(zzbgj)) {
                i = (i * 31) + m14166B(zzbgj).hashCode();
            }
        }
        return i;
    }
}
