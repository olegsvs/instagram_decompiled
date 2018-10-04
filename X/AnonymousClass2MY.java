package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: X.2MY */
public final class AnonymousClass2MY implements OnDismissListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0EE f29561B;

    public AnonymousClass2MY(AnonymousClass0EE anonymousClass0EE) {
        this.f29561B = anonymousClass0EE;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass0NN.B("ig_feed_share_sheet_share_to_fb_dialog", this.f29561B).H("dialog_dismiss", true).R();
    }
}
