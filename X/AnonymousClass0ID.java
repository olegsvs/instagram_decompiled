package X;

import android.net.Uri;

/* renamed from: X.0ID */
public final class AnonymousClass0ID {
    /* renamed from: B */
    public static boolean m2133B(Uri uri) {
        uri = uri.getHost();
        if (!"instagram.com".equalsIgnoreCase(uri)) {
            if (!"www.instagram.com".equalsIgnoreCase(uri)) {
                return false;
            }
        }
        return true;
    }
}
