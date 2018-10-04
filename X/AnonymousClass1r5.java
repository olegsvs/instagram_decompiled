package X;

import android.net.Uri;
import android.net.Uri.Builder;
import android.webkit.MimeTypeMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.1r5 */
public final class AnonymousClass1r5 {
    /* renamed from: B */
    private static final Set f23397B = new HashSet(Arrays.asList(new String[]{"www.facebook.com", "m.facebook.com", "facebook.com"}));
    /* renamed from: C */
    public static final List f23398C = new ArrayList(Arrays.asList(new String[]{"dialog/share", "share.php", "dialog/share_open_graph", "dialog/feed", "sharer.php"}));
    /* renamed from: D */
    private static final List f23399D = Arrays.asList(new String[]{"https", "http"});

    static {
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{"/home.php", "/login.php"}));
    }

    /* renamed from: B */
    public static boolean m13444B(String str, String str2) {
        boolean z = false;
        if (str2.endsWith(str)) {
            int length = str.length();
            int length2 = str2.length();
            if (length == length2) {
                return true;
            }
            if (str2.charAt((length2 - length) - 1) == '.') {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: C */
    public static String m13445C(String str) {
        str = AnonymousClass1r5.m13446D(str);
        Object obj = (str == null || !str.startsWith("image/")) ? null : 1;
        if (obj == null) {
            obj = (str == null || !(str.endsWith("/css") || str.endsWith("/javascript"))) ? null : 1;
            if (obj == null) {
                return null;
            }
        }
        return str;
    }

    /* renamed from: D */
    public static String m13446D(String str) {
        if (!AnonymousClass1r5.m13456N(str)) {
            str = MimeTypeMap.getFileExtensionFromUrl(str);
            if (!AnonymousClass1r5.m13456N(str)) {
                return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
            }
        }
        return JsonProperty.USE_DEFAULT_NAME;
    }

    /* renamed from: E */
    public static String m13447E(String str) {
        if (str != null) {
            if (str.length() >= 32) {
                try {
                    str = str.getBytes("utf-8");
                    try {
                        MessageDigest instance = MessageDigest.getInstance("MD5");
                        instance.update(str, 0, str.length);
                        return AnonymousClass012.B(instance.digest());
                    } catch (Throwable e) {
                        RuntimeException runtimeException = new RuntimeException(e);
                    } catch (Throwable e2) {
                        runtimeException = new RuntimeException(e2);
                    }
                } catch (Throwable e3) {
                    throw new RuntimeException(e3);
                }
            }
        }
        return str;
        throw runtimeException;
    }

    /* renamed from: F */
    public static Uri m13448F(String str, boolean z) {
        str = Uri.parse(str);
        return AnonymousClass1r5.m13451I(str, z) ? AnonymousClass1r5.m13455M(str) : null;
    }

    /* renamed from: G */
    public static boolean m13449G(Uri uri, List list) {
        if (uri != null) {
            if (f23397B.contains(uri.getHost())) {
                String encodedPath = uri.getEncodedPath();
                if (encodedPath != null) {
                    for (String contains : list) {
                        if (encodedPath.contains(contains)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: H */
    public static boolean m13450H(Uri uri) {
        return AnonymousClass1r5.m13451I(uri, false);
    }

    /* renamed from: I */
    public static boolean m13451I(Uri uri, boolean z) {
        if (uri == null) {
            return false;
        }
        if (uri.getScheme() == null) {
            return false;
        }
        String toLowerCase = uri.getScheme().toLowerCase(Locale.US);
        if (f23399D.contains(toLowerCase) || (z && "data".equals(toLowerCase))) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public static boolean m13452J(Uri uri) {
        if (uri == null) {
            return false;
        }
        String host = uri.getHost();
        if (host == null || host.startsWith("our.intern.") || !host.endsWith(".facebook.com")) {
            return false;
        }
        Object obj = (uri == null || !("http".equals(uri.getScheme()) || "https".equals(uri.getScheme()))) ? null : 1;
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public static boolean m13453K(String str) {
        if (str == null) {
            return false;
        }
        Object obj;
        String fileExtensionFromUrl;
        if (!str.startsWith("http://")) {
            if (!str.startsWith("https://")) {
                obj = null;
                if (obj == null) {
                    return false;
                }
                fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
                if ("css".equals(fileExtensionFromUrl) || "js".equals(fileExtensionFromUrl)) {
                    return true;
                }
                return false;
            }
        }
        obj = 1;
        if (obj == null) {
            return false;
        }
        fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (!"css".equals(fileExtensionFromUrl)) {
        }
        return true;
    }

    /* renamed from: L */
    public static boolean m13454L(Uri uri) {
        if (uri == null) {
            return false;
        }
        if (uri.getHost() == null) {
            return false;
        }
        if (uri.getHost().toLowerCase(Locale.US).endsWith(".facebook.com") || uri.getHost().toLowerCase(Locale.US).endsWith(".paypal.com")) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public static Uri m13455M(Uri uri) {
        if (uri == null || uri.getHost() == null || uri.getScheme() == null || ((!uri.getHost().toLowerCase(Locale.US).endsWith(".facebook.com") && !uri.getHost().toLowerCase(Locale.US).equals("facebook.com")) || uri.getHost().toLowerCase(Locale.US).startsWith("h.") || uri.getHost().toLowerCase(Locale.US).startsWith("l.") || !uri.getScheme().toLowerCase(Locale.US).equals("http"))) {
            return uri;
        }
        Builder buildUpon = uri.buildUpon();
        buildUpon.scheme("https");
        return buildUpon.build();
    }

    /* renamed from: N */
    private static boolean m13456N(String str) {
        if (str != null) {
            if (!JsonProperty.USE_DEFAULT_NAME.equals(str)) {
                return false;
            }
        }
        return true;
    }
}
