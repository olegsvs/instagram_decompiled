package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.30b */
public final class AnonymousClass30b implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass30d f36833B;
    /* renamed from: C */
    public final /* synthetic */ Bitmap f36834C;
    /* renamed from: D */
    public final /* synthetic */ File f36835D;
    /* renamed from: E */
    public final /* synthetic */ CountDownLatch f36836E;

    public AnonymousClass30b(AnonymousClass30d anonymousClass30d, Bitmap bitmap, File file, CountDownLatch countDownLatch) {
        this.f36833B = anonymousClass30d;
        this.f36834C = bitmap;
        this.f36835D = file;
        this.f36836E = countDownLatch;
    }

    public final void run() {
        this.f36833B.f36840E = String.valueOf(System.nanoTime());
        this.f36833B.f36839D = new AnonymousClass0Ls();
        this.f36833B.f36839D.f3296G = this.f36834C.getWidth();
        this.f36833B.f36839D.f3292C = this.f36834C.getHeight();
        this.f36833B.f36839D.f3295F = Uri.fromFile(this.f36835D).toString();
        AnonymousClass0OA C = AnonymousClass0OA.C(this.f36833B.f36840E);
        C.DB = this.f36835D.getPath();
        C.sB = this.f36834C.getWidth();
        C.pB = this.f36834C.getHeight();
        C.MA(this.f36834C.getWidth(), this.f36834C.getHeight());
        C.KA(AnonymousClass0OK.UNKNOWN);
        AnonymousClass0GK E = AnonymousClass0GK.E((Context) this.f36833B.f36837B.get(), this.f36833B.f36845J);
        AnonymousClass0GK.M(C);
        E.K(C);
        E.f2341C.add(new AnonymousClass3wt(this, C));
    }
}
