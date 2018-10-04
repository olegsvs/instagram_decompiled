package com.google.android.gms.common;

import X.AnonymousClass0cQ;
import X.AnonymousClass1Ew;
import X.AnonymousClass1FB;
import android.util.Log;
import com.google.android.gms.common.internal.zzar;
import com.google.android.gms.common.internal.zzas;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public abstract class zzg extends zzas {
    /* renamed from: B */
    private int f15983B;

    public zzg(byte[] bArr) {
        int I = AnonymousClass0cQ.m5859I(this, 1156710129);
        if (bArr.length != 25) {
            int length = bArr.length;
            boolean z = false;
            String valueOf = String.valueOf(AnonymousClass1FB.m10305B(bArr, 0, bArr.length, false));
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 51);
            stringBuilder.append("Cert hash data has incorrect length (");
            stringBuilder.append(length);
            stringBuilder.append("):\n");
            stringBuilder.append(valueOf);
            Log.wtf("GoogleCertificates", stringBuilder.toString(), new Exception());
            bArr = Arrays.copyOfRange(bArr, 0, 25);
            if (bArr.length == 25) {
                z = true;
            }
            int length2 = bArr.length;
            stringBuilder = new StringBuilder(55);
            stringBuilder.append("cert hash data has incorrect length. length=");
            stringBuilder.append(length2);
            AnonymousClass1Ew.m10268F(z, stringBuilder.toString());
        }
        this.f15983B = Arrays.hashCode(bArr);
        AnonymousClass0cQ.m5858H(this, 1677693645, I);
    }

    /* renamed from: B */
    public static byte[] m10295B(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: B */
    public abstract byte[] mo2263B();

    public final IObjectWrapper VYA() {
        int I = AnonymousClass0cQ.m5859I(this, -1040990762);
        IObjectWrapper zzn = new zzn(mo2263B());
        AnonymousClass0cQ.m5858H(this, 657320127, I);
        return zzn;
    }

    public final int WYA() {
        int I = AnonymousClass0cQ.m5859I(this, 1038638023);
        int hashCode = hashCode();
        AnonymousClass0cQ.m5858H(this, -154595617, I);
        return hashCode;
    }

    public final boolean equals(Object obj) {
        int i;
        int I = AnonymousClass0cQ.m5859I(this, 64354333);
        if (obj != null) {
            if (obj instanceof zzar) {
                try {
                    zzar zzar = (zzar) obj;
                    if (zzar.WYA() != hashCode()) {
                        i = -88912107;
                    } else {
                        IObjectWrapper VYA = zzar.VYA();
                        if (VYA == null) {
                            i = -1294425262;
                        } else {
                            boolean equals = Arrays.equals(mo2263B(), (byte[]) zzn.m10306B(VYA));
                            AnonymousClass0cQ.m5858H(this, 245923688, I);
                            return equals;
                        }
                    }
                } catch (Throwable e) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                    i = -1201111647;
                }
                AnonymousClass0cQ.m5858H(this, i, I);
                return false;
            }
        }
        i = -1921363006;
        AnonymousClass0cQ.m5858H(this, i, I);
        return false;
    }

    public final int hashCode() {
        int I = AnonymousClass0cQ.m5859I(this, -1379481082);
        int i = this.f15983B;
        AnonymousClass0cQ.m5858H(this, 2012291889, I);
        return i;
    }
}
