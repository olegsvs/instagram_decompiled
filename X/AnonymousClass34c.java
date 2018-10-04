package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;
import com.instagram.react.modules.product.IgReactInsightsModule;

/* renamed from: X.34c */
public final class AnonymousClass34c implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass34e f37570B;

    public AnonymousClass34c(AnonymousClass34e anonymousClass34e) {
        this.f37570B = anonymousClass34e;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 1877844309);
        Object obj = AnonymousClass34n.f37605B[this.f37570B.f37583K.getSeletedIndex()];
        if (this.f37570B.f37574B != null) {
            ((RCTDeviceEventEmitter) IgReactInsightsModule.access$100(this.f37570B.f37574B.f69595B).getJSModule(RCTDeviceEventEmitter.class)).emit("IGInsightsFilterApplyEvent", obj);
        }
        this.f37570B.A();
        AnonymousClass0cQ.L(this, -1493577137, M);
    }
}
