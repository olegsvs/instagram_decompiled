package X;

import android.app.Activity;
import com.facebook.C0164R;
import java.util.List;

/* renamed from: X.5H3 */
public final class AnonymousClass5H3 {
    /* renamed from: B */
    public final Activity f61739B;
    /* renamed from: C */
    public final AnonymousClass0Cm f61740C;

    public AnonymousClass5H3(Activity activity, AnonymousClass0Cm anonymousClass0Cm) {
        this.f61739B = activity;
        this.f61740C = anonymousClass0Cm;
    }

    /* renamed from: A */
    public final void m26134A(List list) {
        if (((Boolean) AnonymousClass0CC.Aa.H(this.f61740C)).booleanValue()) {
            list.add(new AnonymousClass2bo(C0164R.string.email_sms_notification_settings, new AnonymousClass5H1(this)));
        }
    }

    /* renamed from: B */
    public final void m26135B(List list) {
        AnonymousClass0HV D = AnonymousClass0HV.D(this.f61740C);
        if (((Boolean) AnonymousClass0CC.yK.H(this.f61740C)).booleanValue() || D.f2646B.getBoolean("seen_facebook_story", false)) {
            list.add(new AnonymousClass2bo(C0164R.string.facebook_notification_settings, new AnonymousClass5H2(this)));
        }
    }

    /* renamed from: C */
    public final void m26136C(List list) {
        list.add(new AnonymousClass2bo(C0164R.string.gdpr_push_notification_settings, new AnonymousClass5H0(this)));
        m26134A(list);
        m26135B(list);
    }
}
