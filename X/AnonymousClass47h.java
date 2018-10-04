package X;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Context;
import android.os.Handler.Callback;
import android.os.Message;
import com.facebook.oxygen.preloads.sdk.firstparty.managedappcache.IsManagedAppCacheJobService;

/* renamed from: X.47h */
public final class AnonymousClass47h implements Callback {
    /* renamed from: B */
    public final /* synthetic */ IsManagedAppCacheJobService f50547B;

    public AnonymousClass47h(IsManagedAppCacheJobService isManagedAppCacheJobService) {
        this.f50547B = isManagedAppCacheJobService;
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            Context context = this.f50547B;
            JobParameters jobParameters = (JobParameters) message.obj;
            while (!context.f50549B) {
                JobWorkItem dequeueWork = jobParameters.dequeueWork();
                if (dequeueWork == null) {
                    break;
                }
                AnonymousClass47i.m23312B(dequeueWork.getIntent(), context);
                jobParameters.completeWork(dequeueWork);
            }
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown msg: ");
        stringBuilder.append(message.what);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
