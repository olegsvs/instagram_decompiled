package X;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import java.util.List;
import java.util.Set;

/* renamed from: X.0I1 */
public final class AnonymousClass0I1 implements AnonymousClass0Hz {
    public final boolean HLA() {
        return false;
    }

    /* renamed from: B */
    private static String m2118B(String str, Uri uri) {
        Set queryParameterNames = uri.getQueryParameterNames();
        if ((queryParameterNames.contains("utm_medium") && uri.getQueryParameter("utm_medium").equalsIgnoreCase("email")) || str.equalsIgnoreCase("emaillogin")) {
            return "email";
        }
        String str2 = "utm_medium";
        return ((queryParameterNames.contains(str2) && uri.getQueryParameter(str2).equalsIgnoreCase("sms")) || str.equalsIgnoreCase("smslogin")) ? "sms" : null;
    }

    /* renamed from: C */
    private static Bundle m2119C(Uri uri) {
        Bundle bundle = null;
        if (AnonymousClass0ID.m2133B(uri)) {
            List pathSegments = uri.getPathSegments();
            if (pathSegments.size() == 2) {
                if ("_n".equalsIgnoreCase((String) pathSegments.get(0)) || "n".equalsIgnoreCase((String) pathSegments.get(0))) {
                    String str;
                    bundle = new Bundle();
                    String str2 = (String) pathSegments.get(1);
                    bundle.putString("destination_id", str2);
                    bundle.putString("encoded_query", uri.getEncodedQuery());
                    Set queryParameterNames = uri.getQueryParameterNames();
                    str2 = AnonymousClass0I1.m2118B(str2, uri);
                    if (queryParameterNames.contains("uid") && queryParameterNames.contains("token") && str2 != null) {
                        str = "uid";
                        bundle.putString(str, uri.getQueryParameter(str));
                        str = "token";
                        bundle.putString(str, uri.getQueryParameter(str));
                        bundle.putString("source", str2);
                    }
                    if (queryParameterNames.contains("auto_send")) {
                        str = "auto_send";
                        bundle.putString(str, uri.getQueryParameter(str));
                    }
                    if (queryParameterNames.contains("bypass")) {
                        str = "bypass";
                        bundle.putBoolean(str, uri.getBooleanQueryParameter(str, false));
                    }
                }
            }
        }
        return bundle;
    }

    /* renamed from: D */
    private static Bundle m2120D(Uri uri) {
        String host = uri.getHost();
        if (!(host.equalsIgnoreCase(AnonymousClass0Ia.MAIN_FEED.f2780C) || host.equalsIgnoreCase(AnonymousClass0Ia.EXPLORE.f2780C) || host.equalsIgnoreCase(AnonymousClass0Ia.NEWS_FEED.f2780C))) {
            if (!host.equalsIgnoreCase(AnonymousClass0Ia.SELF_PROFILE.f2780C)) {
                return null;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("destination_id", host);
        bundle.putString("encoded_query", uri.getEncodedQuery());
        return bundle;
    }

    public final void jU(Bundle bundle, FragmentActivity fragmentActivity, AnonymousClass0Cn anonymousClass0Cn) {
        if (!anonymousClass0Cn.xX()) {
            AnonymousClass0EQ.f1975B.m1399A(fragmentActivity, bundle);
        } else if (bundle.containsKey("uid") && bundle.containsKey("token") && bundle.containsKey("source")) {
            AnonymousClass0Cm B = AnonymousClass0FL.m1559B(anonymousClass0Cn);
            String C = AnonymousClass0IE.m2135C(bundle.getString("uid"));
            if (B.f1759C.equals(C)) {
                AnonymousClass0IX.m2258D(fragmentActivity, bundle);
            } else if (AnonymousClass0Cd.f1698B.m960D(C) != null) {
                AnonymousClass0IX.m2258D(fragmentActivity, bundle);
                AnonymousClass0IH.m2170D(fragmentActivity, B, AnonymousClass0Cd.f1698B.m960D(C), null);
            } else if (AnonymousClass0IF.m2151B()) {
                bundle.putBoolean("IS_ADD_ACCOUNT_FLOW", true);
                AnonymousClass0EQ.f1975B.m1399A(fragmentActivity, bundle);
            } else {
                AnonymousClass0IG.m2164F(AnonymousClass0IF.m2153D());
                fragmentActivity.finish();
            }
        } else {
            AnonymousClass0IX.m2258D(fragmentActivity, bundle);
        }
    }

    public final Bundle oD(String str, AnonymousClass0Cn anonymousClass0Cn) {
        anonymousClass0Cn = Uri.parse(str);
        str = anonymousClass0Cn.getScheme();
        if (!"https".equalsIgnoreCase(str)) {
            if (!"http".equalsIgnoreCase(str)) {
                return "instagram".equalsIgnoreCase(str) ? AnonymousClass0I1.m2120D(anonymousClass0Cn) : null;
            }
        }
        return AnonymousClass0I1.m2119C(anonymousClass0Cn);
    }
}
