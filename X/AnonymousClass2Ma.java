package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: X.2Ma */
public final class AnonymousClass2Ma implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0EE f29563B;

    public AnonymousClass2Ma(AnonymousClass0EE anonymousClass0EE) {
        this.f29563B = anonymousClass0EE;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass0Mt.M(true);
        AnonymousClass0NN.B("ig_feed_share_sheet_share_to_fb_dialog", this.f29563B).H("turned_on_fb_sharing", true).R();
    }
}
