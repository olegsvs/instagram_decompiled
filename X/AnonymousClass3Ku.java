package X;

import android.os.Bundle;
import android.widget.Toast;
import com.facebook.C0164R;

/* renamed from: X.3Ku */
public final class AnonymousClass3Ku extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0xX f40245B;
    /* renamed from: C */
    private final boolean f40246C = this.f40247D.sA();
    /* renamed from: D */
    private final AnonymousClass0P7 f40247D;
    /* renamed from: E */
    private final AnonymousClass2bl f40248E = new AnonymousClass2bl();

    public AnonymousClass3Ku(AnonymousClass0xX anonymousClass0xX, AnonymousClass0P7 anonymousClass0P7) {
        this.f40245B = anonymousClass0xX;
        this.f40247D = anonymousClass0P7;
        Bundle bundle = new Bundle();
        bundle.putBoolean("isDeleting", true);
        this.f40248E.setArguments(bundle);
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -1581399412);
        if (this.f40247D.sA()) {
            Toast.makeText(this.f40245B.f12596B, C0164R.string.delete_profile_photo_failed, 0).show();
        } else {
            Toast.makeText(this.f40245B.f12596B, C0164R.string.delete_media_post_failed, 0).show();
        }
        AnonymousClass0cQ.H(this, -1569373831, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, 204972192);
        this.f40248E.B();
        AnonymousClass0cQ.H(this, 1916039530, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, -1027627104);
        this.f40248E.D(this.f40245B.f12600F, "ProgressDialog");
        AnonymousClass0cQ.H(this, 48025658, I);
    }

    public final void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 1620299330);
        this.f40247D.f4042q = 1;
        this.f40247D.yC();
        AnonymousClass0Ci MA = this.f40247D.MA();
        if (!this.f40246C) {
            MA.N();
        }
        MA.D();
        AnonymousClass0cQ.H(this, 1925482801, I);
    }
}
