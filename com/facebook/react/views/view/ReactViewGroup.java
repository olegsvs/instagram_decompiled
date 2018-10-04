package com.facebook.react.views.view;

import X.AnonymousClass0LR;
import X.AnonymousClass0cQ;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.touch.OnInterceptTouchEventListener;
import com.facebook.react.touch.ReactHitSlopView;
import com.facebook.react.touch.ReactInterceptingViewGroup;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.MeasureSpecAssertions;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactClippingViewGroup;
import com.facebook.react.uimanager.ReactClippingViewGroupHelper;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.uimanager.ReactZIndexedViewGroup;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.RootViewUtil;
import com.facebook.react.uimanager.ViewGroupDrawingOrderHelper;
import com.facebook.react.uimanager.ViewProps;

public class ReactViewGroup extends ViewGroup implements ReactClippingViewGroup, ReactHitSlopView, ReactZIndexedViewGroup, ReactInterceptingViewGroup, ReactPointerEventsView {
    private static final LayoutParams sDefaultLayoutParam = new LayoutParams(0, 0);
    private static final Rect sHelperRect = new Rect();
    private View[] mAllChildren = null;
    private int mAllChildrenCount;
    private float mBackfaceOpacity = 1.0f;
    private String mBackfaceVisibility = "visible";
    private ChildrenLayoutChangeListener mChildrenLayoutChangeListener;
    private Rect mClippingRect;
    private final ViewGroupDrawingOrderHelper mDrawingOrderHelper;
    private Rect mHitSlopRect;
    private int mLayoutDirection;
    private boolean mNeedsOffscreenAlphaCompositing = false;
    private OnInterceptTouchEventListener mOnInterceptTouchEventListener;
    private String mOverflow;
    private Path mPath;
    private PointerEvents mPointerEvents = PointerEvents.AUTO;
    private ReactViewBackgroundDrawable mReactBackgroundDrawable;
    private boolean mRemoveClippedSubviews = false;

    public final class ChildrenLayoutChangeListener implements OnLayoutChangeListener {
        private final ReactViewGroup mParent;

        public ChildrenLayoutChangeListener(ReactViewGroup reactViewGroup) {
            this.mParent = reactViewGroup;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.mParent.getRemoveClippedSubviews()) {
                ReactViewGroup.updateSubviewClipStatus(this.mParent, view);
            }
        }
    }

    public final void dispatchSetPressed(boolean z) {
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void requestLayout() {
    }

    public ReactViewGroup(Context context) {
        super(context);
        if (!ViewProps.sDefaultOverflowHidden) {
            setClipChildren(false);
        }
        this.mDrawingOrderHelper = new ViewGroupDrawingOrderHelper(this);
    }

    private void addInArray(View view, int i) {
        View[] viewArr = (View[]) AnonymousClass0LR.D(this.mAllChildren);
        int i2 = this.mAllChildrenCount;
        int length = viewArr.length;
        Object obj;
        if (i == i2) {
            if (length == i2) {
                obj = new View[(length + 12)];
                this.mAllChildren = obj;
                System.arraycopy(viewArr, 0, obj, 0, length);
                viewArr = this.mAllChildren;
            }
            int i3 = this.mAllChildrenCount;
            this.mAllChildrenCount = i3 + 1;
            viewArr[i3] = view;
        } else if (i < i2) {
            if (length == i2) {
                obj = new View[(length + 12)];
                this.mAllChildren = obj;
                System.arraycopy(viewArr, 0, obj, 0, i);
                System.arraycopy(viewArr, i, this.mAllChildren, i + 1, i2 - i);
                viewArr = this.mAllChildren;
            } else {
                System.arraycopy(viewArr, i, viewArr, i + 1, i2 - i);
            }
            viewArr[i] = view;
            this.mAllChildrenCount++;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("index=");
            stringBuilder.append(i);
            stringBuilder.append(" count=");
            stringBuilder.append(i2);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
    }

    public final void addView(View view, int i, LayoutParams layoutParams) {
        this.mDrawingOrderHelper.handleAddView(view);
        setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.shouldEnableCustomDrawingOrder());
        super.addView(view, i, layoutParams);
    }

    public final void addViewWithSubviewClippingEnabled(View view, int i) {
        addViewWithSubviewClippingEnabled(view, i, sDefaultLayoutParam);
    }

    public final void addViewWithSubviewClippingEnabled(View view, int i, LayoutParams layoutParams) {
        AnonymousClass0LR.B(this.mRemoveClippedSubviews);
        AnonymousClass0LR.D(this.mClippingRect);
        AnonymousClass0LR.D(this.mAllChildren);
        addInArray(view, i);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (this.mAllChildren[i3].getParent() == null) {
                i2++;
            }
        }
        updateSubviewClipStatus(this.mClippingRect, i, i2);
        view.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
    }

    public final void dispatchDraw(Canvas canvas) {
        try {
            dispatchOverflowDraw(canvas);
            super.dispatchDraw(canvas);
        } catch (Throwable e) {
            RootView rootView = RootViewUtil.getRootView(this);
            if (rootView != null) {
                rootView.handleException(e);
            } else if (getContext() instanceof ReactContext) {
                ((ReactContext) getContext()).handleException(new IllegalViewOperationException("StackOverflowException", this, e));
            } else {
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void dispatchOverflowDraw(android.graphics.Canvas r18) {
        /*
        r17 = this;
        r10 = r17;
        r4 = r10.mOverflow;
        if (r4 == 0) goto L_0x01da;
    L_0x0006:
        r2 = -1;
        r1 = r4.hashCode();
        r0 = -1217487446; // 0xffffffffb76e9daa float:-1.42226145E-5 double:NaN;
        r3 = 1;
        if (r1 == r0) goto L_0x0021;
    L_0x0011:
        r0 = 466743410; // 0x1bd1f072 float:3.4731534E-22 double:2.306018843E-315;
        if (r1 == r0) goto L_0x0017;
    L_0x0016:
        goto L_0x002a;
    L_0x0017:
        r0 = "visible";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x002a;
    L_0x001f:
        r2 = 0;
        goto L_0x002a;
    L_0x0021:
        r0 = "hidden";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x002a;
    L_0x0029:
        r2 = 1;
    L_0x002a:
        switch(r2) {
            case 0: goto L_0x01d3;
            case 1: goto L_0x002f;
            default: goto L_0x002d;
        };
    L_0x002d:
        goto L_0x01da;
    L_0x002f:
        r0 = r10.getWidth();
        r7 = (float) r0;
        r0 = r10.getHeight();
        r6 = (float) r0;
        r0 = r10.mReactBackgroundDrawable;
        r11 = 0;
        r8 = r18;
        if (r0 == 0) goto L_0x01c4;
    L_0x0040:
        r13 = r0.getDirectionAwareBorderInsets();
        r0 = r13.top;
        r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1));
        if (r0 > 0) goto L_0x0060;
    L_0x004a:
        r0 = r13.left;
        r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1));
        if (r0 > 0) goto L_0x0060;
    L_0x0050:
        r0 = r13.bottom;
        r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1));
        if (r0 > 0) goto L_0x0060;
    L_0x0056:
        r0 = r13.right;
        r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1));
        if (r0 <= 0) goto L_0x005d;
    L_0x005c:
        goto L_0x0060;
    L_0x005d:
        r5 = 0;
        r4 = 0;
        goto L_0x006c;
    L_0x0060:
        r5 = r13.left;
        r5 = r5 + r11;
        r4 = r13.top;
        r4 = r4 + r11;
        r0 = r13.right;
        r7 = r7 - r0;
        r0 = r13.bottom;
        r6 = r6 - r0;
    L_0x006c:
        r0 = r10.mReactBackgroundDrawable;
        r9 = r0.getFullBorderRadius();
        r1 = r10.mReactBackgroundDrawable;
        r0 = com.facebook.react.views.view.ReactViewBackgroundDrawable.BorderRadiusLocation.TOP_LEFT;
        r1 = r1.getBorderRadiusOrDefaultTo(r9, r0);
        r2 = r10.mReactBackgroundDrawable;
        r0 = com.facebook.react.views.view.ReactViewBackgroundDrawable.BorderRadiusLocation.TOP_RIGHT;
        r15 = r2.getBorderRadiusOrDefaultTo(r9, r0);
        r2 = r10.mReactBackgroundDrawable;
        r0 = com.facebook.react.views.view.ReactViewBackgroundDrawable.BorderRadiusLocation.BOTTOM_LEFT;
        r12 = r2.getBorderRadiusOrDefaultTo(r9, r0);
        r2 = r10.mReactBackgroundDrawable;
        r0 = com.facebook.react.views.view.ReactViewBackgroundDrawable.BorderRadiusLocation.BOTTOM_RIGHT;
        r14 = r2.getBorderRadiusOrDefaultTo(r9, r0);
        r2 = android.os.Build.VERSION.SDK_INT;
        r0 = 17;
        if (r2 < r0) goto L_0x0138;
    L_0x0098:
        r0 = r10.mLayoutDirection;
        if (r0 != r3) goto L_0x009f;
    L_0x009c:
        r17 = 1;
        goto L_0x00a1;
    L_0x009f:
        r17 = 0;
    L_0x00a1:
        r2 = r10.mReactBackgroundDrawable;
        r0 = com.facebook.react.views.view.ReactViewBackgroundDrawable.BorderRadiusLocation.TOP_START;
        r16 = r2.getBorderRadius(r0);
        r2 = r10.mReactBackgroundDrawable;
        r0 = com.facebook.react.views.view.ReactViewBackgroundDrawable.BorderRadiusLocation.TOP_END;
        r11 = r2.getBorderRadius(r0);
        r2 = r10.mReactBackgroundDrawable;
        r0 = com.facebook.react.views.view.ReactViewBackgroundDrawable.BorderRadiusLocation.BOTTOM_START;
        r9 = r2.getBorderRadius(r0);
        r2 = r10.mReactBackgroundDrawable;
        r0 = com.facebook.react.views.view.ReactViewBackgroundDrawable.BorderRadiusLocation.BOTTOM_END;
        r3 = r2.getBorderRadius(r0);
        r2 = com.facebook.react.modules.i18nmanager.I18nUtil.getInstance();
        r18 = r1;
        r0 = r10.getContext();
        r0 = r2.doLeftAndRightSwapInRTL(r0);
        if (r0 == 0) goto L_0x0107;
    L_0x00d1:
        r0 = X.AnonymousClass2q2.B(r16);
        if (r0 == 0) goto L_0x00d8;
    L_0x00d7:
        goto L_0x00da;
    L_0x00d8:
        r18 = r16;
    L_0x00da:
        r0 = X.AnonymousClass2q2.B(r11);
        if (r0 == 0) goto L_0x00e1;
    L_0x00e0:
        r11 = r15;
    L_0x00e1:
        r0 = X.AnonymousClass2q2.B(r9);
        if (r0 == 0) goto L_0x00e8;
    L_0x00e7:
        r9 = r12;
    L_0x00e8:
        r0 = X.AnonymousClass2q2.B(r3);
        if (r0 == 0) goto L_0x00ef;
    L_0x00ee:
        goto L_0x00f0;
    L_0x00ef:
        r14 = r3;
    L_0x00f0:
        if (r17 == 0) goto L_0x00f4;
    L_0x00f2:
        r1 = r11;
        goto L_0x00f6;
    L_0x00f4:
        r1 = r18;
    L_0x00f6:
        if (r17 == 0) goto L_0x00fb;
    L_0x00f8:
        r15 = r18;
        goto L_0x00fc;
    L_0x00fb:
        r15 = r11;
    L_0x00fc:
        if (r17 == 0) goto L_0x0100;
    L_0x00fe:
        r12 = r14;
        goto L_0x0101;
    L_0x0100:
        r12 = r9;
    L_0x0101:
        if (r17 == 0) goto L_0x0105;
    L_0x0103:
        r3 = r9;
        goto L_0x0136;
    L_0x0105:
        r3 = r14;
        goto L_0x0136;
    L_0x0107:
        if (r17 == 0) goto L_0x010b;
    L_0x0109:
        r1 = r11;
        goto L_0x010d;
    L_0x010b:
        r1 = r16;
    L_0x010d:
        if (r17 == 0) goto L_0x0111;
    L_0x010f:
        r11 = r16;
    L_0x0111:
        if (r17 == 0) goto L_0x0115;
    L_0x0113:
        r2 = r3;
        goto L_0x0116;
    L_0x0115:
        r2 = r9;
    L_0x0116:
        if (r17 == 0) goto L_0x0119;
    L_0x0118:
        r3 = r9;
    L_0x0119:
        r0 = X.AnonymousClass2q2.B(r1);
        if (r0 != 0) goto L_0x0120;
    L_0x011f:
        goto L_0x0122;
    L_0x0120:
        r1 = r18;
    L_0x0122:
        r0 = X.AnonymousClass2q2.B(r11);
        if (r0 != 0) goto L_0x0129;
    L_0x0128:
        r15 = r11;
    L_0x0129:
        r0 = X.AnonymousClass2q2.B(r2);
        if (r0 != 0) goto L_0x0130;
    L_0x012f:
        r12 = r2;
    L_0x0130:
        r0 = X.AnonymousClass2q2.B(r3);
        if (r0 != 0) goto L_0x0137;
    L_0x0136:
        r14 = r3;
    L_0x0137:
        r11 = 0;
    L_0x0138:
        r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1));
        if (r0 > 0) goto L_0x0148;
    L_0x013c:
        r0 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1));
        if (r0 > 0) goto L_0x0148;
    L_0x0140:
        r0 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1));
        if (r0 > 0) goto L_0x0148;
    L_0x0144:
        r0 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1));
        if (r0 <= 0) goto L_0x01c6;
    L_0x0148:
        r0 = r10.mPath;
        if (r0 != 0) goto L_0x0153;
    L_0x014c:
        r0 = new android.graphics.Path;
        r0.<init>();
        r10.mPath = r0;
    L_0x0153:
        r0 = r10.mPath;
        r0.rewind();
        r9 = r10.mPath;
        r3 = new android.graphics.RectF;
        r3.<init>(r5, r4, r7, r6);
        r0 = 8;
        r2 = new float[r0];
        r0 = r13.left;
        r0 = r1 - r0;
        r11 = 0;
        r16 = java.lang.Math.max(r0, r11);
        r0 = 0;
        r2[r0] = r16;
        r0 = r13.top;
        r1 = r1 - r0;
        r0 = java.lang.Math.max(r1, r11);
        r16 = 1;
        r2[r16] = r0;
        r1 = 2;
        r0 = r13.right;
        r0 = r15 - r0;
        r0 = java.lang.Math.max(r0, r11);
        r2[r1] = r0;
        r1 = 3;
        r0 = r13.top;
        r15 = r15 - r0;
        r0 = java.lang.Math.max(r15, r11);
        r2[r1] = r0;
        r1 = 4;
        r0 = r13.right;
        r0 = r14 - r0;
        r0 = java.lang.Math.max(r0, r11);
        r2[r1] = r0;
        r1 = 5;
        r0 = r13.bottom;
        r14 = r14 - r0;
        r0 = java.lang.Math.max(r14, r11);
        r2[r1] = r0;
        r1 = 6;
        r0 = r13.left;
        r0 = r12 - r0;
        r0 = java.lang.Math.max(r0, r11);
        r2[r1] = r0;
        r1 = 7;
        r0 = r13.bottom;
        r12 = r12 - r0;
        r0 = java.lang.Math.max(r12, r11);
        r2[r1] = r0;
        r0 = android.graphics.Path.Direction.CW;
        r9.addRoundRect(r3, r2, r0);
        r0 = r10.mPath;
        r8.clipPath(r0);
        goto L_0x01c8;
    L_0x01c4:
        r5 = 0;
        r4 = 0;
    L_0x01c6:
        r16 = 0;
    L_0x01c8:
        if (r16 != 0) goto L_0x01da;
    L_0x01ca:
        r0 = new android.graphics.RectF;
        r0.<init>(r5, r4, r7, r6);
        r8.clipRect(r0);
        goto L_0x01da;
    L_0x01d3:
        r0 = r10.mPath;
        if (r0 == 0) goto L_0x01da;
    L_0x01d7:
        r0.rewind();
    L_0x01da:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.ReactViewGroup.dispatchOverflowDraw(android.graphics.Canvas):void");
    }

    public int getAllChildrenCount() {
        return this.mAllChildrenCount;
    }

    public int getBackgroundColor() {
        return getBackground() != null ? ((ReactViewBackgroundDrawable) getBackground()).getColor() : 0;
    }

    public final View getChildAtWithSubviewClippingEnabled(int i) {
        return ((View[]) AnonymousClass0LR.D(this.mAllChildren))[i];
    }

    public final int getChildDrawingOrder(int i, int i2) {
        return this.mDrawingOrderHelper.getChildDrawingOrder(i, i2);
    }

    public final void getClippingRect(Rect rect) {
        rect.set(this.mClippingRect);
    }

    public Rect getHitSlopRect() {
        return this.mHitSlopRect;
    }

    private ReactViewBackgroundDrawable getOrCreateReactViewBackground() {
        if (this.mReactBackgroundDrawable == null) {
            this.mReactBackgroundDrawable = new ReactViewBackgroundDrawable(getContext());
            Drawable background = getBackground();
            updateBackgroundDrawable(null);
            if (background == null) {
                updateBackgroundDrawable(this.mReactBackgroundDrawable);
            } else {
                updateBackgroundDrawable(new LayerDrawable(new Drawable[]{this.mReactBackgroundDrawable, background}));
            }
            if (VERSION.SDK_INT >= 17) {
                this.mLayoutDirection = I18nUtil.getInstance().isRTL(getContext());
                this.mReactBackgroundDrawable.setResolvedLayoutDirection(this.mLayoutDirection);
            }
        }
        return this.mReactBackgroundDrawable;
    }

    public PointerEvents getPointerEvents() {
        return this.mPointerEvents;
    }

    public boolean getRemoveClippedSubviews() {
        return this.mRemoveClippedSubviews;
    }

    public final int getZIndexMappedChildIndex(int i) {
        return this.mDrawingOrderHelper.shouldEnableCustomDrawingOrder() ? this.mDrawingOrderHelper.getChildDrawingOrder(getChildCount(), i) : i;
    }

    public final boolean hasOverlappingRendering() {
        return this.mNeedsOffscreenAlphaCompositing;
    }

    private int indexOfChildInAllChildren(View view) {
        int i = this.mAllChildrenCount;
        View[] viewArr = (View[]) AnonymousClass0LR.D(this.mAllChildren);
        for (int i2 = 0; i2 < i; i2++) {
            if (viewArr[i2] == view) {
                return i2;
            }
        }
        return -1;
    }

    public void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, -1104786157);
        super.onAttachedToWindow();
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
        AnonymousClass0cQ.O(this, -1784533721, N);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        OnInterceptTouchEventListener onInterceptTouchEventListener = this.mOnInterceptTouchEventListener;
        if ((onInterceptTouchEventListener == null || !onInterceptTouchEventListener.onInterceptTouchEvent(this, motionEvent)) && this.mPointerEvents != PointerEvents.NONE) {
            if (this.mPointerEvents != PointerEvents.BOX_ONLY) {
                return super.onInterceptTouchEvent(motionEvent);
            }
        }
        return true;
    }

    public final void onMeasure(int i, int i2) {
        MeasureSpecAssertions.assertExplicitMeasureSpec(i, i2);
        setMeasuredDimension(MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
    }

    public final void onRtlPropertiesChanged(int i) {
        if (VERSION.SDK_INT >= 17) {
            ReactViewBackgroundDrawable reactViewBackgroundDrawable = this.mReactBackgroundDrawable;
            if (reactViewBackgroundDrawable != null) {
                reactViewBackgroundDrawable.setResolvedLayoutDirection(this.mLayoutDirection);
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, 234321197);
        super.onSizeChanged(i, i2, i3, i4);
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
        AnonymousClass0cQ.O(this, 1874857776, N);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.M(this, 1297029251);
        if (this.mPointerEvents != PointerEvents.NONE) {
            if (this.mPointerEvents != PointerEvents.BOX_NONE) {
                AnonymousClass0cQ.L(this, 400799890, M);
                return true;
            }
        }
        AnonymousClass0cQ.L(this, -1702743922, M);
        return false;
    }

    public final void removeAllViewsWithSubviewClippingEnabled() {
        AnonymousClass0LR.B(this.mRemoveClippedSubviews);
        AnonymousClass0LR.D(this.mAllChildren);
        for (int i = 0; i < this.mAllChildrenCount; i++) {
            this.mAllChildren[i].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        }
        removeAllViewsInLayout();
        this.mAllChildrenCount = 0;
    }

    private void removeFromArray(int i) {
        View[] viewArr = (View[]) AnonymousClass0LR.D(this.mAllChildren);
        int i2 = this.mAllChildrenCount;
        int i3;
        if (i == i2 - 1) {
            i3 = i2 - 1;
            this.mAllChildrenCount = i3;
            viewArr[i3] = null;
        } else if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        } else {
            System.arraycopy(viewArr, i + 1, viewArr, i, (i2 - i) - 1);
            i3 = this.mAllChildrenCount - 1;
            this.mAllChildrenCount = i3;
            viewArr[i3] = null;
        }
    }

    public final void removeView(View view) {
        this.mDrawingOrderHelper.handleRemoveView(view);
        setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.shouldEnableCustomDrawingOrder());
        super.removeView(view);
    }

    public final void removeViewAt(int i) {
        this.mDrawingOrderHelper.handleRemoveView(getChildAt(i));
        setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.shouldEnableCustomDrawingOrder());
        super.removeViewAt(i);
    }

    public final void removeViewWithSubviewClippingEnabled(View view) {
        AnonymousClass0LR.B(this.mRemoveClippedSubviews);
        AnonymousClass0LR.D(this.mClippingRect);
        AnonymousClass0LR.D(this.mAllChildren);
        view.removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        int indexOfChildInAllChildren = indexOfChildInAllChildren(view);
        if (this.mAllChildren[indexOfChildInAllChildren].getParent() != null) {
            int i = 0;
            for (int i2 = 0; i2 < indexOfChildInAllChildren; i2++) {
                if (this.mAllChildren[i2].getParent() == null) {
                    i++;
                }
            }
            super.removeViewsInLayout(indexOfChildInAllChildren - i, 1);
        }
        removeFromArray(indexOfChildInAllChildren);
    }

    public void setBackfaceVisibility(String str) {
        this.mBackfaceVisibility = str;
        setBackfaceVisibilityDependantOpacity();
    }

    public final void setBackfaceVisibilityDependantOpacity() {
        if (!this.mBackfaceVisibility.equals("visible")) {
            float rotationX = getRotationX();
            float rotationY = getRotationY();
            Object obj = (rotationX < -90.0f || rotationX >= 90.0f || rotationY < -90.0f || rotationY >= 90.0f) ? null : 1;
            if (obj == null) {
                setAlpha(0.0f);
                return;
            }
        }
        setAlpha(this.mBackfaceOpacity);
    }

    public void setBackground(Drawable drawable) {
        throw new UnsupportedOperationException("This method is not supported for ReactViewGroup instances");
    }

    public void setBackgroundColor(int i) {
        if (i != 0 || this.mReactBackgroundDrawable != null) {
            getOrCreateReactViewBackground().setColor(i);
        }
    }

    public final void setBorderColor(int i, float f, float f2) {
        getOrCreateReactViewBackground().setBorderColor(i, f, f2);
    }

    public void setBorderRadius(float f) {
        ReactViewBackgroundDrawable orCreateReactViewBackground = getOrCreateReactViewBackground();
        orCreateReactViewBackground.setRadius(f);
        int i = VERSION.SDK_INT;
        if (11 < i && i < 18) {
            i = orCreateReactViewBackground.hasRoundedBorders() ? 1 : 2;
            if (i != getLayerType()) {
                setLayerType(i, null);
            }
        }
    }

    public final void setBorderRadius(float f, int i) {
        ReactViewBackgroundDrawable orCreateReactViewBackground = getOrCreateReactViewBackground();
        orCreateReactViewBackground.setRadius(f, i);
        int i2 = VERSION.SDK_INT;
        if (11 < i2 && i2 < 18) {
            i2 = orCreateReactViewBackground.hasRoundedBorders() ? 1 : 2;
            if (i2 != getLayerType()) {
                setLayerType(i2, null);
            }
        }
    }

    public void setBorderStyle(String str) {
        getOrCreateReactViewBackground().setBorderStyle(str);
    }

    public final void setBorderWidth(int i, float f) {
        getOrCreateReactViewBackground().setBorderWidth(i, f);
    }

    public void setHitSlopRect(Rect rect) {
        this.mHitSlopRect = rect;
    }

    public void setNeedsOffscreenAlphaCompositing(boolean z) {
        this.mNeedsOffscreenAlphaCompositing = z;
    }

    public void setOnInterceptTouchEventListener(OnInterceptTouchEventListener onInterceptTouchEventListener) {
        this.mOnInterceptTouchEventListener = onInterceptTouchEventListener;
    }

    public void setOpacityIfPossible(float f) {
        this.mBackfaceOpacity = f;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setOverflow(String str) {
        this.mOverflow = str;
        invalidate();
    }

    public void setPointerEvents(PointerEvents pointerEvents) {
        this.mPointerEvents = pointerEvents;
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z != this.mRemoveClippedSubviews) {
            this.mRemoveClippedSubviews = z;
            int i = 0;
            if (z) {
                Rect rect = new Rect();
                this.mClippingRect = rect;
                ReactClippingViewGroupHelper.calculateClippingRect(this, rect);
                this.mAllChildrenCount = getChildCount();
                this.mAllChildren = new View[Math.max(12, this.mAllChildrenCount)];
                this.mChildrenLayoutChangeListener = new ChildrenLayoutChangeListener(this);
                while (i < this.mAllChildrenCount) {
                    View childAt = getChildAt(i);
                    this.mAllChildren[i] = childAt;
                    childAt.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
                    i++;
                }
                updateClippingRect();
                return;
            }
            AnonymousClass0LR.D(this.mClippingRect);
            AnonymousClass0LR.D(this.mAllChildren);
            AnonymousClass0LR.D(this.mChildrenLayoutChangeListener);
            for (int i2 = 0; i2 < this.mAllChildrenCount; i2++) {
                this.mAllChildren[i2].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
            }
            getDrawingRect(this.mClippingRect);
            updateClippingToRect(this.mClippingRect);
            this.mAllChildren = null;
            this.mClippingRect = null;
            this.mAllChildrenCount = 0;
            this.mChildrenLayoutChangeListener = null;
        }
    }

    public void setTranslucentBackgroundDrawable(Drawable drawable) {
        updateBackgroundDrawable(null);
        if (this.mReactBackgroundDrawable != null && drawable != null) {
            updateBackgroundDrawable(new LayerDrawable(new Drawable[]{r3, drawable}));
        } else if (drawable != null) {
            updateBackgroundDrawable(drawable);
        }
    }

    private void updateBackgroundDrawable(Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            super.setBackground(drawable);
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    public final void updateClippingRect() {
        if (this.mRemoveClippedSubviews) {
            AnonymousClass0LR.D(this.mClippingRect);
            AnonymousClass0LR.D(this.mAllChildren);
            ReactClippingViewGroupHelper.calculateClippingRect(this, this.mClippingRect);
            updateClippingToRect(this.mClippingRect);
        }
    }

    private void updateClippingToRect(Rect rect) {
        AnonymousClass0LR.D(this.mAllChildren);
        int i = 0;
        for (int i2 = 0; i2 < this.mAllChildrenCount; i2++) {
            updateSubviewClipStatus(rect, i2, i);
            if (this.mAllChildren[i2].getParent() == null) {
                i++;
            }
        }
    }

    public final void updateDrawingOrder() {
        this.mDrawingOrderHelper.update();
        setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.shouldEnableCustomDrawingOrder());
        invalidate();
    }

    private void updateSubviewClipStatus(Rect rect, int i, int i2) {
        View view = ((View[]) AnonymousClass0LR.D(this.mAllChildren))[i];
        Rect rect2 = sHelperRect;
        rect2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        boolean intersects = rect.intersects(rect2.left, rect2.top, rect2.right, rect2.bottom);
        Animation animation = view.getAnimation();
        boolean z = true;
        Object obj = (animation == null || animation.hasEnded()) ? null : 1;
        if (!intersects && view.getParent() != null && obj == null) {
            super.removeViewsInLayout(i - i2, 1);
        } else if (intersects && view.getParent() == null) {
            super.addViewInLayout(view, i - i2, sDefaultLayoutParam, true);
            invalidate();
        } else if (!intersects) {
            z = false;
        }
        if (z && (view instanceof ReactClippingViewGroup)) {
            ReactClippingViewGroup reactClippingViewGroup = (ReactClippingViewGroup) view;
            if (reactClippingViewGroup.getRemoveClippedSubviews()) {
                reactClippingViewGroup.updateClippingRect();
            }
        }
    }

    public static void updateSubviewClipStatus(ReactViewGroup reactViewGroup, View view) {
        if (!reactViewGroup.mRemoveClippedSubviews) {
            return;
        }
        if (reactViewGroup.getParent() != null) {
            AnonymousClass0LR.D(reactViewGroup.mClippingRect);
            AnonymousClass0LR.D(reactViewGroup.mAllChildren);
            sHelperRect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            Rect rect = reactViewGroup.mClippingRect;
            Rect rect2 = sHelperRect;
            if (rect.intersects(rect2.left, rect2.top, rect2.right, rect2.bottom) != (view.getParent() != null)) {
                int i = 0;
                for (int i2 = 0; i2 < reactViewGroup.mAllChildrenCount; i2++) {
                    View[] viewArr = reactViewGroup.mAllChildren;
                    if (viewArr[i2] == view) {
                        reactViewGroup.updateSubviewClipStatus(reactViewGroup.mClippingRect, i2, i);
                        return;
                    }
                    if (viewArr[i2].getParent() == null) {
                        i++;
                    }
                }
            }
        }
    }
}
