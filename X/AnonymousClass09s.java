package X;

import android.app.job.JobWorkItem;
import android.content.Intent;

/* renamed from: X.09s */
public final class AnonymousClass09s implements AnonymousClass003 {
    /* renamed from: B */
    public final JobWorkItem f1130B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass09t f1131C;

    public AnonymousClass09s(AnonymousClass09t anonymousClass09t, JobWorkItem jobWorkItem) {
        this.f1131C = anonymousClass09t;
        this.f1130B = jobWorkItem;
    }

    public final Intent KN() {
        return this.f1130B.getIntent();
    }

    public final void uE() {
        synchronized (this.f1131C.f1132B) {
            if (this.f1131C.f1133C != null) {
                this.f1131C.f1133C.completeWork(this.f1130B);
            }
        }
    }
}
