package X;

import com.facebook.react.bridge.ReactApplicationContext;
import com.instagram.react.impl.IgReactPackage;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.5rc */
public final class AnonymousClass5rc implements AnonymousClass0G4 {
    /* renamed from: B */
    public final /* synthetic */ ReactApplicationContext f69453B;

    public AnonymousClass5rc(IgReactPackage igReactPackage, ReactApplicationContext reactApplicationContext) {
        this.f69453B = reactApplicationContext;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return new IgReactNavigatorModule(this.f69453B);
    }
}
