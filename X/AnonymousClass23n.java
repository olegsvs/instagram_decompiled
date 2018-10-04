package X;

import android.content.ContentResolver;
import android.net.Uri;

/* renamed from: X.23n */
public final class AnonymousClass23n implements AnonymousClass0RE {
    /* renamed from: B */
    private final ContentResolver f25528B;
    /* renamed from: C */
    private final String f25529C;
    /* renamed from: D */
    private final Uri f25530D;
    /* renamed from: E */
    private final String f25531E;

    public final boolean isStreaming() {
        return true;
    }

    public AnonymousClass23n(ContentResolver contentResolver, Uri uri, String str, String str2) {
        this.f25528B = contentResolver;
        this.f25530D = uri;
        this.f25531E = str;
        this.f25529C = str2;
    }

    public final void FC(String str, AnonymousClass18s anonymousClass18s) {
        anonymousClass18s.A(str, new AnonymousClass1Zz(this.f25528B, this.f25530D, this.f25531E, this.f25529C));
    }
}
