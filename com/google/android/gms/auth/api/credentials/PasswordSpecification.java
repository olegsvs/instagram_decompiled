package com.google.android.gms.auth.api.credentials;

import X.AnonymousClass1zC;
import X.AnonymousClass5f4;
import X.AnonymousClass5fB;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class PasswordSpecification extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new AnonymousClass5fB();
    /* renamed from: H */
    public static final PasswordSpecification f67938H;
    /* renamed from: B */
    private int f67939B;
    /* renamed from: C */
    private String f67940C;
    /* renamed from: D */
    private List f67941D;
    /* renamed from: E */
    private List f67942E;
    /* renamed from: F */
    private int f67943F;
    /* renamed from: G */
    private int f67944G;

    static {
        AnonymousClass5f4 anonymousClass5f4 = new AnonymousClass5f4();
        anonymousClass5f4.f67933B = 12;
        anonymousClass5f4.f67934C = 16;
        anonymousClass5f4.f67935D.addAll(AnonymousClass5f4.m28206B("abcdefghijkmnopqrstxyzABCDEFGHJKLMNPQRSTXY3456789", "allowedChars"));
        f67938H = anonymousClass5f4.m28207A("abcdefghijkmnopqrstxyz", 1).m28207A("ABCDEFGHJKLMNPQRSTXY", 1).m28207A("3456789", 1).m28208B();
        anonymousClass5f4 = new AnonymousClass5f4();
        anonymousClass5f4.f67933B = 12;
        anonymousClass5f4.f67934C = 16;
        anonymousClass5f4.f67935D.addAll(AnonymousClass5f4.m28206B("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890", "allowedChars"));
        anonymousClass5f4.m28207A("abcdefghijklmnopqrstuvwxyz", 1).m28207A("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 1).m28207A("1234567890", 1).m28208B();
    }

    public PasswordSpecification(int i, String str, List list, List list2, int i2, int i3) {
        this.f67939B = i;
        this.f67940C = str;
        this.f67941D = Collections.unmodifiableList(list);
        this.f67942E = Collections.unmodifiableList(list2);
        this.f67943F = i2;
        this.f67944G = i3;
        int[] iArr = new int[95];
        Arrays.fill(iArr, -1);
        int i4 = 0;
        for (String toCharArray : this.f67941D) {
            for (char c : toCharArray.toCharArray()) {
                iArr[c - 32] = i4;
            }
            i4++;
        }
        SecureRandom secureRandom = new SecureRandom();
    }

    /* renamed from: B */
    public static String m28209B(Collection collection) {
        char[] cArr = new char[collection.size()];
        int i = 0;
        for (Character charValue : collection) {
            int i2 = i + 1;
            cArr[i] = charValue.charValue();
            i = i2;
        }
        return new String(cArr);
    }

    /* renamed from: C */
    public static boolean m28210C(int i, int i2, int i3) {
        if (i >= 32) {
            if (i <= 126) {
                return false;
            }
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.I(parcel, 1, this.f67940C, false);
        AnonymousClass1zC.R(parcel, 2, this.f67941D, false);
        AnonymousClass1zC.J(parcel, 3, this.f67942E, false);
        AnonymousClass1zC.S(parcel, 4, this.f67943F);
        AnonymousClass1zC.S(parcel, 5, this.f67944G);
        AnonymousClass1zC.S(parcel, JsonMappingException.MAX_REFS_TO_LIST, this.f67939B);
        AnonymousClass1zC.B(parcel, U);
    }
}
