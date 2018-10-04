package com.facebook.react.uimanager;

import X.AnonymousClass09A;
import X.AnonymousClass09H;
import X.AnonymousClass0Df;
import X.AnonymousClass0LR;
import android.os.SystemClock;
import android.view.View.MeasureSpec;
import com.facebook.forker.Process;
import com.facebook.react.animation.Animation;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.UIManagerModule.ViewManagerResolver;
import com.facebook.react.uimanager.common.MeasureSpecProvider;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import com.facebook.react.uimanager.debug.NotThreadSafeViewHierarchyUpdateDebugListener;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.yoga.YogaDirection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class UIImplementation {
    public final EventDispatcher mEventDispatcher;
    private long mLastCalculateLayoutTime;
    public LayoutUpdateListener mLayoutUpdateListener;
    private final int[] mMeasureBuffer;
    private final Set mMeasuredRootNodes;
    private final NativeViewHierarchyOptimizer mNativeViewHierarchyOptimizer;
    private final UIViewOperationQueue mOperationsQueue;
    public final ReactApplicationContext mReactContext;
    public final ShadowNodeRegistry mShadowNodeRegistry;
    private final ViewManagerRegistry mViewManagers;

    public interface LayoutUpdateListener {
        void onLayoutUpdated(ReactShadowNode reactShadowNode);
    }

    public static final void onHostDestroy() {
    }

    public UIImplementation(ReactApplicationContext reactApplicationContext, ViewManagerResolver viewManagerResolver, EventDispatcher eventDispatcher, int i) {
        this(reactApplicationContext, new ViewManagerRegistry(viewManagerResolver), eventDispatcher, i);
    }

    public UIImplementation(ReactApplicationContext reactApplicationContext, ViewManagerRegistry viewManagerRegistry, UIViewOperationQueue uIViewOperationQueue, EventDispatcher eventDispatcher) {
        this.mShadowNodeRegistry = new ShadowNodeRegistry();
        this.mMeasuredRootNodes = new HashSet();
        this.mMeasureBuffer = new int[4];
        this.mLastCalculateLayoutTime = 0;
        this.mReactContext = reactApplicationContext;
        this.mViewManagers = viewManagerRegistry;
        this.mOperationsQueue = uIViewOperationQueue;
        this.mNativeViewHierarchyOptimizer = new NativeViewHierarchyOptimizer(this.mOperationsQueue, this.mShadowNodeRegistry);
        this.mEventDispatcher = eventDispatcher;
    }

    private UIImplementation(ReactApplicationContext reactApplicationContext, ViewManagerRegistry viewManagerRegistry, EventDispatcher eventDispatcher, int i) {
        this(reactApplicationContext, viewManagerRegistry, new UIViewOperationQueue(reactApplicationContext, new NativeViewHierarchyManager(viewManagerRegistry), i), eventDispatcher);
    }

    public UIImplementation(ReactApplicationContext reactApplicationContext, List list, EventDispatcher eventDispatcher, int i) {
        this(reactApplicationContext, new ViewManagerRegistry(list), eventDispatcher, i);
    }

    public final void addAnimation(int i, int i2, Callback callback) {
        assertViewExists(i, "addAnimation");
        this.mOperationsQueue.enqueueAddAnimation(i, i2, callback);
    }

    public final void addUIBlock(UIBlock uIBlock) {
        this.mOperationsQueue.enqueueUIBlock(uIBlock);
    }

    public final void applyUpdatesRecursive(ReactShadowNode reactShadowNode, float f, float f2) {
        if (reactShadowNode.hasUpdates()) {
            if (!reactShadowNode.isVirtualAnchor()) {
                for (int i = 0; i < reactShadowNode.getChildCount(); i++) {
                    applyUpdatesRecursive(reactShadowNode.getChildAt(i), reactShadowNode.getLayoutX() + f, reactShadowNode.getLayoutY() + f2);
                }
            }
            int reactTag = reactShadowNode.getReactTag();
            if (!this.mShadowNodeRegistry.isRootNode(reactTag) && reactShadowNode.dispatchUpdates(f, f2, this.mOperationsQueue, this.mNativeViewHierarchyOptimizer) && reactShadowNode.shouldNotifyOnLayout()) {
                this.mEventDispatcher.dispatchEvent(OnLayoutEvent.obtain(reactTag, reactShadowNode.getScreenX(), reactShadowNode.getScreenY(), reactShadowNode.getScreenWidth(), reactShadowNode.getScreenHeight()));
            }
            reactShadowNode.markUpdateSeen();
        }
    }

    private void assertNodeDoesNotNeedCustomLayoutForChildren(ReactShadowNode reactShadowNode) {
        ViewManager viewManager = (ViewManager) AnonymousClass0LR.D(this.mViewManagers.get(reactShadowNode.getViewClass()));
        if (viewManager instanceof ViewGroupManager) {
            ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
            if (viewGroupManager == null) {
                return;
            }
            if (viewGroupManager.needsCustomLayoutForChildren()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (");
                stringBuilder.append(reactShadowNode.getViewClass());
                stringBuilder.append("). Use measure instead.");
                throw new IllegalViewOperationException(stringBuilder.toString());
            }
            return;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Trying to use view ");
        stringBuilder.append(reactShadowNode.getViewClass());
        stringBuilder.append(" as a parent, but its Manager doesn't extends ViewGroupManager");
        throw new IllegalViewOperationException(stringBuilder.toString());
    }

    private void assertViewExists(int i, String str) {
        if (this.mShadowNodeRegistry.getNode(i) == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to execute operation ");
            stringBuilder.append(str);
            stringBuilder.append(" on view with ");
            stringBuilder.append("tag: ");
            stringBuilder.append(i);
            stringBuilder.append(", since the view does not exists");
            throw new IllegalViewOperationException(stringBuilder.toString());
        }
    }

    public final void calculateRootLayout(ReactShadowNode reactShadowNode) {
        AnonymousClass09A.B(8192, "cssRoot.calculateLayout").A("rootTag", reactShadowNode.getReactTag()).C();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            reactShadowNode.calculateLayout();
        } finally {
            AnonymousClass09H.C(8192, -1346272845);
            this.mLastCalculateLayoutTime = SystemClock.uptimeMillis() - uptimeMillis;
        }
    }

    public final void clearJSResponder() {
        this.mOperationsQueue.enqueueClearJSResponder();
    }

    public final void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.mOperationsQueue.enqueueConfigureLayoutAnimation(readableMap, callback, callback2);
    }

    public final ReactShadowNode createRootShadowNode() {
        ReactShadowNode reactShadowNodeImpl = new ReactShadowNodeImpl();
        if (I18nUtil.getInstance().isRTL(this.mReactContext)) {
            reactShadowNodeImpl.setLayoutDirection(YogaDirection.RTL);
        }
        reactShadowNodeImpl.setViewClassName("Root");
        return reactShadowNodeImpl;
    }

    public final ReactShadowNode createShadowNode(String str) {
        return this.mViewManagers.get(str).createShadowNodeInstance(this.mReactContext);
    }

    public final void createView(int i, String str, int i2, ReadableMap readableMap) {
        ReactStylesDiffMap reactStylesDiffMap;
        ReactShadowNode createShadowNode = createShadowNode(str);
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Root node with tag ");
        stringBuilder.append(i2);
        stringBuilder.append(" doesn't exist");
        AnonymousClass0LR.E(node, stringBuilder.toString());
        createShadowNode.setReactTag(i);
        createShadowNode.setViewClassName(str);
        createShadowNode.setRootTag(node.getReactTag());
        createShadowNode.setThemedContext(node.getThemedContext());
        this.mShadowNodeRegistry.addNode(createShadowNode);
        if (readableMap != null) {
            reactStylesDiffMap = new ReactStylesDiffMap(readableMap);
            createShadowNode.updateProperties(reactStylesDiffMap);
        } else {
            reactStylesDiffMap = null;
        }
        handleCreateView(createShadowNode, i2, reactStylesDiffMap);
    }

    public final void dismissPopupMenu() {
        this.mOperationsQueue.enqueueDismissPopupMenu();
    }

    public final void dispatchViewManagerCommand(int i, int i2, ReadableArray readableArray) {
        assertViewExists(i, "dispatchViewManagerCommand");
        this.mOperationsQueue.enqueueDispatchCommand(i, i2, readableArray);
    }

    public final void dispatchViewUpdates(int i) {
        int i2 = i;
        AnonymousClass09A.B(8192, "UIImplementation.dispatchViewUpdates").A("batchId", i).C();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            updateViewHierarchy();
            this.mNativeViewHierarchyOptimizer.onBatchComplete();
            this.mOperationsQueue.dispatchViewUpdates(i2, uptimeMillis, this.mLastCalculateLayoutTime);
        } finally {
            AnonymousClass09H.C(8192, 916237250);
        }
    }

    private void dispatchViewUpdatesIfNeeded() {
        if (this.mOperationsQueue.isEmpty()) {
            dispatchViewUpdates(-1);
        }
    }

    public final void enableLayoutCalculationForRootNode(int i) {
        this.mMeasuredRootNodes.add(Integer.valueOf(i));
    }

    public final void findSubviewIn(int i, float f, float f2, Callback callback) {
        this.mOperationsQueue.enqueueFindTargetForTouch(i, f, f2, callback);
    }

    public final Map getProfiledBatchPerfCounters() {
        return this.mOperationsQueue.getProfiledBatchPerfCounters();
    }

    public final void handleCreateView(ReactShadowNode reactShadowNode, int i, ReactStylesDiffMap reactStylesDiffMap) {
        if (!reactShadowNode.isVirtual()) {
            this.mNativeViewHierarchyOptimizer.handleCreateView(reactShadowNode, reactShadowNode.getThemedContext(), reactStylesDiffMap);
        }
    }

    public final void handleUpdateView(ReactShadowNode reactShadowNode, String str, ReactStylesDiffMap reactStylesDiffMap) {
        if (!reactShadowNode.isVirtual()) {
            this.mNativeViewHierarchyOptimizer.handleUpdateView(reactShadowNode, str, reactStylesDiffMap);
        }
    }

    public final void manageChildren(int i, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        int i2;
        int i3;
        int i4;
        int i5;
        int reactTag;
        int reactTag2;
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
        ReadableArray readableArray6 = readableArray;
        if (readableArray == null) {
            i2 = 0;
        } else {
            i2 = readableArray6.size();
        }
        ReadableArray readableArray7 = readableArray3;
        if (readableArray3 == null) {
            i3 = 0;
        } else {
            i3 = readableArray7.size();
        }
        ReadableArray readableArray8 = readableArray5;
        if (readableArray5 == null) {
            i4 = 0;
        } else {
            i4 = readableArray8.size();
        }
        ReadableArray readableArray9 = readableArray2;
        if (i2 != 0) {
            if (readableArray2 == null || i2 != readableArray9.size()) {
                throw new IllegalViewOperationException("Size of moveFrom != size of moveTo!");
            }
        }
        ReadableArray readableArray10 = readableArray4;
        if (i3 != 0) {
            if (readableArray4 == null || i3 != readableArray10.size()) {
                throw new IllegalViewOperationException("Size of addChildTags != size of addAtIndices!");
            }
        }
        ViewAtIndex[] viewAtIndexArr = new ViewAtIndex[(i2 + i3)];
        int[] iArr = new int[(i2 + i4)];
        int[] iArr2 = new int[iArr.length];
        int[] iArr3 = new int[i4];
        if (i2 > 0) {
            AnonymousClass0LR.D(readableArray6);
            AnonymousClass0LR.D(readableArray9);
            for (i5 = 0; i5 < i2; i5++) {
                int i6 = readableArray6.getInt(i5);
                reactTag = node.getChildAt(i6).getReactTag();
                viewAtIndexArr[i5] = new ViewAtIndex(reactTag, readableArray9.getInt(i5));
                iArr[i5] = i6;
                iArr2[i5] = reactTag;
            }
        }
        if (i3 > 0) {
            AnonymousClass0LR.D(readableArray7);
            AnonymousClass0LR.D(readableArray10);
            for (i5 = 0; i5 < i3; i5++) {
                viewAtIndexArr[i2 + i5] = new ViewAtIndex(readableArray7.getInt(i5), readableArray10.getInt(i5));
            }
        }
        if (i4 > 0) {
            AnonymousClass0LR.D(readableArray8);
            for (i3 = 0; i3 < i4; i3++) {
                reactTag = readableArray8.getInt(i3);
                reactTag2 = node.getChildAt(reactTag).getReactTag();
                int i7 = i2 + i3;
                iArr[i7] = reactTag;
                iArr2[i7] = reactTag2;
                iArr3[i3] = reactTag2;
            }
        }
        Arrays.sort(viewAtIndexArr, ViewAtIndex.COMPARATOR);
        Arrays.sort(iArr);
        reactTag = iArr.length - 1;
        reactTag2 = -1;
        while (reactTag >= 0) {
            if (iArr[reactTag] != reactTag2) {
                node.removeChildAt(iArr[reactTag]);
                reactTag2 = iArr[reactTag];
                reactTag--;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Repeated indices in Removal list for view tag: ");
                stringBuilder.append(i);
                throw new IllegalViewOperationException(stringBuilder.toString());
            }
        }
        i3 = 0;
        while (i3 < viewAtIndexArr.length) {
            ViewAtIndex viewAtIndex = viewAtIndexArr[i3];
            ReactShadowNode node2 = r3.mShadowNodeRegistry.getNode(viewAtIndex.mTag);
            if (node2 != null) {
                node.addChildAt(node2, viewAtIndex.mIndex);
                i3++;
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Trying to add unknown view tag: ");
                stringBuilder.append(viewAtIndex.mTag);
                throw new IllegalViewOperationException(stringBuilder.toString());
            }
        }
        if (!(node.isVirtual() || node.isVirtualAnchor())) {
            r3.mNativeViewHierarchyOptimizer.handleManageChildren(node, iArr, iArr2, viewAtIndexArr, iArr3);
        }
        for (int i72 : iArr3) {
            removeShadowNode(r3.mShadowNodeRegistry.getNode(i72));
        }
    }

    public final void measure(int i, Callback callback) {
        this.mOperationsQueue.enqueueMeasure(i, callback);
    }

    public final void measureInWindow(int i, Callback callback) {
        this.mOperationsQueue.enqueueMeasureInWindow(i, callback);
    }

    public final void measureLayout(int i, int i2, Callback callback, Callback callback2) {
        try {
            measureLayout(i, i2, this.mMeasureBuffer);
            float toDIPFromPixel = PixelUtil.toDIPFromPixel((float) this.mMeasureBuffer[0]);
            float toDIPFromPixel2 = PixelUtil.toDIPFromPixel((float) this.mMeasureBuffer[1]);
            float toDIPFromPixel3 = PixelUtil.toDIPFromPixel((float) this.mMeasureBuffer[2]);
            float toDIPFromPixel4 = PixelUtil.toDIPFromPixel((float) this.mMeasureBuffer[3]);
            callback2.invoke(Float.valueOf(toDIPFromPixel), Float.valueOf(toDIPFromPixel2), Float.valueOf(toDIPFromPixel3), Float.valueOf(toDIPFromPixel4));
        } catch (IllegalViewOperationException e) {
            callback.invoke(e.getMessage());
        }
    }

    private void measureLayout(int i, int i2, int[] iArr) {
        StringBuilder stringBuilder;
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
        ReactShadowNode node2 = this.mShadowNodeRegistry.getNode(i2);
        if (node != null) {
            if (node2 != null) {
                if (node != node2) {
                    ReactShadowNode parent = node.getParent();
                    while (parent != node2) {
                        if (parent != null) {
                            parent = parent.getParent();
                        } else {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Tag ");
                            stringBuilder.append(i2);
                            stringBuilder.append(" is not an ancestor of tag ");
                            stringBuilder.append(i);
                            throw new IllegalViewOperationException(stringBuilder.toString());
                        }
                    }
                }
                measureLayoutRelativeToVerifiedAncestor(node, node2, iArr);
                return;
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Tag ");
        if (node != null) {
            i = i2;
        }
        stringBuilder.append(i);
        stringBuilder.append(" does not exist");
        throw new IllegalViewOperationException(stringBuilder.toString());
    }

    public final void measureLayoutRelativeToParent(int i, Callback callback, Callback callback2) {
        try {
            measureLayoutRelativeToParent(i, this.mMeasureBuffer);
            float toDIPFromPixel = PixelUtil.toDIPFromPixel((float) this.mMeasureBuffer[0]);
            float toDIPFromPixel2 = PixelUtil.toDIPFromPixel((float) this.mMeasureBuffer[1]);
            float toDIPFromPixel3 = PixelUtil.toDIPFromPixel((float) this.mMeasureBuffer[2]);
            float toDIPFromPixel4 = PixelUtil.toDIPFromPixel((float) this.mMeasureBuffer[3]);
            callback2.invoke(Float.valueOf(toDIPFromPixel), Float.valueOf(toDIPFromPixel2), Float.valueOf(toDIPFromPixel3), Float.valueOf(toDIPFromPixel4));
        } catch (IllegalViewOperationException e) {
            callback.invoke(e.getMessage());
        }
    }

    private void measureLayoutRelativeToParent(int i, int[] iArr) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
        if (node != null) {
            ReactShadowNode parent = node.getParent();
            if (parent != null) {
                measureLayoutRelativeToVerifiedAncestor(node, parent, iArr);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("View with tag ");
            stringBuilder.append(i);
            stringBuilder.append(" doesn't have a parent!");
            throw new IllegalViewOperationException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("No native view for tag ");
        stringBuilder.append(i);
        stringBuilder.append(" exists!");
        throw new IllegalViewOperationException(stringBuilder.toString());
    }

    private void measureLayoutRelativeToVerifiedAncestor(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int[] iArr) {
        int round;
        int round2;
        if (reactShadowNode != reactShadowNode2) {
            round = Math.round(reactShadowNode.getLayoutX());
            round2 = Math.round(reactShadowNode.getLayoutY());
            for (ReactShadowNode parent = reactShadowNode.getParent(); parent != reactShadowNode2; parent = parent.getParent()) {
                AnonymousClass0LR.D(parent);
                assertNodeDoesNotNeedCustomLayoutForChildren(parent);
                round += Math.round(parent.getLayoutX());
                round2 += Math.round(parent.getLayoutY());
            }
            assertNodeDoesNotNeedCustomLayoutForChildren(reactShadowNode2);
        } else {
            round = 0;
            round2 = 0;
        }
        iArr[0] = round;
        iArr[1] = round2;
        iArr[2] = reactShadowNode.getScreenWidth();
        iArr[3] = reactShadowNode.getScreenHeight();
    }

    private void notifyOnBeforeLayoutRecursive(ReactShadowNode reactShadowNode) {
        if (reactShadowNode.hasUpdates()) {
            for (int i = 0; i < reactShadowNode.getChildCount(); i++) {
                notifyOnBeforeLayoutRecursive(reactShadowNode.getChildAt(i));
            }
            reactShadowNode.onBeforeLayout();
        }
    }

    public final void onHostPause() {
        this.mOperationsQueue.pauseFrameCallback();
    }

    public final void onHostResume() {
        this.mOperationsQueue.resumeFrameCallback();
    }

    public final void prependUIBlock(UIBlock uIBlock) {
        this.mOperationsQueue.prependUIBlock(uIBlock);
    }

    public final void profileNextBatch() {
        this.mOperationsQueue.profileNextBatch();
    }

    public final void registerAnimation(Animation animation) {
        this.mOperationsQueue.enqueueRegisterAnimation(animation);
    }

    public final void registerRootView(SizeMonitoringFrameLayout sizeMonitoringFrameLayout, int i, ThemedReactContext themedReactContext) {
        final ReactShadowNode createRootShadowNode = createRootShadowNode();
        createRootShadowNode.setReactTag(i);
        createRootShadowNode.setThemedContext(themedReactContext);
        MeasureSpecProvider measureSpecProvider = (MeasureSpecProvider) sizeMonitoringFrameLayout;
        updateRootView(createRootShadowNode, measureSpecProvider.getWidthMeasureSpec(), measureSpecProvider.getHeightMeasureSpec());
        themedReactContext.runOnNativeModulesQueueThread(new Runnable() {
            public final void run() {
                UIImplementation.this.mShadowNodeRegistry.addRootNode(createRootShadowNode);
            }
        });
        this.mOperationsQueue.addRootView(i, sizeMonitoringFrameLayout, themedReactContext);
    }

    public final void removeAnimation(int i, int i2) {
        assertViewExists(i, "removeAnimation");
        this.mOperationsQueue.enqueueRemoveAnimation(i2);
    }

    public final void removeRootShadowNode(int i) {
        this.mShadowNodeRegistry.removeRootNode(i);
    }

    public final void removeRootView(int i) {
        removeRootShadowNode(i);
        this.mOperationsQueue.enqueueRemoveRootView(i);
    }

    public final void removeShadowNode(ReactShadowNode reactShadowNode) {
        removeShadowNodeRecursive(reactShadowNode);
        reactShadowNode.dispose();
    }

    private void removeShadowNodeRecursive(ReactShadowNode reactShadowNode) {
        NativeViewHierarchyOptimizer.handleRemoveNode(reactShadowNode);
        this.mShadowNodeRegistry.removeNode(reactShadowNode.getReactTag());
        this.mMeasuredRootNodes.remove(Integer.valueOf(reactShadowNode.getReactTag()));
        for (int childCount = reactShadowNode.getChildCount() - 1; childCount >= 0; childCount--) {
            removeShadowNodeRecursive(reactShadowNode.getChildAt(childCount));
        }
        reactShadowNode.removeAndDisposeAllChildren();
    }

    public final void removeSubviewsFromContainerWithID(int i) {
        UIImplementation uIImplementation = this;
        int i2 = i;
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
        if (node != null) {
            i = Arguments.createArray();
            for (int i3 = 0; i3 < node.getChildCount(); i3++) {
                i.pushInt(i3);
            }
            manageChildren(i2, null, null, null, null, i);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Trying to remove subviews of an unknown view tag: ");
        stringBuilder.append(i);
        throw new IllegalViewOperationException(stringBuilder.toString());
    }

    public final void replaceExistingNonRootView(int i, int i2) {
        UIImplementation uIImplementation = this;
        if (this.mShadowNodeRegistry.isRootNode(i) || this.mShadowNodeRegistry.isRootNode(i2)) {
            throw new IllegalViewOperationException("Trying to add or replace a root tag!");
        }
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
        if (node != null) {
            ReactShadowNode parent = node.getParent();
            if (parent != null) {
                int indexOf = parent.indexOf(node);
                if (indexOf >= 0) {
                    ReadableArray createArray = Arguments.createArray();
                    createArray.pushInt(i2);
                    i = Arguments.createArray();
                    i.pushInt(indexOf);
                    i2 = Arguments.createArray();
                    i2.pushInt(indexOf);
                    manageChildren(parent.getReactTag(), null, null, createArray, i, i2);
                    return;
                }
                throw new IllegalStateException("Didn't find child tag in parent");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Node is not attached to a parent: ");
            stringBuilder.append(i);
            throw new IllegalViewOperationException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Trying to replace unknown view tag: ");
        stringBuilder.append(i);
        throw new IllegalViewOperationException(stringBuilder.toString());
    }

    public final int resolveRootTagFromReactTag(int i) {
        if (this.mShadowNodeRegistry.isRootNode(i)) {
            return i;
        }
        ReactShadowNode resolveShadowNode = resolveShadowNode(i);
        int i2 = 0;
        if (resolveShadowNode != null) {
            i2 = resolveShadowNode.getRootTag();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Warning : attempted to resolve a non-existent react shadow node. reactTag=");
            stringBuilder.append(i);
            AnonymousClass0Df.H("ReactNative", stringBuilder.toString());
        }
        return i2;
    }

    public final ReactShadowNode resolveShadowNode(int i) {
        return this.mShadowNodeRegistry.getNode(i);
    }

    public final ViewManager resolveViewManager(String str) {
        return this.mViewManagers.get(str);
    }

    public final void sendAccessibilityEvent(int i, int i2) {
        this.mOperationsQueue.enqueueSendAccessibilityEvent(i, i2);
    }

    public final void setChildren(int i, ReadableArray readableArray) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
        int i2 = 0;
        while (i2 < readableArray.size()) {
            ReactShadowNode node2 = this.mShadowNodeRegistry.getNode(readableArray.getInt(i2));
            if (node2 != null) {
                node.addChildAt(node2, i2);
                i2++;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Trying to add unknown view tag: ");
                stringBuilder.append(readableArray.getInt(i2));
                throw new IllegalViewOperationException(stringBuilder.toString());
            }
        }
        if (!node.isVirtual() && !node.isVirtualAnchor()) {
            this.mNativeViewHierarchyOptimizer.handleSetChildren(node, readableArray);
        }
    }

    public final void setJSResponder(int i, boolean z) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
        if (node != null) {
            while (true) {
                if (!node.isVirtual()) {
                    if (!node.isLayoutOnly()) {
                        this.mOperationsQueue.enqueueSetJSResponder(node.getReactTag(), i, z);
                        return;
                    }
                }
                node = node.getParent();
            }
        }
    }

    public final void setLayoutAnimationEnabledExperimental(boolean z) {
        this.mOperationsQueue.enqueueSetLayoutAnimationEnabled(z);
    }

    public final void setViewHierarchyUpdateDebugListener(NotThreadSafeViewHierarchyUpdateDebugListener notThreadSafeViewHierarchyUpdateDebugListener) {
        this.mOperationsQueue.setViewHierarchyUpdateDebugListener(notThreadSafeViewHierarchyUpdateDebugListener);
    }

    public final void setViewLocalData(int i, Object obj) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
        if (node == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Attempt to set local data for view with unknown tag: ");
            stringBuilder.append(i);
            AnonymousClass0Df.H("ReactNative", stringBuilder.toString());
            return;
        }
        node.setLocalData(obj);
        dispatchViewUpdatesIfNeeded();
    }

    public final void showPopupMenu(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        assertViewExists(i, "showPopupMenu");
        this.mOperationsQueue.enqueueShowPopupMenu(i, readableArray, callback, callback2);
    }

    public final void synchronouslyUpdateViewOnUIThread(int i, ReactStylesDiffMap reactStylesDiffMap) {
        UiThreadUtil.assertOnUiThread();
        this.mOperationsQueue.getNativeViewHierarchyManager().updateProperties(i, reactStylesDiffMap);
    }

    public final void updateNodeSize(int i, int i2, int i3) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
        if (node == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Tried to update size of non-existent tag: ");
            stringBuilder.append(i);
            AnonymousClass0Df.H("ReactNative", stringBuilder.toString());
            return;
        }
        node.setStyleWidth((float) i2);
        node.setStyleHeight((float) i3);
        dispatchViewUpdatesIfNeeded();
    }

    public final void updateRootView(int i, int i2, int i3) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
        if (node == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Tried to update non-existent root tag: ");
            stringBuilder.append(i);
            AnonymousClass0Df.H("ReactNative", stringBuilder.toString());
            return;
        }
        updateRootView(node, i2, i3);
    }

    public static final void updateRootView(ReactShadowNode reactShadowNode, int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode == Process.WAIT_RESULT_TIMEOUT) {
            reactShadowNode.setStyleMaxWidth((float) size);
        } else if (mode == 0) {
            reactShadowNode.setStyleWidthAuto();
        } else if (mode == 1073741824) {
            reactShadowNode.setStyleWidth((float) size);
        }
        mode = MeasureSpec.getMode(i2);
        size = MeasureSpec.getSize(i2);
        if (mode == Process.WAIT_RESULT_TIMEOUT) {
            reactShadowNode.setStyleMaxHeight((float) size);
        } else if (mode == 0) {
            reactShadowNode.setStyleHeightAuto();
        } else if (mode == 1073741824) {
            reactShadowNode.setStyleHeight((float) size);
        }
    }

    public final void updateView(int i, String str, ReadableMap readableMap) {
        if (this.mViewManagers.get(str) != null) {
            ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
            if (node == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Trying to update non-existent view with tag ");
                stringBuilder.append(i);
                throw new IllegalViewOperationException(stringBuilder.toString());
            } else if (readableMap != null) {
                ReactStylesDiffMap reactStylesDiffMap = new ReactStylesDiffMap(readableMap);
                node.updateProperties(reactStylesDiffMap);
                handleUpdateView(node, str, reactStylesDiffMap);
                return;
            } else {
                return;
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Got unknown view type: ");
        stringBuilder.append(str);
        throw new IllegalViewOperationException(stringBuilder.toString());
    }

    public final void updateViewHierarchy() {
        Throwable th = "UIImplementation.updateViewHierarchy";
        AnonymousClass09H.B(8192, th, -2076598530);
        for (int i = 0; i < this.mShadowNodeRegistry.getRootNodeCount(); i++) {
            int rootTag = this.mShadowNodeRegistry.getRootTag(i);
            ReactShadowNode node = this.mShadowNodeRegistry.getNode(rootTag);
            th = this.mMeasuredRootNodes;
            if (th.contains(Integer.valueOf(rootTag))) {
                String str = "rootTag";
                AnonymousClass09A.B(8192, "UIImplementation.notifyOnBeforeLayoutRecursive").A(str, node.getReactTag()).C();
                try {
                    notifyOnBeforeLayoutRecursive(node);
                    AnonymousClass09H.C(8192, 2053787268);
                    calculateRootLayout(node);
                    th = AnonymousClass09A.B(8192, "UIImplementation.applyUpdatesRecursive");
                    th.A(str, node.getReactTag()).C();
                } catch (Throwable th2) {
                    th = th2;
                    AnonymousClass09H.C(8192, -2012974344);
                }
                try {
                    applyUpdatesRecursive(node, 0.0f, 0.0f);
                    AnonymousClass09H.C(8192, -459719830);
                    if (this.mLayoutUpdateListener != null) {
                        th = this.mOperationsQueue;
                        th.enqueueLayoutUpdateFinished(node, this.mLayoutUpdateListener);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                } finally {
                    AnonymousClass09H.C(8192, -872687533);
                }
            }
        }
    }

    public final void viewIsDescendantOf(int i, int i2, Callback callback) {
        i = this.mShadowNodeRegistry.getNode(i);
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i2);
        if (i != 0) {
            if (node != null) {
                callback.invoke(Boolean.valueOf(i.isDescendantOf(node)));
                return;
            }
        }
        callback.invoke(Boolean.valueOf(false));
    }
}
