package com.instagram.settings.activity;

import X.AnonymousClass0Ce;
import X.AnonymousClass0EE;
import X.AnonymousClass0EQ;
import X.AnonymousClass0F9;
import X.AnonymousClass0Kl;
import X.AnonymousClass0cQ;
import X.AnonymousClass5GT;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.IgActivity;
import com.instagram.service.session.ShouldInitUserSession;

@ShouldInitUserSession
public class NotificationSettingsHandlerActivity extends IgActivity implements AnonymousClass0EE {
    public final String getModuleName() {
        return "notification_settings_handler";
    }

    public final void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.B(this, -1897045012);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!AnonymousClass0Ce.F(this).xX()) {
            AnonymousClass0EQ.f1975B.A(this, intent.getExtras());
        } else if ("android.intent.action.MAIN".equals(intent.getAction()) && intent.hasCategory("android.intent.category.NOTIFICATION_PREFERENCES")) {
            AnonymousClass0F9.C().H(AnonymousClass0Kl.NOTIFICATION_CHANNELS);
            AnonymousClass5GT.m26108F(this, AnonymousClass0Ce.H(this));
        }
        finish();
        AnonymousClass0cQ.C(this, 31092000, B);
    }
}
