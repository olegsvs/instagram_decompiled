package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.instagram.common.analytics.AnalyticsUploadAlarmReceiver;

/* renamed from: X.0dn */
public enum AnonymousClass0dn {
    BatchUpload("action_batch_upload", 300000),
    UploadRetry("action_upload_retry", 3600000);
    
    /* renamed from: B */
    private final String f7519B;
    /* renamed from: C */
    private final long f7520C;
    /* renamed from: D */
    private PendingIntent f7521D;
    /* renamed from: E */
    private boolean f7522E;

    private AnonymousClass0dn(String str, long j) {
        this.f7519B = str;
        this.f7520C = j;
    }

    /* renamed from: A */
    public final void m6111A() {
        this.f7522E = false;
    }

    /* renamed from: B */
    public static AnonymousClass0dn m6109B(String str) {
        for (AnonymousClass0dn anonymousClass0dn : AnonymousClass0dn.values()) {
            if (anonymousClass0dn.f7519B.equals(str)) {
                return anonymousClass0dn;
            }
        }
        return null;
    }

    /* renamed from: B */
    public final void m6112B(Context context, AlarmManager alarmManager) {
        if (!this.f7522E) {
            alarmManager.set(2, SystemClock.elapsedRealtime() + this.f7520C, m6110C(context));
            this.f7522E = true;
        }
    }

    /* renamed from: C */
    private PendingIntent m6110C(Context context) {
        if (this.f7521D == null) {
            Intent intent = new Intent(context, AnalyticsUploadAlarmReceiver.class);
            intent.setAction(this.f7519B);
            this.f7521D = PendingIntent.getBroadcast(context, 0, intent, 134217728);
        }
        return this.f7521D;
    }
}
