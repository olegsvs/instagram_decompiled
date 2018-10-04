package X;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.toast.ToastModule;
import com.instagram.react.impl.IgReactPackage;

/* renamed from: X.5rj */
public final class AnonymousClass5rj implements AnonymousClass0G4 {
    /* renamed from: B */
    public final /* synthetic */ ReactApplicationContext f69460B;

    public AnonymousClass5rj(IgReactPackage igReactPackage, ReactApplicationContext reactApplicationContext) {
        this.f69460B = reactApplicationContext;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return new ToastModule(this.f69460B);
    }
}
