package X;

import android.graphics.Bitmap;

/* renamed from: X.2hX */
public final class AnonymousClass2hX implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2hZ f32569B;
    /* renamed from: C */
    public final /* synthetic */ Bitmap f32570C;

    public AnonymousClass2hX(AnonymousClass2hZ anonymousClass2hZ, Bitmap bitmap) {
        this.f32569B = anonymousClass2hZ;
        this.f32570C = bitmap;
    }

    public final void run() {
        if (this.f32569B.f32574C != null) {
            AnonymousClass2nY anonymousClass2nY = this.f32569B.f32574C;
            AnonymousClass0eB.T(anonymousClass2nY.f52863B, anonymousClass2nY, this.f32570C);
        }
    }
}
