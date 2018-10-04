package X;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;

/* renamed from: X.3fE */
public final class AnonymousClass3fE {
    /* renamed from: B */
    public final AnonymousClass0IL f43124B;
    /* renamed from: C */
    private BroadcastReceiver f43125C;

    public AnonymousClass3fE(AnonymousClass0IL anonymousClass0IL) {
        this.f43124B = anonymousClass0IL;
    }

    /* renamed from: A */
    public final void m20349A() {
        if (this.f43125C != null) {
            this.f43124B.getActivity().unregisterReceiver(this.f43125C);
            this.f43125C = null;
        }
    }

    /* renamed from: B */
    public final void m20350B(AnonymousClass3fD anonymousClass3fD, Uri uri, String str) {
        Activity activity = this.f43124B.getActivity();
        if (m20348B(anonymousClass3fD)) {
            switch (anonymousClass3fD.ordinal()) {
                case 0:
                    AnonymousClass0g3.LayoutShortCutLaunchLayout.C();
                    AnonymousClass0EF.Q(this.f43124B, uri, 1);
                    break;
                case 1:
                    AnonymousClass0g3.BoomerangModalNuxAppSwitch.C();
                    AnonymousClass0EF.P(this.f43124B, 2);
                    break;
                default:
                    break;
            }
            return;
        }
        m20349A();
        this.f43125C = new AnonymousClass3fC(this, uri);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        activity.registerReceiver(this.f43125C, intentFilter);
        switch (anonymousClass3fD.ordinal()) {
            case 0:
                AnonymousClass0g3.LayoutShortcutLaunchPlayStore.C();
                AnonymousClass0EF.R(this.f43124B.getContext(), "com.instagram.layout", str);
                return;
            case 1:
                AnonymousClass0g3.BoomerangModalNuxLaunchPlayStore.C();
                AnonymousClass0EF.R(this.f43124B.getContext(), "com.instagram.boomerang", str);
                return;
            default:
                return;
        }
    }

    /* renamed from: B */
    private boolean m20348B(AnonymousClass3fD anonymousClass3fD) {
        Context activity = this.f43124B.getActivity();
        switch (anonymousClass3fD.ordinal()) {
            case 0:
                return AnonymousClass0EF.G(activity, "com.instagram.layout");
            case 1:
                return AnonymousClass0EF.G(activity, "com.instagram.boomerang");
            default:
                return false;
        }
    }
}
