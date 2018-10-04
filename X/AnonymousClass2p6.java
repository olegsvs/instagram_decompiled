package X;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.2p6 */
public final class AnonymousClass2p6 {
    /* renamed from: B */
    public static String m17333B(String str) {
        if (str == null) {
            return JsonProperty.USE_DEFAULT_NAME;
        }
        str = str.split("\\.");
        return str.length != 6 ? JsonProperty.USE_DEFAULT_NAME : str[2];
    }

    /* renamed from: C */
    public static String m17334C(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(46);
        if (indexOf <= 0) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: D */
    public static boolean m17335D(String str) {
        if (!(str == null || str.equals(JsonProperty.USE_DEFAULT_NAME))) {
            if (!str.equals("0")) {
                return false;
            }
        }
        return true;
    }
}
