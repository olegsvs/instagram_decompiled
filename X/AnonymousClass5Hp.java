package X;

import android.content.Context;

/* renamed from: X.5Hp */
public final class AnonymousClass5Hp extends AnonymousClass1fk {
    /* renamed from: B */
    private AnonymousClass0IU f61799B;

    public AnonymousClass5Hp(Context context, AnonymousClass0IU anonymousClass0IU) {
        super(context, null);
        this.f61799B = anonymousClass0IU;
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, 35090361);
        super.onFinish();
        AnonymousClass2Hg anonymousClass2Hg = (AnonymousClass2Hg) this.f61799B.F("ProgressDialog");
        if (anonymousClass2Hg != null) {
            anonymousClass2Hg.B();
        }
        AnonymousClass0cQ.H(this, 651220930, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, 2096236740);
        super.onStart();
        if (this.f61799B.F("ProgressDialog") == null) {
            new AnonymousClass5IG().E(this.f61799B.B(), "ProgressDialog", true);
        }
        AnonymousClass0cQ.H(this, 1944442239, I);
    }
}
