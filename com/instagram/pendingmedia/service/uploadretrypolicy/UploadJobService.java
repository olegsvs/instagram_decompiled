package com.instagram.pendingmedia.service.uploadretrypolicy;

import X.AnonymousClass0CC;
import X.AnonymousClass0Cd;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0EM;
import X.AnonymousClass0G5;
import X.AnonymousClass0GK;
import X.AnonymousClass0IE;
import X.AnonymousClass0OA;
import X.AnonymousClass0OK;
import X.AnonymousClass0Qe;
import X.AnonymousClass0RT;
import X.AnonymousClass1F1;
import X.AnonymousClass1QO;
import X.AnonymousClass1VT;
import android.app.PendingIntent;
import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.EnumSet;

public class UploadJobService extends JobService {
    /* renamed from: B */
    public String f17735B;
    /* renamed from: C */
    public JobParameters f17736C;
    /* renamed from: D */
    public AnonymousClass0OA f17737D;
    /* renamed from: E */
    public AnonymousClass0Qe f17738E = new AnonymousClass1QO(this);
    /* renamed from: F */
    public AnonymousClass0Cm f17739F;
    /* renamed from: G */
    private final AnonymousClass1VT f17740G = new AnonymousClass1VT(this);

    /* renamed from: A */
    public final void m11020A() {
        if (m11019C(this.f17737D)) {
            Intent B = AnonymousClass0EM.f1972B.mo257B(this, 335544320);
            B.setData(Uri.parse("instagram://mainfeed"));
            PendingIntent activity = PendingIntent.getActivity(this, 0, B, 0);
            String E = AnonymousClass0Cd.f1698B.m966J() ? AnonymousClass0IE.m2137E("[%s]: ", this.f17739F.m1037B().uT()) : JsonProperty.USE_DEFAULT_NAME;
            AnonymousClass0OA anonymousClass0OA = this.f17737D;
            int O = anonymousClass0OA == null ? 0 : anonymousClass0OA.m3569O();
            CharSequence string = getString(C0164R.string.content_text_format, new Object[]{E, Integer.valueOf(O)});
            AnonymousClass0RT E2 = new AnonymousClass0RT(this, "uploads").m4173E(getString(C0164R.string.content_title));
            E2.f4681K = activity;
            E2 = E2.m4177I(AnonymousClass0G5.m1726G(this, C0164R.attr.defaultNotificationIcon, C0164R.drawable.notification_icon)).m4178J(new AnonymousClass1F1().m10281C(string)).m4172D(string);
            AnonymousClass0RT.m4168C(E2, 2, true);
            AnonymousClass0RT C = E2.m4171C(true);
            C.f4697a = 2;
            startForeground(20015, C.m4170B());
        }
    }

    /* renamed from: B */
    public static void m11018B(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0OA anonymousClass0OA, long j) {
        if (VERSION.SDK_INT >= 21) {
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            long currentTimeMillis = System.currentTimeMillis();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("ACTION", "ACTION_CONNECTED_ALARM");
            persistableBundle.putString("EXTRA_MEDIA_KEY", anonymousClass0OA.UB);
            persistableBundle.putLong("EXTRA_START_TIME", currentTimeMillis);
            persistableBundle.putString("IgSessionManager.USER_ID", anonymousClass0Cm.f1759C);
            jobScheduler.schedule(new Builder(anonymousClass0OA.TB, new ComponentName(context, UploadJobService.class)).setRequiredNetworkType(1).setMinimumLatency(j - currentTimeMillis).setPersisted(true).setExtras(persistableBundle).setBackoffCriteria(5000, 1).build());
        }
    }

    /* renamed from: C */
    private static boolean m11019C(AnonymousClass0OA anonymousClass0OA) {
        if (anonymousClass0OA != null) {
            Object obj = (!anonymousClass0OA.m3599s() || ((Boolean) AnonymousClass0CC.Li.m845G()).booleanValue()) ? null : 1;
            Object obj2 = (anonymousClass0OA.m3599s() || ((Boolean) AnonymousClass0CC.Ji.m845G()).booleanValue()) ? null : 1;
            Object obj3 = (!anonymousClass0OA.OA(EnumSet.of(AnonymousClass0OK.REEL_SHARE_AND_DIRECT_STORY_SHARE, AnonymousClass0OK.REEL_SHARE)) || ((Boolean) AnonymousClass0CC.Ki.m845G()).booleanValue()) ? null : 1;
            Object obj4 = (!anonymousClass0OA.OA(EnumSet.of(AnonymousClass0OK.FOLLOWERS_SHARE)) || ((Boolean) AnonymousClass0CC.Ii.m845G()).booleanValue()) ? null : 1;
            Object obj5 = (!anonymousClass0OA.OA(EnumSet.of(AnonymousClass0OK.DIRECT_STORY_SHARE, AnonymousClass0OK.DIRECT_SHARE)) || ((Boolean) AnonymousClass0CC.Hi.m845G()).booleanValue()) ? null : 1;
            int OA = anonymousClass0OA.OA(EnumSet.of(AnonymousClass0OK.DIRECT_STORY_SHARE, AnonymousClass0OK.DIRECT_SHARE, AnonymousClass0OK.FOLLOWERS_SHARE, AnonymousClass0OK.REEL_SHARE_AND_DIRECT_STORY_SHARE, AnonymousClass0OK.REEL_SHARE)) ^ 1;
            if (obj == null && obj2 == null && obj3 == null && obj4 == null && obj5 == null) {
                if (OA == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        boolean z;
        this.f17736C = jobParameters;
        AnonymousClass0Cm B = AnonymousClass0Ce.m945B(AnonymousClass0Cd.f1698B, this.f17736C.getExtras().getString("IgSessionManager.USER_ID"));
        this.f17739F = B;
        AnonymousClass0GK F = AnonymousClass0GK.m1772F(this, B, "job service alarm");
        F.f2341C.add(this.f17740G);
        this.f17735B = jobParameters.getExtras().getString("EXTRA_MEDIA_KEY");
        this.f17737D = PendingMediaStore.m3537C().m3539A(this.f17735B);
        m11020A();
        long j = jobParameters.getExtras().getLong("EXTRA_START_TIME");
        long j2 = 0;
        for (int i = 1; ((long) i) < 7; i++) {
            j2 += ((long) (1 << i)) * 5000;
        }
        long j3 = j + j2;
        if (System.currentTimeMillis() > j3) {
            Long.valueOf(System.currentTimeMillis());
            Long.valueOf(j3);
            Long.valueOf(j);
            z = false;
        } else {
            Long.valueOf(System.currentTimeMillis());
            Long.valueOf(j3);
            Long.valueOf(j);
            AnonymousClass0OA anonymousClass0OA = this.f17737D;
            if (anonymousClass0OA != null) {
                anonymousClass0OA.m3555A(this.f17738E);
            }
            z = F.m1794J(this.f17735B, "job service alarm");
        }
        if (!z) {
            F.f2341C.remove(this.f17740G);
        }
        return z;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        AnonymousClass0GK F = AnonymousClass0GK.m1772F(this, this.f17739F, "job service alarm");
        F.f2341C.remove(this.f17740G);
        return true;
    }
}
