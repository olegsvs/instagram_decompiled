package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.uimanager.ViewManagersPropertyCache.PropSetter;
import java.util.HashMap;
import java.util.Map;

public final class ViewManagerPropertyUpdater {
    private static final Map SHADOW_NODE_SETTER_MAP = new HashMap();
    private static final Map VIEW_MANAGER_SETTER_MAP = new HashMap();

    public interface Settable {
        void getProperties(Map map);
    }

    public interface ShadowNodeSetter extends Settable {
        void setProperty(ReactShadowNode reactShadowNode, String str, ReactStylesDiffMap reactStylesDiffMap);
    }

    public interface ViewManagerSetter extends Settable {
        void setProperty(ViewManager viewManager, View view, String str, ReactStylesDiffMap reactStylesDiffMap);
    }

    public final class FallbackShadowNodeSetter implements ShadowNodeSetter {
        private final Map mPropSetters;

        public FallbackShadowNodeSetter(Class cls) {
            this.mPropSetters = ViewManagersPropertyCache.getNativePropSettersForShadowNodeClass(cls);
        }

        public final void getProperties(Map map) {
            for (PropSetter propSetter : this.mPropSetters.values()) {
                map.put(propSetter.getPropName(), propSetter.getPropType());
            }
        }

        public final void setProperty(ReactShadowNode reactShadowNode, String str, ReactStylesDiffMap reactStylesDiffMap) {
            PropSetter propSetter = (PropSetter) this.mPropSetters.get(str);
            if (propSetter != null) {
                propSetter.updateShadowNodeProp(reactShadowNode, reactStylesDiffMap);
            }
        }
    }

    public final class FallbackViewManagerSetter implements ViewManagerSetter {
        private final Map mPropSetters;

        public FallbackViewManagerSetter(Class cls) {
            this.mPropSetters = ViewManagersPropertyCache.getNativePropSettersForViewManagerClass(cls);
        }

        public final void getProperties(Map map) {
            for (PropSetter propSetter : this.mPropSetters.values()) {
                map.put(propSetter.getPropName(), propSetter.getPropType());
            }
        }

        public final void setProperty(ViewManager viewManager, View view, String str, ReactStylesDiffMap reactStylesDiffMap) {
            PropSetter propSetter = (PropSetter) this.mPropSetters.get(str);
            if (propSetter != null) {
                propSetter.updateViewProp(viewManager, view, reactStylesDiffMap);
            }
        }
    }

    public static void clear() {
        ViewManagersPropertyCache.clear();
        VIEW_MANAGER_SETTER_MAP.clear();
        SHADOW_NODE_SETTER_MAP.clear();
    }

    private static java.lang.Object findGeneratedSetter(java.lang.Class r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r4 = r5.getName();
        r1 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0036, InstantiationException -> 0x001e, InstantiationException -> 0x001e }
        r1.<init>();	 Catch:{ ClassNotFoundException -> 0x0036, InstantiationException -> 0x001e, InstantiationException -> 0x001e }
        r1.append(r4);	 Catch:{ ClassNotFoundException -> 0x0036, InstantiationException -> 0x001e, InstantiationException -> 0x001e }
        r0 = "$$PropsSetter";	 Catch:{ ClassNotFoundException -> 0x0036, InstantiationException -> 0x001e, InstantiationException -> 0x001e }
        r1.append(r0);	 Catch:{ ClassNotFoundException -> 0x0036, InstantiationException -> 0x001e, InstantiationException -> 0x001e }
        r0 = r1.toString();	 Catch:{ ClassNotFoundException -> 0x0036, InstantiationException -> 0x001e, InstantiationException -> 0x001e }
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0036, InstantiationException -> 0x001e, InstantiationException -> 0x001e }
        r0 = r0.newInstance();	 Catch:{ ClassNotFoundException -> 0x0036, InstantiationException -> 0x001e, InstantiationException -> 0x001e }
        return r0;	 Catch:{ ClassNotFoundException -> 0x0036, InstantiationException -> 0x001e, InstantiationException -> 0x001e }
    L_0x001e:
        r3 = move-exception;
        r2 = new java.lang.RuntimeException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Unable to instantiate methods getter for ";
        r1.append(r0);
        r1.append(r4);
        r0 = r1.toString();
        r2.<init>(r0, r3);
        throw r2;
    L_0x0036:
        r2 = "ViewManagerPropertyUpdater";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Could not find generated setter for ";
        r1.append(r0);
        r1.append(r5);
        r0 = r1.toString();
        X.AnonymousClass0Df.H(r2, r0);
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.ViewManagerPropertyUpdater.findGeneratedSetter(java.lang.Class):java.lang.Object");
    }

    private static ViewManagerSetter findManagerSetter(Class cls) {
        Map map = VIEW_MANAGER_SETTER_MAP;
        ViewManagerSetter viewManagerSetter = (ViewManagerSetter) map.get(cls);
        if (viewManagerSetter == null) {
            viewManagerSetter = (ViewManagerSetter) findGeneratedSetter(cls);
            if (viewManagerSetter == null) {
                viewManagerSetter = new FallbackViewManagerSetter(cls);
            }
            map.put(cls, viewManagerSetter);
        }
        return viewManagerSetter;
    }

    private static ShadowNodeSetter findNodeSetter(Class cls) {
        Map map = SHADOW_NODE_SETTER_MAP;
        ShadowNodeSetter shadowNodeSetter = (ShadowNodeSetter) map.get(cls);
        if (shadowNodeSetter == null) {
            shadowNodeSetter = (ShadowNodeSetter) findGeneratedSetter(cls);
            if (shadowNodeSetter == null) {
                shadowNodeSetter = new FallbackShadowNodeSetter(cls);
            }
            map.put(cls, shadowNodeSetter);
        }
        return shadowNodeSetter;
    }

    public static Map getNativeProps(Class cls, Class cls2) {
        Map hashMap = new HashMap();
        findManagerSetter(cls).getProperties(hashMap);
        findNodeSetter(cls2).getProperties(hashMap);
        return hashMap;
    }

    public static void updateProps(ReactShadowNode reactShadowNode, ReactStylesDiffMap reactStylesDiffMap) {
        ShadowNodeSetter findNodeSetter = findNodeSetter(reactShadowNode.getClass());
        ReadableMapKeySetIterator keySetIterator = reactStylesDiffMap.mBackingMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            findNodeSetter.setProperty(reactShadowNode, keySetIterator.nextKey(), reactStylesDiffMap);
        }
    }

    public static void updateProps(ViewManager viewManager, View view, ReactStylesDiffMap reactStylesDiffMap) {
        ViewManagerSetter findManagerSetter = findManagerSetter(viewManager.getClass());
        ReadableMapKeySetIterator keySetIterator = reactStylesDiffMap.mBackingMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            findManagerSetter.setProperty(viewManager, view, keySetIterator.nextKey(), reactStylesDiffMap);
        }
    }
}
