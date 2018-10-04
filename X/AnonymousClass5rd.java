package X;

import com.facebook.react.bridge.ReactApplicationContext;
import com.instagram.react.impl.IgReactPackage;
import com.instagram.react.modules.product.IgReactPaymentModule;

/* renamed from: X.5rd */
public final class AnonymousClass5rd implements AnonymousClass0G4 {
    /* renamed from: B */
    public final /* synthetic */ ReactApplicationContext f69454B;

    public AnonymousClass5rd(IgReactPackage igReactPackage, ReactApplicationContext reactApplicationContext) {
        this.f69454B = reactApplicationContext;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return new IgReactPaymentModule(this.f69454B);
    }
}
