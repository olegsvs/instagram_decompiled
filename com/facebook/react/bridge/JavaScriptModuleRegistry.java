package com.facebook.react.bridge;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;

public final class JavaScriptModuleRegistry {
    private final HashMap mModuleInstances = new HashMap();

    public final class JavaScriptModuleInvocationHandler implements InvocationHandler {
        private final CatalystInstance mCatalystInstance;
        private final Class mModuleInterface;
        private String mName;

        public JavaScriptModuleInvocationHandler(CatalystInstance catalystInstance, Class cls) {
            this.mCatalystInstance = catalystInstance;
            this.mModuleInterface = cls;
        }

        private String getJSModuleName() {
            if (this.mName == null) {
                String simpleName = this.mModuleInterface.getSimpleName();
                int lastIndexOf = simpleName.lastIndexOf(36);
                if (lastIndexOf != -1) {
                    simpleName = simpleName.substring(lastIndexOf + 1);
                }
                this.mName = simpleName;
            }
            return this.mName;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            this.mCatalystInstance.callFunction(getJSModuleName(), method.getName(), objArr != null ? Arguments.fromJavaArgs(objArr) : new WritableNativeArray());
            return null;
        }
    }

    public final synchronized JavaScriptModule getJavaScriptModule(CatalystInstance catalystInstance, Class cls) {
        JavaScriptModule javaScriptModule = (JavaScriptModule) this.mModuleInstances.get(cls);
        if (javaScriptModule != null) {
            return javaScriptModule;
        }
        JavaScriptModule javaScriptModule2 = (JavaScriptModule) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new JavaScriptModuleInvocationHandler(catalystInstance, cls));
        this.mModuleInstances.put(cls, javaScriptModule2);
        return javaScriptModule2;
    }
}
