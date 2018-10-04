package X;

import android.view.View.OnClickListener;
import com.instagram.ui.widget.proxy.ProxyFrameLayout;

/* renamed from: X.0gu */
public final class AnonymousClass0gu implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0cf f8295B;
    /* renamed from: C */
    public final /* synthetic */ OnClickListener f8296C;

    public AnonymousClass0gu(AnonymousClass0cf anonymousClass0cf, OnClickListener onClickListener) {
        this.f8295B = anonymousClass0cf;
        this.f8296C = onClickListener;
    }

    public final void run() {
        ProxyFrameLayout proxyFrameLayout = this.f8295B.f7218B;
        proxyFrameLayout.f7210C.remove(this.f8296C);
    }
}
