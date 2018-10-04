package X;

import android.content.Context;
import com.facebook.C0164R;

/* renamed from: X.5Xj */
public final class AnonymousClass5Xj extends AnonymousClass4qs {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5bt f65970B;

    public AnonymousClass5Xj(AnonymousClass5bt anonymousClass5bt, Context context, AnonymousClass5Xf anonymousClass5Xf, AnonymousClass4rZ anonymousClass4rZ) {
        this.f65970B = anonymousClass5bt;
        super(context, anonymousClass5Xf, anonymousClass4rZ);
    }

    /* renamed from: A */
    public final void mo5752A(AnonymousClass3Px anonymousClass3Px) {
        int I = AnonymousClass0cQ.I(this, -76883539);
        super.mo5752A(anonymousClass3Px);
        AnonymousClass3Po C = AnonymousClass3Po.C();
        AnonymousClass0NN B = AnonymousClass3Po.B(C, AnonymousClass3Pm.CONSENT_EMAIL_SUCCESS, this.f65970B);
        B.F("user_state", C.f40956C.toString());
        AnonymousClass3Po.D(B);
        B.R();
        AnonymousClass0cQ.H(this, 2051979142, I);
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        String A;
        int I = AnonymousClass0cQ.I(this, -106797519);
        if (anonymousClass0Q6.B()) {
            A = ((AnonymousClass3Px) anonymousClass0Q6.f4288C).A();
        } else {
            A = this.f65970B.getResources().getString(C0164R.string.something_went_wrong);
        }
        AnonymousClass5bt.m27950C(this.f65970B, A);
        AnonymousClass0cQ.H(this, -1261891823, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -940629620);
        mo5752A((AnonymousClass3Px) obj);
        AnonymousClass0cQ.H(this, -269286790, I);
    }
}
