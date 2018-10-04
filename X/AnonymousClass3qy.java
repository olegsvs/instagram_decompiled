package X;

import android.os.Handler;

/* renamed from: X.3qy */
public final class AnonymousClass3qy implements AnonymousClass2gm {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3r4 f45313B;
    /* renamed from: C */
    public final /* synthetic */ Handler f45314C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass2gm f45315D;

    public AnonymousClass3qy(AnonymousClass3r4 anonymousClass3r4, AnonymousClass2gm anonymousClass2gm, Handler handler) {
        this.f45313B = anonymousClass3r4;
        this.f45315D = anonymousClass2gm;
        this.f45314C = handler;
    }

    public final void xu(double d) {
        if (this.f45315D != null) {
            AnonymousClass3r4.m20907D(this.f45313B, this.f45314C, new AnonymousClass2gK(this, d));
        }
    }
}
