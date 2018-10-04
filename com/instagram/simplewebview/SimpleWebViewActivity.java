package com.instagram.simplewebview;

import X.AnonymousClass0G5;
import X.AnonymousClass0IL;
import X.AnonymousClass0IV;
import X.AnonymousClass0IW;
import X.AnonymousClass0cQ;
import X.AnonymousClass3g9;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.C0164R;
import com.instagram.base.activity.BaseFragmentActivity;

public class SimpleWebViewActivity extends BaseFragmentActivity {
    /* renamed from: B */
    public static Intent m4429B(Context context, String str, SimpleWebViewConfig simpleWebViewConfig) {
        Intent intent = new Intent(context, SimpleWebViewActivity.class);
        intent.putExtra("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG", simpleWebViewConfig);
        if (str != null) {
            intent.putExtra("IgSessionManager.USER_ID", str);
        }
        return intent;
    }

    /* renamed from: C */
    public static void m4430C(Context context, String str, SimpleWebViewConfig simpleWebViewConfig) {
        AnonymousClass0IW.m2243I(m4429B(context, str, simpleWebViewConfig), context);
    }

    /* renamed from: T */
    public final void mo394T() {
        if (mo382D().mo1453E(C0164R.id.layout_container_main) == null) {
            AnonymousClass0IL anonymousClass3g9 = new AnonymousClass3g9();
            anonymousClass3g9.setArguments(getIntent().getExtras());
            AnonymousClass0IV B = mo382D().mo1450B();
            B.mo1622M(C0164R.id.layout_container_main, anonymousClass3g9);
            B.mo1615F();
        }
    }

    public final void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.m5852B(this, 1551431989);
        AnonymousClass0G5.m1728I(this);
        super.onCreate(bundle);
        AnonymousClass0cQ.m5853C(this, -953617384, B);
    }
}
