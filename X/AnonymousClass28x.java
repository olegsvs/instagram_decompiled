package X;

import pl.droidsonroids.gif.GifDecoder;

/* renamed from: X.28x */
public final class AnonymousClass28x implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass28y f26641B;
    /* renamed from: C */
    public final /* synthetic */ String f26642C;
    /* renamed from: D */
    public final /* synthetic */ GifDecoder f26643D;

    public AnonymousClass28x(AnonymousClass28y anonymousClass28y, GifDecoder gifDecoder, String str) {
        this.f26641B = anonymousClass28y;
        this.f26643D = gifDecoder;
        this.f26642C = str;
    }

    public final void run() {
        for (AnonymousClass293 Hq : AnonymousClass295.m14606C(this.f26641B.f26644B, this.f26641B.f26645C)) {
            Hq.Hq(this.f26641B.f26648F, this.f26643D, this.f26642C);
        }
        AnonymousClass295 anonymousClass295 = this.f26641B.f26644B;
        anonymousClass295.f26660B.remove(this.f26641B.f26645C);
    }
}
