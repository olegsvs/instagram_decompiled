package com.google.android.gms.common;

import X.AnonymousClass0cQ;
import java.lang.ref.WeakReference;

public abstract class zzi extends zzg {
    /* renamed from: C */
    private static final WeakReference f15986C = new WeakReference(null);
    /* renamed from: B */
    private WeakReference f15987B = f15986C;

    public zzi(byte[] bArr) {
        super(bArr);
        int I = AnonymousClass0cQ.m5859I(this, -1091464010);
        AnonymousClass0cQ.m5858H(this, -907803036, I);
    }

    /* renamed from: B */
    public final byte[] mo2263B() {
        byte[] bArr;
        int I = AnonymousClass0cQ.m5859I(this, -85153238);
        synchronized (this) {
            try {
                bArr = (byte[]) this.f15987B.get();
                if (bArr == null) {
                    bArr = mo2264C();
                    this.f15987B = new WeakReference(bArr);
                }
            } finally {
                while (true) {
                }
                AnonymousClass0cQ.m5858H(this, -1211443439, I);
            }
        }
        return bArr;
    }

    /* renamed from: C */
    public abstract byte[] mo2264C();
}
