package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.view.ViewConfiguration;

/* renamed from: X.119 */
public final class AnonymousClass119 implements OnShowListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0kn f13369B;

    public AnonymousClass119(AnonymousClass0kn anonymousClass0kn) {
        this.f13369B = anonymousClass0kn;
    }

    public final void onShow(DialogInterface dialogInterface) {
        this.f13369B.f9370E.sendEmptyMessageDelayed(2, (long) ViewConfiguration.getDoubleTapTimeout());
    }
}
