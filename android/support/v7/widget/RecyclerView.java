package android.support.v7.widget;

import X.AnonymousClass0Gv;
import X.AnonymousClass0cQ;
import X.AnonymousClass0ic;
import X.AnonymousClass0la;
import X.AnonymousClass0mE;
import X.AnonymousClass0nJ;
import X.AnonymousClass0oo;
import X.AnonymousClass0or;
import X.AnonymousClass0rv;
import X.AnonymousClass10n;
import X.AnonymousClass10p;
import X.AnonymousClass12H;
import X.AnonymousClass12I;
import X.AnonymousClass12K;
import X.AnonymousClass12L;
import X.AnonymousClass12M;
import X.AnonymousClass12N;
import X.AnonymousClass12O;
import X.AnonymousClass12P;
import X.AnonymousClass12Q;
import X.AnonymousClass12R;
import X.AnonymousClass12S;
import X.AnonymousClass12T;
import X.AnonymousClass12U;
import X.AnonymousClass12V;
import X.AnonymousClass12W;
import X.AnonymousClass12X;
import X.AnonymousClass12Z;
import X.AnonymousClass12a;
import X.AnonymousClass12b;
import X.AnonymousClass12c;
import X.AnonymousClass12d;
import X.AnonymousClass12f;
import X.AnonymousClass12g;
import X.AnonymousClass12i;
import X.AnonymousClass12j;
import X.AnonymousClass12k;
import X.AnonymousClass12l;
import X.AnonymousClass12m;
import X.AnonymousClass12n;
import X.AnonymousClass12o;
import X.AnonymousClass12q;
import X.AnonymousClass12r;
import X.AnonymousClass12s;
import X.AnonymousClass12t;
import X.AnonymousClass12u;
import X.AnonymousClass12v;
import X.AnonymousClass12w;
import X.AnonymousClass1cK;
import X.AnonymousClass1oK;
import X.AnonymousClass1oP;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.view.AbsSavedState;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.facebook.C0164R;
import com.facebook.common.dextricks.DexStore;
import com.facebook.forker.Process;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class RecyclerView extends ViewGroup implements AnonymousClass0ic {
    public static final boolean TB;
    public static final boolean UB;
    private static final int[] VB = new int[]{16842987};
    private static final boolean WB = (VERSION.SDK_INT > 15);
    public static final boolean XB;
    private static final boolean YB = (VERSION.SDK_INT > 15);
    public static final Class[] ZB;
    private static final int[] aB = new int[]{16843830};
    public static final boolean bB;
    public static final Interpolator cB = new AnonymousClass12H();
    private int AB;
    /* renamed from: B */
    public AnonymousClass12X f8804B;
    private int BB;
    /* renamed from: C */
    public AnonymousClass0nJ f8805C;
    private int CB;
    /* renamed from: D */
    public AnonymousClass12T f8806D;
    private final int DB;
    /* renamed from: E */
    public boolean f8807E;
    private final int EB;
    /* renamed from: F */
    public EdgeEffect f8808F;
    private final int[] FB;
    /* renamed from: G */
    public AnonymousClass12V f8809G;
    private final AnonymousClass12I GB;
    /* renamed from: H */
    public boolean f8810H;
    private AnonymousClass12s HB;
    /* renamed from: I */
    public boolean f8811I;
    private final ArrayList IB;
    /* renamed from: J */
    public int f8812J;
    private SavedState JB;
    /* renamed from: K */
    public boolean f8813K;
    private float KB;
    /* renamed from: L */
    public AnonymousClass12u f8814L;
    private float LB;
    /* renamed from: M */
    public boolean f8815M;
    private final int[] MB;
    /* renamed from: N */
    public boolean f8816N;
    private int NB;
    /* renamed from: O */
    public AnonymousClass10p f8817O;
    private int OB;
    /* renamed from: P */
    public final ArrayList f8818P;
    private AnonymousClass12k PB;
    /* renamed from: Q */
    public boolean f8819Q;
    private final Rect QB;
    /* renamed from: R */
    public boolean f8820R;
    private int RB;
    /* renamed from: S */
    public AnonymousClass0la f8821S;
    private VelocityTracker SB;
    /* renamed from: T */
    public boolean f8822T;
    /* renamed from: U */
    public boolean f8823U;
    /* renamed from: V */
    public EdgeEffect f8824V;
    /* renamed from: W */
    public final int[] f8825W;
    /* renamed from: X */
    public List f8826X;
    /* renamed from: Y */
    public final List f8827Y;
    /* renamed from: Z */
    public boolean f8828Z;
    /* renamed from: a */
    public AnonymousClass12O f8829a;
    /* renamed from: b */
    public boolean f8830b;
    /* renamed from: c */
    public final AnonymousClass12K f8831c;
    /* renamed from: d */
    public AnonymousClass12v f8832d;
    /* renamed from: e */
    public EdgeEffect f8833e;
    /* renamed from: f */
    public final int[] f8834f;
    /* renamed from: g */
    public AnonymousClass0Gv f8835g;
    /* renamed from: h */
    public List f8836h;
    /* renamed from: i */
    public final AnonymousClass0or f8837i;
    /* renamed from: j */
    public final Rect f8838j;
    /* renamed from: k */
    public final RectF f8839k;
    /* renamed from: l */
    public EdgeEffect f8840l;
    /* renamed from: m */
    public final Runnable f8841m;
    /* renamed from: n */
    public final AnonymousClass12N f8842n;
    /* renamed from: o */
    public final AnonymousClass1oP f8843o;
    /* renamed from: p */
    public final AnonymousClass12L f8844p;
    /* renamed from: q */
    private final AccessibilityManager f8845q;
    /* renamed from: r */
    private AnonymousClass12b f8846r;
    /* renamed from: s */
    private AnonymousClass12t f8847s;
    /* renamed from: t */
    private int f8848t;
    /* renamed from: u */
    private int f8849u;
    /* renamed from: v */
    private boolean f8850v;
    /* renamed from: w */
    private int f8851w;
    /* renamed from: x */
    private int f8852x;
    /* renamed from: y */
    private AnonymousClass1oK f8853y;
    /* renamed from: z */
    private Runnable f8854z;

    public class SavedState extends AbsSavedState {
        public static final Creator CREATOR = new AnonymousClass1cK();
        /* renamed from: B */
        public Parcelable f13607B;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = AnonymousClass0la.class.getClassLoader();
            }
            this.f13607B = parcel.readParcelable(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f13607B, 0);
        }
    }

    static {
        boolean z;
        Class[] clsArr;
        Class cls;
        int i = VERSION.SDK_INT;
        if (!(i == 18 || i == 19)) {
            if (i != 20) {
                z = false;
                XB = z;
                TB = i < 23;
                bB = i < 16;
                UB = i < 21;
                clsArr = new Class[4];
                cls = Integer.TYPE;
                clsArr[2] = cls;
                clsArr[3] = cls;
                ZB = clsArr;
            }
        }
        z = true;
        XB = z;
        if (i < 23) {
        }
        TB = i < 23;
        if (i < 16) {
        }
        bB = i < 16;
        if (i < 21) {
        }
        UB = i < 21;
        if (VERSION.SDK_INT > 15) {
        }
        if (VERSION.SDK_INT > 15) {
        }
        clsArr = new Class[4];
        cls = Integer.TYPE;
        clsArr[2] = cls;
        clsArr[3] = cls;
        ZB = clsArr;
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        StringBuilder stringBuilder;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        super(context2, attributeSet2, i2);
        this.GB = new AnonymousClass12I(this);
        this.f8831c = new AnonymousClass12K(this);
        this.f8844p = new AnonymousClass12L();
        this.f8841m = new AnonymousClass12M(this);
        this.f8838j = new Rect();
        this.QB = new Rect();
        this.f8839k = new RectF();
        this.f8818P = new ArrayList();
        this.IB = new ArrayList();
        this.f8849u = 0;
        this.f8811I = false;
        this.CB = 0;
        this.f8848t = 0;
        this.f8817O = new AnonymousClass10n();
        this.OB = 0;
        this.NB = -1;
        this.KB = Float.MIN_VALUE;
        this.LB = Float.MIN_VALUE;
        boolean z = true;
        this.f8830b = true;
        this.f8842n = new AnonymousClass12N(this);
        r15.f8829a = UB ? new AnonymousClass12O() : null;
        r15.f8837i = new AnonymousClass0or();
        r15.f8819Q = false;
        r15.f8820R = false;
        r15.f8853y = new AnonymousClass12P(r15);
        r15.f8828Z = false;
        r15.f8825W = new int[2];
        r15.MB = new int[2];
        r15.f8834f = new int[2];
        r15.FB = new int[2];
        r15.f8827Y = new ArrayList();
        r15.f8854z = new AnonymousClass12Q(r15);
        r15.f8843o = new AnonymousClass12R(r15);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, VB, i2, 0);
            r15.f8810H = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            r15.f8810H = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        r15.RB = viewConfiguration.getScaledTouchSlop();
        r15.KB = AnonymousClass12S.m8899B(viewConfiguration, context2);
        r15.LB = AnonymousClass12S.m8900C(viewConfiguration, context2);
        r15.EB = viewConfiguration.getScaledMinimumFlingVelocity();
        r15.DB = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        r15.f8817O.f13326E = r15.f8853y;
        r15.f8806D = new AnonymousClass12T(new AnonymousClass12U(r15));
        r15.f8809G = new AnonymousClass12V(new AnonymousClass12W(r15));
        if (AnonymousClass0mE.m7512B(r15) == 0) {
            AnonymousClass0mE.m7525O(r15, 1);
        }
        r15.f8845q = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new AnonymousClass12X(r15));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, AnonymousClass12Z.RecyclerView, i2, 0);
            String string = obtainStyledAttributes2.getString(7);
            if (obtainStyledAttributes2.getInt(1, -1) == -1) {
                setDescendantFocusability(262144);
            }
            if (obtainStyledAttributes2.getBoolean(2, false)) {
                StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes2.getDrawable(5);
                Drawable drawable = obtainStyledAttributes2.getDrawable(6);
                StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes2.getDrawable(3);
                Drawable drawable2 = obtainStyledAttributes2.getDrawable(4);
                if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Trying to set fast scroller without both required drawables.");
                    stringBuilder.append(m6946W());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                Resources resources = getContext().getResources();
                AnonymousClass12a anonymousClass12a = new AnonymousClass12a(r15, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C0164R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(C0164R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(C0164R.dimen.fastscroll_margin));
            }
            obtainStyledAttributes2.recycle();
            if (string != null) {
                String trim = string.trim();
                if (!trim.isEmpty()) {
                    String N = m6937N(context2, trim);
                    try {
                        ClassLoader classLoader;
                        Constructor constructor;
                        if (isInEditMode()) {
                            classLoader = getClass().getClassLoader();
                        } else {
                            classLoader = context2.getClassLoader();
                        }
                        Class asSubclass = classLoader.loadClass(N).asSubclass(AnonymousClass0la.class);
                        Object[] objArr = null;
                        try {
                            constructor = asSubclass.getConstructor(ZB);
                            objArr = new Object[]{context2, attributeSet2, Integer.valueOf(i2), Integer.valueOf(0)};
                        } catch (Throwable e) {
                            constructor = asSubclass.getConstructor(new Class[0]);
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((AnonymousClass0la) constructor.newInstance(objArr));
                    } catch (Throwable e2) {
                        e2.initCause(e);
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(attributeSet2.getPositionDescription());
                        stringBuilder.append(": Error creating LayoutManager ");
                        stringBuilder.append(N);
                        throw new IllegalStateException(stringBuilder.toString(), e2);
                    } catch (Throwable e22) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(attributeSet2.getPositionDescription());
                        stringBuilder.append(": Unable to find LayoutManager ");
                        stringBuilder.append(N);
                        throw new IllegalStateException(stringBuilder.toString(), e22);
                    } catch (Throwable e222) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(attributeSet2.getPositionDescription());
                        stringBuilder.append(": Could not instantiate the LayoutManager: ");
                        stringBuilder.append(N);
                        throw new IllegalStateException(stringBuilder.toString(), e222);
                    } catch (Throwable e2222) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(attributeSet2.getPositionDescription());
                        stringBuilder.append(": Could not instantiate the LayoutManager: ");
                        stringBuilder.append(N);
                        throw new IllegalStateException(stringBuilder.toString(), e2222);
                    } catch (Throwable e22222) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(attributeSet2.getPositionDescription());
                        stringBuilder.append(": Cannot access non-public constructor ");
                        stringBuilder.append(N);
                        throw new IllegalStateException(stringBuilder.toString(), e22222);
                    } catch (Throwable e222222) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(attributeSet2.getPositionDescription());
                        stringBuilder.append(": Class is not a LayoutManager ");
                        stringBuilder.append(N);
                        throw new IllegalStateException(stringBuilder.toString(), e222222);
                    }
                }
            }
            if (VERSION.SDK_INT >= 21) {
                TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet2, aB, i2, 0);
                z = obtainStyledAttributes3.getBoolean(0, true);
                obtainStyledAttributes3.recycle();
            }
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z);
    }

    /* renamed from: A */
    public final void m6955A(AnonymousClass0rv anonymousClass0rv) {
        AnonymousClass0la anonymousClass0la = this.f8821S;
        if (anonymousClass0la != null) {
            anonymousClass0la.mo1872A("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f8818P.isEmpty()) {
            setWillNotDraw(false);
        }
        this.f8818P.add(anonymousClass0rv);
        m6994q();
        requestLayout();
    }

    public final void AA(AnonymousClass12b anonymousClass12b) {
        this.IB.remove(anonymousClass12b);
        if (this.f8846r == anonymousClass12b) {
            this.f8846r = null;
        }
    }

    /* renamed from: B */
    public final void m6956B(AnonymousClass12l anonymousClass12l) {
        if (this.f8826X == null) {
            this.f8826X = new ArrayList();
        }
        this.f8826X.add(anonymousClass12l);
    }

    public final void BA(AnonymousClass0Gv anonymousClass0Gv) {
        List list = this.f8836h;
        if (list != null) {
            list.remove(anonymousClass0Gv);
        }
    }

    /* renamed from: C */
    public final void m6957C(AnonymousClass12b anonymousClass12b) {
        this.IB.add(anonymousClass12b);
    }

    public final void CA() {
        int E = this.f8809G.m8926E();
        for (int i = 0; i < E; i++) {
            View D = this.f8809G.m8925D(i);
            AnonymousClass0oo h = m6985h(D);
            if (!(h == null || h.f10384P == null)) {
                View view = h.f10384P.f10370B;
                int left = D.getLeft();
                int top = D.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* renamed from: D */
    public final void m6958D(AnonymousClass0Gv anonymousClass0Gv) {
        if (this.f8836h == null) {
            this.f8836h = new ArrayList();
        }
        this.f8836h.add(anonymousClass0Gv);
    }

    public final void DA(boolean z) {
        if (this.f8849u < 1) {
            this.f8849u = 1;
        }
        if (!z) {
            this.f8823U = false;
        }
        if (this.f8849u == 1) {
            if (!(!z || !this.f8823U || this.f8822T || this.f8821S == null || this.f8805C == null)) {
                m6965K();
            }
            if (!this.f8822T) {
                this.f8823U = false;
            }
        }
        this.f8849u--;
    }

    /* renamed from: E */
    public final void m6959E(String str) {
        StringBuilder stringBuilder;
        if (m6992o()) {
            if (str == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Cannot call this method while RecyclerView is computing a layout or scrolling");
                stringBuilder.append(m6946W());
                throw new IllegalStateException(stringBuilder.toString());
            }
            throw new IllegalStateException(str);
        } else if (this.f8848t > 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(m6946W());
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(stringBuilder.toString()));
        }
    }

    public final boolean EA(int i, int i2, MotionEvent motionEvent) {
        int IA;
        int i3;
        int KA;
        int i4;
        m6962H();
        int i5 = i;
        int i6 = i2;
        if (this.f8805C != null) {
            m6969O();
            m6996s();
            AnonymousClass12m.m8993B("RV Scroll");
            m6975X(r13.f8837i);
            if (i != 0) {
                IA = r13.f8821S.IA(i5, r13.f8831c, r13.f8837i);
                i3 = i - IA;
            } else {
                IA = 0;
                i3 = 0;
            }
            if (i2 != 0) {
                KA = r13.f8821S.KA(i6, r13.f8831c, r13.f8837i);
                i4 = i2 - KA;
            } else {
                KA = 0;
                i4 = 0;
            }
            AnonymousClass12m.m8994C();
            CA();
            m6997t();
            DA(false);
        } else {
            IA = 0;
            i3 = 0;
            KA = 0;
            i4 = 0;
        }
        if (!r13.f8818P.isEmpty()) {
            invalidate();
        }
        MotionEvent motionEvent2 = motionEvent;
        if (m6967M(IA, KA, i3, i4, r13.MB, 0)) {
            int i7 = r13.AB;
            int[] iArr = r13.MB;
            r13.AB = i7 - iArr[0];
            r13.BB -= iArr[1];
            if (motionEvent != null) {
                motionEvent2.offsetLocation((float) iArr[0], (float) iArr[1]);
            }
            int[] iArr2 = r13.FB;
            i7 = iArr2[0];
            iArr = r13.MB;
            iArr2[0] = i7 + iArr[0];
            iArr2[1] = iArr2[1] + iArr[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null) {
                if (((motionEvent2.getSource() & 8194) == 8194 ? 1 : null) == null) {
                    Object obj;
                    float x = motionEvent2.getX();
                    float f = (float) i3;
                    float y = motionEvent2.getY();
                    float f2 = (float) i4;
                    Object obj2 = 1;
                    if (f < 0.0f) {
                        m6971T();
                        AnonymousClass12n.m8995B(r13.f8824V, (-f) / ((float) getWidth()), 1.0f - (y / ((float) getHeight())));
                    } else if (f > 0.0f) {
                        m6972U();
                        AnonymousClass12n.m8995B(r13.f8833e, f / ((float) getWidth()), y / ((float) getHeight()));
                    } else {
                        obj = null;
                        if (f2 < 0.0f) {
                            m6973V();
                            AnonymousClass12n.m8995B(r13.f8840l, (-f2) / ((float) getHeight()), x / ((float) getWidth()));
                        } else if (f2 <= 0.0f) {
                            m6970P();
                            AnonymousClass12n.m8995B(r13.f8808F, f2 / ((float) getHeight()), 1.0f - (x / ((float) getWidth())));
                        } else {
                            obj2 = obj;
                        }
                        if (!(obj2 == null && f == 0.0f && f2 == 0.0f)) {
                            AnonymousClass0mE.m7520J(r13);
                        }
                    }
                    obj = 1;
                    if (f2 < 0.0f) {
                        m6973V();
                        AnonymousClass12n.m8995B(r13.f8840l, (-f2) / ((float) getHeight()), x / ((float) getWidth()));
                    } else if (f2 <= 0.0f) {
                        obj2 = obj;
                    } else {
                        m6970P();
                        AnonymousClass12n.m8995B(r13.f8808F, f2 / ((float) getHeight()), 1.0f - (x / ((float) getWidth())));
                    }
                    AnonymousClass0mE.m7520J(r13);
                }
            }
            m6961G(i5, i6);
        }
        if (!(IA == 0 && KA == 0)) {
            m6968N(IA, KA);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (IA == 0 && KA == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    public final void m6960F() {
        int i;
        int i2;
        int G = this.f8809G.m8928G();
        for (i = 0; i < G; i++) {
            AnonymousClass0oo L = m6935L(this.f8809G.m8927F(i));
            if (!L.m7728T()) {
                L.m7711C();
            }
        }
        AnonymousClass12K anonymousClass12K = this.f8831c;
        i = anonymousClass12K.f13509C.size();
        for (i2 = 0; i2 < i; i2++) {
            ((AnonymousClass0oo) anonymousClass12K.f13509C.get(i2)).m7711C();
        }
        i = anonymousClass12K.f13508B.size();
        for (i2 = 0; i2 < i; i2++) {
            ((AnonymousClass0oo) anonymousClass12K.f13508B.get(i2)).m7711C();
        }
        ArrayList arrayList = anonymousClass12K.f13510D;
        if (arrayList != null) {
            i2 = arrayList.size();
            for (G = 0; G < i2; G++) {
                ((AnonymousClass0oo) anonymousClass12K.f13510D.get(G)).m7711C();
            }
        }
    }

    /* renamed from: F */
    public static void m6929F(RecyclerView recyclerView, AnonymousClass0oo anonymousClass0oo) {
        View view = anonymousClass0oo.f10370B;
        Object obj = view.getParent() == recyclerView ? 1 : null;
        recyclerView.f8831c.m8882P(recyclerView.m6985h(view));
        if (anonymousClass0oo.m7722N()) {
            recyclerView.f8809G.m8923B(view, -1, view.getLayoutParams(), true);
        } else if (obj == null) {
            recyclerView.f8809G.m8922A(view, -1, true);
        } else {
            AnonymousClass12V anonymousClass12V = recyclerView.f8809G;
            int indexOfChild = anonymousClass12V.f13545C.indexOfChild(view);
            if (indexOfChild >= 0) {
                anonymousClass12V.f13544B.m8959G(indexOfChild);
                anonymousClass12V.f13546D.add(view);
                anonymousClass12V.f13545C.ik(view);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("view is not a child, cannot hide ");
            stringBuilder.append(view);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public final void FA(int i) {
        if (!this.f8822T) {
            OA();
            AnonymousClass0la anonymousClass0la = this.f8821S;
            if (anonymousClass0la == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            anonymousClass0la.JA(i);
            awakenScrollBars();
        }
    }

    /* renamed from: G */
    public final void m6961G(int i, int i2) {
        int i3;
        EdgeEffect edgeEffect = this.f8824V;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            i3 = 0;
        } else {
            this.f8824V.onRelease();
            i3 = this.f8824V.isFinished();
        }
        edgeEffect = this.f8833e;
        if (!(edgeEffect == null || edgeEffect.isFinished() || i >= 0)) {
            this.f8833e.onRelease();
            i3 |= this.f8833e.isFinished();
        }
        edgeEffect = this.f8840l;
        if (!(edgeEffect == null || edgeEffect.isFinished() || i2 <= 0)) {
            this.f8840l.onRelease();
            i3 |= this.f8840l.isFinished();
        }
        edgeEffect = this.f8808F;
        if (!(edgeEffect == null || edgeEffect.isFinished() || i2 >= 0)) {
            this.f8808F.onRelease();
            i3 |= this.f8808F.isFinished();
        }
        if (i3 != 0) {
            AnonymousClass0mE.m7520J(this);
        }
    }

    /* renamed from: G */
    public static void m6930G(AnonymousClass0oo anonymousClass0oo) {
        if (anonymousClass0oo.f10375G != null) {
            View view = (View) anonymousClass0oo.f10375G.get();
            while (view != null) {
                if (view != anonymousClass0oo.f10370B) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            anonymousClass0oo.f10375G = null;
        }
    }

    public final boolean GA(AnonymousClass0oo anonymousClass0oo, int i) {
        if (m6992o()) {
            anonymousClass0oo.f10379K = i;
            this.f8827Y.add(anonymousClass0oo);
            return false;
        }
        AnonymousClass0mE.m7525O(anonymousClass0oo.f10370B, i);
        return true;
    }

    /* renamed from: H */
    public final void m6962H() {
        int N = AnonymousClass0cQ.m5864N(this, -146665591);
        if (this.f8813K) {
            if (!this.f8811I) {
                if (this.f8806D.m8912G()) {
                    if (((4 & this.f8806D.f13537D) != 0 ? 1 : null) != null) {
                        if (((11 & this.f8806D.f13537D) != 0 ? 1 : null) == null) {
                            AnonymousClass12m.m8993B("RV PartialInvalidate");
                            m6969O();
                            m6996s();
                            this.f8806D.m8917L();
                            if (!this.f8823U) {
                                if (m6946W()) {
                                    m6965K();
                                } else {
                                    this.f8806D.m8907B();
                                }
                            }
                            DA(true);
                            m6997t();
                            AnonymousClass12m.m8994C();
                            AnonymousClass0cQ.m5865O(this, 41271128, N);
                            return;
                        }
                    }
                    if (this.f8806D.m8912G()) {
                        AnonymousClass12m.m8993B("RV FullInvalidate");
                        m6965K();
                        AnonymousClass12m.m8994C();
                    }
                    AnonymousClass0cQ.m5865O(this, 41271128, N);
                    return;
                }
                AnonymousClass0cQ.m5865O(this, 274694500, N);
                return;
            }
        }
        AnonymousClass12m.m8993B("RV FullInvalidate");
        m6965K();
        AnonymousClass12m.m8994C();
        AnonymousClass0cQ.m5865O(this, -927660301, N);
    }

    /* renamed from: H */
    public static void m6931H(RecyclerView recyclerView, int[] iArr) {
        int E = recyclerView.f8809G.m8926E();
        if (E == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Process.WAIT_RESULT_TIMEOUT;
        for (int i3 = 0; i3 < E; i3++) {
            AnonymousClass0oo L = m6935L(recyclerView.f8809G.m8925D(i3));
            if (!L.m7728T()) {
                int F = L.m7714F();
                if (F < i) {
                    i = F;
                }
                if (F > i2) {
                    i2 = F;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final void HA() {
        int i;
        this.f8811I = true;
        int G = this.f8809G.m8928G();
        for (i = 0; i < G; i++) {
            AnonymousClass0oo L = m6935L(this.f8809G.m8927F(i));
            if (!(L == null || L.m7728T())) {
                L.m7710B(6);
            }
        }
        m6994q();
        AnonymousClass12K anonymousClass12K = this.f8831c;
        if (anonymousClass12K.f13516J.f8805C == null || !anonymousClass12K.f13516J.f8805C.hasStableIds()) {
            anonymousClass12K.m8876J();
            return;
        }
        G = anonymousClass12K.f13509C.size();
        for (i = 0; i < G; i++) {
            L = (AnonymousClass0oo) anonymousClass12K.f13509C.get(i);
            if (L != null) {
                L.m7710B(6);
                L.m7709A(null);
            }
        }
    }

    /* renamed from: I */
    public static RecyclerView m6932I(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView I = m6932I(viewGroup.getChildAt(i));
                if (I != null) {
                    return I;
                }
            }
        }
        return null;
    }

    /* renamed from: I */
    public final void m6963I(int i, int i2) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        AnonymousClass12q anonymousClass12q = AnonymousClass0mE.f9733B;
        setMeasuredDimension(AnonymousClass0la.m7302C(i, paddingLeft, anonymousClass12q.mo2073H(this)), AnonymousClass0la.m7302C(i2, getPaddingTop() + getPaddingBottom(), anonymousClass12q.mo2072G(this)));
    }

    public final boolean IA(AccessibilityEvent accessibilityEvent) {
        if (!m6992o()) {
            return false;
        }
        int A;
        if (accessibilityEvent != null) {
            A = AnonymousClass12o.f13616B.mo2474A(accessibilityEvent);
        } else {
            A = 0;
        }
        if (A == 0) {
            A = 0;
        }
        this.f8812J = A | this.f8812J;
        return true;
    }

    /* renamed from: J */
    public static final int m6933J(View view) {
        view = m6935L(view);
        return view != null ? view.m7713E() : -1;
    }

    /* renamed from: J */
    public final void m6964J(View view) {
        AnonymousClass0oo L = m6935L(view);
        AnonymousClass0nJ anonymousClass0nJ = this.f8805C;
        if (!(anonymousClass0nJ == null || L == null)) {
            anonymousClass0nJ.mo1901L(L);
        }
        List list = this.f8826X;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((AnonymousClass12l) this.f8826X.get(size)).af(view);
            }
        }
    }

    public final void JA(int i, int i2) {
        KA(i, i2, null);
    }

    /* renamed from: K */
    public static final int m6934K(View view) {
        view = m6935L(view);
        return view != null ? view.m7714F() : -1;
    }

    /* renamed from: K */
    public final void m6965K() {
        if (this.f8805C == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.f8821S == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            int E;
            if (this.f8837i.f10404H == 1) {
                m6941R();
                this.f8821S.LA(this);
                m6942S();
            } else {
                AnonymousClass12T anonymousClass12T = this.f8806D;
                Object obj = (anonymousClass12T.f13541H.isEmpty() || anonymousClass12T.f13540G.isEmpty()) ? null : 1;
                if (obj == null && this.f8821S.f9556O == getWidth()) {
                    if (this.f8821S.f9545D == getHeight()) {
                        this.f8821S.LA(this);
                    }
                }
                this.f8821S.LA(this);
                m6942S();
            }
            this.f8837i.m7740A(4);
            m6969O();
            m6996s();
            AnonymousClass0or anonymousClass0or = this.f8837i;
            anonymousClass0or.f10404H = 1;
            if (anonymousClass0or.f10407K) {
                AnonymousClass0oo L;
                for (E = this.f8809G.m8926E() - 1; E >= 0; E--) {
                    L = m6935L(this.f8809G.m8925D(E));
                    if (!L.m7728T()) {
                        long g = m6984g(L);
                        AnonymousClass12i A = new AnonymousClass12i().m8976A(L);
                        AnonymousClass0oo anonymousClass0oo = (AnonymousClass0oo) this.f8844p.f13518C.m8974A(g, null);
                        if (!(anonymousClass0oo == null || anonymousClass0oo.m7728T())) {
                            boolean F = this.f8844p.m8891F(anonymousClass0oo);
                            boolean F2 = this.f8844p.m8891F(L);
                            if (!(F && anonymousClass0oo == L)) {
                                AnonymousClass12i B = AnonymousClass12L.m8885B(this.f8844p, anonymousClass0oo, 4);
                                this.f8844p.m8888C(L, A);
                                AnonymousClass12i B2 = AnonymousClass12L.m8885B(this.f8844p, L, 8);
                                if (B == null) {
                                    StringBuilder stringBuilder;
                                    int E2 = this.f8809G.m8926E();
                                    for (int i = 0; i < E2; i++) {
                                        AnonymousClass0oo L2 = m6935L(this.f8809G.m8925D(i));
                                        if (L2 != L) {
                                            if (m6984g(L2) == g) {
                                                AnonymousClass0nJ anonymousClass0nJ = this.f8805C;
                                                if (anonymousClass0nJ == null || !anonymousClass0nJ.hasStableIds()) {
                                                    stringBuilder = new StringBuilder();
                                                    stringBuilder.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                                    stringBuilder.append(L2);
                                                    stringBuilder.append(" \n View Holder 2:");
                                                    stringBuilder.append(L);
                                                    stringBuilder.append(m6946W());
                                                    throw new IllegalStateException(stringBuilder.toString());
                                                }
                                                stringBuilder = new StringBuilder();
                                                stringBuilder.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                                stringBuilder.append(L2);
                                                stringBuilder.append(" \n View Holder 2:");
                                                stringBuilder.append(L);
                                                stringBuilder.append(m6946W());
                                                throw new IllegalStateException(stringBuilder.toString());
                                            }
                                        }
                                    }
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
                                    stringBuilder.append(anonymousClass0oo);
                                    stringBuilder.append(" cannot be found but it is necessary for ");
                                    stringBuilder.append(L);
                                    stringBuilder.append(m6946W());
                                    Log.e("RecyclerView", stringBuilder.toString());
                                } else {
                                    anonymousClass0oo.m7727S(false);
                                    if (F) {
                                        m6929F(this, anonymousClass0oo);
                                    }
                                    if (anonymousClass0oo != L) {
                                        if (F2) {
                                            m6929F(this, L);
                                        }
                                        anonymousClass0oo.f10383O = L;
                                        m6929F(this, anonymousClass0oo);
                                        this.f8831c.m8882P(anonymousClass0oo);
                                        L.m7727S(false);
                                        L.f10384P = anonymousClass0oo;
                                    }
                                    if (this.f8817O.mo2033B(anonymousClass0oo, L, B, B2)) {
                                        m6999v();
                                    }
                                }
                            }
                        }
                        this.f8844p.m8888C(L, A);
                    }
                }
                AnonymousClass12L anonymousClass12L = this.f8844p;
                AnonymousClass1oP anonymousClass1oP = this.f8843o;
                for (E = anonymousClass12L.f13517B.size() - 1; E >= 0; E--) {
                    L = (AnonymousClass0oo) anonymousClass12L.f13517B.m3529F(E);
                    AnonymousClass12j anonymousClass12j = (AnonymousClass12j) anonymousClass12L.f13517B.m3531H(E);
                    if ((anonymousClass12j.f13604B & 3) != 3) {
                        if ((anonymousClass12j.f13604B & 1) == 0) {
                            if ((anonymousClass12j.f13604B & 14) != 14) {
                                if ((anonymousClass12j.f13604B & 12) == 12) {
                                    anonymousClass1oP.BIA(L, anonymousClass12j.f13606D, anonymousClass12j.f13605C);
                                } else if ((anonymousClass12j.f13604B & 4) != 0) {
                                    anonymousClass1oP.zHA(L, anonymousClass12j.f13606D, null);
                                } else if ((anonymousClass12j.f13604B & 8) != 0) {
                                }
                            }
                            anonymousClass1oP.xHA(L, anonymousClass12j.f13606D, anonymousClass12j.f13605C);
                        } else if (anonymousClass12j.f13606D != null) {
                            anonymousClass1oP.zHA(L, anonymousClass12j.f13606D, anonymousClass12j.f13605C);
                        }
                        AnonymousClass12j.m8978C(anonymousClass12j);
                    }
                    anonymousClass1oP.sVA(L);
                    AnonymousClass12j.m8978C(anonymousClass12j);
                }
            }
            this.f8821S.EA(this.f8831c);
            AnonymousClass0or anonymousClass0or2 = this.f8837i;
            anonymousClass0or2.f10405I = anonymousClass0or2.f10403G;
            this.f8811I = false;
            anonymousClass0or = this.f8837i;
            anonymousClass0or.f10407K = false;
            anonymousClass0or.f10406J = false;
            this.f8821S.f9553L = false;
            if (this.f8831c.f13510D != null) {
                this.f8831c.f13510D.clear();
            }
            if (this.f8821S.f9551J) {
                AnonymousClass0la anonymousClass0la = this.f8821S;
                anonymousClass0la.f9550I = 0;
                anonymousClass0la.f9551J = false;
                this.f8831c.m8883Q();
            }
            this.f8821S.mo1897y(this.f8837i);
            m6997t();
            DA(false);
            this.f8844p.m8890E();
            int[] iArr = this.f8825W;
            E = iArr[0];
            int i2 = iArr[1];
            m6931H(this, this.f8825W);
            int[] iArr2 = this.f8825W;
            int i3 = 0;
            if (!(iArr2[0] == E && iArr2[1] == i2)) {
                i3 = 1;
            }
            if (i3 != 0) {
                m6968N(0, 0);
            }
            m6938O(this);
            AnonymousClass0or anonymousClass0or3 = this.f8837i;
            anonymousClass0or3.f10399C = -1;
            anonymousClass0or3.f10400D = -1;
            anonymousClass0or3.f10401E = -1;
        }
    }

    public final void KA(int i, int i2, Interpolator interpolator) {
        AnonymousClass0la anonymousClass0la = this.f8821S;
        if (anonymousClass0la == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (!this.f8822T) {
            if (!anonymousClass0la.mo1875C()) {
                i = 0;
            }
            if (!this.f8821S.mo1876D()) {
                i2 = 0;
            }
            if (!(i == 0 && i2 == 0)) {
                AnonymousClass12N anonymousClass12N = this.f8842n;
                int B = AnonymousClass12N.m8894B(anonymousClass12N, i, i2, 0, 0);
                if (interpolator == null) {
                    interpolator = cB;
                }
                anonymousClass12N.m8896B(i, i2, B, interpolator);
            }
        }
    }

    /* renamed from: L */
    public static AnonymousClass0oo m6935L(View view) {
        return view == null ? null : ((AnonymousClass12d) view.getLayoutParams()).f13589E;
    }

    /* renamed from: L */
    public final boolean m6966L(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().m8983D(i, i2, iArr, iArr2, i3);
    }

    public final void LA(int i) {
        if (!this.f8822T) {
            AnonymousClass0la anonymousClass0la = this.f8821S;
            if (anonymousClass0la == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                anonymousClass0la.SA(this, this.f8837i, i);
            }
        }
    }

    /* renamed from: M */
    public static void m6936M(View view, Rect rect) {
        AnonymousClass12d anonymousClass12d = (AnonymousClass12d) view.getLayoutParams();
        Rect rect2 = anonymousClass12d.f13586B;
        rect.set((view.getLeft() - rect2.left) - anonymousClass12d.leftMargin, (view.getTop() - rect2.top) - anonymousClass12d.topMargin, (view.getRight() + rect2.right) + anonymousClass12d.rightMargin, (view.getBottom() + rect2.bottom) + anonymousClass12d.bottomMargin);
    }

    /* renamed from: M */
    public final boolean m6967M(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().m8985F(i, i2, i3, i4, iArr, i5);
    }

    public final boolean MA(int i, int i2) {
        return getScrollingChildHelper().m8990K(i, i2);
    }

    /* renamed from: N */
    public static String m6937N(Context context, String str) {
        StringBuilder stringBuilder;
        if (str.charAt(0) == '.') {
            stringBuilder = new StringBuilder();
            stringBuilder.append(context.getPackageName());
            stringBuilder.append(str);
            return stringBuilder.toString();
        } else if (str.contains(".")) {
            return str;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(RecyclerView.class.getPackage().getName());
            stringBuilder.append('.');
            stringBuilder.append(str);
            return stringBuilder.toString();
        }
    }

    /* renamed from: N */
    public final void m6968N(int i, int i2) {
        this.f8848t++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        AnonymousClass0Gv anonymousClass0Gv = this.f8835g;
        if (anonymousClass0Gv != null) {
            anonymousClass0Gv.mo1902B(this, i, i2);
        }
        List list = this.f8836h;
        if (list != null) {
            for (scrollX = list.size() - 1; scrollX >= 0; scrollX--) {
                ((AnonymousClass0Gv) this.f8836h.get(scrollX)).mo1902B(this, i, i2);
            }
        }
        this.f8848t--;
    }

    public final void NA(int i) {
        getScrollingChildHelper().m8992M(i);
    }

    /* renamed from: O */
    public final void m6969O() {
        int i = this.f8849u + 1;
        this.f8849u = i;
        if (i == 1 && !this.f8822T) {
            this.f8823U = false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: O */
    public static void m6938O(android.support.v7.widget.RecyclerView r6) {
        /*
        r0 = r6.f8830b;
        if (r0 == 0) goto L_0x0053;
    L_0x0004:
        r0 = r6.f8805C;
        if (r0 == 0) goto L_0x0053;
    L_0x0008:
        r0 = r6.hasFocus();
        if (r0 == 0) goto L_0x0053;
    L_0x000e:
        r1 = r6.getDescendantFocusability();
        r0 = 393216; // 0x60000 float:5.51013E-40 double:1.942745E-318;
        if (r1 == r0) goto L_0x0053;
    L_0x0016:
        r1 = r6.getDescendantFocusability();
        r0 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        if (r1 != r0) goto L_0x0025;
    L_0x001e:
        r0 = r6.isFocused();
        if (r0 == 0) goto L_0x0025;
    L_0x0024:
        goto L_0x0053;
    L_0x0025:
        r0 = r6.isFocused();
        if (r0 != 0) goto L_0x0054;
    L_0x002b:
        r1 = r6.getFocusedChild();
        r0 = YB;
        if (r0 == 0) goto L_0x004b;
    L_0x0033:
        r0 = r1.getParent();
        if (r0 == 0) goto L_0x003f;
    L_0x0039:
        r0 = r1.hasFocus();
        if (r0 != 0) goto L_0x004b;
    L_0x003f:
        r0 = r6.f8809G;
        r0 = r0.m8926E();
        if (r0 != 0) goto L_0x0054;
    L_0x0047:
        r6.requestFocus();
        return;
    L_0x004b:
        r0 = r6.f8809G;
        r0 = r0.m8930I(r1);
        if (r0 != 0) goto L_0x0054;
    L_0x0053:
        return;
    L_0x0054:
        r0 = r6.f8837i;
        r0 = r0.f10399C;
        r4 = -1;
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        r2 = 0;
        if (r0 == 0) goto L_0x0070;
    L_0x005f:
        r0 = r6.f8805C;
        r0 = r0.hasStableIds();
        if (r0 == 0) goto L_0x0070;
    L_0x0067:
        r0 = r6.f8837i;
        r0 = r0.f10399C;
        r3 = r6.m6979b(r0);
        goto L_0x0071;
    L_0x0070:
        r3 = r2;
    L_0x0071:
        if (r3 == 0) goto L_0x0089;
    L_0x0073:
        r1 = r6.f8809G;
        r0 = r3.f10370B;
        r0 = r1.m8930I(r0);
        if (r0 != 0) goto L_0x0089;
    L_0x007d:
        r0 = r3.f10370B;
        r0 = r0.hasFocusable();
        if (r0 != 0) goto L_0x0086;
    L_0x0085:
        goto L_0x0089;
    L_0x0086:
        r2 = r3.f10370B;
        goto L_0x0095;
    L_0x0089:
        r0 = r6.f8809G;
        r0 = r0.m8926E();
        if (r0 <= 0) goto L_0x0095;
    L_0x0091:
        r2 = m6945V(r6);
    L_0x0095:
        if (r2 == 0) goto L_0x0053;
    L_0x0097:
        r0 = r6.f8837i;
        r0 = r0.f10401E;
        r0 = (long) r0;
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 == 0) goto L_0x00b1;
    L_0x00a0:
        r0 = r6.f8837i;
        r0 = r0.f10401E;
        r1 = r2.findViewById(r0);
        if (r1 == 0) goto L_0x00b1;
    L_0x00aa:
        r0 = r1.isFocusable();
        if (r0 == 0) goto L_0x00b1;
    L_0x00b0:
        r2 = r1;
    L_0x00b1:
        r2.requestFocus();
        goto L_0x0053;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.O(android.support.v7.widget.RecyclerView):void");
    }

    public final void OA() {
        setScrollState(0);
        m6954e();
    }

    /* renamed from: P */
    public final void m6970P() {
        if (this.f8808F == null) {
            this.f8808F = new EdgeEffect(getContext());
            if (this.f8810H) {
                this.f8808F.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.f8808F.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* renamed from: P */
    public static void m6939P(RecyclerView recyclerView, AnonymousClass0nJ anonymousClass0nJ, boolean z, boolean z2) {
        AnonymousClass0nJ anonymousClass0nJ2 = recyclerView.f8805C;
        if (anonymousClass0nJ2 != null) {
            anonymousClass0nJ2.f10044B.unregisterObserver(recyclerView.GB);
        }
        if (!z || z2) {
            recyclerView.m7001x();
        }
        AnonymousClass12T anonymousClass12T = recyclerView.f8806D;
        anonymousClass12T.m8918M(anonymousClass12T.f13540G);
        anonymousClass12T.m8918M(anonymousClass12T.f13541H);
        anonymousClass12T.f13537D = 0;
        AnonymousClass0nJ anonymousClass0nJ3 = recyclerView.f8805C;
        recyclerView.f8805C = anonymousClass0nJ;
        if (anonymousClass0nJ != null) {
            anonymousClass0nJ.m7646N(recyclerView.GB);
            anonymousClass0nJ.m7640H(recyclerView);
        }
        AnonymousClass0la anonymousClass0la = recyclerView.f8821S;
        AnonymousClass12K anonymousClass12K = recyclerView.f8831c;
        AnonymousClass0nJ anonymousClass0nJ4 = recyclerView.f8805C;
        anonymousClass12K.m8868B();
        AnonymousClass12f E = anonymousClass12K.m8871E();
        if (anonymousClass0nJ3 != null) {
            E.f13590B--;
        }
        if (!z && E.f13590B == 0) {
            for (int i = 0; i < E.f13591C.size(); i++) {
                ((AnonymousClass12g) E.f13591C.valueAt(i)).f13595E.clear();
            }
        }
        if (anonymousClass0nJ4 != null) {
            E.f13590B++;
        }
        recyclerView.f8837i.f10408L = true;
        recyclerView.HA();
    }

    /* renamed from: Q */
    private void m6940Q() {
        m6953d();
        setScrollState(0);
    }

    /* renamed from: R */
    private void m6941R() {
        AnonymousClass0or anonymousClass0or;
        AnonymousClass0or anonymousClass0or2;
        int E;
        int i;
        boolean z = true;
        this.f8837i.m7740A(1);
        m6975X(this.f8837i);
        m6969O();
        this.f8844p.m8890E();
        m6996s();
        m6951b();
        AnonymousClass0oo anonymousClass0oo = null;
        View focusedChild = (this.f8830b && hasFocus() && this.f8805C != null) ? getFocusedChild() : null;
        if (focusedChild != null) {
            focusedChild = m6977Z(focusedChild);
            if (focusedChild == null) {
                anonymousClass0oo = null;
            } else {
                anonymousClass0oo = m6985h(focusedChild);
            }
        }
        if (anonymousClass0oo == null) {
            anonymousClass0or = this.f8837i;
            anonymousClass0or.f10399C = -1;
            anonymousClass0or.f10400D = -1;
            anonymousClass0or.f10401E = -1;
        } else {
            long j;
            int i2;
            anonymousClass0or = this.f8837i;
            if (this.f8805C.hasStableIds()) {
                j = anonymousClass0oo.f10373E;
            } else {
                j = -1;
            }
            anonymousClass0or.f10399C = j;
            anonymousClass0or2 = this.f8837i;
            if (this.f8811I) {
                i2 = -1;
            } else if (anonymousClass0oo.m7720L()) {
                i2 = anonymousClass0oo.f10376H;
            } else {
                i2 = anonymousClass0oo.m7713E();
            }
            anonymousClass0or2.f10400D = i2;
            AnonymousClass0or anonymousClass0or3 = this.f8837i;
            View view = anonymousClass0oo.f10370B;
            int id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id = view.getId();
                }
            }
            anonymousClass0or3.f10401E = id;
        }
        anonymousClass0or2 = this.f8837i;
        if (!anonymousClass0or2.f10407K || !this.f8820R) {
            z = false;
        }
        anonymousClass0or2.f10410N = z;
        this.f8820R = false;
        this.f8819Q = false;
        anonymousClass0or2 = this.f8837i;
        anonymousClass0or2.f10402F = anonymousClass0or2.f10406J;
        this.f8837i.f10403G = this.f8805C.mo1813B();
        m6931H(this, this.f8825W);
        if (this.f8837i.f10407K) {
            E = this.f8809G.m8926E();
            for (i = 0; i < E; i++) {
                anonymousClass0oo = m6935L(this.f8809G.m8925D(i));
                if (!anonymousClass0oo.m7728T()) {
                    if (!anonymousClass0oo.m7718J() || this.f8805C.hasStableIds()) {
                        this.f8844p.m8889D(anonymousClass0oo, this.f8817O.m8768L(this.f8837i, anonymousClass0oo, AnonymousClass10p.m8756G(anonymousClass0oo), anonymousClass0oo.m7715G()));
                        if (!(!this.f8837i.f10410N || !anonymousClass0oo.m7723O() || anonymousClass0oo.m7720L() || anonymousClass0oo.m7728T() || anonymousClass0oo.m7718J())) {
                            this.f8844p.m8887B(m6984g(anonymousClass0oo), anonymousClass0oo);
                        }
                    }
                }
            }
        }
        if (this.f8837i.f10406J) {
            int i3;
            i = this.f8809G.m8928G();
            for (i3 = 0; i3 < i; i3++) {
                AnonymousClass0oo L = m6935L(this.f8809G.m8927F(i3));
                if (!L.m7728T() && L.f10376H == -1) {
                    L.f10376H = L.f10380L;
                }
            }
            boolean z2 = this.f8837i.f10408L;
            anonymousClass0or = this.f8837i;
            anonymousClass0or.f10408L = false;
            this.f8821S.mo1896x(this.f8831c, anonymousClass0or);
            this.f8837i.f10408L = z2;
            for (E = 0; E < this.f8809G.m8926E(); E++) {
                AnonymousClass0oo L2 = m6935L(this.f8809G.m8925D(E));
                if (!L2.m7728T()) {
                    AnonymousClass12j anonymousClass12j = (AnonymousClass12j) this.f8844p.f13517B.get(L2);
                    Object obj = (anonymousClass12j == null || (anonymousClass12j.f13604B & 4) == 0) ? null : 1;
                    if (obj == null) {
                        i3 = AnonymousClass10p.m8756G(L2);
                        boolean H = L2.m7716H(DexStore.LOAD_RESULT_MIXED_MODE_ATTEMPTED);
                        if (!H) {
                            i3 |= DexStore.LOAD_RESULT_DEX2OAT_QUICKEN_ATTEMPTED;
                        }
                        AnonymousClass12i L3 = this.f8817O.m8768L(this.f8837i, L2, i3, L2.m7715G());
                        if (H) {
                            m7000w(L2, L3);
                        } else {
                            AnonymousClass12L anonymousClass12L = this.f8844p;
                            AnonymousClass12j anonymousClass12j2 = (AnonymousClass12j) anonymousClass12L.f13517B.get(L2);
                            if (anonymousClass12j2 == null) {
                                anonymousClass12j2 = AnonymousClass12j.m8977B();
                                anonymousClass12L.f13517B.put(L2, anonymousClass12j2);
                            }
                            anonymousClass12j2.f13604B |= 2;
                            anonymousClass12j2.f13606D = L3;
                        }
                    }
                }
            }
        }
        m6960F();
        m6997t();
        DA(false);
        this.f8837i.f10404H = 2;
    }

    /* renamed from: S */
    private void m6942S() {
        m6969O();
        m6996s();
        this.f8837i.m7740A(6);
        this.f8806D.m8908C();
        this.f8837i.f10403G = this.f8805C.mo1813B();
        AnonymousClass0or anonymousClass0or = this.f8837i;
        anonymousClass0or.f10398B = 0;
        anonymousClass0or.f10402F = false;
        this.f8821S.mo1896x(this.f8831c, anonymousClass0or);
        AnonymousClass0or anonymousClass0or2 = this.f8837i;
        anonymousClass0or2.f10408L = false;
        this.JB = null;
        boolean z = anonymousClass0or2.f10407K && this.f8817O != null;
        anonymousClass0or2.f10407K = z;
        this.f8837i.f10404H = 4;
        m6997t();
        DA(false);
    }

    /* renamed from: T */
    public final void m6971T() {
        if (this.f8824V == null) {
            this.f8824V = new EdgeEffect(getContext());
            if (this.f8810H) {
                this.f8824V.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.f8824V.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: T */
    private boolean m6943T(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        AnonymousClass12b anonymousClass12b = this.f8846r;
        if (anonymousClass12b != null) {
            if (action == 0) {
                this.f8846r = null;
            } else {
                anonymousClass12b.yDA(this, motionEvent);
                if (action == 3 || action == 1) {
                    this.f8846r = null;
                }
                return true;
            }
        }
        if (action != 0) {
            int size = this.IB.size();
            for (action = 0; action < size; action++) {
                AnonymousClass12b anonymousClass12b2 = (AnonymousClass12b) this.IB.get(action);
                if (anonymousClass12b2.To(this, motionEvent)) {
                    this.f8846r = anonymousClass12b2;
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: U */
    public final void m6972U() {
        if (this.f8833e == null) {
            this.f8833e = new EdgeEffect(getContext());
            if (this.f8810H) {
                this.f8833e.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.f8833e.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: U */
    private boolean m6944U(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f8846r = null;
        }
        int size = this.IB.size();
        int i = 0;
        while (i < size) {
            AnonymousClass12b anonymousClass12b = (AnonymousClass12b) this.IB.get(i);
            if (!anonymousClass12b.To(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.f8846r = anonymousClass12b;
                return true;
            }
        }
        return false;
    }

    /* renamed from: V */
    private static View m6945V(RecyclerView recyclerView) {
        int i = recyclerView.f8837i.f10400D != -1 ? recyclerView.f8837i.f10400D : 0;
        int B = recyclerView.f8837i.m7741B();
        int i2 = i;
        while (i2 < B) {
            AnonymousClass0oo a = recyclerView.m6978a(i2);
            if (a == null) {
                break;
            } else if (a.f10370B.hasFocusable()) {
                break;
            } else {
                i2++;
            }
        }
        i2 = Math.min(B, i) - 1;
        while (i2 >= 0) {
            a = recyclerView.m6978a(i2);
            if (a == null) {
                break;
            } else if (a.f10370B.hasFocusable()) {
                return a.f10370B;
            } else {
                i2--;
            }
        }
        return null;
    }

    /* renamed from: V */
    public final void m6973V() {
        if (this.f8840l == null) {
            this.f8840l = new EdgeEffect(getContext());
            if (this.f8810H) {
                this.f8840l.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.f8840l.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* renamed from: W */
    public final String m6974W() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" ");
        stringBuilder.append(super.toString());
        stringBuilder.append(", adapter:");
        stringBuilder.append(this.f8805C);
        stringBuilder.append(", layout:");
        stringBuilder.append(this.f8821S);
        stringBuilder.append(", context:");
        stringBuilder.append(getContext());
        return stringBuilder.toString();
    }

    /* renamed from: W */
    private boolean m6946W() {
        int E = this.f8809G.m8926E();
        for (int i = 0; i < E; i++) {
            AnonymousClass0oo L = m6935L(this.f8809G.m8925D(i));
            if (L != null) {
                if (!L.m7728T()) {
                    if (L.m7723O()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: X */
    public final void m6975X(AnonymousClass0or anonymousClass0or) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f8842n.f13525G;
            overScroller.getFinalX();
            overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
        }
    }

    /* renamed from: X */
    private boolean m6947X(View view, View view2, int i) {
        int i2 = 0;
        if (view2 != null) {
            if (view2 != this) {
                if (view != null) {
                    if (i != 2) {
                        if (i != 1) {
                            return m6948Y(this, view, view2, i);
                        }
                    }
                    int i3 = this.f8821S.m7340b() == 1 ? 1 : 0;
                    if (i == 2) {
                        i2 = 1;
                    }
                    if (!m6948Y(this, view, view2, (i2 ^ i3) != 0 ? 66 : 17)) {
                        if (i == 2) {
                            return m6948Y(this, view, view2, 130);
                        }
                        return m6948Y(this, view, view2, 33);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: Y */
    public final View m6976Y(float f, float f2) {
        for (int E = this.f8809G.m8926E() - 1; E >= 0; E--) {
            View D = this.f8809G.m8925D(E);
            float translationX = D.getTranslationX();
            float translationY = D.getTranslationY();
            if (f >= ((float) D.getLeft()) + translationX && f <= ((float) D.getRight()) + translationX && f2 >= ((float) D.getTop()) + translationY && f2 <= ((float) D.getBottom()) + translationY) {
                return D;
            }
        }
        return null;
    }

    /* renamed from: Y */
    private static boolean m6948Y(RecyclerView recyclerView, View view, View view2, int i) {
        recyclerView.f8838j.set(0, 0, view.getWidth(), view.getHeight());
        recyclerView.QB.set(0, 0, view2.getWidth(), view2.getHeight());
        recyclerView.offsetDescendantRectToMyCoords(view, recyclerView.f8838j);
        recyclerView.offsetDescendantRectToMyCoords(view2, recyclerView.QB);
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("direction must be absolute. received:");
                        stringBuilder.append(i);
                        stringBuilder.append(recyclerView.m6946W());
                        throw new IllegalArgumentException(stringBuilder.toString());
                    } else if ((recyclerView.f8838j.top < recyclerView.QB.top || recyclerView.f8838j.bottom <= recyclerView.QB.top) && recyclerView.f8838j.bottom < recyclerView.QB.bottom) {
                        return true;
                    }
                } else if ((recyclerView.f8838j.left < recyclerView.QB.left || recyclerView.f8838j.right <= recyclerView.QB.left) && recyclerView.f8838j.right < recyclerView.QB.right) {
                    return true;
                }
            } else if ((recyclerView.f8838j.bottom > recyclerView.QB.bottom || recyclerView.f8838j.top >= recyclerView.QB.bottom) && recyclerView.f8838j.top > recyclerView.QB.top) {
                return true;
            }
        } else if ((recyclerView.f8838j.right > recyclerView.QB.right || recyclerView.f8838j.left >= recyclerView.QB.right) && recyclerView.f8838j.left > recyclerView.QB.left) {
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    public final View m6977Z(View view) {
        View parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return parent == this ? view : null;
    }

    /* renamed from: Z */
    private void m6949Z(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.NB) {
            actionIndex = actionIndex == 0 ? 1 : 0;
            this.NB = motionEvent.getPointerId(actionIndex);
            int x = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.AB = x;
            this.f8851w = x;
            x = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.BB = x;
            this.f8852x = x;
        }
    }

    /* renamed from: a */
    public final AnonymousClass0oo m6978a(int i) {
        AnonymousClass0oo anonymousClass0oo = null;
        if (!this.f8811I) {
            int G = this.f8809G.m8928G();
            for (int i2 = 0; i2 < G; i2++) {
                AnonymousClass0oo L = m6935L(this.f8809G.m8927F(i2));
                if (!(L == null || L.m7720L() || m6983f(L) != i)) {
                    if (!this.f8809G.m8930I(L.f10370B)) {
                        return L;
                    }
                    anonymousClass0oo = L;
                }
            }
        }
        return anonymousClass0oo;
    }

    /* renamed from: a */
    private boolean m6950a() {
        return this.f8817O != null && this.f8821S.UA();
    }

    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        AnonymousClass0la anonymousClass0la = this.f8821S;
        super.addFocusables(arrayList, i, i2);
    }

    /* renamed from: b */
    public final AnonymousClass0oo m6979b(long j) {
        AnonymousClass0nJ anonymousClass0nJ = this.f8805C;
        AnonymousClass0oo anonymousClass0oo = null;
        if (anonymousClass0nJ != null) {
            if (anonymousClass0nJ.hasStableIds()) {
                int G = this.f8809G.m8928G();
                for (int i = 0; i < G; i++) {
                    AnonymousClass0oo L = m6935L(this.f8809G.m8927F(i));
                    if (!(L == null || L.m7720L() || L.f10373E != j)) {
                        if (!this.f8809G.m8930I(L.f10370B)) {
                            return L;
                        }
                        anonymousClass0oo = L;
                    }
                }
            }
        }
        return anonymousClass0oo;
    }

    /* renamed from: b */
    private void m6951b() {
        Object obj;
        AnonymousClass0or anonymousClass0or;
        boolean z;
        if (this.f8811I) {
            AnonymousClass12T anonymousClass12T = this.f8806D;
            anonymousClass12T.m8918M(anonymousClass12T.f13540G);
            anonymousClass12T.m8918M(anonymousClass12T.f13541H);
            anonymousClass12T.f13537D = 0;
            this.f8821S.m7358t(this);
        }
        if (m6950a()) {
            this.f8806D.m8917L();
        } else {
            this.f8806D.m8908C();
        }
        boolean z2 = false;
        if (!this.f8819Q) {
            if (!this.f8820R) {
                obj = null;
                anonymousClass0or = this.f8837i;
                z = this.f8813K && this.f8817O != null && ((this.f8811I || obj != null || this.f8821S.f9553L) && (!this.f8811I || this.f8805C.hasStableIds()));
                anonymousClass0or.f10407K = z;
                anonymousClass0or = this.f8837i;
                if (anonymousClass0or.f10407K && obj != null && !this.f8811I && m6950a()) {
                    z2 = true;
                }
                anonymousClass0or.f10406J = z2;
            }
        }
        obj = 1;
        anonymousClass0or = this.f8837i;
        if (!this.f8813K) {
        }
        anonymousClass0or.f10407K = z;
        anonymousClass0or = this.f8837i;
        z2 = true;
        anonymousClass0or.f10406J = z2;
    }

    /* renamed from: c */
    public final AnonymousClass0oo m6980c(int i) {
        return m6981d(i, false);
    }

    /* renamed from: c */
    private void m6952c(View view, View view2) {
        View view3 = view;
        View view4 = view2 != null ? view2 : view;
        RecyclerView recyclerView = this;
        this.f8838j.set(0, 0, view4.getWidth(), view4.getHeight());
        LayoutParams layoutParams = view4.getLayoutParams();
        if (layoutParams instanceof AnonymousClass12d) {
            AnonymousClass12d anonymousClass12d = (AnonymousClass12d) layoutParams;
            if (!anonymousClass12d.f13587C) {
                Rect rect = anonymousClass12d.f13586B;
                Rect rect2 = this.f8838j;
                rect2.left -= rect.left;
                rect2 = this.f8838j;
                rect2.right += rect.right;
                rect2 = this.f8838j;
                rect2.top -= rect.top;
                rect2 = this.f8838j;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f8838j);
            offsetRectIntoDescendantCoords(view, this.f8838j);
        }
        this.f8821S.GA(recyclerView, view3, this.f8838j, this.f8813K ^ 1, view2 == null ? true : null);
    }

    public final boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof AnonymousClass12d) && this.f8821S.m7317E((AnonymousClass12d) layoutParams);
    }

    public final int computeHorizontalScrollExtent() {
        AnonymousClass0la anonymousClass0la = this.f8821S;
        if (anonymousClass0la != null && anonymousClass0la.mo1875C()) {
            return this.f8821S.mo1879H(this.f8837i);
        }
        return 0;
    }

    public final int computeHorizontalScrollOffset() {
        AnonymousClass0la anonymousClass0la = this.f8821S;
        if (anonymousClass0la != null && anonymousClass0la.mo1875C()) {
            return this.f8821S.mo1880I(this.f8837i);
        }
        return 0;
    }

    public final int computeHorizontalScrollRange() {
        AnonymousClass0la anonymousClass0la = this.f8821S;
        if (anonymousClass0la != null && anonymousClass0la.mo1875C()) {
            return this.f8821S.mo1882J(this.f8837i);
        }
        return 0;
    }

    public final int computeVerticalScrollExtent() {
        AnonymousClass0la anonymousClass0la = this.f8821S;
        if (anonymousClass0la != null && anonymousClass0la.mo1876D()) {
            return this.f8821S.mo1884K(this.f8837i);
        }
        return 0;
    }

    public final int computeVerticalScrollOffset() {
        AnonymousClass0la anonymousClass0la = this.f8821S;
        if (anonymousClass0la != null && anonymousClass0la.mo1876D()) {
            return this.f8821S.mo1886L(this.f8837i);
        }
        return 0;
    }

    public final int computeVerticalScrollRange() {
        AnonymousClass0la anonymousClass0la = this.f8821S;
        if (anonymousClass0la != null && anonymousClass0la.mo1876D()) {
            return this.f8821S.mo1887M(this.f8837i);
        }
        return 0;
    }

    /* renamed from: d */
    public final AnonymousClass0oo m6981d(int i, boolean z) {
        int G = this.f8809G.m8928G();
        AnonymousClass0oo anonymousClass0oo = null;
        for (int i2 = 0; i2 < G; i2++) {
            AnonymousClass0oo L = m6935L(this.f8809G.m8927F(i2));
            if (!(L == null || L.m7720L())) {
                if (z) {
                    if (L.f10380L != i) {
                    }
                } else if (L.m7714F() != i) {
                }
                if (!this.f8809G.m8930I(L.f10370B)) {
                    return L;
                }
                anonymousClass0oo = L;
            }
        }
        return anonymousClass0oo;
    }

    /* renamed from: d */
    private void m6953d() {
        int isFinished;
        VelocityTracker velocityTracker = this.SB;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        NA(0);
        EdgeEffect edgeEffect = this.f8824V;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            isFinished = this.f8824V.isFinished();
        } else {
            isFinished = 0;
        }
        edgeEffect = this.f8840l;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            isFinished |= this.f8840l.isFinished();
        }
        edgeEffect = this.f8833e;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            isFinished |= this.f8833e.isFinished();
        }
        edgeEffect = this.f8808F;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            isFinished |= this.f8808F.isFinished();
        }
        if (isFinished != 0) {
            AnonymousClass0mE.m7520J(this);
        }
    }

    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m8980A(f, f2, z);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m8981B(f, f2);
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m8982C(i, i2, iArr, iArr2);
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m8984E(i, i2, i3, i4, iArr);
    }

    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public final void draw(Canvas canvas) {
        int i;
        int i2;
        super.draw(canvas);
        int size = this.f8818P.size();
        int i3 = 0;
        for (i = 0; i < size; i++) {
            ((AnonymousClass0rv) this.f8818P.get(i)).mo2056C(canvas, this, this.f8837i);
        }
        EdgeEffect edgeEffect = this.f8824V;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            i2 = 0;
        } else {
            i = canvas.save();
            int paddingBottom = this.f8810H ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            edgeEffect = this.f8824V;
            i2 = (edgeEffect == null || !edgeEffect.draw(canvas)) ? 0 : 1;
            canvas.restoreToCount(i);
        }
        edgeEffect = this.f8840l;
        if (!(edgeEffect == null || edgeEffect.isFinished())) {
            i = canvas.save();
            if (this.f8810H) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            edgeEffect = this.f8840l;
            int i4 = (edgeEffect == null || !edgeEffect.draw(canvas)) ? 0 : 1;
            i2 |= i4;
            canvas.restoreToCount(i);
        }
        edgeEffect = this.f8833e;
        if (!(edgeEffect == null || edgeEffect.isFinished())) {
            size = canvas.save();
            i = getWidth();
            paddingBottom = this.f8810H ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingBottom), (float) (-i));
            edgeEffect = this.f8833e;
            i4 = (edgeEffect == null || !edgeEffect.draw(canvas)) ? 0 : 1;
            i2 |= i4;
            canvas.restoreToCount(size);
        }
        edgeEffect = this.f8808F;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            i3 = i2;
        } else {
            size = canvas.save();
            canvas.rotate(180.0f);
            if (this.f8810H) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            edgeEffect = this.f8808F;
            if (edgeEffect != null && edgeEffect.draw(canvas)) {
                i3 = 1;
            }
            i3 |= i2;
            canvas.restoreToCount(size);
        }
        if (i3 == 0 && this.f8817O != null && this.f8818P.size() > 0 && this.f8817O.mo2026K()) {
            i3 = 1;
        }
        if (i3 != 0) {
            AnonymousClass0mE.m7520J(this);
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: e */
    private void m6954e() {
        Object obj = this.f8842n;
        obj.f13526H.removeCallbacks(obj);
        obj.f13525G.abortAnimation();
        AnonymousClass0la anonymousClass0la = this.f8821S;
        if (anonymousClass0la != null) {
            AnonymousClass12r anonymousClass12r = anonymousClass0la.f9554M;
            if (anonymousClass12r != null) {
                anonymousClass12r.m9040E();
            }
        }
    }

    /* renamed from: e */
    public boolean mo1898e(int i, int i2) {
        AnonymousClass0la anonymousClass0la = this.f8821S;
        int i3 = 0;
        if (anonymousClass0la == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.f8822T) {
            boolean C = anonymousClass0la.mo1875C();
            boolean D = this.f8821S.mo1876D();
            if (!C || Math.abs(i) < this.EB) {
                i = 0;
            }
            if (!D || Math.abs(i2) < this.EB) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                float f = (float) i;
                float f2 = (float) i2;
                if (!dispatchNestedPreFling(f, f2)) {
                    boolean z;
                    AnonymousClass12s anonymousClass12s;
                    int i4;
                    int max;
                    int max2;
                    AnonymousClass12N anonymousClass12N;
                    if (!C) {
                        if (!D) {
                            z = false;
                            dispatchNestedFling(f, f2, z);
                            anonymousClass12s = this.HB;
                            if (anonymousClass12s == null && anonymousClass12s.m9041A(i, i2)) {
                                return true;
                            }
                            if (z) {
                                if (C) {
                                    i3 = 1;
                                }
                                if (D) {
                                    i3 |= 2;
                                }
                                MA(i3, 1);
                                i4 = this.DB;
                                max = Math.max(-i4, Math.min(i, i4));
                                i4 = this.DB;
                                max2 = Math.max(-i4, Math.min(i2, i4));
                                anonymousClass12N = this.f8842n;
                                anonymousClass12N.f13526H.setScrollState(2);
                                anonymousClass12N.f13523E = 0;
                                anonymousClass12N.f13522D = 0;
                                anonymousClass12N.f13525G.fling(0, 0, max, max2, Process.WAIT_RESULT_TIMEOUT, Integer.MAX_VALUE, Process.WAIT_RESULT_TIMEOUT, Integer.MAX_VALUE);
                                anonymousClass12N.m8895A();
                                return true;
                            }
                        }
                    }
                    z = true;
                    dispatchNestedFling(f, f2, z);
                    anonymousClass12s = this.HB;
                    if (anonymousClass12s == null) {
                    }
                    if (z) {
                        if (C) {
                            i3 = 1;
                        }
                        if (D) {
                            i3 |= 2;
                        }
                        MA(i3, 1);
                        i4 = this.DB;
                        max = Math.max(-i4, Math.min(i, i4));
                        i4 = this.DB;
                        max2 = Math.max(-i4, Math.min(i2, i4));
                        anonymousClass12N = this.f8842n;
                        anonymousClass12N.f13526H.setScrollState(2);
                        anonymousClass12N.f13523E = 0;
                        anonymousClass12N.f13522D = 0;
                        anonymousClass12N.f13525G.fling(0, 0, max, max2, Process.WAIT_RESULT_TIMEOUT, Integer.MAX_VALUE, Process.WAIT_RESULT_TIMEOUT, Integer.MAX_VALUE);
                        anonymousClass12N.m8895A();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final int m6983f(AnonymousClass0oo anonymousClass0oo) {
        if (!anonymousClass0oo.m7716H(524)) {
            if (anonymousClass0oo.m7717I()) {
                return this.f8806D.m8906A(anonymousClass0oo.f10380L);
            }
        }
        return -1;
    }

    public final View focusSearch(View view, int i) {
        Object obj = (this.f8805C == null || this.f8821S == null || m6992o() || this.f8822T) ? null : 1;
        FocusFinder instance = FocusFinder.getInstance();
        View findNextFocus;
        if (obj == null || !(i == 2 || i == 1)) {
            findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus == null && obj != null) {
                m6962H();
                if (m6977Z(view) != null) {
                    m6969O();
                    findNextFocus = this.f8821S.mo1894n(view, i, this.f8831c, this.f8837i);
                    DA(false);
                }
            }
            if (findNextFocus != null || findNextFocus.hasFocusable()) {
                if (m6947X(view, findNextFocus, i)) {
                    findNextFocus = super.focusSearch(view, i);
                }
                return findNextFocus;
            } else if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            } else {
                m6952c(findNextFocus, null);
                return view;
            }
        }
        int i2;
        Object obj2;
        if (this.f8821S.mo1876D()) {
            i2 = i == 2 ? 130 : 33;
            obj2 = instance.findNextFocus(this, view, i2) == null ? 1 : null;
            if (WB) {
                i = i2;
            }
        } else {
            obj2 = null;
        }
        if (obj2 == null && this.f8821S.mo1875C()) {
            i2 = ((this.f8821S.m7340b() == 1 ? 1 : 0) ^ (i == 2 ? 1 : 0)) != 0 ? 66 : 17;
            obj2 = instance.findNextFocus(this, view, i2) == null ? 1 : null;
            if (WB) {
                i = i2;
            }
        }
        if (obj2 != null) {
            m6962H();
            if (m6977Z(view) != null) {
                m6969O();
                this.f8821S.mo1894n(view, i, this.f8831c, this.f8837i);
                DA(false);
            }
        }
        findNextFocus = instance.findNextFocus(this, view, i);
        if (findNextFocus != null) {
        }
        if (m6947X(view, findNextFocus, i)) {
            findNextFocus = super.focusSearch(view, i);
        }
        return findNextFocus;
        return null;
    }

    /* renamed from: g */
    public final long m6984g(AnonymousClass0oo anonymousClass0oo) {
        if (this.f8805C.hasStableIds()) {
            return anonymousClass0oo.f10373E;
        }
        return (long) anonymousClass0oo.f10380L;
    }

    public final LayoutParams generateDefaultLayoutParams() {
        AnonymousClass0la anonymousClass0la = this.f8821S;
        if (anonymousClass0la != null) {
            return anonymousClass0la.mo1889P();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RecyclerView has no LayoutManager");
        stringBuilder.append(m6946W());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AnonymousClass0la anonymousClass0la = this.f8821S;
        if (anonymousClass0la != null) {
            return anonymousClass0la.m7329Q(getContext(), attributeSet);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RecyclerView has no LayoutManager");
        stringBuilder.append(m6946W());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        AnonymousClass0la anonymousClass0la = this.f8821S;
        if (anonymousClass0la != null) {
            return anonymousClass0la.m7330R(layoutParams);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RecyclerView has no LayoutManager");
        stringBuilder.append(m6946W());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public AnonymousClass0nJ getAdapter() {
        return this.f8805C;
    }

    public int getBaseline() {
        if (this.f8821S != null) {
            return -1;
        }
        return super.getBaseline();
    }

    public final int getChildDrawingOrder(int i, int i2) {
        AnonymousClass12t anonymousClass12t = this.f8847s;
        if (anonymousClass12t == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return anonymousClass12t.Pn(i, i2);
    }

    public boolean getClipToPadding() {
        return this.f8810H;
    }

    public AnonymousClass12X getCompatAccessibilityDelegate() {
        return this.f8804B;
    }

    public AnonymousClass10p getItemAnimator() {
        return this.f8817O;
    }

    public AnonymousClass0la getLayoutManager() {
        return this.f8821S;
    }

    public int getMaxFlingVelocity() {
        return this.DB;
    }

    public int getMinFlingVelocity() {
        return this.EB;
    }

    public long getNanoTime() {
        return UB ? System.nanoTime() : 0;
    }

    public AnonymousClass12s getOnFlingListener() {
        return this.HB;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f8830b;
    }

    public AnonymousClass12f getRecycledViewPool() {
        return this.f8831c.m8871E();
    }

    public int getScrollState() {
        return this.OB;
    }

    private AnonymousClass12k getScrollingChildHelper() {
        if (this.PB == null) {
            this.PB = new AnonymousClass12k(this);
        }
        return this.PB;
    }

    /* renamed from: h */
    public final AnonymousClass0oo m6985h(View view) {
        Object parent = view.getParent();
        if (parent != null) {
            if (parent != this) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("View ");
                stringBuilder.append(view);
                stringBuilder.append(" is not a direct child of ");
                stringBuilder.append(this);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return m6935L(view);
    }

    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m8986G();
    }

    /* renamed from: i */
    public final Rect m6986i(View view) {
        AnonymousClass12d anonymousClass12d = (AnonymousClass12d) view.getLayoutParams();
        if (anonymousClass12d.f13587C) {
            if (this.f8837i.f10402F) {
                if (!anonymousClass12d.f13589E.m7723O()) {
                    if (anonymousClass12d.f13589E.m7718J()) {
                    }
                }
            }
            Rect rect = anonymousClass12d.f13586B;
            rect.set(0, 0, 0, 0);
            int size = this.f8818P.size();
            for (int i = 0; i < size; i++) {
                this.f8838j.set(0, 0, 0, 0);
                ((AnonymousClass0rv) this.f8818P.get(i)).mo1900A(this.f8838j, view, this, this.f8837i);
                rect.left += this.f8838j.left;
                rect.top += this.f8838j.top;
                rect.right += this.f8838j.right;
                rect.bottom += this.f8838j.bottom;
            }
            anonymousClass12d.f13587C = false;
            return rect;
        }
        return anonymousClass12d.f13586B;
    }

    public final boolean isAttachedToWindow() {
        return this.f8816N;
    }

    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f13610B;
    }

    /* renamed from: j */
    public final AnonymousClass0rv m6987j(int i) {
        if (i >= 0) {
            if (i < this.f8818P.size()) {
                return (AnonymousClass0rv) this.f8818P.get(i);
            }
        }
        return null;
    }

    /* renamed from: k */
    public final boolean m6988k(int i) {
        return getScrollingChildHelper().m8987H(i);
    }

    /* renamed from: l */
    public final boolean m6989l() {
        if (this.f8813K && !this.f8811I) {
            if (!this.f8806D.m8912G()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final void m6990m() {
        if (this.f8818P.size() != 0) {
            AnonymousClass0la anonymousClass0la = this.f8821S;
            if (anonymousClass0la != null) {
                anonymousClass0la.mo1872A("Cannot invalidate item decorations during a scroll or layout");
            }
            m6994q();
            requestLayout();
        }
    }

    /* renamed from: n */
    public final boolean m6991n() {
        AccessibilityManager accessibilityManager = this.f8845q;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* renamed from: o */
    public final boolean m6992o() {
        return this.CB > 0;
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.m5864N(this, -256248927);
        super.onAttachedToWindow();
        this.CB = 0;
        boolean z = true;
        this.f8816N = true;
        if (!this.f8813K || isLayoutRequested()) {
            z = false;
        }
        this.f8813K = z;
        AnonymousClass0la anonymousClass0la = this.f8821S;
        this.f8828Z = false;
        if (UB) {
            AnonymousClass12u anonymousClass12u = (AnonymousClass12u) AnonymousClass12u.f13632F.get();
            this.f8814L = anonymousClass12u;
            if (anonymousClass12u == null) {
                float refreshRate;
                this.f8814L = new AnonymousClass12u();
                Display B = AnonymousClass0mE.f9733B.mo2064B((View) this);
                if (!(isInEditMode() || B == null)) {
                    refreshRate = B.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        this.f8814L.f13634B = (long) (1.0E9f / refreshRate);
                        AnonymousClass12u.f13632F.set(this.f8814L);
                    }
                }
                refreshRate = 60.0f;
                this.f8814L.f13634B = (long) (1.0E9f / refreshRate);
                AnonymousClass12u.f13632F.set(this.f8814L);
            }
            this.f8814L.f13636D.add(this);
        }
        AnonymousClass0cQ.m5865O(this, 1179269085, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.m5864N(this, -582769335);
        super.onDetachedFromWindow();
        AnonymousClass10p anonymousClass10p = this.f8817O;
        if (anonymousClass10p != null) {
            anonymousClass10p.mo2025J();
        }
        OA();
        this.f8816N = false;
        AnonymousClass0la anonymousClass0la = this.f8821S;
        if (anonymousClass0la != null) {
            anonymousClass0la.mo1893m(this, this.f8831c);
        }
        this.f8827Y.clear();
        removeCallbacks(this.f8854z);
        while (AnonymousClass12j.f13603E.acquire() != null) {
        }
        if (UB) {
            AnonymousClass12u anonymousClass12u = this.f8814L;
            if (anonymousClass12u != null) {
                anonymousClass12u.f13636D.remove(this);
                this.f8814L = null;
            }
        }
        AnonymousClass0cQ.m5865O(this, 1664462310, N);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f8818P.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass0rv) this.f8818P.get(i)).mo2022B(canvas, this, this.f8837i);
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (this.f8821S != null) {
            if (!this.f8822T) {
                if (motionEvent.getAction() == 8) {
                    float f;
                    float axisValue;
                    if ((motionEvent.getSource() & 2) != 0) {
                        f = this.f8821S.mo1876D() ? -motionEvent.getAxisValue(9) : 0.0f;
                        if (this.f8821S.mo1875C()) {
                            axisValue = motionEvent.getAxisValue(10);
                            if (!(f == 0.0f && axisValue == 0.0f)) {
                                EA((int) (axisValue * this.KB), (int) (f * this.LB), motionEvent);
                            }
                        }
                    } else {
                        if ((motionEvent.getSource() & 4194304) != 0) {
                            axisValue = motionEvent.getAxisValue(26);
                            if (this.f8821S.mo1876D()) {
                                f = -axisValue;
                            } else if (this.f8821S.mo1875C()) {
                                f = 0.0f;
                                EA((int) (axisValue * this.KB), (int) (f * this.LB), motionEvent);
                            }
                        }
                        f = 0.0f;
                    }
                    axisValue = 0.0f;
                    EA((int) (axisValue * this.KB), (int) (f * this.LB), motionEvent);
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (!this.f8822T) {
            if (m6944U(motionEvent)) {
                m6940Q();
                return true;
            }
            AnonymousClass0la anonymousClass0la = this.f8821S;
            if (anonymousClass0la != null) {
                boolean C = anonymousClass0la.mo1875C();
                boolean D = this.f8821S.mo1876D();
                if (this.SB == null) {
                    this.SB = VelocityTracker.obtain();
                }
                this.SB.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                switch (actionMasked) {
                    case 0:
                        if (this.f8850v) {
                            this.f8850v = false;
                        }
                        this.NB = motionEvent.getPointerId(0);
                        actionMasked = (int) (motionEvent.getX() + 0.5f);
                        this.AB = actionMasked;
                        this.f8851w = actionMasked;
                        actionMasked = (int) (motionEvent.getY() + 0.5f);
                        this.BB = actionMasked;
                        this.f8852x = actionMasked;
                        if (this.OB == 2) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            setScrollState(1);
                        }
                        int[] iArr = this.FB;
                        iArr[1] = 0;
                        iArr[0] = 0;
                        actionMasked = C ? 1 : 0;
                        if (D) {
                            actionMasked |= 2;
                        }
                        MA(actionMasked, 0);
                        break;
                    case 1:
                        this.SB.clear();
                        NA(0);
                        break;
                    case 2:
                        actionIndex = motionEvent.findPointerIndex(this.NB);
                        if (actionIndex >= 0) {
                            int x = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            int y = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            if (this.OB != 1) {
                                Object obj;
                                actionIndex = x - this.f8851w;
                                int i = y - this.f8852x;
                                if (!C || Math.abs(actionIndex) <= this.RB) {
                                    obj = null;
                                } else {
                                    this.AB = x;
                                    obj = 1;
                                }
                                if (D && Math.abs(i) > this.RB) {
                                    this.BB = y;
                                    obj = 1;
                                }
                                if (obj != null) {
                                    setScrollState(1);
                                    break;
                                }
                            }
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Error processing scroll; pointer index for id ");
                        stringBuilder.append(this.NB);
                        stringBuilder.append(" not found. Did any MotionEvents get skipped?");
                        Log.e("RecyclerView", stringBuilder.toString());
                        return false;
                        break;
                    case 3:
                        m6940Q();
                        break;
                    case 4:
                        break;
                    case 5:
                        this.NB = motionEvent.getPointerId(actionIndex);
                        actionMasked = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.AB = actionMasked;
                        this.f8851w = actionMasked;
                        actionMasked = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.BB = actionMasked;
                        this.f8852x = actionMasked;
                        break;
                    case 6:
                        m6949Z(motionEvent);
                        break;
                    default:
                        break;
                }
                if (this.OB == 1) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AnonymousClass12m.m8993B("RV OnLayout");
        m6965K();
        AnonymousClass12m.m8994C();
        this.f8813K = true;
    }

    public void onMeasure(int i, int i2) {
        AnonymousClass0la anonymousClass0la = this.f8821S;
        if (anonymousClass0la == null) {
            m6963I(i, i2);
            return;
        }
        boolean z = false;
        if (anonymousClass0la.f9543B) {
            int mode = MeasureSpec.getMode(i);
            int mode2 = MeasureSpec.getMode(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f8821S.mo1906z(this.f8831c, this.f8837i, i, i2);
            if (!z) {
                if (this.f8805C != null) {
                    if (this.f8837i.f10404H == 1) {
                        m6941R();
                    }
                    this.f8821S.MA(i, i2);
                    m6942S();
                    this.f8821S.OA(i, i2);
                    if (this.f8821S.RA()) {
                        this.f8821S.MA(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                        m6942S();
                        this.f8821S.OA(i, i2);
                    }
                }
            }
        } else if (this.f8815M) {
            this.f8821S.mo1906z(this.f8831c, this.f8837i, i, i2);
        } else {
            if (this.f8807E) {
                m6969O();
                m6996s();
                m6951b();
                m6997t();
                if (this.f8837i.f10406J) {
                    this.f8837i.f10402F = true;
                } else {
                    this.f8806D.m8908C();
                    this.f8837i.f10402F = false;
                }
                this.f8807E = false;
                DA(false);
            } else if (this.f8837i.f10406J) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AnonymousClass0nJ anonymousClass0nJ = this.f8805C;
            if (anonymousClass0nJ != null) {
                this.f8837i.f10403G = anonymousClass0nJ.mo1813B();
            } else {
                this.f8837i.f10403G = 0;
            }
            m6969O();
            this.f8821S.mo1906z(this.f8831c, this.f8837i, i, i2);
            DA(false);
            this.f8837i.f10402F = false;
        }
    }

    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m6992o()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.JB = savedState;
            super.onRestoreInstanceState(savedState.f13609B);
            if (!(this.f8821S == null || this.JB.f13607B == null)) {
                this.f8821S.AA(this.JB.f13607B);
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.JB;
        if (savedState2 != null) {
            savedState.f13607B = savedState2.f13607B;
        } else {
            AnonymousClass0la anonymousClass0la = this.f8821S;
            if (anonymousClass0la != null) {
                savedState.f13607B = anonymousClass0la.BA();
            } else {
                savedState.f13607B = null;
            }
        }
        return savedState;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.m5864N(this, -619864568);
        super.onSizeChanged(i, i2, i3, i4);
        if (!(i == i3 && i2 == i4)) {
            this.f8808F = null;
            this.f8840l = null;
            this.f8833e = null;
            this.f8824V = null;
        }
        AnonymousClass0cQ.m5865O(this, 1039808403, N);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.m5863M(this, -1208468912);
        boolean z = false;
        if (!this.f8822T) {
            if (!r3.f8850v) {
                MotionEvent motionEvent2 = motionEvent;
                if (m6943T(motionEvent2)) {
                    m6940Q();
                    AnonymousClass0cQ.m5862L(r3, 200208549, M);
                    return true;
                }
                AnonymousClass0la anonymousClass0la = r3.f8821S;
                if (anonymousClass0la == null) {
                    AnonymousClass0cQ.m5862L(r3, -1930549852, M);
                    return false;
                }
                boolean C = anonymousClass0la.mo1875C();
                boolean D = r3.f8821S.mo1876D();
                if (r3.SB == null) {
                    r3.SB = VelocityTracker.obtain();
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent2);
                int actionMasked = motionEvent2.getActionMasked();
                int actionIndex = motionEvent2.getActionIndex();
                if (actionMasked == 0) {
                    int[] iArr = r3.FB;
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                int[] iArr2 = r3.FB;
                obtain.offsetLocation((float) iArr2[0], (float) iArr2[1]);
                int x;
                switch (actionMasked) {
                    case 0:
                        r3.NB = motionEvent2.getPointerId(0);
                        x = (int) (motionEvent2.getX() + 0.5f);
                        r3.AB = x;
                        r3.f8851w = x;
                        x = (int) (motionEvent2.getY() + 0.5f);
                        r3.BB = x;
                        r3.f8852x = x;
                        x = C ? 1 : 0;
                        if (D) {
                            x |= 2;
                        }
                        MA(x, 0);
                        break;
                    case 1:
                        r3.SB.addMovement(obtain);
                        r3.SB.computeCurrentVelocity(JsonMappingException.MAX_REFS_TO_LIST, (float) r3.DB);
                        float f = C ? -r3.SB.getXVelocity(r3.NB) : 0.0f;
                        float f2 = D ? -r3.SB.getYVelocity(r3.NB) : 0.0f;
                        if ((f == 0.0f && f2 == 0.0f) || !mo1898e((int) f, (int) f2)) {
                            setScrollState(0);
                        }
                        m6953d();
                        z = true;
                        break;
                    case 2:
                        int findPointerIndex = motionEvent2.findPointerIndex(r3.NB);
                        if (findPointerIndex >= 0) {
                            int[] iArr3;
                            actionMasked = (int) (motionEvent2.getX(findPointerIndex) + 0.5f);
                            actionIndex = (int) (motionEvent2.getY(findPointerIndex) + 0.5f);
                            int i = r3.AB - actionMasked;
                            int i2 = r3.BB - actionIndex;
                            if (m6966L(i, i2, r3.f8834f, r3.MB, null)) {
                                iArr3 = r3.f8834f;
                                i -= iArr3[0];
                                i2 -= iArr3[1];
                                iArr2 = r3.MB;
                                obtain.offsetLocation((float) iArr2[0], (float) iArr2[1]);
                                int[] iArr4 = r3.FB;
                                findPointerIndex = iArr4[0];
                                iArr2 = r3.MB;
                                iArr4[0] = findPointerIndex + iArr2[0];
                                iArr4[1] = iArr4[1] + iArr2[1];
                            }
                            if (r3.OB != 1) {
                                Object obj;
                                if (C) {
                                    findPointerIndex = Math.abs(i);
                                    x = r3.RB;
                                    if (findPointerIndex > x) {
                                        i = i > 0 ? i - x : i + x;
                                        obj = 1;
                                        if (D) {
                                            findPointerIndex = Math.abs(i2);
                                            x = r3.RB;
                                            if (findPointerIndex > x) {
                                                i2 = i2 <= 0 ? i2 - x : i2 + x;
                                                obj = 1;
                                            }
                                        }
                                        if (obj != null) {
                                            setScrollState(1);
                                        }
                                    }
                                }
                                obj = null;
                                if (D) {
                                    findPointerIndex = Math.abs(i2);
                                    x = r3.RB;
                                    if (findPointerIndex > x) {
                                        if (i2 <= 0) {
                                        }
                                        obj = 1;
                                    }
                                }
                                if (obj != null) {
                                    setScrollState(1);
                                }
                            }
                            if (r3.OB == 1) {
                                iArr3 = r3.MB;
                                r3.AB = actionMasked - iArr3[0];
                                r3.BB = actionIndex - iArr3[1];
                                if (EA(C ? i : 0, D ? i2 : 0, obtain)) {
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                if (!(r3.f8814L == null || (i == 0 && i2 == 0))) {
                                    r3.f8814L.m9045A(r3, i, i2);
                                    break;
                                }
                            }
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Error processing scroll; pointer index for id ");
                        stringBuilder.append(r3.NB);
                        stringBuilder.append(" not found. Did any MotionEvents get skipped?");
                        Log.e("RecyclerView", stringBuilder.toString());
                        AnonymousClass0cQ.m5862L(r3, -1118324419, M);
                        return false;
                        break;
                    case 3:
                        m6940Q();
                        break;
                    case 4:
                        break;
                    case 5:
                        r3.NB = motionEvent2.getPointerId(actionIndex);
                        x = (int) (motionEvent2.getX(actionIndex) + 0.5f);
                        r3.AB = x;
                        r3.f8851w = x;
                        x = (int) (motionEvent2.getY(actionIndex) + 0.5f);
                        r3.BB = x;
                        r3.f8852x = x;
                        break;
                    case 6:
                        m6949Z(motionEvent2);
                        break;
                    default:
                        break;
                }
                if (!z) {
                    r3.SB.addMovement(obtain);
                }
                obtain.recycle();
                AnonymousClass0cQ.m5862L(r3, 1027477279, M);
                return true;
            }
        }
        AnonymousClass0cQ.m5862L(r3, -370241940, M);
        return false;
    }

    /* renamed from: p */
    public final void m6993p(int i) {
        AnonymousClass0la anonymousClass0la = this.f8821S;
        if (anonymousClass0la != null) {
            anonymousClass0la.JA(i);
            awakenScrollBars();
        }
    }

    /* renamed from: q */
    public final void m6994q() {
        int i;
        int G = this.f8809G.m8928G();
        for (i = 0; i < G; i++) {
            ((AnonymousClass12d) this.f8809G.m8927F(i).getLayoutParams()).f13587C = true;
        }
        AnonymousClass12K anonymousClass12K = this.f8831c;
        G = anonymousClass12K.f13509C.size();
        for (i = 0; i < G; i++) {
            AnonymousClass12d anonymousClass12d = (AnonymousClass12d) ((AnonymousClass0oo) anonymousClass12K.f13509C.get(i)).f10370B.getLayoutParams();
            if (anonymousClass12d != null) {
                anonymousClass12d.f13587C = true;
            }
        }
    }

    /* renamed from: r */
    public final void m6995r(int i, int i2, boolean z) {
        int i3 = i + i2;
        int G = this.f8809G.m8928G();
        for (int i4 = 0; i4 < G; i4++) {
            AnonymousClass0oo L = m6935L(this.f8809G.m8927F(i4));
            if (!(L == null || L.m7728T())) {
                if (L.f10380L >= i3) {
                    L.m7724P(-i2, z);
                    this.f8837i.f10408L = true;
                } else if (L.f10380L >= i) {
                    int i5 = i - 1;
                    int i6 = -i2;
                    L.m7710B(8);
                    L.m7724P(i6, z);
                    L.f10380L = i5;
                    this.f8837i.f10408L = true;
                }
            }
        }
        AnonymousClass12K anonymousClass12K = this.f8831c;
        int i7 = i + i2;
        for (i5 = anonymousClass12K.f13509C.size() - 1; i5 >= 0; i5--) {
            AnonymousClass0oo anonymousClass0oo = (AnonymousClass0oo) anonymousClass12K.f13509C.get(i5);
            if (anonymousClass0oo != null) {
                if (anonymousClass0oo.f10380L >= i7) {
                    anonymousClass0oo.m7724P(-i2, z);
                } else if (anonymousClass0oo.f10380L >= i) {
                    anonymousClass0oo.m7710B(8);
                    anonymousClass12K.m8877K(i5);
                }
            }
        }
        requestLayout();
    }

    public final void removeDetachedView(View view, boolean z) {
        AnonymousClass0oo L = m6935L(view);
        if (L != null) {
            if (L.m7722N()) {
                L.f10371C &= -257;
            } else if (!L.m7728T()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                stringBuilder.append(L);
                stringBuilder.append(m6946W());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        view.clearAnimation();
        m6933J(view);
        super.removeDetachedView(view, z);
    }

    public final void requestChildFocus(View view, View view2) {
        AnonymousClass12r anonymousClass12r = this.f8821S.f9554M;
        Object obj = (anonymousClass12r == null || !anonymousClass12r.f13628E) ? null : 1;
        if (obj == null) {
            if (!m6992o()) {
                obj = null;
                if (obj == null && view2 != null) {
                    m6952c(view, view2);
                }
                super.requestChildFocus(view, view2);
            }
        }
        obj = 1;
        m6952c(view, view2);
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f8821S.GA(this, view, rect, z, false);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.IB.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass12b) this.IB.get(i)).ww(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void requestLayout() {
        if (this.f8849u != 0 || this.f8822T) {
            this.f8823U = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public final void m6996s() {
        this.CB++;
    }

    public final void scrollBy(int i, int i2) {
        AnonymousClass0la anonymousClass0la = this.f8821S;
        if (anonymousClass0la == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (!this.f8822T) {
            boolean C = anonymousClass0la.mo1875C();
            boolean D = this.f8821S.mo1876D();
            if (C || D) {
                if (!C) {
                    i = 0;
                }
                if (!D) {
                    i2 = 0;
                }
                EA(i, i2, null);
            }
        }
    }

    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!IA(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(AnonymousClass12X anonymousClass12X) {
        this.f8804B = anonymousClass12X;
        AnonymousClass0mE.m7523M(this, anonymousClass12X);
    }

    public void setAdapter(AnonymousClass0nJ anonymousClass0nJ) {
        setLayoutFrozen(false);
        m6939P(this, anonymousClass0nJ, false, true);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(AnonymousClass12t anonymousClass12t) {
        if (anonymousClass12t != this.f8847s) {
            this.f8847s = anonymousClass12t;
            setChildrenDrawingOrderEnabled(anonymousClass12t != null);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f8810H) {
            this.f8808F = null;
            this.f8840l = null;
            this.f8833e = null;
            this.f8824V = null;
        }
        this.f8810H = z;
        super.setClipToPadding(z);
        if (this.f8813K) {
            requestLayout();
        }
    }

    public void setHasFixedSize(boolean z) {
        this.f8815M = z;
    }

    public void setItemAnimator(AnonymousClass10p anonymousClass10p) {
        AnonymousClass10p anonymousClass10p2 = this.f8817O;
        if (anonymousClass10p2 != null) {
            anonymousClass10p2.mo2025J();
            this.f8817O.f13326E = null;
        }
        this.f8817O = anonymousClass10p;
        if (anonymousClass10p != null) {
            anonymousClass10p.f13326E = this.f8853y;
        }
    }

    public void setItemViewCacheSize(int i) {
        AnonymousClass12K anonymousClass12K = this.f8831c;
        anonymousClass12K.f13512F = i;
        anonymousClass12K.m8883Q();
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.f8822T) {
            m6959E("Do not setLayoutFrozen in layout or scroll");
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f8822T = true;
                this.f8850v = true;
                OA();
                return;
            }
            this.f8822T = false;
            if (!(!this.f8823U || this.f8821S == null || this.f8805C == null)) {
                requestLayout();
            }
            this.f8823U = false;
        }
    }

    public void setLayoutManager(AnonymousClass0la anonymousClass0la) {
        if (anonymousClass0la != this.f8821S) {
            OA();
            if (this.f8821S != null) {
                AnonymousClass10p anonymousClass10p = this.f8817O;
                if (anonymousClass10p != null) {
                    anonymousClass10p.mo2025J();
                }
                this.f8821S.DA(this.f8831c);
                this.f8821S.EA(this.f8831c);
                this.f8831c.m8868B();
                if (this.f8816N) {
                    this.f8821S.mo1893m(this, this.f8831c);
                }
                this.f8821S.PA(null);
                this.f8821S = null;
            } else {
                this.f8831c.m8868B();
            }
            AnonymousClass12V anonymousClass12V = this.f8809G;
            AnonymousClass12c anonymousClass12c = anonymousClass12V.f13544B;
            anonymousClass12c.f13584B = 0;
            AnonymousClass12c anonymousClass12c2 = anonymousClass12c.f13585C;
            if (anonymousClass12c2 != null) {
                anonymousClass12c2.m8958F();
            }
            for (int size = anonymousClass12V.f13546D.size() - 1; size >= 0; size--) {
                anonymousClass12V.f13545C.Wp((View) anonymousClass12V.f13546D.get(size));
                anonymousClass12V.f13546D.remove(size);
            }
            anonymousClass12V.f13545C.aJA();
            this.f8821S = anonymousClass0la;
            if (anonymousClass0la != null) {
                if (anonymousClass0la.f9552K == null) {
                    this.f8821S.PA(this);
                    if (this.f8816N) {
                    }
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("LayoutManager ");
                    stringBuilder.append(anonymousClass0la);
                    stringBuilder.append(" is already attached to a RecyclerView:");
                    stringBuilder.append(anonymousClass0la.f9552K.m6946W());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            this.f8831c.m8883Q();
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().m8988I(z);
    }

    public void setOnFlingListener(AnonymousClass12s anonymousClass12s) {
        this.HB = anonymousClass12s;
    }

    public void setOnScrollListener(AnonymousClass0Gv anonymousClass0Gv) {
        this.f8835g = anonymousClass0Gv;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f8830b = z;
    }

    public void setRecycledViewPool(AnonymousClass12f anonymousClass12f) {
        AnonymousClass12K anonymousClass12K = this.f8831c;
        AnonymousClass12f anonymousClass12f2 = anonymousClass12K.f13511E;
        if (anonymousClass12f2 != null) {
            anonymousClass12f2.f13590B--;
        }
        anonymousClass12K.f13511E = anonymousClass12f;
        if (anonymousClass12f != null) {
            anonymousClass12f2 = anonymousClass12K.f13511E;
            anonymousClass12K.f13516J.getAdapter();
            anonymousClass12f2.f13590B++;
        }
    }

    public void setRecyclerListener(AnonymousClass12v anonymousClass12v) {
        this.f8832d = anonymousClass12v;
    }

    public void setScrollState(int i) {
        if (i != this.OB) {
            this.OB = i;
            if (i != 2) {
                m6954e();
            }
            AnonymousClass0la anonymousClass0la = this.f8821S;
            AnonymousClass0Gv anonymousClass0Gv = this.f8835g;
            if (anonymousClass0Gv != null) {
                anonymousClass0Gv.mo357A(this, i);
            }
            List list = this.f8836h;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((AnonymousClass0Gv) this.f8836h.get(size)).mo357A(this, i);
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        switch (i) {
            case 0:
                break;
            case 1:
                this.RB = viewConfiguration.getScaledPagingTouchSlop();
                return;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("setScrollingTouchSlop(): bad argument constant ");
                stringBuilder.append(i);
                stringBuilder.append("; using default value");
                Log.w("RecyclerView", stringBuilder.toString());
                break;
        }
        this.RB = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AnonymousClass12w anonymousClass12w) {
        this.f8831c.f13514H = anonymousClass12w;
    }

    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m8989J(i);
    }

    public final void stopNestedScroll() {
        getScrollingChildHelper().m8991L();
    }

    /* renamed from: t */
    public final void m6997t() {
        m6998u(true);
    }

    /* renamed from: u */
    public final void m6998u(boolean z) {
        int i = this.CB - 1;
        this.CB = i;
        if (i < 1) {
            this.CB = 0;
            if (z) {
                int i2 = this.f8812J;
                this.f8812J = 0;
                if (i2 != 0 && m6991n()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(DexStore.LOAD_RESULT_OATMEAL_QUICKEN_ATTEMPTED);
                    AnonymousClass12o.f13616B.mo2475B(obtain, i2);
                    sendAccessibilityEventUnchecked(obtain);
                }
                for (int size = this.f8827Y.size() - 1; size >= 0; size--) {
                    AnonymousClass0oo anonymousClass0oo = (AnonymousClass0oo) this.f8827Y.get(size);
                    if (anonymousClass0oo.f10370B.getParent() == this) {
                        if (!anonymousClass0oo.m7728T()) {
                            i2 = anonymousClass0oo.f10379K;
                            if (i2 != -1) {
                                AnonymousClass0mE.m7525O(anonymousClass0oo.f10370B, i2);
                                anonymousClass0oo.f10379K = -1;
                            }
                        }
                    }
                }
                this.f8827Y.clear();
            }
        }
    }

    /* renamed from: v */
    public final void m6999v() {
        if (!this.f8828Z && this.f8816N) {
            AnonymousClass0mE.m7521K(this, this.f8854z);
            this.f8828Z = true;
        }
    }

    /* renamed from: w */
    public final void m7000w(AnonymousClass0oo anonymousClass0oo, AnonymousClass12i anonymousClass12i) {
        anonymousClass0oo.m7726R(0, DexStore.LOAD_RESULT_MIXED_MODE_ATTEMPTED);
        if (this.f8837i.f10410N && anonymousClass0oo.m7723O() && !anonymousClass0oo.m7720L() && !anonymousClass0oo.m7728T()) {
            this.f8844p.m8887B(m6984g(anonymousClass0oo), anonymousClass0oo);
        }
        this.f8844p.m8889D(anonymousClass0oo, anonymousClass12i);
    }

    /* renamed from: x */
    public final void m7001x() {
        AnonymousClass10p anonymousClass10p = this.f8817O;
        if (anonymousClass10p != null) {
            anonymousClass10p.mo2025J();
        }
        AnonymousClass0la anonymousClass0la = this.f8821S;
        if (anonymousClass0la != null) {
            anonymousClass0la.DA(this.f8831c);
            this.f8821S.EA(this.f8831c);
        }
        this.f8831c.m8868B();
    }

    /* renamed from: y */
    public final void m7002y(AnonymousClass0rv anonymousClass0rv) {
        AnonymousClass0la anonymousClass0la = this.f8821S;
        if (anonymousClass0la != null) {
            anonymousClass0la.mo1872A("Cannot remove item decoration during a scroll  or layout");
        }
        this.f8818P.remove(anonymousClass0rv);
        if (this.f8818P.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        m6994q();
        requestLayout();
    }

    /* renamed from: z */
    public final void m7003z(AnonymousClass12l anonymousClass12l) {
        List list = this.f8826X;
        if (list != null) {
            list.remove(anonymousClass12l);
        }
    }
}
