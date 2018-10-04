package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: X.4wQ */
public final class AnonymousClass4wQ implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ OnDismissListener f58654B;

    public AnonymousClass4wQ(AnonymousClass4wT anonymousClass4wT, OnDismissListener onDismissListener) {
        this.f58654B = onDismissListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f58654B.onDismiss(dialogInterface);
    }
}
