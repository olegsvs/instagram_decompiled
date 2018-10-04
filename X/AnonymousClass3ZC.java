package X;

import com.facebook.common.dextricks.StartupQEsConfig;
import org.apache.http.client.HttpResponseException;

/* renamed from: X.3ZC */
public final class AnonymousClass3ZC {
    /* renamed from: B */
    public static boolean m20010B(Throwable th) {
        Throwable cause = th.getCause();
        if (!(cause instanceof HttpResponseException)) {
            return false;
        }
        int statusCode = ((HttpResponseException) cause).getStatusCode();
        if (400 > statusCode || statusCode >= StartupQEsConfig.DEFAULT_IDLE_MAX_INTERVAL_MS) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public static String m20011C(Throwable th) {
        if (th.getCause() != null) {
            if (th != th.getCause()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(th.getMessage());
                stringBuilder.append("|");
                stringBuilder.append(AnonymousClass3ZC.m20011C(th.getCause()));
                return stringBuilder.toString();
            }
        }
        return th.getMessage();
    }
}
