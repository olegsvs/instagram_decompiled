package com.instagram.debug.devoptions.api;

import X.AnonymousClass0Cm;
import X.AnonymousClass0Dc;
import X.AnonymousClass0IU;
import X.AnonymousClass0IZ;
import X.AnonymousClass237;
import X.AnonymousClass2D6;
import X.AnonymousClass2DC;
import X.AnonymousClass2DD;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class DeveloperOptionsLauncher {
    public static void launchDevoptionsMenu(FragmentActivity fragmentActivity, Bundle bundle) {
        try {
            DeveloperOptionsPlugin.setInstance((DeveloperOptionsPlugin) Class.forName("com.instagram.debug.devoptions.DeveloperOptionsPluginImpl").newInstance());
            if (bundle == null) {
                AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(fragmentActivity);
                anonymousClass0IZ.f2754D = DeveloperOptionsPlugin.getInstance().getDeveloperOptionsFragment();
                anonymousClass0IZ.m2308B();
                return;
            }
            AnonymousClass0IZ.m2304B(new AnonymousClass0IZ(fragmentActivity).m2312F(DeveloperOptionsPlugin.getInstance().getDeveloperOptionsFragment(), bundle).m2305C(), AnonymousClass237.f25448C);
        } catch (FragmentActivity fragmentActivity2) {
            AnonymousClass0Dc.m1240C(DeveloperOptionsLauncher.class, "Can't find DeveloperOptionsFragment", fragmentActivity2);
        }
    }

    public static void loadAndLaunchDeveloperOptions(Context context, AnonymousClass0IU anonymousClass0IU, FragmentActivity fragmentActivity, AnonymousClass0Cm anonymousClass0Cm, Bundle bundle) {
        AnonymousClass2D6 C = AnonymousClass2D6.C(context, anonymousClass0Cm);
        AnonymousClass2DC B = new AnonymousClass2DC(new String[]{"devoptions"}).B(AnonymousClass2DD.f27559C);
        B.f27554C = anonymousClass0IU;
        B.f27553B = new DeveloperOptionsLauncher$1(fragmentActivity, bundle, context);
        C.A(B.A());
    }
}
