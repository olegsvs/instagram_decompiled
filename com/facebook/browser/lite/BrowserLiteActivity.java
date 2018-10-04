package com.facebook.browser.lite;

import X.AnonymousClass0OR;
import X.AnonymousClass0cQ;
import X.AnonymousClass1pP;
import X.AnonymousClass1pQ;
import X.AnonymousClass1pR;
import X.AnonymousClass1pU;
import X.AnonymousClass1qK;
import X.AnonymousClass1qc;
import X.AnonymousClass1qt;
import X.AnonymousClass1qu;
import X.AnonymousClass1r0;
import X.AnonymousClass1r7;
import X.AnonymousClass1rA;
import X.AnonymousClass1rD;
import X.AnonymousClass2Ou;
import X.AnonymousClass2Ov;
import X.AnonymousClass2Ow;
import X.AnonymousClass2P4;
import X.AnonymousClass2PF;
import X.AnonymousClass2dD;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.facebook.C0164R;
import com.facebook.common.dextricks.DexStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class BrowserLiteActivity extends Activity {
    /* renamed from: B */
    public BrowserLiteFragment f23160B;
    /* renamed from: C */
    public AnonymousClass1qK f23161C;
    /* renamed from: D */
    public List f23162D = new ArrayList();
    /* renamed from: E */
    public double f23163E = 1.0d;
    /* renamed from: F */
    public boolean f23164F = false;
    /* renamed from: G */
    private boolean f23165G;
    /* renamed from: H */
    private boolean f23166H = false;
    /* renamed from: I */
    private boolean f23167I;
    /* renamed from: J */
    private AnonymousClass1qu f23168J;

    /* renamed from: A */
    public final void m13386A(int i, String str) {
        AnonymousClass1qK B = AnonymousClass1qK.m13396B();
        AnonymousClass1qK.m13397C(B, new AnonymousClass2PF(B, "LEChromeExtras.DismissMockBottomSheet", null));
        if (!this.f23160B.m15533T(i, str)) {
            this.f23166H = true;
            this.f23160B.m15527N(i);
            if (getCallingActivity() != null) {
                setResult(i == 0 ? -1 : 0, new Intent().putExtra("KEY_URL", str).putExtra("last_tap_point", i));
            }
            finish();
        }
    }

    /* renamed from: B */
    public static AnonymousClass2P4 m13383B(BrowserLiteActivity browserLiteActivity) {
        return (AnonymousClass2P4) browserLiteActivity.getFragmentManager().findFragmentByTag("rageshake_listener_fragment");
    }

    /* renamed from: C */
    public static boolean m13384C() {
        return AnonymousClass1pR.f23159C == 0;
    }

    /* renamed from: D */
    private void m13385D() {
        Locale locale = (Locale) getIntent().getSerializableExtra("BrowserLiteIntent.EXTRA_LOCALE");
        if (locale != null) {
            Configuration configuration = getResources().getConfiguration();
            if (!locale.equals(configuration.locale)) {
                configuration.locale = locale;
                getResources().updateConfiguration(configuration, getResources().getDisplayMetrics());
                Locale.setDefault(locale);
            }
        }
    }

    public final void finish() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        super.finish();
        r5 = X.AnonymousClass1pR.f23159C;
        r0 = 1;
        r5 = r5 - r0;
        X.AnonymousClass1pR.f23159C = r5;
        if (r5 >= 0) goto L_0x001b;
    L_0x000b:
        r4 = X.AnonymousClass1pR.f23158B;
        r3 = "sCounter = %d < 0! This should not happen!";
        r2 = new java.lang.Object[r0];
        r1 = 0;
        r0 = java.lang.Integer.valueOf(r5);
        r2[r1] = r0;
        X.AnonymousClass1rD.m13486F(r4, r3, r2);
    L_0x001b:
        r0 = m13384C();
        if (r0 == 0) goto L_0x002f;
    L_0x0021:
        r0 = X.AnonymousClass1rA.m13469E(r6);
        if (r0 == 0) goto L_0x002f;
    L_0x0027:
        r0 = X.AnonymousClass1r7.m13464I();
        if (r0 != 0) goto L_0x002f;
    L_0x002d:
        r0 = 1;
        goto L_0x0030;
    L_0x002f:
        r0 = 0;
    L_0x0030:
        r6.f23164F = r0;
        if (r0 == 0) goto L_0x004a;
    L_0x0034:
        r0 = "input_method";
        r2 = r6.getSystemService(r0);
        r2 = (android.view.inputmethod.InputMethodManager) r2;
        r0 = r6.getCurrentFocus();
        if (r0 == 0) goto L_0x004a;
    L_0x0042:
        r1 = r0.getWindowToken();
        r0 = 0;
        r2.hideSoftInputFromWindow(r1, r0);
    L_0x004a:
        r0 = m13384C();
        if (r0 == 0) goto L_0x006d;
    L_0x0050:
        r0 = r6.f23167I;
        if (r0 != 0) goto L_0x006d;
    L_0x0054:
        r1 = android.os.Build.VERSION.SDK_INT;
        r0 = 21;
        if (r1 >= r0) goto L_0x0065;
    L_0x005a:
        android.webkit.CookieSyncManager.createInstance(r6);
        r0 = android.webkit.CookieManager.getInstance();
        r0.removeAllCookie();
        goto L_0x006d;
    L_0x0065:
        r1 = android.webkit.CookieManager.getInstance();
        r0 = 0;
        r1.removeAllCookies(r0);	 Catch:{ Exception -> 0x006d }
    L_0x006d:
        r1 = r6.getIntent();
        r0 = "BrowserLiteIntent.EXTRA_ANIMATION";
        r2 = r1.getIntArrayExtra(r0);
        if (r2 == 0) goto L_0x0086;
    L_0x0079:
        r1 = r2.length;
        r0 = 4;
        if (r1 != r0) goto L_0x0086;
    L_0x007d:
        r0 = 2;
        r1 = r2[r0];
        r0 = 3;
        r0 = r2[r0];
        r6.overridePendingTransition(r1, r0);
    L_0x0086:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteActivity.finish():void");
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
        for (AnonymousClass2dD anonymousClass2dD : this.f23160B.f30021O) {
        }
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
        for (AnonymousClass2dD anonymousClass2dD : this.f23160B.f30021O) {
        }
    }

    public final void onBackPressed() {
        BrowserLiteFragment browserLiteFragment = this.f23160B;
        if (browserLiteFragment == null || !browserLiteFragment.m15524K(true)) {
            m13386A(2, null);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m13385D();
    }

    public void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.B(this, -1315188815);
        boolean z = false;
        AnonymousClass1qt.f23364E = new AnonymousClass1qt(getIntent().getBooleanExtra("BrowserLiteIntent.EXTRA_PERFORMANCE_LOGGING_ENABLED", false));
        long longExtra = getIntent().getLongExtra("BrowserLiteIntent.HANDLE_INTENT_START_TIME", 0);
        if (longExtra > 0) {
            AnonymousClass1qt.m13430B().m13433C("BLIH.Intent_Creation", longExtra);
        }
        AnonymousClass1qt.m13430B().m13432B("BLA.onCreate.Start");
        this.f23165G = getIntent().getBooleanExtra("extra_hide_system_status_bar", false);
        String stringExtra = getIntent().getStringExtra("BrowserLiteIntent.EXTRA_THEME");
        super.onCreate(bundle);
        if (AnonymousClass1r7.m13459D() && AnonymousClass1rA.m13469E(this)) {
            AnonymousClass1qc.f23312B = true;
        }
        if (bundle == null) {
            AnonymousClass1pR.f23159C++;
        }
        int[] intArrayExtra = getIntent().getIntArrayExtra("BrowserLiteIntent.EXTRA_ANIMATION");
        if (intArrayExtra != null && intArrayExtra.length == 4) {
            overridePendingTransition(intArrayExtra[0], intArrayExtra[1]);
        }
        m13385D();
        AnonymousClass1rD.f23412B = getIntent().getBooleanExtra("BrowserLiteIntent.EXTRA_LOGCAT", false);
        AnonymousClass1r0.m13437B();
        AnonymousClass1qt.m13430B().m13432B("BLA.setContentView.Start");
        setContentView(C0164R.layout.browser_lite_main);
        AnonymousClass1qt.m13430B().m13432B("BLA.setContentView.End");
        if ((getWindow().getAttributes().flags & DexStore.LOAD_RESULT_MIXED_MODE) != 0) {
            z = true;
        }
        if (z) {
            AnonymousClass1pU anonymousClass1pU = new AnonymousClass1pU(this);
        }
        BrowserLiteFragment browserLiteFragment = (BrowserLiteFragment) getFragmentManager().findFragmentById(C0164R.id.browser_lite_fragment);
        this.f23160B = browserLiteFragment;
        browserLiteFragment.f30009C = new AnonymousClass2Ou(this);
        this.f23161C = AnonymousClass1qK.m13396B();
        this.f23168J = AnonymousClass1qu.m13434B();
        if (getIntent().getBooleanExtra("BrowserLiteIntent.EXTRA_IS_RAGE_SHAKE_AVAILABLE", false) && m13383B(this) == null) {
            getFragmentManager().beginTransaction().add(0, new AnonymousClass2P4(), "rageshake_listener_fragment").disallowAddToBackStack().commit();
        }
        this.f23167I = getIntent().getBooleanExtra("BrowserLiteIntent.EXTRA_PERSISTENT_COOKIE", true);
        double doubleExtra = getIntent().getDoubleExtra("BrowserLiteIntent.DISPLAY_HEIGHT_RATIO", 1.0d);
        this.f23163E = doubleExtra;
        if (doubleExtra < 0.25d || doubleExtra >= 1.0d) {
            this.f23163E = 1.0d;
            getWindow().setLayout(-1, -1);
        } else {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Window window = getWindow();
            double d = (double) displayMetrics.heightPixels;
            doubleExtra = this.f23163E;
            Double.isNaN(d);
            window.setLayout(-1, (int) (d * doubleExtra));
            getWindow().setGravity(87);
        }
        if ("THEME_MESSENGER_PLATFORM_IAB".equals(stringExtra) && this.f23163E < 1.0d) {
            this.f23162D.add(new AnonymousClass2Ow(this));
        }
        this.f23162D.add(new AnonymousClass2Ov(this));
        View findViewById = findViewById(C0164R.id.brower_lite_root_container);
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass1pP(this, findViewById));
        AnonymousClass1qt.m13430B().m13432B("BLA.onCreate.End");
        AnonymousClass0cQ.C(this, 1756737450, B);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        BrowserLiteFragment browserLiteFragment = this.f23160B;
        if (browserLiteFragment == null || !browserLiteFragment.m15525L(i, keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public final void onPause() {
        int B = AnonymousClass0cQ.B(this, 118453648);
        super.onPause();
        AnonymousClass2P4 B2 = m13383B(this);
        if (B2 != null) {
            B2.onPause();
        }
        if (this.f23166H) {
            AnonymousClass0OR.F(new Handler(), new AnonymousClass1pQ(this), 500, -695423042);
        }
        AnonymousClass0cQ.C(this, -1056468934, B);
    }

    public final void onResume() {
        int B = AnonymousClass0cQ.B(this, -1240128304);
        super.onResume();
        AnonymousClass2P4 B2 = m13383B(this);
        if (B2 != null) {
            B2.onResume();
        }
        if (this.f23165G) {
            Window window = getWindow();
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4);
            window.setFlags(DexStore.LOAD_RESULT_MIXED_MODE, DexStore.LOAD_RESULT_MIXED_MODE);
        }
        AnonymousClass0cQ.C(this, -259344038, B);
    }

    public final void onUserInteraction() {
        Map hashMap = new HashMap();
        hashMap.put("action", "ig_browser_touch_interaction");
        this.f23161C.m13402D(hashMap, this.f23160B.f30041i);
        this.f23168J.m13434B();
        super.onUserInteraction();
    }
}
