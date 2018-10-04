package com.facebook.react.uimanager;

import X.AnonymousClass09A;
import X.AnonymousClass09H;
import X.AnonymousClass0Df;
import X.AnonymousClass0LR;
import android.content.res.Resources;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnDismissListener;
import android.widget.PopupMenu.OnMenuItemClickListener;
import com.facebook.react.animation.Animation;
import com.facebook.react.animation.AnimationListener;
import com.facebook.react.animation.AnimationRegistry;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.touch.JSResponderHandler;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import com.facebook.react.uimanager.layoutanimation.LayoutAnimationController;
import com.facebook.react.uimanager.layoutanimation.LayoutAnimationListener;

public final class NativeViewHierarchyManager {
    private static final String TAG = "NativeViewHierarchyManager";
    public final AnimationRegistry mAnimationRegistry;
    private final JSResponderHandler mJSResponderHandler;
    private boolean mLayoutAnimationEnabled;
    private final LayoutAnimationController mLayoutAnimator;
    private PopupMenu mPopupMenu;
    private final SparseBooleanArray mRootTags;
    private final RootViewManager mRootViewManager;
    private final SparseArray mTagsToViewManagers;
    private final SparseArray mTagsToViews;
    private final ViewManagerRegistry mViewManagers;

    public final class PopupMenuCallbackHandler implements OnDismissListener, OnMenuItemClickListener {
        public boolean mConsumed = false;
        public final Callback mSuccess;

        public PopupMenuCallbackHandler(Callback callback) {
            this.mSuccess = callback;
        }

        public final void onDismiss(PopupMenu popupMenu) {
            if (!this.mConsumed) {
                this.mSuccess.invoke(DialogModule.ACTION_DISMISSED);
                this.mConsumed = true;
            }
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            if (this.mConsumed) {
                return false;
            }
            this.mSuccess.invoke("itemSelected", Integer.valueOf(menuItem.getOrder()));
            this.mConsumed = true;
            return true;
        }
    }

    public NativeViewHierarchyManager(ViewManagerRegistry viewManagerRegistry) {
        this(viewManagerRegistry, new RootViewManager());
    }

    public NativeViewHierarchyManager(ViewManagerRegistry viewManagerRegistry, RootViewManager rootViewManager) {
        this.mJSResponderHandler = new JSResponderHandler();
        this.mLayoutAnimator = new LayoutAnimationController();
        this.mAnimationRegistry = new AnimationRegistry();
        this.mViewManagers = viewManagerRegistry;
        this.mTagsToViews = new SparseArray();
        this.mTagsToViewManagers = new SparseArray();
        this.mRootTags = new SparseBooleanArray();
        this.mRootViewManager = rootViewManager;
    }

    public final synchronized void addRootView(int i, SizeMonitoringFrameLayout sizeMonitoringFrameLayout, ThemedReactContext themedReactContext) {
        addRootViewGroup(i, sizeMonitoringFrameLayout, themedReactContext);
    }

    public final synchronized void addRootViewGroup(int i, ViewGroup viewGroup, ThemedReactContext themedReactContext) {
        if (viewGroup.getId() == -1) {
            this.mTagsToViews.put(i, viewGroup);
            this.mTagsToViewManagers.put(i, this.mRootViewManager);
            this.mRootTags.put(i, true);
            viewGroup.setId(i);
        } else {
            throw new IllegalViewOperationException("Trying to add a root view with an explicit id already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
        }
    }

    private static boolean arrayContains(int[] iArr, int i) {
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void clearJSResponder() {
        this.mJSResponderHandler.clearJSResponder();
    }

    public final void clearLayoutAnimation() {
        this.mLayoutAnimator.reset();
    }

    public final void configureLayoutAnimation(ReadableMap readableMap) {
        this.mLayoutAnimator.initializeFromConfig(readableMap);
    }

    private static String constructManageChildrenErrorMessage(ViewGroup viewGroup, ViewGroupManager viewGroupManager, int[] iArr, ViewAtIndex[] viewAtIndexArr, int[] iArr2) {
        StringBuilder stringBuilder;
        int i;
        int i2;
        int i3;
        StringBuilder stringBuilder2 = new StringBuilder();
        if (viewGroup != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("View tag:");
            stringBuilder.append(viewGroup.getId());
            stringBuilder.append("\n");
            stringBuilder2.append(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("  children(");
            stringBuilder.append(viewGroupManager.getChildCount(viewGroup));
            stringBuilder.append("): [\n");
            stringBuilder2.append(stringBuilder.toString());
            for (i = 0; i < viewGroupManager.getChildCount(viewGroup); i += 16) {
                i2 = 0;
                while (true) {
                    i3 = i + i2;
                    if (i3 >= viewGroupManager.getChildCount(viewGroup) || i2 >= 16) {
                        stringBuilder2.append("\n");
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(viewGroupManager.getChildAt(viewGroup, i3).getId());
                        stringBuilder.append(",");
                        stringBuilder2.append(stringBuilder.toString());
                        i2++;
                    }
                }
                stringBuilder2.append("\n");
            }
            stringBuilder2.append(" ],\n");
        }
        if (iArr != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("  indicesToRemove(");
            stringBuilder.append(iArr.length);
            stringBuilder.append("): [\n");
            stringBuilder2.append(stringBuilder.toString());
            for (i2 = 0; i2 < iArr.length; i2 += 16) {
                i = 0;
                while (true) {
                    i3 = i2 + i;
                    if (i3 >= iArr.length || i >= 16) {
                        stringBuilder2.append("\n");
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(iArr[i3]);
                        stringBuilder.append(",");
                        stringBuilder2.append(stringBuilder.toString());
                        i++;
                    }
                }
                stringBuilder2.append("\n");
            }
            stringBuilder2.append(" ],\n");
        }
        if (viewAtIndexArr != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("  viewsToAdd(");
            stringBuilder.append(viewAtIndexArr.length);
            stringBuilder.append("): [\n");
            stringBuilder2.append(stringBuilder.toString());
            for (i3 = 0; i3 < viewAtIndexArr.length; i3 += 16) {
                i = 0;
                while (true) {
                    i2 = i3 + i;
                    if (i2 >= viewAtIndexArr.length || i >= 16) {
                        stringBuilder2.append("\n");
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("[");
                        stringBuilder.append(viewAtIndexArr[i2].mIndex);
                        stringBuilder.append(",");
                        stringBuilder.append(viewAtIndexArr[i2].mTag);
                        stringBuilder.append("],");
                        stringBuilder2.append(stringBuilder.toString());
                        i++;
                    }
                }
                stringBuilder2.append("\n");
            }
            stringBuilder2.append(" ],\n");
        }
        if (iArr2 != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("  tagsToDelete(");
            stringBuilder.append(iArr2.length);
            stringBuilder.append("): [\n");
            stringBuilder2.append(stringBuilder.toString());
            for (i2 = 0; i2 < iArr2.length; i2 += 16) {
                i = 0;
                while (true) {
                    i3 = i2 + i;
                    if (i3 >= iArr2.length || i >= 16) {
                        stringBuilder2.append("\n");
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(iArr2[i3]);
                        stringBuilder.append(",");
                        stringBuilder2.append(stringBuilder.toString());
                        i++;
                    }
                }
                stringBuilder2.append("\n");
            }
            stringBuilder2.append(" ]\n");
        }
        return stringBuilder2.toString();
    }

    public final synchronized void createView(ThemedReactContext themedReactContext, int i, String str, ReactStylesDiffMap reactStylesDiffMap) {
        UiThreadUtil.assertOnUiThread();
        AnonymousClass09A.B(33554432, "NativeViewHierarchyManager_createView").A("tag", i).B("className", str).C();
        try {
            ViewManager viewManager = this.mViewManagers.get(str);
            View createView = viewManager.createView(themedReactContext, this.mJSResponderHandler);
            this.mTagsToViews.put(i, createView);
            this.mTagsToViewManagers.put(i, viewManager);
            createView.setId(i);
            if (reactStylesDiffMap != null) {
                viewManager.updateProperties(createView, reactStylesDiffMap);
            }
            AnonymousClass09H.C(33554432, 892176907);
        } catch (Throwable th) {
            AnonymousClass09H.C(33554432, -1006303975);
        }
    }

    public final void dismissPopupMenu() {
        PopupMenu popupMenu = this.mPopupMenu;
        if (popupMenu != null) {
            popupMenu.dismiss();
        }
    }

    public final synchronized void dispatchCommand(int i, int i2, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        View view = (View) this.mTagsToViews.get(i);
        if (view != null) {
            resolveViewManager(i).receiveCommand(view, i2, readableArray);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Trying to send command to a non-existing view with tag ");
            stringBuilder.append(i);
            throw new IllegalViewOperationException(stringBuilder.toString());
        }
    }

    public final synchronized void dropView(View view) {
        UiThreadUtil.assertOnUiThread();
        if (!this.mRootTags.get(view.getId())) {
            resolveViewManager(view.getId()).onDropViewInstance(view);
        }
        ViewManager viewManager = (ViewManager) this.mTagsToViewManagers.get(view.getId());
        if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
            ViewGroup viewGroup = (ViewGroup) view;
            ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
            for (int childCount = viewGroupManager.getChildCount(viewGroup) - 1; childCount >= 0; childCount--) {
                View childAt = viewGroupManager.getChildAt(viewGroup, childCount);
                if (this.mTagsToViews.get(childAt.getId()) != null) {
                    dropView(childAt);
                }
            }
            viewGroupManager.removeAllViews(viewGroup);
        }
        this.mTagsToViews.remove(view.getId());
        this.mTagsToViewManagers.remove(view.getId());
    }

    public final synchronized int findTargetTagForTouch(int i, float f, float f2) {
        View view;
        UiThreadUtil.assertOnUiThread();
        view = (View) this.mTagsToViews.get(i);
        if (view != null) {
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not find view with tag ");
            stringBuilder.append(i);
            throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
        }
        return TouchTargetHelper.findTargetTagForTouch(f, f2, (ViewGroup) view);
    }

    public final AnimationRegistry getAnimationRegistry() {
        return this.mAnimationRegistry;
    }

    private ThemedReactContext getReactContextForView(int i) {
        View view = (View) this.mTagsToViews.get(i);
        if (view != null) {
            return (ThemedReactContext) view.getContext();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not find view with tag ");
        stringBuilder.append(i);
        throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
    }

    public final synchronized void manageChildren(int i, int[] iArr, ViewAtIndex[] viewAtIndexArr, int[] iArr2) {
        IllegalViewOperationException illegalViewOperationException;
        UiThreadUtil.assertOnUiThread();
        final ViewGroup viewGroup = (ViewGroup) this.mTagsToViews.get(i);
        final ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager(i);
        StringBuilder stringBuilder;
        if (viewGroup != null) {
            int length;
            int i2;
            View childAt;
            int childCount = viewGroupManager.getChildCount(viewGroup);
            if (iArr != null) {
                length = iArr.length - 1;
                while (length >= 0) {
                    i2 = iArr[length];
                    if (i2 >= 0) {
                        if (i2 < viewGroupManager.getChildCount(viewGroup)) {
                            if (i2 >= childCount) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Trying to remove an out of order view index:");
                                stringBuilder.append(i2);
                                stringBuilder.append(" view tag: ");
                                stringBuilder.append(i);
                                stringBuilder.append("\n detail: ");
                                stringBuilder.append(constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                                illegalViewOperationException = new IllegalViewOperationException(stringBuilder.toString());
                                break;
                            }
                            childAt = viewGroupManager.getChildAt(viewGroup, i2);
                            if (!this.mLayoutAnimationEnabled || !this.mLayoutAnimator.shouldAnimateLayout(childAt) || !arrayContains(iArr2, childAt.getId())) {
                                viewGroupManager.removeViewAt(viewGroup, i2);
                            }
                            length--;
                            childCount = i2;
                        } else {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Trying to remove a view index above child count ");
                            stringBuilder.append(i2);
                            stringBuilder.append(" view tag: ");
                            stringBuilder.append(i);
                            stringBuilder.append("\n detail: ");
                            stringBuilder.append(constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                            illegalViewOperationException = new IllegalViewOperationException(stringBuilder.toString());
                            break;
                        }
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Trying to remove a negative view index:");
                    stringBuilder.append(i2);
                    stringBuilder.append(" view tag: ");
                    stringBuilder.append(i);
                    stringBuilder.append("\n detail: ");
                    stringBuilder.append(constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                    illegalViewOperationException = new IllegalViewOperationException(stringBuilder.toString());
                    break;
                }
            }
            int i3 = 0;
            if (viewAtIndexArr != null) {
                for (ViewAtIndex viewAtIndex : viewAtIndexArr) {
                    childAt = (View) this.mTagsToViews.get(viewAtIndex.mTag);
                    if (childAt == null) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Trying to add unknown view tag: ");
                        stringBuilder.append(viewAtIndex.mTag);
                        stringBuilder.append("\n detail: ");
                        stringBuilder.append(constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                        illegalViewOperationException = new IllegalViewOperationException(stringBuilder.toString());
                        break;
                    }
                    viewGroupManager.addView(viewGroup, childAt, viewAtIndex.mIndex);
                }
            }
            if (iArr2 != null) {
                while (i3 < iArr2.length) {
                    i2 = iArr2[i3];
                    final View view = (View) this.mTagsToViews.get(i2);
                    if (view != null) {
                        if (this.mLayoutAnimationEnabled && this.mLayoutAnimator.shouldAnimateLayout(view)) {
                            this.mLayoutAnimator.deleteView(view, new LayoutAnimationListener() {
                                public final void onAnimationEnd() {
                                    viewGroupManager.removeView(viewGroup, view);
                                    NativeViewHierarchyManager.this.dropView(view);
                                }
                            });
                        } else {
                            dropView(view);
                        }
                        i3++;
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Trying to destroy unknown view tag: ");
                        stringBuilder.append(i2);
                        stringBuilder.append("\n detail: ");
                        stringBuilder.append(constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                        illegalViewOperationException = new IllegalViewOperationException(stringBuilder.toString());
                    }
                }
            }
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Trying to manageChildren view with tag ");
            stringBuilder.append(i);
            stringBuilder.append(" which doesn't exist\n detail: ");
            stringBuilder.append(constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
            illegalViewOperationException = new IllegalViewOperationException(stringBuilder.toString());
        }
        throw illegalViewOperationException;
    }

    public final synchronized void measure(int i, int[] iArr) {
        NoSuchNativeViewException noSuchNativeViewException;
        UiThreadUtil.assertOnUiThread();
        View view = (View) this.mTagsToViews.get(i);
        StringBuilder stringBuilder;
        if (view != null) {
            View view2 = (View) RootViewUtil.getRootView(view);
            if (view2 != null) {
                view2.getLocationInWindow(iArr);
                int i2 = iArr[0];
                int i3 = iArr[1];
                view.getLocationInWindow(iArr);
                iArr[0] = iArr[0] - i2;
                iArr[1] = iArr[1] - i3;
                iArr[2] = view.getWidth();
                iArr[3] = view.getHeight();
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Native view ");
                stringBuilder.append(i);
                stringBuilder.append(" is no longer on screen");
                noSuchNativeViewException = new NoSuchNativeViewException(stringBuilder.toString());
            }
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("No native view for ");
            stringBuilder.append(i);
            stringBuilder.append(" currently exists");
            noSuchNativeViewException = new NoSuchNativeViewException(stringBuilder.toString());
        }
        throw noSuchNativeViewException;
    }

    public final synchronized void measureInWindow(int i, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = (View) this.mTagsToViews.get(i);
        if (view != null) {
            view.getLocationOnScreen(iArr);
            Resources resources = view.getContext().getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                iArr[1] = iArr[1] - ((int) resources.getDimension(identifier));
            }
            iArr[2] = view.getWidth();
            iArr[3] = view.getHeight();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No native view for ");
            stringBuilder.append(i);
            stringBuilder.append(" currently exists");
            throw new NoSuchNativeViewException(stringBuilder.toString());
        }
    }

    public final synchronized void removeRootView(int i) {
        UiThreadUtil.assertOnUiThread();
        if (!this.mRootTags.get(i)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("View with tag ");
            stringBuilder.append(i);
            stringBuilder.append(" is not registered as a root view");
            SoftAssertions.assertUnreachable(stringBuilder.toString());
        }
        dropView((View) this.mTagsToViews.get(i));
        this.mRootTags.delete(i);
    }

    public final synchronized View resolveView(int i) {
        View view;
        view = (View) this.mTagsToViews.get(i);
        if (view == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Trying to resolve view with tag ");
            stringBuilder.append(i);
            stringBuilder.append(" which doesn't exist");
            throw new IllegalViewOperationException(stringBuilder.toString());
        }
        return view;
    }

    public final synchronized ViewManager resolveViewManager(int i) {
        ViewManager viewManager;
        viewManager = (ViewManager) this.mTagsToViewManagers.get(i);
        if (viewManager == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ViewManager for tag ");
            stringBuilder.append(i);
            stringBuilder.append(" could not be found");
            throw new IllegalViewOperationException(stringBuilder.toString());
        }
        return viewManager;
    }

    public final void sendAccessibilityEvent(int i, int i2) {
        View view = (View) this.mTagsToViews.get(i);
        if (view != null) {
            AccessibilityHelper.sendAccessibilityEvent(view, i2);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not find view with tag ");
        stringBuilder.append(i);
        throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
    }

    public final synchronized void setJSResponder(int i, int i2, boolean z) {
        if (z) {
            View view = (View) this.mTagsToViews.get(i);
            if (i2 == i || !(view instanceof ViewParent)) {
                if (this.mRootTags.get(i)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Cannot block native responder on ");
                    stringBuilder.append(i);
                    stringBuilder.append(" that is a root view");
                    SoftAssertions.assertUnreachable(stringBuilder.toString());
                }
                this.mJSResponderHandler.setJSResponder(i2, view.getParent());
            } else {
                this.mJSResponderHandler.setJSResponder(i2, (ViewParent) view);
            }
        } else {
            this.mJSResponderHandler.setJSResponder(i2, null);
        }
    }

    public final void setLayoutAnimationEnabled(boolean z) {
        this.mLayoutAnimationEnabled = z;
    }

    public final synchronized void showPopupMenu(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        UiThreadUtil.assertOnUiThread();
        View view = (View) this.mTagsToViews.get(i);
        if (view == null) {
            Object[] objArr = new Object[1];
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can't display popup. Could not find view with tag ");
            stringBuilder.append(i);
            objArr[0] = stringBuilder.toString();
            callback2.invoke(objArr);
        } else {
            this.mPopupMenu = new PopupMenu(getReactContextForView(i), view);
            Menu menu = this.mPopupMenu.getMenu();
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                menu.add(0, 0, i2, readableArray.getString(i2));
            }
            Object popupMenuCallbackHandler = new PopupMenuCallbackHandler(callback);
            this.mPopupMenu.setOnMenuItemClickListener(popupMenuCallbackHandler);
            this.mPopupMenu.setOnDismissListener(popupMenuCallbackHandler);
            this.mPopupMenu.show();
        }
    }

    public final synchronized void startAnimationForNativeView(int i, Animation animation, final Callback callback) {
        UiThreadUtil.assertOnUiThread();
        View view = (View) this.mTagsToViews.get(i);
        final int animationID = animation.getAnimationID();
        if (view != null) {
            animation.setAnimationListener(new AnimationListener() {
                public final void onCancel() {
                    AnonymousClass0LR.E(NativeViewHierarchyManager.this.mAnimationRegistry.removeAnimation(animationID), "Animation was already removed somehow!");
                    Callback callback = callback;
                    if (callback != null) {
                        callback.invoke(Boolean.valueOf(false));
                    }
                }
            });
            animation.start(view);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("View with tag ");
            stringBuilder.append(i);
            stringBuilder.append(" not found");
            throw new IllegalViewOperationException(stringBuilder.toString());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void updateLayout(int r11, int r12, int r13, int r14, int r15, int r16) {
        /*
        r10 = this;
        r5 = r10;
        monitor-enter(r5);
        com.facebook.react.bridge.UiThreadUtil.assertOnUiThread();	 Catch:{ all -> 0x008c }
        r2 = "NativeViewHierarchyManager_updateLayout";
        r0 = 33554432; // 0x2000000 float:9.403955E-38 double:1.6578092E-316;
        r3 = X.AnonymousClass09A.B(r0, r2);	 Catch:{ all -> 0x008c }
        r2 = "parentTag";
        r3 = r3.A(r2, r11);	 Catch:{ all -> 0x008c }
        r2 = "tag";
        r2 = r3.A(r2, r12);	 Catch:{ all -> 0x008c }
        r2.C();	 Catch:{ all -> 0x008c }
        r6 = r10.resolveView(r12);	 Catch:{ all -> 0x0084 }
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r9 = r15;
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r2);	 Catch:{ all -> 0x0084 }
        r10 = r16;
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r2);	 Catch:{ all -> 0x0084 }
        r6.measure(r3, r2);	 Catch:{ all -> 0x0084 }
        r3 = r6.getParent();	 Catch:{ all -> 0x0084 }
        r2 = r3 instanceof com.facebook.react.uimanager.RootView;	 Catch:{ all -> 0x0084 }
        if (r2 == 0) goto L_0x003c;
    L_0x0039:
        r3.requestLayout();	 Catch:{ all -> 0x0084 }
    L_0x003c:
        r2 = r5.mRootTags;	 Catch:{ all -> 0x0084 }
        r2 = r2.get(r11);	 Catch:{ all -> 0x0084 }
        if (r2 != 0) goto L_0x005a;
    L_0x0044:
        r2 = r5.mTagsToViewManagers;	 Catch:{ all -> 0x0084 }
        r3 = r2.get(r11);	 Catch:{ all -> 0x0084 }
        r3 = (com.facebook.react.uimanager.ViewManager) r3;	 Catch:{ all -> 0x0084 }
        r2 = r3 instanceof com.facebook.react.uimanager.ViewGroupManager;	 Catch:{ all -> 0x0084 }
        if (r2 == 0) goto L_0x0060;
    L_0x0050:
        r3 = (com.facebook.react.uimanager.ViewGroupManager) r3;	 Catch:{ all -> 0x0084 }
        if (r3 == 0) goto L_0x007c;
    L_0x0054:
        r2 = r3.needsCustomLayoutForChildren();	 Catch:{ all -> 0x0084 }
        if (r2 != 0) goto L_0x007c;
    L_0x005a:
        r7 = r13;
        r8 = r14;
        r5.updateLayout(r6, r7, r8, r9, r10);	 Catch:{ all -> 0x0084 }
        goto L_0x007c;
    L_0x0060:
        r4 = new com.facebook.react.uimanager.IllegalViewOperationException;	 Catch:{ all -> 0x0084 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0084 }
        r3.<init>();	 Catch:{ all -> 0x0084 }
        r2 = "Trying to use view with tag ";
        r3.append(r2);	 Catch:{ all -> 0x0084 }
        r3.append(r12);	 Catch:{ all -> 0x0084 }
        r2 = " as a parent, but its Manager doesn't extends ViewGroupManager";
        r3.append(r2);	 Catch:{ all -> 0x0084 }
        r2 = r3.toString();	 Catch:{ all -> 0x0084 }
        r4.<init>(r2);	 Catch:{ all -> 0x0084 }
        throw r4;	 Catch:{ all -> 0x0084 }
    L_0x007c:
        r2 = 1565728068; // 0x5d531d44 float:9.5077437E17 double:7.73572449E-315;
        X.AnonymousClass09H.C(r0, r2);	 Catch:{ all -> 0x008c }
        monitor-exit(r5);
        return;
    L_0x0084:
        r3 = move-exception;
        r2 = 1553951607; // 0x5c9f6b77 float:3.58981441E17 double:7.677541043E-315;
        X.AnonymousClass09H.C(r0, r2);	 Catch:{ all -> 0x008c }
        throw r3;	 Catch:{ all -> 0x008c }
    L_0x008c:
        r0 = move-exception;
        monitor-exit(r5);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.NativeViewHierarchyManager.updateLayout(int, int, int, int, int, int):void");
    }

    private void updateLayout(View view, int i, int i2, int i3, int i4) {
        int i5 = i4;
        int i6 = i3;
        View view2 = view;
        int i7 = i;
        int i8 = i2;
        if (this.mLayoutAnimationEnabled && this.mLayoutAnimator.shouldAnimateLayout(view)) {
            this.mLayoutAnimator.applyLayoutUpdate(view2, i7, i8, i6, i5);
        } else {
            view.layout(i, i2, i3 + i, i4 + i2);
        }
    }

    public final synchronized void updateProperties(int i, ReactStylesDiffMap reactStylesDiffMap) {
        UiThreadUtil.assertOnUiThread();
        try {
            ViewManager resolveViewManager = resolveViewManager(i);
            View resolveView = resolveView(i);
            if (reactStylesDiffMap != null) {
                resolveViewManager.updateProperties(resolveView, reactStylesDiffMap);
            }
        } catch (Throwable e) {
            String str = TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to update properties for view tag ");
            stringBuilder.append(i);
            AnonymousClass0Df.D(str, stringBuilder.toString(), e);
        }
        return;
    }

    public final synchronized void updateViewExtraData(int i, Object obj) {
        UiThreadUtil.assertOnUiThread();
        resolveViewManager(i).updateExtraData(resolveView(i), obj);
    }
}
