package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: X.32t */
public final class AnonymousClass32t implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ Activity f37276B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Cm f37277C;

    public AnonymousClass32t(Activity activity, AnonymousClass0Cm anonymousClass0Cm) {
        this.f37276B = activity;
        this.f37277C = anonymousClass0Cm;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        new AnonymousClass0he(this.f37276B, this.f37277C, "https://help.instagram.com/128845584325492", AnonymousClass0hf.BRANDED_CONTENT_LEARN_MORE).E("promoted_branded_content_dialog").D();
    }
}
