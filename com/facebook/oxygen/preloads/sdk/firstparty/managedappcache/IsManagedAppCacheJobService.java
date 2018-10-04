package com.facebook.oxygen.preloads.sdk.firstparty.managedappcache;

import X.AnonymousClass0cQ;
import X.AnonymousClass47h;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Handler;
import android.os.HandlerThread;

public class IsManagedAppCacheJobService extends JobService {
    /* renamed from: D */
    public static HandlerThread f50548D;
    /* renamed from: B */
    public volatile boolean f50549B;
    /* renamed from: C */
    private Handler f50550C;

    public final void onCreate() {
        HandlerThread handlerThread;
        int J = AnonymousClass0cQ.J(this, 1923869393);
        synchronized (IsManagedAppCacheJobService.class) {
            if (f50548D == null) {
                f50548D = new HandlerThread("th-IsManagedAppCacheJobSvc");
                f50548D.start();
            }
            handlerThread = f50548D;
        }
        this.f50550C = new Handler(handlerThread.getLooper(), new AnonymousClass47h(this));
        AnonymousClass0cQ.K(this, 2020117912, J);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        this.f50549B = false;
        Handler handler = this.f50550C;
        handler.sendMessage(handler.obtainMessage(1, jobParameters));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        this.f50549B = true;
        return true;
    }
}
