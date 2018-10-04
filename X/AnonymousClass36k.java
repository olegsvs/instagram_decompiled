package X;

import com.instagram.realtimeclient.RealtimeConstants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.36k */
public enum AnonymousClass36k {
    LIVE("live"),
    PRECAPTURE_PHOTO("precapture_photo"),
    PRECAPTURE_VIDEO("precapture_video"),
    POSTCAPTURE_PHOTO("postcapture_photo"),
    POSTCAPTURE_VIDEO("postcapture_video"),
    DIRECT(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
    
    /* renamed from: J */
    private static final Map f37908J = null;
    /* renamed from: B */
    private final String f37909B;

    static {
        f37908J = new HashMap();
        AnonymousClass36k[] values = AnonymousClass36k.values();
        int length = values.length;
        int i;
        while (i < length) {
            AnonymousClass36k anonymousClass36k = values[i];
            f37908J.put(anonymousClass36k.f37909B, anonymousClass36k);
            i++;
        }
    }

    private AnonymousClass36k(String str) {
        this.f37909B = str;
    }

    /* renamed from: B */
    public static AnonymousClass36k m18541B(String str) {
        return str != null ? (AnonymousClass36k) f37908J.get(str.toLowerCase()) : null;
    }

    public final String toString() {
        return this.f37909B;
    }
}
