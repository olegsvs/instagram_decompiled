package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: X.3Kn */
public final class AnonymousClass3Kn implements OnDismissListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0xX f40238B;

    public AnonymousClass3Kn(AnonymousClass0xX anonymousClass0xX) {
        this.f40238B = anonymousClass0xX;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f40238B.f12610P != null) {
            this.f40238B.f12610P.onDismiss(dialogInterface);
        }
    }
}
