package X;

import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import com.facebook.C0164R;
import com.instagram.pendingmedia.service.uploadretrypolicy.UploadRetryJobService;
import com.instagram.pendingmedia.service.uploadretrypolicy.UploadRetryService;

/* renamed from: X.0OH */
public final class AnonymousClass0OH {
    /* renamed from: B */
    public static void m3614B(Context context, AnonymousClass0Cm anonymousClass0Cm, long j) {
        if (VERSION.SDK_INT >= 21) {
            UploadRetryService.m3609B(context, anonymousClass0Cm, true);
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            ComponentName componentName = new ComponentName(context, UploadRetryJobService.class);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("ACTION", "ACTION_CONNECTED_ALARM");
            persistableBundle.putString("IgSessionManager.USER_ID", anonymousClass0Cm.f1759C);
            jobScheduler.schedule(new Builder(C0164R.id.upload_retry_service_scheduled_in, componentName).setRequiredNetworkType(1).setMinimumLatency(j).setExtras(persistableBundle).build());
            return;
        }
        UploadRetryService.m3609B(context, anonymousClass0Cm, true);
        AnonymousClass0IW.m2248N(new Intent(context, UploadRetryService.class).setAction("ScheduleAlarm").putExtra("AlarmDelay", j).putExtra("IgSessionManager.USER_ID", anonymousClass0Cm.f1759C), context);
    }
}
