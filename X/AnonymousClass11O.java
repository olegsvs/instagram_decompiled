package X;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* renamed from: X.11O */
public abstract class AnonymousClass11O extends AnonymousClass0dN {
    /* renamed from: B */
    public volatile AnonymousClass13l f13398B;
    /* renamed from: C */
    public Handler f13399C;
    /* renamed from: D */
    public long f13400D;
    /* renamed from: E */
    public volatile AnonymousClass13l f13401E;
    /* renamed from: F */
    public long f13402F;
    /* renamed from: G */
    private final Executor f13403G;

    /* renamed from: L */
    public abstract Object mo2040L();

    /* renamed from: M */
    public void m8794M(Object obj) {
    }

    public AnonymousClass11O(Context context) {
        this(context, AnonymousClass11P.f13404G);
    }

    private AnonymousClass11O(Context context, Executor executor) {
        super(context);
        this.f13400D = -10000;
        this.f13403G = executor;
    }

    /* renamed from: B */
    public final void mo2044B(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo2044B(str, fileDescriptor, printWriter, strArr);
        if (this.f13401E != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f13401E);
            printWriter.print(" waiting=");
            printWriter.println(this.f13401E.f13775C);
        }
        if (this.f13398B != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f13398B);
            printWriter.print(" waiting=");
            printWriter.println(this.f13398B.f13775C);
        }
        if (this.f13402F != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            AnonymousClass1mZ.C(this.f13402F, printWriter, 0);
            printWriter.print(" mLastLoadCompleteTime=");
            AnonymousClass1mZ.B(this.f13400D, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    /* renamed from: C */
    public final boolean mo2045C() {
        if (this.f13401E == null) {
            return false;
        }
        if (!this.f7442I) {
            this.f7436C = true;
        }
        if (this.f13398B != null) {
            if (this.f13401E.f13775C) {
                this.f13401E.f13775C = false;
                AnonymousClass0OR.m3627G(this.f13399C, this.f13401E, -197688683);
            }
            this.f13401E = null;
            return false;
        } else if (this.f13401E.f13775C) {
            this.f13401E.f13775C = false;
            AnonymousClass0OR.m3627G(this.f13399C, this.f13401E, -563528373);
            this.f13401E = null;
            return false;
        } else {
            AnonymousClass11P anonymousClass11P = this.f13401E;
            anonymousClass11P.f13408B.set(true);
            boolean cancel = anonymousClass11P.f13409C.cancel(false);
            if (cancel) {
                this.f13398B = this.f13401E;
            }
            this.f13401E = null;
            return cancel;
        }
    }

    /* renamed from: D */
    public final void mo2046D() {
        super.mo2046D();
        mo2045C();
        this.f13401E = new AnonymousClass13l(this);
        m8792K();
    }

    /* renamed from: J */
    public final void m8791J(AnonymousClass13l anonymousClass13l, Object obj) {
        m8794M(obj);
        if (this.f13398B == anonymousClass13l) {
            if (this.f7440G) {
                if (this.f7442I) {
                    mo2046D();
                } else {
                    this.f7436C = true;
                }
            }
            this.f13400D = SystemClock.uptimeMillis();
            this.f13398B = null;
            AnonymousClass1lt anonymousClass1lt = this.f7439F;
            if (anonymousClass1lt != null) {
                anonymousClass1lt.op(this);
            }
            m8792K();
        }
    }

    /* renamed from: K */
    public final void m8792K() {
        if (this.f13398B == null && this.f13401E != null) {
            if (this.f13401E.f13775C) {
                this.f13401E.f13775C = false;
                AnonymousClass0OR.m3627G(this.f13399C, this.f13401E, 1888211848);
            }
            if (this.f13402F <= 0 || SystemClock.uptimeMillis() >= this.f13400D + this.f13402F) {
                AnonymousClass13q.m9124B(this.f13401E, this.f13403G, (Void[]) null, 2006500392);
            } else {
                this.f13401E.f13775C = true;
                long j = this.f13400D + this.f13402F;
                this.f13399C.postAtTime(AnonymousClass0OR.m3623C(this.f13401E, -946884025), j);
            }
        }
    }
}
