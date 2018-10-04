package X;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.i18nmanager.I18nManagerModule;
import com.instagram.react.impl.IgReactPackage;

/* renamed from: X.5rb */
public final class AnonymousClass5rb implements AnonymousClass0G4 {
    /* renamed from: B */
    public final /* synthetic */ ReactApplicationContext f69452B;

    public AnonymousClass5rb(IgReactPackage igReactPackage, ReactApplicationContext reactApplicationContext) {
        this.f69452B = reactApplicationContext;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return new I18nManagerModule(this.f69452B);
    }
}
