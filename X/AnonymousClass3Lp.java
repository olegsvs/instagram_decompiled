package X;

import android.content.Context;
import com.facebook.C0164R;

/* renamed from: X.3Lp */
public final class AnonymousClass3Lp extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ Context f40382B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0P7 f40383C;

    public AnonymousClass3Lp(AnonymousClass0P7 anonymousClass0P7, Context context) {
        this.f40383C = anonymousClass0P7;
        this.f40382B = context;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 985617820);
        super.onFail(anonymousClass0Q6);
        this.f40383C.f4039n = false;
        AnonymousClass0IG.C(this.f40382B, C0164R.string.network_error);
        this.f40383C.yC();
        AnonymousClass0cQ.H(this, 320699439, I);
    }
}
