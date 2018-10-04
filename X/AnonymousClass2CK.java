package X;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;

/* renamed from: X.2CK */
public final class AnonymousClass2CK {
    /* renamed from: B */
    public static Bundle m14647B(String str) {
        Bundle bundle;
        str = Uri.parse(str);
        String scheme = str.getScheme();
        if (!"http".equalsIgnoreCase(scheme)) {
            if (!"https".equalsIgnoreCase(scheme)) {
                if ("instagram".equals(scheme)) {
                    if ("tv".equalsIgnoreCase(str.getHost()) && str.getPathSegments().size() == 0) {
                        return new Bundle();
                    }
                }
                bundle = null;
                return bundle;
            }
        }
        bundle = AnonymousClass2CK.m14649D(str);
        return bundle;
    }

    /* renamed from: C */
    public static Bundle m14648C(String str) {
        str = Uri.parse(str);
        if ("instagram".equals(str.getScheme())) {
            if ("igtv_profile".equals(str.getHost()) && str.getPathSegments().size() == 0 && !TextUtils.isEmpty(str.getQuery())) {
                Bundle bundle = new Bundle();
                bundle.putString("igtv_profile_deeplink_user_id_arg", str.getQueryParameter(MemoryDumpUploadJob.EXTRA_USER_ID));
                Object queryParameter = str.getQueryParameter("media_id");
                if (TextUtils.isEmpty(queryParameter)) {
                    return bundle;
                }
                bundle.putString("igtv_deeplink_media_id_arg", queryParameter);
                return bundle;
            }
        }
        return null;
    }

    /* renamed from: D */
    private static Bundle m14649D(Uri uri) {
        Object obj;
        String host = uri.getHost();
        if (!"instagram.com".equalsIgnoreCase(host)) {
            if (!"www.instagram.com".equalsIgnoreCase(host)) {
                obj = null;
                if (obj != null) {
                    uri = uri.getPathSegments();
                    if (uri.size() != 2) {
                        if ("tv".equalsIgnoreCase((String) uri.get(0))) {
                            Bundle bundle = new Bundle();
                            bundle.putString("igtv_deeplink_short_url_arg", (String) uri.get(1));
                            return bundle;
                        }
                    }
                }
                return null;
            }
        }
        obj = 1;
        if (obj != null) {
            uri = uri.getPathSegments();
            if (uri.size() != 2) {
                if ("tv".equalsIgnoreCase((String) uri.get(0))) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("igtv_deeplink_short_url_arg", (String) uri.get(1));
                    return bundle2;
                }
            }
        }
        return null;
    }
}
