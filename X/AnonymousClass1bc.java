package X;

import android.net.Uri;

/* renamed from: X.1bc */
public final class AnonymousClass1bc {
    /* renamed from: C */
    private static AnonymousClass1bc f20495C;
    /* renamed from: B */
    private final AnonymousClass0Ks f20496B;

    public AnonymousClass1bc() {
        AnonymousClass0Kq B = AnonymousClass0Kq.m2860B();
        B.f3132F = "VideoSubtitleFetcher";
        this.f20496B = B.m2861A();
    }

    /* renamed from: A */
    public final void m11997A(Uri uri) {
        AnonymousClass0GG.m1763B(this.f20496B, new AnonymousClass3pc(this, uri), 1887287391);
    }

    /* renamed from: B */
    public static AnonymousClass1bc m11996B() {
        if (f20495C == null) {
            f20495C = new AnonymousClass1bc();
        }
        return f20495C;
    }
}
