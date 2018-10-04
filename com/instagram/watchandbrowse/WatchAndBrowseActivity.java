package com.instagram.watchandbrowse;

import X.AnonymousClass0EF;
import X.AnonymousClass0IW;
import X.AnonymousClass0cQ;
import X.AnonymousClass0ea;
import X.AnonymousClass1Xe;
import X.AnonymousClass1Xi;
import X.AnonymousClass1qK;
import X.AnonymousClass2Cw;
import X.AnonymousClass2PX;
import X.AnonymousClass2dD;
import X.AnonymousClass3qP;
import X.AnonymousClass3qQ;
import X.AnonymousClass3qR;
import X.AnonymousClass3qS;
import X.AnonymousClass3qV;
import X.AnonymousClass3qX;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.Toast;
import com.facebook.C0164R;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.feed.sponsored.adctabutton.AdCTAButton;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import java.util.HashMap;
import java.util.Map;

public class WatchAndBrowseActivity extends Activity implements AnonymousClass3qV {
    /* renamed from: B */
    private AnonymousClass2Cw f48918B;
    /* renamed from: C */
    private BrowserLiteFragment f48919C;
    /* renamed from: D */
    private AnonymousClass1qK f48920D;
    /* renamed from: E */
    private boolean f48921E;
    /* renamed from: F */
    private Bundle f48922F;
    /* renamed from: G */
    private View f48923G;
    /* renamed from: H */
    private final Rect f48924H = new Rect();
    /* renamed from: I */
    private boolean f48925I;

    /* renamed from: B */
    public static void m22299B(WatchAndBrowseActivity watchAndBrowseActivity, int i, String str) {
        AnonymousClass2Cw.f27496F = true;
        int i2 = 2;
        if (i != 1) {
            i2 = i == 2 ? 1 : i == 10 ? 4 : 3;
        }
        AnonymousClass1Xe.f19849E.B(i2);
        watchAndBrowseActivity.f48919C.m15527N(i);
        if (watchAndBrowseActivity.getCallingActivity() != null) {
            watchAndBrowseActivity.setResult(i == 0 ? -1 : 0, new Intent().putExtra(IgReactNavigatorModule.URL, str).putExtra("last_tap_point", i));
        }
        watchAndBrowseActivity.finish();
    }

    /* renamed from: C */
    public static void m22300C(WatchAndBrowseActivity watchAndBrowseActivity, String str, int i) {
        AnonymousClass1Xe.D(AnonymousClass1Xe.f19849E, Message.obtain(null, 7, i, -1));
        if (!AnonymousClass0IW.Q(new Intent("android.intent.action.VIEW").setFlags(268435456).setData(AnonymousClass0EF.F(str)), watchAndBrowseActivity)) {
            Toast.makeText(watchAndBrowseActivity, C0164R.string.open_appstore_error, 0).show();
        }
    }

    /* renamed from: D */
    private boolean m22301D(float f, float f2) {
        if (this.f48923G == null) {
            return false;
        }
        if (this.f48924H.isEmpty()) {
            this.f48923G.getGlobalVisibleRect(this.f48924H);
        }
        return this.f48924H.contains((int) f, (int) f2);
    }

    public final boolean OTA(View view, MotionEvent motionEvent) {
        if (m22301D(motionEvent.getRawX(), motionEvent.getRawY())) {
            return true;
        }
        BrowserLiteFragment browserLiteFragment = this.f48919C;
        int i = (browserLiteFragment == null || browserLiteFragment.IT() == null || this.f48919C.IT().getScrollY() != 0 || this.f48919C.IT().getTranslationY() != 0.0f) ? 0 : 1;
        return i ^ true;
    }

    public final void bCA() {
        m22299B(this, 10, null);
    }

    public final void dg() {
        AnonymousClass1Xe.C(AnonymousClass1Xe.f19849E, 8);
    }

    public final void finish() {
        super.finish();
        if (this.f48925I) {
            overridePendingTransition(17432576, 17432577);
        } else {
            overridePendingTransition(0, 0);
        }
    }

    public final void ih() {
        this.f48919C.m15531R(true);
        this.f48919C.m15532S(true);
    }

    public final void jh() {
        this.f48919C.m15531R(false);
        this.f48919C.m15532S(false);
    }

    public final void kh(boolean z) {
        this.f48925I = true;
        AnonymousClass1Xe.D(AnonymousClass1Xe.f19849E, Message.obtain(null, 4, z, -1));
        if (!this.f48921E) {
            Map hashMap = new HashMap();
            hashMap.put("action", "ig_did_fullscreen_happen");
            this.f48920D.m13402D(hashMap, this.f48922F);
            this.f48921E = true;
        }
    }

    public final void lh() {
        this.f48925I = false;
        AnonymousClass1Xe.C(AnonymousClass1Xe.f19849E, 5);
    }

    public final void onBackPressed() {
        BrowserLiteFragment browserLiteFragment = this.f48919C;
        if (browserLiteFragment == null || !browserLiteFragment.bn()) {
            m22299B(this, 2, null);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass2Cw.m14699B(this.f48918B);
    }

    public final void onCreate(Bundle bundle) {
        View inflate;
        int B = AnonymousClass0cQ.B(this, -1325445326);
        super.onCreate(bundle);
        AnonymousClass2Cw anonymousClass2Cw = new AnonymousClass2Cw(this);
        this.f48918B = anonymousClass2Cw;
        anonymousClass2Cw.m14700A();
        setContentView(C0164R.layout.watchandbrowse_activity);
        AnonymousClass1Xe.f19849E.A(getApplicationContext());
        this.f48920D = AnonymousClass1qK.m13396B();
        this.f48922F = getIntent().getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING");
        Bundle extras = getIntent().getExtras();
        int i = AnonymousClass1Xi.C(extras).getInt("com.instagram.watchandmore.CONFIG_VIDEO_HEIGHT");
        this.f48919C = (BrowserLiteFragment) getFragmentManager().findFragmentById(C0164R.id.browser_lite_fragment);
        AnonymousClass2dD anonymousClass2dD = new AnonymousClass2dD();
        this.f48919C.f30009C = new AnonymousClass3qP(this);
        String string = AnonymousClass1Xi.C(extras).getString("com.instagram.watchandmore.INSTALL_PACKAGE_NAME");
        if (string != null) {
            anonymousClass2dD.f31737D = true;
            anonymousClass2dD.f31752S = new AnonymousClass3qQ(this, string);
            inflate = ((ViewStub) findViewById(C0164R.id.install_button_stub)).inflate();
            this.f48923G = inflate;
            AdCTAButton adCTAButton = (AdCTAButton) inflate.findViewById(C0164R.id.install_button);
            adCTAButton.setText(AnonymousClass1Xi.C(extras).getString("com.instagram.watchandmore.INSTALL_BUTTON_NAME"));
            adCTAButton.f12531E = adCTAButton.f12528B.f18490B;
            adCTAButton.f12532F = adCTAButton.f12529C.f18490B;
            adCTAButton.f12533G = adCTAButton.f12534H.f18490B;
            adCTAButton.invalidate();
            this.f48923G.setOnClickListener(new AnonymousClass3qR(this, string));
        }
        inflate = findViewById(C0164R.id.watchbrowse_close_button);
        inflate.setOnClickListener(new AnonymousClass3qS(this));
        AnonymousClass2PX.mo2918B().f23386B.add(anonymousClass2dD);
        AnonymousClass3qX anonymousClass3qX = new AnonymousClass3qX((TouchInterceptorFrameLayout) findViewById(C0164R.id.watchbrowse_root), this.f48919C.getView(), i, AnonymousClass1Xi.B(inflate.getContext()), this);
        overridePendingTransition(0, 0);
        AnonymousClass0cQ.C(this, -972182413, B);
    }

    public final void onDestroy() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = -1626603392; // 0xffffffff9f0c0080 float:-2.9646567E-20 double:NaN;
        r3 = X.AnonymousClass0cQ.B(r4, r0);
        super.onDestroy();
        r1 = X.AnonymousClass1Xe.f19849E;
        r0 = r4.getApplicationContext();
        r2 = r0.getApplicationContext();	 Catch:{ IllegalArgumentException -> 0x001c }
        r1 = r1.f19850B;	 Catch:{ IllegalArgumentException -> 0x001c }
        r0 = 1111251505; // 0x423c5a31 float:47.088078 double:5.490311925E-315;	 Catch:{ IllegalArgumentException -> 0x001c }
        X.AnonymousClass17r.C(r2, r1, r0);	 Catch:{ IllegalArgumentException -> 0x001c }
    L_0x001c:
        r0 = -1061262579; // 0xffffffffc0be6b0d float:-5.9505677 double:NaN;
        X.AnonymousClass0cQ.C(r4, r0, r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.watchandbrowse.WatchAndBrowseActivity.onDestroy():void");
    }

    public final void onPause() {
        int B = AnonymousClass0cQ.B(this, 1184469398);
        super.onPause();
        AnonymousClass0ea.E(getWindow(), getWindow().getDecorView(), true);
        AnonymousClass1Xe.C(AnonymousClass1Xe.f19849E, 2);
        this.f48918B.m14702C();
        AnonymousClass0cQ.C(this, 1589163132, B);
    }

    public final void onResume() {
        int B = AnonymousClass0cQ.B(this, 1981917826);
        super.onResume();
        AnonymousClass0ea.E(getWindow(), getWindow().getDecorView(), false);
        AnonymousClass1Xe.C(AnonymousClass1Xe.f19849E, 1);
        AnonymousClass0cQ.C(this, 201179970, B);
    }

    public final void onUserInteraction() {
        super.onUserInteraction();
        this.f48918B.m14703D();
    }

    public final void sf() {
        AnonymousClass1Xe.C(AnonymousClass1Xe.f19849E, 6);
    }
}
