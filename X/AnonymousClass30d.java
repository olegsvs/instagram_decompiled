package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Looper;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.30d */
public final class AnonymousClass30d implements AnonymousClass0GA {
    /* renamed from: B */
    public final WeakReference f36837B;
    /* renamed from: C */
    public Bitmap f36838C;
    /* renamed from: D */
    public AnonymousClass0Ls f36839D;
    /* renamed from: E */
    public String f36840E;
    /* renamed from: F */
    public final AnonymousClass30n f36841F;
    /* renamed from: G */
    public boolean f36842G;
    /* renamed from: H */
    public AnonymousClass30c f36843H;
    /* renamed from: I */
    public AnonymousClass0Iw f36844I;
    /* renamed from: J */
    public final AnonymousClass0Cm f36845J;
    /* renamed from: K */
    public boolean f36846K;

    public final String getName() {
        return "UploadCustomCoverTask";
    }

    public final void onStart() {
    }

    public AnonymousClass30d(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass30n anonymousClass30n, Activity activity) {
        this.f36845J = anonymousClass0Cm;
        this.f36841F = anonymousClass30n;
        this.f36837B = new WeakReference(activity);
    }

    /* renamed from: B */
    public static void m18184B(AnonymousClass30d anonymousClass30d, AnonymousClass30c anonymousClass30c, AnonymousClass0Iw anonymousClass0Iw) {
        if (anonymousClass30d.f36846K) {
            String str = anonymousClass30d.f36840E;
            AnonymousClass0Ls anonymousClass0Ls = anonymousClass30d.f36839D;
            anonymousClass30c.Ji(str, anonymousClass0Ls, new Rect(0, 0, anonymousClass0Ls.f3296G, anonymousClass30d.f36839D.f3292C));
            anonymousClass30c.onFinish();
            return;
        }
        anonymousClass0Iw.onFail(new AnonymousClass0Q6(null));
    }

    public final void onFinish() {
        this.f36842G = true;
        AnonymousClass30c anonymousClass30c = this.f36843H;
        if (anonymousClass30c != null) {
            AnonymousClass30d.m18184B(this, anonymousClass30c, this.f36844I);
            this.f36843H = null;
            this.f36844I = null;
        }
    }

    public final void run() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            try {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                AnonymousClass0RJ D = AnonymousClass0Gs.f2431j.D(this.f36841F.f36863D.f3295F);
                D.f4635F = false;
                D.C(new AnonymousClass30a(this, countDownLatch)).B();
                countDownLatch.await();
                Rect G = AnonymousClass2Mh.m15235G(this.f36838C.getWidth(), this.f36838C.getHeight(), 1, 1, this.f36841F.f36862C);
                int min = Math.min(1080, Math.min(G.width(), G.height()));
                Bitmap N = AnonymousClass0rm.N(this.f36838C, min, min, AnonymousClass2Mh.m15232D(G));
                this.f36838C = null;
                File F = AnonymousClass1Ag.F((Context) this.f36837B.get());
                AnonymousClass0rm.R(N, F);
                countDownLatch = new CountDownLatch(1);
                ((Activity) this.f36837B.get()).runOnUiThread(new AnonymousClass30b(this, N, F, countDownLatch));
                countDownLatch.await();
                return;
            } catch (Throwable e) {
                throw new RuntimeException("UploadCustomCoverTask was interrupted", e);
            }
        }
        throw new IllegalStateException("UploadCustomCoverTask must not be run on UI thread");
    }
}
