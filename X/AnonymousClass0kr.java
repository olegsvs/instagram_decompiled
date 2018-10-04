package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;

/* renamed from: X.0kr */
public final class AnonymousClass0kr {
    /* renamed from: B */
    public static AnonymousClass0ks m7217B(Activity activity) {
        return AnonymousClass0kr.m7218C(activity, null);
    }

    /* renamed from: C */
    public static AnonymousClass0ks m7218C(Activity activity, AnonymousClass0F8 anonymousClass0F8) {
        if (activity instanceof FragmentActivity) {
            return new AnonymousClass0ks(new AnonymousClass11H(((FragmentActivity) activity).mo382D(), anonymousClass0F8));
        }
        return null;
    }

    /* renamed from: D */
    public static boolean m7219D(String str, AnonymousClass0Pn anonymousClass0Pn) {
        if (!anonymousClass0Pn.m3908E()) {
            return false;
        }
        AnonymousClass0F4.f2058E.m1505B(new AnonymousClass3Oe(str, anonymousClass0Pn.f4190P, anonymousClass0Pn.f4188N, anonymousClass0Pn.f4186L, anonymousClass0Pn.f4185K, anonymousClass0Pn.f4187M, anonymousClass0Pn.f4191Q));
        return true;
    }

    /* renamed from: E */
    public static void m7220E(AnonymousClass0IU anonymousClass0IU, Bundle bundle) {
        if (!TextUtils.isEmpty(bundle.getString("feedback_message")) && anonymousClass0IU != null) {
            AnonymousClass0OR.m3624D(new Handler(), new AnonymousClass1VX(bundle, anonymousClass0IU), 1857376987);
        }
    }

    /* renamed from: F */
    public static void m7221F(AnonymousClass0IU anonymousClass0IU, String str, AnonymousClass0Pn anonymousClass0Pn) {
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("IgSessionManager.USER_ID", str);
        }
        bundle.putString("feedback_title", anonymousClass0Pn.f4190P);
        bundle.putString("feedback_message", anonymousClass0Pn.f4188N);
        bundle.putString("feedback_appeal_label", anonymousClass0Pn.f4186L);
        bundle.putString("feedback_action", anonymousClass0Pn.f4185K);
        bundle.putString("feedback_ignore_label", anonymousClass0Pn.f4187M);
        bundle.putString("feedback_url", anonymousClass0Pn.f4191Q);
        AnonymousClass0kr.m7220E(anonymousClass0IU, bundle);
    }
}
