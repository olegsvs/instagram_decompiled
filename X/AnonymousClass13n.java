package X;

import android.os.Binder;
import android.os.Process;

/* renamed from: X.13n */
public final class AnonymousClass13n extends AnonymousClass13o {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass11P f13781B;

    public AnonymousClass13n(AnonymousClass11P anonymousClass11P) {
        this.f13781B = anonymousClass11P;
    }

    public final Object call() {
        Throwable th;
        this.f13781B.f13411E.set(true);
        Object obj = null;
        try {
            Process.setThreadPriority(10);
            obj = this.f13781B.mo2095A(this.f13782B);
            try {
                Binder.flushPendingCommands();
                this.f13781B.m8800F(obj);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                this.f13781B.m8800F(obj);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            this.f13781B.f13408B.set(true);
            throw th;
        }
    }
}
