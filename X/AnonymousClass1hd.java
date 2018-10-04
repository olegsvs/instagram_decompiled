package X;

import android.app.job.JobParameters;
import android.content.Context;
import com.facebook.common.jobscheduler.compat.JobServiceCompat;

/* renamed from: X.1hd */
public final class AnonymousClass1hd implements AnonymousClass1TB {
    /* renamed from: B */
    public final /* synthetic */ JobServiceCompat f21537B;
    /* renamed from: C */
    private final Context f21538C;
    /* renamed from: D */
    private final JobParameters f21539D;

    public AnonymousClass1hd(JobServiceCompat jobServiceCompat, JobParameters jobParameters, Context context) {
        this.f21537B = jobServiceCompat;
        this.f21539D = jobParameters;
        this.f21538C = context;
    }

    public final void Kp(boolean z) {
        this.f21537B.jobFinished(this.f21539D, z);
        if (!z) {
            AnonymousClass1hv B = AnonymousClass1hv.m12637B(this.f21538C);
            synchronized (B) {
                B.m12638A(this.f21539D.getJobId());
            }
        }
    }
}
