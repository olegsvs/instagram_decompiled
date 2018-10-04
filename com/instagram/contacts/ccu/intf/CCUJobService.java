package com.instagram.contacts.ccu.intf;

import X.AnonymousClass4Ge;
import X.AnonymousClass5SK;
import android.app.job.JobParameters;
import android.app.job.JobService;

public class CCUJobService extends JobService {
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        AnonymousClass4Ge instance = AnonymousClass4Ge.getInstance(getApplicationContext());
        return instance != null ? instance.onStart(this, new AnonymousClass5SK(this, jobParameters)) : false;
    }
}
