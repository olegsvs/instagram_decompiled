package com.instagram.inappbrowser.view;

import X.AnonymousClass0cQ;
import X.AnonymousClass2Cw;
import X.AnonymousClass2Zm;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import com.facebook.C0164R;
import com.facebook.browser.lite.BrowserLiteFragment;

public class MinimalBrowserActivity extends Activity {
    /* renamed from: B */
    public BrowserLiteFragment f27523B;
    /* renamed from: C */
    private AnonymousClass2Cw f27524C;

    public final void finish() {
        super.finish();
        this.f27524C.m14701B();
        int[] intArrayExtra = getIntent().getIntArrayExtra("BrowserLiteIntent.EXTRA_ANIMATION");
        if (intArrayExtra != null && intArrayExtra.length == 4) {
            overridePendingTransition(intArrayExtra[2], intArrayExtra[3]);
        }
    }

    public final void onBackPressed() {
        BrowserLiteFragment browserLiteFragment = this.f27523B;
        if (browserLiteFragment == null || !browserLiteFragment.bn()) {
            AnonymousClass2Cw.f27496F = true;
            this.f27523B.m15527N(2);
            finish();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass2Cw.m14699B(this.f27524C);
    }

    public final void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.B(this, 1344609591);
        super.onCreate(bundle);
        AnonymousClass2Cw anonymousClass2Cw = new AnonymousClass2Cw(this);
        this.f27524C = anonymousClass2Cw;
        anonymousClass2Cw.m14700A();
        setContentView(C0164R.layout.ig_minimal_browser_activity);
        BrowserLiteFragment browserLiteFragment = (BrowserLiteFragment) getFragmentManager().findFragmentById(C0164R.id.browser_lite_fragment);
        this.f27523B = browserLiteFragment;
        browserLiteFragment.f30009C = new AnonymousClass2Zm(this);
        int[] intArrayExtra = getIntent().getIntArrayExtra("BrowserLiteIntent.EXTRA_ANIMATION");
        if (intArrayExtra != null && intArrayExtra.length == 4) {
            overridePendingTransition(intArrayExtra[0], intArrayExtra[1]);
        }
        AnonymousClass0cQ.C(this, 481579658, B);
    }

    public final void onPause() {
        int B = AnonymousClass0cQ.B(this, 1550285193);
        super.onPause();
        this.f27524C.m14702C();
        AnonymousClass0cQ.C(this, 1451991774, B);
    }

    public final void onUserInteraction() {
        super.onUserInteraction();
        this.f27524C.m14703D();
    }
}
