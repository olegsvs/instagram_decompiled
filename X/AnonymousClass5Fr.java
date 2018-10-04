package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: X.5Fr */
public final class AnonymousClass5Fr implements OnCancelListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Fv f61620B;

    public AnonymousClass5Fr(AnonymousClass5Fv anonymousClass5Fv) {
        this.f61620B = anonymousClass5Fv;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f61620B.f61624B = false;
        AnonymousClass5Fv.m26087C(this.f61620B, false);
    }
}
