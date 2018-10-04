package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: X.5A7 */
public final class AnonymousClass5A7 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ OnDismissListener f60722B;

    public AnonymousClass5A7(OnDismissListener onDismissListener) {
        this.f60722B = onDismissListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        OnDismissListener onDismissListener = this.f60722B;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
