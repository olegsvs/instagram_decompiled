package com.facebook.react;

import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;

public abstract class ReactInstancePackage implements ReactPackage {
    public abstract List createNativeModules(ReactApplicationContext reactApplicationContext, ReactInstanceManager reactInstanceManager);

    public final List createNativeModules(ReactApplicationContext reactApplicationContext) {
        throw new RuntimeException("ReactInstancePackage must be passed in the ReactInstanceManager.");
    }
}
