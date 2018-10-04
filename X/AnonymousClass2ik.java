package X;

import android.os.Handler;

/* renamed from: X.2ik */
public final class AnonymousClass2ik implements AnonymousClass1rn {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1rn f32933B;
    /* renamed from: C */
    public final /* synthetic */ Handler f32934C;

    public AnonymousClass2ik(AnonymousClass3rp anonymousClass3rp, AnonymousClass1rn anonymousClass1rn, Handler handler) {
        this.f32933B = anonymousClass1rn;
        this.f32934C = handler;
    }

    public final void onSuccess() {
        AnonymousClass1rq.m13521C(this.f32933B, this.f32934C);
    }

    public final void tk(Throwable th) {
        AnonymousClass1rq.m13520B(this.f32933B, this.f32934C, th);
    }
}
