package X;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import java.util.List;

/* renamed from: X.0I3 */
public final class AnonymousClass0I3 implements AnonymousClass0Hz {
    public final boolean HLA() {
        return false;
    }

    /* renamed from: B */
    private static Bundle m2123B(Uri uri) {
        if (AnonymousClass0ID.m2133B(uri)) {
            List pathSegments = uri.getPathSegments();
            if (pathSegments.size() == 2) {
                if ("s".equalsIgnoreCase((String) pathSegments.get(0))) {
                    Bundle bundle = new Bundle();
                    bundle.putString("com.instagram.url.constants.ARGUMENTS_KEY_REEL_SHORT_URL", uri.toString());
                    return bundle;
                }
            }
        }
        return null;
    }

    public final void jU(Bundle bundle, FragmentActivity fragmentActivity, AnonymousClass0Cn anonymousClass0Cn) {
        if (anonymousClass0Cn == null) {
            AnonymousClass0EQ.f1975B.m1399A(fragmentActivity, bundle);
        } else if (anonymousClass0Cn.xX()) {
            AnonymousClass0IL h = AnonymousClass0IY.m2265B().m2299h();
            bundle.putString("IgSessionManager.USER_ID", AnonymousClass0FL.m1559B(anonymousClass0Cn).f1759C);
            h.setArguments(bundle);
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(fragmentActivity);
            anonymousClass0IZ.f2754D = h;
            anonymousClass0IZ.m2305C().m2308B();
        } else {
            AnonymousClass0EQ.f1975B.m1399A(fragmentActivity, bundle);
        }
    }

    public final Bundle oD(String str, AnonymousClass0Cn anonymousClass0Cn) {
        anonymousClass0Cn = Uri.parse(str);
        str = anonymousClass0Cn.getScheme();
        if (!"https".equalsIgnoreCase(str)) {
            if (!"http".equalsIgnoreCase(str)) {
                return null;
            }
        }
        return AnonymousClass0I3.m2123B(anonymousClass0Cn);
    }
}
