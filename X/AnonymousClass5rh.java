package X;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.storage.AsyncStorageModule;
import com.instagram.react.impl.IgReactPackage;

/* renamed from: X.5rh */
public final class AnonymousClass5rh implements AnonymousClass0G4 {
    /* renamed from: B */
    public final /* synthetic */ ReactApplicationContext f69458B;

    public AnonymousClass5rh(IgReactPackage igReactPackage, ReactApplicationContext reactApplicationContext) {
        this.f69458B = reactApplicationContext;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return new AsyncStorageModule(this.f69458B);
    }
}
