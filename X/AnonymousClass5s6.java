package X;

import com.facebook.react.bridge.ReactApplicationContext;
import com.instagram.react.impl.IgReactPackage;
import com.instagram.react.modules.base.IgNetworkingModule;

/* renamed from: X.5s6 */
public final class AnonymousClass5s6 implements AnonymousClass0G4 {
    /* renamed from: B */
    public final /* synthetic */ ReactApplicationContext f69482B;

    public AnonymousClass5s6(IgReactPackage igReactPackage, ReactApplicationContext reactApplicationContext) {
        this.f69482B = reactApplicationContext;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return new IgNetworkingModule(this.f69482B);
    }
}
