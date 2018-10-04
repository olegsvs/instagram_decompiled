package X;

import android.os.ConditionVariable;

/* renamed from: X.2tb */
public final class AnonymousClass2tb extends Thread {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3uq f35463B;
    /* renamed from: C */
    public final /* synthetic */ ConditionVariable f35464C;

    public AnonymousClass2tb(AnonymousClass3uq anonymousClass3uq, ConditionVariable conditionVariable) {
        this.f35463B = anonymousClass3uq;
        this.f35464C = conditionVariable;
    }

    public final void run() {
        this.f35464C.open();
        synchronized (this.f35463B) {
            AnonymousClass3uq.m21420C(this.f35463B);
        }
    }
}
