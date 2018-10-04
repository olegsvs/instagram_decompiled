package X;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import java.util.Set;

/* renamed from: X.0IB */
public final class AnonymousClass0IB implements AnonymousClass0Hz {
    public final boolean HLA() {
        return false;
    }

    /* renamed from: B */
    private static Bundle m2131B(Uri uri) {
        if ("inapp".equalsIgnoreCase(uri.getHost())) {
            Set queryParameterNames = uri.getQueryParameterNames();
            String str = IgReactNavigatorModule.URL;
            if (queryParameterNames.contains(str)) {
                Bundle bundle = new Bundle();
                bundle.putString("STARTING_URL", uri.getQueryParameter(str));
                return bundle;
            }
        }
        return null;
    }

    public final void jU(Bundle bundle, FragmentActivity fragmentActivity, AnonymousClass0Cn anonymousClass0Cn) {
        new AnonymousClass0he(fragmentActivity, anonymousClass0Cn, bundle.getString("STARTING_URL"), AnonymousClass0hf.BROWSER_URL_EXTERNAL_HANDLER).m6775A(bundle.getString("MEDIA_ID")).m6779E(bundle.getString("com.instagram.url.constants.ARGUMENTS_KEY_ANALYTICS_MODULE_NAME")).m6774D();
        fragmentActivity.finish();
    }

    public final Bundle oD(String str, AnonymousClass0Cn anonymousClass0Cn) {
        anonymousClass0Cn = Uri.parse(str);
        return "instagram".equalsIgnoreCase(anonymousClass0Cn.getScheme()) ? AnonymousClass0IB.m2131B(anonymousClass0Cn) : null;
    }
}
