package com.instagram.share.handleractivity;

import X.AnonymousClass0EE;
import X.AnonymousClass0EH;
import X.AnonymousClass0EM;
import X.AnonymousClass0F9;
import X.AnonymousClass0Fl;
import X.AnonymousClass0Gi;
import X.AnonymousClass0IW;
import X.AnonymousClass0Kl;
import X.AnonymousClass0PW;
import X.AnonymousClass0cQ;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.nux.activity.SignedOutFragmentActivity;

public class ShareHandlerActivity extends Activity implements AnonymousClass0EE, AnonymousClass0Fl {
    public final String getModuleName() {
        return "share_handler";
    }

    public final void uc(Activity activity) {
    }

    public final void wc(Activity activity) {
    }

    public final void zc(Activity activity) {
    }

    /* renamed from: B */
    private void m26182B() {
        Parcelable intent = getIntent();
        int i = 0;
        if (!intent.getBooleanExtra("ShareHandlerActivity.IS_FROM_INSTAGRAM", false)) {
            i = 335544320;
        }
        Intent B = AnonymousClass0EM.f1972B.B(this, i);
        B.putExtra("ShareHandlerActivity.EXTRA_SHARE_INTENT", intent);
        AnonymousClass0IW.I(B, this);
    }

    public final void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.B(this, -86065008);
        AnonymousClass0F9.C().H(AnonymousClass0Kl.SHARE_TO_FEED);
        AnonymousClass0EH.J(getResources());
        super.onCreate(bundle);
        if (bundle == null) {
            m26182B();
        }
        AnonymousClass0Gi.f2408B.E(this);
        AnonymousClass0cQ.C(this, 1241075451, B);
    }

    public final void onDestroy() {
        int B = AnonymousClass0cQ.B(this, -512700111);
        super.onDestroy();
        AnonymousClass0Gi.f2408B.F(this);
        AnonymousClass0cQ.C(this, -1777988965, B);
    }

    public final void onNewIntent(Intent intent) {
        setIntent(intent);
        m26182B();
    }

    public final void vc(Activity activity) {
        if ((activity instanceof AnonymousClass0PW) || (activity instanceof SignedOutFragmentActivity)) {
            finish();
        }
    }
}
