package X;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.C0164R;

/* renamed from: X.3To */
public final class AnonymousClass3To {
    /* renamed from: B */
    public BroadcastReceiver f41545B;
    /* renamed from: C */
    public final IntentFilter f41546C = new IntentFilter();
    /* renamed from: D */
    private final AnonymousClass3Tn f41547D;

    public AnonymousClass3To(AnonymousClass3Tn anonymousClass3Tn) {
        this.f41547D = anonymousClass3Tn;
    }

    /* renamed from: B */
    public static void m19715B(AnonymousClass3To anonymousClass3To, Intent intent, Class cls, Activity activity) {
        if (intent == null) {
            intent = new Intent(activity, cls);
        }
        intent.addFlags(268533760);
        intent.putExtra("MainActivityAccountHelper.ACCOUNT_SWITCH_EVENT", true);
        intent.putExtra("MainActivityAccountHelper.STARTUP_TAB", anonymousClass3To.f41547D.CS());
        activity.finish();
        AnonymousClass0IW.I(intent, activity);
        activity.overridePendingTransition(C0164R.anim.fade_in_small_scale, C0164R.anim.fade_out);
    }
}
