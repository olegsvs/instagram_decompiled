package com.facebook.react.uimanager;

import X.AnonymousClass09A;
import X.AnonymousClass09H;
import X.AnonymousClass0CM;
import X.AnonymousClass0Df;
import android.os.SystemClock;
import com.facebook.react.animation.Animation;
import com.facebook.react.animation.AnimationRegistry;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.modules.core.ReactChoreographer.CallbackType;
import com.facebook.react.uimanager.UIImplementation.LayoutUpdateListener;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import com.facebook.react.uimanager.debug.NotThreadSafeViewHierarchyUpdateDebugListener;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class UIViewOperationQueue {
    public final AnimationRegistry mAnimationRegistry;
    private final Object mDispatchRunnablesLock = new Object();
    private final DispatchUIFrameCallback mDispatchUIFrameCallback;
    private ArrayList mDispatchUIRunnables = new ArrayList();
    private boolean mIsDispatchUIFrameCallbackEnqueued = false;
    public boolean mIsInIllegalUIState = false;
    public boolean mIsProfilingNextBatch = false;
    public final int[] mMeasureBuffer = new int[4];
    public final NativeViewHierarchyManager mNativeViewHierarchyManager;
    public long mNonBatchedExecutionTotalTime;
    public ArrayDeque mNonBatchedOperations = new ArrayDeque();
    public final Object mNonBatchedOperationsLock = new Object();
    private ArrayList mOperations = new ArrayList();
    private long mProfiledBatchBatchedExecutionTime;
    public long mProfiledBatchCommitStartTime;
    public long mProfiledBatchDispatchViewUpdatesTime;
    private long mProfiledBatchLayoutTime;
    private long mProfiledBatchNonBatchedExecutionTime;
    public long mProfiledBatchRunStartTime;
    private final ReactApplicationContext mReactApplicationContext;
    public NotThreadSafeViewHierarchyUpdateDebugListener mViewHierarchyUpdateDebugListener;

    public interface UIOperation {
        void execute();
    }

    public abstract class AnimationOperation implements UIOperation {
        public final int mAnimationID;

        public AnimationOperation(int i) {
            this.mAnimationID = i;
        }
    }

    public final class ConfigureLayoutAnimationOperation implements UIOperation {
        private final ReadableMap mConfig;

        public ConfigureLayoutAnimationOperation(ReadableMap readableMap) {
            this.mConfig = readableMap;
        }

        public final void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.configureLayoutAnimation(this.mConfig);
        }
    }

    public final class DismissPopupMenuOperation implements UIOperation {
        public final void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.dismissPopupMenu();
        }
    }

    public final class FindTargetForTouchOperation implements UIOperation {
        private final Callback mCallback;
        private final int mReactTag;
        private final float mTargetX;
        private final float mTargetY;

        public FindTargetForTouchOperation(int i, float f, float f2, Callback callback) {
            this.mReactTag = i;
            this.mTargetX = f;
            this.mTargetY = f2;
            this.mCallback = callback;
        }

        public final void execute() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
            /*
            r12 = this;
            r6 = 0;
            r0 = com.facebook.react.uimanager.UIViewOperationQueue.this;	 Catch:{ IllegalViewOperationException -> 0x0096 }
            r2 = r0.mNativeViewHierarchyManager;	 Catch:{ IllegalViewOperationException -> 0x0096 }
            r1 = r12.mReactTag;	 Catch:{ IllegalViewOperationException -> 0x0096 }
            r0 = com.facebook.react.uimanager.UIViewOperationQueue.this;	 Catch:{ IllegalViewOperationException -> 0x0096 }
            r0 = r0.mMeasureBuffer;	 Catch:{ IllegalViewOperationException -> 0x0096 }
            r2.measure(r1, r0);	 Catch:{ IllegalViewOperationException -> 0x0096 }
            r0 = com.facebook.react.uimanager.UIViewOperationQueue.this;
            r0 = r0.mMeasureBuffer;
            r0 = r0[r6];
            r4 = (float) r0;
            r0 = com.facebook.react.uimanager.UIViewOperationQueue.this;
            r0 = r0.mMeasureBuffer;
            r11 = 1;
            r0 = r0[r11];
            r2 = (float) r0;
            r0 = com.facebook.react.uimanager.UIViewOperationQueue.this;
            r5 = r0.mNativeViewHierarchyManager;
            r3 = r12.mReactTag;
            r1 = r12.mTargetX;
            r0 = r12.mTargetY;
            r8 = r5.findTargetTagForTouch(r3, r1, r0);
            r0 = com.facebook.react.uimanager.UIViewOperationQueue.this;	 Catch:{ IllegalViewOperationException -> 0x008e }
            r1 = r0.mNativeViewHierarchyManager;	 Catch:{ IllegalViewOperationException -> 0x008e }
            r0 = com.facebook.react.uimanager.UIViewOperationQueue.this;	 Catch:{ IllegalViewOperationException -> 0x008e }
            r0 = r0.mMeasureBuffer;	 Catch:{ IllegalViewOperationException -> 0x008e }
            r1.measure(r8, r0);	 Catch:{ IllegalViewOperationException -> 0x008e }
            r0 = com.facebook.react.uimanager.UIViewOperationQueue.this;
            r0 = r0.mMeasureBuffer;
            r0 = r0[r6];
            r0 = (float) r0;
            r0 = r0 - r4;
            r10 = com.facebook.react.uimanager.PixelUtil.toDIPFromPixel(r0);
            r0 = com.facebook.react.uimanager.UIViewOperationQueue.this;
            r0 = r0.mMeasureBuffer;
            r0 = r0[r11];
            r0 = (float) r0;
            r0 = r0 - r2;
            r9 = com.facebook.react.uimanager.PixelUtil.toDIPFromPixel(r0);
            r0 = com.facebook.react.uimanager.UIViewOperationQueue.this;
            r0 = r0.mMeasureBuffer;
            r7 = 2;
            r0 = r0[r7];
            r0 = (float) r0;
            r5 = com.facebook.react.uimanager.PixelUtil.toDIPFromPixel(r0);
            r0 = com.facebook.react.uimanager.UIViewOperationQueue.this;
            r0 = r0.mMeasureBuffer;
            r1 = 3;
            r0 = r0[r1];
            r0 = (float) r0;
            r4 = com.facebook.react.uimanager.PixelUtil.toDIPFromPixel(r0);
            r3 = r12.mCallback;
            r0 = 5;
            r2 = new java.lang.Object[r0];
            r0 = java.lang.Integer.valueOf(r8);
            r2[r6] = r0;
            r0 = java.lang.Float.valueOf(r10);
            r2[r11] = r0;
            r0 = java.lang.Float.valueOf(r9);
            r2[r7] = r0;
            r0 = java.lang.Float.valueOf(r5);
            r2[r1] = r0;
            r1 = 4;
            r0 = java.lang.Float.valueOf(r4);
            r2[r1] = r0;
            r3.invoke(r2);
            return;
        L_0x008e:
            r1 = r12.mCallback;
            r0 = new java.lang.Object[r6];
            r1.invoke(r0);
            return;
        L_0x0096:
            r1 = r12.mCallback;
            r0 = new java.lang.Object[r6];
            r1.invoke(r0);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.UIViewOperationQueue.FindTargetForTouchOperation.execute():void");
        }
    }

    public final class LayoutUpdateFinishedOperation implements UIOperation {
        private final LayoutUpdateListener mListener;
        private final ReactShadowNode mNode;

        public LayoutUpdateFinishedOperation(ReactShadowNode reactShadowNode, LayoutUpdateListener layoutUpdateListener) {
            this.mNode = reactShadowNode;
            this.mListener = layoutUpdateListener;
        }

        public final void execute() {
            this.mListener.onLayoutUpdated(this.mNode);
        }
    }

    public final class MeasureInWindowOperation implements UIOperation {
        private final Callback mCallback;
        private final int mReactTag;

        public MeasureInWindowOperation(int i, Callback callback) {
            this.mReactTag = i;
            this.mCallback = callback;
        }

        public final void execute() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
            /*
            r11 = this;
            r6 = 0;
            r0 = com.facebook.react.uimanager.UIViewOperationQueue.this;	 Catch:{ NoSuchNativeViewException -> 0x005e }
            r2 = r0.mNativeViewHierarchyManager;	 Catch:{ NoSuchNativeViewException -> 0x005e }
            r1 = r11.mReactTag;	 Catch:{ NoSuchNativeViewException -> 0x005e }
            r0 = com.facebook.react.uimanager.UIViewOperationQueue.this;	 Catch:{ NoSuchNativeViewException -> 0x005e }
            r0 = r0.mMeasureBuffer;	 Catch:{ NoSuchNativeViewException -> 0x005e }
            r2.measureInWindow(r1, r0);	 Catch:{ NoSuchNativeViewException -> 0x005e }
            r0 = com.facebook.react.uimanager.UIViewOperationQueue.this;
            r0 = r0.mMeasureBuffer;
            r0 = r0[r6];
            r0 = (float) r0;
            r10 = com.facebook.react.uimanager.PixelUtil.toDIPFromPixel(r0);
            r0 = com.facebook.react.uimanager.UIViewOperationQueue.this;
            r0 = r0.mMeasureBuffer;
            r9 = 1;
            r0 = r0[r9];
            r0 = (float) r0;
            r8 = com.facebook.react.uimanager.PixelUtil.toDIPFromPixel(r0);
            r0 = com.facebook.react.uimanager.UIViewOperationQueue.this;
            r0 = r0.mMeasureBuffer;
            r7 = 2;
            r0 = r0[r7];
            r0 = (float) r0;
            r5 = com.facebook.react.uimanager.PixelUtil.toDIPFromPixel(r0);
            r0 = com.facebook.react.uimanager.UIViewOperationQueue.this;
            r0 = r0.mMeasureBuffer;
            r4 = 3;
            r0 = r0[r4];
            r0 = (float) r0;
            r3 = com.facebook.react.uimanager.PixelUtil.toDIPFromPixel(r0);
            r2 = r11.mCallback;
            r0 = 4;
            r1 = new java.lang.Object[r0];
            r0 = java.lang.Float.valueOf(r10);
            r1[r6] = r0;
            r0 = java.lang.Float.valueOf(r8);
            r1[r9] = r0;
            r0 = java.lang.Float.valueOf(r5);
            r1[r7] = r0;
            r0 = java.lang.Float.valueOf(r3);
            r1[r4] = r0;
            r2.invoke(r1);
            return;
        L_0x005e:
            r1 = r11.mCallback;
            r0 = new java.lang.Object[r6];
            r1.invoke(r0);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.UIViewOperationQueue.MeasureInWindowOperation.execute():void");
        }
    }

    public final class MeasureOperation implements UIOperation {
        private final Callback mCallback;
        private final int mReactTag;

        public MeasureOperation(int i, Callback callback) {
            this.mReactTag = i;
            this.mCallback = callback;
        }

        public final void execute() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
            /*
            r11 = this;
            r6 = 0;
            r0 = com.facebook.react.uimanager.UIViewOperationQueue.this;	 Catch:{ NoSuchNativeViewException -> 0x006c }
            r2 = r0.mNativeViewHierarchyManager;	 Catch:{ NoSuchNativeViewException -> 0x006c }
            r1 = r11.mReactTag;	 Catch:{ NoSuchNativeViewException -> 0x006c }
            r0 = com.facebook.react.uimanager.UIViewOperationQueue.this;	 Catch:{ NoSuchNativeViewException -> 0x006c }
            r0 = r0.mMeasureBuffer;	 Catch:{ NoSuchNativeViewException -> 0x006c }
            r2.measure(r1, r0);	 Catch:{ NoSuchNativeViewException -> 0x006c }
            r0 = com.facebook.react.uimanager.UIViewOperationQueue.this;
            r0 = r0.mMeasureBuffer;
            r0 = r0[r6];
            r0 = (float) r0;
            r10 = com.facebook.react.uimanager.PixelUtil.toDIPFromPixel(r0);
            r0 = com.facebook.react.uimanager.UIViewOperationQueue.this;
            r0 = r0.mMeasureBuffer;
            r9 = 1;
            r0 = r0[r9];
            r0 = (float) r0;
            r8 = com.facebook.react.uimanager.PixelUtil.toDIPFromPixel(r0);
            r0 = com.facebook.react.uimanager.UIViewOperationQueue.this;
            r0 = r0.mMeasureBuffer;
            r7 = 2;
            r0 = r0[r7];
            r0 = (float) r0;
            r5 = com.facebook.react.uimanager.PixelUtil.toDIPFromPixel(r0);
            r0 = com.facebook.react.uimanager.UIViewOperationQueue.this;
            r0 = r0.mMeasureBuffer;
            r4 = 3;
            r0 = r0[r4];
            r0 = (float) r0;
            r1 = com.facebook.react.uimanager.PixelUtil.toDIPFromPixel(r0);
            r3 = r11.mCallback;
            r0 = 6;
            r2 = new java.lang.Object[r0];
            r0 = java.lang.Integer.valueOf(r6);
            r2[r6] = r0;
            r0 = java.lang.Integer.valueOf(r6);
            r2[r9] = r0;
            r0 = java.lang.Float.valueOf(r5);
            r2[r7] = r0;
            r0 = java.lang.Float.valueOf(r1);
            r2[r4] = r0;
            r1 = 4;
            r0 = java.lang.Float.valueOf(r10);
            r2[r1] = r0;
            r1 = 5;
            r0 = java.lang.Float.valueOf(r8);
            r2[r1] = r0;
            r3.invoke(r2);
            return;
        L_0x006c:
            r1 = r11.mCallback;
            r0 = new java.lang.Object[r6];
            r1.invoke(r0);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.UIViewOperationQueue.MeasureOperation.execute():void");
        }
    }

    public final class SetLayoutAnimationEnabledOperation implements UIOperation {
        private final boolean mEnabled;

        public SetLayoutAnimationEnabledOperation(boolean z) {
            this.mEnabled = z;
        }

        public final void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.setLayoutAnimationEnabled(this.mEnabled);
        }
    }

    public final class UIBlockOperation implements UIOperation {
        private final UIBlock mBlock;

        public UIBlockOperation(UIBlock uIBlock) {
            this.mBlock = uIBlock;
        }

        public final void execute() {
            this.mBlock.execute(UIViewOperationQueue.this.mNativeViewHierarchyManager);
        }
    }

    public abstract class ViewOperation implements UIOperation {
        public int mTag;

        public ViewOperation(int i) {
            this.mTag = i;
        }
    }

    public final class AddAnimationOperation extends AnimationOperation {
        private final int mReactTag;
        private final Callback mSuccessCallback;

        public AddAnimationOperation(int i, int i2, Callback callback) {
            super(i2);
            this.mReactTag = i;
            this.mSuccessCallback = callback;
        }

        public final void execute() {
            Animation animation = UIViewOperationQueue.this.mAnimationRegistry.getAnimation(this.mAnimationID);
            if (animation != null) {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.startAnimationForNativeView(this.mReactTag, animation, this.mSuccessCallback);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Animation with id ");
            stringBuilder.append(this.mAnimationID);
            stringBuilder.append(" was not found");
            throw new IllegalViewOperationException(stringBuilder.toString());
        }
    }

    public final class ChangeJSResponderOperation extends ViewOperation {
        private final boolean mBlockNativeResponder;
        private final boolean mClearResponder;
        private final int mInitialTag;

        public ChangeJSResponderOperation(int i, int i2, boolean z, boolean z2) {
            super(i);
            this.mInitialTag = i2;
            this.mClearResponder = z;
            this.mBlockNativeResponder = z2;
        }

        public final void execute() {
            if (this.mClearResponder) {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.clearJSResponder();
            } else {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.setJSResponder(this.mTag, this.mInitialTag, this.mBlockNativeResponder);
            }
        }
    }

    public final class CreateViewOperation extends ViewOperation {
        private final String mClassName;
        private final ReactStylesDiffMap mInitialProps;
        private final ThemedReactContext mThemedContext;

        public CreateViewOperation(ThemedReactContext themedReactContext, int i, String str, ReactStylesDiffMap reactStylesDiffMap) {
            super(i);
            this.mThemedContext = themedReactContext;
            this.mClassName = str;
            this.mInitialProps = reactStylesDiffMap;
            AnonymousClass0CM.P(33554432, "createView", this.mTag);
        }

        public final void execute() {
            AnonymousClass0CM.I(33554432, "createView", this.mTag);
            UIViewOperationQueue.this.mNativeViewHierarchyManager.createView(this.mThemedContext, this.mTag, this.mClassName, this.mInitialProps);
        }
    }

    public final class DispatchCommandOperation extends ViewOperation {
        private final ReadableArray mArgs;
        private final int mCommand;

        public DispatchCommandOperation(int i, int i2, ReadableArray readableArray) {
            super(i);
            this.mCommand = i2;
            this.mArgs = readableArray;
        }

        public final void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.dispatchCommand(this.mTag, this.mCommand, this.mArgs);
        }
    }

    public final class DispatchUIFrameCallback extends GuardedFrameCallback {
        private final int mMinTimeLeftInFrameForNonBatchedOperationMs;

        public DispatchUIFrameCallback(ReactContext reactContext, int i) {
            super(reactContext);
            this.mMinTimeLeftInFrameForNonBatchedOperationMs = i;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void dispatchPendingNonBatchedOperations(long r8) {
            /*
            r7 = this;
        L_0x0000:
            r4 = 16;
            r2 = java.lang.System.nanoTime();
            r2 = r2 - r8;
            r0 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
            r2 = r2 / r0;
            r4 = r4 - r2;
            r0 = r7.mMinTimeLeftInFrameForNonBatchedOperationMs;
            r0 = (long) r0;
            r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
            if (r0 >= 0) goto L_0x0014;
        L_0x0013:
            goto L_0x0024;
        L_0x0014:
            r0 = com.facebook.react.uimanager.UIViewOperationQueue.this;
            r1 = r0.mNonBatchedOperationsLock;
            monitor-enter(r1);
            r0 = com.facebook.react.uimanager.UIViewOperationQueue.this;	 Catch:{ all -> 0x004f }
            r0 = r0.mNonBatchedOperations;	 Catch:{ all -> 0x004f }
            r0 = r0.isEmpty();	 Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x0025;
        L_0x0023:
            monitor-exit(r1);	 Catch:{ all -> 0x004f }
        L_0x0024:
            return;
        L_0x0025:
            r0 = com.facebook.react.uimanager.UIViewOperationQueue.this;	 Catch:{ all -> 0x004f }
            r0 = r0.mNonBatchedOperations;	 Catch:{ all -> 0x004f }
            r0 = r0.pollFirst();	 Catch:{ all -> 0x004f }
            r0 = (com.facebook.react.uimanager.UIViewOperationQueue.UIOperation) r0;	 Catch:{ all -> 0x004f }
            monitor-exit(r1);	 Catch:{ all -> 0x004f }
            r5 = android.os.SystemClock.uptimeMillis();	 Catch:{ Exception -> 0x0047 }
            r0.execute();	 Catch:{ Exception -> 0x0047 }
            r4 = com.facebook.react.uimanager.UIViewOperationQueue.this;	 Catch:{ Exception -> 0x0047 }
            r0 = com.facebook.react.uimanager.UIViewOperationQueue.this;	 Catch:{ Exception -> 0x0047 }
            r2 = r0.mNonBatchedExecutionTotalTime;	 Catch:{ Exception -> 0x0047 }
            r0 = android.os.SystemClock.uptimeMillis();	 Catch:{ Exception -> 0x0047 }
            r0 = r0 - r5;
            r2 = r2 + r0;
            r4.mNonBatchedExecutionTotalTime = r2;	 Catch:{ Exception -> 0x0047 }
            goto L_0x0000;
        L_0x0047:
            r2 = move-exception;
            r1 = com.facebook.react.uimanager.UIViewOperationQueue.this;
            r0 = 1;
            r1.mIsInIllegalUIState = r0;
            throw r2;
        L_0x004f:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x004f }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.UIViewOperationQueue.DispatchUIFrameCallback.dispatchPendingNonBatchedOperations(long):void");
        }

        public final void doFrameGuarded(long j) {
            if (UIViewOperationQueue.this.mIsInIllegalUIState) {
                AnonymousClass0Df.H("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
                return;
            }
            AnonymousClass09H.B(8192, "dispatchNonBatchedUIOperations", 861343727);
            try {
                dispatchPendingNonBatchedOperations(j);
                UIViewOperationQueue.flushPendingBatches(UIViewOperationQueue.this);
                ReactChoreographer.getInstance().postFrameCallback(CallbackType.DISPATCH_UI, this);
            } finally {
                AnonymousClass09H.C(8192, 482656739);
            }
        }
    }

    public final class ManageChildrenOperation extends ViewOperation {
        private final int[] mIndicesToRemove;
        private final int[] mTagsToDelete;
        private final ViewAtIndex[] mViewsToAdd;

        public ManageChildrenOperation(int i, int[] iArr, ViewAtIndex[] viewAtIndexArr, int[] iArr2) {
            super(i);
            this.mIndicesToRemove = iArr;
            this.mViewsToAdd = viewAtIndexArr;
            this.mTagsToDelete = iArr2;
        }

        public final void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.manageChildren(this.mTag, this.mIndicesToRemove, this.mViewsToAdd, this.mTagsToDelete);
        }
    }

    public final class RegisterAnimationOperation extends AnimationOperation {
        private final Animation mAnimation;

        public RegisterAnimationOperation(Animation animation) {
            super(animation.getAnimationID());
            this.mAnimation = animation;
        }

        public final void execute() {
            UIViewOperationQueue.this.mAnimationRegistry.registerAnimation(this.mAnimation);
        }
    }

    public final class RemoveAnimationOperation extends AnimationOperation {
        public RemoveAnimationOperation(int i) {
            super(i);
        }

        public final void execute() {
            Animation animation = UIViewOperationQueue.this.mAnimationRegistry.getAnimation(this.mAnimationID);
            if (animation != null) {
                animation.cancel();
            }
        }
    }

    public final class RemoveRootViewOperation extends ViewOperation {
        public RemoveRootViewOperation(int i) {
            super(i);
        }

        public final void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.removeRootView(this.mTag);
        }
    }

    public final class SendAccessibilityEvent extends ViewOperation {
        private final int mEventType;

        public SendAccessibilityEvent(int i, int i2) {
            super(i);
            this.mEventType = i2;
        }

        public final void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.sendAccessibilityEvent(this.mTag, this.mEventType);
        }
    }

    public final class ShowPopupMenuOperation extends ViewOperation {
        private final Callback mError;
        private final ReadableArray mItems;
        private final Callback mSuccess;

        public ShowPopupMenuOperation(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
            super(i);
            this.mItems = readableArray;
            this.mError = callback;
            this.mSuccess = callback2;
        }

        public final void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.showPopupMenu(this.mTag, this.mItems, this.mSuccess, this.mError);
        }
    }

    public final class UpdateLayoutOperation extends ViewOperation {
        private final int mHeight;
        private final int mParentTag;
        private final int mWidth;
        private final int mX;
        private final int mY;

        public UpdateLayoutOperation(int i, int i2, int i3, int i4, int i5, int i6) {
            super(i2);
            this.mParentTag = i;
            this.mX = i3;
            this.mY = i4;
            this.mWidth = i5;
            this.mHeight = i6;
            AnonymousClass0CM.P(33554432, "updateLayout", this.mTag);
        }

        public final void execute() {
            AnonymousClass0CM.I(33554432, "updateLayout", this.mTag);
            UIViewOperationQueue.this.mNativeViewHierarchyManager.updateLayout(this.mParentTag, this.mTag, this.mX, this.mY, this.mWidth, this.mHeight);
        }
    }

    public final class UpdatePropertiesOperation extends ViewOperation {
        private final ReactStylesDiffMap mProps;

        public UpdatePropertiesOperation(int i, ReactStylesDiffMap reactStylesDiffMap) {
            super(i);
            this.mProps = reactStylesDiffMap;
        }

        public final void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.updateProperties(this.mTag, this.mProps);
        }
    }

    public final class UpdateViewExtraData extends ViewOperation {
        private final Object mExtraData;

        public UpdateViewExtraData(int i, Object obj) {
            super(i);
            this.mExtraData = obj;
        }

        public final void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.updateViewExtraData(this.mTag, this.mExtraData);
        }
    }

    public UIViewOperationQueue(ReactApplicationContext reactApplicationContext, NativeViewHierarchyManager nativeViewHierarchyManager, int i) {
        this.mNativeViewHierarchyManager = nativeViewHierarchyManager;
        this.mAnimationRegistry = nativeViewHierarchyManager.getAnimationRegistry();
        if (i == -1) {
            i = 8;
        }
        this.mDispatchUIFrameCallback = new DispatchUIFrameCallback(reactApplicationContext, i);
        this.mReactApplicationContext = reactApplicationContext;
    }

    public final void addRootView(int i, SizeMonitoringFrameLayout sizeMonitoringFrameLayout, ThemedReactContext themedReactContext) {
        this.mNativeViewHierarchyManager.addRootView(i, sizeMonitoringFrameLayout, themedReactContext);
    }

    public final void dispatchViewUpdates(int i, long j, long j2) {
        Throwable th;
        final int i2 = i;
        AnonymousClass09A.B(8192, "UIViewOperationQueue.dispatchViewUpdates").A("batchId", i2).C();
        try {
            ArrayList arrayList;
            final long uptimeMillis = SystemClock.uptimeMillis();
            UIViewOperationQueue uIViewOperationQueue = this;
            ArrayDeque arrayDeque = null;
            if (this.mOperations.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = this.mOperations;
                this.mOperations = new ArrayList();
            }
            synchronized (this.mNonBatchedOperationsLock) {
                try {
                    if (!this.mNonBatchedOperations.isEmpty()) {
                        arrayDeque = this.mNonBatchedOperations;
                        this.mNonBatchedOperations = new ArrayDeque();
                    }
                } catch (Throwable th2) {
                    while (true) {
                        th = th2;
                        break;
                    }
                }
            }
            if (this.mViewHierarchyUpdateDebugListener != null) {
                this.mViewHierarchyUpdateDebugListener.onViewHierarchyUpdateEnqueued();
            }
            final long j3 = j;
            final long j4 = j2;
            C01111 c01111 = new Runnable() {
                public final void run() {
                    AnonymousClass09A.B(8192, "DispatchUI").A("BatchId", i2).C();
                    try {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        if (arrayDeque != null) {
                            Iterator it = arrayDeque.iterator();
                            while (it.hasNext()) {
                                ((UIOperation) it.next()).execute();
                            }
                        }
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i = 0; i < size; i++) {
                                ((UIOperation) arrayList.get(i)).execute();
                            }
                        }
                        if (UIViewOperationQueue.this.mIsProfilingNextBatch && UIViewOperationQueue.this.mProfiledBatchCommitStartTime == 0) {
                            UIViewOperationQueue.this.mProfiledBatchCommitStartTime = j3;
                            UIViewOperationQueue.this.mProfiledBatchLayoutTime = j4;
                            UIViewOperationQueue.this.mProfiledBatchDispatchViewUpdatesTime = uptimeMillis;
                            UIViewOperationQueue.this.mProfiledBatchRunStartTime = uptimeMillis;
                            String str = "delayBeforeDispatchViewUpdates";
                            AnonymousClass0CM.C(8192, str, 0, UIViewOperationQueue.this.mProfiledBatchCommitStartTime * 1000000);
                            AnonymousClass0CM.K(8192, str, 0, UIViewOperationQueue.this.mProfiledBatchDispatchViewUpdatesTime * 1000000);
                            str = "delayBeforeBatchRunStart";
                            AnonymousClass0CM.C(8192, str, 0, UIViewOperationQueue.this.mProfiledBatchDispatchViewUpdatesTime * 1000000);
                            AnonymousClass0CM.K(8192, str, 0, UIViewOperationQueue.this.mProfiledBatchRunStartTime * 1000000);
                        }
                        UIViewOperationQueue.this.mNativeViewHierarchyManager.clearLayoutAnimation();
                        if (UIViewOperationQueue.this.mViewHierarchyUpdateDebugListener != null) {
                            UIViewOperationQueue.this.mViewHierarchyUpdateDebugListener.onViewHierarchyUpdateFinished();
                        }
                        AnonymousClass09H.C(8192, 448273833);
                    } catch (Exception e) {
                        UIViewOperationQueue.this.mIsInIllegalUIState = true;
                        throw e;
                    } catch (Throwable th) {
                        AnonymousClass09H.C(8192, -817232817);
                    }
                }
            };
            AnonymousClass09A.B(8192, "acquiring mDispatchRunnablesLock").A("batchId", i2).C();
            synchronized (this.mDispatchRunnablesLock) {
                try {
                    AnonymousClass09H.C(8192, 477058621);
                    this.mDispatchUIRunnables.add(c01111);
                } catch (Throwable th3) {
                    while (true) {
                        th = th3;
                    }
                    throw th;
                }
            }
            if (!this.mIsDispatchUIFrameCallbackEnqueued) {
                UiThreadUtil.runOnUiThread(new GuardedRunnable(this.mReactApplicationContext) {
                    public final void runGuarded() {
                        UIViewOperationQueue.flushPendingBatches(UIViewOperationQueue.this);
                    }
                });
            }
            AnonymousClass09H.C(8192, -1983923452);
            return;
            throw th;
        } catch (Throwable th4) {
            AnonymousClass09H.C(8192, -226478430);
        }
    }

    public final void enqueueAddAnimation(int i, int i2, Callback callback) {
        this.mOperations.add(new AddAnimationOperation(i, i2, callback));
    }

    public final void enqueueClearJSResponder() {
        this.mOperations.add(new ChangeJSResponderOperation(0, 0, true, false));
    }

    public final void enqueueConfigureLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.mOperations.add(new ConfigureLayoutAnimationOperation(readableMap));
    }

    public final void enqueueCreateView(ThemedReactContext themedReactContext, int i, String str, ReactStylesDiffMap reactStylesDiffMap) {
        synchronized (this.mNonBatchedOperationsLock) {
            this.mNonBatchedOperations.addLast(new CreateViewOperation(themedReactContext, i, str, reactStylesDiffMap));
        }
    }

    public final void enqueueDismissPopupMenu() {
        this.mOperations.add(new DismissPopupMenuOperation());
    }

    public final void enqueueDispatchCommand(int i, int i2, ReadableArray readableArray) {
        this.mOperations.add(new DispatchCommandOperation(i, i2, readableArray));
    }

    public final void enqueueFindTargetForTouch(int i, float f, float f2, Callback callback) {
        this.mOperations.add(new FindTargetForTouchOperation(i, f, f2, callback));
    }

    public final void enqueueLayoutUpdateFinished(ReactShadowNode reactShadowNode, LayoutUpdateListener layoutUpdateListener) {
        this.mOperations.add(new LayoutUpdateFinishedOperation(reactShadowNode, layoutUpdateListener));
    }

    public final void enqueueManageChildren(int i, int[] iArr, ViewAtIndex[] viewAtIndexArr, int[] iArr2) {
        this.mOperations.add(new ManageChildrenOperation(i, iArr, viewAtIndexArr, iArr2));
    }

    public final void enqueueMeasure(int i, Callback callback) {
        this.mOperations.add(new MeasureOperation(i, callback));
    }

    public final void enqueueMeasureInWindow(int i, Callback callback) {
        this.mOperations.add(new MeasureInWindowOperation(i, callback));
    }

    public final void enqueueRegisterAnimation(Animation animation) {
        this.mOperations.add(new RegisterAnimationOperation(animation));
    }

    public final void enqueueRemoveAnimation(int i) {
        this.mOperations.add(new RemoveAnimationOperation(i));
    }

    public final void enqueueRemoveRootView(int i) {
        this.mOperations.add(new RemoveRootViewOperation(i));
    }

    public final void enqueueSendAccessibilityEvent(int i, int i2) {
        this.mOperations.add(new SendAccessibilityEvent(i, i2));
    }

    public final void enqueueSetJSResponder(int i, int i2, boolean z) {
        this.mOperations.add(new ChangeJSResponderOperation(i, i2, false, z));
    }

    public final void enqueueSetLayoutAnimationEnabled(boolean z) {
        this.mOperations.add(new SetLayoutAnimationEnabledOperation(z));
    }

    public final void enqueueShowPopupMenu(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        this.mOperations.add(new ShowPopupMenuOperation(i, readableArray, callback, callback2));
    }

    public final void enqueueUIBlock(UIBlock uIBlock) {
        this.mOperations.add(new UIBlockOperation(uIBlock));
    }

    public final void enqueueUpdateExtraData(int i, Object obj) {
        this.mOperations.add(new UpdateViewExtraData(i, obj));
    }

    public final void enqueueUpdateLayout(int i, int i2, int i3, int i4, int i5, int i6) {
        this.mOperations.add(new UpdateLayoutOperation(i, i2, i3, i4, i5, i6));
    }

    public final void enqueueUpdateProperties(int i, String str, ReactStylesDiffMap reactStylesDiffMap) {
        this.mOperations.add(new UpdatePropertiesOperation(i, reactStylesDiffMap));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void flushPendingBatches(com.facebook.react.uimanager.UIViewOperationQueue r10) {
        /*
        r0 = r10.mIsInIllegalUIState;
        if (r0 == 0) goto L_0x000c;
    L_0x0004:
        r1 = "ReactNative";
        r0 = "Not flushing pending UI operations because of previously thrown Exception";
        X.AnonymousClass0Df.H(r1, r0);
        return;
    L_0x000c:
        r1 = r10.mDispatchRunnablesLock;
        monitor-enter(r1);
        r0 = r10.mDispatchUIRunnables;	 Catch:{ all -> 0x0062 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0062 }
        if (r0 != 0) goto L_0x0060;
    L_0x0017:
        r4 = r10.mDispatchUIRunnables;	 Catch:{ all -> 0x0062 }
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0062 }
        r0.<init>();	 Catch:{ all -> 0x0062 }
        r10.mDispatchUIRunnables = r0;	 Catch:{ all -> 0x0062 }
        monitor-exit(r1);	 Catch:{ all -> 0x0062 }
        r8 = android.os.SystemClock.uptimeMillis();
        r2 = r4.size();
        r3 = 0;
        r1 = 0;
    L_0x002b:
        if (r1 >= r2) goto L_0x0039;
    L_0x002d:
        r0 = r4.get(r1);
        r0 = (java.lang.Runnable) r0;
        r0.run();
        r1 = r1 + 1;
        goto L_0x002b;
    L_0x0039:
        r0 = r10.mIsProfilingNextBatch;
        if (r0 == 0) goto L_0x005b;
    L_0x003d:
        r0 = android.os.SystemClock.uptimeMillis();
        r0 = r0 - r8;
        r10.mProfiledBatchBatchedExecutionTime = r0;
        r0 = r10.mNonBatchedExecutionTotalTime;
        r10.mProfiledBatchNonBatchedExecutionTime = r0;
        r10.mIsProfilingNextBatch = r3;
        r4 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r6 = "batchedExecutionTime";
        r7 = 0;
        r0 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r8 = r8 * r0;
        X.AnonymousClass0CM.C(r4, r6, r7, r8);
        r1 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        X.AnonymousClass0CM.J(r1, r6, r3);
    L_0x005b:
        r0 = 0;
        r10.mNonBatchedExecutionTotalTime = r0;
        return;
    L_0x0060:
        monitor-exit(r1);	 Catch:{ all -> 0x0062 }
        return;
    L_0x0062:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0062 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.UIViewOperationQueue.flushPendingBatches(com.facebook.react.uimanager.UIViewOperationQueue):void");
    }

    public final NativeViewHierarchyManager getNativeViewHierarchyManager() {
        return this.mNativeViewHierarchyManager;
    }

    public final Map getProfiledBatchPerfCounters() {
        Map hashMap = new HashMap();
        hashMap.put("CommitStartTime", Long.valueOf(this.mProfiledBatchCommitStartTime));
        hashMap.put("LayoutTime", Long.valueOf(this.mProfiledBatchLayoutTime));
        hashMap.put("DispatchViewUpdatesTime", Long.valueOf(this.mProfiledBatchDispatchViewUpdatesTime));
        hashMap.put("RunStartTime", Long.valueOf(this.mProfiledBatchRunStartTime));
        hashMap.put("BatchedExecutionTime", Long.valueOf(this.mProfiledBatchBatchedExecutionTime));
        hashMap.put("NonBatchedExecutionTime", Long.valueOf(this.mProfiledBatchNonBatchedExecutionTime));
        return hashMap;
    }

    public final boolean isEmpty() {
        return this.mOperations.isEmpty();
    }

    public final void pauseFrameCallback() {
        this.mIsDispatchUIFrameCallbackEnqueued = false;
        ReactChoreographer.getInstance().removeFrameCallback(CallbackType.DISPATCH_UI, this.mDispatchUIFrameCallback);
        flushPendingBatches(this);
    }

    public final void prependUIBlock(UIBlock uIBlock) {
        this.mOperations.add(0, new UIBlockOperation(uIBlock));
    }

    public final void profileNextBatch() {
        this.mIsProfilingNextBatch = true;
        this.mProfiledBatchCommitStartTime = 0;
    }

    public final void resumeFrameCallback() {
        this.mIsDispatchUIFrameCallbackEnqueued = true;
        ReactChoreographer.getInstance().postFrameCallback(CallbackType.DISPATCH_UI, this.mDispatchUIFrameCallback);
    }

    public final void setViewHierarchyUpdateDebugListener(NotThreadSafeViewHierarchyUpdateDebugListener notThreadSafeViewHierarchyUpdateDebugListener) {
        this.mViewHierarchyUpdateDebugListener = notThreadSafeViewHierarchyUpdateDebugListener;
    }
}
