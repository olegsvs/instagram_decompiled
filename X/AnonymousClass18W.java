package X;

import com.facebook.common.dextricks.StartupQEsConfig;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;

/* renamed from: X.18W */
public enum AnonymousClass18W {
    REPEAT_ERROR(false, true, true, true),
    RETRY_LATER_ERROR(false, false, true, true),
    BASIC_NETWORK_ERROR(false, true, true, true),
    INVALID_REPLY_NETWORK_ERROR(false, true, true, true),
    QUESTIONABLE_NETWORK_ERROR(true, true, true, true),
    ZERO_NETWORK_ERROR(r3, false, true, r6),
    AIRPLANE_MODE_ERROR(false, false, false, r20),
    UNEXPECTED_ERROR(r3, false, false, r6),
    TRANSIENT_SERVER_ERROR(false, true, true, r20),
    BLOCKING_SERVER_ERROR(r3, false, false, r6),
    MAY_RETRY_CLIENT_ERROR(false, false, false, r20),
    VIDEO_RENDER_ERROR(false, false, false, true),
    BAD_VIDEO_FILE(false, false, false, false),
    PERMANENT_CLIENT_ERROR(r3, false, false, false);
    
    /* renamed from: B */
    public final boolean f15001B;
    /* renamed from: C */
    public final boolean f15002C;
    /* renamed from: D */
    public final boolean f15003D;
    /* renamed from: E */
    public final boolean f15004E;

    /* renamed from: F */
    public static boolean m9620F(int i) {
        return i >= 400 && i < StartupQEsConfig.DEFAULT_IDLE_MAX_INTERVAL_MS;
    }

    /* renamed from: G */
    public static boolean m9621G(int i) {
        return i >= 300 && i <= 308;
    }

    /* renamed from: H */
    public static boolean m9622H(int i) {
        return i >= StartupQEsConfig.DEFAULT_IDLE_MAX_INTERVAL_MS && i < 600;
    }

    private AnonymousClass18W(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f15003D = z2;
        this.f15002C = z;
        this.f15001B = z3;
        this.f15004E = z4;
    }

    /* renamed from: B */
    public static AnonymousClass18W m9616B(int i) {
        if (i == 511) {
            return BLOCKING_SERVER_ERROR;
        }
        if (AnonymousClass18W.m9621G(i)) {
            return QUESTIONABLE_NETWORK_ERROR;
        }
        if (AnonymousClass18W.m9622H(i)) {
            return TRANSIENT_SERVER_ERROR;
        }
        if (AnonymousClass18W.m9620F(i)) {
            return MAY_RETRY_CLIENT_ERROR;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected status code ");
        stringBuilder.append(i);
        AnonymousClass0Gn.m1881H("ErrorType", stringBuilder.toString());
        return UNEXPECTED_ERROR;
    }

    /* renamed from: C */
    public static AnonymousClass18W m9617C(AnonymousClass0Pn anonymousClass0Pn, int i) {
        if (AnonymousClass18W.m9620F(i)) {
            if (!(i == 429 || "login_required".equals(anonymousClass0Pn.f4180F) || anonymousClass0Pn.m3907D())) {
                if (!anonymousClass0Pn.m3908E()) {
                    if (i == 422) {
                        return BAD_VIDEO_FILE;
                    }
                    if (i == 400) {
                        return PERMANENT_CLIENT_ERROR;
                    }
                    return MAY_RETRY_CLIENT_ERROR;
                }
            }
            return BLOCKING_SERVER_ERROR;
        } else if (AnonymousClass18W.m9622H(i)) {
            return TRANSIENT_SERVER_ERROR;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected IG Reply ");
            stringBuilder.append(i);
            stringBuilder.append(", ");
            stringBuilder.append(anonymousClass0Pn.m3905B());
            stringBuilder.append(", ");
            stringBuilder.append(anonymousClass0Pn.mo2585A());
            AnonymousClass0Gn.m1881H("ErrorType", stringBuilder.toString());
            return BLOCKING_SERVER_ERROR;
        }
    }

    /* renamed from: D */
    public static AnonymousClass18W m9618D(IOException iOException, AnonymousClass0Nr anonymousClass0Nr) {
        if (anonymousClass0Nr.m3469C()) {
            return AIRPLANE_MODE_ERROR;
        }
        if (iOException instanceof FileNotFoundException) {
            return MAY_RETRY_CLIENT_ERROR;
        }
        if (!(iOException instanceof UnknownHostException)) {
            if (anonymousClass0Nr.m3468B(false)) {
                return BASIC_NETWORK_ERROR;
            }
        }
        return ZERO_NETWORK_ERROR;
    }

    /* renamed from: E */
    public static AnonymousClass18W m9619E() {
        if (((Boolean) AnonymousClass0CC.nh.m845G()).booleanValue()) {
            return PERMANENT_CLIENT_ERROR;
        }
        return MAY_RETRY_CLIENT_ERROR;
    }
}
