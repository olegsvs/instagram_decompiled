package X;

import android.support.v4.app.FragmentActivity;
import com.instagram.react.modules.product.IgReactBoostPostModule;

/* renamed from: X.5sb */
public final class AnonymousClass5sb implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ FragmentActivity f69555B;

    public AnonymousClass5sb(IgReactBoostPostModule igReactBoostPostModule, FragmentActivity fragmentActivity) {
        this.f69555B = fragmentActivity;
    }

    public final void run() {
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f69555B);
        anonymousClass0IZ.f2754D = AnonymousClass0Ir.f2848B.A().K("ads_manager");
        anonymousClass0IZ.B();
    }
}
