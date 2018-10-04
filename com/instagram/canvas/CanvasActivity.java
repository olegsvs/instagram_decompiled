package com.instagram.canvas;

import X.AnonymousClass0IV;
import X.AnonymousClass0cQ;
import X.AnonymousClass3y9;
import android.os.Bundle;
import com.facebook.C0164R;
import com.instagram.base.activity.IgFragmentActivity;

public class CanvasActivity extends IgFragmentActivity {
    /* renamed from: B */
    private AnonymousClass3y9 f38229B;

    public final void onBackPressed() {
        this.f38229B.onBackPressed();
    }

    public final void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.B(this, 1797511702);
        super.onCreate(bundle);
        setContentView(C0164R.layout.activity_canvas);
        AnonymousClass3y9 anonymousClass3y9 = (AnonymousClass3y9) D().E(C0164R.id.layout_container_main);
        this.f38229B = anonymousClass3y9;
        if (anonymousClass3y9 == null) {
            this.f38229B = new AnonymousClass3y9();
            Bundle extras = getIntent().getExtras();
            extras.putBoolean("CanvasFragment.ARGUMENTS_CANVAS_CLOSE_ACTIVITY", true);
            this.f38229B.setArguments(extras);
            AnonymousClass0IV B2 = D().B();
            B2.M(C0164R.id.layout_container_main, this.f38229B);
            B2.F();
        }
        AnonymousClass0cQ.C(this, 184355600, B);
    }
}
