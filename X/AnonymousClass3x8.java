package X;

import android.widget.Toast;
import java.util.List;

/* renamed from: X.3x8 */
public final class AnonymousClass3x8 extends AnonymousClass34j implements AnonymousClass0oN {
    public final void Rx(List list, AnonymousClass0Qf anonymousClass0Qf) {
        if (!list.isEmpty()) {
            this.f37594C.m21676A(AnonymousClass0Jd.f2931B.M(this.f37596E).C(((AnonymousClass0P7) list.get(0)).NO(), new AnonymousClass0Zb(this.f37596E.B()), true, list), this.f37593B, AnonymousClass0Nm.L(this.f37595D), getActivity(), this.f37596E, anonymousClass0Qf);
        }
    }

    public final void zw(String str) {
        Toast.makeText(getActivity(), str, 1).show();
        AnonymousClass0xT.E("story_grid", "error", "landing_insights", str, AnonymousClass0a2.I(this.f37596E));
    }
}
