package X;

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0ay */
public abstract class AnonymousClass0ay {
    /* renamed from: F */
    private static volatile Executor f6618F = AnonymousClass0Fx.m1698B();
    /* renamed from: G */
    private static final AnonymousClass1Bp f6619G = new AnonymousClass1Bp(Looper.getMainLooper());
    /* renamed from: B */
    public final FutureTask f6620B = new AnonymousClass1Bt(this, this.f6623E);
    /* renamed from: C */
    public volatile AnonymousClass1Bq f6621C = AnonymousClass1Bq.PENDING;
    /* renamed from: D */
    public final AtomicBoolean f6622D = new AtomicBoolean();
    /* renamed from: E */
    private final AnonymousClass1Bs f6623E = new AnonymousClass1Br(this);

    /* renamed from: A */
    public abstract Object mo1397A(Object... objArr);

    /* renamed from: D */
    public void mo1398D(Object obj) {
    }

    /* renamed from: E */
    public void mo1399E() {
    }

    /* renamed from: B */
    public final AnonymousClass0ay m5502B(Object... objArr) {
        return m5503C(f6618F, objArr);
    }

    /* renamed from: B */
    public static Object m5500B(AnonymousClass0ay anonymousClass0ay, Object obj) {
        f6619G.obtainMessage(1, new AnonymousClass1Om(anonymousClass0ay, obj)).sendToTarget();
        return obj;
    }

    /* renamed from: C */
    public final AnonymousClass0ay m5503C(Executor executor, Object... objArr) {
        if (this.f6621C != AnonymousClass1Bq.PENDING) {
            switch (this.f6621C.ordinal()) {
                case 1:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case 2:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                default:
                    break;
            }
        }
        this.f6621C = AnonymousClass1Bq.RUNNING;
        mo1399E();
        this.f6623E.f15463B = objArr;
        AnonymousClass0GG.m1763B(executor, this.f6620B, 377049807);
        return this;
    }
}
