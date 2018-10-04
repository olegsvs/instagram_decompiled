package com.google.android.gms.common.api;

import X.AnonymousClass1yn;
import X.AnonymousClass1yy;
import X.AnonymousClass1z5;
import X.AnonymousClass1zC;
import X.AnonymousClass1zL;
import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;

public final class Status extends zza implements AnonymousClass1yy, ReflectedParcelable {
    public static final Creator CREATOR = new AnonymousClass1z5();
    /* renamed from: F */
    public static final Status f30573F = new Status(0);
    /* renamed from: G */
    public static final Status f30574G = new Status(14);
    /* renamed from: H */
    public static final Status f30575H = new Status(8);
    /* renamed from: I */
    public static final Status f30576I = new Status(15);
    /* renamed from: J */
    public static final Status f30577J = new Status(16);
    /* renamed from: B */
    public final int f30578B;
    /* renamed from: C */
    public final String f30579C;
    /* renamed from: D */
    private final PendingIntent f30580D;
    /* renamed from: E */
    private int f30581E;

    static {
        Status status = new Status(17);
        status = new Status(18);
    }

    public Status(int i) {
        this(i, null);
    }

    public Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f30581E = i;
        this.f30578B = i2;
        this.f30579C = str;
        this.f30580D = pendingIntent;
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    /* renamed from: A */
    public final boolean m15793A() {
        return this.f30580D != null;
    }

    /* renamed from: B */
    public final boolean m15794B() {
        return this.f30578B <= 0;
    }

    /* renamed from: C */
    public final void m15795C(Activity activity, int i) {
        if (m15793A()) {
            activity.startIntentSenderForResult(this.f30580D.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    /* renamed from: D */
    public final String m15796D() {
        String str = this.f30579C;
        return str != null ? str : AnonymousClass1yn.m13990B(this.f30578B);
    }

    public final Status HS() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Status) {
            Status status = (Status) obj;
            if (this.f30581E == status.f30581E && this.f30578B == status.f30578B && AnonymousClass1zL.m14085B(this.f30579C, status.f30579C) && AnonymousClass1zL.m14085B(this.f30580D, status.f30580D)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f30581E), Integer.valueOf(this.f30578B), this.f30579C, this.f30580D});
    }

    public final String toString() {
        return AnonymousClass1zL.m14086C(this).m14087A("statusCode", m15796D()).m14087A("resolution", this.f30580D).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.m14073U(parcel);
        AnonymousClass1zC.m14071S(parcel, 1, this.f30578B);
        AnonymousClass1zC.m14061I(parcel, 2, this.f30579C, false);
        AnonymousClass1zC.m14059G(parcel, 3, this.f30580D, i, false);
        AnonymousClass1zC.m14071S(parcel, JsonMappingException.MAX_REFS_TO_LIST, this.f30581E);
        AnonymousClass1zC.m14054B(parcel, U);
    }
}
