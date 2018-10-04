package X;

import android.net.Uri;

/* renamed from: X.5kM */
public final class AnonymousClass5kM implements AnonymousClass1Tv {
    public AnonymousClass5kM(AnonymousClass0dC anonymousClass0dC) {
    }

    public final void DHA(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Hk anonymousClass0Hk, Uri uri, AnonymousClass0cL anonymousClass0cL) {
        anonymousClass0cL.f7098I = AnonymousClass0cA.FEED;
        anonymousClass0cL.f7096G = anonymousClass0Hk.xJ().G();
        uri.getQueryParameter("source");
        anonymousClass0Hk = uri.getQueryParameter("mode");
        anonymousClass0Cm = uri.getQueryParameter("effect_id");
        String queryParameter = uri.getQueryParameter("test_link_crypto_hash");
        anonymousClass0cL.f7091B = "quick_camera_startup_uri";
        anonymousClass0cL.f7094E = AnonymousClass0cD.B(anonymousClass0Hk);
        anonymousClass0cL.f7093D = anonymousClass0Cm;
        anonymousClass0cL.f7095F = queryParameter;
    }
}
