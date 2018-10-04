package android.support.v4.widget;

import X.AnonymousClass0cB;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eA;
import X.AnonymousClass0ic;
import X.AnonymousClass0mE;
import X.AnonymousClass12k;
import X.AnonymousClass1nR;
import X.AnonymousClass1nS;
import X.AnonymousClass1nT;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.facebook.forker.Process;
import java.util.List;

public class NestedScrollView extends FrameLayout implements AnonymousClass0cB, AnonymousClass0ic {
    /* renamed from: b */
    private static final AnonymousClass1nR f29960b = new AnonymousClass1nR();
    /* renamed from: c */
    private static final int[] f29961c = new int[]{16843130};
    /* renamed from: B */
    public final AnonymousClass12k f29962B;
    /* renamed from: C */
    public int f29963C;
    /* renamed from: D */
    public int f29964D;
    /* renamed from: E */
    public int f29965E;
    /* renamed from: F */
    public OverScroller f29966F;
    /* renamed from: G */
    public final Rect f29967G;
    /* renamed from: H */
    public int f29968H;
    /* renamed from: I */
    public VelocityTracker f29969I;
    /* renamed from: J */
    private int f29970J;
    /* renamed from: K */
    private View f29971K;
    /* renamed from: L */
    private EdgeEffect f29972L;
    /* renamed from: M */
    private EdgeEffect f29973M;
    /* renamed from: N */
    private boolean f29974N;
    /* renamed from: O */
    private boolean f29975O;
    /* renamed from: P */
    private boolean f29976P;
    /* renamed from: Q */
    private boolean f29977Q;
    /* renamed from: R */
    private int f29978R;
    /* renamed from: S */
    private long f29979S;
    /* renamed from: T */
    private int f29980T;
    /* renamed from: U */
    private AnonymousClass1nS f29981U;
    /* renamed from: V */
    private final AnonymousClass0eA f29982V;
    /* renamed from: W */
    private SavedState f29983W;
    /* renamed from: X */
    private final int[] f29984X;
    /* renamed from: Y */
    private final int[] f29985Y;
    /* renamed from: Z */
    private boolean f29986Z;
    /* renamed from: a */
    private float f29987a;

    public class SavedState extends BaseSavedState {
        public static final Creator CREATOR = new AnonymousClass1nT();
        /* renamed from: B */
        public int f22745B;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f22745B = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("HorizontalScrollView.SavedState{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" scrollPosition=");
            stringBuilder.append(this.f22745B);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f22745B);
        }
    }

    /* renamed from: E */
    private static int m15451E(int i, int i2, int i3) {
        if (i2 < i3) {
            if (i >= 0) {
                return i2 + i > i3 ? i3 - i2 : i;
            }
        }
        return 0;
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29967G = new Rect();
        this.f29977Q = true;
        this.f29976P = false;
        this.f29971K = null;
        this.f29975O = false;
        this.f29986Z = true;
        this.f29970J = -1;
        this.f29985Y = new int[2];
        this.f29984X = new int[2];
        this.f29966F = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f29968H = viewConfiguration.getScaledTouchSlop();
        this.f29965E = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f29964D = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f29961c, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f29982V = new AnonymousClass0eA(this);
        this.f29962B = new AnonymousClass12k(this);
        setNestedScrollingEnabled(true);
        AnonymousClass0mE.M(this, f29960b);
    }

    /* renamed from: A */
    public final boolean m15461A(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m15448B(this, findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                int bottom = getChildAt(0).getBottom() - ((getScrollY() + getHeight()) - getPaddingBottom());
                if (bottom < maxScrollAmount) {
                    maxScrollAmount = bottom;
                }
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m15452F(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f29967G);
            offsetDescendantRectToMyCoords(findNextFocus, this.f29967G);
            m15452F(m15462B(this.f29967G));
            findNextFocus.requestFocus(i);
        }
        if (!(findFocus == null || !findFocus.isFocused() || (m15448B(this, findFocus, 0, getHeight()) ^ 1) == 0)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    /* renamed from: B */
    public final int m15462B(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        if (rect.bottom < getChildAt(0).getHeight()) {
            i -= verticalFadingEdgeLength;
        }
        if (rect.bottom > i && rect.top > scrollY) {
            int i2;
            if (rect.height() > height) {
                i2 = (rect.top - scrollY) + 0;
            } else {
                i2 = (rect.bottom - i) + 0;
            }
            return Math.min(i2, getChildAt(0).getBottom() - i);
        } else if (rect.top >= scrollY || rect.bottom >= i) {
            return 0;
        } else {
            int i3;
            if (rect.height() > height) {
                i3 = 0 - (i - rect.bottom);
            } else {
                i3 = 0 - (scrollY - rect.top);
            }
            return Math.max(i3, -getScrollY());
        }
    }

    /* renamed from: B */
    public static boolean m15448B(NestedScrollView nestedScrollView, View view, int i, int i2) {
        view.getDrawingRect(nestedScrollView.f29967G);
        nestedScrollView.offsetDescendantRectToMyCoords(view, nestedScrollView.f29967G);
        return nestedScrollView.f29967G.bottom + i >= nestedScrollView.getScrollY() && nestedScrollView.f29967G.top - i <= nestedScrollView.getScrollY() + i2;
    }

    /* renamed from: C */
    public final boolean m15463C(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f29962B.D(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: C */
    public static boolean m15449C(NestedScrollView nestedScrollView, int i, int i2, int i3) {
        int i4 = i2;
        View view = nestedScrollView;
        int height = nestedScrollView.getHeight();
        int scrollY = nestedScrollView.getScrollY();
        height += scrollY;
        i2 = 0;
        int i5 = i;
        i = i == 33 ? 1 : 0;
        List focusables = nestedScrollView.getFocusables(2);
        int size = focusables.size();
        View view2 = null;
        int i6 = 0;
        nestedScrollView = null;
        while (true) {
            int i7 = i3;
            if (i6 >= size) {
                break;
            }
            View view3 = (View) focusables.get(i6);
            int top = view3.getTop();
            int bottom = view3.getBottom();
            if (i4 < bottom && top < i7) {
                NestedScrollView nestedScrollView2 = (i4 >= top || bottom >= i7) ? null : true;
                if (view2 == null) {
                    view2 = view3;
                    nestedScrollView = nestedScrollView2;
                } else {
                    Object obj = ((i == 0 || top >= view2.getTop()) && (i != 0 || bottom <= view2.getBottom())) ? null : 1;
                    if (nestedScrollView != null) {
                        if (nestedScrollView2 == null) {
                        }
                    } else if (nestedScrollView2 != null) {
                        view2 = view3;
                        nestedScrollView = true;
                    }
                    if (obj != null) {
                        view2 = view3;
                    }
                }
            }
            i6++;
        }
        if (view2 == null) {
            view2 = view;
        }
        if (i4 < scrollY || i7 > height) {
            view.m15452F(i != 0 ? i4 - scrollY : i3 - height);
            i2 = 1;
        }
        if (view2 != view.findFocus()) {
            view2.requestFocus(i5);
        }
        return i2;
    }

    /* renamed from: D */
    public final boolean m15464D(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.f29962B.F(i, i2, i3, i4, iArr, i5);
    }

    /* renamed from: D */
    private static boolean m15450D(NestedScrollView nestedScrollView) {
        View childAt = nestedScrollView.getChildAt(0);
        if (childAt == null) {
            return false;
        }
        if (nestedScrollView.getHeight() < (childAt.getHeight() + nestedScrollView.getPaddingTop()) + nestedScrollView.getPaddingBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public final boolean m15465E(KeyEvent keyEvent) {
        this.f29967G.setEmpty();
        int i = 130;
        if (m15450D(this)) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 62) {
                switch (keyCode) {
                    case Process.SIGSTOP /*19*/:
                        if (keyEvent.isAltPressed()) {
                            return m15452F(33);
                        }
                        return m15461A(33);
                    case Process.SIGTSTP /*20*/:
                        if (keyEvent.isAltPressed()) {
                            return m15452F(130);
                        }
                        return m15461A(130);
                    default:
                        return false;
                }
            }
            if (keyEvent.isShiftPressed()) {
                i = 33;
            }
            Object obj = i == 130 ? 1 : null;
            int height = getHeight();
            if (obj != null) {
                this.f29967G.top = getScrollY() + height;
                int childCount = getChildCount();
                if (childCount > 0) {
                    View childAt = getChildAt(childCount - 1);
                    if (this.f29967G.top + height > childAt.getBottom()) {
                        this.f29967G.top = childAt.getBottom() - height;
                    }
                }
            } else {
                this.f29967G.top = getScrollY() - height;
                if (this.f29967G.top < 0) {
                    this.f29967G.top = 0;
                }
            }
            Rect rect = this.f29967G;
            rect.bottom = rect.top + height;
            m15449C(this, i, this.f29967G.top, this.f29967G.bottom);
            return false;
        } else if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        } else {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: F */
    private void m15452F(int i) {
        if (i == 0) {
            return;
        }
        if (this.f29986Z) {
            m15468H(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    /* renamed from: F */
    public final boolean m15466F(int i) {
        Object obj = i == 130 ? 1 : null;
        int height = getHeight();
        Rect rect = this.f29967G;
        rect.top = 0;
        rect.bottom = height;
        if (obj != null) {
            int childCount = getChildCount();
            if (childCount > 0) {
                this.f29967G.bottom = getChildAt(childCount - 1).getBottom() + getPaddingBottom();
                Rect rect2 = this.f29967G;
                rect2.top = rect2.bottom - height;
            }
        }
        return m15449C(this, i, this.f29967G.top, this.f29967G.bottom);
    }

    /* renamed from: G */
    private void m15453G() {
        this.f29975O = false;
        m15459M();
        this.f29962B.M(0);
        EdgeEffect edgeEffect = this.f29973M;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f29972L.onRelease();
        }
    }

    /* renamed from: G */
    public final boolean m15467G(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        Object obj;
        int i9;
        boolean z2;
        boolean z3;
        int i10 = i3;
        int i11 = i8;
        int i12 = i7;
        NestedScrollView nestedScrollView = this;
        int overScrollMode = getOverScrollMode();
        Object obj2 = computeHorizontalScrollRange() > computeHorizontalScrollExtent() ? 1 : null;
        Object obj3 = computeVerticalScrollRange() > computeVerticalScrollExtent() ? 1 : null;
        if (overScrollMode != 0) {
            if (overScrollMode != 1 || obj2 == null) {
                obj = null;
                if (overScrollMode != 0) {
                    if (overScrollMode == 1 || obj3 == null) {
                        obj3 = null;
                        i10 += i;
                        if (obj == null) {
                            i12 = 0;
                        }
                        i3 = i4 + i2;
                        if (obj3 == null) {
                            i11 = 0;
                        }
                        i2 = -i12;
                        i12 += i5;
                        i9 = -i11;
                        i11 += i6;
                        if (i10 <= i12) {
                            i2 = i12;
                        } else if (i10 >= i2) {
                            i2 = i10;
                            z2 = false;
                            if (i3 <= i11) {
                                i3 = i11;
                            } else if (i3 >= i9) {
                                i3 = i9;
                            } else {
                                z3 = false;
                                if (z3 && !nestedScrollView.f29962B.H(1)) {
                                    nestedScrollView.f29966F.springBack(i2, i3, 0, 0, 0, getScrollRange());
                                }
                                onOverScrolled(i2, i3, z2, z3);
                                if (z2 || z3) {
                                    return true;
                                }
                                return false;
                            }
                            z3 = true;
                            nestedScrollView.f29966F.springBack(i2, i3, 0, 0, 0, getScrollRange());
                            onOverScrolled(i2, i3, z2, z3);
                            if (!z2) {
                            }
                            return true;
                        }
                        z2 = true;
                        if (i3 <= i11) {
                            i3 = i11;
                        } else if (i3 >= i9) {
                            z3 = false;
                            nestedScrollView.f29966F.springBack(i2, i3, 0, 0, 0, getScrollRange());
                            onOverScrolled(i2, i3, z2, z3);
                            if (z2) {
                            }
                            return true;
                        } else {
                            i3 = i9;
                        }
                        z3 = true;
                        nestedScrollView.f29966F.springBack(i2, i3, 0, 0, 0, getScrollRange());
                        onOverScrolled(i2, i3, z2, z3);
                        if (z2) {
                        }
                        return true;
                    }
                }
                obj3 = 1;
                i10 += i;
                if (obj == null) {
                    i12 = 0;
                }
                i3 = i4 + i2;
                if (obj3 == null) {
                    i11 = 0;
                }
                i2 = -i12;
                i12 += i5;
                i9 = -i11;
                i11 += i6;
                if (i10 <= i12) {
                    i2 = i12;
                } else if (i10 >= i2) {
                    i2 = i10;
                    z2 = false;
                    if (i3 <= i11) {
                        i3 = i11;
                    } else if (i3 >= i9) {
                        i3 = i9;
                    } else {
                        z3 = false;
                        nestedScrollView.f29966F.springBack(i2, i3, 0, 0, 0, getScrollRange());
                        onOverScrolled(i2, i3, z2, z3);
                        if (z2) {
                        }
                        return true;
                    }
                    z3 = true;
                    nestedScrollView.f29966F.springBack(i2, i3, 0, 0, 0, getScrollRange());
                    onOverScrolled(i2, i3, z2, z3);
                    if (z2) {
                    }
                    return true;
                }
                z2 = true;
                if (i3 <= i11) {
                    i3 = i11;
                } else if (i3 >= i9) {
                    z3 = false;
                    nestedScrollView.f29966F.springBack(i2, i3, 0, 0, 0, getScrollRange());
                    onOverScrolled(i2, i3, z2, z3);
                    if (z2) {
                    }
                    return true;
                } else {
                    i3 = i9;
                }
                z3 = true;
                nestedScrollView.f29966F.springBack(i2, i3, 0, 0, 0, getScrollRange());
                onOverScrolled(i2, i3, z2, z3);
                if (z2) {
                }
                return true;
            }
        }
        obj = 1;
        if (overScrollMode != 0) {
            if (overScrollMode == 1) {
            }
            obj3 = null;
            i10 += i;
            if (obj == null) {
                i12 = 0;
            }
            i3 = i4 + i2;
            if (obj3 == null) {
                i11 = 0;
            }
            i2 = -i12;
            i12 += i5;
            i9 = -i11;
            i11 += i6;
            if (i10 <= i12) {
                i2 = i12;
            } else if (i10 >= i2) {
                i2 = i10;
                z2 = false;
                if (i3 <= i11) {
                    i3 = i11;
                } else if (i3 >= i9) {
                    i3 = i9;
                } else {
                    z3 = false;
                    nestedScrollView.f29966F.springBack(i2, i3, 0, 0, 0, getScrollRange());
                    onOverScrolled(i2, i3, z2, z3);
                    if (z2) {
                    }
                    return true;
                }
                z3 = true;
                nestedScrollView.f29966F.springBack(i2, i3, 0, 0, 0, getScrollRange());
                onOverScrolled(i2, i3, z2, z3);
                if (z2) {
                }
                return true;
            }
            z2 = true;
            if (i3 <= i11) {
                i3 = i11;
            } else if (i3 >= i9) {
                z3 = false;
                nestedScrollView.f29966F.springBack(i2, i3, 0, 0, 0, getScrollRange());
                onOverScrolled(i2, i3, z2, z3);
                if (z2) {
                }
                return true;
            } else {
                i3 = i9;
            }
            z3 = true;
            nestedScrollView.f29966F.springBack(i2, i3, 0, 0, 0, getScrollRange());
            onOverScrolled(i2, i3, z2, z3);
            if (z2) {
            }
            return true;
        }
        obj3 = 1;
        i10 += i;
        if (obj == null) {
            i12 = 0;
        }
        i3 = i4 + i2;
        if (obj3 == null) {
            i11 = 0;
        }
        i2 = -i12;
        i12 += i5;
        i9 = -i11;
        i11 += i6;
        if (i10 <= i12) {
            i2 = i12;
        } else if (i10 >= i2) {
            i2 = i10;
            z2 = false;
            if (i3 <= i11) {
                i3 = i11;
            } else if (i3 >= i9) {
                i3 = i9;
            } else {
                z3 = false;
                nestedScrollView.f29966F.springBack(i2, i3, 0, 0, 0, getScrollRange());
                onOverScrolled(i2, i3, z2, z3);
                if (z2) {
                }
                return true;
            }
            z3 = true;
            nestedScrollView.f29966F.springBack(i2, i3, 0, 0, 0, getScrollRange());
            onOverScrolled(i2, i3, z2, z3);
            if (z2) {
            }
            return true;
        }
        z2 = true;
        if (i3 <= i11) {
            i3 = i11;
        } else if (i3 >= i9) {
            z3 = false;
            nestedScrollView.f29966F.springBack(i2, i3, 0, 0, 0, getScrollRange());
            onOverScrolled(i2, i3, z2, z3);
            if (z2) {
            }
            return true;
        } else {
            i3 = i9;
        }
        z3 = true;
        nestedScrollView.f29966F.springBack(i2, i3, 0, 0, 0, getScrollRange());
        onOverScrolled(i2, i3, z2, z3);
        if (z2) {
        }
        return true;
    }

    /* renamed from: H */
    private void m15454H() {
        if (getOverScrollMode() == 2) {
            this.f29973M = null;
            this.f29972L = null;
        } else if (this.f29973M == null) {
            Context context = getContext();
            this.f29973M = new EdgeEffect(context);
            this.f29972L = new EdgeEffect(context);
        }
    }

    /* renamed from: H */
    public final void m15468H(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f29979S > 250) {
                int max = Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
                int scrollY = getScrollY();
                this.f29966F.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, max)) - scrollY);
                AnonymousClass0mE.J(this);
            } else {
                if (!this.f29966F.isFinished()) {
                    this.f29966F.abortAnimation();
                }
                scrollBy(i, i2);
            }
            this.f29979S = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: I */
    private void m15455I(int i) {
        boolean z;
        float f;
        int scrollY = getScrollY();
        int i2 = i;
        if (scrollY > 0 || i > 0) {
            if (scrollY >= getScrollRange()) {
                if (i < 0) {
                }
            }
            z = true;
            f = (float) i;
            if (!dispatchNestedPreFling(0.0f, f)) {
                dispatchNestedFling(0.0f, f, z);
                if (getChildCount() > 0) {
                    this.f29962B.K(2, 1);
                    this.f29966F.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Process.WAIT_RESULT_TIMEOUT, Integer.MAX_VALUE, 0, 0);
                    this.f29963C = getScrollY();
                    AnonymousClass0mE.J(this);
                }
            }
        }
        z = false;
        f = (float) i;
        if (!dispatchNestedPreFling(0.0f, f)) {
            dispatchNestedFling(0.0f, f, z);
            if (getChildCount() > 0) {
                this.f29962B.K(2, 1);
                this.f29966F.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Process.WAIT_RESULT_TIMEOUT, Integer.MAX_VALUE, 0, 0);
                this.f29963C = getScrollY();
                AnonymousClass0mE.J(this);
            }
        }
    }

    /* renamed from: I */
    public final void m15469I(int i, int i2) {
        m15468H(i - getScrollX(), i2 - getScrollY());
    }

    /* renamed from: J */
    private boolean m15456J(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i2 < childAt.getTop() - scrollY || i2 >= childAt.getBottom() - scrollY || i < childAt.getLeft() || i >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    private static boolean m15457K(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && m15457K((View) parent, view2)) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    private void m15458L(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f29970J) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f29978R = (int) motionEvent.getY(i);
            this.f29970J = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f29969I;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: M */
    private void m15459M() {
        VelocityTracker velocityTracker = this.f29969I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f29969I = null;
        }
    }

    /* renamed from: N */
    private void m15460N(View view) {
        view.getDrawingRect(this.f29967G);
        offsetDescendantRectToMyCoords(view, this.f29967G);
        int B = m15462B(this.f29967G);
        if (B != 0) {
            scrollBy(0, B);
        }
    }

    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int i, LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public final void computeScroll() {
        if (this.f29966F.computeScrollOffset()) {
            r0.f29966F.getCurrX();
            int currY = r0.f29966F.getCurrY();
            int i = currY - r0.f29963C;
            if (m15463C(0, i, r0.f29984X, null, 1)) {
                i -= r0.f29984X[1];
            }
            if (i != 0) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                m15467G(0, i, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                if (!m15464D(0, scrollY2, 0, i - scrollY2, null, 1)) {
                    Object obj;
                    int overScrollMode = getOverScrollMode();
                    if (overScrollMode != 0) {
                        if (overScrollMode != 1 || scrollRange <= 0) {
                            obj = null;
                            if (obj != null) {
                                m15454H();
                                if (currY > 0 && scrollY > 0) {
                                    r0.f29973M.onAbsorb((int) r0.f29966F.getCurrVelocity());
                                } else if (currY >= scrollRange && scrollY < scrollRange) {
                                    r0.f29972L.onAbsorb((int) r0.f29966F.getCurrVelocity());
                                }
                            }
                        }
                    }
                    obj = 1;
                    if (obj != null) {
                        m15454H();
                        if (currY > 0) {
                        }
                        r0.f29972L.onAbsorb((int) r0.f29966F.getCurrVelocity());
                    }
                }
            }
            r0.f29963C = currY;
            AnonymousClass0mE.J(r0);
            return;
        }
        if (r0.f29962B.H(1)) {
            r0.f29962B.M(1);
        }
        r0.f29963C = 0;
    }

    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public final int computeVerticalScrollRange() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() == 0) {
            return height;
        }
        int bottom = getChildAt(0).getBottom();
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            bottom -= scrollY;
        } else if (scrollY > max) {
            bottom += scrollY - max;
        }
        return bottom;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (!m15465E(keyEvent)) {
                return false;
            }
        }
        return true;
    }

    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f29962B.A(f, f2, z);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f29962B.B(f, f2);
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f29962B.C(i, i2, iArr, iArr2);
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f29962B.E(i, i2, i3, i4, iArr);
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f29973M != null) {
            int save;
            int width;
            int scrollY = getScrollY();
            if (!this.f29973M.isFinished()) {
                save = canvas.save();
                width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate((float) getPaddingLeft(), (float) Math.min(0, scrollY));
                this.f29973M.setSize(width, getHeight());
                if (this.f29973M.draw(canvas)) {
                    AnonymousClass0mE.J(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f29972L.isFinished()) {
                save = canvas.save();
                int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                width = getHeight();
                canvas.translate((float) ((-width2) + getPaddingLeft()), (float) (Math.max(getScrollRange(), scrollY) + width));
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f29972L.setSize(width2, width);
                if (this.f29972L.draw(canvas)) {
                    AnonymousClass0mE.J(this);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
        return bottom < verticalFadingEdgeLength ? ((float) bottom) / ((float) verticalFadingEdgeLength) : 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f29982V.f7587B;
    }

    public int getScrollRange() {
        if (getChildCount() > 0) {
            return Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
        }
        return 0;
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        return scrollY < verticalFadingEdgeLength ? ((float) scrollY) / ((float) verticalFadingEdgeLength) : 1.0f;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f29987a == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f29987a = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f29987a;
    }

    public final boolean hasNestedScrollingParent() {
        return this.f29962B.G();
    }

    public final boolean isNestedScrollingEnabled() {
        return this.f29962B.f13610B;
    }

    public final void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, -1419710340);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, (((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i2, marginLayoutParams.width), MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
        AnonymousClass0cQ.O(this, -1191262358, N);
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, 1593390076);
        super.onAttachedToWindow();
        this.f29976P = false;
        AnonymousClass0cQ.O(this, -2006650926, N);
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0) {
            if (motionEvent.getAction() == 8) {
                if (!this.f29975O) {
                    float axisValue = motionEvent.getAxisValue(9);
                    if (axisValue != 0.0f) {
                        int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                        int scrollRange = getScrollRange();
                        int scrollY = getScrollY();
                        verticalScrollFactorCompat = scrollY - verticalScrollFactorCompat;
                        if (verticalScrollFactorCompat < 0) {
                            verticalScrollFactorCompat = 0;
                        } else if (verticalScrollFactorCompat > scrollRange) {
                            verticalScrollFactorCompat = scrollRange;
                        }
                        if (verticalScrollFactorCompat != scrollY) {
                            super.scrollTo(getScrollX(), verticalScrollFactorCompat);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f29975O) {
            return true;
        }
        int i = action & 255;
        if (i != 6) {
            switch (i) {
                case 0:
                    action = (int) motionEvent.getY();
                    if (!m15456J((int) motionEvent.getX(), action)) {
                        this.f29975O = false;
                        m15459M();
                        break;
                    }
                    this.f29978R = action;
                    this.f29970J = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker = this.f29969I;
                    if (velocityTracker == null) {
                        this.f29969I = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    this.f29969I.addMovement(motionEvent);
                    this.f29966F.computeScrollOffset();
                    this.f29975O = this.f29966F.isFinished() ^ true;
                    this.f29962B.K(2, 0);
                    break;
                case 1:
                case 3:
                    this.f29975O = false;
                    this.f29970J = -1;
                    m15459M();
                    if (this.f29966F.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        AnonymousClass0mE.J(this);
                    }
                    this.f29962B.M(0);
                    break;
                case 2:
                    i = this.f29970J;
                    if (i != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i);
                        if (findPointerIndex != -1) {
                            i = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(i - this.f29978R) > this.f29968H && (2 & getNestedScrollAxes()) == 0) {
                                this.f29975O = true;
                                this.f29978R = i;
                                if (this.f29969I == null) {
                                    this.f29969I = VelocityTracker.obtain();
                                }
                                this.f29969I.addMovement(motionEvent);
                                this.f29980T = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                    break;
                                }
                            }
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Invalid pointerId=");
                        stringBuilder.append(i);
                        stringBuilder.append(" in onInterceptTouchEvent");
                        Log.e("NestedScrollView", stringBuilder.toString());
                        break;
                    }
                    break;
                    break;
                default:
                    break;
            }
        }
        m15458L(motionEvent);
        return this.f29975O;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f29977Q = false;
        View view = this.f29971K;
        if (view != null && m15457K(view, this)) {
            m15460N(this.f29971K);
        }
        this.f29971K = null;
        if (!this.f29976P) {
            if (this.f29983W != null) {
                scrollTo(getScrollX(), this.f29983W.f22745B);
                this.f29983W = null;
            }
            int max = Math.max(0, (getChildCount() > 0 ? getChildAt(0).getMeasuredHeight() : 0) - (((i4 - i2) - getPaddingBottom()) - getPaddingTop()));
            if (getScrollY() > max) {
                scrollTo(getScrollX(), max);
            } else if (getScrollY() < 0) {
                scrollTo(getScrollX(), 0);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f29976P = true;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f29974N) {
            return;
        }
        if (MeasureSpec.getMode(i2) != 0) {
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                int measuredHeight = getMeasuredHeight();
                if (childAt.getMeasuredHeight() < measuredHeight) {
                    childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), ((FrameLayout.LayoutParams) childAt.getLayoutParams()).width), MeasureSpec.makeMeasureSpec((measuredHeight - getPaddingTop()) - getPaddingBottom(), 1073741824));
                }
            }
        }
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        m15455I((int) f2);
        return true;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        dispatchNestedPreScroll(i, i2, iArr, null);
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        i = getScrollY() - scrollY;
        dispatchNestedScroll(null, i, 0, i4 - i, 0);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f29982V.A(view, view2, i);
        startNestedScroll(2);
    }

    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocus;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            findNextFocus = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocus != null) {
            if ((m15448B(this, findNextFocus, 0, getHeight()) ^ 1) == 0) {
                return findNextFocus.requestFocus(i, rect);
            }
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.f29983W = savedState;
            requestLayout();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f22745B = getScrollY();
        return savedState;
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        AnonymousClass1nS anonymousClass1nS = this.f29981U;
        if (anonymousClass1nS != null) {
            anonymousClass1nS.ry(this, i, i2, i3, i4);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, -1947481427);
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null) {
            if (this != findFocus) {
                if (m15448B(this, findFocus, 0, i4)) {
                    findFocus.getDrawingRect(this.f29967G);
                    offsetDescendantRectToMyCoords(findFocus, this.f29967G);
                    m15452F(m15462B(this.f29967G));
                }
                AnonymousClass0cQ.O(this, -1222624470, N);
                return;
            }
        }
        AnonymousClass0cQ.O(this, -1655019498, N);
    }

    public final void onStopNestedScroll(View view) {
        this.f29982V.B(view);
        stopNestedScroll();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
        r20 = this;
        r1 = 1634380556; // 0x616aab0c float:2.7055396E20 double:8.07491285E-315;
        r0 = r20;
        r8 = X.AnonymousClass0cQ.M(r0, r1);
        r1 = r0.f29969I;
        if (r1 != 0) goto L_0x0013;
    L_0x000d:
        r1 = android.view.VelocityTracker.obtain();
        r0.f29969I = r1;
    L_0x0013:
        r1 = r21;
        r6 = android.view.MotionEvent.obtain(r1);
        r4 = r1.getActionMasked();
        r3 = 0;
        if (r4 != 0) goto L_0x0022;
    L_0x0020:
        r0.f29980T = r3;
    L_0x0022:
        r2 = r0.f29980T;
        r2 = (float) r2;
        r5 = 0;
        r6.offsetLocation(r5, r2);
        r2 = -1;
        r7 = 1;
        switch(r4) {
            case 0: goto L_0x0214;
            case 1: goto L_0x01d5;
            case 2: goto L_0x007e;
            case 3: goto L_0x0054;
            case 4: goto L_0x002e;
            case 5: goto L_0x0042;
            case 6: goto L_0x0031;
            default: goto L_0x002e;
        };
    L_0x002e:
        r7 = 1;
        goto L_0x0257;
    L_0x0031:
        r0.m15458L(r1);
        r2 = r0.f29970J;
        r2 = r1.findPointerIndex(r2);
        r1 = r1.getY(r2);
        r1 = (int) r1;
        r0.f29978R = r1;
        goto L_0x002e;
    L_0x0042:
        r3 = r1.getActionIndex();
        r2 = r1.getY(r3);
        r2 = (int) r2;
        r0.f29978R = r2;
        r1 = r1.getPointerId(r3);
        r0.f29970J = r1;
        goto L_0x002e;
    L_0x0054:
        r1 = r0.f29975O;
        if (r1 == 0) goto L_0x0078;
    L_0x0058:
        r1 = r0.getChildCount();
        if (r1 <= 0) goto L_0x0078;
    L_0x005e:
        r9 = r0.f29966F;
        r10 = r0.getScrollX();
        r11 = r0.getScrollY();
        r12 = 0;
        r13 = 0;
        r14 = 0;
        r15 = r0.getScrollRange();
        r1 = r9.springBack(r10, r11, r12, r13, r14, r15);
        if (r1 == 0) goto L_0x0078;
    L_0x0075:
        X.AnonymousClass0mE.J(r0);
    L_0x0078:
        r0.f29970J = r2;
        r0.m15453G();
        goto L_0x002e;
    L_0x007e:
        r3 = r0.f29970J;
        r4 = r1.findPointerIndex(r3);
        if (r4 != r2) goto L_0x00a4;
    L_0x0086:
        r3 = "NestedScrollView";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r1 = "Invalid pointerId=";
        r2.append(r1);
        r1 = r0.f29970J;
        r2.append(r1);
        r1 = " in onTouchEvent";
        r2.append(r1);
        r1 = r2.toString();
        android.util.Log.e(r3, r1);
        goto L_0x002e;
    L_0x00a4:
        r2 = r1.getY(r4);
        r3 = (int) r2;
        r11 = r0.f29978R;
        r11 = r11 - r3;
        r10 = 0;
        r12 = r0.f29984X;
        r13 = r0.f29985Y;
        r14 = 0;
        r9 = r0;
        r2 = r9.m15463C(r10, r11, r12, r13, r14);
        if (r2 == 0) goto L_0x00cf;
    L_0x00b9:
        r2 = r0.f29984X;
        r2 = r2[r7];
        r11 = r11 - r2;
        r2 = r0.f29985Y;
        r2 = r2[r7];
        r2 = (float) r2;
        r6.offsetLocation(r5, r2);
        r5 = r0.f29980T;
        r2 = r0.f29985Y;
        r2 = r2[r7];
        r5 = r5 + r2;
        r0.f29980T = r5;
    L_0x00cf:
        r2 = r0.f29975O;
        if (r2 != 0) goto L_0x00ef;
    L_0x00d3:
        r5 = java.lang.Math.abs(r11);
        r2 = r0.f29968H;
        if (r5 <= r2) goto L_0x00ef;
    L_0x00db:
        r2 = r0.getParent();
        if (r2 == 0) goto L_0x00e4;
    L_0x00e1:
        r2.requestDisallowInterceptTouchEvent(r7);
    L_0x00e4:
        r0.f29975O = r7;
        if (r11 <= 0) goto L_0x00ec;
    L_0x00e8:
        r2 = r0.f29968H;
        r11 = r11 - r2;
        goto L_0x00ef;
    L_0x00ec:
        r2 = r0.f29968H;
        r11 = r11 + r2;
    L_0x00ef:
        r2 = r0.f29975O;
        if (r2 == 0) goto L_0x002e;
    L_0x00f3:
        r2 = r0.f29985Y;
        r2 = r2[r7];
        r3 = r3 - r2;
        r0.f29978R = r3;
        r2 = r0.getScrollY();
        r5 = r0.getScrollRange();
        r3 = r0.getOverScrollMode();
        if (r3 == 0) goto L_0x010f;
    L_0x0108:
        if (r3 != r7) goto L_0x010d;
    L_0x010a:
        if (r5 <= 0) goto L_0x010d;
    L_0x010c:
        goto L_0x010f;
    L_0x010d:
        r10 = 0;
        goto L_0x0110;
    L_0x010f:
        r10 = 1;
    L_0x0110:
        r13 = 0;
        r15 = 0;
        r16 = r0.getScrollY();
        r17 = 0;
        r12 = r0;
        r3 = r11;
        r19 = 0;
        r20 = 0;
        r21 = 1;
        r14 = r11;
        r18 = r5;
        r7 = r12.m15467G(r13, r14, r15, r16, r17, r18, r19, r20, r21);
        if (r7 == 0) goto L_0x0137;
    L_0x0129:
        r9 = 0;
        r7 = r0.f29962B;
        r7 = r7.H(r9);
        if (r7 != 0) goto L_0x0137;
    L_0x0132:
        r7 = r0.f29969I;
        r7.clear();
    L_0x0137:
        r13 = r0.getScrollY();
        r13 = r13 - r2;
        r15 = r11 - r13;
        r12 = 0;
        r14 = 0;
        r7 = r0.f29985Y;
        r17 = 0;
        r11 = r0;
        r16 = r7;
        r7 = r11.m15464D(r12, r13, r14, r15, r16, r17);
        if (r7 == 0) goto L_0x0169;
    L_0x014d:
        r3 = r0.f29978R;
        r2 = r0.f29985Y;
        r7 = 1;
        r1 = r2[r7];
        r3 = r3 - r1;
        r0.f29978R = r3;
        r1 = r2[r7];
        r2 = (float) r1;
        r1 = 0;
        r6.offsetLocation(r1, r2);
        r2 = r0.f29980T;
        r1 = r0.f29985Y;
        r1 = r1[r7];
        r2 = r2 + r1;
        r0.f29980T = r2;
        goto L_0x0257;
    L_0x0169:
        r7 = 1;
        if (r10 == 0) goto L_0x0257;
    L_0x016c:
        r0.m15454H();
        r2 = r2 + r3;
        if (r2 >= 0) goto L_0x0196;
    L_0x0172:
        r5 = r0.f29973M;
        r3 = (float) r3;
        r2 = r0.getHeight();
        r2 = (float) r2;
        r3 = r3 / r2;
        r2 = r1.getX(r4);
        r1 = r0.getWidth();
        r1 = (float) r1;
        r2 = r2 / r1;
        X.AnonymousClass12n.B(r5, r3, r2);
        r1 = r0.f29972L;
        r1 = r1.isFinished();
        if (r1 != 0) goto L_0x01be;
    L_0x0190:
        r1 = r0.f29972L;
        r1.onRelease();
        goto L_0x01be;
    L_0x0196:
        if (r2 <= r5) goto L_0x01be;
    L_0x0198:
        r9 = r0.f29972L;
        r5 = (float) r3;
        r2 = r0.getHeight();
        r2 = (float) r2;
        r5 = r5 / r2;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = r1.getX(r4);
        r1 = r0.getWidth();
        r1 = (float) r1;
        r2 = r2 / r1;
        r3 = r3 - r2;
        X.AnonymousClass12n.B(r9, r5, r3);
        r1 = r0.f29973M;
        r1 = r1.isFinished();
        if (r1 != 0) goto L_0x01be;
    L_0x01b9:
        r1 = r0.f29973M;
        r1.onRelease();
    L_0x01be:
        r1 = r0.f29973M;
        if (r1 == 0) goto L_0x0257;
    L_0x01c2:
        r1 = r1.isFinished();
        if (r1 == 0) goto L_0x01d0;
    L_0x01c8:
        r1 = r0.f29972L;
        r1 = r1.isFinished();
        if (r1 != 0) goto L_0x0257;
    L_0x01d0:
        X.AnonymousClass0mE.J(r0);
        goto L_0x0257;
    L_0x01d5:
        r7 = 1;
        r4 = r0.f29969I;
        r3 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r1 = r0.f29964D;
        r1 = (float) r1;
        r4.computeCurrentVelocity(r3, r1);
        r1 = r0.f29970J;
        r1 = r4.getYVelocity(r1);
        r4 = (int) r1;
        r3 = java.lang.Math.abs(r4);
        r1 = r0.f29965E;
        if (r3 <= r1) goto L_0x01f4;
    L_0x01ef:
        r1 = -r4;
        r0.m15455I(r1);
        goto L_0x020e;
    L_0x01f4:
        r9 = r0.f29966F;
        r10 = r0.getScrollX();
        r11 = r0.getScrollY();
        r12 = 0;
        r13 = 0;
        r14 = 0;
        r15 = r0.getScrollRange();
        r1 = r9.springBack(r10, r11, r12, r13, r14, r15);
        if (r1 == 0) goto L_0x020e;
    L_0x020b:
        X.AnonymousClass0mE.J(r0);
    L_0x020e:
        r0.f29970J = r2;
        r0.m15453G();
        goto L_0x0257;
    L_0x0214:
        r7 = 1;
        r2 = r0.getChildCount();
        if (r2 != 0) goto L_0x0222;
    L_0x021b:
        r1 = -1445443093; // 0xffffffffa9d849eb float:-9.6051497E-14 double:NaN;
        X.AnonymousClass0cQ.L(r0, r1, r8);
        return r3;
    L_0x0222:
        r2 = r0.f29966F;
        r2 = r2.isFinished();
        r2 = r2 ^ r7;
        r0.f29975O = r2;
        if (r2 == 0) goto L_0x0236;
    L_0x022d:
        r2 = r0.getParent();
        if (r2 == 0) goto L_0x0236;
    L_0x0233:
        r2.requestDisallowInterceptTouchEvent(r7);
    L_0x0236:
        r2 = r0.f29966F;
        r2 = r2.isFinished();
        if (r2 != 0) goto L_0x0243;
    L_0x023e:
        r2 = r0.f29966F;
        r2.abortAnimation();
    L_0x0243:
        r2 = r1.getY();
        r2 = (int) r2;
        r0.f29978R = r2;
        r1 = r1.getPointerId(r3);
        r0.f29970J = r1;
        r3 = 2;
        r2 = 0;
        r1 = r0.f29962B;
        r1.K(r3, r2);
    L_0x0257:
        r1 = r0.f29969I;
        if (r1 == 0) goto L_0x025e;
    L_0x025b:
        r1.addMovement(r6);
    L_0x025e:
        r6.recycle();
        r1 = 406601907; // 0x183c40b3 float:2.4331095E-24 double:2.00888034E-315;
        X.AnonymousClass0cQ.L(r0, r1, r8);
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void requestChildFocus(View view, View view2) {
        if (this.f29977Q) {
            this.f29971K = view2;
        } else {
            m15460N(view2);
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int B = m15462B(rect);
        boolean z2 = B != 0;
        if (z2) {
            if (z) {
                scrollBy(0, B);
            } else {
                m15468H(0, B);
            }
        }
        return z2;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m15459M();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void requestLayout() {
        this.f29977Q = true;
        super.requestLayout();
    }

    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int E = m15451E(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            int E2 = m15451E(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (E != getScrollX() || E2 != getScrollY()) {
                super.scrollTo(E, E2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f29974N) {
            this.f29974N = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f29962B.I(z);
    }

    public void setOnScrollChangeListener(AnonymousClass1nS anonymousClass1nS) {
        this.f29981U = anonymousClass1nS;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f29986Z = z;
    }

    public final boolean startNestedScroll(int i) {
        return this.f29962B.J(i);
    }

    public final void stopNestedScroll() {
        this.f29962B.L();
    }
}
