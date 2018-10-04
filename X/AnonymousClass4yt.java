package X;

import android.app.Activity;
import android.os.Bundle;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;

/* renamed from: X.4yt */
public final class AnonymousClass4yt {
    /* renamed from: B */
    public static boolean m25517B(Bundle bundle) {
        return bundle.getString("from_notification_category", JsonProperty.USE_DEFAULT_NAME).equalsIgnoreCase("force_logout_login_help");
    }

    /* renamed from: C */
    public static void m25518C(Bundle bundle, Activity activity, AnonymousClass0Fz anonymousClass0Fz, AnonymousClass0EE anonymousClass0EE) {
        if (bundle != null && AnonymousClass4yt.m25517B(bundle)) {
            String string = bundle.getString(MemoryDumpUploadJob.EXTRA_USER_ID);
            String str = "token";
            bundle = bundle.getString(str);
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(AnonymousClass0G7.G());
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
            anonymousClass0Pt.f4229M = "accounts/post_force_logout_login/";
            AnonymousClass0GA H = anonymousClass0Pt.D("uid", string).D("source", "post_force_logout_login_push").D("device_id", AnonymousClass0Dt.B(activity)).D("guid", AnonymousClass0Dt.f1941C.A(activity)).D(str, bundle).M(AnonymousClass2aH.class).N().H();
            H.f2849B = new AnonymousClass4ys(activity, anonymousClass0EE);
            AnonymousClass0Px.B(activity, anonymousClass0Fz, H);
        }
    }
}
