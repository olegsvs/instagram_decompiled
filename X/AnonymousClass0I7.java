package X;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import com.facebook.AccessToken;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;

/* renamed from: X.0I7 */
public final class AnonymousClass0I7 implements AnonymousClass0Hz {
    public final boolean HLA() {
        return false;
    }

    public final void jU(Bundle bundle, FragmentActivity fragmentActivity, AnonymousClass0Cn anonymousClass0Cn) {
        if (anonymousClass0Cn.xX()) {
            if (AnonymousClass0FL.m1559B(anonymousClass0Cn).m1037B().m989F()) {
                if (bundle.containsKey("fblogin_access_token")) {
                    String string = bundle.getString("fblogin_access_token");
                    String string2 = bundle.getString("fblogin_user_id");
                    if (!AnonymousClass0Ip.m2347B(string)) {
                        AnonymousClass2H3.B(AnonymousClass0FL.m1559B(anonymousClass0Cn), new AccessToken(string, string2));
                        Toast.makeText(fragmentActivity, "Facebook credentials have been saved.", 0).show();
                        fragmentActivity.finish();
                        return;
                    }
                    return;
                }
                AnonymousClass0IL K = AnonymousClass0Ir.f2848B.mo557A().m2369K("deeplink_unknown");
                K.getArguments().putString("IgSessionManager.USER_ID", AnonymousClass0FL.m1559B(anonymousClass0Cn).f1759C);
                AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(fragmentActivity);
                anonymousClass0IZ.f2754D = K;
                anonymousClass0IZ.m2308B();
                return;
            }
        }
        AnonymousClass0EQ.f1975B.m1399A(fragmentActivity, bundle);
    }

    public final Bundle oD(String str, AnonymousClass0Cn anonymousClass0Cn) {
        anonymousClass0Cn = Uri.parse(str);
        str = anonymousClass0Cn.getScheme();
        String host = anonymousClass0Cn.getHost();
        if (!"instagram".equalsIgnoreCase(str) || !"promote".equals(host)) {
            return null;
        }
        str = new Bundle();
        if (!AnonymousClass0CB.m834D() || !anonymousClass0Cn.getPath().equals("/fb_login")) {
            return str;
        }
        str.putString("fblogin_access_token", anonymousClass0Cn.getQueryParameter("access_token"));
        str.putString("fblogin_user_id", anonymousClass0Cn.getQueryParameter(MemoryDumpUploadJob.EXTRA_USER_ID));
        return str;
    }
}
