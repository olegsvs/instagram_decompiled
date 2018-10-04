package X;

import android.os.Handler;

/* renamed from: X.2iT */
public final class AnonymousClass2iT implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3rl f32866B;
    /* renamed from: C */
    public final /* synthetic */ Handler f32867C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass1rn f32868D;

    public AnonymousClass2iT(AnonymousClass3rl anonymousClass3rl, AnonymousClass1rn anonymousClass1rn, Handler handler) {
        this.f32866B = anonymousClass3rl;
        this.f32868D = anonymousClass1rn;
        this.f32867C = handler;
    }

    public final void run() {
        AnonymousClass3rl.m20957C(this.f32866B, this.f32868D, this.f32867C);
    }
}
