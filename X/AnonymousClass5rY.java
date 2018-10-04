package X;

import com.facebook.react.bridge.ReactApplicationContext;
import com.instagram.react.impl.IgReactPackage;
import com.instagram.react.modules.product.IgReactPostInsightsModule;

/* renamed from: X.5rY */
public final class AnonymousClass5rY implements AnonymousClass0G4 {
    /* renamed from: B */
    public final /* synthetic */ ReactApplicationContext f69449B;

    public AnonymousClass5rY(IgReactPackage igReactPackage, ReactApplicationContext reactApplicationContext) {
        this.f69449B = reactApplicationContext;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return new IgReactPostInsightsModule(this.f69449B);
    }
}
