package X;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.facebook.proxygen.TraceFieldType;
import java.util.List;

/* renamed from: X.0I9 */
public final class AnonymousClass0I9 implements AnonymousClass0Hz {
    public final boolean HLA() {
        return false;
    }

    /* renamed from: B */
    private static Bundle m2130B(Uri uri, AnonymousClass0Cn anonymousClass0Cn) {
        if (!"ig.me".equalsIgnoreCase(uri.getHost())) {
            return null;
        }
        Bundle bundle = new Bundle();
        List pathSegments = uri.getPathSegments();
        if (!pathSegments.isEmpty()) {
            String str = (String) pathSegments.get(0);
            if ("w".equalsIgnoreCase(str)) {
                bundle.putBoolean("should_land_on_web", true);
                bundle.putParcelable(TraceFieldType.Uri, uri);
                return bundle;
            } else if (pathSegments.size() <= 1 || !"p".equalsIgnoreCase((String) pathSegments.get(1))) {
                bundle.putString("destination", str);
                if (pathSegments.size() > 1) {
                    bundle.putString("parameter", (String) pathSegments.get(1));
                }
            } else {
                AnonymousClass0IX.m2263I(uri, "IgMeExternalUrlHandler");
                if (AnonymousClass0IX.m2257C(anonymousClass0Cn)) {
                    bundle.putString("destination", "p");
                    if (pathSegments.size() > 2) {
                        bundle.putString("parameter", (String) pathSegments.get(2));
                    }
                }
            }
        }
        bundle.putString("short_url", uri.toString());
        bundle.putString("encoded_query", uri.getEncodedQuery());
        return bundle;
    }

    public final void jU(Bundle bundle, FragmentActivity fragmentActivity, AnonymousClass0Cn anonymousClass0Cn) {
        Uri uri = (Uri) bundle.getParcelable(TraceFieldType.Uri);
        if (uri == null || !bundle.getBoolean("should_land_on_web")) {
            String string = bundle.getString("destination");
            Object string2 = bundle.getString("parameter");
            if ("p".equalsIgnoreCase(string)) {
                if (TextUtils.isEmpty(string2)) {
                    bundle.putString("destination_id", AnonymousClass0Ia.MAIN_FEED.f2780C);
                    AnonymousClass0IX.m2258D(fragmentActivity, bundle);
                } else {
                    bundle.putString("com.instagram.url.constants.ARGUMENTS_KEY_MEDIA_SHORT_URL", Uri.parse(AnonymousClass0IE.m2137E("https://instagram.com/p/%s", string2)).toString());
                    AnonymousClass0IX.m2259E(anonymousClass0Cn, fragmentActivity, bundle);
                }
            } else if ("u".equalsIgnoreCase(string)) {
                if (!TextUtils.isEmpty(string2)) {
                    bundle.putString("UserDetailFragment.EXTRA_USER_NAME", string2);
                }
                AnonymousClass0IX.m2260F(anonymousClass0Cn, fragmentActivity, bundle);
            } else if ("e".equalsIgnoreCase(string)) {
                bundle.putString("destination_id", AnonymousClass0Ia.EXPLORE.f2780C);
                AnonymousClass0IX.m2258D(fragmentActivity, bundle);
            } else if ("n".equalsIgnoreCase(string)) {
                bundle.putString("destination_id", AnonymousClass0Ia.NEWS_FEED.f2780C);
                AnonymousClass0IX.m2258D(fragmentActivity, bundle);
            } else {
                bundle.putString("com.instagram.android.fragment.ARGUMENTS_KEY_SHORT_CODE", string);
                AnonymousClass0IL W = AnonymousClass0IY.m2265B().m2288W();
                if (anonymousClass0Cn.xX()) {
                    bundle.putString("IgSessionManager.USER_ID", AnonymousClass0FL.m1559B(anonymousClass0Cn).f1759C);
                }
                W.setArguments(bundle);
                AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(fragmentActivity);
                anonymousClass0IZ.f2754D = W;
                anonymousClass0IZ.m2305C().m2308B();
            }
            return;
        }
        AnonymousClass0IX.m2262H(fragmentActivity, anonymousClass0Cn, uri, bundle.getString("com.instagram.url.constants.ARGUMENTS_KEY_ANALYTICS_MODULE_NAME"));
        fragmentActivity.finish();
    }

    public final Bundle oD(String str, AnonymousClass0Cn anonymousClass0Cn) {
        str = Uri.parse(str);
        String scheme = str.getScheme();
        if (!"http".equalsIgnoreCase(scheme)) {
            if (!"https".equalsIgnoreCase(scheme)) {
                return null;
            }
        }
        return AnonymousClass0I9.m2130B(str, anonymousClass0Cn);
    }
}
