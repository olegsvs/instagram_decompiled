package android.support.v4.widget;

import X.AnonymousClass0Ca;
import X.AnonymousClass0cQ;
import X.AnonymousClass0mE;
import X.AnonymousClass1nU;
import X.AnonymousClass1nV;
import X.AnonymousClass1nW;
import X.AnonymousClass1nX;
import X.AnonymousClass1nY;
import X.AnonymousClass1nZ;
import X.AnonymousClass1nr;
import X.AnonymousClass2Oi;
import X.AnonymousClass2Oj;
import X.AnonymousClass2d9;
import X.AnonymousClass2dA;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.AbsSavedState;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.facebook.forker.Process;
import java.util.ArrayList;

public class SlidingPaneLayout extends ViewGroup {
    /* renamed from: V */
    public static final AnonymousClass1nZ f22756V;
    /* renamed from: B */
    public boolean f22757B;
    /* renamed from: C */
    public final AnonymousClass1nr f22758C;
    /* renamed from: D */
    public boolean f22759D;
    /* renamed from: E */
    public AnonymousClass1nX f22760E;
    /* renamed from: F */
    public final ArrayList f22761F;
    /* renamed from: G */
    public boolean f22762G;
    /* renamed from: H */
    public float f22763H;
    /* renamed from: I */
    public int f22764I;
    /* renamed from: J */
    public View f22765J;
    /* renamed from: K */
    private int f22766K;
    /* renamed from: L */
    private boolean f22767L;
    /* renamed from: M */
    private float f22768M;
    /* renamed from: N */
    private float f22769N;
    /* renamed from: O */
    private final int f22770O;
    /* renamed from: P */
    private int f22771P;
    /* renamed from: Q */
    private float f22772Q;
    /* renamed from: R */
    private Drawable f22773R;
    /* renamed from: S */
    private Drawable f22774S;
    /* renamed from: T */
    private int f22775T;
    /* renamed from: U */
    private final Rect f22776U;

    public class SavedState extends AbsSavedState {
        public static final Creator CREATOR = new AnonymousClass1nY();
        /* renamed from: B */
        public boolean f22755B;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f22755B = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f22755B);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 17) {
            f22756V = new AnonymousClass2dA();
        } else if (i >= 16) {
            f22756V = new AnonymousClass2d9();
        } else {
            f22756V = new AnonymousClass2Oj();
        }
    }

    public SlidingPaneLayout(Context context) {
        this(context, null);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22775T = -858993460;
        this.f22767L = true;
        this.f22776U = new Rect();
        this.f22761F = new ArrayList();
        float f = context.getResources().getDisplayMetrics().density;
        this.f22770O = (int) ((32.0f * f) + 0.5f);
        setWillNotDraw(false);
        AnonymousClass0mE.M(this, new AnonymousClass1nU(this));
        AnonymousClass0mE.O(this, 1);
        AnonymousClass1nr D = AnonymousClass1nr.m13190D(this, 0.5f, new AnonymousClass2Oi(this));
        this.f22758C = D;
        D.f22843N = f * 400.0f;
    }

    /* renamed from: A */
    public final boolean m13152A() {
        return m13147B(this.f22765J, 0);
    }

    /* renamed from: B */
    public final boolean m13153B(View view) {
        if (view == null) {
            return false;
        }
        AnonymousClass1nW anonymousClass1nW = (AnonymousClass1nW) view.getLayoutParams();
        if (this.f22757B && anonymousClass1nW.f22752C && this.f22763H > 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    private boolean m13147B(View view, int i) {
        if (!this.f22767L) {
            if (!m13159H(0.0f, i)) {
                return false;
            }
        }
        this.f22762G = false;
        return true;
    }

    /* renamed from: C */
    private static void m13148C(SlidingPaneLayout slidingPaneLayout, View view, float f, int i) {
        AnonymousClass1nW anonymousClass1nW = (AnonymousClass1nW) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            int i2 = (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24) | (i & 16777215);
            if (anonymousClass1nW.f22751B == null) {
                anonymousClass1nW.f22751B = new Paint();
            }
            anonymousClass1nW.f22751B.setColorFilter(new PorterDuffColorFilter(i2, Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, anonymousClass1nW.f22751B);
            }
            f22756V.ZW(slidingPaneLayout, view);
        } else if (view.getLayerType() != 0) {
            if (anonymousClass1nW.f22751B != null) {
                anonymousClass1nW.f22751B.setColorFilter(null);
            }
            Runnable anonymousClass1nV = new AnonymousClass1nV(slidingPaneLayout, view);
            slidingPaneLayout.f22761F.add(anonymousClass1nV);
            AnonymousClass0mE.K(slidingPaneLayout, anonymousClass1nV);
        }
    }

    /* renamed from: C */
    public final boolean m13154C() {
        return AnonymousClass0mE.C(this) == 1;
    }

    /* renamed from: D */
    public final boolean m13155D() {
        if (this.f22757B) {
            if (this.f22763H != 1.0f) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: D */
    private boolean m13149D(View view, int i) {
        if (!this.f22767L) {
            if (!m13159H(1.0f, i)) {
                return false;
            }
        }
        this.f22762G = true;
        return true;
    }

    /* renamed from: E */
    public final void m13156E(int i) {
        if (this.f22765J == null) {
            this.f22763H = 0.0f;
            return;
        }
        boolean C = m13154C();
        AnonymousClass1nW anonymousClass1nW = (AnonymousClass1nW) this.f22765J.getLayoutParams();
        int width = this.f22765J.getWidth();
        if (C) {
            i = (getWidth() - i) - width;
        }
        this.f22763H = ((float) (i - ((C ? getPaddingRight() : getPaddingLeft()) + (C ? anonymousClass1nW.rightMargin : anonymousClass1nW.leftMargin)))) / ((float) this.f22764I);
        if (this.f22771P != 0) {
            m13150E(this, this.f22763H);
        }
        if (anonymousClass1nW.f22752C) {
            m13148C(this, this.f22765J, this.f22763H, this.f22775T);
        }
        View view = this.f22765J;
        AnonymousClass1nX anonymousClass1nX = this.f22760E;
        if (anonymousClass1nX != null) {
            anonymousClass1nX.Qt(view, this.f22763H);
        }
    }

    /* renamed from: E */
    private static void m13150E(SlidingPaneLayout slidingPaneLayout, float f) {
        Object obj;
        int childCount;
        int i;
        View childAt;
        int i2;
        boolean C = slidingPaneLayout.m13154C();
        AnonymousClass1nW anonymousClass1nW = (AnonymousClass1nW) slidingPaneLayout.f22765J.getLayoutParams();
        if (anonymousClass1nW.f22752C) {
            if ((C ? anonymousClass1nW.rightMargin : anonymousClass1nW.leftMargin) <= 0) {
                obj = 1;
                childCount = slidingPaneLayout.getChildCount();
                for (i = 0; i < childCount; i++) {
                    childAt = slidingPaneLayout.getChildAt(i);
                    if (childAt == slidingPaneLayout.f22765J) {
                        float f2 = 1.0f - slidingPaneLayout.f22772Q;
                        int i3 = slidingPaneLayout.f22771P;
                        i2 = (int) (f2 * ((float) i3));
                        slidingPaneLayout.f22772Q = f;
                        i2 -= (int) ((1.0f - f) * ((float) i3));
                        if (C) {
                            i2 = -i2;
                        }
                        childAt.offsetLeftAndRight(i2);
                        if (obj == null) {
                            m13148C(slidingPaneLayout, childAt, C ? slidingPaneLayout.f22772Q - 1.0f : 1.0f - slidingPaneLayout.f22772Q, slidingPaneLayout.f22766K);
                        }
                    }
                }
            }
        }
        obj = null;
        childCount = slidingPaneLayout.getChildCount();
        for (i = 0; i < childCount; i++) {
            childAt = slidingPaneLayout.getChildAt(i);
            if (childAt == slidingPaneLayout.f22765J) {
                float f22 = 1.0f - slidingPaneLayout.f22772Q;
                int i32 = slidingPaneLayout.f22771P;
                i2 = (int) (f22 * ((float) i32));
                slidingPaneLayout.f22772Q = f;
                i2 -= (int) ((1.0f - f) * ((float) i32));
                if (C) {
                    i2 = -i2;
                }
                childAt.offsetLeftAndRight(i2);
                if (obj == null) {
                    if (C) {
                    }
                    m13148C(slidingPaneLayout, childAt, C ? slidingPaneLayout.f22772Q - 1.0f : 1.0f - slidingPaneLayout.f22772Q, slidingPaneLayout.f22766K);
                }
            }
        }
    }

    /* renamed from: F */
    public final boolean m13157F() {
        return m13149D(this.f22765J, 0);
    }

    /* renamed from: F */
    private static boolean m13151F(View view) {
        boolean z = true;
        if (!view.isOpaque()) {
            if (VERSION.SDK_INT < 18) {
                Drawable background = view.getBackground();
                if (background != null) {
                    if (background.getOpacity() != -1) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    /* renamed from: G */
    public final void m13158G() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* renamed from: H */
    public final boolean m13159H(float f, int i) {
        if (this.f22757B) {
            int width;
            AnonymousClass1nW anonymousClass1nW = (AnonymousClass1nW) this.f22765J.getLayoutParams();
            if (m13154C()) {
                width = (int) (((float) getWidth()) - ((((float) (getPaddingRight() + anonymousClass1nW.rightMargin)) + (f * ((float) this.f22764I))) + ((float) this.f22765J.getWidth())));
            } else {
                width = (int) (((float) (getPaddingLeft() + anonymousClass1nW.leftMargin)) + (f * ((float) this.f22764I)));
            }
            AnonymousClass1nr anonymousClass1nr = this.f22758C;
            View view = this.f22765J;
            if (anonymousClass1nr.m13216N(view, width, view.getTop())) {
                m13158G();
                AnonymousClass0mE.J(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: I */
    public final void m13160I(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean C = m13154C();
        int width = C ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = C ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        View view2 = view;
        if (view == null || !m13151F(view2)) {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        } else {
            i = view2.getLeft();
            i2 = view2.getRight();
            i3 = view2.getTop();
            i4 = view2.getBottom();
        }
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt != view2) {
                if (childAt.getVisibility() != 8) {
                    int i6;
                    int max = Math.max(C ? paddingLeft : width, childAt.getLeft());
                    int max2 = Math.max(paddingTop, childAt.getTop());
                    if (C) {
                        i6 = width;
                    } else {
                        C = false;
                        i6 = paddingLeft;
                    }
                    int i7 = (max < i || max2 < i3 || Math.min(i6, childAt.getRight()) > i2 || Math.min(height, childAt.getBottom()) > i4) ? 0 : 4;
                    childAt.setVisibility(i7);
                }
                i5++;
            } else {
                return;
            }
        }
    }

    public final boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof AnonymousClass1nW) && super.checkLayoutParams(layoutParams);
    }

    public final void computeScroll() {
        if (this.f22758C.m13209F(true)) {
            if (this.f22757B) {
                AnonymousClass0mE.J(this);
            } else {
                this.f22758C.m13204A();
            }
        }
    }

    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        if (m13154C()) {
            drawable = this.f22774S;
        } else {
            drawable = this.f22773R;
        }
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null) {
            if (drawable != null) {
                int right;
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (m13154C()) {
                    right = childAt.getRight();
                    intrinsicWidth += right;
                } else {
                    int left = childAt.getLeft();
                    right = left - intrinsicWidth;
                    intrinsicWidth = left;
                }
                drawable.setBounds(right, top, intrinsicWidth, bottom);
                drawable.draw(canvas);
            }
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        AnonymousClass1nW anonymousClass1nW = (AnonymousClass1nW) view.getLayoutParams();
        int save = canvas.save(2);
        if (!(!this.f22757B || anonymousClass1nW.f22753D || this.f22765J == null)) {
            canvas.getClipBounds(this.f22776U);
            Rect rect;
            if (m13154C()) {
                rect = this.f22776U;
                rect.left = Math.max(rect.left, this.f22765J.getRight());
            } else {
                rect = this.f22776U;
                rect.right = Math.min(rect.right, this.f22765J.getLeft());
            }
            canvas.clipRect(this.f22776U);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    public final LayoutParams generateDefaultLayoutParams() {
        return new AnonymousClass1nW();
    }

    public final LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new AnonymousClass1nW(getContext(), attributeSet);
    }

    public final LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof MarginLayoutParams ? new AnonymousClass1nW((MarginLayoutParams) layoutParams) : new AnonymousClass1nW(layoutParams);
    }

    public int getCoveredFadeColor() {
        return this.f22766K;
    }

    public int getParallaxDistance() {
        return this.f22771P;
    }

    public int getSliderFadeColor() {
        return this.f22775T;
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, -982378391);
        super.onAttachedToWindow();
        this.f22767L = true;
        AnonymousClass0cQ.O(this, 88039600, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, -1708333393);
        super.onDetachedFromWindow();
        this.f22767L = true;
        int size = this.f22761F.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass1nV) this.f22761F.get(i)).run();
        }
        this.f22761F.clear();
        AnonymousClass0cQ.O(this, 1665532309, N);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        boolean z = true;
        if (!this.f22757B && actionMasked == 0 && getChildCount() > 1) {
            View childAt = getChildAt(1);
            if (childAt != null) {
                this.f22762G = AnonymousClass1nr.m13191E(childAt, (int) motionEvent.getX(), (int) motionEvent.getY()) ^ true;
            }
        }
        if (this.f22757B) {
            if (!this.f22759D || actionMasked == 0) {
                if (actionMasked != 3) {
                    if (actionMasked != 1) {
                        Object obj;
                        float x;
                        if (actionMasked == 0) {
                            this.f22759D = false;
                            x = motionEvent.getX();
                            float y = motionEvent.getY();
                            this.f22768M = x;
                            this.f22769N = y;
                            if (AnonymousClass1nr.m13191E(this.f22765J, (int) x, (int) y) && m13153B(this.f22765J)) {
                                obj = 1;
                                if (!this.f22758C.m13215M(motionEvent)) {
                                    if (obj != null) {
                                        z = false;
                                    }
                                }
                                return z;
                            }
                        } else if (actionMasked == 2) {
                            float x2 = motionEvent.getX();
                            x = motionEvent.getY();
                            x2 = Math.abs(x2 - this.f22768M);
                            x = Math.abs(x - this.f22769N);
                            if (x2 > ((float) this.f22758C.f22845P) && x > x2) {
                                this.f22758C.m13205B();
                                this.f22759D = true;
                                return false;
                            }
                        }
                        obj = null;
                        if (this.f22758C.m13215M(motionEvent)) {
                            if (obj != null) {
                                z = false;
                            }
                        }
                        return z;
                    }
                }
                this.f22758C.m13205B();
                return false;
            }
        }
        this.f22758C.m13205B();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean C = m13154C();
        if (C) {
            this.f22758C.f22846Q = 2;
        } else {
            this.f22758C.f22846Q = 1;
        }
        i3 -= i;
        int paddingRight = C ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = C ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f22767L) {
            float f = (this.f22757B && this.f22762G) ? 1.0f : 0.0f;
            this.f22763H = f;
        }
        int i6 = paddingRight;
        for (i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int min;
                int i7;
                int i8;
                int i9;
                AnonymousClass1nW anonymousClass1nW = (AnonymousClass1nW) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (anonymousClass1nW.f22753D) {
                    int i10 = i3 - paddingLeft;
                    min = (Math.min(paddingRight, i10 - this.f22770O) - i6) - (anonymousClass1nW.leftMargin + anonymousClass1nW.rightMargin);
                    this.f22764I = min;
                    i7 = C ? anonymousClass1nW.rightMargin : anonymousClass1nW.leftMargin;
                    anonymousClass1nW.f22752C = ((i6 + i7) + min) + (measuredWidth / 2) > i10;
                    i8 = (int) (((float) min) * this.f22763H);
                    i7 = (i7 + i8) + i6;
                    this.f22763H = ((float) i8) / ((float) this.f22764I);
                    i8 = 0;
                } else {
                    if (this.f22757B) {
                        min = this.f22771P;
                        if (min != 0) {
                            i8 = (int) ((1.0f - this.f22763H) * ((float) min));
                            i7 = paddingRight;
                        }
                    }
                    i7 = paddingRight;
                    i8 = 0;
                }
                if (C) {
                    min = (i3 - i7) + i8;
                    i9 = min - measuredWidth;
                } else {
                    i9 = i7 - i8;
                    min = i9 + measuredWidth;
                }
                childAt.layout(i9, paddingTop, min, childAt.getMeasuredHeight() + paddingTop);
                paddingRight += childAt.getWidth();
                i6 = i7;
            }
        }
        if (this.f22767L) {
            if (this.f22757B) {
                if (this.f22771P != 0) {
                    m13150E(this, this.f22763H);
                }
                if (((AnonymousClass1nW) this.f22765J.getLayoutParams()).f22752C) {
                    m13148C(this, this.f22765J, this.f22763H, this.f22775T);
                }
            } else {
                for (i5 = 0; i5 < childCount; i5++) {
                    m13148C(this, getChildAt(i5), 0.0f, this.f22775T);
                }
            }
            m13160I(this.f22765J);
        }
        this.f22767L = false;
    }

    public final void onMeasure(int i, int i2) {
        int paddingTop;
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        SlidingPaneLayout slidingPaneLayout = this;
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            } else if (mode != Process.WAIT_RESULT_TIMEOUT) {
                if (mode == 0) {
                    size = 300;
                }
            }
        } else if (mode2 == 0) {
            if (isInEditMode()) {
                mode2 = Process.WAIT_RESULT_TIMEOUT;
                size2 = 300;
            } else {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            }
        }
        boolean z = false;
        if (mode2 == Process.WAIT_RESULT_TIMEOUT) {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            size2 = 0;
        } else if (mode2 != 1073741824) {
            size2 = 0;
            paddingTop = 0;
        } else {
            size2 = (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = size2;
        }
        i2 = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.f22765J = null;
        int i3 = i2;
        int i4 = 0;
        boolean z2 = false;
        i = 0;
        while (true) {
            int i5 = 8;
            if (i4 >= childCount) {
                break;
            }
            int makeMeasureSpec;
            View childAt = getChildAt(i4);
            AnonymousClass1nW anonymousClass1nW = (AnonymousClass1nW) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                anonymousClass1nW.f22752C = z;
            } else {
                if (anonymousClass1nW.f22754E > 0.0f) {
                    i += anonymousClass1nW.f22754E;
                    if (anonymousClass1nW.width == 0) {
                    }
                }
                mode = anonymousClass1nW.leftMargin + anonymousClass1nW.rightMargin;
                if (anonymousClass1nW.width == -2) {
                    mode = MeasureSpec.makeMeasureSpec(i2 - mode, Process.WAIT_RESULT_TIMEOUT);
                } else if (anonymousClass1nW.width == -1) {
                    mode = MeasureSpec.makeMeasureSpec(i2 - mode, 1073741824);
                } else {
                    mode = MeasureSpec.makeMeasureSpec(anonymousClass1nW.width, 1073741824);
                }
                if (anonymousClass1nW.height == -2) {
                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(paddingTop, Process.WAIT_RESULT_TIMEOUT);
                } else if (anonymousClass1nW.height == -1) {
                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                } else {
                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(anonymousClass1nW.height, 1073741824);
                }
                childAt.measure(mode, makeMeasureSpec);
                mode = childAt.getMeasuredWidth();
                i5 = childAt.getMeasuredHeight();
                if (mode2 == Process.WAIT_RESULT_TIMEOUT && i5 > size2) {
                    size2 = Math.min(i5, paddingTop);
                }
                i3 -= mode;
                boolean z3 = i3 < 0;
                anonymousClass1nW.f22753D = z3;
                z3 |= z2;
                if (anonymousClass1nW.f22753D) {
                    this.f22765J = childAt;
                }
                z2 = z3;
            }
            i4++;
            z = false;
        }
        if (z2 || i > 0) {
            mode2 = i2 - this.f22770O;
            i4 = 0;
            while (i4 < childCount) {
                childAt = getChildAt(i4);
                if (childAt.getVisibility() != i5) {
                    AnonymousClass1nW anonymousClass1nW2 = (AnonymousClass1nW) childAt.getLayoutParams();
                    if (childAt.getVisibility() != i5) {
                        int i6;
                        Object obj = (anonymousClass1nW2.width != 0 || anonymousClass1nW2.f22754E <= 0.0f) ? null : 1;
                        if (obj != null) {
                            i6 = 0;
                        } else {
                            i6 = childAt.getMeasuredWidth();
                        }
                        if (!z2 || childAt == slidingPaneLayout.f22765J) {
                            if (anonymousClass1nW2.f22754E > 0.0f) {
                                if (anonymousClass1nW2.width != 0) {
                                    mode = MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824);
                                } else if (anonymousClass1nW2.height == -2) {
                                    mode = MeasureSpec.makeMeasureSpec(paddingTop, Process.WAIT_RESULT_TIMEOUT);
                                } else if (anonymousClass1nW2.height == -1) {
                                    mode = MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                                } else {
                                    mode = MeasureSpec.makeMeasureSpec(anonymousClass1nW2.height, 1073741824);
                                }
                                if (z2) {
                                    i5 = i2 - (anonymousClass1nW2.leftMargin + anonymousClass1nW2.rightMargin);
                                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(i5, 1073741824);
                                    if (i6 != i5) {
                                        childAt.measure(makeMeasureSpec, mode);
                                    }
                                } else {
                                    childAt.measure(MeasureSpec.makeMeasureSpec(i6 + ((int) ((anonymousClass1nW2.f22754E * ((float) Math.max(0, i3))) / i)), 1073741824), mode);
                                }
                            }
                        } else if (anonymousClass1nW2.width < 0 && (i6 > mode2 || anonymousClass1nW2.f22754E > 0.0f)) {
                            if (obj == null) {
                                i5 = 1073741824;
                                mode = MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824);
                            } else if (anonymousClass1nW2.height == -2) {
                                mode = MeasureSpec.makeMeasureSpec(paddingTop, Process.WAIT_RESULT_TIMEOUT);
                                i5 = 1073741824;
                            } else if (anonymousClass1nW2.height == -1) {
                                i5 = 1073741824;
                                mode = MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                            } else {
                                i5 = 1073741824;
                                mode = MeasureSpec.makeMeasureSpec(anonymousClass1nW2.height, 1073741824);
                            }
                            childAt.measure(MeasureSpec.makeMeasureSpec(mode2, i5), mode);
                        }
                    }
                }
                i4++;
                i5 = 8;
            }
        }
        setMeasuredDimension(size, (size2 + getPaddingTop()) + getPaddingBottom());
        slidingPaneLayout.f22757B = z2;
        if (slidingPaneLayout.f22758C.f22833D != 0 && !z2) {
            slidingPaneLayout.f22758C.m13204A();
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.f13609B);
            if (savedState.f22755B) {
                m13157F();
            } else {
                m13152A();
            }
            this.f22762G = savedState.f22755B;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f22755B = this.f22757B ? m13155D() : this.f22762G;
        return savedState;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, 1956460952);
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f22767L = true;
        }
        AnonymousClass0cQ.O(this, -2039144258, N);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.M(this, -1633995346);
        if (this.f22757B) {
            this.f22758C.m13212I(motionEvent);
            float x;
            switch (motionEvent.getActionMasked()) {
                case 0:
                    x = motionEvent.getX();
                    float y = motionEvent.getY();
                    this.f22768M = x;
                    this.f22769N = y;
                    break;
                case 1:
                    if (m13153B(this.f22765J)) {
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        float f = x2 - this.f22768M;
                        x = y2 - this.f22769N;
                        int i = this.f22758C.f22845P;
                        if ((f * f) + (x * x) < ((float) (i * i)) && AnonymousClass1nr.m13191E(this.f22765J, (int) x2, (int) y2)) {
                            m13147B(this.f22765J, 0);
                            break;
                        }
                    }
                    break;
                default:
                    break;
            }
            AnonymousClass0cQ.L(this, 682723317, M);
            return true;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        AnonymousClass0cQ.L(this, 150836500, M);
        return onTouchEvent;
    }

    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f22757B) {
            this.f22762G = view == this.f22765J;
        }
    }

    public void setCoveredFadeColor(int i) {
        this.f22766K = i;
    }

    public void setPanelSlideListener(AnonymousClass1nX anonymousClass1nX) {
        this.f22760E = anonymousClass1nX;
    }

    public void setParallaxDistance(int i) {
        this.f22771P = i;
        requestLayout();
    }

    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f22773R = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f22774S = drawable;
    }

    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(AnonymousClass0Ca.E(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(AnonymousClass0Ca.E(getContext(), i));
    }

    public void setSliderFadeColor(int i) {
        this.f22775T = i;
    }
}
