package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;
import java.lang.ref.WeakReference;

/* renamed from: X.252 */
public final class AnonymousClass252 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ Bitmap f25716B;
    /* renamed from: C */
    public final /* synthetic */ WeakReference f25717C;
    /* renamed from: D */
    public final /* synthetic */ Medium f25718D;

    public AnonymousClass252(AnonymousClass2Uf anonymousClass2Uf, WeakReference weakReference, Medium medium, Bitmap bitmap) {
        this.f25717C = weakReference;
        this.f25718D = medium;
        this.f25716B = bitmap;
    }

    public final void run() {
        AnonymousClass25B anonymousClass25B = (AnonymousClass25B) this.f25717C.get();
        if (anonymousClass25B != null && anonymousClass25B.rX(this.f25718D)) {
            Bitmap bitmap = this.f25716B;
            if (bitmap != null) {
                anonymousClass25B.TDA(this.f25718D, true, true, bitmap);
            } else {
                anonymousClass25B.ko(this.f25718D);
            }
        }
    }
}
