package android.support.v4.widget;

import X.AnonymousClass0Ca;
import X.AnonymousClass0cQ;
import X.AnonymousClass0mE;
import X.AnonymousClass1m2;
import X.AnonymousClass1m3;
import X.AnonymousClass1me;
import X.AnonymousClass1nI;
import X.AnonymousClass1nJ;
import X.AnonymousClass1nK;
import X.AnonymousClass1nL;
import X.AnonymousClass1nM;
import X.AnonymousClass1nN;
import X.AnonymousClass1nr;
import X.AnonymousClass2Og;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.AbsSavedState;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowInsets;
import com.facebook.forker.Process;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout extends ViewGroup {
    /* renamed from: j */
    public static final boolean f22707j;
    /* renamed from: k */
    public static final int[] f22708k = new int[]{16842931};
    /* renamed from: l */
    private static final boolean f22709l;
    /* renamed from: m */
    private static final int[] f22710m = new int[]{16843828};
    /* renamed from: B */
    public boolean f22711B;
    /* renamed from: C */
    public boolean f22712C;
    /* renamed from: D */
    public Object f22713D;
    /* renamed from: E */
    public List f22714E;
    /* renamed from: F */
    private final AnonymousClass1nK f22715F;
    /* renamed from: G */
    private float f22716G;
    /* renamed from: H */
    private int f22717H;
    /* renamed from: I */
    private boolean f22718I;
    /* renamed from: J */
    private boolean f22719J;
    /* renamed from: K */
    private float f22720K;
    /* renamed from: L */
    private float f22721L;
    /* renamed from: M */
    private final AnonymousClass2Og f22722M;
    /* renamed from: N */
    private final AnonymousClass1nr f22723N;
    /* renamed from: O */
    private AnonymousClass1nL f22724O;
    /* renamed from: P */
    private int f22725P;
    /* renamed from: Q */
    private int f22726Q;
    /* renamed from: R */
    private int f22727R;
    /* renamed from: S */
    private int f22728S;
    /* renamed from: T */
    private int f22729T;
    /* renamed from: U */
    private final ArrayList f22730U;
    /* renamed from: V */
    private final AnonymousClass2Og f22731V;
    /* renamed from: W */
    private final AnonymousClass1nr f22732W;
    /* renamed from: X */
    private int f22733X;
    /* renamed from: Y */
    private float f22734Y;
    /* renamed from: Z */
    private Paint f22735Z;
    /* renamed from: a */
    private Drawable f22736a;
    /* renamed from: b */
    private Drawable f22737b;
    /* renamed from: c */
    private Drawable f22738c;
    /* renamed from: d */
    private Drawable f22739d;
    /* renamed from: e */
    private Drawable f22740e;
    /* renamed from: f */
    private Drawable f22741f;
    /* renamed from: g */
    private Drawable f22742g;
    /* renamed from: h */
    private CharSequence f22743h;
    /* renamed from: i */
    private CharSequence f22744i;

    public class SavedState extends AbsSavedState {
        public static final Creator CREATOR = new AnonymousClass1nN();
        /* renamed from: B */
        public int f22701B;
        /* renamed from: C */
        public int f22702C;
        /* renamed from: D */
        public int f22703D;
        /* renamed from: E */
        public int f22704E;
        /* renamed from: F */
        public int f22705F = 0;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f22705F = parcel.readInt();
            this.f22702C = parcel.readInt();
            this.f22703D = parcel.readInt();
            this.f22704E = parcel.readInt();
            this.f22701B = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f22705F);
            parcel.writeInt(this.f22702C);
            parcel.writeInt(this.f22703D);
            parcel.writeInt(this.f22704E);
            parcel.writeInt(this.f22701B);
        }
    }

    static {
        boolean z = true;
        int i = VERSION.SDK_INT;
        f22707j = i >= 19;
        if (i < 21) {
            z = false;
        }
        f22709l = z;
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22715F = new AnonymousClass1nK();
        this.f22733X = -1728053248;
        this.f22735Z = new Paint();
        this.f22718I = true;
        this.f22726Q = 3;
        this.f22727R = 3;
        this.f22728S = 3;
        this.f22725P = 3;
        this.f22741f = null;
        this.f22736a = null;
        this.f22737b = null;
        this.f22739d = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f22729T = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.f22722M = new AnonymousClass2Og(this, 3);
        this.f22731V = new AnonymousClass2Og(this, 5);
        AnonymousClass1nr D = AnonymousClass1nr.m13190D(this, 1.0f, this.f22722M);
        this.f22723N = D;
        D.f22846Q = 1;
        this.f22723N.f22843N = f2;
        this.f22722M.f29957C = this.f22723N;
        D = AnonymousClass1nr.m13190D(this, 1.0f, this.f22731V);
        this.f22732W = D;
        D.f22846Q = 2;
        this.f22732W.f22843N = f2;
        this.f22731V.f29957C = this.f22732W;
        setFocusableInTouchMode(true);
        AnonymousClass0mE.O(this, 1);
        AnonymousClass0mE.M(this, new AnonymousClass1nJ(this));
        setMotionEventSplittingEnabled(false);
        if (AnonymousClass0mE.f9733B.D(this)) {
            if (VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new AnonymousClass1nI(this));
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f22710m);
                try {
                    this.f22742g = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.f22742g = null;
            }
        }
        this.f22716G = f * 10.0f;
        this.f22730U = new ArrayList();
    }

    /* renamed from: A */
    public final void m13121A(AnonymousClass1nL anonymousClass1nL) {
        if (anonymousClass1nL != null) {
            if (this.f22714E == null) {
                this.f22714E = new ArrayList();
            }
            this.f22714E.add(anonymousClass1nL);
        }
    }

    /* renamed from: B */
    public static String m13110B(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        return (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    /* renamed from: B */
    public final boolean m13122B(View view, int i) {
        return (m13132L(view) & i) == i;
    }

    /* renamed from: C */
    public final void m13123C(int i) {
        View F = m13126F(i);
        if (F != null) {
            m13124D(F, true);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No drawer view found with gravity ");
        stringBuilder.append(m13110B(i));
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: C */
    public static boolean m13111C(View view) {
        return (AnonymousClass0mE.B(view) == 4 || AnonymousClass0mE.B(view) == 2) ? false : true;
    }

    /* renamed from: D */
    public final void m13124D(View view, boolean z) {
        if (m13113E(view)) {
            AnonymousClass1nM anonymousClass1nM = (AnonymousClass1nM) view.getLayoutParams();
            if (this.f22718I) {
                anonymousClass1nM.f22699D = 0.0f;
                anonymousClass1nM.f22700E = 0;
            } else if (z) {
                anonymousClass1nM.f22700E |= 4;
                if (m13122B(view, 3)) {
                    this.f22723N.m13216N(view, -view.getWidth(), view.getTop());
                } else {
                    this.f22732W.m13216N(view, getWidth(), view.getTop());
                }
            } else {
                m13135O(view, 0.0f);
                m13140T(anonymousClass1nM.f22697B, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a sliding drawer");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: D */
    public static final boolean m13112D(View view) {
        return ((AnonymousClass1nM) view.getLayoutParams()).f22697B == null ? true : null;
    }

    /* renamed from: E */
    public final void m13125E(boolean z) {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            AnonymousClass1nM anonymousClass1nM = (AnonymousClass1nM) childAt.getLayoutParams();
            if (m13113E(childAt)) {
                if (!z || anonymousClass1nM.f22698C) {
                    int width = childAt.getWidth();
                    if (m13122B(childAt, 3)) {
                        i |= this.f22723N.m13216N(childAt, -width, childAt.getTop());
                    } else {
                        i |= this.f22732W.m13216N(childAt, getWidth(), childAt.getTop());
                    }
                    anonymousClass1nM.f22698C = false;
                }
            }
        }
        this.f22722M.m15446L();
        this.f22731V.m15446L();
        if (i != 0) {
            invalidate();
        }
    }

    /* renamed from: E */
    public static final boolean m13113E(View view) {
        view = AnonymousClass1me.m13020B(((AnonymousClass1nM) view.getLayoutParams()).f22697B, AnonymousClass0mE.C(view));
        if ((view & 3) == 0) {
            if ((view & 5) == 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: F */
    public final View m13126F(int i) {
        int B = AnonymousClass1me.m13020B(i, AnonymousClass0mE.C(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((m13132L(childAt) & 7) == B) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: F */
    public static void m13114F(DrawerLayout drawerLayout, View view, boolean z) {
        int childCount = drawerLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = drawerLayout.getChildAt(i);
            if ((z || m13113E(childAt)) && !(z && childAt == view)) {
                AnonymousClass0mE.O(childAt, 4);
            } else {
                AnonymousClass0mE.O(childAt, 1);
            }
        }
    }

    /* renamed from: G */
    public final View m13127G() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((AnonymousClass1nM) childAt.getLayoutParams()).f22700E & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: G */
    private static boolean m13115G(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: H */
    public final View m13128H() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m13113E(childAt)) {
                if (m13113E(childAt)) {
                    if ((((AnonymousClass1nM) childAt.getLayoutParams()).f22699D > 0.0f ? 1 : null) != null) {
                        return childAt;
                    }
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("View ");
                    stringBuilder.append(childAt);
                    stringBuilder.append(" is not a drawer");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
        }
        return null;
    }

    /* renamed from: H */
    private boolean m13116H() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((AnonymousClass1nM) getChildAt(i).getLayoutParams()).f22698C) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: I */
    public final int m13129I(int i) {
        int i2;
        int C = AnonymousClass0mE.C(this);
        if (i == 3) {
            i2 = this.f22726Q;
            if (i2 == 3) {
                i2 = C == 0 ? this.f22728S : this.f22725P;
                if (i2 != 3) {
                }
                return 0;
            }
        } else if (i == 5) {
            i2 = this.f22727R;
            if (i2 == 3) {
                i2 = C == 0 ? this.f22725P : this.f22728S;
                if (i2 != 3) {
                }
                return 0;
            }
        } else if (i == 8388611) {
            i2 = this.f22728S;
            if (i2 == 3) {
                i2 = C == 0 ? this.f22726Q : this.f22727R;
                if (i2 != 3) {
                }
                return 0;
            }
        } else if (i != 8388613) {
            return 0;
        } else {
            i2 = this.f22725P;
            if (i2 == 3) {
                i2 = C == 0 ? this.f22727R : this.f22726Q;
                if (i2 != 3) {
                }
                return 0;
            }
        }
        return i2;
    }

    /* renamed from: I */
    private static boolean m13117I(Drawable drawable, int i) {
        if (drawable != null) {
            AnonymousClass1m2 anonymousClass1m2 = AnonymousClass1m3.f22522B;
            if (anonymousClass1m2.mo3498A(drawable)) {
                anonymousClass1m2.mo2763B(drawable, i);
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    public final int m13130J(View view) {
        if (m13113E(view)) {
            return m13129I(((AnonymousClass1nM) view.getLayoutParams()).f22697B);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a drawer");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: J */
    private static Drawable m13118J(DrawerLayout drawerLayout) {
        int C = AnonymousClass0mE.C(drawerLayout);
        Drawable drawable;
        if (C == 0) {
            drawable = drawerLayout.f22741f;
            if (drawable != null) {
                m13117I(drawable, C);
                return drawerLayout.f22741f;
            }
        }
        drawable = drawerLayout.f22736a;
        if (drawable != null) {
            m13117I(drawable, C);
            return drawerLayout.f22736a;
        }
        return drawerLayout.f22737b;
    }

    /* renamed from: K */
    private static Drawable m13119K(DrawerLayout drawerLayout) {
        int C = AnonymousClass0mE.C(drawerLayout);
        Drawable drawable;
        if (C == 0) {
            drawable = drawerLayout.f22736a;
            if (drawable != null) {
                m13117I(drawable, C);
                return drawerLayout.f22736a;
            }
        }
        drawable = drawerLayout.f22741f;
        if (drawable != null) {
            m13117I(drawable, C);
            return drawerLayout.f22741f;
        }
        return drawerLayout.f22739d;
    }

    /* renamed from: K */
    public final CharSequence m13131K(int i) {
        int B = AnonymousClass1me.m13020B(i, AnonymousClass0mE.C(this));
        if (B == 3) {
            return this.f22743h;
        }
        return B == 5 ? this.f22744i : null;
    }

    /* renamed from: L */
    public final int m13132L(View view) {
        return AnonymousClass1me.m13020B(((AnonymousClass1nM) view.getLayoutParams()).f22697B, AnonymousClass0mE.C(this));
    }

    /* renamed from: L */
    private void m13120L() {
        if (!f22709l) {
            this.f22738c = m13118J(this);
            this.f22740e = m13119K(this);
        }
    }

    /* renamed from: M */
    public final boolean m13133M(int i) {
        View F = m13126F(i);
        return F != null ? m13134N(F) : false;
    }

    /* renamed from: N */
    public final boolean m13134N(View view) {
        if (m13113E(view)) {
            return (((AnonymousClass1nM) view.getLayoutParams()).f22700E & 1) == 1;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("View ");
            stringBuilder.append(view);
            stringBuilder.append(" is not a drawer");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: O */
    public final void m13135O(View view, float f) {
        float width = (float) view.getWidth();
        int i = (int) (width * f);
        i -= (int) (((AnonymousClass1nM) view.getLayoutParams()).f22699D * width);
        if (!m13122B(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        m13139S(view, f);
    }

    /* renamed from: P */
    public final void m13136P(View view, boolean z) {
        if (m13113E(view)) {
            AnonymousClass1nM anonymousClass1nM = (AnonymousClass1nM) view.getLayoutParams();
            if (this.f22718I) {
                anonymousClass1nM.f22699D = 1.0f;
                anonymousClass1nM.f22700E = 1;
                m13114F(this, view, true);
            } else if (z) {
                anonymousClass1nM.f22700E |= 2;
                if (m13122B(view, 3)) {
                    this.f22723N.m13216N(view, 0, view.getTop());
                } else {
                    this.f22732W.m13216N(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                m13135O(view, 1.0f);
                m13140T(anonymousClass1nM.f22697B, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a sliding drawer");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: Q */
    public final void m13137Q(AnonymousClass1nL anonymousClass1nL) {
        if (anonymousClass1nL != null) {
            List list = this.f22714E;
            if (list != null) {
                list.remove(anonymousClass1nL);
            }
        }
    }

    /* renamed from: R */
    public final void m13138R(int i, int i2) {
        int B = AnonymousClass1me.m13020B(i2, AnonymousClass0mE.C(this));
        if (i2 == 3) {
            this.f22726Q = i;
        } else if (i2 == 5) {
            this.f22727R = i;
        } else if (i2 == 8388611) {
            this.f22728S = i;
        } else if (i2 == 8388613) {
            this.f22725P = i;
        }
        if (i != 0) {
            (B == 3 ? this.f22723N : this.f22732W).m13205B();
        }
        View F;
        switch (i) {
            case 1:
                F = m13126F(B);
                if (F != null) {
                    m13124D(F, true);
                    return;
                }
                return;
            case 2:
                F = m13126F(B);
                if (F != null) {
                    m13136P(F, true);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: S */
    public final void m13139S(View view, float f) {
        AnonymousClass1nM anonymousClass1nM = (AnonymousClass1nM) view.getLayoutParams();
        if (f != anonymousClass1nM.f22699D) {
            anonymousClass1nM.f22699D = f;
            List list = this.f22714E;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((AnonymousClass1nL) this.f22714E.get(size)).xj(view, f);
                }
            }
        }
    }

    /* renamed from: T */
    public final void m13140T(int i, int i2, View view) {
        AnonymousClass1nM anonymousClass1nM;
        AnonymousClass1nM anonymousClass1nM2;
        List list;
        View rootView;
        int i3 = this.f22723N.f22833D;
        int i4 = this.f22732W.f22833D;
        int i5 = 2;
        if (i3 != 1) {
            if (i4 != 1) {
                if (i3 != 2) {
                    if (i4 != 2) {
                        i5 = 0;
                    }
                }
                if (view != null && i2 == 0) {
                    anonymousClass1nM = (AnonymousClass1nM) view.getLayoutParams();
                    if (anonymousClass1nM.f22699D == 0.0f) {
                        anonymousClass1nM2 = (AnonymousClass1nM) view.getLayoutParams();
                        if ((anonymousClass1nM2.f22700E & 1) == 1) {
                            anonymousClass1nM2.f22700E = 0;
                            list = this.f22714E;
                            if (list != null) {
                                for (i3 = list.size() - 1; i3 >= 0; i3--) {
                                    ((AnonymousClass1nL) this.f22714E.get(i3)).vj(view);
                                }
                            }
                            m13114F(this, view, false);
                            if (hasWindowFocus()) {
                                rootView = getRootView();
                                if (rootView != null) {
                                    rootView.sendAccessibilityEvent(32);
                                }
                            }
                        }
                    } else if (anonymousClass1nM.f22699D == 1.0f) {
                        anonymousClass1nM2 = (AnonymousClass1nM) view.getLayoutParams();
                        if ((anonymousClass1nM2.f22700E & 1) == 0) {
                            anonymousClass1nM2.f22700E = 1;
                            list = this.f22714E;
                            if (list != null) {
                                for (i3 = list.size() - 1; i3 >= 0; i3--) {
                                    ((AnonymousClass1nL) this.f22714E.get(i3)).wj(view);
                                }
                            }
                            m13114F(this, view, true);
                            if (hasWindowFocus()) {
                                sendAccessibilityEvent(32);
                            }
                        }
                    }
                }
                if (i5 != this.f22717H) {
                    this.f22717H = i5;
                    list = this.f22714E;
                    if (list != null) {
                        for (i3 = list.size() - 1; i3 >= 0; i3--) {
                            ((AnonymousClass1nL) this.f22714E.get(i3)).yj(i5);
                        }
                    }
                }
            }
        }
        i5 = 1;
        anonymousClass1nM = (AnonymousClass1nM) view.getLayoutParams();
        if (anonymousClass1nM.f22699D == 0.0f) {
            anonymousClass1nM2 = (AnonymousClass1nM) view.getLayoutParams();
            if ((anonymousClass1nM2.f22700E & 1) == 1) {
                anonymousClass1nM2.f22700E = 0;
                list = this.f22714E;
                if (list != null) {
                    for (i3 = list.size() - 1; i3 >= 0; i3--) {
                        ((AnonymousClass1nL) this.f22714E.get(i3)).vj(view);
                    }
                }
                m13114F(this, view, false);
                if (hasWindowFocus()) {
                    rootView = getRootView();
                    if (rootView != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            }
        } else if (anonymousClass1nM.f22699D == 1.0f) {
            anonymousClass1nM2 = (AnonymousClass1nM) view.getLayoutParams();
            if ((anonymousClass1nM2.f22700E & 1) == 0) {
                anonymousClass1nM2.f22700E = 1;
                list = this.f22714E;
                if (list != null) {
                    for (i3 = list.size() - 1; i3 >= 0; i3--) {
                        ((AnonymousClass1nL) this.f22714E.get(i3)).wj(view);
                    }
                }
                m13114F(this, view, true);
                if (hasWindowFocus()) {
                    sendAccessibilityEvent(32);
                }
            }
        }
        if (i5 != this.f22717H) {
            this.f22717H = i5;
            list = this.f22714E;
            if (list != null) {
                for (i3 = list.size() - 1; i3 >= 0; i3--) {
                    ((AnonymousClass1nL) this.f22714E.get(i3)).yj(i5);
                }
            }
        }
    }

    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            View childAt;
            int childCount = getChildCount();
            Object obj = null;
            for (int i3 = 0; i3 < childCount; i3++) {
                childAt = getChildAt(i3);
                if (!m13113E(childAt)) {
                    this.f22730U.add(childAt);
                } else if (m13134N(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    obj = 1;
                }
            }
            if (obj == null) {
                int size = this.f22730U.size();
                for (int i4 = 0; i4 < size; i4++) {
                    childAt = (View) this.f22730U.get(i4);
                    if (childAt.getVisibility() == 0) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.f22730U.clear();
        }
    }

    public final void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (m13127G() == null) {
            if (!m13113E(view)) {
                AnonymousClass0mE.O(view, 1);
                if (!f22707j) {
                    AnonymousClass0mE.M(view, this.f22715F);
                }
            }
        }
        AnonymousClass0mE.O(view, 4);
        if (!f22707j) {
            AnonymousClass0mE.M(view, this.f22715F);
        }
    }

    public final boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof AnonymousClass1nM) && super.checkLayoutParams(layoutParams);
    }

    public final void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((AnonymousClass1nM) getChildAt(i).getLayoutParams()).f22699D);
        }
        this.f22734Y = f;
        boolean F = this.f22723N.m13209F(true);
        boolean F2 = this.f22732W.m13209F(true);
        if (F || F2) {
            AnonymousClass0mE.J(this);
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        DrawerLayout drawerLayout = this;
        int height = getHeight();
        View view2 = view;
        boolean D = m13112D(view2);
        int width = getWidth();
        Canvas canvas2 = canvas;
        int save = canvas.save();
        int i2 = 0;
        if (D) {
            int childCount = getChildCount();
            int i3 = 0;
            for (i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt != view2 && childAt.getVisibility() == 0 && m13115G(childAt) && m13113E(childAt)) {
                    if (childAt.getHeight() >= height) {
                        int right;
                        if (m13122B(childAt, 3)) {
                            right = childAt.getRight();
                            if (right > i3) {
                                i3 = right;
                            }
                        } else {
                            right = childAt.getLeft();
                            if (right < width) {
                                width = right;
                            }
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, width, getHeight());
            i2 = i3;
        }
        boolean drawChild = super.drawChild(canvas, view2, j);
        canvas.restoreToCount(save);
        float f = this.f22734Y;
        int i4;
        if (f > 0.0f && D) {
            i4 = this.f22733X;
            this.f22735Z.setColor((i4 & 16777215) | (((int) (((float) ((-16777216 & i4) >>> 24)) * f)) << 24));
            canvas2.drawRect((float) i2, null, (float) width, (float) getHeight(), drawerLayout.f22735Z);
        } else if (this.f22738c != null && m13122B(view2, 3)) {
            i = this.f22738c.getIntrinsicWidth();
            i2 = view2.getRight();
            float max = Math.max(0.0f, Math.min(((float) i2) / ((float) this.f22723N.f22836G), 1.0f));
            this.f22738c.setBounds(i2, view2.getTop(), i + i2, view2.getBottom());
            this.f22738c.setAlpha((int) (max * 255.0f));
            this.f22738c.draw(canvas);
        } else if (this.f22740e != null && m13122B(view2, 5)) {
            i4 = this.f22740e.getIntrinsicWidth();
            i2 = view2.getLeft();
            float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - i2)) / ((float) this.f22732W.f22836G), 1.0f));
            this.f22740e.setBounds(i2 - i4, view2.getTop(), i2, view2.getBottom());
            this.f22740e.setAlpha((int) (max2 * 255.0f));
            this.f22740e.draw(canvas);
        }
        return drawChild;
    }

    public final LayoutParams generateDefaultLayoutParams() {
        return new AnonymousClass1nM(-1, -1);
    }

    public final LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new AnonymousClass1nM(getContext(), attributeSet);
    }

    public final LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        if (layoutParams instanceof AnonymousClass1nM) {
            return new AnonymousClass1nM((AnonymousClass1nM) layoutParams);
        }
        return layoutParams instanceof MarginLayoutParams ? new AnonymousClass1nM((MarginLayoutParams) layoutParams) : new AnonymousClass1nM(layoutParams);
    }

    public float getDrawerElevation() {
        return f22709l ? this.f22716G : 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f22742g;
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, 639754568);
        super.onAttachedToWindow();
        this.f22718I = true;
        AnonymousClass0cQ.O(this, 264350269, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, -1765324569);
        super.onDetachedFromWindow();
        this.f22718I = true;
        AnonymousClass0cQ.O(this, 492799903, N);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f22712C && this.f22742g != null) {
            int systemWindowInsetTop;
            if (VERSION.SDK_INT >= 21) {
                Object obj = this.f22713D;
                if (obj != null) {
                    systemWindowInsetTop = ((WindowInsets) obj).getSystemWindowInsetTop();
                    if (systemWindowInsetTop > 0) {
                        this.f22742g.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                        this.f22742g.draw(canvas);
                    }
                }
            }
            systemWindowInsetTop = 0;
            if (systemWindowInsetTop > 0) {
                this.f22742g.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.f22742g.draw(canvas);
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object obj;
        int M = this.f22723N.m13215M(motionEvent) | this.f22732W.m13215M(motionEvent);
        switch (motionEvent.getActionMasked()) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f22720K = x;
                this.f22721L = y;
                if (this.f22734Y > 0.0f) {
                    View G = this.f22723N.m13210G((int) x, (int) y);
                    if (G != null && m13112D(G)) {
                        obj = 1;
                        this.f22711B = false;
                        break;
                    }
                }
                obj = null;
                this.f22711B = false;
            case 1:
            case 3:
                m13125E(true);
                this.f22711B = false;
                break;
            case 2:
                if (this.f22723N.m13207D(3)) {
                    this.f22722M.m15446L();
                    this.f22731V.m15446L();
                    break;
                }
                break;
            default:
                break;
        }
        obj = null;
        if (M != 0 || r0 != null || m13116H()) {
            return true;
        }
        if (this.f22711B) {
            return true;
        }
        return false;
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if ((m13116H() != null ? 1 : null) != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View H = m13116H();
        if (H != null && m13130J(H) == 0) {
            m13125E(false);
        }
        return H != null;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f22719J = true;
        i3 -= i;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                AnonymousClass1nM anonymousClass1nM = (AnonymousClass1nM) childAt.getLayoutParams();
                if (m13112D(childAt)) {
                    childAt.layout(anonymousClass1nM.leftMargin, anonymousClass1nM.topMargin, anonymousClass1nM.leftMargin + childAt.getMeasuredWidth(), anonymousClass1nM.topMargin + childAt.getMeasuredHeight());
                } else {
                    int i6;
                    float f;
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    float f2;
                    if (m13122B(childAt, 3)) {
                        f2 = (float) measuredWidth;
                        i6 = (-measuredWidth) + ((int) (anonymousClass1nM.f22699D * f2));
                        f = ((float) (measuredWidth + i6)) / f2;
                    } else {
                        f2 = (float) measuredWidth;
                        i6 = i3 - ((int) (anonymousClass1nM.f22699D * f2));
                        f = ((float) (i3 - i6)) / f2;
                    }
                    Object obj = f != anonymousClass1nM.f22699D ? 1 : null;
                    int i7 = anonymousClass1nM.f22697B & 112;
                    if (i7 == 16) {
                        int i8 = i4 - i2;
                        int i9 = (i8 - measuredHeight) / 2;
                        if (i9 < anonymousClass1nM.topMargin) {
                            i9 = anonymousClass1nM.topMargin;
                        } else if (i9 + measuredHeight > i8 - anonymousClass1nM.bottomMargin) {
                            i9 = (i8 - anonymousClass1nM.bottomMargin) - measuredHeight;
                        }
                        childAt.layout(i6, i9, measuredWidth + i6, measuredHeight + i9);
                    } else if (i7 != 80) {
                        childAt.layout(i6, anonymousClass1nM.topMargin, measuredWidth + i6, anonymousClass1nM.topMargin + measuredHeight);
                    } else {
                        measuredHeight = i4 - i2;
                        childAt.layout(i6, (measuredHeight - anonymousClass1nM.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i6, measuredHeight - anonymousClass1nM.bottomMargin);
                    }
                    if (obj != null) {
                        m13139S(childAt, f);
                    }
                    i7 = anonymousClass1nM.f22699D > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i7) {
                        childAt.setVisibility(i7);
                    }
                }
            }
        }
        this.f22719J = false;
        this.f22718I = false;
    }

    public final void onMeasure(int i, int i2) {
        int i3 = i;
        int mode = MeasureSpec.getMode(i3);
        int i4 = i2;
        int mode2 = MeasureSpec.getMode(i4);
        int size = MeasureSpec.getSize(i3);
        int size2 = MeasureSpec.getSize(i4);
        View view = this;
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Process.WAIT_RESULT_TIMEOUT) {
                    if (mode == 0) {
                        size = 300;
                    }
                }
                if (mode2 != Process.WAIT_RESULT_TIMEOUT) {
                    if (mode2 == 0) {
                        size2 = 300;
                    }
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i5 = 0;
        i2 = (view.f22713D == null || !AnonymousClass0mE.f9733B.D(view)) ? 0 : 1;
        int C = AnonymousClass0mE.C(view);
        int childCount = getChildCount();
        int i6 = 0;
        i = 0;
        Object obj = null;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                AnonymousClass1nM anonymousClass1nM = (AnonymousClass1nM) childAt.getLayoutParams();
                if (i2 != 0) {
                    mode2 = AnonymousClass1me.m13020B(anonymousClass1nM.f22697B, C);
                    if (AnonymousClass0mE.f9733B.D(childAt)) {
                        if (VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) view.f22713D;
                            if (mode2 == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i5, windowInsets.getSystemWindowInsetBottom());
                            } else if (mode2 == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i5, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) view.f22713D;
                        if (mode2 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i5, windowInsets2.getSystemWindowInsetBottom());
                        } else if (mode2 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i5, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        anonymousClass1nM.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        anonymousClass1nM.topMargin = windowInsets2.getSystemWindowInsetTop();
                        anonymousClass1nM.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        anonymousClass1nM.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (m13112D(childAt)) {
                    childAt.measure(MeasureSpec.makeMeasureSpec((size - anonymousClass1nM.leftMargin) - anonymousClass1nM.rightMargin, 1073741824), MeasureSpec.makeMeasureSpec((size2 - anonymousClass1nM.topMargin) - anonymousClass1nM.bottomMargin, 1073741824));
                } else if (m13113E(childAt)) {
                    if (f22709l) {
                        float C2 = AnonymousClass0mE.f9733B.C(childAt);
                        float f = view.f22716G;
                        if (C2 != f) {
                            AnonymousClass0mE.N(childAt, f);
                        }
                    }
                    int L = m13132L(childAt) & 7;
                    Object obj2 = L == 3 ? 1 : null;
                    if (obj2 == null || r17 == 0) {
                        if (obj2 == null) {
                            if (obj == null) {
                            }
                        }
                        if (obj2 != null) {
                            i = 1;
                        } else {
                            obj = 1;
                        }
                        childAt.measure(getChildMeasureSpec(i3, (view.f22729T + anonymousClass1nM.leftMargin) + anonymousClass1nM.rightMargin, anonymousClass1nM.width), getChildMeasureSpec(i4, anonymousClass1nM.topMargin + anonymousClass1nM.bottomMargin, anonymousClass1nM.height));
                    }
                    r1 = new StringBuilder();
                    r1.append("Child drawer has absolute gravity ");
                    r1.append(m13110B(L));
                    r1.append(" but this ");
                    r1.append("DrawerLayout");
                    r1.append(" already has a ");
                    r1.append("drawer view along that edge");
                    throw new IllegalStateException(r1.toString());
                } else {
                    r1 = new StringBuilder();
                    r1.append("Child ");
                    r1.append(childAt);
                    r1.append(" at index ");
                    r1.append(i6);
                    r1.append(" does not have a valid layout_gravity - must be Gravity.LEFT, ");
                    r1.append("Gravity.RIGHT or Gravity.NO_GRAVITY");
                    throw new IllegalStateException(r1.toString());
                }
            }
            i6++;
            i5 = 0;
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.f13609B);
            if (savedState.f22705F != 0) {
                View F = m13126F(savedState.f22705F);
                if (F != null) {
                    m13136P(F, true);
                }
            }
            if (savedState.f22702C != 3) {
                m13138R(savedState.f22702C, 3);
            }
            if (savedState.f22703D != 3) {
                m13138R(savedState.f22703D, 5);
            }
            if (savedState.f22704E != 3) {
                m13138R(savedState.f22704E, 8388611);
            }
            if (savedState.f22701B != 3) {
                m13138R(savedState.f22701B, 8388613);
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final void onRtlPropertiesChanged(int i) {
        m13120L();
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            AnonymousClass1nM anonymousClass1nM = (AnonymousClass1nM) getChildAt(i).getLayoutParams();
            Object obj = 1;
            Object obj2 = anonymousClass1nM.f22700E == 1 ? 1 : null;
            if (anonymousClass1nM.f22700E != 2) {
                obj = null;
            }
            if (obj2 == null) {
                if (obj == null) {
                    i++;
                }
            }
            savedState.f22705F = anonymousClass1nM.f22697B;
            break;
        }
        savedState.f22702C = this.f22726Q;
        savedState.f22703D = this.f22727R;
        savedState.f22704E = this.f22728S;
        savedState.f22701B = this.f22725P;
        return savedState;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.M(this, 426146488);
        this.f22723N.m13212I(motionEvent);
        this.f22732W.m13212I(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 3) {
            switch (action) {
                case 0:
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    this.f22720K = x;
                    this.f22721L = y;
                    this.f22711B = false;
                    break;
                case 1:
                    boolean z;
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    View G = this.f22723N.m13210G((int) x2, (int) y2);
                    if (G != null && m13112D(G)) {
                        x2 -= this.f22720K;
                        y2 -= this.f22721L;
                        int i = this.f22723N.f22845P;
                        if ((x2 * x2) + (y2 * y2) < ((float) (i * i))) {
                            G = m13127G();
                            if (G != null) {
                                if (m13130J(G) != 2) {
                                    z = false;
                                    m13125E(z);
                                    break;
                                }
                            }
                        }
                    }
                    z = true;
                    m13125E(z);
                default:
                    break;
            }
        }
        m13125E(true);
        this.f22711B = false;
        AnonymousClass0cQ.L(this, 1216021719, M);
        return true;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            m13125E(true);
        }
    }

    public final void requestLayout() {
        if (!this.f22719J) {
            super.requestLayout();
        }
    }

    public void setDrawerElevation(float f) {
        this.f22716G = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (m13113E(childAt)) {
                AnonymousClass0mE.N(childAt, this.f22716G);
            }
        }
    }

    public void setDrawerListener(AnonymousClass1nL anonymousClass1nL) {
        AnonymousClass1nL anonymousClass1nL2 = this.f22724O;
        if (anonymousClass1nL2 != null) {
            m13137Q(anonymousClass1nL2);
        }
        if (anonymousClass1nL != null) {
            m13121A(anonymousClass1nL);
        }
        this.f22724O = anonymousClass1nL;
    }

    public void setDrawerLockMode(int i) {
        m13138R(i, 3);
        m13138R(i, 5);
    }

    public void setScrimColor(int i) {
        this.f22733X = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.f22742g = i != 0 ? AnonymousClass0Ca.E(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f22742g = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f22742g = new ColorDrawable(i);
        invalidate();
    }
}
