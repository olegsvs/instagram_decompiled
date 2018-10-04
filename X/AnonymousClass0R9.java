package X;

import android.net.Uri;

/* renamed from: X.0R9 */
public enum AnonymousClass0R9 {
    SURFACE_TYPE_UNKNOWN("unknown"),
    SURFACE_TYPE_THREAD("thread");
    
    /* renamed from: B */
    private final String f4610B;

    private AnonymousClass0R9(String str) {
        this.f4610B = str;
    }

    /* renamed from: A */
    public final String m4115A() {
        return this.f4610B;
    }

    /* renamed from: B */
    public static AnonymousClass0R9 m4113B(String str) {
        if (SURFACE_TYPE_THREAD.f4610B.equals(str)) {
            return SURFACE_TYPE_THREAD;
        }
        return SURFACE_TYPE_UNKNOWN;
    }

    /* renamed from: C */
    public static AnonymousClass0R9 m4114C(Uri uri) {
        return AnonymousClass0R9.m4113B(uri.getQueryParameter("surface"));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Surface type = ");
        stringBuilder.append(this.f4610B);
        return stringBuilder.toString();
    }
}
