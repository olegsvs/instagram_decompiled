package com.instagram.direct.share.handler;

import X.AnonymousClass0Cd;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0EE;
import X.AnonymousClass0EH;
import X.AnonymousClass0EQ;
import X.AnonymousClass0Gn;
import X.AnonymousClass0IW;
import X.AnonymousClass0Iz;
import X.AnonymousClass0J7;
import X.AnonymousClass0NN;
import X.AnonymousClass0Sn;
import X.AnonymousClass0V7;
import X.AnonymousClass0cQ;
import X.AnonymousClass1S1;
import X.AnonymousClass3Im;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.service.session.ShouldInitUserSession;

@ShouldInitUserSession
public class DirectShareHandlerActivity extends Activity implements AnonymousClass0EE {
    /* renamed from: B */
    public AnonymousClass0Cm f5256B;
    /* renamed from: C */
    private String f5257C;

    public final String getModuleName() {
        return "direct_system_share_handler";
    }

    /* renamed from: B */
    private void m4570B() {
        Context context = this;
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("com.instagram.share.choosertarget.DirectChooserTargetService.THREAD_ID");
        CharSequence stringExtra2 = intent.getStringExtra("android.intent.extra.TEXT");
        if (TextUtils.isEmpty(stringExtra2)) {
            stringExtra2 = JsonProperty.USE_DEFAULT_NAME;
        }
        this.f5257C = stringExtra2;
        if (TextUtils.isEmpty(stringExtra2)) {
            Toast.makeText(this, getResources().getString(C0164R.string.direct_share_intent_unsupported_file_type), 0).show();
            AnonymousClass0Gn.m1876C("DirectShareHandlerActivity", "share handler called with no content, or trying to send .txt file");
            finish();
            return;
        }
        AnonymousClass0NN.m3291B("direct_share_extension_external", (AnonymousClass0EE) this).m3298F("thread_id", stringExtra).m3310R();
        if (stringExtra != null) {
            if (!stringExtra.isEmpty()) {
                AnonymousClass0J7.f2895B.mo535Q(this, this.f5256B, "os_system_share", this).ISA(stringExtra).bQA(this.f5257C).DZ();
                finish();
            }
        }
        AnonymousClass3Im A = AnonymousClass0J7.f2895B.mo533O().m2492A(this.f5256B);
        A.f39972B.putBoolean("DirectPrivateStoryRecipientFragment.DIRECT_IS_SHARE_INTENT", true);
        A.f39972B.putString("bundle_share_text", this.f5257C);
        AnonymousClass0Sn anonymousClass0Sn = new AnonymousClass0Sn(TransparentModalActivity.class, "direct_private_story_recipients", A.f39972B, context, this.f5256B.f1759C);
        Intent A2 = anonymousClass0Sn.m4402A(context);
        AnonymousClass0Iz.f2854L.m2407J(context, anonymousClass0Sn.f5014C);
        AnonymousClass1S1 anonymousClass1S1 = anonymousClass0Sn.f5015D;
        if (anonymousClass1S1 != null) {
            AnonymousClass1S1.m11463B(anonymousClass1S1);
        }
        AnonymousClass0IW.m2245K(A2, 4919, context);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 4919) {
            if (i2 == -1) {
                AnonymousClass0IW.m2243I(AnonymousClass0V7.m4858B(this, 67174400), this);
                finish();
                return;
            }
        }
        finish();
    }

    public final void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.m5852B(this, -217129551);
        AnonymousClass0EH.m1380J(getResources());
        super.onCreate(bundle);
        if (AnonymousClass0Cd.f1698B.m970N()) {
            this.f5256B = AnonymousClass0Ce.m951H(this);
            m4570B();
            AnonymousClass0cQ.m5853C(this, -1611867387, B);
            return;
        }
        AnonymousClass0EQ.f1975B.m1399A(this, null);
        AnonymousClass0cQ.m5853C(this, 781338163, B);
    }
}
