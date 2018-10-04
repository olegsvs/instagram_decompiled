package com.instagram.react.modules.product;

import X.AnonymousClass0OR;
import X.AnonymousClass5sn;
import android.os.Handler;
import android.os.Looper;
import com.facebook.fbreact.specs.NativeCompassionResourceModuleSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "CompassionResourceModule")
public class IgReactCompassionResourceModule extends NativeCompassionResourceModuleSpec {
    public static final String MODULE_NAME = "CompassionResourceModule";

    public String getName() {
        return MODULE_NAME;
    }

    public IgReactCompassionResourceModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public void closeCompassionResource(double d) {
        AnonymousClass0OR.D(new Handler(Looper.getMainLooper()), new AnonymousClass5sn(this), 926722285);
    }
}
