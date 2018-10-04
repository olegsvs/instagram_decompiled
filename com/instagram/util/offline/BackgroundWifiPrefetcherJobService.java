package com.instagram.util.offline;

import X.AnonymousClass0Cd;
import X.AnonymousClass0Ce;
import X.AnonymousClass0hZ;
import X.AnonymousClass5LO;
import android.app.job.JobParameters;
import android.app.job.JobService;
import com.instagram.service.session.ShouldInitUserSession;

@ShouldInitUserSession
public class BackgroundWifiPrefetcherJobService extends JobService {
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        AnonymousClass0hZ.m6765C(getApplicationContext());
        AnonymousClass0hZ B = AnonymousClass0hZ.m6764B();
        if (AnonymousClass0Cd.f1698B.m970N()) {
            B.m6768A(AnonymousClass0Ce.m951H(this), new AnonymousClass5LO(this, jobParameters));
            return true;
        }
        AnonymousClass0hZ.m6766D(B);
        AnonymousClass0hZ.m6767E();
        return false;
    }
}
