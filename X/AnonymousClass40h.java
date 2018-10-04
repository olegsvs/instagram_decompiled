package X;

import android.app.job.JobParameters;
import com.instagram.lazyload.download.ModuleDownloadJobService;

/* renamed from: X.40h */
public final class AnonymousClass40h implements AnonymousClass3RV {
    /* renamed from: B */
    public final /* synthetic */ ModuleDownloadJobService f48317B;
    /* renamed from: C */
    public final /* synthetic */ JobParameters f48318C;

    public AnonymousClass40h(ModuleDownloadJobService moduleDownloadJobService, JobParameters jobParameters) {
        this.f48317B = moduleDownloadJobService;
        this.f48318C = jobParameters;
    }

    public final void Lj(boolean z) {
        this.f48317B.jobFinished(this.f48318C, z);
    }
}
