package X;

import android.content.Intent;
import com.instagram.newsfeed.notifications.NewsfeedActionReceiver;

/* renamed from: X.1TZ */
public final class AnonymousClass1TZ extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ Intent f18935B;

    public AnonymousClass1TZ(NewsfeedActionReceiver newsfeedActionReceiver, Intent intent) {
        this.f18935B = intent;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.m5859I(this, 1345727592);
        super.onFail(anonymousClass0Q6);
        AnonymousClass0Dc.m1253P("NewsfeedActionReceiver", "Failed while executing API call from notification ");
        AnonymousClass0cQ.m5858H(this, -1469746944, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.m5859I(this, -1393858143);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.m5859I(this, -248485649);
        super.onSuccess(anonymousClass0Pn);
        AnonymousClass55Q.C().B("newstab", this.f18935B.getStringExtra("notification_uuid"));
        AnonymousClass0cQ.m5858H(this, -1960417300, I2);
        AnonymousClass0cQ.m5858H(this, -151147611, I);
    }
}
