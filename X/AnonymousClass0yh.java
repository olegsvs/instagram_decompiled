package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0yh */
public enum AnonymousClass0yh {
    DEFAULT(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT),
    ARCHIVED("only_me");
    
    /* renamed from: F */
    private static final Map f12840F = null;
    /* renamed from: B */
    private final String f12841B;

    static {
        f12840F = new HashMap();
        AnonymousClass0yh[] values = AnonymousClass0yh.values();
        int length = values.length;
        int i;
        while (i < length) {
            AnonymousClass0yh anonymousClass0yh = values[i];
            f12840F.put(anonymousClass0yh.f12841B, anonymousClass0yh);
            i++;
        }
    }

    private AnonymousClass0yh(String str) {
        this.f12841B = str;
    }

    /* renamed from: A */
    public final String m8648A() {
        return this.f12841B;
    }

    /* renamed from: B */
    public static AnonymousClass0yh m8647B(String str) {
        return (AnonymousClass0yh) f12840F.get(str);
    }
}
