package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: X.5I7 */
public final class AnonymousClass5I7 implements OnCancelListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5IH f61821B;

    public AnonymousClass5I7(AnonymousClass5IH anonymousClass5IH) {
        this.f61821B = anonymousClass5IH;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f61821B.f61836E = false;
        AnonymousClass5IH.m26173C(this.f61821B, false);
    }
}
