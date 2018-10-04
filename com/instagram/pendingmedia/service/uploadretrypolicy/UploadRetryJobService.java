package com.instagram.pendingmedia.service.uploadretrypolicy;

import X.AnonymousClass0Cd;
import X.AnonymousClass0Ce;
import X.AnonymousClass0GK;
import android.app.job.JobParameters;
import android.app.job.JobService;

public class UploadRetryJobService extends JobService {
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        if (jobParameters.getExtras().getString("ACTION").equals("ACTION_CONNECTED_ALARM")) {
            String str = "job service alarm";
            AnonymousClass0GK.m1769C(AnonymousClass0GK.m1772F(this, AnonymousClass0Ce.m945B(AnonymousClass0Cd.f1698B, jobParameters.getExtras().getString("IgSessionManager.USER_ID")), str), str, true);
        }
        return false;
    }
}
