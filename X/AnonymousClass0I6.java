package X;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.facebook.react.bridge.ReactContext;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.0I6 */
public final class AnonymousClass0I6 implements AnonymousClass0Hz {
    public final boolean HLA() {
        return false;
    }

    /* renamed from: B */
    private static void m2127B(AnonymousClass0Cn anonymousClass0Cn, String str, Bundle bundle) {
        ReactContext currentReactContext = AnonymousClass0Il.getInstance().getReactInstanceHolder().m2340C().getCurrentReactContext();
        if (currentReactContext != null) {
            FragmentActivity B = AnonymousClass0In.m2342B(currentReactContext.getCurrentActivity());
            if (B != null) {
                AnonymousClass0Il.getInstance().newReactNativeLauncher(anonymousClass0Cn, str).kQA(bundle).cVA(B).m2308B();
            }
        }
    }

    public final void jU(Bundle bundle, FragmentActivity fragmentActivity, AnonymousClass0Cn anonymousClass0Cn) {
        if (anonymousClass0Cn.xX()) {
            if (AnonymousClass0FL.m1559B(anonymousClass0Cn).m1037B().m989F()) {
                fragmentActivity.finish();
                AnonymousClass0I6.m2127B(anonymousClass0Cn, "AdsPaymentsPrepayPaymentStatusRoute", bundle);
                return;
            }
        }
        AnonymousClass0EQ.f1975B.m1399A(fragmentActivity, bundle);
    }

    public final Bundle oD(String str, AnonymousClass0Cn anonymousClass0Cn) {
        anonymousClass0Cn = Uri.parse(str);
        String scheme = anonymousClass0Cn.getScheme();
        String host = anonymousClass0Cn.getHost();
        if (!"instagram".equalsIgnoreCase(scheme) || !"ads_payments_prepay_payment_status".equals(host)) {
            return null;
        }
        str = new HashSet();
        Collections.addAll(str, new String[]{"account", "contextID", "paymentID"});
        Object hashSet = new HashSet();
        Collections.addAll(hashSet, new String[]{"originRootTag"});
        Bundle bundle = new Bundle();
        for (String scheme2 : anonymousClass0Cn.getQueryParameterNames()) {
            host = anonymousClass0Cn.getQueryParameter(scheme2);
            if (str.contains(scheme2)) {
                bundle.putString(scheme2, host);
            } else if (hashSet.contains(scheme2)) {
                bundle.putDouble(scheme2, Double.parseDouble(host));
            }
        }
        return bundle;
    }
}
