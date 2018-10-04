package X;

import android.os.PowerManager.WakeLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.FutureTask;

/* renamed from: X.2oO */
public final class AnonymousClass2oO extends FutureTask {
    /* renamed from: B */
    public final ArrayList f34262B = new ArrayList();
    /* renamed from: C */
    public final UUID f34263C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Ne f34264D;
    /* renamed from: E */
    private volatile boolean f34265E;

    public AnonymousClass2oO(AnonymousClass0Ne anonymousClass0Ne, UUID uuid, WakeLock wakeLock, Callable callable, String str) {
        this.f34264D = anonymousClass0Ne;
        super(callable);
        if (str == null) {
            throw new NullPointerException("OpticFutureTask cannot have a null name.");
        } else if (uuid != null) {
            this.f34263C = uuid;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SessionId is null! Attempting to schedule task: ");
            stringBuilder.append(str);
            throw new NullPointerException(stringBuilder.toString());
        }
    }

    /* renamed from: B */
    private void m17268B() {
        if (this.f34264D.f3658G != null) {
            AnonymousClass1DI.C(this.f34264D.f3658G, 60000, -2115877648);
        }
    }

    /* renamed from: C */
    private synchronized void m17269C() {
        Iterator it;
        AnonymousClass0Ne anonymousClass0Ne;
        UUID uuid;
        Runnable anonymousClass2oL;
        ArrayList arrayList = new ArrayList(this.f34262B);
        this.f34262B.clear();
        try {
            Object obj = get();
            it = arrayList.iterator();
            while (it.hasNext()) {
                ((AnonymousClass3sw) it.next()).mo5130C(obj);
            }
            this.f34264D.G(this.f34263C, new AnonymousClass2oK(this, arrayList, obj));
        } catch (CancellationException e) {
            anonymousClass0Ne = this.f34264D;
            uuid = this.f34263C;
            anonymousClass2oL = new AnonymousClass2oL(this, arrayList, e);
            anonymousClass0Ne.G(uuid, anonymousClass2oL);
        } catch (Exception e2) {
            if (arrayList.isEmpty()) {
                if ((this.f34264D.f3654C.getLooper().getThread() != Thread.currentThread() ? null : 1) == null) {
                    this.f34264D.G(this.f34263C, new AnonymousClass2oM(this, e2));
                }
            } else {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    AnonymousClass3sw anonymousClass3sw = (AnonymousClass3sw) it.next();
                }
                anonymousClass0Ne = this.f34264D;
                uuid = this.f34263C;
                anonymousClass2oL = new AnonymousClass2oN(this, arrayList, e2);
                anonymousClass0Ne.G(uuid, anonymousClass2oL);
            }
        }
    }

    /* renamed from: D */
    private synchronized void m17270D(boolean z) {
    }

    public final boolean cancel(boolean z) {
        return super.cancel(z);
    }

    public final void done() {
        if (this.f34264D.f3658G != null && this.f34264D.f3658G.isHeld()) {
            AnonymousClass1DI.E(this.f34264D.f3658G, 1456671698);
        }
        super.done();
        m17269C();
        m17270D(false);
    }

    public final void run() {
        m17268B();
        m17270D(true);
        super.run();
    }

    public final boolean runAndReset() {
        m17268B();
        m17270D(true);
        return super.runAndReset();
    }
}
