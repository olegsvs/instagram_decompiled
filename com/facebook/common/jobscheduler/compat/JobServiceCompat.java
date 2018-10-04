package com.facebook.common.jobscheduler.compat;

import X.AnonymousClass0Dc;
import X.AnonymousClass0cQ;
import X.AnonymousClass1FJ;
import X.AnonymousClass1aI;
import X.AnonymousClass1hd;
import X.AnonymousClass1hv;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;

public abstract class JobServiceCompat extends JobService {
    public abstract AnonymousClass1FJ getRunJobLogic();

    public void cancelJob(Context context, int i) {
        ((JobScheduler) context.getSystemService("jobscheduler")).cancel(i);
    }

    private static boolean isJobVersionCodeValid(PersistableBundle persistableBundle) {
        if (persistableBundle == null) {
            AnonymousClass0Dc.F("JobServiceCompat", "Job with no version code, cancelling job");
            return false;
        }
        int i = persistableBundle.getInt("__VERSION_CODE", 0);
        if (125398471 == i) {
            return true;
        }
        Integer.valueOf(i);
        return false;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int J = AnonymousClass0cQ.J(this, -1247149497);
        int onStartCommand = getRunJobLogic().onStartCommand(intent, i, i2, this);
        AnonymousClass0cQ.K(this, 925118995, J);
        return onStartCommand;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        if (!isJobVersionCodeValid(jobParameters.getExtras())) {
            Integer.valueOf(jobParameters.getJobId());
            return false;
        } else if (AnonymousClass1aI.B(this, 0).A(jobParameters.getJobId(), getClass())) {
            boolean onStartJob = getRunJobLogic().onStartJob(jobParameters.getJobId(), new Bundle(jobParameters.getExtras()), new AnonymousClass1hd(this, jobParameters, this));
            if (!onStartJob) {
                AnonymousClass1hv B = AnonymousClass1hv.B(this);
                synchronized (B) {
                    B.A(jobParameters.getJobId());
                }
            }
            return onStartJob;
        } else {
            Integer.valueOf(jobParameters.getJobId());
            cancelJob(this, jobParameters.getJobId());
            return false;
        }
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        boolean onStopJob = getRunJobLogic().onStopJob(jobParameters.getJobId());
        if (!onStopJob) {
            AnonymousClass1hv B = AnonymousClass1hv.B(this);
            synchronized (B) {
                B.A(jobParameters.getJobId());
            }
        }
        return onStopJob;
    }
}
