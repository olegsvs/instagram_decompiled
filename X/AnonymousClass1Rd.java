package X;

import com.facebook.react.bridge.ReactApplicationContext;
import com.instagram.react.impl.IgReactPackage;
import com.instagram.react.modules.product.IgReactCheckpointModule;

/* renamed from: X.1Rd */
public final class AnonymousClass1Rd implements AnonymousClass0G4 {
    /* renamed from: B */
    public final /* synthetic */ ReactApplicationContext f18613B;

    public AnonymousClass1Rd(IgReactPackage igReactPackage, ReactApplicationContext reactApplicationContext) {
        this.f18613B = reactApplicationContext;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return new IgReactCheckpointModule(this.f18613B);
    }
}
