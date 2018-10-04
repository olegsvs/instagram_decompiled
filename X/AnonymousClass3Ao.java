package X;

import android.graphics.Bitmap;

/* renamed from: X.3Ao */
public final class AnonymousClass3Ao implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3As f38588B;
    /* renamed from: C */
    public final /* synthetic */ String f38589C;

    public AnonymousClass3Ao(String str, AnonymousClass3As anonymousClass3As) {
        this.f38589C = str;
        this.f38588B = anonymousClass3As;
    }

    public final void run() {
        Bitmap A = AnonymousClass0Gs.f2431j.A(this.f38589C);
        if (A != null) {
            AnonymousClass0Sy.F(new AnonymousClass3Am(this, AnonymousClass3At.m18835C(A, A.getWidth(), A.getHeight(), -16777216)));
            return;
        }
        AnonymousClass0Gn.H("MediaBackgroundGenerator", "unable to create background input file");
        AnonymousClass0Sy.F(new AnonymousClass3An(this));
    }
}
