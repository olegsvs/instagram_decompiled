package X;

import android.graphics.Bitmap;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.0aU */
public final class AnonymousClass0aU implements AnonymousClass0RL {
    /* renamed from: B */
    public Bitmap f6525B;
    /* renamed from: C */
    public final CountDownLatch f6526C = new CountDownLatch(1);

    public final void Bo(AnonymousClass0aa anonymousClass0aa, int i) {
    }

    public final void Ao(AnonymousClass0aa anonymousClass0aa) {
        this.f6526C.countDown();
    }

    public final void Se(AnonymousClass0aa anonymousClass0aa, Bitmap bitmap) {
        this.f6525B = bitmap;
        this.f6526C.countDown();
    }
}
