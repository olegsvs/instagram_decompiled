package X;

import android.net.Uri;

/* renamed from: X.5kL */
public final class AnonymousClass5kL implements AnonymousClass1Tv {
    public AnonymousClass5kL(AnonymousClass0dC anonymousClass0dC) {
    }

    public final void DHA(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Hk anonymousClass0Hk, Uri uri, AnonymousClass0cL anonymousClass0cL) {
        anonymousClass0cL.f7098I = AnonymousClass0cA.SEARCH;
        anonymousClass0cL.f7099J.putString("screen", uri.getHost());
        String str = "id";
        anonymousClass0cL.f7099J.putString(str, uri.getQueryParameter(str));
        anonymousClass0cL.f7099J.putString("IgSessionManager.USER_ID", anonymousClass0Cm.f1759C);
        String str2 = "type";
        String queryParameter = uri.getQueryParameter(str2);
        if (queryParameter == null) {
            queryParameter = "feed_channel";
        }
        anonymousClass0cL.f7099J.putString(str2, queryParameter);
    }
}
