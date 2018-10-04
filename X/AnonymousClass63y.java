package X;

import android.graphics.Bitmap;

/* renamed from: X.63y */
public final class AnonymousClass63y implements AnonymousClass0RL {
    /* renamed from: B */
    public final AnonymousClass63z f71393B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass640 f71394C;

    public final void Bo(AnonymousClass0aa anonymousClass0aa, int i) {
    }

    public AnonymousClass63y(AnonymousClass640 anonymousClass640, AnonymousClass63z anonymousClass63z) {
        this.f71394C = anonymousClass640;
        this.f71393B = anonymousClass63z;
    }

    public final void Ao(AnonymousClass0aa anonymousClass0aa) {
        this.f71394C.f71402G.remove(this.f71393B.f71395B);
    }

    public final void Se(AnonymousClass0aa anonymousClass0aa, Bitmap bitmap) {
        this.f71394C.f71402G.remove(this.f71393B.f71395B);
        boolean isEmpty = this.f71394C.f71403H.isEmpty();
        this.f71394C.f71403H.add(this.f71393B);
        if (isEmpty && this.f71394C.f71399D.isResumed()) {
            this.f71394C.f71400E.sendEmptyMessageDelayed(1, 800);
        }
    }
}
