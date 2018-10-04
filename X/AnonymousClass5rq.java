package X;

import com.facebook.react.bridge.ReactApplicationContext;
import com.instagram.react.impl.IgReactPackage;
import com.instagram.react.views.image.IgReactImageLoaderModule;

/* renamed from: X.5rq */
public final class AnonymousClass5rq implements AnonymousClass0G4 {
    /* renamed from: B */
    public final /* synthetic */ ReactApplicationContext f69466B;

    public AnonymousClass5rq(IgReactPackage igReactPackage, ReactApplicationContext reactApplicationContext) {
        this.f69466B = reactApplicationContext;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return new IgReactImageLoaderModule(this.f69466B);
    }
}
