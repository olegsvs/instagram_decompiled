package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.C0164R;

/* renamed from: X.5H2 */
public final class AnonymousClass5H2 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5H3 f61738B;

    public AnonymousClass5H2(AnonymousClass5H3 anonymousClass5H3) {
        this.f61738B = anonymousClass5H3;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 1697052299);
        AnonymousClass2Go.B("facebook_notifications_entered");
        AnonymousClass0Il.getInstance().newReactNativeLauncher(this.f61738B.f61740C, "FacebookNotificationSettingsApp").LSA(this.f61738B.f61739B.getString(C0164R.string.facebook_notification_settings)).GZ(this.f61738B.f61739B);
        AnonymousClass0cQ.L(this, -988171886, M);
    }
}
