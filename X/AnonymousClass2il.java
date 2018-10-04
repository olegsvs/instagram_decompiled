package X;

import android.os.Handler;

/* renamed from: X.2il */
public final class AnonymousClass2il implements AnonymousClass1rn {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3rp f32935B;
    /* renamed from: C */
    public final /* synthetic */ Handler f32936C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass2in f32937D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass1rn f32938E;

    public AnonymousClass2il(AnonymousClass3rp anonymousClass3rp, AnonymousClass2in anonymousClass2in, AnonymousClass1rn anonymousClass1rn, Handler handler) {
        this.f32935B = anonymousClass3rp;
        this.f32937D = anonymousClass2in;
        this.f32938E = anonymousClass1rn;
        this.f32936C = handler;
    }

    public final void onSuccess() {
        this.f32935B.f45484R = null;
        this.f32935B.f45472F = false;
        if (this.f32937D.m16990A() == 0) {
            AnonymousClass3rp.m20964B(this.f32935B, this.f32938E, this.f32936C);
        }
    }

    public final void tk(Throwable th) {
        AnonymousClass1rq.m13520B(this.f32938E, this.f32936C, th);
    }
}
