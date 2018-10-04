package com.instagram.share.handleractivity;

import X.AnonymousClass0EE;
import X.AnonymousClass0EH;
import X.AnonymousClass0cQ;
import X.AnonymousClass3f5;
import X.AnonymousClass3f6;
import X.AnonymousClass3fA;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class StoryShareHandlerActivity extends Activity implements AnonymousClass0EE {
    public final String getModuleName() {
        return "share_handler";
    }

    /* renamed from: B */
    private void m1350B() {
        Activity activity = this;
        Intent intent = getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
        AnonymousClass3fA anonymousClass3fA = AnonymousClass3fA.f43105E;
        AnonymousClass3f6.B(this, anonymousClass3fA, null, uri != null ? uri.toString() : null);
        AnonymousClass3f5.B(activity, intent, uri, null, anonymousClass3fA, null, -16777216, -16777216, null);
    }

    public final void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.m5852B(this, 2094589868);
        AnonymousClass0EH.m1380J(getResources());
        super.onCreate(bundle);
        if (bundle == null) {
            m1350B();
        }
        finish();
        AnonymousClass0cQ.m5853C(this, -172127595, B);
    }

    public final void onNewIntent(Intent intent) {
        setIntent(intent);
        m1350B();
    }
}
