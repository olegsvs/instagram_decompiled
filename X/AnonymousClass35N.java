package X;

import android.content.Context;
import android.os.Build.VERSION;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.C0164R;
import com.instagram.business.payments.PaymentsWebViewActivity;
import java.net.URLEncoder;

/* renamed from: X.35N */
public final class AnonymousClass35N {
    /* renamed from: B */
    public static final String f37681B = AnonymousClass0IE.E("%s/auth/token?next=", new Object[]{AnonymousClass1aX.C()});

    /* renamed from: B */
    public static void m18454B(Context context) {
        CookieManager instance = CookieManager.getInstance();
        if (VERSION.SDK_INT >= 21) {
            instance.removeAllCookies(null);
            return;
        }
        CookieSyncManager.createInstance(context);
        instance.removeAllCookie();
    }

    /* renamed from: C */
    public static String m18455C(String str, AnonymousClass0Ci anonymousClass0Ci) {
        return AnonymousClass0IE.E("/ads/billing?ig_user_id=%s&entry_point=%s", new Object[]{anonymousClass0Ci.getId(), str});
    }

    /* renamed from: D */
    public static void m18456D(Context context, String str, AnonymousClass0Cm anonymousClass0Cm) {
        StringBuilder stringBuilder;
        AnonymousClass0Ci B = anonymousClass0Cm.B();
        String C = AnonymousClass35N.m18455C(str, B);
        try {
            stringBuilder = new StringBuilder();
            stringBuilder.append(f37681B);
            stringBuilder.append(URLEncoder.encode(C, "utf-8"));
            C = stringBuilder.toString();
        } catch (Throwable e) {
            AnonymousClass0Gn.G("Couldn't encode payment url", e);
            stringBuilder = new StringBuilder();
            stringBuilder.append(AnonymousClass1aX.C());
            stringBuilder.append(C);
            C = stringBuilder.toString();
        }
        Context context2 = context;
        AnonymousClass35N.m18454B(context);
        stringBuilder = new StringBuilder();
        stringBuilder.append("access_token=");
        stringBuilder.append(AnonymousClass0a2.B(anonymousClass0Cm));
        AnonymousClass0IW.I(PaymentsWebViewActivity.m21681C(context2, AnonymousClass0rE.B(C, context), true, context.getString(C0164R.string.biz_payments), str.equals("PROMOTE"), stringBuilder.toString(), B), context);
    }
}
