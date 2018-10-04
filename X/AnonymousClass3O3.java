package X;

import android.graphics.Bitmap;
import com.facebook.common.dextricks.DexStore;

/* renamed from: X.3O3 */
public final class AnonymousClass3O3 implements AnonymousClass0z0 {
    /* renamed from: B */
    public final /* synthetic */ int f40708B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0gk f40709C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0P7 f40710D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0jC f40711E;
    /* renamed from: F */
    public final /* synthetic */ int f40712F;

    public AnonymousClass3O3(AnonymousClass0jC anonymousClass0jC, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0gk anonymousClass0gk, int i, int i2) {
        this.f40711E = anonymousClass0jC;
        this.f40710D = anonymousClass0P7;
        this.f40709C = anonymousClass0gk;
        this.f40712F = i;
        this.f40708B = i2;
    }

    public final void dl() {
        AnonymousClass0gk anonymousClass0gk = this.f40709C;
        if (anonymousClass0gk != null) {
            anonymousClass0gk.Mr(this.f40710D, this.f40712F, this.f40708B);
        }
    }

    public final void kp(Bitmap bitmap) {
        if (this.f40711E != null) {
            this.f40711E.B(this.f40710D, bitmap.getByteCount() / DexStore.LOAD_RESULT_MIXED_MODE);
        }
        AnonymousClass0gk anonymousClass0gk = this.f40709C;
        if (anonymousClass0gk != null) {
            anonymousClass0gk.Nr(this.f40710D, this.f40712F, this.f40708B);
        }
    }
}
