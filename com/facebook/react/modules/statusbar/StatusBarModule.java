package com.facebook.react.modules.statusbar;

import X.AnonymousClass0Df;
import X.AnonymousClass0mE;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;
import com.facebook.common.dextricks.DexStore;
import com.facebook.forker.Process;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import java.util.Map;

@ReactModule(name = "StatusBarManager")
public class StatusBarModule extends ReactContextBaseJavaModule {
    private static final String HEIGHT_KEY = "HEIGHT";

    public String getName() {
        return "StatusBarManager";
    }

    public StatusBarModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public Map getConstants() {
        Context reactApplicationContext = getReactApplicationContext();
        int identifier = reactApplicationContext.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return MapBuilder.of(HEIGHT_KEY, Float.valueOf(identifier > 0 ? PixelUtil.toDIPFromPixel((float) reactApplicationContext.getResources().getDimensionPixelSize(identifier)) : 0.0f));
    }

    @ReactMethod
    public void setColor(final int i, boolean z) {
        StatusBarModule statusBarModule = this;
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            AnonymousClass0Df.H("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
            return;
        }
        if (VERSION.SDK_INT >= 21) {
            ReactContext reactApplicationContext = getReactApplicationContext();
            final boolean z2 = z;
            UiThreadUtil.runOnUiThread(new GuardedRunnable(reactApplicationContext) {

                /* renamed from: com.facebook.react.modules.statusbar.StatusBarModule$1$1 */
                public final class C01751 implements AnimatorUpdateListener {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        currentActivity.getWindow().setStatusBarColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                }

                public final void runGuarded() {
                    currentActivity.getWindow().addFlags(Process.WAIT_RESULT_TIMEOUT);
                    if (z2) {
                        int statusBarColor = currentActivity.getWindow().getStatusBarColor();
                        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(statusBarColor), Integer.valueOf(i)});
                        ofObject.addUpdateListener(new C01751());
                        ofObject.setDuration(300).setStartDelay(0);
                        ofObject.start();
                        return;
                    }
                    currentActivity.getWindow().setStatusBarColor(i);
                }
            });
        }
    }

    @ReactMethod
    public void setHidden(final boolean z) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            AnonymousClass0Df.H("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() {
                public final void run() {
                    if (z) {
                        currentActivity.getWindow().addFlags(DexStore.LOAD_RESULT_MIXED_MODE);
                        currentActivity.getWindow().clearFlags(DexStore.LOAD_RESULT_OATMEAL_QUICKEN_ATTEMPTED);
                        return;
                    }
                    currentActivity.getWindow().addFlags(DexStore.LOAD_RESULT_OATMEAL_QUICKEN_ATTEMPTED);
                    currentActivity.getWindow().clearFlags(DexStore.LOAD_RESULT_MIXED_MODE);
                }
            });
        }
    }

    @ReactMethod
    public void setStyle(final String str) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            AnonymousClass0Df.H("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
            return;
        }
        if (VERSION.SDK_INT >= 23) {
            UiThreadUtil.runOnUiThread(new Runnable() {
                public final void run() {
                    currentActivity.getWindow().getDecorView().setSystemUiVisibility(str.equals("dark-content") ? DexStore.LOAD_RESULT_MIXED_MODE_ATTEMPTED : 0);
                }
            });
        }
    }

    @ReactMethod
    public void setTranslucent(final boolean z) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            AnonymousClass0Df.H("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
            return;
        }
        if (VERSION.SDK_INT >= 21) {
            UiThreadUtil.runOnUiThread(new GuardedRunnable(getReactApplicationContext()) {

                /* renamed from: com.facebook.react.modules.statusbar.StatusBarModule$2$1 */
                public final class C01771 implements OnApplyWindowInsetsListener {
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        windowInsets = view.onApplyWindowInsets(windowInsets);
                        return windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                    }
                }

                public final void runGuarded() {
                    View decorView = currentActivity.getWindow().getDecorView();
                    if (z) {
                        decorView.setOnApplyWindowInsetsListener(new C01771());
                    } else {
                        decorView.setOnApplyWindowInsetsListener(null);
                    }
                    AnonymousClass0mE.f9733B.Z(decorView);
                }
            });
        }
    }
}
