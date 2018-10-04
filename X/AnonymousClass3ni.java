package X;

import android.content.Context;
import com.facebook.C0164R;

/* renamed from: X.3ni */
public final class AnonymousClass3ni implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ Context f44592B;

    public AnonymousClass3ni(Context context) {
        this.f44592B = context;
    }

    public final void run() {
        new AnonymousClass0P2(this.f44592B).V(C0164R.string.error).K(C0164R.string.network_error).S(C0164R.string.dismiss, null).A().show();
    }
}
