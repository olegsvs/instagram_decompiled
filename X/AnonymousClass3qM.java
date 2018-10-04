package X;

import android.graphics.Bitmap;

/* renamed from: X.3qM */
public final class AnonymousClass3qM implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3qO f45221B;
    /* renamed from: C */
    public final /* synthetic */ Bitmap f45222C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0aa f45223D;

    public AnonymousClass3qM(AnonymousClass3qO anonymousClass3qO, AnonymousClass0aa anonymousClass0aa, Bitmap bitmap) {
        this.f45221B = anonymousClass3qO;
        this.f45223D = anonymousClass0aa;
        this.f45222C = bitmap;
    }

    public final void run() {
        AnonymousClass3nn anonymousClass3nn = (AnonymousClass3nn) this.f45223D.f6576M;
        AnonymousClass3z3 anonymousClass3z3 = (AnonymousClass3z3) this.f45221B.f45231E.get(anonymousClass3nn.m20699B());
        if (anonymousClass3z3 != null && anonymousClass3nn.equals(anonymousClass3z3.f47824C)) {
            anonymousClass3z3.f39613B.setImageBitmap(this.f45222C);
        }
    }
}
