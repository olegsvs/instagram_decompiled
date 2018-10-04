package com.facebook.react.animated;

import X.AnonymousClass0LR;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.modules.core.ReactChoreographer.CallbackType;
import com.facebook.react.uimanager.GuardedFrameCallback;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIBlock;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.UIManagerModuleListener;
import java.util.ArrayList;

@ReactModule(name = "NativeAnimatedModule")
public class NativeAnimatedModule extends ReactContextBaseJavaModule implements LifecycleEventListener, UIManagerModuleListener {
    public static final String NAME = "NativeAnimatedModule";
    public final GuardedFrameCallback mAnimatedFrameCallback;
    private NativeAnimatedNodesManager mNodesManager;
    private ArrayList mOperations = new ArrayList();
    private ArrayList mPreOperations = new ArrayList();
    public final ReactChoreographer mReactChoreographer = ReactChoreographer.getInstance();

    public interface UIThreadOperation {
        void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager);
    }

    public String getName() {
        return NAME;
    }

    public void onHostDestroy() {
    }

    public NativeAnimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mAnimatedFrameCallback = new GuardedFrameCallback(reactApplicationContext) {
            public final void doFrameGuarded(long j) {
                NativeAnimatedNodesManager nodesManager = NativeAnimatedModule.getNodesManager(NativeAnimatedModule.this);
                if (nodesManager.hasActiveAnimations()) {
                    nodesManager.runUpdates(j);
                }
                ((ReactChoreographer) AnonymousClass0LR.D(NativeAnimatedModule.this.mReactChoreographer)).postFrameCallback(CallbackType.NATIVE_ANIMATED_MODULE, NativeAnimatedModule.this.mAnimatedFrameCallback);
            }
        };
    }

    @ReactMethod
    public void addAnimatedEventToView(final int i, final String str, final ReadableMap readableMap) {
        this.mOperations.add(new UIThreadOperation() {
            public final void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.addAnimatedEventToView(i, str, readableMap);
            }
        });
    }

    private void clearFrameCallback() {
        ((ReactChoreographer) AnonymousClass0LR.D(this.mReactChoreographer)).removeFrameCallback(CallbackType.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
    }

    @ReactMethod
    public void connectAnimatedNodeToView(final int i, final int i2) {
        this.mOperations.add(new UIThreadOperation() {
            public final void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.connectAnimatedNodeToView(i, i2);
            }
        });
    }

    @ReactMethod
    public void connectAnimatedNodes(final int i, final int i2) {
        this.mOperations.add(new UIThreadOperation() {
            public final void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.connectAnimatedNodes(i, i2);
            }
        });
    }

    @ReactMethod
    public void createAnimatedNode(final int i, final ReadableMap readableMap) {
        this.mOperations.add(new UIThreadOperation() {
            public final void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.createAnimatedNode(i, readableMap);
            }
        });
    }

    @ReactMethod
    public void disconnectAnimatedNodeFromView(final int i, final int i2) {
        this.mPreOperations.add(new UIThreadOperation() {
            public final void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.restoreDefaultValues(i, i2);
            }
        });
        this.mOperations.add(new UIThreadOperation() {
            public final void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.disconnectAnimatedNodeFromView(i, i2);
            }
        });
    }

    @ReactMethod
    public void disconnectAnimatedNodes(final int i, final int i2) {
        this.mOperations.add(new UIThreadOperation() {
            public final void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.disconnectAnimatedNodes(i, i2);
            }
        });
    }

    @ReactMethod
    public void dropAnimatedNode(final int i) {
        this.mOperations.add(new UIThreadOperation() {
            public final void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.dropAnimatedNode(i);
            }
        });
    }

    private void enqueueFrameCallback() {
        ((ReactChoreographer) AnonymousClass0LR.D(this.mReactChoreographer)).postFrameCallback(CallbackType.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
    }

    @ReactMethod
    public void extractAnimatedNodeOffset(final int i) {
        this.mOperations.add(new UIThreadOperation() {
            public final void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.extractAnimatedNodeOffset(i);
            }
        });
    }

    @ReactMethod
    public void flattenAnimatedNodeOffset(final int i) {
        this.mOperations.add(new UIThreadOperation() {
            public final void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.flattenAnimatedNodeOffset(i);
            }
        });
    }

    public static NativeAnimatedNodesManager getNodesManager(NativeAnimatedModule nativeAnimatedModule) {
        if (nativeAnimatedModule.mNodesManager == null) {
            nativeAnimatedModule.mNodesManager = new NativeAnimatedNodesManager((UIManagerModule) nativeAnimatedModule.getReactApplicationContext().getNativeModule(UIManagerModule.class));
        }
        return nativeAnimatedModule.mNodesManager;
    }

    public void initialize() {
        ReactContext reactApplicationContext = getReactApplicationContext();
        UIManagerModule uIManagerModule = (UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class);
        reactApplicationContext.addLifecycleEventListener(this);
        uIManagerModule.addUIManagerListener(this);
    }

    public void onHostPause() {
        clearFrameCallback();
    }

    public void onHostResume() {
        enqueueFrameCallback();
    }

    @ReactMethod
    public void removeAnimatedEventFromView(final int i, final String str, final int i2) {
        this.mOperations.add(new UIThreadOperation() {
            public final void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.removeAnimatedEventFromView(i, str, i2);
            }
        });
    }

    @ReactMethod
    public void setAnimatedNodeOffset(final int i, final double d) {
        this.mOperations.add(new UIThreadOperation() {
            public final void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.setAnimatedNodeOffset(i, d);
            }
        });
    }

    @ReactMethod
    public void setAnimatedNodeValue(final int i, final double d) {
        this.mOperations.add(new UIThreadOperation() {
            public final void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.setAnimatedNodeValue(i, d);
            }
        });
    }

    public void setNodesManager(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
        this.mNodesManager = nativeAnimatedNodesManager;
    }

    @ReactMethod
    public void startAnimatingNode(final int i, final int i2, final ReadableMap readableMap, final Callback callback) {
        this.mOperations.add(new UIThreadOperation() {
            public final void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.startAnimatingNode(i, i2, readableMap, callback);
            }
        });
    }

    @ReactMethod
    public void startListeningToAnimatedNodeValue(final int i) {
        final AnimatedNodeValueListener c02455 = new AnimatedNodeValueListener() {
            public final void onValueUpdate(double d) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("tag", i);
                createMap.putDouble("value", d);
                ((RCTDeviceEventEmitter) NativeAnimatedModule.this.getReactApplicationContext().getJSModule(RCTDeviceEventEmitter.class)).emit("onAnimatedValueUpdate", createMap);
            }
        };
        this.mOperations.add(new UIThreadOperation() {
            public final void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.startListeningToAnimatedNodeValue(i, c02455);
            }
        });
    }

    @ReactMethod
    public void stopAnimation(final int i) {
        this.mOperations.add(new UIThreadOperation() {
            public final void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.stopAnimation(i);
            }
        });
    }

    @ReactMethod
    public void stopListeningToAnimatedNodeValue(final int i) {
        this.mOperations.add(new UIThreadOperation() {
            public final void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.stopListeningToAnimatedNodeValue(i);
            }
        });
    }

    public void willDispatchViewUpdates(UIManagerModule uIManagerModule) {
        if (!this.mOperations.isEmpty() || !this.mPreOperations.isEmpty()) {
            final ArrayList arrayList = this.mPreOperations;
            final ArrayList arrayList2 = this.mOperations;
            this.mPreOperations = new ArrayList();
            this.mOperations = new ArrayList();
            uIManagerModule.prependUIBlock(new UIBlock() {
                public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                    NativeAnimatedNodesManager nodesManager = NativeAnimatedModule.getNodesManager(NativeAnimatedModule.this);
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((UIThreadOperation) arrayList.get(i)).execute(nodesManager);
                    }
                }
            });
            uIManagerModule.addUIBlock(new UIBlock() {
                public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                    NativeAnimatedNodesManager nodesManager = NativeAnimatedModule.getNodesManager(NativeAnimatedModule.this);
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        ((UIThreadOperation) arrayList2.get(i)).execute(nodesManager);
                    }
                }
            });
        }
    }
}
