package com.instagram.share.tumblr;

import X.AnonymousClass0FL;
import X.AnonymousClass3fT;
import X.AnonymousClass3fV;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.facebook.C0164R;
import com.instagram.service.session.ShouldInitUserSession;
import com.instagram.share.creativeapps.XAuthActivity;

@ShouldInitUserSession
public class TumblrAuthActivity extends XAuthActivity {
    /* renamed from: B */
    private final OnClickListener f48546B = new AnonymousClass3fT(this);

    /* renamed from: P */
    public final String mo5024P() {
        return getResources().getString(C0164R.string.tumblr);
    }

    /* renamed from: Q */
    public final void mo5025Q() {
        Bundle E = AnonymousClass0FL.E(this);
        E.putBoolean("deliverOnly", true);
        E().B(0, E, new AnonymousClass3fV(this));
        findViewById(C0164R.id.done).setOnClickListener(this.f48546B);
        ((EditText) findViewById(C0164R.id.username)).setHint(getString(C0164R.string.tumblr_username_hint));
    }
}
