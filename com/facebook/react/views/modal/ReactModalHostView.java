package com.facebook.react.views.modal;

import X.AnonymousClass0LR;
import X.AnonymousClass0cQ;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnShowListener;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import com.facebook.C0164R;
import com.facebook.common.dextricks.DexStore;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.JSTouchDispatcher;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.view.ReactViewGroup;
import java.util.ArrayList;

public final class ReactModalHostView extends ViewGroup implements LifecycleEventListener {
    private String mAnimationType;
    private Dialog mDialog;
    private boolean mHardwareAccelerated;
    private DialogRootViewGroup mHostView;
    public OnRequestCloseListener mOnRequestCloseListener;
    private OnShowListener mOnShowListener;
    private boolean mPropertyRequiresNewDialog;
    private boolean mTransparent;

    /* renamed from: com.facebook.react.views.modal.ReactModalHostView$1 */
    public final class C01901 implements OnKeyListener {
        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 1) {
                if (i == 4) {
                    AnonymousClass0LR.E(ReactModalHostView.this.mOnRequestCloseListener, "setOnRequestCloseListener must be called by the manager");
                    ReactModalHostView.this.mOnRequestCloseListener.onRequestClose(dialogInterface);
                    return true;
                }
                Activity currentActivity = ((ReactContext) ReactModalHostView.this.getContext()).getCurrentActivity();
                if (currentActivity != null) {
                    return currentActivity.onKeyUp(i, keyEvent);
                }
            }
            return false;
        }
    }

    public interface OnRequestCloseListener {
        void onRequestClose(DialogInterface dialogInterface);
    }

    public final class DialogRootViewGroup extends ReactViewGroup implements RootView {
        private final JSTouchDispatcher mJSTouchDispatcher = new JSTouchDispatcher(this);

        public final void requestDisallowInterceptTouchEvent(boolean z) {
        }

        public DialogRootViewGroup(Context context) {
            super(context);
        }

        private EventDispatcher getEventDispatcher() {
            return ((UIManagerModule) getReactContext(this).getNativeModule(UIManagerModule.class)).getEventDispatcher();
        }

        public static ReactContext getReactContext(DialogRootViewGroup dialogRootViewGroup) {
            return (ReactContext) dialogRootViewGroup.getContext();
        }

        public final void handleException(Throwable th) {
            getReactContext(this).handleException(new RuntimeException(th));
        }

        public final void onChildStartedNativeGesture(MotionEvent motionEvent) {
            this.mJSTouchDispatcher.onChildStartedNativeGesture(motionEvent, getEventDispatcher());
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            this.mJSTouchDispatcher.handleTouchEvent(motionEvent, getEventDispatcher());
            return super.onInterceptTouchEvent(motionEvent);
        }

        public final void onSizeChanged(final int i, final int i2, int i3, int i4) {
            View view = this;
            int N = AnonymousClass0cQ.N(this, -584971480);
            super.onSizeChanged(i, i2, i3, i4);
            if (getChildCount() > 0) {
                final int id = getChildAt(0).getId();
                ReactContext reactContext = getReactContext(view);
                reactContext.runOnNativeModulesQueueThread(new GuardedRunnable(reactContext) {
                    public final void runGuarded() {
                        ((UIManagerModule) DialogRootViewGroup.getReactContext(DialogRootViewGroup.this).getNativeModule(UIManagerModule.class)).updateNodeSize(id, i, i2);
                    }
                });
            }
            AnonymousClass0cQ.O(view, 1009071715, N);
        }

        public final boolean onTouchEvent(MotionEvent motionEvent) {
            int M = AnonymousClass0cQ.M(this, 1526727920);
            this.mJSTouchDispatcher.handleTouchEvent(motionEvent, getEventDispatcher());
            super.onTouchEvent(motionEvent);
            AnonymousClass0cQ.L(this, 1427069623, M);
            return true;
        }
    }

    public final void addChildrenForAccessibility(ArrayList arrayList) {
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final void onHostPause() {
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public ReactModalHostView(Context context) {
        super(context);
        ((ReactContext) context).addLifecycleEventListener(this);
        this.mHostView = new DialogRootViewGroup(context);
    }

    public final void addView(View view, int i) {
        this.mHostView.addView(view, i);
    }

    private void dismiss() {
        if (this.mDialog != null) {
            Activity currentActivity = getCurrentActivity();
            if (this.mDialog.isShowing() && (currentActivity == null || !currentActivity.isFinishing())) {
                this.mDialog.dismiss();
            }
            this.mDialog = null;
            ((ViewGroup) this.mHostView.getParent()).removeViewAt(0);
        }
    }

    public final View getChildAt(int i) {
        return this.mHostView.getChildAt(i);
    }

    public int getChildCount() {
        return this.mHostView.getChildCount();
    }

    private View getContentView() {
        View frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.mHostView);
        frameLayout.setFitsSystemWindows(true);
        return frameLayout;
    }

    private Activity getCurrentActivity() {
        return ((ReactContext) getContext()).getCurrentActivity();
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public final void onDropInstance() {
        ((ReactContext) getContext()).removeLifecycleEventListener(this);
        dismiss();
    }

    public final void onHostDestroy() {
        onDropInstance();
    }

    public final void onHostResume() {
        showOrUpdate();
    }

    public final void removeView(View view) {
        this.mHostView.removeView(view);
    }

    public final void removeViewAt(int i) {
        this.mHostView.removeView(getChildAt(i));
    }

    public void setAnimationType(String str) {
        this.mAnimationType = str;
        this.mPropertyRequiresNewDialog = true;
    }

    public void setHardwareAccelerated(boolean z) {
        this.mHardwareAccelerated = z;
        this.mPropertyRequiresNewDialog = true;
    }

    public void setOnRequestCloseListener(OnRequestCloseListener onRequestCloseListener) {
        this.mOnRequestCloseListener = onRequestCloseListener;
    }

    public void setOnShowListener(OnShowListener onShowListener) {
        this.mOnShowListener = onShowListener;
    }

    public void setTransparent(boolean z) {
        this.mTransparent = z;
    }

    public final void showOrUpdate() {
        if (this.mDialog != null) {
            if (this.mPropertyRequiresNewDialog) {
                dismiss();
            } else {
                updateProperties();
                return;
            }
        }
        this.mPropertyRequiresNewDialog = false;
        int i = C0164R.style.Theme.FullScreenDialog;
        if (this.mAnimationType.equals("fade")) {
            i = C0164R.style.Theme.FullScreenDialogAnimatedFade;
        } else if (this.mAnimationType.equals("slide")) {
            i = C0164R.style.Theme.FullScreenDialogAnimatedSlide;
        }
        Context currentActivity = getCurrentActivity();
        this.mDialog = new Dialog(currentActivity == null ? getContext() : currentActivity, i);
        this.mDialog.setContentView(getContentView());
        updateProperties();
        this.mDialog.setOnShowListener(this.mOnShowListener);
        this.mDialog.setOnKeyListener(new C01901());
        this.mDialog.getWindow().setSoftInputMode(16);
        if (this.mHardwareAccelerated) {
            this.mDialog.getWindow().addFlags(16777216);
        }
        if (!(currentActivity == null || currentActivity.isFinishing())) {
            this.mDialog.show();
        }
    }

    private void updateProperties() {
        AnonymousClass0LR.E(this.mDialog, "mDialog must exist when we call updateProperties");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            if ((currentActivity.getWindow().getAttributes().flags & DexStore.LOAD_RESULT_MIXED_MODE) != 0) {
                this.mDialog.getWindow().addFlags(DexStore.LOAD_RESULT_MIXED_MODE);
            } else {
                this.mDialog.getWindow().clearFlags(DexStore.LOAD_RESULT_MIXED_MODE);
            }
        }
        if (this.mTransparent) {
            this.mDialog.getWindow().clearFlags(2);
            return;
        }
        this.mDialog.getWindow().setDimAmount(0.5f);
        this.mDialog.getWindow().setFlags(2, 2);
    }
}
