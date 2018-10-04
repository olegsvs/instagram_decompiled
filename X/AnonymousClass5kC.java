package X;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.5kC */
public final class AnonymousClass5kC implements AnonymousClass1Tv {
    public AnonymousClass5kC(AnonymousClass0dC anonymousClass0dC) {
    }

    public final void DHA(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Hk anonymousClass0Hk, Uri uri, AnonymousClass0cL anonymousClass0cL) {
        anonymousClass0cL.f7099J.putString("screen", uri.getHost());
        if (uri.getQueryParameter("launch_reel_ids") != null) {
            anonymousClass0Cm = uri.getQueryParameter("launch_reel_ids");
            if (anonymousClass0Cm != null) {
                anonymousClass0cL.f7099J.putStringArrayList("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SELECTED_REEL_IDS", new ArrayList(Arrays.asList(anonymousClass0Cm.split(","))));
                anonymousClass0cL.f7099J.putString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_PUSH_NOTIF_TYPE", uri.getQueryParameter("push_category"));
            }
            anonymousClass0Cm = uri.getQueryParameter("media_id");
            if (anonymousClass0Cm != null) {
                anonymousClass0Hk = new HashMap(1);
                anonymousClass0Hk.put("media_id", anonymousClass0Cm);
                anonymousClass0cL.f7099J.putSerializable("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_MEDIA_REQUEST_PARAMS", anonymousClass0Hk);
            }
        }
        anonymousClass0cL.f7098I = AnonymousClass0cA.SEARCH;
    }
}
