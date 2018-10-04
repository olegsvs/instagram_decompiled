package com.instagram.url;

import X.AnonymousClass0Ca;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cn;
import X.AnonymousClass0Dc;
import X.AnonymousClass0EE;
import X.AnonymousClass0EM;
import X.AnonymousClass0EO;
import X.AnonymousClass0F4;
import X.AnonymousClass0F9;
import X.AnonymousClass0FL;
import X.AnonymousClass0Fr;
import X.AnonymousClass0Gn;
import X.AnonymousClass0Hz;
import X.AnonymousClass0IC;
import X.AnonymousClass0IW;
import X.AnonymousClass0IX;
import X.AnonymousClass0Iz;
import X.AnonymousClass0Kl;
import X.AnonymousClass0NN;
import X.AnonymousClass0Om;
import X.AnonymousClass0a2;
import X.AnonymousClass0cQ;
import X.AnonymousClass0cT;
import X.AnonymousClass0cq;
import X.AnonymousClass0cs;
import X.AnonymousClass0dL;
import X.AnonymousClass3kp;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.C0164R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import com.instagram.service.session.ShouldInitUserSession;

@ShouldInitUserSession
public class UrlHandlerActivity extends BaseFragmentActivity implements AnonymousClass0EE {
    /* renamed from: D */
    private static final Class f2720D = UrlHandlerActivity.class;
    /* renamed from: B */
    public AnonymousClass0Cn f2721B;
    /* renamed from: C */
    private boolean f2722C;

    /* renamed from: T */
    public final void mo394T() {
    }

    public final String getModuleName() {
        return "url_handler";
    }

    /* renamed from: B */
    private void m2112B(Intent intent) {
        String dataString = intent.getDataString();
        this.f2722C = intent.getBooleanExtra("com.instagram.url.extra.SHOULD_RETURN_TO_SENDING_ACTIVITY", false);
        AnonymousClass0cT.m5870C(this, this, intent);
        if (TextUtils.isEmpty(dataString)) {
            AnonymousClass3kp B = AnonymousClass3kp.B(intent);
            if (B != null) {
                dataString = B.f44092B;
            } else {
                dataString = null;
            }
            if (TextUtils.isEmpty(dataString)) {
                AnonymousClass0Dc.m1249L(f2720D, "Intent missing data url");
                finish();
                return;
            }
            Object obj = B.f44093C;
            AnonymousClass0NN F = AnonymousClass0NN.m3291B("ig_url_loaded_from_messenger", (AnonymousClass0EE) this).m3298F(IgReactNavigatorModule.URL, dataString);
            if (!TextUtils.isEmpty(obj)) {
                F.m3298F("sender_uid", obj);
            }
            F.m3310R();
        }
        AnonymousClass0IC A = AnonymousClass0EO.f1974B.mo260A(dataString, this.f2721B);
        if (A != null) {
            Object stringExtra = intent.getStringExtra("short_url");
            AnonymousClass0NN F2 = AnonymousClass0NN.m3291B("ig_url_loaded", (AnonymousClass0EE) this).m3298F(IgReactNavigatorModule.URL, dataString);
            if (!TextUtils.isEmpty(stringExtra)) {
                F2.m3298F("short_url", stringExtra);
            }
            F2.m3298F("fbid", AnonymousClass0a2.m5424I(this.f2721B));
            F2.m3300H("fb_installed", AnonymousClass0Om.m3648F());
            F2.m3298F("waterfall_id", AnonymousClass0Fr.m1682B());
            F2.m3310R();
            AnonymousClass0Hz anonymousClass0Hz = (AnonymousClass0Hz) A.f2727B;
            Bundle bundle = (Bundle) A.f2728C;
            bundle.putString("original_url", dataString);
            bundle.putString("com.instagram.url.constants.ARGUMENTS_KEY_ANALYTICS_MODULE_NAME", getModuleName());
            if (!anonymousClass0Hz.HLA()) {
                findViewById(C0164R.id.layout_container_main).setBackground(new ColorDrawable(AnonymousClass0Ca.m937C(this, C0164R.color.white)));
            }
            anonymousClass0Hz.jU(bundle, this, this.f2721B);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("unable to handle url:");
        stringBuilder.append(dataString);
        AnonymousClass0Gn.m1876C("url_handler", stringBuilder.toString());
        finish();
    }

    /* renamed from: N */
    public final void mo442N() {
        if (mo382D().mo1456H() > 0) {
            super.mo442N();
            return;
        }
        AnonymousClass0Iz.f2854L.m2407J(this, "up");
        if (!this.f2722C) {
            AnonymousClass0IW.m2243I(AnonymousClass0EM.f1972B.mo257B(this, 268566528), this);
        }
        finish();
    }

    public final void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.m5852B(this, 2087277595);
        super.onCreate(bundle);
        AnonymousClass0F9.m1509C().m1518H(AnonymousClass0Kl.DEEPLINK);
        AnonymousClass0Cn F = AnonymousClass0Ce.m949F((Object) this);
        this.f2721B = F;
        if (F.xX()) {
            AnonymousClass0dL.m6024B(AnonymousClass0FL.m1559B(this.f2721B)).m6026B(getApplicationContext(), null);
        }
        if (AnonymousClass0IX.m2261G(getIntent()) && bundle == null && this.f2721B.xX()) {
            AnonymousClass0cq anonymousClass0cq = new AnonymousClass0cq();
            anonymousClass0cq.f7260G = getResources().getString(C0164R.string.logged_in_as, new Object[]{AnonymousClass0FL.m1559B(this.f2721B).m1037B().uT()});
            AnonymousClass0F4.f2058E.m1505B(new AnonymousClass0cs(anonymousClass0cq.m5927A()));
        }
        m2112B(getIntent());
        AnonymousClass0cQ.m5853C(this, 873011247, B);
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m2112B(intent);
    }
}
