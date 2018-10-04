package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: X.2MZ */
public final class AnonymousClass2MZ implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0EE f29562B;

    public AnonymousClass2MZ(AnonymousClass0EE anonymousClass0EE) {
        this.f29562B = anonymousClass0EE;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        AnonymousClass0NN.B("ig_feed_share_sheet_share_to_fb_dialog", this.f29562B).H("turned_on_fb_sharing", 0).R();
    }
}
