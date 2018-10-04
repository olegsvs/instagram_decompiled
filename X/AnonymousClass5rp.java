package X;

import com.facebook.react.bridge.ReactApplicationContext;
import com.instagram.react.impl.IgReactPackage;
import com.instagram.react.modules.base.IgReactPerformanceLoggerModule;

/* renamed from: X.5rp */
public final class AnonymousClass5rp implements AnonymousClass0G4 {
    /* renamed from: B */
    public final /* synthetic */ ReactApplicationContext f69465B;

    public AnonymousClass5rp(IgReactPackage igReactPackage, ReactApplicationContext reactApplicationContext) {
        this.f69465B = reactApplicationContext;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return new IgReactPerformanceLoggerModule(this.f69465B);
    }
}
