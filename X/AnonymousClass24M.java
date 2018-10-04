package X;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;

/* renamed from: X.24M */
public final class AnonymousClass24M extends AnonymousClass0lb {
    /* renamed from: B */
    public final /* synthetic */ WeakReference f25612B;

    /* renamed from: B */
    public final void m14329B() {
    }

    public AnonymousClass24M(AnonymousClass24N anonymousClass24N, int i, int i2, int i3, int i4, WeakReference weakReference) {
        this.f25612B = weakReference;
        super(i, i2, i3, i4);
    }

    /* renamed from: A */
    public final Bitmap m14328A() {
        return (Bitmap) this.f25612B.get();
    }
}
