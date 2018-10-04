package com.instagram.lazyload.download;

import X.AnonymousClass3RW;
import X.AnonymousClass40h;
import android.app.job.JobParameters;
import android.app.job.JobService;
import com.instagram.service.session.ShouldInitUserSession;

@ShouldInitUserSession
public class ModuleDownloadJobService extends JobService {
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        return AnonymousClass3RW.m19657B(this, this, new AnonymousClass40h(this, jobParameters));
    }
}
