package com.instagram.bugreporter;

import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0G5;
import X.AnonymousClass0GA;
import X.AnonymousClass0HV;
import X.AnonymousClass0Iw;
import X.AnonymousClass0Ix;
import X.AnonymousClass0RT;
import X.AnonymousClass0Ra;
import X.AnonymousClass1PU;
import X.AnonymousClass1YZ;
import X.AnonymousClass33A;
import X.AnonymousClass33B;
import X.AnonymousClass3VV;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;

public class BugReporterService extends IntentService {
    /* renamed from: B */
    public static final Class f2101B = BugReporterService.class;
    /* renamed from: C */
    public static String f2102C;

    public BugReporterService() {
        super("BugReporterService");
    }

    /* renamed from: B */
    public static void m1549B(Context context, String str, String str2, int i, String str3, Intent intent, int i2) {
        AnonymousClass0RT M = new AnonymousClass0RT(context, AnonymousClass3VV.F("support_ticket")).m4173E(str).m4172D(str2).m4177I(i).m4171C(true).m4179K(str3).m4181M(System.currentTimeMillis());
        M.f4704h = true;
        M.f4681K = PendingIntent.getActivity(context, (int) System.currentTimeMillis(), intent, 268435456);
        AnonymousClass0Ra.m4206B(context).m4209B(null, i2, M.m4170B());
    }

    /* renamed from: C */
    public static void m1550C(Context context, AnonymousClass0Cm anonymousClass0Cm, BugReport bugReport, AnonymousClass0Iw anonymousClass0Iw) {
        String str;
        String str2 = "fbns_token";
        String string = AnonymousClass0HV.m2008D(anonymousClass0Cm).f2646B.getString(str2, JsonProperty.USE_DEFAULT_NAME);
        AnonymousClass1YZ anonymousClass1PU = new AnonymousClass1PU(anonymousClass0Cm, context);
        HashMap hashMap = bugReport.f37285I;
        if (hashMap != null) {
            for (String str3 : hashMap.keySet()) {
                anonymousClass1PU.f20049G.put(str3, (String) hashMap.get(str3));
            }
        }
        anonymousClass1PU.f20049G.put(str2, string);
        anonymousClass1PU.f20057O = anonymousClass0Cm.f1759C;
        anonymousClass1PU.f20058P = anonymousClass0Cm.m1037B().uT();
        if (bugReport.f37280D == null) {
            str = f2102C;
        } else {
            str = bugReport.f37280D;
        }
        anonymousClass1PU.f20046D = str;
        anonymousClass1PU.f20054L = anonymousClass0Cm.m1037B().m1018i();
        anonymousClass1PU.f20047E = bugReport.f37283G ? "306244556460128" : "161101191344941";
        anonymousClass1PU.f20044B = bugReport.f37279C;
        anonymousClass1PU.f20048F = bugReport.f37281E;
        anonymousClass1PU.f20055M = bugReport.f37287K;
        anonymousClass1PU.f20045C = bugReport.f37286J;
        anonymousClass1PU.f20056N = bugReport.f37288L;
        AnonymousClass0GA A = anonymousClass1PU.m11848A();
        A.f2849B = new AnonymousClass33B(context, anonymousClass0Cm, bugReport);
        if (anonymousClass0Iw != null) {
            A.f2849B = anonymousClass0Iw;
        }
        AnonymousClass0Ix.m2383C(A);
    }

    public final void onHandleIntent(Intent intent) {
        Context applicationContext = getApplicationContext();
        BugReport bugReport = (BugReport) intent.getParcelableExtra("BugReporterActivity.INTENT_EXTRA_BUGREPORT");
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.USER_ID", bugReport.f37289M);
        AnonymousClass0Cm G = AnonymousClass0Ce.m950G(bundle);
        PendingIntent activity = PendingIntent.getActivity(applicationContext, (int) System.currentTimeMillis(), new Intent(), 536870912);
        AnonymousClass0RT M = new AnonymousClass0RT(applicationContext, AnonymousClass3VV.F("support_ticket")).m4173E(getString(C0164R.string.bugreporter_foreground_notification)).m4177I(AnonymousClass0G5.m1726G(applicationContext, C0164R.attr.defaultNotificationIcon, C0164R.drawable.notification_icon)).m4181M(System.currentTimeMillis());
        M.f4704h = true;
        M.f4681K = activity;
        startForeground(20018, M.m4170B());
        m1550C(applicationContext, G, bugReport, new AnonymousClass33A(this));
    }
}
