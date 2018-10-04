package com.facebook.react.bridge;

import X.AnonymousClass0Df;
import X.AnonymousClass0G4;
import com.facebook.react.module.annotations.ReactModule;

public final class ModuleSpec {
    private final String mName;
    private final AnonymousClass0G4 mProvider;
    private final Class mType = null;

    private ModuleSpec(AnonymousClass0G4 anonymousClass0G4, String str) {
        this.mProvider = anonymousClass0G4;
        this.mName = str;
    }

    public final String getName() {
        return this.mName;
    }

    public final AnonymousClass0G4 getProvider() {
        return this.mProvider;
    }

    public final Class getType() {
        return this.mType;
    }

    public static ModuleSpec nativeModuleSpec(Class cls, AnonymousClass0G4 anonymousClass0G4) {
        ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
        if (reactModule != null) {
            return new ModuleSpec(anonymousClass0G4, reactModule.name());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not find @ReactModule annotation on ");
        stringBuilder.append(cls.getName());
        stringBuilder.append(". So creating the module eagerly to get the name. Consider adding an annotation to make this Lazy");
        AnonymousClass0Df.H("ModuleSpec", stringBuilder.toString());
        return new ModuleSpec(anonymousClass0G4, ((NativeModule) anonymousClass0G4.get()).getName());
    }

    public static ModuleSpec nativeModuleSpec(String str, AnonymousClass0G4 anonymousClass0G4) {
        return new ModuleSpec(anonymousClass0G4, str);
    }
}
