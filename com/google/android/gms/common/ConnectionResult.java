package com.google.android.gms.common;

import X.AnonymousClass1zC;
import X.AnonymousClass1zL;
import X.AnonymousClass1zk;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.facebook.forker.Process;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;
import org.webrtc.audio.WebRtcAudioRecord;

public final class ConnectionResult extends zza {
    public static final Creator CREATOR = new AnonymousClass1zk();
    /* renamed from: F */
    public static final ConnectionResult f15965F = new ConnectionResult(0);
    /* renamed from: B */
    public final PendingIntent f15966B;
    /* renamed from: C */
    public final int f15967C;
    /* renamed from: D */
    public final String f15968D;
    /* renamed from: E */
    private int f15969E;

    public ConnectionResult(int i) {
        this(i, null, null);
    }

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f15969E = i;
        this.f15967C = i2;
        this.f15966B = pendingIntent;
        this.f15968D = str;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    /* renamed from: B */
    public static String m10283B(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == StartupQEsConfig.DEFAULT_NON_CRITICAL_INEED_INIT_IDLE_DELAY) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case ParserMinimalBase.INT_CR /*13*/:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case Process.SIGCONT /*18*/:
                        return "SERVICE_UPDATING";
                    case Process.SIGSTOP /*19*/:
                        return "SERVICE_MISSING_PERMISSION";
                    case Process.SIGTSTP /*20*/:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder stringBuilder = new StringBuilder(31);
                        stringBuilder.append("UNKNOWN_ERROR_CODE(");
                        stringBuilder.append(i);
                        stringBuilder.append(")");
                        return stringBuilder.toString();
                }
        }
    }

    /* renamed from: A */
    public final boolean m10284A() {
        return (this.f15967C == 0 || this.f15966B == null) ? false : true;
    }

    /* renamed from: B */
    public final boolean m10285B() {
        return this.f15967C == 0;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ConnectionResult) {
                ConnectionResult connectionResult = (ConnectionResult) obj;
                if (this.f15967C == connectionResult.f15967C && AnonymousClass1zL.B(this.f15966B, connectionResult.f15966B) && AnonymousClass1zL.B(this.f15968D, connectionResult.f15968D)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15967C), this.f15966B, this.f15968D});
    }

    public final String toString() {
        return AnonymousClass1zL.C(this).A("statusCode", m10283B(this.f15967C)).A("resolution", this.f15966B).A("message", this.f15968D).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.S(parcel, 1, this.f15969E);
        AnonymousClass1zC.S(parcel, 2, this.f15967C);
        AnonymousClass1zC.G(parcel, 3, this.f15966B, i, false);
        AnonymousClass1zC.I(parcel, 4, this.f15968D, false);
        AnonymousClass1zC.B(parcel, U);
    }
}
