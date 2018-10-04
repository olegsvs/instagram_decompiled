package com.facebook.react;

import X.AnonymousClass09H;
import X.AnonymousClass0Df;
import X.AnonymousClass0LR;
import X.AnonymousClass0cQ;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.facebook.forker.Process;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.JSTouchDispatcher;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.common.MeasureSpecProvider;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;

public final class ReactRootView extends SizeMonitoringFrameLayout implements RootView, MeasureSpecProvider {
    private final ReactAndroidHWInputDeviceHelper mAndroidHWInputDeviceHelper = new ReactAndroidHWInputDeviceHelper(this);
    private Bundle mAppProperties;
    private CustomGlobalLayoutListener mCustomGlobalLayoutListener;
    private int mHeightMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
    public boolean mIsAttachedToInstance;
    private String mJSModuleName;
    private JSTouchDispatcher mJSTouchDispatcher;
    public ReactInstanceManager mReactInstanceManager;
    private ReactRootViewEventListener mRootViewEventListener;
    private int mRootViewTag;
    private boolean mShouldLogContentAppeared;
    private int mUIManagerType = 1;
    private boolean mWasMeasured = false;
    private int mWidthMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);

    public final class CustomGlobalLayoutListener implements OnGlobalLayoutListener {
        private int mDeviceRotation = 0;
        private int mKeyboardHeight = 0;
        private final int mMinKeyboardHeightDetected;
        private DisplayMetrics mScreenMetrics = new DisplayMetrics();
        private final Rect mVisibleViewArea;
        private DisplayMetrics mWindowMetrics = new DisplayMetrics();

        public CustomGlobalLayoutListener() {
            DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(ReactRootView.this.getContext().getApplicationContext());
            this.mVisibleViewArea = new Rect();
            this.mMinKeyboardHeightDetected = (int) PixelUtil.toPixelFromDIP(60.0f);
        }

        private static boolean areMetricsEqual(DisplayMetrics displayMetrics, DisplayMetrics displayMetrics2) {
            if (VERSION.SDK_INT >= 17) {
                return displayMetrics.equals(displayMetrics2);
            }
            boolean z = displayMetrics.widthPixels == displayMetrics2.widthPixels && displayMetrics.heightPixels == displayMetrics2.heightPixels && displayMetrics.density == displayMetrics2.density && displayMetrics.densityDpi == displayMetrics2.densityDpi && displayMetrics.scaledDensity == displayMetrics2.scaledDensity && displayMetrics.xdpi == displayMetrics2.xdpi && displayMetrics.ydpi == displayMetrics2.ydpi;
            return z;
        }

        private void checkForDeviceDimensionsChanges() {
            DisplayMetricsHolder.initDisplayMetrics(ReactRootView.this.getContext());
            if (!areMetricsEqual(this.mWindowMetrics, DisplayMetricsHolder.getWindowDisplayMetrics()) || !areMetricsEqual(this.mScreenMetrics, DisplayMetricsHolder.getScreenDisplayMetrics())) {
                this.mWindowMetrics.setTo(DisplayMetricsHolder.getWindowDisplayMetrics());
                this.mScreenMetrics.setTo(DisplayMetricsHolder.getScreenDisplayMetrics());
                emitUpdateDimensionsEvent();
            }
        }

        private void checkForDeviceOrientationChanges() {
            int rotation = ((WindowManager) ReactRootView.this.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
            if (this.mDeviceRotation != rotation) {
                this.mDeviceRotation = rotation;
                emitOrientationChanged(rotation);
            }
        }

        private void checkForKeyboardEvents() {
            ReactRootView.this.getRootView().getWindowVisibleDisplayFrame(this.mVisibleViewArea);
            int i = DisplayMetricsHolder.getWindowDisplayMetrics().heightPixels - this.mVisibleViewArea.bottom;
            if (this.mKeyboardHeight != i && i > this.mMinKeyboardHeightDetected) {
                this.mKeyboardHeight = i;
                WritableMap createMap = Arguments.createMap();
                WritableMap createMap2 = Arguments.createMap();
                createMap2.putDouble("screenY", (double) PixelUtil.toDIPFromPixel((float) this.mVisibleViewArea.bottom));
                createMap2.putDouble("screenX", (double) PixelUtil.toDIPFromPixel((float) this.mVisibleViewArea.left));
                createMap2.putDouble("width", (double) PixelUtil.toDIPFromPixel((float) this.mVisibleViewArea.width()));
                createMap2.putDouble("height", (double) PixelUtil.toDIPFromPixel((float) this.mKeyboardHeight));
                createMap.putMap("endCoordinates", createMap2);
                ReactRootView.this.sendEvent("keyboardDidShow", createMap);
            } else if (this.mKeyboardHeight != 0 && i <= this.mMinKeyboardHeightDetected) {
                this.mKeyboardHeight = 0;
                ReactRootView.this.sendEvent("keyboardDidHide", null);
            }
        }

        private void emitOrientationChanged(int i) {
            String str;
            double d;
            boolean z = true;
            switch (i) {
                case 0:
                    str = "portrait-primary";
                    d = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
                    break;
                case 1:
                    str = "landscape-primary";
                    d = -90.0d;
                    break;
                case 2:
                    str = "portrait-secondary";
                    d = 180.0d;
                    break;
                case 3:
                    str = "landscape-secondary";
                    d = 90.0d;
                    break;
                default:
                    return;
            }
            z = false;
            WritableMap createMap = Arguments.createMap();
            createMap.putString("name", str);
            createMap.putDouble("rotationDegrees", d);
            createMap.putBoolean("isLandscape", z);
            ReactRootView.this.sendEvent("namedOrientationDidChange", createMap);
        }

        private void emitUpdateDimensionsEvent() {
            ((DeviceInfoModule) ReactRootView.this.mReactInstanceManager.getCurrentReactContext().getNativeModule(DeviceInfoModule.class)).emitUpdateDimensionsEvent();
        }

        public final void onGlobalLayout() {
            if (ReactRootView.this.mReactInstanceManager != null && ReactRootView.this.mIsAttachedToInstance) {
                if (ReactRootView.this.mReactInstanceManager.getCurrentReactContext() != null) {
                    checkForKeyboardEvents();
                    checkForDeviceOrientationChanges();
                    checkForDeviceDimensionsChanges();
                }
            }
        }
    }

    public interface ReactRootViewEventListener {
        void onAttachedToReactInstance(ReactRootView reactRootView);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public ReactRootView(Context context) {
        super(context);
        init();
    }

    private void attachToReactInstanceManager() {
        AnonymousClass09H.B(8192, "attachToReactInstanceManager", 1670810863);
        try {
            if (!this.mIsAttachedToInstance) {
                this.mIsAttachedToInstance = true;
                ((ReactInstanceManager) AnonymousClass0LR.D(this.mReactInstanceManager)).attachRootView(this);
                getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
                AnonymousClass09H.C(8192, 1145732479);
            }
        } finally {
            AnonymousClass09H.C(8192, 1232167866);
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (Throwable e) {
            handleException(e);
        }
    }

    private void dispatchJSTouchEvent(MotionEvent motionEvent) {
        ReactInstanceManager reactInstanceManager = this.mReactInstanceManager;
        if (reactInstanceManager != null && this.mIsAttachedToInstance) {
            if (reactInstanceManager.getCurrentReactContext() != null) {
                if (this.mJSTouchDispatcher == null) {
                    AnonymousClass0Df.H("ReactNative", "Unable to dispatch touch to JS before the dispatcher is available");
                    return;
                }
                this.mJSTouchDispatcher.handleTouchEvent(motionEvent, ((UIManagerModule) this.mReactInstanceManager.getCurrentReactContext().getNativeModule(UIManagerModule.class)).getEventDispatcher());
                return;
            }
        }
        AnonymousClass0Df.H("ReactNative", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ReactInstanceManager reactInstanceManager = this.mReactInstanceManager;
        if (reactInstanceManager != null && this.mIsAttachedToInstance) {
            if (reactInstanceManager.getCurrentReactContext() != null) {
                this.mAndroidHWInputDeviceHelper.handleKeyEvent(keyEvent);
                return super.dispatchKeyEvent(keyEvent);
            }
        }
        AnonymousClass0Df.H("ReactNative", "Unable to handle key event as the catalyst instance has not been attached");
        return super.dispatchKeyEvent(keyEvent);
    }

    private void enableLayoutCalculation() {
        ReactInstanceManager reactInstanceManager = this.mReactInstanceManager;
        if (reactInstanceManager == null) {
            AnonymousClass0Df.H("ReactNative", "Unable to enable layout calculation for uninitialized ReactInstanceManager");
            return;
        }
        ReactContext currentReactContext = reactInstanceManager.getCurrentReactContext();
        if (currentReactContext != null) {
            ((UIManagerModule) currentReactContext.getCatalystInstance().getNativeModule(UIManagerModule.class)).getUIImplementation().enableLayoutCalculationForRootNode(getRootViewTag());
        }
    }

    public final void finalize() {
        super.finalize();
        AnonymousClass0LR.C(this.mIsAttachedToInstance ^ 1, "The application this ReactRootView was rendering was not unmounted before the ReactRootView was garbage collected. This usually means that your application is leaking large amounts of memory. To solve this, make sure to call ReactRootView#unmountReactApplication in the onDestroy() of your hosting Activity or in the onDestroyView() of your hosting Fragment.");
    }

    public Bundle getAppProperties() {
        return this.mAppProperties;
    }

    private CustomGlobalLayoutListener getCustomGlobalLayoutListener() {
        if (this.mCustomGlobalLayoutListener == null) {
            this.mCustomGlobalLayoutListener = new CustomGlobalLayoutListener();
        }
        return this.mCustomGlobalLayoutListener;
    }

    public int getHeightMeasureSpec() {
        if (this.mWasMeasured || getLayoutParams() == null || getLayoutParams().height <= 0) {
            return this.mHeightMeasureSpec;
        }
        return MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824);
    }

    public String getJSModuleName() {
        return (String) AnonymousClass0LR.D(this.mJSModuleName);
    }

    public ReactInstanceManager getReactInstanceManager() {
        return this.mReactInstanceManager;
    }

    public int getRootViewTag() {
        return this.mRootViewTag;
    }

    public int getUIManagerType() {
        return this.mUIManagerType;
    }

    public int getWidthMeasureSpec() {
        if (this.mWasMeasured || getLayoutParams() == null || getLayoutParams().width <= 0) {
            return this.mWidthMeasureSpec;
        }
        return MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824);
    }

    public final void handleException(Throwable th) {
        ReactInstanceManager reactInstanceManager = this.mReactInstanceManager;
        if (reactInstanceManager == null || reactInstanceManager.getCurrentReactContext() == null) {
            throw new RuntimeException(th);
        }
        this.mReactInstanceManager.getCurrentReactContext().handleException(new IllegalViewOperationException(th.getMessage(), this, th));
    }

    private void init() {
        if (!ViewProps.sDefaultOverflowHidden) {
            setClipChildren(false);
        }
    }

    public final void onAttachedToReactInstance() {
        this.mJSTouchDispatcher = new JSTouchDispatcher(this);
        ReactRootViewEventListener reactRootViewEventListener = this.mRootViewEventListener;
        if (reactRootViewEventListener != null) {
            reactRootViewEventListener.onAttachedToReactInstance(this);
        }
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, -1281753175);
        super.onAttachedToWindow();
        if (this.mIsAttachedToInstance) {
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
        AnonymousClass0cQ.O(this, -1920771215, N);
    }

    public final void onChildStartedNativeGesture(MotionEvent motionEvent) {
        ReactInstanceManager reactInstanceManager = this.mReactInstanceManager;
        if (reactInstanceManager != null && this.mIsAttachedToInstance) {
            if (reactInstanceManager.getCurrentReactContext() != null) {
                if (this.mJSTouchDispatcher == null) {
                    AnonymousClass0Df.H("ReactNative", "Unable to dispatch touch to JS before the dispatcher is available");
                    return;
                }
                this.mJSTouchDispatcher.onChildStartedNativeGesture(motionEvent, ((UIManagerModule) this.mReactInstanceManager.getCurrentReactContext().getNativeModule(UIManagerModule.class)).getEventDispatcher());
                return;
            }
        }
        AnonymousClass0Df.H("ReactNative", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, -908014204);
        super.onDetachedFromWindow();
        if (this.mIsAttachedToInstance) {
            if (VERSION.SDK_INT >= 16) {
                getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
            } else {
                getViewTreeObserver().removeGlobalOnLayoutListener(getCustomGlobalLayoutListener());
            }
        }
        AnonymousClass0cQ.O(this, -1908634875, N);
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int N = AnonymousClass0cQ.N(this, -148905419);
        ReactInstanceManager reactInstanceManager = this.mReactInstanceManager;
        if (reactInstanceManager != null && this.mIsAttachedToInstance) {
            if (reactInstanceManager.getCurrentReactContext() != null) {
                this.mAndroidHWInputDeviceHelper.clearFocus();
                super.onFocusChanged(z, i, rect);
                AnonymousClass0cQ.O(this, -1587174816, N);
                return;
            }
        }
        AnonymousClass0Df.H("ReactNative", "Unable to handle focus changed event as the catalyst instance has not been attached");
        super.onFocusChanged(z, i, rect);
        AnonymousClass0cQ.O(this, 385704769, N);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        dispatchJSTouchEvent(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void onMeasure(int i, int i2) {
        AnonymousClass09H.B(8192, "ReactRootView.onMeasure", -970344232);
        try {
            int size;
            int size2;
            int i3;
            View childAt;
            this.mWidthMeasureSpec = i;
            this.mHeightMeasureSpec = i2;
            int mode = MeasureSpec.getMode(i);
            if (mode != Process.WAIT_RESULT_TIMEOUT) {
                if (mode != 0) {
                    size = MeasureSpec.getSize(i);
                    mode = MeasureSpec.getMode(i2);
                    if (mode != Process.WAIT_RESULT_TIMEOUT) {
                        if (mode == 0) {
                            size2 = MeasureSpec.getSize(i2);
                            setMeasuredDimension(size, size2);
                            this.mWasMeasured = true;
                            if (this.mReactInstanceManager != null || this.mIsAttachedToInstance) {
                                enableLayoutCalculation();
                                updateRootLayoutSpecs(this.mWidthMeasureSpec, this.mHeightMeasureSpec);
                            } else {
                                attachToReactInstanceManager();
                                enableLayoutCalculation();
                            }
                            AnonymousClass09H.C(8192, 65784164);
                        }
                    }
                    size2 = 0;
                    for (i3 = 0; i3 < getChildCount(); i3++) {
                        childAt = getChildAt(i3);
                        size2 = Math.max(size2, ((childAt.getTop() + childAt.getMeasuredHeight()) + childAt.getPaddingTop()) + childAt.getPaddingBottom());
                    }
                    setMeasuredDimension(size, size2);
                    this.mWasMeasured = true;
                    if (this.mReactInstanceManager != null) {
                    }
                    enableLayoutCalculation();
                    updateRootLayoutSpecs(this.mWidthMeasureSpec, this.mHeightMeasureSpec);
                    AnonymousClass09H.C(8192, 65784164);
                }
            }
            size = 0;
            for (size2 = 0; size2 < getChildCount(); size2++) {
                childAt = getChildAt(size2);
                size = Math.max(size, ((childAt.getLeft() + childAt.getMeasuredWidth()) + childAt.getPaddingLeft()) + childAt.getPaddingRight());
            }
            mode = MeasureSpec.getMode(i2);
            if (mode != Process.WAIT_RESULT_TIMEOUT) {
                if (mode == 0) {
                    size2 = MeasureSpec.getSize(i2);
                    setMeasuredDimension(size, size2);
                    this.mWasMeasured = true;
                    if (this.mReactInstanceManager != null) {
                    }
                    enableLayoutCalculation();
                    updateRootLayoutSpecs(this.mWidthMeasureSpec, this.mHeightMeasureSpec);
                    AnonymousClass09H.C(8192, 65784164);
                }
            }
            size2 = 0;
            for (i3 = 0; i3 < getChildCount(); i3++) {
                childAt = getChildAt(i3);
                size2 = Math.max(size2, ((childAt.getTop() + childAt.getMeasuredHeight()) + childAt.getPaddingTop()) + childAt.getPaddingBottom());
            }
            setMeasuredDimension(size, size2);
            this.mWasMeasured = true;
            if (this.mReactInstanceManager != null) {
            }
            enableLayoutCalculation();
            updateRootLayoutSpecs(this.mWidthMeasureSpec, this.mHeightMeasureSpec);
            AnonymousClass09H.C(8192, 65784164);
        } catch (Throwable th) {
            AnonymousClass09H.C(8192, 1636178758);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.M(this, 187891562);
        dispatchJSTouchEvent(motionEvent);
        super.onTouchEvent(motionEvent);
        AnonymousClass0cQ.L(this, -1058622229, M);
        return true;
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.mShouldLogContentAppeared) {
            this.mShouldLogContentAppeared = false;
            if (this.mJSModuleName != null) {
                ReactMarker.logMarker(ReactMarkerConstants.CONTENT_APPEARED, this.mJSModuleName, this.mRootViewTag);
            }
        }
    }

    public final void requestChildFocus(View view, View view2) {
        ReactInstanceManager reactInstanceManager = this.mReactInstanceManager;
        if (reactInstanceManager != null && this.mIsAttachedToInstance) {
            if (reactInstanceManager.getCurrentReactContext() != null) {
                this.mAndroidHWInputDeviceHelper.onFocusChanged(view2);
                super.requestChildFocus(view, view2);
                return;
            }
        }
        AnonymousClass0Df.H("ReactNative", "Unable to handle child focus changed event as the catalyst instance has not been attached");
        super.requestChildFocus(view, view2);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public final void runApplication() {
        AnonymousClass09H.B(8192, "ReactRootView.runApplication", 1856187450);
        try {
            if (this.mReactInstanceManager != null) {
                if (this.mIsAttachedToInstance) {
                    ReactContext currentReactContext = this.mReactInstanceManager.getCurrentReactContext();
                    if (currentReactContext == null) {
                        AnonymousClass09H.C(8192, -547709653);
                        return;
                    }
                    CatalystInstance catalystInstance = currentReactContext.getCatalystInstance();
                    WritableMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putDouble("rootTag", (double) getRootViewTag());
                    Bundle appProperties = getAppProperties();
                    if (appProperties != null) {
                        writableNativeMap.putMap("initialProps", Arguments.fromBundle(appProperties));
                    }
                    if (getUIManagerType() == 2) {
                        writableNativeMap.putBoolean("fabric", true);
                    }
                    this.mShouldLogContentAppeared = true;
                    ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).runApplication(getJSModuleName(), writableNativeMap);
                    AnonymousClass09H.C(8192, -1644419456);
                    return;
                }
            }
            AnonymousClass09H.C(8192, -239979251);
        } catch (Throwable th) {
            AnonymousClass09H.C(8192, -1731826109);
        }
    }

    public final void sendEvent(String str, WritableMap writableMap) {
        ReactInstanceManager reactInstanceManager = this.mReactInstanceManager;
        if (reactInstanceManager != null) {
            ((RCTDeviceEventEmitter) reactInstanceManager.getCurrentReactContext().getJSModule(RCTDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }

    public void setAppProperties(Bundle bundle) {
        UiThreadUtil.assertOnUiThread();
        this.mAppProperties = bundle;
        if (getRootViewTag() != 0) {
            runApplication();
        }
    }

    public void setEventListener(ReactRootViewEventListener reactRootViewEventListener) {
        this.mRootViewEventListener = reactRootViewEventListener;
    }

    public void setIsFabric(boolean z) {
        this.mUIManagerType = z ? 2 : 1;
    }

    public void setRootViewTag(int i) {
        this.mRootViewTag = i;
    }

    public final void startReactApplication(ReactInstanceManager reactInstanceManager, String str, Bundle bundle) {
        AnonymousClass09H.B(8192, "startReactApplication", -84855720);
        try {
            UiThreadUtil.assertOnUiThread();
            AnonymousClass0LR.C(this.mReactInstanceManager == null, "This root view has already been attached to a catalyst instance manager");
            this.mReactInstanceManager = reactInstanceManager;
            this.mJSModuleName = str;
            this.mAppProperties = bundle;
            if (!this.mReactInstanceManager.hasStartedCreatingInitialContext()) {
                this.mReactInstanceManager.createReactContextInBackground();
            }
            attachToReactInstanceManager();
        } finally {
            AnonymousClass09H.C(8192, -842277342);
        }
    }

    public final void unmountReactApplication() {
        ReactInstanceManager reactInstanceManager = this.mReactInstanceManager;
        if (reactInstanceManager != null && this.mIsAttachedToInstance) {
            reactInstanceManager.detachRootView(this);
            this.mReactInstanceManager = null;
            this.mIsAttachedToInstance = false;
        }
        this.mShouldLogContentAppeared = false;
    }

    private void updateRootLayoutSpecs(int i, int i2) {
        ReactInstanceManager reactInstanceManager = this.mReactInstanceManager;
        if (reactInstanceManager == null) {
            AnonymousClass0Df.H("ReactNative", "Unable to update root layout specs for uninitialized ReactInstanceManager");
            return;
        }
        ReactContext currentReactContext = reactInstanceManager.getCurrentReactContext();
        if (currentReactContext != null) {
            UIManagerHelper.getUIManager(currentReactContext, getUIManagerType()).updateRootLayoutSpecs(getRootViewTag(), i, i2);
        }
    }
}
