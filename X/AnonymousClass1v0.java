package X;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;

/* renamed from: X.1v0 */
public final class AnonymousClass1v0 extends AnonymousClass1Po {
    /* renamed from: B */
    public AnonymousClass1vA f24100B;
    /* renamed from: C */
    private String f24101C;

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f24100B.m13716A();
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 862053173);
        super.onCreate(bundle);
        this.f24101C = getArguments().getString("arg_session_id");
        if (this.f24100B == null) {
            Context activity = getActivity();
            Bundle G = AnonymousClass17q.G(activity.getIntent());
            String string = G.getString("action");
            Bundle bundle2 = G.getBundle("params");
            if (AnonymousClass19Y.E(string)) {
                activity.finish();
                AnonymousClass0cQ.G(this, 1653268638, F);
                return;
            }
            AnonymousClass1v7 anonymousClass1v7 = new AnonymousClass1v7(activity, string, bundle2, this.f24101C);
            anonymousClass1v7.f24109D = new AnonymousClass2RO(this);
            this.f24100B = anonymousClass1v7.mo3009A();
        }
        AnonymousClass0cQ.G(this, -205204690, F);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return this.f24100B;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -2083391980);
        if (this.f15926D != null && getRetainInstance()) {
            this.f15926D.setDismissMessage(null);
        }
        super.onDestroyView();
        AnonymousClass0cQ.G(this, -634950780, F);
    }
}
