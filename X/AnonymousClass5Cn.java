package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;

/* renamed from: X.5Cn */
public final class AnonymousClass5Cn implements OnShowListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Cp f61145B;
    /* renamed from: C */
    public final /* synthetic */ OnShowListener f61146C;

    public AnonymousClass5Cn(AnonymousClass5Cp anonymousClass5Cp, OnShowListener onShowListener) {
        this.f61145B = anonymousClass5Cp;
        this.f61146C = onShowListener;
    }

    public final void onShow(DialogInterface dialogInterface) {
        this.f61145B.f61149B = true;
        OnShowListener onShowListener = this.f61146C;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }
}
