package X;

import android.content.Context;
import com.facebook.flexiblesampling.SamplingPolicyConfig;

/* renamed from: X.46L */
public final class AnonymousClass46L {
    public AnonymousClass46L(Context context, AnonymousClass0KW anonymousClass0KW, String str, SamplingPolicyConfig samplingPolicyConfig) {
        AnonymousClass46K anonymousClass46K = new AnonymousClass46K(context, str);
        if (samplingPolicyConfig != null) {
            AnonymousClass46J anonymousClass46J = new AnonymousClass46J(samplingPolicyConfig);
        }
    }
}
