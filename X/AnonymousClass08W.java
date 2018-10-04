package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.08W */
public final class AnonymousClass08W extends BroadcastReceiver {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0B6 f924B;
    /* renamed from: C */
    public final /* synthetic */ AtomicBoolean f925C;
    /* renamed from: D */
    public final /* synthetic */ int f926D;
    /* renamed from: E */
    public final /* synthetic */ ScheduledFuture f927E;

    public AnonymousClass08W(AnonymousClass1Bh anonymousClass1Bh, AtomicBoolean atomicBoolean, ScheduledFuture scheduledFuture, int i, AnonymousClass0B6 anonymousClass0B6) {
        this.f925C = atomicBoolean;
        this.f927E = scheduledFuture;
        this.f926D = i;
        this.f924B = anonymousClass0B6;
    }

    public final void onReceive(Context context, Intent intent) {
        int D = AnonymousClass0cQ.m5854D(this, 1059122130);
        if (getResultCode() == -1 && this.f925C.compareAndSet(false, true)) {
            this.f927E.cancel(true);
            this.f924B.m764A(getResultExtras(true).getInt("shared_qe_flag", this.f926D));
        }
        AnonymousClass0cQ.m5855E(this, context, intent, -1563420482, D);
    }
}
