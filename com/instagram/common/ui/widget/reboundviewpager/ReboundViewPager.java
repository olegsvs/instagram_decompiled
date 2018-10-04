package com.instagram.common.ui.widget.reboundviewpager;

import X.AnonymousClass0QP;
import X.AnonymousClass0QQ;
import X.AnonymousClass0cN;
import X.AnonymousClass0cQ;
import X.AnonymousClass0dh;
import X.AnonymousClass0e5;
import X.AnonymousClass0e6;
import X.AnonymousClass0eS;
import X.AnonymousClass0sC;
import X.AnonymousClass0sG;
import X.AnonymousClass1Ck;
import X.AnonymousClass1Is;
import X.AnonymousClass1It;
import X.AnonymousClass1Iu;
import X.AnonymousClass1Iv;
import X.AnonymousClass1Iw;
import X.AnonymousClass1J4;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.widget.Adapter;
import android.widget.FrameLayout;
import com.facebook.common.dextricks.StartupQEsConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class ReboundViewPager extends FrameLayout implements AnonymousClass0sC, AnonymousClass0QP, OnGestureListener {
    private int AB;
    /* renamed from: B */
    public Adapter f11349B;
    private float BB;
    /* renamed from: C */
    public int f11350C;
    private final Map CB;
    /* renamed from: D */
    public final float[] f11351D;
    private int[] DB;
    /* renamed from: E */
    public boolean f11352E;
    /* renamed from: F */
    public float f11353F;
    /* renamed from: G */
    public final List f11354G;
    /* renamed from: H */
    public final List f11355H;
    /* renamed from: I */
    public final boolean f11356I;
    /* renamed from: J */
    public AnonymousClass0sG f11357J;
    /* renamed from: K */
    public final List f11358K;
    /* renamed from: L */
    public int f11359L;
    /* renamed from: M */
    public final Map f11360M;
    /* renamed from: N */
    public float f11361N;
    /* renamed from: O */
    private final List f11362O;
    /* renamed from: P */
    private AnonymousClass1Iv f11363P;
    /* renamed from: Q */
    private boolean f11364Q;
    /* renamed from: R */
    private boolean f11365R;
    /* renamed from: S */
    private View f11366S;
    /* renamed from: T */
    private int f11367T;
    /* renamed from: U */
    private int f11368U;
    /* renamed from: V */
    private Integer f11369V;
    /* renamed from: W */
    private Integer f11370W;
    /* renamed from: X */
    private final DataSetObserver f11371X;
    /* renamed from: Y */
    private float f11372Y;
    /* renamed from: Z */
    private float f11373Z;
    /* renamed from: a */
    private boolean f11374a;
    /* renamed from: b */
    private boolean f11375b;
    /* renamed from: c */
    private int f11376c;
    /* renamed from: d */
    private int f11377d;
    /* renamed from: e */
    private final GestureDetector f11378e;
    /* renamed from: f */
    private final Map f11379f;
    /* renamed from: g */
    private int f11380g;
    /* renamed from: h */
    private int f11381h;
    /* renamed from: i */
    private final int f11382i;
    /* renamed from: j */
    private int f11383j;
    /* renamed from: k */
    private float f11384k;
    /* renamed from: l */
    private boolean f11385l;
    /* renamed from: m */
    private int f11386m;
    /* renamed from: n */
    private float f11387n;
    /* renamed from: o */
    private int[] f11388o;
    /* renamed from: p */
    private final List f11389p;
    /* renamed from: q */
    private final List f11390q;
    /* renamed from: r */
    private final List f11391r;
    /* renamed from: s */
    private final List f11392s;
    /* renamed from: t */
    private AnonymousClass1Iu f11393t;
    /* renamed from: u */
    private AnonymousClass1Iw f11394u;
    /* renamed from: v */
    private boolean f11395v;
    /* renamed from: w */
    private final AnonymousClass0cN f11396w;
    /* renamed from: x */
    private final Map f11397x;
    /* renamed from: y */
    private final float f11398y;
    /* renamed from: z */
    private int f11399z;

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

    public ReboundViewPager(Context context) {
        this(context, null);
    }

    public ReboundViewPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReboundViewPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11351D = new float[]{0.0f, 0.0f};
        this.f11392s = new ArrayList();
        this.f11389p = new ArrayList();
        this.f11391r = new ArrayList();
        this.f11379f = new HashMap();
        this.CB = new HashMap();
        this.f11360M = new HashMap();
        this.f11362O = new ArrayList();
        this.f11390q = new ArrayList();
        this.f11358K = new CopyOnWriteArrayList();
        this.f11371X = new AnonymousClass1Is(this);
        this.f11354G = new ArrayList();
        this.f11355H = new ArrayList();
        this.f11397x = new EnumMap(AnonymousClass1It.class);
        this.f11374a = true;
        this.f11386m = -1;
        this.f11393t = AnonymousClass1Iu.DISCRETE_PAGING;
        int i2 = 0;
        this.f11375b = false;
        this.f11385l = true;
        this.f11384k = 0.25f;
        this.f11363P = AnonymousClass1Iv.BIAS_START;
        this.f11356I = m8064B(context);
        AnonymousClass1It[] values = AnonymousClass1It.values();
        int length = values.length;
        while (i2 < length) {
            AnonymousClass1It anonymousClass1It = values[i2];
            this.f11397x.put(anonymousClass1It, anonymousClass1It.f16917B);
            i2++;
        }
        AnonymousClass0cN O = AnonymousClass0e6.m6190B().m6193C().m5770O((AnonymousClass0e5) this.f11397x.get(AnonymousClass1It.PAGING));
        O.f7105C = 0.001d;
        O.f7110H = 0.005d;
        this.f11396w = O.m5756A(this);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float applyDimension = TypedValue.applyDimension(1, 2.0f, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.ReboundViewPager);
        try {
            float dimension = obtainStyledAttributes.getDimension(0, applyDimension);
            setPageSpacing(dimension);
            this.f11398y = TypedValue.applyDimension(1, 8.0f, displayMetrics);
            setScrollState(AnonymousClass1Iw.IDLE);
            m8093N(0.0f, true);
            setExtraBufferSize(1);
            this.f11378e = new GestureDetector(context, this);
            this.f11382i = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
            this.f11381h = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            this.f11383j = this.f11382i;
            this.f11357J = new AnonymousClass0sG();
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: A */
    public final void m8080A(AnonymousClass0QQ anonymousClass0QQ) {
        if (!this.f11358K.contains(anonymousClass0QQ)) {
            this.f11358K.add(anonymousClass0QQ);
        }
    }

    /* renamed from: B */
    public final void m8081B() {
        this.f11358K.clear();
    }

    /* renamed from: B */
    public static boolean m8064B(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (VERSION.SDK_INT < 17 || (applicationInfo.flags & 4194304) == 0) {
            return false;
        }
        boolean z = true;
        if (context.getResources().getConfiguration().getLayoutDirection() != 1) {
            z = false;
        }
        return z;
    }

    /* renamed from: C */
    public final void m8082C(float f) {
        if (this.f11374a) {
            setScrollState(AnonymousClass1Iw.DRAGGING);
            if (!(this.f11352E || m8072J(this.f11353F + f))) {
                f *= this.f11384k;
            }
            m8092M(this.f11353F + f, false);
        }
    }

    /* renamed from: C */
    public static void m8065C(ReboundViewPager reboundViewPager, boolean z) {
        reboundViewPager.m8093N(reboundViewPager.m8068F(reboundViewPager.f11353F), z);
    }

    /* renamed from: D */
    public final View m8083D(int i) {
        for (AnonymousClass1Ck anonymousClass1Ck : this.f11379f.keySet()) {
            if (anonymousClass1Ck.f15572C == i) {
                return (View) this.f11379f.get(anonymousClass1Ck);
            }
        }
        return null;
    }

    /* renamed from: D */
    public static void m8066D(ReboundViewPager reboundViewPager, float f, double d, boolean z) {
        reboundViewPager.m8076N((AnonymousClass0e5) reboundViewPager.f11397x.get(AnonymousClass1It.PAGING), f, d, z);
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
        if (this.f11394u == AnonymousClass1Iw.SETTLING) {
            m8092M((float) anonymousClass0cN.f7106D, false);
            setScrollState(AnonymousClass1Iw.IDLE);
        }
    }

    /* renamed from: E */
    public final void m8084E(float f) {
        m8066D(this, f, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, true);
    }

    /* renamed from: E */
    private void m8067E(MotionEvent motionEvent) {
        if (!this.f11365R) {
            if (!this.f11364Q) {
                float rawX = this.f11372Y - motionEvent.getRawX();
                float rawY = this.f11373Z - motionEvent.getRawY();
                Object obj = Math.sqrt((double) ((rawX * rawX) + (rawY * rawY))) > ((double) this.f11398y) ? 1 : null;
                double toDegrees = Math.toDegrees(Math.atan((double) Math.abs(rawY / rawX)));
                if (obj != null) {
                    if (!m8087H()) {
                        if (toDegrees >= 45.0d) {
                            this.f11365R = true;
                            return;
                        }
                    }
                    this.f11364Q = true;
                }
            }
        }
    }

    /* renamed from: F */
    private float m8068F(float f) {
        if (this.f11352E) {
            return f;
        }
        if (f < getMinimumOffset()) {
            return getMinimumOffset();
        }
        return f > getMaximumOffset() ? getMaximumOffset() : f;
    }

    /* renamed from: F */
    public final void m8085F(int i, float f) {
        m8066D(this, (float) i, (double) f, true);
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        if (this.f11394u == AnonymousClass1Iw.SETTLING) {
            m8092M((float) anonymousClass0cN.m5760E(), false);
            float currentOffset = getCurrentOffset();
            m8079Q();
            if (currentOffset < getMinimumOffset()) {
                this.f11396w.m5770O((AnonymousClass0e5) this.f11397x.get(AnonymousClass1It.PAGING));
                this.f11396w.m5769N((double) getMinimumOffset());
            } else if (currentOffset > getMaximumOffset()) {
                this.f11396w.m5770O((AnonymousClass0e5) this.f11397x.get(AnonymousClass1It.PAGING));
                this.f11396w.m5769N((double) getMaximumOffset());
            }
        }
    }

    /* renamed from: G */
    public final void m8086G(int i) {
        m8066D(this, (float) i, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, false);
    }

    /* renamed from: G */
    private void m8069G(List list, List list2, List list3, boolean z) {
        int i;
        int i2;
        this.f11390q.addAll(this.f11362O);
        this.f11362O.clear();
        for (i = 0; i < list.size(); i++) {
            int intValue = ((Integer) list.get(i)).intValue();
            int intValue2 = ((Integer) list2.get(i)).intValue();
            long itemId = this.f11349B.getItemId(intValue);
            if (!getCarouselModeEnabled()) {
                intValue2 = intValue;
            }
            AnonymousClass1Ck anonymousClass1Ck = new AnonymousClass1Ck(itemId, intValue2, this.f11349B.getItemViewType(intValue));
            this.f11362O.add(anonymousClass1Ck);
            this.f11390q.remove(anonymousClass1Ck);
        }
        for (i = 0; i < this.f11390q.size(); i++) {
            AnonymousClass1Ck anonymousClass1Ck2 = (AnonymousClass1Ck) this.f11390q.get(i);
            View view = (View) this.f11379f.get(anonymousClass1Ck2);
            if (view != null) {
                i2 = anonymousClass1Ck2.f15573D;
                Map map = (Map) this.f11360M.get(Integer.valueOf(anonymousClass1Ck2.f15573D));
                if (map == null) {
                    map = new LinkedHashMap();
                    this.f11360M.put(Integer.valueOf(i2), map);
                }
                map.put(anonymousClass1Ck2, view);
                this.CB.remove(view);
                this.f11379f.remove(anonymousClass1Ck2);
            }
        }
        this.f11390q.clear();
        for (intValue2 = 0; intValue2 < this.f11362O.size(); intValue2++) {
            AnonymousClass1Ck anonymousClass1Ck3 = (AnonymousClass1Ck) this.f11362O.get(intValue2);
            i2 = ((Integer) list.get(intValue2)).intValue();
            int intValue3 = ((Integer) list2.get(intValue2)).intValue();
            float floatValue = ((Float) list3.get(intValue2)).floatValue();
            View view2 = (View) this.f11379f.get(anonymousClass1Ck3);
            if (z) {
                if (view2 == null) {
                    view2 = m8070H(anonymousClass1Ck3);
                }
                if (view2 == null) {
                    this.f11377d++;
                }
                view2 = this.f11349B.getView(i2, view2, this);
            }
            if (view2 == null) {
                view2 = m8070H(anonymousClass1Ck3);
                if (view2 == null) {
                    this.f11377d++;
                }
                view2 = this.f11349B.getView(i2, view2, this);
            }
            this.f11379f.put(anonymousClass1Ck3, view2);
            this.CB.put(view2, anonymousClass1Ck3);
            if (intValue3 == this.f11367T) {
                this.f11366S = view2;
            }
            if (view2.getParent() == null) {
                addView(view2);
            }
            AnonymousClass0sG anonymousClass0sG = this.f11357J;
            if (this.f11356I) {
                floatValue = -floatValue;
            }
            anonymousClass0sG.mo1905C(this, view2, floatValue, i2);
        }
        for (Map values : this.f11360M.values()) {
            for (View view3 : values.values()) {
                if (view3.getParent() == this) {
                    int size = this.f11358K.size();
                    for (intValue3 = 0; intValue3 < size; intValue3++) {
                        ((AnonymousClass0QQ) this.f11358K.get(intValue3)).RGA(view3);
                    }
                    removeView(view3);
                }
                if (this.CB.containsKey(view3)) {
                    this.f11379f.remove((AnonymousClass1Ck) this.CB.remove(view3));
                }
            }
        }
    }

    /* renamed from: H */
    private View m8070H(AnonymousClass1Ck anonymousClass1Ck) {
        Map map = (Map) this.f11360M.get(Integer.valueOf(anonymousClass1Ck.f15573D));
        if (map != null) {
            View view = (View) map.remove(anonymousClass1Ck);
            if (view != null) {
                return view;
            }
            Iterator it = map.keySet().iterator();
            if (it.hasNext()) {
                return (View) map.remove((AnonymousClass1Ck) it.next());
            }
        }
        return null;
    }

    /* renamed from: H */
    public final boolean m8087H() {
        return this.f11394u != AnonymousClass1Iw.IDLE;
    }

    /* renamed from: I */
    public final float m8088I(float f, int i) {
        if (this.f11361N < 0.0f) {
            i--;
        }
        float f2 = this.f11353F + ((-this.f11361N) + ((float) i));
        m8066D(this, f2, (double) f, true);
        return f2;
    }

    /* renamed from: I */
    private boolean m8071I(float f, float f2) {
        if (this.f11374a && Math.abs(f) > f2) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public final void m8089J(float f) {
        m8093N(f, true);
    }

    /* renamed from: J */
    private boolean m8072J(float f) {
        return f >= getMinimumOffset() && f <= getMaximumOffset();
    }

    /* renamed from: K */
    private void m8073K(int i, int i2) {
        for (AnonymousClass0QQ eCA : this.f11358K) {
            eCA.eCA(i, i2);
        }
    }

    /* renamed from: K */
    public final void m8090K(AnonymousClass0QQ anonymousClass0QQ) {
        this.f11358K.remove(anonymousClass0QQ);
    }

    /* renamed from: L */
    public final void m8091L(Adapter adapter, float f) {
        this.f11377d = 0;
        Adapter adapter2 = this.f11349B;
        if (adapter2 != null) {
            adapter2.unregisterDataSetObserver(this.f11371X);
        }
        if (this.f11349B != adapter) {
            List list = Collections.EMPTY_LIST;
            m8069G(list, list, list, false);
        }
        this.f11349B = adapter;
        adapter.registerDataSetObserver(this.f11371X);
        m8072J(f);
        this.f11359L = getCurrentWrappedDataIndex();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: L */
    private boolean m8074L(float r5) {
        /*
        r4 = this;
        r0 = r4.f11385l;
        r3 = 1;
        if (r0 != 0) goto L_0x003c;
    L_0x0005:
        r0 = r4.getCarouselModeEnabled();
        if (r0 == 0) goto L_0x000c;
    L_0x000b:
        goto L_0x003c;
    L_0x000c:
        r0 = r4.getCurrentRawDataIndex();
        r2 = 0;
        if (r0 != 0) goto L_0x0020;
    L_0x0013:
        r0 = r4.f11356I;
        if (r0 == 0) goto L_0x001c;
    L_0x0017:
        r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x0020;
    L_0x001b:
        goto L_0x003b;
    L_0x001c:
        r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r0 < 0) goto L_0x003b;
    L_0x0020:
        r1 = r4.getCurrentRawDataIndex();
        r0 = r4.f11349B;
        r0 = r0.getCount();
        r0 = r0 - r3;
        if (r1 != r0) goto L_0x003c;
    L_0x002d:
        r0 = r4.f11356I;
        if (r0 == 0) goto L_0x0036;
    L_0x0031:
        r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x003c;
    L_0x0035:
        goto L_0x003b;
    L_0x0036:
        r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r0 > 0) goto L_0x003b;
    L_0x003a:
        goto L_0x003c;
    L_0x003b:
        r3 = 0;
    L_0x003c:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager.L(float):boolean");
    }

    /* renamed from: M */
    public final void m8092M(float f, boolean z) {
        if (z || m8072J(f) || this.f11394u == AnonymousClass1Iw.SETTLING || this.f11394u == AnonymousClass1Iw.DRAGGING) {
            m8093N(f, false);
        }
    }

    /* renamed from: M */
    private boolean m8075M(int i) {
        if (!this.f11352E && (i < 0 || i >= this.f11349B.getCount())) {
            return false;
        }
        float f = (float) i;
        float f2 = 1.0f + f;
        float[] fArr = this.f11351D;
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (this.f11363P == AnonymousClass1Iv.BIAS_END) {
            if ((f3 > f || f > f4) && (f3 > f2 || f2 > f4)) {
                return false;
            }
        } else if (f3 > f || f >= f4) {
            if (f3 > f2 || f2 >= f4) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: N */
    public final void m8093N(float r12, boolean r13) {
        /*
        r11 = this;
        r0 = r11.f11349B;
        if (r0 == 0) goto L_0x026c;
    L_0x0004:
        r0 = r11.f11353F;
        r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1));
        if (r0 != 0) goto L_0x000e;
    L_0x000a:
        if (r13 != 0) goto L_0x000e;
    L_0x000c:
        goto L_0x026c;
    L_0x000e:
        r4 = r11.f11353F;
        r11.f11353F = r12;
        r1 = 0;
        r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1));
        r3 = 0;
        r10 = 1;
        if (r0 < 0) goto L_0x0025;
    L_0x0019:
        r0 = r11.f11349B;
        r0 = r0.getCount();
        r0 = r0 - r10;
        r0 = (float) r0;
        r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x0029;
    L_0x0025:
        r0 = r11.f11352E;
        if (r0 == 0) goto L_0x0039;
    L_0x0029:
        r1 = (double) r12;
        r5 = java.lang.Math.floor(r1);
        r0 = (int) r5;
        r11.f11376c = r0;
        r0 = java.lang.Math.ceil(r1);
        r0 = (int) r0;
        r11.f11380g = r0;
        goto L_0x0054;
    L_0x0039:
        r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1));
        if (r0 >= 0) goto L_0x0042;
    L_0x003d:
        r11.f11376c = r3;
        r11.f11380g = r3;
        goto L_0x0054;
    L_0x0042:
        r0 = r11.f11349B;
        r0 = r0.getCount();
        r0 = r0 - r10;
        r11.f11376c = r0;
        r0 = r11.f11349B;
        r0 = r0.getCount();
        r0 = r0 - r10;
        r11.f11380g = r0;
    L_0x0054:
        r6 = r11.f11351D;
        r5 = r11.f11353F;
        r2 = r11.f11350C;
        r0 = (float) r2;
        r1 = r5 - r0;
        r0 = 0;
        r6[r0] = r1;
        r0 = (float) r2;
        r5 = r5 + r0;
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5 = r5 + r0;
        r0 = 1;
        r6[r0] = r5;
        r11.m8078P();
        r0 = r11.f11392s;
        r0.clear();
        r0 = r11.f11389p;
        r0.clear();
        r0 = r11.f11391r;
        r0.clear();
        r0 = r11.AB;
        if (r0 <= 0) goto L_0x00cc;
    L_0x007e:
        r0 = r11.f11388o;
        r0 = r0[r3];
        r1 = (float) r0;
        r0 = r11.f11351D;
        r0 = r0[r3];
        r0 = r0 - r1;
        r11.f11361N = r0;
        r0 = r11.f11361N;
        r6 = -r0;
        r0 = r11.f11350C;
        r0 = (float) r0;
        r6 = r6 - r0;
        r5 = 0;
    L_0x0092:
        r0 = r11.AB;
        if (r5 >= r0) goto L_0x00cc;
    L_0x0096:
        r0 = r11.DB;
        r8 = r0[r5];
        r0 = r11.f11388o;
        r7 = r0[r5];
        r2 = (float) r5;
        r2 = r2 + r6;
        r0 = r11.f11349B;
        r0 = r0.getCount();
        if (r8 >= r0) goto L_0x00c9;
    L_0x00a8:
        r0 = r11.m8075M(r7);
        if (r0 == 0) goto L_0x00c9;
    L_0x00ae:
        r1 = r11.f11392s;
        r0 = java.lang.Integer.valueOf(r8);
        r1.add(r0);
        r1 = r11.f11389p;
        r0 = java.lang.Integer.valueOf(r7);
        r1.add(r0);
        r1 = r11.f11391r;
        r0 = java.lang.Float.valueOf(r2);
        r1.add(r0);
    L_0x00c9:
        r5 = r5 + 1;
        goto L_0x0092;
    L_0x00cc:
        r5 = r11.f11368U;
        r0 = r11.f11351D;
        r2 = r0[r3];
        r0 = r0[r3];
        r0 = (double) r0;
        r0 = java.lang.Math.floor(r0);
        r0 = (int) r0;
        r0 = (float) r0;
        r2 = r2 - r0;
        r2 = java.lang.Math.abs(r2);
        r1 = X.AnonymousClass1J4.f16961B;
        r0 = r11.f11363P;
        r0 = r0.ordinal();
        r1 = r1[r0];
        r0 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        switch(r1) {
            case 1: goto L_0x0114;
            case 2: goto L_0x0109;
            case 3: goto L_0x00f7;
            default: goto L_0x00ef;
        };
    L_0x00ef:
        r1 = new java.lang.IllegalArgumentException;
        r0 = "Invalid BufferBias";
        r1.<init>(r0);
        throw r1;
    L_0x00f7:
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 >= 0) goto L_0x0109;
    L_0x00fb:
        r2 = r11.DB;
        r1 = r11.f11350C;
        r0 = r1 + -1;
        r2 = r2[r0];
        r0 = r11.f11388o;
        r1 = r1 - r10;
        r1 = r0[r1];
        goto L_0x0125;
    L_0x0109:
        r0 = r11.DB;
        r1 = r11.f11350C;
        r2 = r0[r1];
        r0 = r11.f11388o;
        r1 = r0[r1];
        goto L_0x0125;
    L_0x0114:
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x0109;
    L_0x0118:
        r2 = r11.DB;
        r1 = r11.f11350C;
        r0 = r1 + 1;
        r2 = r2[r0];
        r0 = r11.f11388o;
        r1 = r1 + r10;
        r1 = r0[r1];
    L_0x0125:
        r0 = r11.f11367T;
        if (r1 == r0) goto L_0x0134;
    L_0x0129:
        r0 = r11.f11349B;
        r0 = r0.getCount();
        if (r1 >= r0) goto L_0x0134;
    L_0x0131:
        r0 = -1;
        if (r1 > r0) goto L_0x013e;
    L_0x0134:
        r0 = r11.f11352E;
        if (r0 == 0) goto L_0x013d;
    L_0x0138:
        r0 = r11.f11368U;
        if (r2 == r0) goto L_0x013d;
    L_0x013c:
        goto L_0x013e;
    L_0x013d:
        r10 = 0;
    L_0x013e:
        r11.f11367T = r1;
        r11.f11368U = r2;
        r2 = r11.f11392s;
        r1 = r11.f11389p;
        r0 = r11.f11391r;
        r11.m8069G(r2, r1, r0, r13);
        r6 = r11.f11353F;
        r0 = r11.f11357J;
        r2 = r0.m8101A(r4);
        r0 = r11.f11357J;
        r7 = r0.m8102B(r4);
        r0 = r11.f11357J;
        r1 = r0.m8101A(r6);
        r0 = r11.f11357J;
        r6 = r0.m8102B(r6);
        r0 = r11.f11356I;
        if (r0 == 0) goto L_0x016b;
    L_0x0169:
        r9 = r7;
        goto L_0x016c;
    L_0x016b:
        r9 = r2;
    L_0x016c:
        r0 = r11.f11356I;
        if (r0 == 0) goto L_0x0171;
    L_0x0170:
        r7 = r2;
    L_0x0171:
        r0 = r11.f11356I;
        if (r0 == 0) goto L_0x0177;
    L_0x0175:
        r8 = r6;
        goto L_0x0178;
    L_0x0177:
        r8 = r1;
    L_0x0178:
        r0 = r11.f11356I;
        if (r0 == 0) goto L_0x017d;
    L_0x017c:
        r6 = r1;
    L_0x017d:
        r0 = r11.f11354G;
        r0.clear();
        r0 = r11.f11355H;
        r0.clear();
        if (r8 >= r9) goto L_0x0198;
    L_0x0189:
        r2 = r8;
    L_0x018a:
        if (r2 >= r9) goto L_0x01aa;
    L_0x018c:
        r1 = r11.f11354G;
        r0 = java.lang.Integer.valueOf(r2);
        r1.add(r0);
        r2 = r2 + 1;
        goto L_0x018a;
    L_0x0198:
        if (r9 >= r8) goto L_0x01aa;
    L_0x019a:
        if (r9 >= r8) goto L_0x01aa;
    L_0x019c:
        if (r9 > r7) goto L_0x01aa;
    L_0x019e:
        r1 = r11.f11355H;
        r0 = java.lang.Integer.valueOf(r9);
        r1.add(r0);
        r9 = r9 + 1;
        goto L_0x019a;
    L_0x01aa:
        if (r6 >= r7) goto L_0x01bd;
    L_0x01ac:
        r2 = r7;
    L_0x01ad:
        if (r2 <= r6) goto L_0x01cf;
    L_0x01af:
        if (r2 < r7) goto L_0x01cf;
    L_0x01b1:
        r1 = r11.f11355H;
        r0 = java.lang.Integer.valueOf(r2);
        r1.add(r0);
        r2 = r2 + -1;
        goto L_0x01ad;
    L_0x01bd:
        if (r6 <= r7) goto L_0x01cf;
    L_0x01bf:
        if (r6 <= r7) goto L_0x01cf;
    L_0x01c1:
        if (r6 < r8) goto L_0x01cf;
    L_0x01c3:
        r1 = r11.f11354G;
        r0 = java.lang.Integer.valueOf(r6);
        r1.add(r0);
        r6 = r6 + -1;
        goto L_0x01bf;
    L_0x01cf:
        r6 = 0;
    L_0x01d0:
        r0 = r11.f11354G;
        r0 = r0.size();
        if (r6 >= r0) goto L_0x020d;
    L_0x01d8:
        r0 = r11.f11354G;
        r0 = r0.get(r6);
        r0 = (java.lang.Integer) r0;
        r2 = r0.intValue();
        if (r2 < 0) goto L_0x01ee;
    L_0x01e6:
        r0 = r11.f11349B;
        r0 = r0.getCount();
        if (r2 < r0) goto L_0x01f3;
    L_0x01ee:
        r0 = r11.f11352E;
        if (r0 != 0) goto L_0x01f3;
    L_0x01f2:
        goto L_0x020a;
    L_0x01f3:
        r1 = 0;
    L_0x01f4:
        r0 = r11.f11358K;
        r0 = r0.size();
        if (r1 >= r0) goto L_0x020a;
    L_0x01fc:
        r0 = r11.f11358K;
        r0 = r0.get(r1);
        r0 = (X.AnonymousClass0QQ) r0;
        r0.At(r2);
        r1 = r1 + 1;
        goto L_0x01f4;
    L_0x020a:
        r6 = r6 + 1;
        goto L_0x01d0;
    L_0x020d:
        r6 = 0;
    L_0x020e:
        r0 = r11.f11355H;
        r0 = r0.size();
        if (r6 >= r0) goto L_0x024b;
    L_0x0216:
        r0 = r11.f11355H;
        r0 = r0.get(r6);
        r0 = (java.lang.Integer) r0;
        r2 = r0.intValue();
        if (r2 < 0) goto L_0x022c;
    L_0x0224:
        r0 = r11.f11349B;
        r0 = r0.getCount();
        if (r2 < r0) goto L_0x0231;
    L_0x022c:
        r0 = r11.f11352E;
        if (r0 != 0) goto L_0x0231;
    L_0x0230:
        goto L_0x0248;
    L_0x0231:
        r1 = 0;
    L_0x0232:
        r0 = r11.f11358K;
        r0 = r0.size();
        if (r1 >= r0) goto L_0x0248;
    L_0x023a:
        r0 = r11.f11358K;
        r0 = r0.get(r1);
        r0 = (X.AnonymousClass0QQ) r0;
        r0.Bt(r2);
        r1 = r1 + 1;
        goto L_0x0232;
    L_0x0248:
        r6 = r6 + 1;
        goto L_0x020e;
    L_0x024b:
        r0 = r11.f11358K;
        r0 = r0.size();
        if (r3 >= r0) goto L_0x026c;
    L_0x0253:
        r0 = r11.f11358K;
        r2 = r0.get(r3);
        r2 = (X.AnonymousClass0QQ) r2;
        if (r10 == 0) goto L_0x0262;
    L_0x025d:
        r0 = r11.f11368U;
        r2.ys(r0, r5);
    L_0x0262:
        r1 = r11.f11353F;
        r0 = r11.f11394u;
        r2.ly(r1, r4, r0);
        r3 = r3 + 1;
        goto L_0x024b;
    L_0x026c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager.N(float, boolean):void");
    }

    /* renamed from: N */
    private void m8076N(AnonymousClass0e5 anonymousClass0e5, float f, double d, boolean z) {
        this.f11396w.m5770O(anonymousClass0e5);
        float F = m8068F(f);
        if (this.f11353F != F) {
            if (z) {
                setScrollState(AnonymousClass1Iw.SETTLING);
                this.f11396w.m5767L((double) this.f11353F);
                this.f11396w.m5771P(-d);
                this.f11396w.m5769N((double) F);
            } else {
                setScrollState(AnonymousClass1Iw.SETTLING);
                this.f11396w.m5767L((double) F).m5766K();
            }
        }
        if (this.f11396w.m5762G()) {
            setScrollState(AnonymousClass1Iw.IDLE);
        }
    }

    /* renamed from: O */
    private void m8077O() {
        if (this.f11375b) {
            setScrollState(AnonymousClass1Iw.IDLE);
            this.f11396w.m5766K();
            this.f11375b = false;
        }
    }

    /* renamed from: O */
    public final void m8094O(float f) {
        float pageWidth = (float) (this.f11381h / getPageWidth());
        float pageWidth2 = (float) (this.f11383j / getPageWidth());
        boolean I = m8071I(f, pageWidth2);
        switch (this.f11393t.ordinal()) {
            case 1:
                if (I) {
                    if (f > pageWidth2) {
                        if (f > pageWidth) {
                            f = pageWidth;
                        }
                        int i = 1;
                        if (this.f11361N < 0.0f) {
                            i = 2;
                        }
                        pageWidth2 = this.f11353F - (((float) i) - (1.0f - this.f11361N));
                        m8066D(this, pageWidth2, (double) f, true);
                        m8073K(this.f11399z, (int) pageWidth2);
                        return;
                    } else if (f < (-pageWidth2)) {
                        float f2 = -pageWidth;
                        if (f < f2) {
                            f = f2;
                        }
                        m8073K(this.f11399z, (int) m8088I(f, 1));
                        return;
                    } else {
                        return;
                    }
                } else if (this.f11396w.m5762G()) {
                    m8085F(this.f11367T, 0.0f);
                    int i2 = this.f11399z;
                    int i3 = this.f11367T;
                    if (i2 != i3) {
                        m8073K(i2, i3);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 2:
            case 3:
                this.f11396w.m5770O((AnonymousClass0e5) this.f11397x.get(AnonymousClass1It.FREE_SCROLLING)).m5767L((double) this.f11353F).m5771P((double) (-f));
                setScrollState(AnonymousClass1Iw.SETTLING);
                if (this.f11396w.m5762G()) {
                    m8079Q();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: P */
    private void m8078P() {
        if (this.f11349B.getCount() != 0) {
            int floor;
            int i = 0;
            switch (AnonymousClass1J4.f16961B[this.f11363P.ordinal()]) {
                case 1:
                    floor = (int) Math.floor((double) this.f11351D[0]);
                    break;
                case 2:
                    floor = Math.round(this.f11351D[0]);
                    break;
                case 3:
                    double ceil = Math.ceil((double) this.f11351D[0]);
                    float[] fArr = this.f11351D;
                    if (ceil != ((double) fArr[0])) {
                        floor = (int) Math.ceil((double) fArr[0]);
                        break;
                    } else {
                        floor = ((int) Math.ceil((double) fArr[0])) + 1;
                        break;
                    }
                default:
                    throw new IllegalArgumentException("Invalid BufferBias");
            }
            while (true) {
                int[] iArr = this.DB;
                if (i < iArr.length && ((float) floor) <= this.f11351D[1]) {
                    this.f11388o[i] = floor;
                    int count = this.f11349B.getCount();
                    int i2 = floor % count;
                    if (i2 < 0) {
                        i2 += count;
                    }
                    iArr[i] = i2;
                    i++;
                    this.AB = i;
                    floor++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: Q */
    private void m8079Q() {
        ReboundViewPager reboundViewPager = this;
        float F = (float) this.f11396w.m5761F();
        float max = (((float) this.f11382i) / ((float) Math.max(getPageWidth(), 1))) * 3.0f;
        if (this.f11396w.f7111I == this.f11397x.get(AnonymousClass1It.FREE_SCROLLING) && this.f11393t == AnonymousClass1Iu.WHEEL_OF_FORTUNE && Math.abs(F) < max) {
            float round = (float) Math.round(getCurrentOffset());
            if (((double) round) != this.f11396w.f7106D) {
                m8076N((AnonymousClass0e5) this.f11397x.get(AnonymousClass1It.SNAPPING), round, (double) F, true);
            }
        }
    }

    public final void attachViewToParent(View view, int i, LayoutParams layoutParams) {
        super.attachViewToParent(view, i, layoutParams);
    }

    public final boolean canScrollHorizontally(int i) {
        boolean z;
        int i2 = 0;
        if (this.f11374a) {
            if (this.f11352E) {
                Adapter adapter = this.f11349B;
                if (adapter != null && adapter.getCount() > 1) {
                    z = true;
                }
            } else {
                if (i != 0) {
                    i2 = i < 0 ? -1 : 1;
                }
                return m8072J(this.f11353F + ((this.f11356I ? (float) (-i2) : (float) i2) / ((float) getPageWidth())));
            }
        }
        return z;
    }

    public final void detachViewFromParent(View view) {
        super.detachViewFromParent(view);
    }

    public Adapter getAdapter() {
        return this.f11349B;
    }

    public boolean getCarouselModeEnabled() {
        return this.f11352E;
    }

    public View getCurrentActiveView() {
        return this.f11366S;
    }

    public int getCurrentDataIndex() {
        Adapter adapter = this.f11349B;
        if (adapter == null) {
            return -1;
        }
        if (this.f11352E) {
            return this.f11368U;
        }
        return (int) AnonymousClass0dh.m6102B((double) this.f11367T, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, (double) (adapter.getCount() - 1));
    }

    public float getCurrentOffset() {
        return this.f11353F;
    }

    public int getCurrentRawDataIndex() {
        return this.f11367T;
    }

    public int getCurrentWrappedDataIndex() {
        return this.f11368U;
    }

    public int getFirstVisiblePosition() {
        return this.f11376c;
    }

    public int getLastVisiblePosition() {
        return this.f11380g;
    }

    public float getMaximumOffset() {
        if (this.f11352E) {
            return Float.MAX_VALUE;
        }
        Integer num = this.f11369V;
        if (num != null) {
            return (float) num.intValue();
        }
        Adapter adapter = this.f11349B;
        return (float) Math.max((adapter != null ? adapter.getCount() : 0) - 1, 0);
    }

    public float getMinimumOffset() {
        if (this.f11352E) {
            return -3.4028235E38f;
        }
        Integer num = this.f11370W;
        return num != null ? (float) num.intValue() : 0.0f;
    }

    public float getPageSpacing() {
        return this.f11387n;
    }

    public int getPageWidth() {
        int i = this.f11386m;
        return i == -1 ? getWidth() : i;
    }

    public AnonymousClass1Iu getScrollMode() {
        return this.f11393t;
    }

    public AnonymousClass1Iw getScrollState() {
        return this.f11394u;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f11356I) {
            f = -f;
        }
        this.BB = f / ((float) getPageWidth());
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
        r5 = this;
        r1 = r5.f11393t;
        r0 = X.AnonymousClass1Iu.DISABLED;
        r4 = 0;
        if (r1 != r0) goto L_0x0008;
    L_0x0007:
        return r4;
    L_0x0008:
        r2 = r5.f11357J;
        r1 = r6.getX();
        r0 = r6.getY();
        r0 = r2.mo2566D(r5, r1, r0);
        if (r0 != 0) goto L_0x0019;
    L_0x0018:
        goto L_0x0007;
    L_0x0019:
        r0 = r6.getActionMasked();
        r3 = 1;
        switch(r0) {
            case 0: goto L_0x0058;
            case 1: goto L_0x0052;
            case 2: goto L_0x0022;
            case 3: goto L_0x0052;
            default: goto L_0x0021;
        };
    L_0x0021:
        goto L_0x0075;
    L_0x0022:
        r5.m8067E(r6);
        r1 = r5.f11372Y;
        r0 = r6.getRawX();
        r1 = r1 - r0;
        r0 = r5.f11364Q;
        if (r0 == 0) goto L_0x0075;
    L_0x0030:
        r0 = r5.m8074L(r1);
        if (r0 == 0) goto L_0x0075;
    L_0x0036:
        r2 = (int) r1;
        r0 = r6.getX();
        r1 = (int) r0;
        r0 = r6.getY();
        r0 = (int) r0;
        r0 = X.AnonymousClass25u.B(r5, r4, r2, r1, r0);
        if (r0 != 0) goto L_0x0075;
    L_0x0047:
        r0 = r5.getParent();
        r0.requestDisallowInterceptTouchEvent(r3);
        r5.m8077O();
        goto L_0x0076;
    L_0x0052:
        r0 = r5.BB;
        r5.m8094O(r0);
        goto L_0x0075;
    L_0x0058:
        r5.f11364Q = r4;
        r5.f11365R = r4;
        r5.f11395v = r4;
        r0 = 0;
        r5.BB = r0;
        r0 = r6.getRawX();
        r5.f11372Y = r0;
        r0 = r6.getRawY();
        r5.f11373Z = r0;
        r5.f11375b = r3;
        r0 = r5.getCurrentRawDataIndex();
        r5.f11399z = r0;
    L_0x0075:
        r3 = 0;
    L_0x0076:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f11365R) {
            return false;
        }
        if (this.f11395v) {
            if (this.f11356I) {
                f = -f;
            }
            m8082C(f / ((float) getPageWidth()));
            return true;
        }
        this.f11395v = true;
        return true;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.m5864N(this, 1619856179);
        super.onSizeChanged(i, i2, i3, i4);
        m8065C(this, true);
        AnonymousClass0cQ.m5865O(this, 1171587877, N);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
        r4 = this;
        r0 = -1068678586; // 0xffffffffc04d4246 float:-3.20717 double:NaN;
        r3 = X.AnonymousClass0cQ.m5863M(r4, r0);
        r1 = r4.f11393t;
        r0 = X.AnonymousClass1Iu.DISABLED;
        r2 = 0;
        if (r1 != r0) goto L_0x0015;
    L_0x000e:
        r0 = 989236866; // 0x3af68e82 float:0.0018810781 double:4.88747951E-315;
        X.AnonymousClass0cQ.m5862L(r4, r0, r3);
        return r2;
    L_0x0015:
        r0 = super.onTouchEvent(r5);
        r1 = 1;
        if (r0 != 0) goto L_0x0024;
    L_0x001c:
        r0 = r4.f11378e;
        r0 = r0.onTouchEvent(r5);
        if (r0 == 0) goto L_0x0025;
    L_0x0024:
        r2 = 1;
    L_0x0025:
        r0 = r5.getActionMasked();
        switch(r0) {
            case 0: goto L_0x0045;
            case 1: goto L_0x003f;
            case 2: goto L_0x002d;
            case 3: goto L_0x003f;
            default: goto L_0x002c;
        };
    L_0x002c:
        goto L_0x0054;
    L_0x002d:
        r4.m8067E(r5);
        r0 = r4.f11364Q;
        if (r0 == 0) goto L_0x0054;
    L_0x0034:
        r0 = r4.getParent();
        r0.requestDisallowInterceptTouchEvent(r1);
        r4.m8077O();
        goto L_0x0055;
    L_0x003f:
        r0 = r4.BB;
        r4.m8094O(r0);
        goto L_0x0054;
    L_0x0045:
        r2 = r4.f11357J;
        r1 = r5.getX();
        r0 = r5.getY();
        r1 = r2.mo2566D(r4, r1, r0);
        goto L_0x0055;
    L_0x0054:
        r1 = r2;
    L_0x0055:
        r0 = 1566743885; // 0x5d629d4d float:1.02058078E18 double:7.740743294E-315;
        X.AnonymousClass0cQ.m5862L(r4, r0, r3);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAdapter(Adapter adapter) {
        m8091L(adapter, this.f11353F);
    }

    public void setBufferBias(AnonymousClass1Iv anonymousClass1Iv) {
        this.f11363P = anonymousClass1Iv;
    }

    public void setCarouselModeEnabled(boolean z) {
        this.f11352E = z;
        m8065C(this, false);
    }

    public void setCustomMaximumOffset(Integer num) {
        this.f11369V = num;
    }

    public void setCustomMinimumOffset(Integer num) {
        this.f11370W = num;
    }

    public void setDraggingEnabled(boolean z) {
        this.f11374a = z;
    }

    public void setExtraBufferSize(int i) {
        this.f11350C = i;
        int max = Math.max(1, i * 2) + 1;
        this.DB = new int[max];
        this.f11388o = new int[max];
        m8065C(this, false);
    }

    public void setItemPositioner(AnonymousClass0sG anonymousClass0sG) {
        this.f11357J = anonymousClass0sG;
        anonymousClass0sG.f11412B = this.f11356I;
    }

    public void setMaximumFlingVelocity(int i) {
        this.f11381h = i;
    }

    public void setMinPagingVelocity(int i) {
        this.f11383j = i;
    }

    public void setOutOfBoundsDragSlipRatio(float f) {
        this.f11384k = f;
    }

    public void setOverScrollOnEdgeItems(boolean z) {
        this.f11385l = z;
    }

    public void setOverridePageWidth(int i) {
        this.f11386m = i;
    }

    public void setOvershootClampingEnabled(boolean z) {
        this.f11396w.f7108F = z;
    }

    public void setPageSpacing(float f) {
        this.f11387n = f;
        m8065C(this, true);
    }

    public void setScrollMode(AnonymousClass1Iu anonymousClass1Iu) {
        if (anonymousClass1Iu == AnonymousClass1Iu.DISCRETE_PAGING) {
            this.f11396w.m5770O((AnonymousClass0e5) this.f11397x.get(AnonymousClass1It.PAGING));
        } else {
            this.f11396w.m5770O((AnonymousClass0e5) this.f11397x.get(AnonymousClass1It.FREE_SCROLLING));
        }
        this.f11393t = anonymousClass1Iu;
    }

    private void setScrollState(AnonymousClass1Iw anonymousClass1Iw) {
        if (anonymousClass1Iw != this.f11394u) {
            int i;
            AnonymousClass1Iw anonymousClass1Iw2;
            int i2;
            AnonymousClass0QQ anonymousClass0QQ;
            if (anonymousClass1Iw == AnonymousClass1Iw.IDLE) {
                int i3 = this.f11368U;
                i = this.f11359L;
                if (i3 != i) {
                    this.f11359L = i3;
                    anonymousClass1Iw2 = this.f11394u;
                    this.f11394u = anonymousClass1Iw;
                    for (i2 = 0; i2 < this.f11358K.size(); i2++) {
                        anonymousClass0QQ = (AnonymousClass0QQ) this.f11358K.get(i2);
                        if (i != -1) {
                            anonymousClass0QQ.Kt(this.f11368U, i);
                        }
                        anonymousClass0QQ.uy(this.f11394u, anonymousClass1Iw2);
                    }
                }
            }
            i = -1;
            anonymousClass1Iw2 = this.f11394u;
            this.f11394u = anonymousClass1Iw;
            for (i2 = 0; i2 < this.f11358K.size(); i2++) {
                anonymousClass0QQ = (AnonymousClass0QQ) this.f11358K.get(i2);
                if (i != -1) {
                    anonymousClass0QQ.Kt(this.f11368U, i);
                }
                anonymousClass0QQ.uy(this.f11394u, anonymousClass1Iw2);
            }
        }
    }

    public void setSpringConfig(AnonymousClass1It anonymousClass1It, AnonymousClass0e5 anonymousClass0e5) {
        this.f11397x.put(anonymousClass1It, anonymousClass0e5);
    }
}
