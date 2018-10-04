package com.facebook.react.views.scroll;

import X.AnonymousClass0LR;
import X.AnonymousClass0cQ;
import X.AnonymousClass0mE;
import X.AnonymousClass1mQ;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import com.facebook.react.uimanager.MeasureSpecAssertions;
import com.facebook.react.uimanager.ReactClippingViewGroup;
import com.facebook.react.uimanager.ReactClippingViewGroupHelper;
import com.facebook.react.uimanager.events.NativeGestureUtil;
import com.facebook.react.views.view.ReactViewBackgroundManager;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Locale;

public final class ReactHorizontalScrollView extends HorizontalScrollView implements ReactClippingViewGroup {
    private static Field sScrollerField;
    private static boolean sTriedToGetScrollerField;
    public boolean mActivelyScrolling;
    private Rect mClippingRect;
    private float mDecelerationRate = 0.985f;
    private boolean mDragging;
    private Drawable mEndBackground;
    private int mEndFillColor = 0;
    private FpsListener mFpsListener = null;
    private final OnScrollDispatchHelper mOnScrollDispatchHelper = new OnScrollDispatchHelper();
    public boolean mPagingEnabled = false;
    private Runnable mPostTouchRunnable;
    private ReactViewBackgroundManager mReactBackgroundManager = new ReactViewBackgroundManager(this);
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

    /* renamed from: com.facebook.react.views.scroll.ReactHorizontalScrollView$1 */
    public final class C01941 implements Runnable {
        private boolean mSnappingToPage = false;

        public final void run() {
            if (ReactHorizontalScrollView.this.mActivelyScrolling) {
                ReactHorizontalScrollView.this.mActivelyScrolling = false;
                AnonymousClass0mE.L(ReactHorizontalScrollView.this, this, 20);
            } else if (!ReactHorizontalScrollView.this.mPagingEnabled || this.mSnappingToPage) {
                if (ReactHorizontalScrollView.this.mSendMomentumEvents) {
                    ReactScrollViewHelper.emitScrollMomentumEndEvent(ReactHorizontalScrollView.this);
                }
                ReactHorizontalScrollView.this.mPostTouchRunnable = null;
                ReactHorizontalScrollView.disableFpsListener(ReactHorizontalScrollView.this);
            } else {
                this.mSnappingToPage = true;
                ReactHorizontalScrollView.smoothScrollAndSnap(ReactHorizontalScrollView.this, 0);
                AnonymousClass0mE.L(ReactHorizontalScrollView.this, this, 20);
            }
        }
    }

    public ReactHorizontalScrollView(Context context, FpsListener fpsListener) {
        super(context);
        this.mFpsListener = fpsListener;
        this.mScroller = getOverScrollerFromParent();
    }

    public static void disableFpsListener(ReactHorizontalScrollView reactHorizontalScrollView) {
        if (reactHorizontalScrollView.isScrollPerfLoggingEnabled()) {
            AnonymousClass0LR.D(reactHorizontalScrollView.mFpsListener);
            AnonymousClass0LR.D(reactHorizontalScrollView.mScrollPerfTag);
            reactHorizontalScrollView.mFpsListener.disable(reactHorizontalScrollView.mScrollPerfTag);
        }
    }

    public final void draw(Canvas canvas) {
        if (this.mEndFillColor != 0) {
            View childAt = getChildAt(0);
            if (!(this.mEndBackground == null || childAt == null || childAt.getRight() >= getWidth())) {
                this.mEndBackground.setBounds(childAt.getRight(), 0, getWidth(), getHeight());
                this.mEndBackground.draw(canvas);
            }
        }
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
            this.mScroller.fling(getScrollX(), getScrollY(), i2, 0, 0, Integer.MAX_VALUE, 0, 0, ((getWidth() - getPaddingStart()) - getPaddingEnd()) / 2, 0);
            AnonymousClass0mE.J(this);
        } else {
            super.fling(i);
        }
        handlePostTouchScrolling(i, 0);
    }

    public final void getClippingRect(Rect rect) {
        rect.set((Rect) AnonymousClass0LR.D(this.mClippingRect));
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
        r1 = android.widget.HorizontalScrollView.class;	 Catch:{ NoSuchFieldException -> 0x0017 }
        r0 = "mScroller";	 Catch:{ NoSuchFieldException -> 0x0017 }
        r0 = r1.getDeclaredField(r0);	 Catch:{ NoSuchFieldException -> 0x0017 }
        sScrollerField = r0;	 Catch:{ NoSuchFieldException -> 0x0017 }
        r0 = sScrollerField;	 Catch:{ NoSuchFieldException -> 0x0017 }
        r0.setAccessible(r2);	 Catch:{ NoSuchFieldException -> 0x0017 }
        goto L_0x001e;	 Catch:{ NoSuchFieldException -> 0x0017 }
    L_0x0017:
        r1 = "ReactNative";
        r0 = "Failed to get mScroller field for HorizontalScrollView! This app will exhibit the bounce-back scrolling bug :(";
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
        r0 = "Failed to cast mScroller field in HorizontalScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(";	 Catch:{ IllegalAccessException -> 0x0037 }
        android.util.Log.w(r1, r0);	 Catch:{ IllegalAccessException -> 0x0037 }
        goto L_0x0040;	 Catch:{ IllegalAccessException -> 0x0037 }
    L_0x0037:
        r2 = move-exception;
        r1 = new java.lang.RuntimeException;
        r0 = "Failed to get mScroller from HorizontalScrollView!";
        r1.<init>(r0, r2);
        throw r1;
    L_0x0040:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.scroll.ReactHorizontalScrollView.getOverScrollerFromParent():android.widget.OverScroller");
    }

    public boolean getRemoveClippedSubviews() {
        return this.mRemoveClippedSubviews;
    }

    private int getSnapInterval() {
        int i = this.mSnapInterval;
        if (i != 0) {
            return i;
        }
        return getWidth();
    }

    private void handlePostTouchScrolling(int i, int i2) {
        if (this.mSendMomentumEvents || this.mPagingEnabled || isScrollPerfLoggingEnabled()) {
            if (this.mPostTouchRunnable == null) {
                if (this.mSendMomentumEvents) {
                    ReactScrollViewHelper.emitScrollMomentumBeginEvent(this, i, i2);
                }
                this.mActivelyScrolling = false;
                Runnable c01941 = new C01941();
                this.mPostTouchRunnable = c01941;
                AnonymousClass0mE.L(this, c01941, 20);
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
        int N = AnonymousClass0cQ.N(this, -818833530);
        super.onAttachedToWindow();
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
        AnonymousClass0cQ.O(this, -1295617610, N);
    }

    public final void onDraw(Canvas canvas) {
        getDrawingRect(this.mRect);
        canvas.clipRect(this.mRect);
        super.onDraw(canvas);
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

    public final void onMeasure(int i, int i2) {
        MeasureSpecAssertions.assertExplicitMeasureSpec(i, i2);
        setMeasuredDimension(MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
    }

    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        OverScroller overScroller = this.mScroller;
        if (!(overScroller == null || overScroller.isFinished() || this.mScroller.getCurrX() == this.mScroller.getFinalX())) {
            int computeHorizontalScrollRange = computeHorizontalScrollRange() - getWidth();
            if (i >= computeHorizontalScrollRange) {
                this.mScroller.abortAnimation();
                i = computeHorizontalScrollRange;
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
        int N = AnonymousClass0cQ.N(this, 40050644);
        super.onSizeChanged(i, i2, i3, i4);
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
        AnonymousClass0cQ.O(this, -2071627398, N);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.M(this, -1057741643);
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
            AnonymousClass0cQ.L(this, 380229871, M);
            return onTouchEvent;
        }
        AnonymousClass0cQ.L(this, 1008481836, M);
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

    public static void smoothScrollAndSnap(ReactHorizontalScrollView reactHorizontalScrollView, int i) {
        int i2 = i;
        ReactHorizontalScrollView reactHorizontalScrollView2 = reactHorizontalScrollView;
        if (reactHorizontalScrollView2.getChildCount() > 0) {
            int intValue;
            int intValue2;
            int i3;
            int i4;
            int i5;
            int intValue3;
            double floor;
            int max = Math.max(0, reactHorizontalScrollView2.computeHorizontalScrollRange() - reactHorizontalScrollView2.getWidth());
            OverScroller overScroller = new OverScroller(reactHorizontalScrollView2.getContext());
            overScroller.setFriction(1.0f - reactHorizontalScrollView2.mDecelerationRate);
            reactHorizontalScrollView = ((reactHorizontalScrollView2.getWidth() - reactHorizontalScrollView2.getPaddingStart()) - reactHorizontalScrollView2.getPaddingEnd()) / 2;
            overScroller.fling(reactHorizontalScrollView2.getScrollX(), reactHorizontalScrollView2.getScrollY(), i2, 0, 0, max, 0, 0, reactHorizontalScrollView, 0);
            int finalX = overScroller.getFinalX();
            Object obj = AnonymousClass1mQ.B(Locale.getDefault()) == 1 ? 1 : null;
            if (obj != null) {
                finalX = max - finalX;
                i2 = -i2;
            }
            List list = reactHorizontalScrollView2.mSnapOffsets;
            if (list != null) {
                intValue = ((Integer) list.get(0)).intValue();
                List list2 = reactHorizontalScrollView2.mSnapOffsets;
                intValue2 = ((Integer) list2.get(list2.size() - 1)).intValue();
                i3 = max;
                i4 = 0;
                for (i5 = 0; i5 < reactHorizontalScrollView2.mSnapOffsets.size(); i5++) {
                    intValue3 = ((Integer) reactHorizontalScrollView2.mSnapOffsets.get(i5)).intValue();
                    if (intValue3 <= finalX && finalX - intValue3 < finalX - r8) {
                        i4 = intValue3;
                    }
                    if (intValue3 >= finalX && intValue3 - finalX < r4 - finalX) {
                        i3 = intValue3;
                    }
                }
            } else {
                double snapInterval = (double) reactHorizontalScrollView2.getSnapInterval();
                double d = (double) finalX;
                Double.isNaN(d);
                Double.isNaN(snapInterval);
                d /= snapInterval;
                floor = Math.floor(d);
                Double.isNaN(snapInterval);
                i4 = (int) (floor * snapInterval);
                floor = Math.ceil(d);
                Double.isNaN(snapInterval);
                i3 = (int) (floor * snapInterval);
                intValue2 = max;
                intValue = 0;
            }
            i5 = finalX - i4;
            intValue3 = i3 - finalX;
            int i6 = i5 < intValue3 ? i4 : i3;
            int scrollX = reactHorizontalScrollView2.getScrollX();
            if (obj != null) {
                scrollX = max - scrollX;
            }
            if (reactHorizontalScrollView2.mSnapToEnd || finalX < intValue2) {
                if (reactHorizontalScrollView2.mSnapToStart || finalX > intValue) {
                    if (i2 > 0) {
                        floor = (double) intValue3;
                        Double.isNaN(floor);
                        i2 += (int) (floor * 10.0d);
                        finalX = i3;
                    } else if (i2 < 0) {
                        floor = (double) i5;
                        Double.isNaN(floor);
                        i2 -= (int) (floor * 10.0d);
                        finalX = i4;
                    } else {
                        finalX = i6;
                    }
                } else if (scrollX > intValue) {
                    finalX = intValue;
                }
            } else if (scrollX < intValue2) {
                finalX = intValue2;
            }
            int min = Math.min(Math.max(0, finalX), max);
            if (obj != null) {
                min = max - min;
                i2 = -i2;
            }
            overScroller = reactHorizontalScrollView2.mScroller;
            if (overScroller != null) {
                reactHorizontalScrollView2.mActivelyScrolling = true;
                i5 = reactHorizontalScrollView2.getScrollX();
                int scrollY = reactHorizontalScrollView2.getScrollY();
                if (i2 == 0) {
                    i2 = min - reactHorizontalScrollView2.getScrollX();
                }
                if (min != 0) {
                    if (min != max) {
                        reactHorizontalScrollView = null;
                    }
                }
                overScroller.fling(i5, scrollY, i2, 0, min, min, 0, 0, reactHorizontalScrollView, 0);
                reactHorizontalScrollView2.postInvalidateOnAnimation();
                return;
            }
            reactHorizontalScrollView2.smoothScrollTo(min, reactHorizontalScrollView2.getScrollY());
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
