package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: X.5jc */
public final class AnonymousClass5jc implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3Sd f68602B;

    public AnonymousClass5jc(AnonymousClass3Sd anonymousClass3Sd) {
        this.f68602B = anonymousClass3Sd;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (i == 0) {
            this.f68602B.uw();
        }
    }
}
