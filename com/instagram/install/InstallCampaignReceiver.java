package com.instagram.install;

import X.AnonymousClass0EE;
import X.AnonymousClass0GG;
import X.AnonymousClass0Kq;
import X.AnonymousClass0Ks;
import X.AnonymousClass0cQ;
import X.AnonymousClass1X4;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

public class InstallCampaignReceiver extends BroadcastReceiver implements AnonymousClass0EE {
    /* renamed from: B */
    private static final AnonymousClass0Ks f68601B;

    public final String getModuleName() {
        return "install";
    }

    static {
        AnonymousClass0Kq B = AnonymousClass0Kq.B();
        B.f3132F = "InstallCampaignReceiver";
        f68601B = B.A();
    }

    public final void onReceive(Context context, Intent intent) {
        int D = AnonymousClass0cQ.D(this, -1660877516);
        Object stringExtra = intent.getStringExtra("referrer");
        if (TextUtils.isEmpty(stringExtra)) {
            AnonymousClass0cQ.E(this, context, intent, 1380864042, D);
            return;
        }
        AnonymousClass0GG.B(f68601B, new AnonymousClass1X4(this, context, stringExtra), -1937470323);
        AnonymousClass0cQ.E(this, context, intent, -2080484247, D);
    }
}
