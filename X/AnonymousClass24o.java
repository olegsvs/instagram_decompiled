package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.gallery.Draft;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* renamed from: X.24o */
public final class AnonymousClass24o implements AnonymousClass0RL {
    /* renamed from: B */
    public final Options f25658B;
    /* renamed from: C */
    public final int f25659C;
    /* renamed from: D */
    private final Executor f25660D = AnonymousClass25A.f25726B;

    public final void Ao(AnonymousClass0aa anonymousClass0aa) {
    }

    public final void Bo(AnonymousClass0aa anonymousClass0aa, int i) {
    }

    public AnonymousClass24o(int i) {
        this.f25659C = i;
        Options options = new Options();
        this.f25658B = options;
        options.inJustDecodeBounds = true;
        Handler handler = new Handler(Looper.getMainLooper());
    }

    /* renamed from: A */
    public final void m14349A(Draft draft, AnonymousClass24n anonymousClass24n) {
        AnonymousClass0GG.B(this.f25660D, new AnonymousClass24l(this, draft, new WeakReference(anonymousClass24n)), 251710373);
    }

    public final void Se(AnonymousClass0aa anonymousClass0aa, Bitmap bitmap) {
        AnonymousClass24m anonymousClass24m = (AnonymousClass24m) anonymousClass0aa.f6576M;
        AnonymousClass24n anonymousClass24n = (AnonymousClass24n) anonymousClass24m.f25657C.get();
        Draft draft = anonymousClass24m.f25656B;
        if (anonymousClass24n != null && anonymousClass24n.qX(draft)) {
            anonymousClass24n.SDA(draft, bitmap);
        }
    }
}
