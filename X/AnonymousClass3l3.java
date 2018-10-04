package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: X.3l3 */
public final class AnonymousClass3l3 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3l5 f44119B;

    public AnonymousClass3l3(AnonymousClass3l5 anonymousClass3l5) {
        this.f44119B = anonymousClass3l5;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass3l5 anonymousClass3l5 = this.f44119B;
        if (anonymousClass3l5 != null) {
            anonymousClass3l5.onCancel();
        }
    }
}
