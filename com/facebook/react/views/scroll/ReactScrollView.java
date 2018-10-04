package com.facebook.react.views.scroll;

import X.AnonymousClass0LR;
import X.AnonymousClass0cQ;
import X.AnonymousClass0mE;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.MeasureSpecAssertions;
import com.facebook.react.uimanager.ReactClippingViewGroup;
import com.facebook.react.uimanager.ReactClippingViewGroupHelper;
import com.facebook.react.uimanager.events.NativeGestureUtil;
import com.facebook.react.views.view.ReactViewBackgroundManager;
import java.lang.reflect.Field;
import java.util.List;

public final class ReactScrollView extends ScrollView implements ReactClippingViewGroup, OnLayoutChangeListener, OnHierarchyChangeListener {
    private static Field sScrollerField;
    private static boolean sTriedToGetScrollerField;
    public boolean mActivelyScrolling;
    private Rect mClippingRect;
    private View mContentView;
    private float mDecelerationRate = 0.985f;
    private boolean mDragging;
    private Drawable mEndBackground;
    private int mEndFillColor = 0;
    private FpsListener mFpsListener = null;
    private final OnScrollDispatchHelper mOnScrollDispatchHelper = new OnScrollDispatchHelper();
    public boolean mPagingEnabled = false;
    private Runnable mPostTouchRunnable;
    private ReactViewBackgroundManager mReactBackgroundManager;
    private final Rect mRect = new Rect();
    private boolean mRemoveClippedSubviews;
    private boolean mScrollEnabled = true;
    private String mScrollPerfTag;
    private final OverScroller mScroller;
    public boolean mSendMomentumEvents;
    private int mSnapInterval = 0;
    private List mSnapOffsets;
    private boolean mSnapToEnd = true;
    private boolean mSnapToStart = true;
    private final VelocityHelper mVelocityHelper = new VelocityHelper();

    /* renamed from: com.facebook.react.views.scroll.ReactScrollView$1 */
    public final class C01951 implements Runnable {
        private boolean mSnappingToPage = false;

        public final void run() {
            if (ReactScrollView.this.mActivelyScrolling) {
                ReactScrollView.this.mActivelyScrolling = false;
                AnonymousClass0mE.L(ReactScrollView.this, this, 20);
            } else if (!ReactScrollView.this.mPagingEnabled || this.mSnappingToPage) {
                if (ReactScrollView.this.mSendMomentumEvents) {
                    ReactScrollViewHelper.emitScrollMomentumEndEvent(ReactScrollView.this);
                }
                ReactScrollView.this.mPostTouchRunnable = null;
                ReactScrollView.disableFpsListener(ReactScrollView.this);
            } else {
                this.mSnappingToPage = true;
                ReactScrollView.smoothScrollAndSnap(ReactScrollView.this, 0);
                AnonymousClass0mE.L(ReactScrollView.this, this, 20);
            }
        }
    }

    public ReactScrollView(ReactContext reactContext, FpsListener fpsListener) {
        super(reactContext);
        this.mFpsListener = fpsListener;
        this.mReactBackgroundManager = new ReactViewBackgroundManager(this);
        this.mScroller = getOverScrollerFromParent();
        setOnHierarchyChangeListener(this);
        setScrollBarStyle(33554432);
    }

    public static void disableFpsListener(ReactScrollView reactScrollView) {
        if (reactScrollView.isScrollPerfLoggingEnabled()) {
            AnonymousClass0LR.D(reactScrollView.mFpsListener);
            AnonymousClass0LR.D(reactScrollView.mScrollPerfTag);
            reactScrollView.mFpsListener.disable(reactScrollView.mScrollPerfTag);
        }
    }

    public final void draw(Canvas canvas) {
        if (this.mEndFillColor != 0) {
            View childAt = getChildAt(0);
            if (!(this.mEndBackground == null || childAt == null || childAt.getBottom() >= getHeight())) {
                this.mEndBackground.setBounds(0, childAt.getBottom(), getWidth(), getHeight());
                this.mEndBackground.draw(canvas);
            }
        }
        getDrawingRect(this.mRect);
        canvas.clipRect(this.mRect);
        super.draw(canvas);
    }

    private void enableFpsListener() {
        if (isScrollPerfLoggingEnabled()) {
            AnonymousClass0LR.D(this.mFpsListener);
            AnonymousClass0LR.D(this.mScrollPerfTag);
            this.mFpsListener.enable(this.mScrollPerfTag);
        }
    }

    public final void flashScrollIndicators() {
        awakenScrollBars();
    }

    public final void fling(int i) {
        int i2 = i;
        if (this.mPagingEnabled) {
            smoothScrollAndSnap(this, i);
        } else if (this.mScroller != null) {
            this.mScroller.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, 0, Integer.MAX_VALUE, 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
            AnonymousClass0mE.J(this);
        } else {
            super.fling(i);
        }
        handlePostTouchScrolling(0, i);
    }

    public final void getClippingRect(Rect rect) {
        rect.set((Rect) AnonymousClass0LR.D(this.mClippingRect));
    }

    private int getMaxScrollY() {
        return Math.max(0, this.mContentView.getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    private android.widget.OverScroller getOverScrollerFromParent() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = sTriedToGetScrollerField;
        if (r0 != 0) goto L_0x001e;
    L_0x0004:
        r2 = 1;
        sTriedToGetScrollerField = r2;
        r1 = android.widget.ScrollView.class;	 Catch:{ NoSuchFieldException -> 0x0017 }
        r0 = "mScroller";	 Catch:{ NoSuchFieldException -> 0x0017 }
        r0 = r1.getDeclaredField(r0);	 Catch:{ NoSuchFieldException -> 0x0017 }
        sScrollerField = r0;	 Catch:{ NoSuchFieldException -> 0x0017 }
        r0 = sScrollerField;	 Catch:{ NoSuchFieldException -> 0x0017 }
        r0.setAccessible(r2);	 Catch:{ NoSuchFieldException -> 0x0017 }
        goto L_0x001e;	 Catch:{ NoSuchFieldException -> 0x0017 }
    L_0x0017:
        r1 = "ReactNative";
        r0 = "Failed to get mScroller field for ScrollView! This app will exhibit the bounce-back scrolling bug :(";
        android.util.Log.w(r1, r0);
    L_0x001e:
        r0 = sScrollerField;
        r2 = 0;
        if (r0 == 0) goto L_0x0040;
    L_0x0023:
        r1 = r0.get(r3);	 Catch:{ IllegalAccessException -> 0x0037 }
        r0 = r1 instanceof android.widget.OverScroller;	 Catch:{ IllegalAccessException -> 0x0037 }
        if (r0 == 0) goto L_0x002f;	 Catch:{ IllegalAccessException -> 0x0037 }
    L_0x002b:
        r1 = (android.widget.OverScroller) r1;	 Catch:{ IllegalAccessException -> 0x0037 }
        r2 = r1;	 Catch:{ IllegalAccessException -> 0x0037 }
        goto L_0x0040;	 Catch:{ IllegalAccessException -> 0x0037 }
    L_0x002f:
        r1 = "ReactNative";	 Catch:{ IllegalAccessException -> 0x0037 }
        r0 = "Failed to cast mScroller field in ScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(";	 Catch:{ IllegalAccessException -> 0x0037 }
        android.util.Log.w(r1, r0);	 Catch:{ IllegalAccessException -> 0x0037 }
        goto L_0x0040;	 Catch:{ IllegalAccessException -> 0x0037 }
    L_0x0037:
        r2 = move-exception;
        r1 = new java.lang.RuntimeException;
        r0 = "Failed to get mScroller from ScrollView!";
        r1.<init>(r0, r2);
        throw r1;
    L_0x0040:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.scroll.ReactScrollView.getOverScrollerFromParent():android.widget.OverScroller");
    }

    public boolean getRemoveClippedSubviews() {
        return this.mRemoveClippedSubviews;
    }

    private int getSnapInterval() {
        int i = this.mSnapInterval;
        if (i != 0) {
            return i;
        }
        return getHeight();
    }

    private void handlePostTouchScrolling(int i, int i2) {
        if (this.mSendMomentumEvents || this.mPagingEnabled || isScrollPerfLoggingEnabled()) {
            if (this.mPostTouchRunnable == null) {
                if (this.mSendMomentumEvents) {
                    enableFpsListener();
                    ReactScrollViewHelper.emitScrollMomentumBeginEvent(this, i, i2);
                }
                this.mActivelyScrolling = false;
                Runnable c01951 = new C01951();
                this.mPostTouchRunnable = c01951;
                AnonymousClass0mE.L(this, c01951, 20);
            }
        }
    }

    private boolean isScrollPerfLoggingEnabled() {
        if (this.mFpsListener != null) {
            String str = this.mScrollPerfTag;
            if (!(str == null || str.isEmpty())) {
                return true;
            }
        }
        return false;
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, 670490985);
        super.onAttachedToWindow();
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
        AnonymousClass0cQ.O(this, 1464318912, N);
    }

    public final void onChildViewAdded(View view, View view2) {
        this.mContentView = view2;
        this.mContentView.addOnLayoutChangeListener(this);
    }

    public final void onChildViewRemoved(View view, View view2) {
        this.mContentView.removeOnLayoutChangeListener(this);
        this.mContentView = null;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.mScrollEnabled) {
            try {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    NativeGestureUtil.notifyNativeGestureStarted(this, motionEvent);
                    ReactScrollViewHelper.emitScrollBeginDragEvent(this);
                    this.mDragging = true;
                    enableFpsListener();
                    return true;
                }
            } catch (Throwable e) {
                Log.w("ReactNative", "Error intercepting touch event.", e);
            }
        }
        return false;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        scrollTo(getScrollX(), getScrollY());
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.mContentView != null) {
            int scrollY = getScrollY();
            int maxScrollY = getMaxScrollY();
            if (scrollY > maxScrollY) {
                scrollTo(getScrollX(), maxScrollY);
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        MeasureSpecAssertions.assertExplicitMeasureSpec(i, i2);
        setMeasuredDimension(MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
    }

    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        OverScroller overScroller = this.mScroller;
        if (!(overScroller == null || overScroller.isFinished() || this.mScroller.getCurrY() == this.mScroller.getFinalY())) {
            int maxScrollY = getMaxScrollY();
            if (i2 >= maxScrollY) {
                this.mScroller.abortAnimation();
                i2 = maxScrollY;
            }
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.mActivelyScrolling = true;
        if (this.mOnScrollDispatchHelper.onScrollChanged(i, i2)) {
            if (this.mRemoveClippedSubviews) {
                updateClippingRect();
            }
            ReactScrollViewHelper.emitScrollEvent(this, this.mOnScrollDispatchHelper.getXFlingVelocity(), this.mOnScrollDispatchHelper.getYFlingVelocity());
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, -1625298251);
        super.onSizeChanged(i, i2, i3, i4);
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
        AnonymousClass0cQ.O(this, 1270583747, N);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.M(this, 1393234498);
        if (this.mScrollEnabled) {
            this.mVelocityHelper.calculateVelocity(motionEvent);
            if ((motionEvent.getAction() & 255) == 1 && this.mDragging) {
                float xVelocity = this.mVelocityHelper.getXVelocity();
                float yVelocity = this.mVelocityHelper.getYVelocity();
                ReactScrollViewHelper.emitScrollEndDragEvent(this, xVelocity, yVelocity);
                this.mDragging = false;
                handlePostTouchScrolling(Math.round(xVelocity), Math.round(yVelocity));
            }
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            AnonymousClass0cQ.L(this, -1648213983, M);
            return onTouchEvent;
        }
        AnonymousClass0cQ.L(this, 631435889, M);
        return false;
    }

    public void setBackgroundColor(int i) {
        this.mReactBackgroundManager.setBackgroundColor(i);
    }

    public final void setBorderColor(int i, float f, float f2) {
        this.mReactBackgroundManager.setBorderColor(i, f, f2);
    }

    public void setBorderRadius(float f) {
        this.mReactBackgroundManager.setBorderRadius(f);
    }

    public final void setBorderRadius(float f, int i) {
        this.mReactBackgroundManager.setBorderRadius(f, i);
    }

    public void setBorderStyle(String str) {
        this.mReactBackgroundManager.setBorderStyle(str);
    }

    public final void setBorderWidth(int i, float f) {
        this.mReactBackgroundManager.setBorderWidth(i, f);
    }

    public void setDecelerationRate(float f) {
        this.mDecelerationRate = f;
        OverScroller overScroller = this.mScroller;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - this.mDecelerationRate);
        }
    }

    public void setEndFillColor(int i) {
        if (i != this.mEndFillColor) {
            this.mEndFillColor = i;
            this.mEndBackground = new ColorDrawable(this.mEndFillColor);
        }
    }

    public void setPagingEnabled(boolean z) {
        this.mPagingEnabled = z;
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z && this.mClippingRect == null) {
            this.mClippingRect = new Rect();
        }
        this.mRemoveClippedSubviews = z;
        updateClippingRect();
    }

    public void setScrollEnabled(boolean z) {
        this.mScrollEnabled = z;
    }

    public void setScrollPerfTag(String str) {
        this.mScrollPerfTag = str;
    }

    public void setSendMomentumEvents(boolean z) {
        this.mSendMomentumEvents = z;
    }

    public void setSnapInterval(int i) {
        this.mSnapInterval = i;
    }

    public void setSnapOffsets(List list) {
        this.mSnapOffsets = list;
    }

    public void setSnapToEnd(boolean z) {
        this.mSnapToEnd = z;
    }

    public void setSnapToStart(boolean z) {
        this.mSnapToStart = z;
    }

    public static void smoothScrollAndSnap(ReactScrollView reactScrollView, int i) {
        int i2 = i;
        ReactScrollView reactScrollView2 = reactScrollView;
        if (reactScrollView2.getChildCount() > 0) {
            int intValue;
            int intValue2;
            int i3;
            int i4;
            int i5;
            int intValue3;
            double floor;
            int maxScrollY = reactScrollView2.getMaxScrollY();
            OverScroller overScroller = new OverScroller(reactScrollView2.getContext());
            overScroller.setFriction(1.0f - reactScrollView2.mDecelerationRate);
            i = ((reactScrollView2.getHeight() - reactScrollView2.getPaddingBottom()) - reactScrollView2.getPaddingTop()) / 2;
            overScroller.fling(reactScrollView2.getScrollX(), reactScrollView2.getScrollY(), 0, i2, 0, 0, 0, maxScrollY, null, i);
            int finalY = overScroller.getFinalY();
            List list = reactScrollView2.mSnapOffsets;
            if (list != null) {
                intValue = ((Integer) list.get(0)).intValue();
                List list2 = reactScrollView2.mSnapOffsets;
                intValue2 = ((Integer) list2.get(list2.size() - 1)).intValue();
                i3 = maxScrollY;
                i4 = 0;
                for (i5 = 0; i5 < reactScrollView2.mSnapOffsets.size(); i5++) {
                    intValue3 = ((Integer) reactScrollView2.mSnapOffsets.get(i5)).intValue();
                    if (intValue3 <= finalY && finalY - intValue3 < finalY - r9) {
                        i4 = intValue3;
                    }
                    if (intValue3 >= finalY && intValue3 - finalY < r4 - finalY) {
                        i3 = intValue3;
                    }
                }
            } else {
                double snapInterval = (double) reactScrollView2.getSnapInterval();
                double d = (double) finalY;
                Double.isNaN(d);
                Double.isNaN(snapInterval);
                d /= snapInterval;
                floor = Math.floor(d);
                Double.isNaN(snapInterval);
                i4 = (int) (floor * snapInterval);
                floor = Math.ceil(d);
                Double.isNaN(snapInterval);
                i3 = (int) (floor * snapInterval);
                intValue2 = maxScrollY;
                intValue = 0;
            }
            intValue3 = finalY - i4;
            int i6 = i3 - finalY;
            i5 = intValue3 < i6 ? i4 : i3;
            if (reactScrollView2.mSnapToEnd || finalY < intValue2) {
                if (reactScrollView2.mSnapToStart || finalY > intValue) {
                    if (i2 > 0) {
                        floor = (double) i6;
                        Double.isNaN(floor);
                        i2 += (int) (floor * 10.0d);
                        finalY = i3;
                    } else if (i2 < 0) {
                        floor = (double) intValue3;
                        Double.isNaN(floor);
                        i2 -= (int) (floor * 10.0d);
                        finalY = i4;
                    } else {
                        finalY = i5;
                    }
                } else if (reactScrollView2.getScrollY() > intValue) {
                    finalY = intValue;
                }
            } else if (reactScrollView2.getScrollY() < intValue2) {
                finalY = intValue2;
            }
            i6 = Math.min(Math.max(0, finalY), maxScrollY);
            overScroller = reactScrollView2.mScroller;
            if (overScroller != null) {
                reactScrollView2.mActivelyScrolling = true;
                finalY = reactScrollView2.getScrollX();
                i5 = reactScrollView2.getScrollY();
                if (i2 == 0) {
                    i2 = i6 - reactScrollView2.getScrollY();
                }
                if (i6 != 0) {
                    if (i6 != maxScrollY) {
                        i = 0;
                    }
                }
                overScroller.fling(finalY, i5, 0, i2, 0, 0, i6, i6, null, i);
                reactScrollView2.postInvalidateOnAnimation();
                return;
            }
            reactScrollView2.smoothScrollTo(reactScrollView2.getScrollX(), i6);
        }
    }

    public final void updateClippingRect() {
        if (this.mRemoveClippedSubviews) {
            AnonymousClass0LR.D(this.mClippingRect);
            ReactClippingViewGroupHelper.calculateClippingRect(this, this.mClippingRect);
            View childAt = getChildAt(0);
            if (childAt instanceof ReactClippingViewGroup) {
                ((ReactClippingViewGroup) childAt).updateClippingRect();
            }
        }
    }
}
