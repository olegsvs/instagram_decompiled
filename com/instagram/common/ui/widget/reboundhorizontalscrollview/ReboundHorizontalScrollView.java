package com.instagram.common.ui.widget.reboundhorizontalscrollview;

import X.AnonymousClass0QP;
import X.AnonymousClass0cN;
import X.AnonymousClass0cQ;
import X.AnonymousClass0dh;
import X.AnonymousClass0e5;
import X.AnonymousClass0e6;
import X.AnonymousClass0e8;
import X.AnonymousClass3BJ;
import X.AnonymousClass3BK;
import X.AnonymousClass3BL;
import X.AnonymousClass3BM;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import com.facebook.common.dextricks.StartupQEsConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ReboundHorizontalScrollView extends LinearLayout implements AnonymousClass0QP, OnGestureListener {
    /* renamed from: Y */
    private static final AnonymousClass0e5 f38743Y = AnonymousClass0e5.C(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 5.0d);
    /* renamed from: Z */
    private static final AnonymousClass0e5 f38744Z = AnonymousClass0e5.C(50.0d, 10.2d);
    /* renamed from: a */
    private static final AnonymousClass0e5 f38745a = AnonymousClass0e5.C(20.0d, 10.0d);
    /* renamed from: B */
    public float f38746B;
    /* renamed from: C */
    public boolean f38747C;
    /* renamed from: D */
    public final List f38748D;
    /* renamed from: E */
    public float f38749E;
    /* renamed from: F */
    public int f38750F;
    /* renamed from: G */
    public AnonymousClass0e5 f38751G;
    /* renamed from: H */
    public AnonymousClass0e5 f38752H;
    /* renamed from: I */
    public final AnonymousClass0cN f38753I;
    /* renamed from: J */
    private boolean f38754J;
    /* renamed from: K */
    private float f38755K;
    /* renamed from: L */
    private float f38756L;
    /* renamed from: M */
    private final GestureDetector f38757M;
    /* renamed from: N */
    private boolean f38758N;
    /* renamed from: O */
    private final int f38759O;
    /* renamed from: P */
    private final int f38760P;
    /* renamed from: Q */
    private AnonymousClass0e5 f38761Q;
    /* renamed from: R */
    private AnonymousClass3BM f38762R;
    /* renamed from: S */
    private int f38763S;
    /* renamed from: T */
    private boolean f38764T;
    /* renamed from: U */
    private boolean f38765U;
    /* renamed from: V */
    private float f38766V;
    /* renamed from: W */
    private boolean f38767W;
    /* renamed from: X */
    private float f38768X;

    public class SavedState extends BaseSavedState {
        public static final Creator CREATOR = new AnonymousClass3BL();
        /* renamed from: B */
        public int f38738B;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f38738B = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f38738B);
        }
    }

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public ReboundHorizontalScrollView(Context context) {
        this(context, null);
    }

    public ReboundHorizontalScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReboundHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38750F = -1;
        setClipChildren(false);
        setSaveEnabled(false);
        this.f38761Q = f38744Z;
        this.f38752H = f38745a;
        this.f38751G = f38743Y;
        this.f38758N = AnonymousClass0e8.D(getContext());
        AnonymousClass0cN O = AnonymousClass0e6.B().C().O(this.f38751G);
        O.f7105C = 0.001d;
        O.f7110H = 1.0d;
        this.f38753I = O;
        this.f38757M = new GestureDetector(context, this);
        this.f38748D = new CopyOnWriteArrayList();
        this.f38766V = TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics());
        int scaledMinimumFlingVelocity = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.f38760P = scaledMinimumFlingVelocity;
        this.f38746B = (float) (scaledMinimumFlingVelocity * 3);
        this.f38759O = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: A */
    public final void m18891A(AnonymousClass3BK anonymousClass3BK) {
        if (!this.f38748D.contains(anonymousClass3BK)) {
            this.f38748D.add(anonymousClass3BK);
        }
    }

    /* renamed from: B */
    public static int m18881B(ReboundHorizontalScrollView reboundHorizontalScrollView, int i) {
        int childCount = reboundHorizontalScrollView.getChildCount();
        int i2 = 0;
        if (childCount <= 1) {
            return 0;
        }
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        while (i2 < childCount) {
            reboundHorizontalScrollView.getChildAt(i2);
            int abs = Math.abs(i - m18882C(reboundHorizontalScrollView, i2));
            if (i2 == 0 || abs < r1) {
                i3 = i2;
                i4 = abs;
            }
            i2++;
        }
        return i3;
    }

    /* renamed from: B */
    public final void m18892B(float f) {
        m18886G();
        setScrollState(AnonymousClass3BM.DRAGGING);
        if (m18889J(this) && f < 0.0f) {
            f *= 0.25f;
        }
        if (m18888I(this) && f > 0.0f) {
            f *= 0.25f;
        }
        AnonymousClass0cN anonymousClass0cN = this.f38753I;
        double E = anonymousClass0cN.E();
        double d = (double) f;
        Double.isNaN(d);
        anonymousClass0cN.L(E + d);
    }

    /* renamed from: C */
    public static int m18882C(ReboundHorizontalScrollView reboundHorizontalScrollView, int i) {
        int childCount = reboundHorizontalScrollView.getChildCount() - 1;
        if (i <= childCount) {
            if (i != 0 || !reboundHorizontalScrollView.f38765U) {
                if (i != childCount || !reboundHorizontalScrollView.f38765U) {
                    return Math.round((float) (reboundHorizontalScrollView.m18887H(i) - reboundHorizontalScrollView.getSelectionPoint()));
                }
                View childAt = reboundHorizontalScrollView.getChildAt(i);
                return reboundHorizontalScrollView.f38758N ? childAt.getLeft() : childAt.getRight() - reboundHorizontalScrollView.getWidth();
            }
        }
        return 0;
    }

    /* renamed from: C */
    public final void m18893C(int i, float f) {
        this.f38763S = i;
        this.f38753I.O(this.f38761Q).N((double) m18882C(this, i)).P((double) f);
        setScrollState(AnonymousClass3BM.SETTLING);
    }

    /* renamed from: D */
    public final void m18894D(float f) {
        int nextRestPoint = getNextRestPoint();
        this.f38763S = m18881B(this, nextRestPoint);
        this.f38753I.O(this.f38761Q).N((double) nextRestPoint).P((double) f);
    }

    /* renamed from: D */
    public static void m18883D(ReboundHorizontalScrollView reboundHorizontalScrollView, float f) {
        if (reboundHorizontalScrollView.f38763S == -1) {
            reboundHorizontalScrollView.f38753I.O(reboundHorizontalScrollView.f38752H).N((double) reboundHorizontalScrollView.getNearestRestPoint()).P((double) f);
        }
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
        if (this.f38762R == AnonymousClass3BM.SETTLING) {
            anonymousClass0cN.L(anonymousClass0cN.f7106D);
            m18890K();
            setScrollState(AnonymousClass3BM.IDLE);
        }
    }

    /* renamed from: E */
    public final void m18895E(float f) {
        int priorRestPoint = getPriorRestPoint();
        this.f38763S = m18881B(this, priorRestPoint);
        this.f38753I.O(this.f38761Q).N((double) priorRestPoint).P((double) f);
    }

    /* renamed from: E */
    private void m18884E(MotionEvent motionEvent) {
        if (!this.f38754J) {
            float rawX = this.f38755K - motionEvent.getRawX();
            float rawY = this.f38756L - motionEvent.getRawY();
            Object obj = Math.sqrt((double) ((rawX * rawX) + (rawY * rawY))) > ((double) this.f38766V) ? 1 : null;
            double toDegrees = Math.toDegrees(Math.atan((double) Math.abs(rawY / rawX)));
            if (obj != null && toDegrees < 45.0d) {
                this.f38754J = true;
            }
        }
    }

    /* renamed from: F */
    private void m18885F() {
        if (this.f38763S == -1) {
            if (m18889J(this)) {
                this.f38753I.O(this.f38761Q);
                this.f38753I.N((double) getStartScrollBound());
            } else if (m18888I(this)) {
                this.f38753I.O(this.f38761Q);
                this.f38753I.N((double) getEndScrollBound());
            }
        }
    }

    /* renamed from: F */
    public final void m18896F(float f) {
        int i = 0;
        this.f38767W = false;
        if (Math.abs(f) < ((float) this.f38760P)) {
            this.f38753I.O(this.f38752H);
            if (this.f38763S == -1) {
                m18883D(this, 0.0f);
            }
        } else {
            this.f38753I.O(this.f38751G).P((double) (-f));
            int B = m18881B(this, getScrollX());
            while (i < this.f38748D.size()) {
                ((AnonymousClass3BK) this.f38748D.get(i)).Xm(this, B);
                i++;
            }
        }
        setScrollState(AnonymousClass3BM.SETTLING);
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        int scrollX = getScrollX();
        int B = m18881B(this, getScrollX());
        m18890K();
        int scrollX2 = getScrollX();
        int B2 = m18881B(this, getScrollX());
        for (int i = 0; i < this.f38748D.size(); i++) {
            AnonymousClass3BK anonymousClass3BK = (AnonymousClass3BK) this.f38748D.get(i);
            if (scrollX2 != scrollX) {
                float progress = getProgress();
                double d = (double) progress;
                int floor = (int) Math.floor(d);
                anonymousClass3BK.oy(this, progress - ((float) floor), floor, (int) Math.ceil(d));
            }
            if (B2 != B) {
                anonymousClass3BK.Ko(this, B2, B);
            }
        }
        if (this.f38762R == AnonymousClass3BM.SETTLING) {
            m18885F();
            float abs = (float) Math.abs(this.f38753I.F());
            if (!this.f38747C && abs < this.f38749E && this.f38753I.f7111I == this.f38751G && abs < this.f38746B) {
                this.f38747C = true;
                float F = (float) this.f38753I.F();
                this.f38753I.O(this.f38752H);
                m18883D(this, F);
            }
            this.f38749E = abs;
        }
    }

    /* renamed from: G */
    private void m18886G() {
        if (!this.f38767W) {
            this.f38767W = true;
            getParent().requestDisallowInterceptTouchEvent(true);
            this.f38763S = -1;
            for (int i = 0; i < this.f38748D.size(); i++) {
                ((AnonymousClass3BK) this.f38748D.get(i)).BEA(this);
            }
            setScrollState(AnonymousClass3BM.IDLE);
            this.f38747C = false;
            this.f38749E = 0.0f;
            this.f38753I.K();
        }
    }

    /* renamed from: H */
    private int m18887H(int i) {
        if (i > getChildCount() - 1) {
            return 0;
        }
        View childAt = getChildAt(i);
        return Math.round(((float) childAt.getRight()) - (((float) childAt.getMeasuredWidth()) / 2.0f));
    }

    /* renamed from: I */
    private static boolean m18888I(ReboundHorizontalScrollView reboundHorizontalScrollView) {
        if (reboundHorizontalScrollView.getChildCount() == 0) {
            return false;
        }
        return AnonymousClass0e8.B(reboundHorizontalScrollView.f38758N, reboundHorizontalScrollView.getEndScrollBound(), reboundHorizontalScrollView.getScrollX());
    }

    /* renamed from: J */
    private static boolean m18889J(ReboundHorizontalScrollView reboundHorizontalScrollView) {
        if (reboundHorizontalScrollView.getChildCount() == 0) {
            return false;
        }
        return AnonymousClass0e8.B(reboundHorizontalScrollView.f38758N, reboundHorizontalScrollView.getScrollX(), reboundHorizontalScrollView.getStartScrollBound());
    }

    /* renamed from: K */
    private void m18890K() {
        setScrollX((int) Math.round(this.f38753I.E()));
    }

    public final void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        view.setClickable(true);
        view.setOnClickListener(new AnonymousClass3BJ(this, view));
    }

    public final boolean canScrollHorizontally(int i) {
        return isEnabled();
    }

    public int getEndScrollBound() {
        if (getChildCount() == 0) {
            return 0;
        }
        return m18882C(this, getChildCount() - 1);
    }

    private int getNearestRestPoint() {
        return m18882C(this, m18881B(this, getScrollX()));
    }

    private int getNextRestPoint() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            int C = m18882C(this, i);
            if (C > getScrollX()) {
                return C;
            }
        }
        return m18882C(this, 0);
    }

    private int getPriorRestPoint() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int C = m18882C(this, childCount);
            if (C < getScrollX()) {
                return C;
            }
        }
        return m18882C(this, getChildCount() - 1);
    }

    private float getProgress() {
        int min;
        int B = m18881B(this, getScrollX());
        int C = m18882C(this, B);
        int scrollX = getScrollX();
        if (AnonymousClass0e8.B(this.f38758N, C, scrollX)) {
            min = Math.min(B + 1, getChildCount() - 1);
        } else {
            min = B;
            B = Math.max(B - 1, 0);
        }
        C = m18882C(this, B);
        int C2 = m18882C(this, min);
        if (B == min) {
            return (float) B;
        }
        return ((float) AnonymousClass0dh.C((double) scrollX, (double) C, (double) C2, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d)) + ((float) B);
    }

    public AnonymousClass3BM getScrollState() {
        return this.f38762R;
    }

    public int getSeekingIndex() {
        return this.f38763S;
    }

    private int getSelectionPoint() {
        return Math.round(((float) getWidth()) / 2.0f);
    }

    public int getStartScrollBound() {
        if (getChildCount() == 0) {
            return 0;
        }
        return m18882C(this, 0);
    }

    public float getVelocity() {
        return (float) this.f38753I.F();
    }

    public final void measureChild(View view, int i, int i2) {
        view.measure(MeasureSpec.makeMeasureSpec(0, 0), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), view.getLayoutParams().height));
    }

    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, 138461262);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(MeasureSpec.makeMeasureSpec(marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, 0), getChildMeasureSpec(i3, (((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + i4, marginLayoutParams.height));
        AnonymousClass0cQ.O(this, 2110364612, N);
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, -242426367);
        super.onAttachedToWindow();
        this.f38753I.A(this);
        setScrollState(AnonymousClass3BM.IDLE);
        AnonymousClass0cQ.O(this, 981107593, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, 1386624774);
        super.onDetachedFromWindow();
        this.f38753I.J(this);
        AnonymousClass0cQ.O(this, 805118939, N);
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f38768X = Math.min(Math.max(f, (float) (-this.f38759O)), (float) this.f38759O);
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return true;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f38754J = false;
                this.f38764T = false;
                this.f38768X = 0.0f;
                this.f38755K = motionEvent.getRawX();
                this.f38756L = motionEvent.getRawY();
                break;
            case 1:
            case 3:
                m18896F(this.f38768X);
                break;
            case 2:
                m18884E(motionEvent);
                if (this.f38754J) {
                    m18886G();
                    return true;
                }
                break;
            default:
                break;
        }
        return false;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f38750F != -1) {
            this.f38753I.L((double) m18882C(this, m18881B(this, this.f38750F)));
            this.f38750F = -1;
        }
    }

    public final boolean onRequestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32768) {
            scrollTo(m18882C(this, indexOfChild(view)), 0);
        }
        return super.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable.getClass().equals(SavedState.class)) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.f38750F = savedState.f38738B;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f38738B = getScrollX();
        return savedState;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f38764T) {
            m18892B(f);
            return true;
        }
        this.f38764T = true;
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
        r4 = this;
        r0 = -1012567740; // 0xffffffffc3a57144 float:-330.8849 double:NaN;
        r3 = X.AnonymousClass0cQ.M(r4, r0);
        r0 = r4.isEnabled();
        r2 = 0;
        if (r0 != 0) goto L_0x0015;
    L_0x000e:
        r0 = -1917522511; // 0xffffffff8db4edb1 float:-1.1150579E-30 double:NaN;
        X.AnonymousClass0cQ.L(r4, r0, r3);
        return r2;
    L_0x0015:
        r0 = super.onTouchEvent(r5);
        r1 = 1;
        if (r0 != 0) goto L_0x0024;
    L_0x001c:
        r0 = r4.f38757M;
        r0 = r0.onTouchEvent(r5);
        if (r0 == 0) goto L_0x0025;
    L_0x0024:
        r2 = 1;
    L_0x0025:
        r0 = r5.getActionMasked();
        switch(r0) {
            case 0: goto L_0x003b;
            case 1: goto L_0x0035;
            case 2: goto L_0x002d;
            case 3: goto L_0x0035;
            default: goto L_0x002c;
        };
    L_0x002c:
        goto L_0x003f;
    L_0x002d:
        r4.m18884E(r5);
        r0 = r4.f38754J;
        if (r0 == 0) goto L_0x003f;
    L_0x0034:
        goto L_0x0040;
    L_0x0035:
        r0 = r4.f38768X;
        r4.m18896F(r0);
        goto L_0x003f;
    L_0x003b:
        r4.m18886G();
        goto L_0x0040;
    L_0x003f:
        r1 = r2;
    L_0x0040:
        r0 = -1227879531; // 0xffffffffb6d00b95 float:-6.2002314E-6 double:NaN;
        X.AnonymousClass0cQ.L(r4, r0, r3);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDeceleratingVelocity(float f) {
        this.f38746B = f;
    }

    public void setPagingSpringConfig(AnonymousClass0e5 anonymousClass0e5) {
        this.f38761Q = anonymousClass0e5;
    }

    private void setScrollState(AnonymousClass3BM anonymousClass3BM) {
        AnonymousClass3BM anonymousClass3BM2 = this.f38762R;
        if (anonymousClass3BM2 != anonymousClass3BM) {
            this.f38762R = anonymousClass3BM;
            for (AnonymousClass3BK ty : this.f38748D) {
                ty.ty(this, anonymousClass3BM2, this.f38762R);
            }
        }
    }

    public void setScrollingSpringConfig(AnonymousClass0e5 anonymousClass0e5) {
        this.f38751G = anonymousClass0e5;
    }

    public void setSnapToEdges(boolean z) {
        this.f38765U = z;
    }

    public void setSnappingSpringConfig(AnonymousClass0e5 anonymousClass0e5) {
        this.f38752H = anonymousClass0e5;
    }

    public void setSpringConfig(AnonymousClass0e5 anonymousClass0e5) {
        this.f38753I.O(anonymousClass0e5);
    }
}
