package X;

import com.facebook.video.common.livestreaming.LiveStreamingError;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.5ap */
public final class AnonymousClass5ap extends LiveStreamingError {
    public AnonymousClass5ap(String str, Exception exception) {
        this(str, null, (Throwable) exception);
    }

    public AnonymousClass5ap(String str, String str2) {
        this(str, str2, str2);
    }

    public AnonymousClass5ap(String str, String str2, String str3) {
        super(2010, str, str2, str3, JsonProperty.USE_DEFAULT_NAME, false, false, false);
    }

    public AnonymousClass5ap(String str, String str2, Throwable th) {
        String str3 = str2;
        if (str2 == null) {
            str3 = th != null ? th.getMessage() : JsonProperty.USE_DEFAULT_NAME;
        }
        String message = th != null ? th.getMessage() : JsonProperty.USE_DEFAULT_NAME;
        String th2 = (th == null || th.getCause() == null) ? JsonProperty.USE_DEFAULT_NAME : th.getCause().toString();
        super(2010, str, str3, message, th2, false, false, false);
    }
}
