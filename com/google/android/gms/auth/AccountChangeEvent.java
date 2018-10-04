package com.google.android.gms.auth;

import X.AnonymousClass1Ew;
import X.AnonymousClass1zC;
import X.AnonymousClass1zL;
import X.AnonymousClass5fS;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;

public class AccountChangeEvent extends zza {
    public static final Creator CREATOR = new AnonymousClass5fS();
    /* renamed from: B */
    private int f67852B;
    /* renamed from: C */
    private long f67853C;
    /* renamed from: D */
    private String f67854D;
    /* renamed from: E */
    private int f67855E;
    /* renamed from: F */
    private int f67856F;
    /* renamed from: G */
    private String f67857G;

    public AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.f67852B = i;
        this.f67853C = j;
        this.f67854D = (String) AnonymousClass1Ew.I(str);
        this.f67855E = i2;
        this.f67856F = i3;
        this.f67857G = str2;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AccountChangeEvent) {
                AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
                if (this.f67852B == accountChangeEvent.f67852B && this.f67853C == accountChangeEvent.f67853C && AnonymousClass1zL.B(this.f67854D, accountChangeEvent.f67854D) && this.f67855E == accountChangeEvent.f67855E && this.f67856F == accountChangeEvent.f67856F && AnonymousClass1zL.B(this.f67857G, accountChangeEvent.f67857G)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f67852B), Long.valueOf(this.f67853C), this.f67854D, Integer.valueOf(this.f67855E), Integer.valueOf(this.f67856F), this.f67857G});
    }

    public final String toString() {
        String str = "UNKNOWN";
        switch (this.f67855E) {
            case 1:
                str = "ADDED";
                break;
            case 2:
                str = "REMOVED";
                break;
            case 3:
                str = "RENAMED_FROM";
                break;
            case 4:
                str = "RENAMED_TO";
                break;
            default:
                break;
        }
        String str2 = this.f67854D;
        String str3 = this.f67857G;
        int i = this.f67856F;
        StringBuilder stringBuilder = new StringBuilder(((String.valueOf(str2).length() + 91) + String.valueOf(str).length()) + String.valueOf(str3).length());
        stringBuilder.append("AccountChangeEvent {accountName = ");
        stringBuilder.append(str2);
        stringBuilder.append(", changeType = ");
        stringBuilder.append(str);
        stringBuilder.append(", changeData = ");
        stringBuilder.append(str3);
        stringBuilder.append(", eventIndex = ");
        stringBuilder.append(i);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.S(parcel, 1, this.f67852B);
        AnonymousClass1zC.C(parcel, 2, this.f67853C);
        AnonymousClass1zC.I(parcel, 3, this.f67854D, false);
        AnonymousClass1zC.S(parcel, 4, this.f67855E);
        AnonymousClass1zC.S(parcel, 5, this.f67856F);
        AnonymousClass1zC.I(parcel, 6, this.f67857G, false);
        AnonymousClass1zC.B(parcel, U);
    }
}
