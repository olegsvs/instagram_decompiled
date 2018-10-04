package com.facebook.react.uimanager;

import X.AnonymousClass09A;
import X.AnonymousClass09H;
import X.AnonymousClass0Df;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.media.AudioManager;
import com.facebook.react.animation.Animation;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.OnBatchCompleteListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout.OnSizeChangedListener;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.debug.NotThreadSafeViewHierarchyUpdateDebugListener;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

@ReactModule(name = "UIManager")
public class UIManagerModule extends ReactContextBaseJavaModule implements LifecycleEventListener, UIManager, OnBatchCompleteListener {
    private static final boolean DEBUG = false;
    public static final String NAME = "UIManager";
    private int mBatchId = 0;
    public final Map mCustomDirectEvents;
    private final EventDispatcher mEventDispatcher;
    private final List mListeners = new ArrayList();
    private final MemoryTrimCallback mMemoryTrimCallback = new MemoryTrimCallback();
    private final Map mModuleConstants;
    public final UIImplementation mUIImplementation;

    public interface CustomEventNamesResolver {
        String resolveCustomEventName(String str);
    }

    public final class MemoryTrimCallback implements ComponentCallbacks2 {
        public final void onConfigurationChanged(Configuration configuration) {
        }

        public final void onLowMemory() {
        }

        public final void onTrimMemory(int i) {
            if (i >= 60) {
                YogaNodePool.get().clear();
            }
        }
    }

    public interface ViewManagerResolver {
        ViewManager getViewManager(String str);

        List getViewManagerNames();
    }

    /* renamed from: com.facebook.react.uimanager.UIManagerModule$1 */
    public final class C01421 implements CustomEventNamesResolver {
        public final String resolveCustomEventName(String str) {
            Map map = (Map) UIManagerModule.this.mCustomDirectEvents.get(str);
            return map != null ? (String) map.get("registrationName") : str;
        }
    }

    public String getName() {
        return NAME;
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, ViewManagerResolver viewManagerResolver, int i) {
        super(reactApplicationContext);
        DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(reactApplicationContext);
        this.mEventDispatcher = new EventDispatcher(reactApplicationContext);
        this.mModuleConstants = createConstants(viewManagerResolver);
        this.mCustomDirectEvents = UIManagerModuleConstants.getDirectEventTypeConstants();
        this.mUIImplementation = new UIImplementation(reactApplicationContext, viewManagerResolver, this.mEventDispatcher, i);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, List list, int i) {
        super(reactApplicationContext);
        DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(reactApplicationContext);
        this.mEventDispatcher = new EventDispatcher(reactApplicationContext);
        Map newHashMap = MapBuilder.newHashMap();
        this.mCustomDirectEvents = newHashMap;
        this.mModuleConstants = createConstants(list, null, newHashMap);
        this.mUIImplementation = new UIImplementation(reactApplicationContext, list, this.mEventDispatcher, i);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    public void addAnimation(int i, int i2, Callback callback) {
        this.mUIImplementation.addAnimation(i, i2, callback);
    }

    public int addRootView(SizeMonitoringFrameLayout sizeMonitoringFrameLayout) {
        AnonymousClass09H.B(8192, "UIManagerModule.addRootView", 991361181);
        final int nextRootViewTag = ReactRootViewTagGenerator.getNextRootViewTag();
        final ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        this.mUIImplementation.registerRootView(sizeMonitoringFrameLayout, nextRootViewTag, new ThemedReactContext(reactApplicationContext, sizeMonitoringFrameLayout.getContext()));
        sizeMonitoringFrameLayout.setOnSizeChangedListener(new OnSizeChangedListener() {
            public final void onSizeChanged(final int i, final int i2, int i3, int i4) {
                ReactContext reactContext = reactApplicationContext;
                reactContext.runOnNativeModulesQueueThread(new GuardedRunnable(reactContext) {
                    public final void runGuarded() {
                        UIManagerModule.this.updateNodeSize(nextRootViewTag, i, i2);
                    }
                });
            }
        });
        AnonymousClass09H.C(8192, 471136604);
        return nextRootViewTag;
    }

    public void addUIBlock(UIBlock uIBlock) {
        this.mUIImplementation.addUIBlock(uIBlock);
    }

    public void addUIManagerListener(UIManagerModuleListener uIManagerModuleListener) {
        this.mListeners.add(uIManagerModuleListener);
    }

    @ReactMethod
    public void clearJSResponder() {
        this.mUIImplementation.clearJSResponder();
    }

    @ReactMethod
    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.mUIImplementation.configureNextLayoutAnimation(readableMap, callback, callback2);
    }

    private static Map createConstants(ViewManagerResolver viewManagerResolver) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        AnonymousClass09A.B(8192, "CreateUIManagerConstants").B("Lazy", Boolean.valueOf(true)).C();
        try {
            Map createConstants = UIManagerModuleConstantsHelper.createConstants(viewManagerResolver);
            return createConstants;
        } finally {
            AnonymousClass09H.C(8192, -657602596);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    private static Map createConstants(List list, Map map, Map map2) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        AnonymousClass09A.B(8192, "CreateUIManagerConstants").B("Lazy", Boolean.valueOf(false)).C();
        try {
            Map createConstants = UIManagerModuleConstantsHelper.createConstants(list, map, map2);
            return createConstants;
        } finally {
            AnonymousClass09H.C(8192, 1998569504);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    @ReactMethod
    public void createView(int i, String str, int i2, ReadableMap readableMap) {
        if (DEBUG) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("(UIManager.createView) tag: ");
            stringBuilder.append(i);
            stringBuilder.append(", class: ");
            stringBuilder.append(str);
            stringBuilder.append(", props: ");
            stringBuilder.append(readableMap);
            stringBuilder.toString();
        }
        this.mUIImplementation.createView(i, str, i2, readableMap);
    }

    @ReactMethod
    public void dismissPopupMenu() {
        this.mUIImplementation.dismissPopupMenu();
    }

    public void dispatchCommand(int i, int i2, ReadableArray readableArray) {
        this.mUIImplementation.dispatchViewManagerCommand(i, i2, readableArray);
    }

    @ReactMethod
    public void dispatchViewManagerCommand(int i, int i2, ReadableArray readableArray) {
        UIManagerHelper.getUIManager(getReactApplicationContext(), ViewUtil.getUIManagerType(i)).dispatchCommand(i, i2, readableArray);
    }

    @ReactMethod
    public void findSubviewIn(int i, ReadableArray readableArray, Callback callback) {
        this.mUIImplementation.findSubviewIn(i, (float) Math.round(PixelUtil.toPixelFromDIP(readableArray.getDouble(0))), (float) Math.round(PixelUtil.toPixelFromDIP(readableArray.getDouble(1))), callback);
    }

    public Map getConstants() {
        return this.mModuleConstants;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getConstantsForViewManager(String str) {
        ViewManager resolveViewManager = str != null ? this.mUIImplementation.resolveViewManager(str) : null;
        if (resolveViewManager == null) {
            return null;
        }
        AnonymousClass09A.B(8192, "UIManagerModule.getConstantsForViewManager").B("ViewManager", resolveViewManager.getName()).B("Lazy", Boolean.valueOf(true)).C();
        try {
            Map createConstantsForViewManager = UIManagerModuleConstantsHelper.createConstantsForViewManager(resolveViewManager, null, null, null, this.mCustomDirectEvents);
            if (createConstantsForViewManager != null) {
                WritableMap makeNativeMap = Arguments.makeNativeMap(createConstantsForViewManager);
                return makeNativeMap;
            }
            AnonymousClass09A.C(8192).C();
            return null;
        } finally {
            AnonymousClass09A.C(8192).C();
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getDefaultEventTypes() {
        return Arguments.makeNativeMap(UIManagerModuleConstantsHelper.getDefaultExportableEventTypes());
    }

    public CustomEventNamesResolver getDirectEventNamesResolver() {
        return new C01421();
    }

    public EventDispatcher getEventDispatcher() {
        return this.mEventDispatcher;
    }

    public Map getPerformanceCounters() {
        return this.mUIImplementation.getProfiledBatchPerfCounters();
    }

    public UIImplementation getUIImplementation() {
        return this.mUIImplementation;
    }

    public void initialize() {
        getReactApplicationContext().registerComponentCallbacks(this.mMemoryTrimCallback);
        this.mEventDispatcher.registerEventEmitter(1, (RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class));
    }

    public void invalidateNodeLayout(int i) {
        ReactShadowNode resolveShadowNode = this.mUIImplementation.resolveShadowNode(i);
        if (resolveShadowNode == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Warning : attempted to dirty a non-existent react shadow node. reactTag=");
            stringBuilder.append(i);
            AnonymousClass0Df.H("ReactNative", stringBuilder.toString());
            return;
        }
        resolveShadowNode.dirty();
        this.mUIImplementation.dispatchViewUpdates(-1);
    }

    @ReactMethod
    public void manageChildren(int i, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        int i2 = i;
        ReadableArray readableArray6 = readableArray;
        ReadableArray readableArray7 = readableArray2;
        ReadableArray readableArray8 = readableArray3;
        ReadableArray readableArray9 = readableArray4;
        ReadableArray readableArray10 = readableArray5;
        if (DEBUG) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("(UIManager.manageChildren) tag: ");
            stringBuilder.append(i);
            stringBuilder.append(", moveFrom: ");
            stringBuilder.append(readableArray);
            stringBuilder.append(", moveTo: ");
            stringBuilder.append(readableArray2);
            stringBuilder.append(", addTags: ");
            stringBuilder.append(readableArray3);
            stringBuilder.append(", atIndices: ");
            stringBuilder.append(readableArray4);
            stringBuilder.append(", removeFrom: ");
            stringBuilder.append(readableArray5);
            stringBuilder.toString();
        }
        this.mUIImplementation.manageChildren(i2, readableArray6, readableArray7, readableArray8, readableArray9, readableArray10);
    }

    @ReactMethod
    public void measure(int i, Callback callback) {
        this.mUIImplementation.measure(i, callback);
    }

    @ReactMethod
    public void measureInWindow(int i, Callback callback) {
        this.mUIImplementation.measureInWindow(i, callback);
    }

    @ReactMethod
    public void measureLayout(int i, int i2, Callback callback, Callback callback2) {
        this.mUIImplementation.measureLayout(i, i2, callback, callback2);
    }

    @ReactMethod
    public void measureLayoutRelativeToParent(int i, Callback callback, Callback callback2) {
        this.mUIImplementation.measureLayoutRelativeToParent(i, callback, callback2);
    }

    public void onBatchComplete() {
        int i = this.mBatchId;
        this.mBatchId = i + 1;
        AnonymousClass09A.B(8192, "onBatchCompleteUI").A("BatchId", i).C();
        for (UIManagerModuleListener willDispatchViewUpdates : this.mListeners) {
            willDispatchViewUpdates.willDispatchViewUpdates(this);
        }
        try {
            this.mUIImplementation.dispatchViewUpdates(i);
        } finally {
            AnonymousClass09H.C(8192, -1916767129);
        }
    }

    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        this.mEventDispatcher.onCatalystInstanceDestroyed();
        getReactApplicationContext().unregisterComponentCallbacks(this.mMemoryTrimCallback);
        YogaNodePool.get().clear();
        ViewManagerPropertyUpdater.clear();
    }

    public void onHostDestroy() {
        UIImplementation.onHostDestroy();
    }

    public void onHostPause() {
        this.mUIImplementation.onHostPause();
    }

    public void onHostResume() {
        this.mUIImplementation.onHostResume();
    }

    @ReactMethod
    public void playTouchSound() {
        AudioManager audioManager = (AudioManager) getReactApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (audioManager != null) {
            audioManager.playSoundEffect(0);
        }
    }

    public void prependUIBlock(UIBlock uIBlock) {
        this.mUIImplementation.prependUIBlock(uIBlock);
    }

    public void profileNextBatch() {
        this.mUIImplementation.profileNextBatch();
    }

    public void registerAnimation(Animation animation) {
        this.mUIImplementation.registerAnimation(animation);
    }

    public void removeAnimation(int i, int i2) {
        this.mUIImplementation.removeAnimation(i, i2);
    }

    @ReactMethod
    public void removeRootView(int i) {
        this.mUIImplementation.removeRootView(i);
    }

    @ReactMethod
    public void removeSubviewsFromContainerWithID(int i) {
        this.mUIImplementation.removeSubviewsFromContainerWithID(i);
    }

    public void removeUIManagerListener(UIManagerModuleListener uIManagerModuleListener) {
        this.mListeners.remove(uIManagerModuleListener);
    }

    @ReactMethod
    public void replaceExistingNonRootView(int i, int i2) {
        this.mUIImplementation.replaceExistingNonRootView(i, i2);
    }

    public int resolveRootTagFromReactTag(int i) {
        return this.mUIImplementation.resolveRootTagFromReactTag(i);
    }

    @ReactMethod
    public void sendAccessibilityEvent(int i, int i2) {
        this.mUIImplementation.sendAccessibilityEvent(i, i2);
    }

    @ReactMethod
    public void setChildren(int i, ReadableArray readableArray) {
        if (DEBUG) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("(UIManager.setChildren) tag: ");
            stringBuilder.append(i);
            stringBuilder.append(", children: ");
            stringBuilder.append(readableArray);
            stringBuilder.toString();
        }
        this.mUIImplementation.setChildren(i, readableArray);
    }

    @ReactMethod
    public void setJSResponder(int i, boolean z) {
        this.mUIImplementation.setJSResponder(i, z);
    }

    @ReactMethod
    public void setLayoutAnimationEnabledExperimental(boolean z) {
        this.mUIImplementation.setLayoutAnimationEnabledExperimental(z);
    }

    public void setViewHierarchyUpdateDebugListener(NotThreadSafeViewHierarchyUpdateDebugListener notThreadSafeViewHierarchyUpdateDebugListener) {
        this.mUIImplementation.setViewHierarchyUpdateDebugListener(notThreadSafeViewHierarchyUpdateDebugListener);
    }

    public void setViewLocalData(final int i, final Object obj) {
        ReactContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.assertOnUiQueueThread();
        reactApplicationContext.runOnNativeModulesQueueThread(new GuardedRunnable(reactApplicationContext) {
            public final void runGuarded() {
                UIManagerModule.this.mUIImplementation.setViewLocalData(i, obj);
            }
        });
    }

    @ReactMethod
    public void showPopupMenu(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        this.mUIImplementation.showPopupMenu(i, readableArray, callback, callback2);
    }

    public void updateNodeSize(int i, int i2, int i3) {
        getReactApplicationContext().assertOnNativeModulesQueueThread();
        this.mUIImplementation.updateNodeSize(i, i2, i3);
    }

    public void updateRootLayoutSpecs(final int i, final int i2, final int i3) {
        ReactContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.runOnNativeModulesQueueThread(new GuardedRunnable(reactApplicationContext) {
            public final void runGuarded() {
                UIManagerModule.this.mUIImplementation.updateRootView(i, i2, i3);
                UIManagerModule.this.mUIImplementation.dispatchViewUpdates(-1);
            }
        });
    }

    @ReactMethod
    public void updateView(int i, String str, ReadableMap readableMap) {
        if (DEBUG) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("(UIManager.updateView) tag: ");
            stringBuilder.append(i);
            stringBuilder.append(", class: ");
            stringBuilder.append(str);
            stringBuilder.append(", props: ");
            stringBuilder.append(readableMap);
            stringBuilder.toString();
        }
        this.mUIImplementation.updateView(i, str, readableMap);
    }

    @ReactMethod
    public void viewIsDescendantOf(int i, int i2, Callback callback) {
        this.mUIImplementation.viewIsDescendantOf(i, i2, callback);
    }
}
