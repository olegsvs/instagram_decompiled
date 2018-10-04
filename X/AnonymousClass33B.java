package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.C0164R;
import com.instagram.bugreporter.BugReport;
import com.instagram.bugreporter.BugReporterActivity;
import com.instagram.bugreporter.BugReporterService;

/* renamed from: X.33B */
public final class AnonymousClass33B extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ BugReport f37334B;
    /* renamed from: C */
    public final /* synthetic */ Context f37335C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Cm f37336D;

    public AnonymousClass33B(Context context, AnonymousClass0Cm anonymousClass0Cm, BugReport bugReport) {
        this.f37335C = context;
        this.f37336D = anonymousClass0Cm;
        this.f37334B = bugReport;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 14178863);
        String str = "[error not available]";
        if (anonymousClass0Q6.B()) {
            str = ((AnonymousClass3AW) anonymousClass0Q6.f4288C).f38562B.toString();
        }
        AnonymousClass0Dc.D(BugReporterService.f2101B, "Failed to create Flytrap bug...\n%s", new Object[]{str});
        Context context = this.f37335C;
        AnonymousClass0Cm anonymousClass0Cm = this.f37336D;
        Object obj = this.f37334B;
        Intent intent = new Intent(context, BugReporterActivity.class);
        intent.putExtra("IgSessionManager.USER_ID", anonymousClass0Cm.f1759C);
        intent.setFlags(268435456);
        intent.putExtra("BugReporterActivity.INTENT_EXTRA_BUGREPORT", obj);
        String H = AnonymousClass0G5.H(context, C0164R.attr.appName);
        BugReporterService.B(context, context.getString(C0164R.string.bugreporter_fail_title, new Object[]{H, obj.f37281E}), context.getString(C0164R.string.bugreporter_fail_text), 17301642, context.getString(C0164R.string.bugreporter_fail_ticker, new Object[]{H}), intent, 2);
        AnonymousClass0cQ.H(this, 802320882, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 101966775);
        AnonymousClass3AW anonymousClass3AW = (AnonymousClass3AW) obj;
        int I2 = AnonymousClass0cQ.I(this, -241067414);
        Context context = this.f37335C;
        String H = AnonymousClass0G5.H(context, C0164R.attr.appName);
        BugReporterService.B(context, context.getString(C0164R.string.bugreporter_send_success, new Object[]{H}), context.getString(C0164R.string.bugreporter_send_description), AnonymousClass0G5.G(context, C0164R.attr.defaultNotificationIcon, C0164R.drawable.notification_icon), context.getString(C0164R.string.bugreporter_send_success, new Object[]{H}), new Intent(), 3);
        AnonymousClass0cQ.H(this, -1239291715, I2);
        AnonymousClass0cQ.H(this, -1690864189, I);
    }
}
