package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;

/* renamed from: X.3kl */
public final class AnonymousClass3kl implements AnonymousClass0Hz {
    public final boolean HLA() {
        return false;
    }

    public final void jU(Bundle bundle, FragmentActivity fragmentActivity, AnonymousClass0Cn anonymousClass0Cn) {
        if (anonymousClass0Cn.xX()) {
            Intent B = AnonymousClass0EM.f1972B.B(fragmentActivity, 335544320);
            Uri parse = Uri.parse("instagram://tv_viewer");
            Object string = bundle.getString("igtv_deeplink_short_url_arg");
            if (!TextUtils.isEmpty(string)) {
                parse = parse.buildUpon().appendQueryParameter("short_url", string).build();
            }
            B.setData(parse);
            AnonymousClass0IW.I(B, fragmentActivity);
            fragmentActivity.finish();
            return;
        }
        AnonymousClass0EQ.f1975B.A(fragmentActivity, bundle);
    }

    public final Bundle oD(String str, AnonymousClass0Cn anonymousClass0Cn) {
        return AnonymousClass2CK.m14647B(str);
    }
}
