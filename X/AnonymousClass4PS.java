package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.4PS */
public final class AnonymousClass4PS implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5cl f53741B;
    /* renamed from: C */
    public final /* synthetic */ Drawable f53742C;

    public AnonymousClass4PS(AnonymousClass5cl anonymousClass5cl, Drawable drawable) {
        this.f53741B = anonymousClass5cl;
        this.f53742C = drawable;
    }

    public final void run() {
        AnonymousClass5cl.C(this.f53741B, this.f53742C);
    }
}
