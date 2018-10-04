package X;

import android.net.Uri;

/* renamed from: X.5kQ */
public final class AnonymousClass5kQ implements AnonymousClass1Tv {
    public AnonymousClass5kQ(AnonymousClass0dC anonymousClass0dC) {
    }

    public final void DHA(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Hk anonymousClass0Hk, Uri uri, AnonymousClass0cL anonymousClass0cL) {
        anonymousClass0cL.f7099J.putString("screen", uri.getHost());
        anonymousClass0cL.f7099J.putString("CommentThreadFragment.MEDIA_ID", uri.getQueryParameter("media_id"));
        anonymousClass0cL.f7099J.putString("CommentThreadFragment.TARGET_COMMENT_ID", uri.getQueryParameter("target_comment_id"));
        anonymousClass0cL.f7099J.putBoolean("CommentThreadFragment.PERMALINK_ENABLED", uri.getBooleanQueryParameter("permalink_enabled", false));
        anonymousClass0cL.f7098I = AnonymousClass0cA.NEWS;
    }
}
