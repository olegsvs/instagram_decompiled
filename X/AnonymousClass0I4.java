package X;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.0I4 */
public final class AnonymousClass0I4 implements AnonymousClass0Hz {
    public final boolean HLA() {
        return false;
    }

    /* renamed from: B */
    private static Bundle m2124B(Uri uri) {
        if (AnonymousClass0ID.m2133B(uri)) {
            uri = uri.getPathSegments();
            if (uri.size() >= 3) {
                if (AnonymousClass0Ia.EXPLORE.f2780C.equalsIgnoreCase((String) uri.get(0))) {
                    Object obj;
                    Bundle bundle;
                    String toLowerCase = ((String) uri.get(1)).toLowerCase();
                    if (!"tags".equals(toLowerCase)) {
                        if (!"locations".equals(toLowerCase)) {
                            obj = null;
                            if (obj == null) {
                                bundle = new Bundle();
                                bundle.putString("explore_type", (String) uri.get(1));
                                bundle.putString("explore_param", (String) uri.get(2));
                                return bundle;
                            }
                        }
                    }
                    obj = 1;
                    if (obj == null) {
                        bundle = new Bundle();
                        bundle.putString("explore_type", (String) uri.get(1));
                        bundle.putString("explore_param", (String) uri.get(2));
                        return bundle;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: C */
    private static Bundle m2125C(Uri uri) {
        String str = "tag";
        if (str.equals(uri.getHost())) {
            String str2 = "name";
            if (uri.getQueryParameterNames().contains(str2)) {
                String queryParameter = uri.getQueryParameter(str2);
                if (!TextUtils.isEmpty(queryParameter)) {
                    if (!queryParameter.contains(" ")) {
                        Bundle bundle = new Bundle();
                        bundle.putString("explore_type", str);
                        bundle.putString("explore_param", queryParameter);
                        return bundle;
                    }
                }
            }
        }
        return null;
    }

    public final void jU(Bundle bundle, FragmentActivity fragmentActivity, AnonymousClass0Cn anonymousClass0Cn) {
        if (anonymousClass0Cn.xX()) {
            AnonymousClass0IZ C;
            AnonymousClass0IL D;
            String str;
            Bundle arguments;
            AnonymousClass0Cm B = AnonymousClass0FL.m1559B(anonymousClass0Cn);
            String string = bundle.getString("explore_type");
            if (!"tags".equals(string)) {
                if (!"tag".equals(string)) {
                    if ("locations".equals(string)) {
                        C = new AnonymousClass0IZ(fragmentActivity).m2305C();
                        D = AnonymousClass0Ib.f2781B.mo613B().m2322D(bundle.getString("explore_param"), false, null);
                        str = B.f1759C;
                        arguments = D.getArguments();
                        arguments.putString("IgSessionManager.USER_ID", str);
                        D.setArguments(arguments);
                        C.f2754D = D;
                        C.m2308B();
                        return;
                    }
                    return;
                }
            }
            C = new AnonymousClass0IZ(fragmentActivity).m2305C();
            D = AnonymousClass3Qs.f41179B.A().A(new Hashtag(bundle.getString("explore_param")));
            str = B.f1759C;
            arguments = D.getArguments();
            arguments.putString("IgSessionManager.USER_ID", str);
            D.setArguments(arguments);
            C.f2754D = D;
            C.m2308B();
            return;
        }
        AnonymousClass0EQ.f1975B.m1399A(fragmentActivity, bundle);
    }

    public final Bundle oD(String str, AnonymousClass0Cn anonymousClass0Cn) {
        anonymousClass0Cn = Uri.parse(str);
        str = anonymousClass0Cn.getScheme();
        if (!"http".equalsIgnoreCase(str)) {
            if (!"https".equalsIgnoreCase(str)) {
                return "instagram".equalsIgnoreCase(str) ? AnonymousClass0I4.m2125C(anonymousClass0Cn) : null;
            }
        }
        return AnonymousClass0I4.m2124B(anonymousClass0Cn);
    }
}
