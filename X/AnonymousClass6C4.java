package X;

import android.net.Uri;

/* renamed from: X.6C4 */
public final class AnonymousClass6C4 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6Cs f72866B;

    public AnonymousClass6C4(AnonymousClass6Cs anonymousClass6Cs) {
        this.f72866B = anonymousClass6Cs;
    }

    /* renamed from: A */
    public final void m29407A(AnonymousClass5dW anonymousClass5dW, Uri uri) {
        if (uri != null) {
            String uri2 = uri.toString();
            if (!AnonymousClass0Ip.B(uri2)) {
                if (uri2.startsWith("https://www.facebook.com/tr/?")) {
                    anonymousClass5dW = this.f72866B;
                    AnonymousClass6Cq.m29461C().m29466B(anonymousClass5dW.f72967B.f68157C, AnonymousClass5dF.PIXEL_EVENT, new AnonymousClass5gu(anonymousClass5dW, uri.getQueryParameter("ev"), uri.getQueryParameter("id")));
                }
            }
        }
    }
}
