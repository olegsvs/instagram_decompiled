package X;

import java.util.ArrayList;

/* renamed from: X.1FV */
public final class AnonymousClass1FV implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0UZ f16018B;

    public AnonymousClass1FV(AnonymousClass0UZ anonymousClass0UZ) {
        this.f16018B = anonymousClass0UZ;
    }

    public final void run() {
        AnonymousClass0UZ anonymousClass0UZ = this.f16018B;
        anonymousClass0UZ.f5477C = (AnonymousClass1Hr) anonymousClass0UZ.f5476B.m6427A(this.f16018B.f5479E, false);
        if (this.f16018B.f5477C == null) {
            this.f16018B.f5477C = new AnonymousClass1Hr(new ArrayList());
        }
    }
}
