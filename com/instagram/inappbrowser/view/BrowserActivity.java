package com.instagram.inappbrowser.view;

import X.AnonymousClass0IG;
import X.AnonymousClass0cQ;
import X.AnonymousClass0ea;
import X.AnonymousClass1PD;
import X.AnonymousClass2Ct;
import X.AnonymousClass2Cu;
import X.AnonymousClass2Cw;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import com.facebook.C0164R;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import java.util.HashMap;
import java.util.Map;

public class BrowserActivity extends Activity implements AnonymousClass2Ct {
    /* renamed from: B */
    private AnonymousClass2Cu f31345B;
    /* renamed from: C */
    private AnonymousClass2Cw f31346C;
    /* renamed from: D */
    private BrowserLiteFragment f31347D;
    /* renamed from: E */
    private boolean f31348E;
    /* renamed from: F */
    private boolean f31349F;
    /* renamed from: G */
    private int f31350G;

    /* renamed from: B */
    public static void m16296B(BrowserActivity browserActivity, int i) {
        AnonymousClass2Cw.f27496F = true;
        browserActivity.f31347D.m15527N(i);
        browserActivity.finish();
    }

    public final boolean NTA() {
        BrowserLiteFragment browserLiteFragment = this.f31347D;
        int i = (browserLiteFragment == null || browserLiteFragment.IT() == null || this.f31347D.IT().getScrollY() != 0 || this.f31347D.IT().getTranslationY() != 0.0f) ? 0 : 1;
        return i ^ true;
    }

    public final void finish() {
        super.finish();
        this.f31346C.m14701B();
        overridePendingTransition(C0164R.anim.fade_in, C0164R.anim.bottom_out);
    }

    public final void onBackPressed() {
        BrowserLiteFragment browserLiteFragment = this.f31347D;
        if (browserLiteFragment == null || !browserLiteFragment.bn()) {
            m16296B(this, 2);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass2Cw.m14699B(this.f31346C);
    }

    public final void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.B(this, -345751814);
        super.onCreate(bundle);
        AnonymousClass2Cw anonymousClass2Cw = new AnonymousClass2Cw(this);
        this.f31346C = anonymousClass2Cw;
        anonymousClass2Cw.m14700A();
        setContentView(C0164R.layout.ig_browser_activity);
        this.f31348E = getIntent().getBooleanExtra("BrowserActivity.EXTRA_ENABLE_FULLSCREEN", false);
        BrowserLiteFragment browserLiteFragment = (BrowserLiteFragment) getFragmentManager().findFragmentById(C0164R.id.browser_lite_fragment);
        this.f31347D = browserLiteFragment;
        browserLiteFragment.f30009C = new AnonymousClass1PD(this);
        this.f31350G = getIntent().getIntExtra("BrowserActivity.EXTRA_TOP_PADDING", 0);
        this.f31345B = new AnonymousClass2Cu((TouchInterceptorFrameLayout) findViewById(C0164R.id.ig_browser_root), this.f31347D.getView(), findViewById(C0164R.id.overlay_below_browser), this, getIntent().getBooleanExtra("BrowserActivity.EXTRA_SHOW_DRAG_DOWN_NUX", false), this.f31350G, getIntent().getBooleanExtra("BrowserActivity.EXTRA_ENABLE_GESTURE", false));
        AnonymousClass0cQ.C(this, -1197756815, B);
    }

    public final void onPause() {
        int B = AnonymousClass0cQ.B(this, -1335242791);
        super.onPause();
        if (this.f31348E) {
            AnonymousClass0ea.E(getWindow(), getWindow().getDecorView(), true);
        }
        this.f31346C.m14702C();
        AnonymousClass0cQ.C(this, 735017071, B);
    }

    public final void onResume() {
        int B = AnonymousClass0cQ.B(this, 820340996);
        super.onResume();
        if (this.f31348E || !(this.f31350G == 0 || this.f31349F)) {
            AnonymousClass0ea.E(getWindow(), getWindow().getDecorView(), false);
        }
        AnonymousClass2Cu anonymousClass2Cu = this.f31345B;
        if (!anonymousClass2Cu.f27481E) {
            anonymousClass2Cu.f27481E = true;
            int i = anonymousClass2Cu.f27485I;
            if (i != 0) {
                anonymousClass2Cu.f27478B.N((double) i);
                anonymousClass2Cu.f27480D = true;
            } else {
                AnonymousClass2Cu.m14698B(anonymousClass2Cu);
            }
            if (anonymousClass2Cu.f27483G) {
                anonymousClass2Cu.f27484H = AnonymousClass0IG.C(anonymousClass2Cu.f27479C, C0164R.string.in_app_browser_drag_down_nux);
            }
        }
        AnonymousClass0cQ.C(this, -1548584724, B);
    }

    public final void onUserInteraction() {
        super.onUserInteraction();
        this.f31346C.m14703D();
    }

    public final void rg() {
        m16296B(this, 4);
    }

    public final void ym() {
        this.f31349F = true;
        Map hashMap = new HashMap();
        hashMap.put("action", "ig_fullscreen_animation_end");
        AnonymousClass2Cw anonymousClass2Cw = this.f31346C;
        anonymousClass2Cw.f27498C.m13402D(hashMap, this.f31347D.f30041i);
        AnonymousClass0ea.E(getWindow(), getWindow().getDecorView(), true);
    }

    public final void zm() {
        Map hashMap = new HashMap();
        hashMap.put("action", "ig_fullscreen_animation_start");
        AnonymousClass2Cw anonymousClass2Cw = this.f31346C;
        anonymousClass2Cw.f27498C.m13402D(hashMap, this.f31347D.f30041i);
    }
}
