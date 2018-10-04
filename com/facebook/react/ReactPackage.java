package com.facebook.react;

import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;

public interface ReactPackage {
    List createNativeModules(ReactApplicationContext reactApplicationContext);

    List createViewManagers(ReactApplicationContext reactApplicationContext);
}
