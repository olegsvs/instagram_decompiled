package com.facebook.react.bridge;

import X.AnonymousClass09A;
import X.AnonymousClass09H;
import com.facebook.react.bridge.NativeModule.NativeMethod;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaModuleWrapper {
    private final ArrayList mDescs = new ArrayList();
    private final JSInstance mJSInstance;
    private final ArrayList mMethods = new ArrayList();
    private final ModuleHolder mModuleHolder;

    public class MethodDescriptor {
        public Method method;
        public String name;
        public String signature;
        public String type;
    }

    public JavaModuleWrapper(JSInstance jSInstance, ModuleHolder moduleHolder) {
        this.mJSInstance = jSInstance;
        this.mModuleHolder = moduleHolder;
    }

    private void findMethods() {
        AnonymousClass09H.B(8192, "findMethods", -165039546);
        Set hashSet = new HashSet();
        Class cls = this.mModuleHolder.getModule().getClass();
        Class superclass = cls.getSuperclass();
        if (ReactModuleWithSpec.class.isAssignableFrom(superclass)) {
            cls = superclass;
        }
        for (Method method : r4.getDeclaredMethods()) {
            ReactMethod reactMethod = (ReactMethod) method.getAnnotation(ReactMethod.class);
            if (reactMethod != null) {
                String name = method.getName();
                if (hashSet.contains(name)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Java Module ");
                    stringBuilder.append(getName());
                    stringBuilder.append(" method name already registered: ");
                    stringBuilder.append(name);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                MethodDescriptor methodDescriptor = new MethodDescriptor();
                JavaMethodWrapper javaMethodWrapper = new JavaMethodWrapper(this, method, reactMethod.isBlockingSynchronousMethod());
                methodDescriptor.name = name;
                name = javaMethodWrapper.getType();
                methodDescriptor.type = name;
                if (name == BaseJavaModule.METHOD_TYPE_SYNC) {
                    methodDescriptor.signature = javaMethodWrapper.getSignature();
                    methodDescriptor.method = method;
                }
                this.mMethods.add(javaMethodWrapper);
                this.mDescs.add(methodDescriptor);
            }
        }
        AnonymousClass09H.C(8192, 960541033);
    }

    public NativeMap getConstants() {
        if (!this.mModuleHolder.getHasConstants()) {
            return null;
        }
        String name = getName();
        AnonymousClass09A.B(8192, "JavaModuleWrapper.getConstants").B("moduleName", name).C();
        ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_START, name);
        BaseJavaModule module = getModule();
        AnonymousClass09H.B(8192, "module.getConstants", -359872348);
        Map constants = module.getConstants();
        AnonymousClass09H.C(8192, 1074781008);
        AnonymousClass09H.B(8192, "create WritableNativeMap", -2004406670);
        ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_START, name);
        try {
            NativeMap makeNativeMap = Arguments.makeNativeMap(constants);
            return makeNativeMap;
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_END);
            AnonymousClass09H.C(8192, -600930734);
            ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_END);
            AnonymousClass09A.C(8192).C();
        }
    }

    public List getMethodDescriptors() {
        if (this.mDescs.isEmpty()) {
            findMethods();
        }
        return this.mDescs;
    }

    public BaseJavaModule getModule() {
        return (BaseJavaModule) this.mModuleHolder.getModule();
    }

    public String getName() {
        return this.mModuleHolder.getName();
    }

    public void invoke(int i, ReadableNativeArray readableNativeArray) {
        ArrayList arrayList = this.mMethods;
        if (arrayList != null) {
            if (i < arrayList.size()) {
                ((NativeMethod) this.mMethods.get(i)).invoke(this.mJSInstance, readableNativeArray);
            }
        }
    }
}
