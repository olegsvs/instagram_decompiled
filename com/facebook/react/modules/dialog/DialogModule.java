package com.facebook.react.modules.dialog;

import X.AnonymousClass0Df;
import X.AnonymousClass0IU;
import android.app.Activity;
import android.app.Dialog;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Map;

@ReactModule(name = "DialogManagerAndroid")
public class DialogModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    public static final String ACTION_BUTTON_CLICKED = "buttonClicked";
    public static final String ACTION_DISMISSED = "dismissed";
    public static final Map CONSTANTS = MapBuilder.of(ACTION_BUTTON_CLICKED, ACTION_BUTTON_CLICKED, ACTION_DISMISSED, ACTION_DISMISSED, KEY_BUTTON_POSITIVE, Integer.valueOf(-1), KEY_BUTTON_NEGATIVE, Integer.valueOf(-2), KEY_BUTTON_NEUTRAL, Integer.valueOf(-3));
    public static final String FRAGMENT_TAG = "com.facebook.catalyst.react.dialog.DialogModule";
    public static final String KEY_BUTTON_NEGATIVE = "buttonNegative";
    public static final String KEY_BUTTON_NEUTRAL = "buttonNeutral";
    public static final String KEY_BUTTON_POSITIVE = "buttonPositive";
    public static final String KEY_CANCELABLE = "cancelable";
    public static final String KEY_ITEMS = "items";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_TITLE = "title";
    public static final String NAME = "DialogManagerAndroid";
    public boolean mIsInForeground;

    public final class AlertFragmentListener implements OnDismissListener, OnClickListener {
        private final Callback mCallback;
        private boolean mCallbackConsumed = false;

        public AlertFragmentListener(Callback callback) {
            this.mCallback = callback;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (!this.mCallbackConsumed && DialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                this.mCallback.invoke(new Object[]{DialogModule.ACTION_BUTTON_CLICKED, Integer.valueOf(i)});
                this.mCallbackConsumed = true;
            }
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (!this.mCallbackConsumed && DialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                this.mCallback.invoke(new Object[]{DialogModule.ACTION_DISMISSED});
                this.mCallbackConsumed = true;
            }
        }
    }

    public final class FragmentManagerHelper {
        private final FragmentManager mFragmentManager;
        private Object mFragmentToShow;
        private final AnonymousClass0IU mSupportFragmentManager;

        public FragmentManagerHelper(AnonymousClass0IU anonymousClass0IU) {
            this.mFragmentManager = null;
            this.mSupportFragmentManager = anonymousClass0IU;
        }

        public FragmentManagerHelper(FragmentManager fragmentManager) {
            this.mFragmentManager = fragmentManager;
            this.mSupportFragmentManager = null;
        }

        private void dismissExisting() {
            if (isUsingSupportLibrary()) {
                SupportAlertFragment supportAlertFragment = (SupportAlertFragment) this.mSupportFragmentManager.F(DialogModule.FRAGMENT_TAG);
                if (supportAlertFragment != null) {
                    supportAlertFragment.A();
                    return;
                }
                return;
            }
            AlertFragment alertFragment = (AlertFragment) this.mFragmentManager.findFragmentByTag(DialogModule.FRAGMENT_TAG);
            if (alertFragment != null) {
                alertFragment.dismiss();
            }
        }

        private boolean isUsingSupportLibrary() {
            return this.mSupportFragmentManager != null;
        }

        public final void showNewAlert(boolean z, Bundle bundle, Callback callback) {
            Object supportAlertFragment;
            UiThreadUtil.assertOnUiThread();
            dismissExisting();
            AlertFragmentListener alertFragmentListener = callback != null ? new AlertFragmentListener(callback) : null;
            if (isUsingSupportLibrary()) {
                supportAlertFragment = new SupportAlertFragment(alertFragmentListener, bundle);
                if (z) {
                    if (bundle.containsKey(DialogModule.KEY_CANCELABLE)) {
                        boolean z2 = bundle.getBoolean(DialogModule.KEY_CANCELABLE);
                        supportAlertFragment.f15925C = z2;
                        Dialog dialog = supportAlertFragment.f15926D;
                        if (dialog != null) {
                            dialog.setCancelable(z2);
                        }
                    }
                    supportAlertFragment.D(this.mSupportFragmentManager, DialogModule.FRAGMENT_TAG);
                    return;
                }
            }
            supportAlertFragment = new AlertFragment(alertFragmentListener, bundle);
            if (z) {
                if (bundle.containsKey(DialogModule.KEY_CANCELABLE)) {
                    supportAlertFragment.setCancelable(bundle.getBoolean(DialogModule.KEY_CANCELABLE));
                }
                supportAlertFragment.show(this.mFragmentManager, DialogModule.FRAGMENT_TAG);
                return;
            }
            this.mFragmentToShow = supportAlertFragment;
        }

        public final void showPendingAlert() {
            UiThreadUtil.assertOnUiThread();
            if (this.mFragmentToShow != null) {
                if (isUsingSupportLibrary()) {
                    ((SupportAlertFragment) this.mFragmentToShow).D(this.mSupportFragmentManager, DialogModule.FRAGMENT_TAG);
                } else {
                    ((AlertFragment) this.mFragmentToShow).show(this.mFragmentManager, DialogModule.FRAGMENT_TAG);
                }
                this.mFragmentToShow = null;
            }
        }
    }

    public String getName() {
        return NAME;
    }

    public void onHostDestroy() {
    }

    public DialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public Map getConstants() {
        return CONSTANTS;
    }

    private FragmentManagerHelper getFragmentManagerHelper() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return null;
        }
        if (currentActivity instanceof FragmentActivity) {
            return new FragmentManagerHelper(((FragmentActivity) currentActivity).D());
        }
        return new FragmentManagerHelper(currentActivity.getFragmentManager());
    }

    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    public void onHostPause() {
        this.mIsInForeground = false;
    }

    public void onHostResume() {
        this.mIsInForeground = true;
        FragmentManagerHelper fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper != null) {
            fragmentManagerHelper.showPendingAlert();
        } else {
            AnonymousClass0Df.G(DialogModule.class, "onHostResume called but no FragmentManager found");
        }
    }

    @ReactMethod
    public void showAlert(ReadableMap readableMap, Callback callback, final Callback callback2) {
        final FragmentManagerHelper fragmentManagerHelper = getFragmentManagerHelper();
        int i = 0;
        if (fragmentManagerHelper == null) {
            callback.invoke(new Object[]{"Tried to show an alert while not attached to an Activity"});
            return;
        }
        final Bundle bundle = new Bundle();
        if (readableMap.hasKey(KEY_TITLE)) {
            String str = KEY_TITLE;
            bundle.putString(str, readableMap.getString(str));
        }
        if (readableMap.hasKey("message")) {
            str = "message";
            bundle.putString(str, readableMap.getString(str));
        }
        if (readableMap.hasKey(KEY_BUTTON_POSITIVE)) {
            bundle.putString("button_positive", readableMap.getString(KEY_BUTTON_POSITIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEGATIVE)) {
            bundle.putString("button_negative", readableMap.getString(KEY_BUTTON_NEGATIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEUTRAL)) {
            bundle.putString("button_neutral", readableMap.getString(KEY_BUTTON_NEUTRAL));
        }
        if (readableMap.hasKey(KEY_ITEMS)) {
            ReadableArray array = readableMap.getArray(KEY_ITEMS);
            CharSequence[] charSequenceArr = new CharSequence[array.size()];
            while (i < array.size()) {
                charSequenceArr[i] = array.getString(i);
                i++;
            }
            bundle.putCharSequenceArray(KEY_ITEMS, charSequenceArr);
        }
        if (readableMap.hasKey(KEY_CANCELABLE)) {
            str = KEY_CANCELABLE;
            bundle.putBoolean(str, readableMap.getBoolean(str));
        }
        UiThreadUtil.runOnUiThread(new Runnable() {
            public final void run() {
                fragmentManagerHelper.showNewAlert(DialogModule.this.mIsInForeground, bundle, callback2);
            }
        });
    }
}
