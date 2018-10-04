package com.instagram.watchandmore;

import X.AnonymousClass0IL;
import X.AnonymousClass0IV;
import X.AnonymousClass0cQ;
import X.AnonymousClass0ea;
import X.AnonymousClass1Ud;
import X.AnonymousClass1Xe;
import X.AnonymousClass1Xi;
import X.AnonymousClass1Y6;
import X.AnonymousClass3qT;
import X.AnonymousClass3qV;
import X.AnonymousClass3qX;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.C0164R;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

public class WatchAndLeadActivity extends FragmentActivity implements AnonymousClass3qV, PermissionAwareActivity {
    /* renamed from: B */
    private boolean f48926B;
    /* renamed from: C */
    private PermissionListener f48927C;
    /* renamed from: D */
    private int f48928D;
    /* renamed from: E */
    private AnonymousClass1Ud f48929E;
    /* renamed from: F */
    private AnonymousClass3qX f48930F;

    public final void bCA() {
    }

    public final boolean OTA(View view, MotionEvent motionEvent) {
        AnonymousClass1Ud anonymousClass1Ud = this.f48929E;
        int i = (anonymousClass1Ud == null || anonymousClass1Ud.f19133B != 0) ? 0 : 1;
        return i ^ true;
    }

    public final void dg() {
        AnonymousClass1Xe.C(AnonymousClass1Xe.f19849E, 8);
    }

    public final void finish() {
        super.finish();
        if (this.f48926B) {
            overridePendingTransition(17432576, 17432577);
        } else {
            overridePendingTransition(0, 0);
        }
    }

    public final void ih() {
        this.f48929E.f19939B.Q(true);
    }

    public final void jh() {
        this.f48929E.f19939B.Q(false);
    }

    public final void kh(boolean z) {
        this.f48926B = true;
        AnonymousClass1Xe.D(AnonymousClass1Xe.f19849E, Message.obtain(null, 4, z, -1));
    }

    public final void lh() {
        this.f48926B = false;
        AnonymousClass1Xe.C(AnonymousClass1Xe.f19849E, 5);
    }

    public final void onBackPressed() {
        AnonymousClass1Y6 anonymousClass1Y6 = this.f48929E;
        if (anonymousClass1Y6 == null || !anonymousClass1Y6.onBackPressed()) {
            AnonymousClass1Xe.f19849E.B(1);
            finish();
        }
    }

    public final void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.B(this, 1485303582);
        super.onCreate(bundle);
        setContentView(C0164R.layout.watchandlead_activity);
        AnonymousClass1Xe.f19849E.A(getApplicationContext());
        this.f48928D = AnonymousClass1Xi.C(getIntent().getExtras()).getInt("com.instagram.watchandmore.CONFIG_VIDEO_HEIGHT");
        AnonymousClass1Ud anonymousClass1Ud = (AnonymousClass1Ud) D().E(C0164R.id.watchandlead_root);
        this.f48929E = anonymousClass1Ud;
        if (anonymousClass1Ud == null) {
            AnonymousClass0IL anonymousClass1Ud2 = new AnonymousClass1Ud();
            this.f48929E = anonymousClass1Ud2;
            anonymousClass1Ud2.setArguments(getIntent().getExtras());
            AnonymousClass0IV B2 = D().B();
            B2.M(C0164R.id.watchandlead_root, this.f48929E);
            B2.F();
        }
        overridePendingTransition(0, 0);
        AnonymousClass0cQ.C(this, 572339742, B);
    }

    public final void onDestroy() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = 1712948786; // 0x66198632 float:1.8124938E23 double:8.463091482E-315;
        r3 = X.AnonymousClass0cQ.B(r4, r0);
        super.onDestroy();
        r1 = X.AnonymousClass1Xe.f19849E;
        r0 = r4.getApplicationContext();
        r2 = r0.getApplicationContext();	 Catch:{ IllegalArgumentException -> 0x001c }
        r1 = r1.f19850B;	 Catch:{ IllegalArgumentException -> 0x001c }
        r0 = 1111251505; // 0x423c5a31 float:47.088078 double:5.490311925E-315;	 Catch:{ IllegalArgumentException -> 0x001c }
        X.AnonymousClass17r.C(r2, r1, r0);	 Catch:{ IllegalArgumentException -> 0x001c }
    L_0x001c:
        r0 = 1698906702; // 0x6543424e float:5.7630286E22 double:8.39371437E-315;
        X.AnonymousClass0cQ.C(r4, r0, r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.watchandmore.WatchAndLeadActivity.onDestroy():void");
    }

    public final void onPause() {
        int B = AnonymousClass0cQ.B(this, -515618179);
        super.onPause();
        AnonymousClass0ea.E(getWindow(), getWindow().getDecorView(), true);
        AnonymousClass1Xe.C(AnonymousClass1Xe.f19849E, 2);
        AnonymousClass0cQ.C(this, 1855642605, B);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        PermissionListener permissionListener = this.f48927C;
        if (permissionListener != null && permissionListener.onRequestPermissionsResult(i, strArr, iArr)) {
            this.f48927C = null;
        }
    }

    public final void onResume() {
        int B = AnonymousClass0cQ.B(this, 252855950);
        super.onResume();
        AnonymousClass0ea.E(getWindow(), getWindow().getDecorView(), false);
        if (this.f48930F == null) {
            View findViewById = findViewById(C0164R.id.watchandlead_close_button);
            findViewById.setOnClickListener(new AnonymousClass3qT(this));
            this.f48930F = new AnonymousClass3qX((TouchInterceptorFrameLayout) findViewById(C0164R.id.watchandlead_root), this.f48929E.f19939B.D(), this.f48928D, AnonymousClass1Xi.B(findViewById.getContext()), this);
        }
        AnonymousClass1Xe.C(AnonymousClass1Xe.f19849E, 1);
        AnonymousClass0cQ.C(this, 602644436, B);
    }

    public final void requestPermissions(String[] strArr, int i, PermissionListener permissionListener) {
        this.f48927C = permissionListener;
        requestPermissions(strArr, i);
    }

    public final void sf() {
        AnonymousClass1Xe.C(AnonymousClass1Xe.f19849E, 6);
    }
}
