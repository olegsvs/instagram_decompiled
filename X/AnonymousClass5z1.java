package X;

import android.graphics.Bitmap;
import com.facebook.common.dextricks.DexStore;

/* renamed from: X.5z1 */
public final class AnonymousClass5z1 implements AnonymousClass0z0 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0P7 f70605B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0jC f70606C;

    public final void dl() {
    }

    public AnonymousClass5z1(AnonymousClass0jC anonymousClass0jC, AnonymousClass0P7 anonymousClass0P7) {
        this.f70606C = anonymousClass0jC;
        this.f70605B = anonymousClass0P7;
    }

    public final void kp(Bitmap bitmap) {
        this.f70606C.B(this.f70605B, bitmap.getByteCount() / DexStore.LOAD_RESULT_MIXED_MODE);
    }
}
