package X;

import com.facebook.react.bridge.ReactApplicationContext;
import com.instagram.react.impl.IgReactPackage;
import com.instagram.react.modules.product.IgReactBoostPostModule;

/* renamed from: X.5s0 */
public final class AnonymousClass5s0 implements AnonymousClass0G4 {
    /* renamed from: B */
    public final /* synthetic */ ReactApplicationContext f69476B;

    public AnonymousClass5s0(IgReactPackage igReactPackage, ReactApplicationContext reactApplicationContext) {
        this.f69476B = reactApplicationContext;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return new IgReactBoostPostModule(this.f69476B);
    }
}
