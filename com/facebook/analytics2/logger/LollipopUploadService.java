package com.facebook.analytics2.logger;

import X.AnonymousClass0Dc;
import X.AnonymousClass0LR;
import X.AnonymousClass0cQ;
import X.AnonymousClass46b;
import X.AnonymousClass46c;
import X.AnonymousClass46d;
import X.AnonymousClass46e;
import X.AnonymousClass46g;
import X.AnonymousClass46h;
import X.AnonymousClass46o;
import X.AnonymousClass46p;
import X.AnonymousClass5RL;
import X.AnonymousClass5RS;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;

public class LollipopUploadService extends JobService {
    /* renamed from: B */
    public AnonymousClass46p f50309B;

    /* renamed from: B */
    private static boolean m23244B(PersistableBundle persistableBundle) {
        if (persistableBundle == null) {
            AnonymousClass0Dc.F("PostLolliopUploadService", "Job with no version code, cancelling job");
            return false;
        }
        int i = persistableBundle.getInt("__VERSION_CODE", 0);
        if (125398471 == i) {
            return true;
        }
        Integer.valueOf(i);
        return false;
    }

    public final void onCreate() {
        int J = AnonymousClass0cQ.J(this, 1066597169);
        this.f50309B = AnonymousClass46p.m23257B(this);
        AnonymousClass0cQ.K(this, 837422433, J);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int J = AnonymousClass0cQ.J(this, 970169453);
        int A = ((AnonymousClass46p) AnonymousClass0LR.D(this.f50309B)).m23260A(intent, new AnonymousClass46o(this, i2), 0);
        AnonymousClass0cQ.K(this, 1871451629, J);
        return A;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        if (m23244B(jobParameters.getExtras())) {
            try {
                boolean B;
                AnonymousClass46p anonymousClass46p = (AnonymousClass46p) AnonymousClass0LR.D(this.f50309B);
                int jobId = jobParameters.getJobId();
                String string = jobParameters.getExtras().getString("action");
                AnonymousClass46b anonymousClass46b = new AnonymousClass46b(new Bundle(jobParameters.getExtras()));
                AnonymousClass5RL anonymousClass5RL = new AnonymousClass5RL(this, jobParameters);
                UploadJobInstrumentation D = AnonymousClass46p.m23259D(anonymousClass46p, anonymousClass46b.f50321G);
                String C = D != null ? AnonymousClass46p.m23258C(anonymousClass46p, "JOB-", jobId) : null;
                if (D != null) {
                    D.recordUploadJobStart(0, (String) AnonymousClass0LR.D(C));
                }
                AnonymousClass46h anonymousClass46h = (AnonymousClass46h) AnonymousClass0LR.D(anonymousClass46p.f50370B);
                AnonymousClass46c anonymousClass46c = new AnonymousClass46c(jobId, anonymousClass46b, string);
                AnonymousClass46d anonymousClass5RS = new AnonymousClass5RS(anonymousClass5RL, C, D);
                synchronized (anonymousClass46h) {
                    B = AnonymousClass46h.m23252B(anonymousClass46h, anonymousClass46c, (AnonymousClass46g) anonymousClass46h.f50343C.get(anonymousClass46c.f50324C), anonymousClass5RS);
                }
                if (!B) {
                    anonymousClass5RL.A(true);
                    if (D != null) {
                        D.recordUploadJobStop((String) AnonymousClass0LR.D(C));
                    }
                }
                return true;
            } catch (Throwable e) {
                AnonymousClass0Dc.Q("PostLolliopUploadService", "Misunderstood job service extras: %s", e);
                return false;
            }
        }
        Integer.valueOf(jobParameters.getJobId());
        return false;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        AnonymousClass46p anonymousClass46p = (AnonymousClass46p) AnonymousClass0LR.D(this.f50309B);
        int jobId = jobParameters.getJobId();
        Integer.valueOf(jobId);
        AnonymousClass46h anonymousClass46h = (AnonymousClass46h) AnonymousClass0LR.D(anonymousClass46p.f50370B);
        synchronized (anonymousClass46h) {
            AnonymousClass46e anonymousClass46e;
            AnonymousClass46g anonymousClass46g = (AnonymousClass46g) anonymousClass46h.f50343C.get(jobId);
            if (anonymousClass46g != null) {
                anonymousClass46e = anonymousClass46g.f50341C;
            } else {
                anonymousClass46e = null;
            }
            if (anonymousClass46e != null) {
                anonymousClass46e.sendMessageAtFrontOfQueue(anonymousClass46e.obtainMessage(3));
            }
        }
        return true;
    }
}
