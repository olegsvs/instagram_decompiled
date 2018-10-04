package X;

import android.net.Uri;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.5kW */
public final class AnonymousClass5kW implements AnonymousClass1Tv {
    public AnonymousClass5kW(AnonymousClass0dC anonymousClass0dC) {
    }

    public final void DHA(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Hk anonymousClass0Hk, Uri uri, AnonymousClass0cL anonymousClass0cL) {
        anonymousClass0cL.f7098I = AnonymousClass0cA.FEED;
        anonymousClass0cL.f7099J.putString("screen", uri.getHost());
        anonymousClass0cL.f7099J.putString("IgSessionManager.USER_ID", anonymousClass0Cm.f1759C);
        anonymousClass0Hk = uri.getScheme();
        anonymousClass0Cm = uri.getHost();
        String queryParameter = uri.getQueryParameter("vc_id");
        String queryParameter2 = uri.getQueryParameter("esi");
        String queryParameter3 = uri.getQueryParameter("surface_id");
        String queryParameter4 = uri.getQueryParameter("surface");
        String queryParameter5 = uri.getQueryParameter("push_notification_id");
        String queryParameter6 = uri.getQueryParameter("caller");
        if (queryParameter6 == null) {
            queryParameter6 = JsonProperty.USE_DEFAULT_NAME;
        }
        String str = JsonProperty.USE_DEFAULT_NAME;
        try {
            String queryParameter7 = uri.getQueryParameter("group_details");
            if (queryParameter7 == null) {
                queryParameter7 = JsonProperty.USE_DEFAULT_NAME;
            }
            str = queryParameter7;
        } catch (Throwable e) {
            AnonymousClass0Gn.E("AppStartupUtil", "Failed to decode group info from notification URI", e);
        }
        Object obj = (queryParameter == null || queryParameter2 == null || queryParameter3 == null || !"ig".equalsIgnoreCase(anonymousClass0Hk) || !"vc".equalsIgnoreCase(anonymousClass0Cm)) ? null : 1;
        if (obj != null) {
            anonymousClass0cL.f7099J.putString("vc_id", queryParameter);
            anonymousClass0cL.f7099J.putString("esi", queryParameter2);
            anonymousClass0cL.f7099J.putString("surface_id", queryParameter3);
            anonymousClass0cL.f7099J.putString("surface", queryParameter4);
            anonymousClass0cL.f7099J.putString("push_notification_id", queryParameter5);
            anonymousClass0cL.f7099J.putString("caller", queryParameter6);
            anonymousClass0cL.f7099J.putString("group_details", str);
            anonymousClass0cL.f7099J.putBoolean("missed_call", Boolean.TRUE.toString().equals(uri.getQueryParameter("missed_call")));
        }
    }
}
