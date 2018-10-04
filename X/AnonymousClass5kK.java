package X;

import android.net.Uri;

/* renamed from: X.5kK */
public final class AnonymousClass5kK implements AnonymousClass1Tv {
    public AnonymousClass5kK(AnonymousClass0dC anonymousClass0dC) {
    }

    public final void DHA(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Hk anonymousClass0Hk, Uri uri, AnonymousClass0cL anonymousClass0cL) {
        AnonymousClass0dC.D(anonymousClass0cL);
        anonymousClass0cL.f7099J.putString("screen", uri.getHost());
        anonymousClass0Cm = "nonce";
        anonymousClass0cL.f7099J.putString(anonymousClass0Cm, uri.getQueryParameter(anonymousClass0Cm));
        anonymousClass0Cm = "encoded_email";
        anonymousClass0cL.f7099J.putString(anonymousClass0Cm, uri.getQueryParameter(anonymousClass0Cm));
    }
}
