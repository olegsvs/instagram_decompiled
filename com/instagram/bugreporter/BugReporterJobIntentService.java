package com.instagram.bugreporter;

import X.AnonymousClass09p;
import X.AnonymousClass0Ce;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class BugReporterJobIntentService extends AnonymousClass09p {
    /* renamed from: C */
    public final void m18306C(Intent intent) {
        Context applicationContext = getApplicationContext();
        BugReport bugReport = (BugReport) intent.getParcelableExtra("BugReporterActivity.INTENT_EXTRA_BUGREPORT");
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.USER_ID", bugReport.f37289M);
        BugReporterService.C(applicationContext, AnonymousClass0Ce.G(bundle), bugReport, null);
    }
}
