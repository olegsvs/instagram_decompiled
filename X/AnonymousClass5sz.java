package X;

import android.app.Activity;
import android.view.View;
import com.instagram.business.insights.activity.PostInsightsActivity;
import com.instagram.react.modules.product.IgReactPostInsightsModule;

/* renamed from: X.5sz */
public final class AnonymousClass5sz implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ Activity f69613B;
    /* renamed from: C */
    public final /* synthetic */ boolean f69614C;

    public AnonymousClass5sz(IgReactPostInsightsModule igReactPostInsightsModule, Activity activity, boolean z) {
        this.f69613B = activity;
        this.f69614C = z;
    }

    public final void run() {
        PostInsightsActivity postInsightsActivity = (PostInsightsActivity) this.f69613B;
        boolean z = this.f69614C;
        View view = postInsightsActivity.f68103C.f7727C;
        if (view != null) {
            view.setVisibility(z ? 8 : 0);
        }
    }
}
