package X;

import com.facebook.react.bridge.ReactApplicationContext;
import com.instagram.react.impl.IgReactPackage;
import com.instagram.react.modules.base.IgReactAnalyticsModule;

/* renamed from: X.5s7 */
public final class AnonymousClass5s7 implements AnonymousClass0G4 {
    /* renamed from: B */
    public final /* synthetic */ ReactApplicationContext f69483B;

    public AnonymousClass5s7(IgReactPackage igReactPackage, ReactApplicationContext reactApplicationContext) {
        this.f69483B = reactApplicationContext;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return new IgReactAnalyticsModule(this.f69483B);
    }
}
