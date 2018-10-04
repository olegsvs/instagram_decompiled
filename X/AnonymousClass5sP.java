package X;

import android.support.v4.app.FragmentActivity;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.5sP */
public final class AnonymousClass5sP implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ IgReactNavigatorModule f69518B;
    /* renamed from: C */
    public final /* synthetic */ double f69519C;

    public AnonymousClass5sP(IgReactNavigatorModule igReactNavigatorModule, double d) {
        this.f69518B = igReactNavigatorModule;
        this.f69519C = d;
    }

    public final void run() {
        FragmentActivity B = AnonymousClass0In.B(this.f69518B.getCurrentActivity());
        if (B != null && this.f69518B.mIsHostResumed) {
            B.D().Q(Integer.toString((int) this.f69519C), 1);
        }
    }
}
