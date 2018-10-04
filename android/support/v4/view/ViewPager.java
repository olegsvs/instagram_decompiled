package android.support.v4.view;

import X.AnonymousClass0Ca;
import X.AnonymousClass0cQ;
import X.AnonymousClass0mE;
import X.AnonymousClass1Ar;
import X.AnonymousClass1LO;
import X.AnonymousClass1mk;
import X.AnonymousClass1ml;
import X.AnonymousClass1mm;
import X.AnonymousClass1mn;
import X.AnonymousClass1mo;
import X.AnonymousClass1mp;
import X.AnonymousClass1mr;
import X.AnonymousClass1ms;
import X.AnonymousClass1mv;
import X.AnonymousClass2OY;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.facebook.common.dextricks.DexStore;
import com.facebook.forker.Process;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    private static final Comparator CB = new AnonymousClass1mk();
    public static final int[] DB = new int[]{16842931};
    private static final Interpolator EB = new AnonymousClass1ml();
    private static final AnonymousClass1mv FB = new AnonymousClass1mv();
    private int AB;
    /* renamed from: B */
    public AnonymousClass1LO f17378B;
    private int BB;
    /* renamed from: C */
    public int f17379C;
    /* renamed from: D */
    public int f17380D;
    /* renamed from: E */
    public AnonymousClass1Ar f17381E;
    /* renamed from: F */
    public boolean f17382F;
    /* renamed from: G */
    public boolean f17383G;
    /* renamed from: H */
    public final ArrayList f17384H = new ArrayList();
    /* renamed from: I */
    public int f17385I;
    /* renamed from: J */
    public AnonymousClass1Ar f17386J;
    /* renamed from: K */
    public List f17387K;
    /* renamed from: L */
    public int f17388L;
    /* renamed from: M */
    public VelocityTracker f17389M;
    /* renamed from: N */
    private int f17390N = -1;
    /* renamed from: O */
    private List f17391O;
    /* renamed from: P */
    private int f17392P;
    /* renamed from: Q */
    private boolean f17393Q;
    /* renamed from: R */
    private int f17394R;
    /* renamed from: S */
    private int f17395S;
    /* renamed from: T */
    private int f17396T;
    /* renamed from: U */
    private int f17397U;
    /* renamed from: V */
    private int f17398V;
    /* renamed from: W */
    private ArrayList f17399W;
    /* renamed from: X */
    private final Runnable f17400X = new AnonymousClass1mm(this);
    /* renamed from: Y */
    private int f17401Y;
    /* renamed from: Z */
    private boolean f17402Z;
    /* renamed from: a */
    private boolean f17403a = true;
    /* renamed from: b */
    private float f17404b = -3.4028235E38f;
    /* renamed from: c */
    private boolean f17405c;
    /* renamed from: d */
    private float f17406d;
    /* renamed from: e */
    private float f17407e;
    /* renamed from: f */
    private boolean f17408f;
    /* renamed from: g */
    private float f17409g;
    /* renamed from: h */
    private float f17410h;
    /* renamed from: i */
    private float f17411i = Float.MAX_VALUE;
    /* renamed from: j */
    private EdgeEffect f17412j;
    /* renamed from: k */
    private Drawable f17413k;
    /* renamed from: l */
    private int f17414l;
    /* renamed from: m */
    private AnonymousClass1ms f17415m;
    public int mGutterSize;
    /* renamed from: n */
    private int f17416n = 1;
    /* renamed from: o */
    private int f17417o;
    /* renamed from: p */
    private AnonymousClass1mr f17418p;
    /* renamed from: q */
    private boolean f17419q;
    /* renamed from: r */
    private Parcelable f17420r = null;
    /* renamed from: s */
    private ClassLoader f17421s = null;
    /* renamed from: t */
    private int f17422t = -1;
    /* renamed from: u */
    private EdgeEffect f17423u;
    /* renamed from: v */
    private int f17424v = 0;
    /* renamed from: w */
    private Scroller f17425w;
    /* renamed from: x */
    private boolean f17426x;
    /* renamed from: y */
    private final AnonymousClass1mn f17427y = new AnonymousClass1mn();
    /* renamed from: z */
    private final Rect f17428z = new Rect();

    public ViewPager(Context context) {
        super(context);
        m10887J();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m10887J();
    }

    /* renamed from: A */
    public final AnonymousClass1mn m10879A(int i, int i2) {
        AnonymousClass1mn anonymousClass1mn = new AnonymousClass1mn();
        anonymousClass1mn.f22626D = i;
        anonymousClass1mn.f22624B = this.f17378B.instantiateItem(this, i);
        anonymousClass1mn.f22628F = this.f17378B.m10835B(i);
        if (i2 >= 0) {
            if (i2 < this.f17384H.size()) {
                this.f17384H.add(i2, anonymousClass1mn);
                return anonymousClass1mn;
            }
        }
        this.f17384H.add(anonymousClass1mn);
        return anonymousClass1mn;
    }

    /* renamed from: B */
    public void mo2477B(AnonymousClass1Ar anonymousClass1Ar) {
        if (this.f17387K == null) {
            this.f17387K = new ArrayList();
        }
        this.f17387K.add(anonymousClass1Ar);
    }

    /* renamed from: B */
    private void m10867B(AnonymousClass1mn anonymousClass1mn, int i, AnonymousClass1mn anonymousClass1mn2) {
        int i2;
        int count = this.f17378B.getCount();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? ((float) this.f17417o) / ((float) clientWidth) : 0.0f;
        if (anonymousClass1mn2 != null) {
            clientWidth = anonymousClass1mn2.f22626D;
            if (clientWidth < anonymousClass1mn.f22626D) {
                float f2 = (anonymousClass1mn2.f22625C + anonymousClass1mn2.f22628F) + f;
                i2 = clientWidth + 1;
                clientWidth = 0;
                while (i2 <= anonymousClass1mn.f22626D && clientWidth < this.f17384H.size()) {
                    AnonymousClass1mn anonymousClass1mn3 = (AnonymousClass1mn) this.f17384H.get(clientWidth);
                    while (i2 > anonymousClass1mn3.f22626D && clientWidth < this.f17384H.size() - 1) {
                        clientWidth++;
                        anonymousClass1mn3 = (AnonymousClass1mn) this.f17384H.get(clientWidth);
                    }
                    while (i2 < anonymousClass1mn3.f22626D) {
                        f2 += this.f17378B.m10835B(i2) + f;
                        i2++;
                    }
                    anonymousClass1mn3.f22625C = f2;
                    f2 += anonymousClass1mn3.f22628F + f;
                    i2++;
                }
            } else if (clientWidth > anonymousClass1mn.f22626D) {
                i2 = this.f17384H.size() - 1;
                float f3 = anonymousClass1mn2.f22625C;
                int i3 = clientWidth - 1;
                while (i3 >= anonymousClass1mn.f22626D && i2 >= 0) {
                    AnonymousClass1mn anonymousClass1mn4 = (AnonymousClass1mn) this.f17384H.get(i2);
                    while (i3 < anonymousClass1mn4.f22626D && i2 > 0) {
                        i2--;
                        anonymousClass1mn4 = (AnonymousClass1mn) this.f17384H.get(i2);
                    }
                    while (i3 > anonymousClass1mn4.f22626D) {
                        f3 -= this.f17378B.m10835B(i3) + f;
                        i3--;
                    }
                    f3 -= anonymousClass1mn4.f22628F + f;
                    anonymousClass1mn4.f22625C = f3;
                    i3--;
                }
            }
        }
        int size = this.f17384H.size();
        float f4 = anonymousClass1mn.f22625C;
        int i4 = anonymousClass1mn.f22626D - 1;
        this.f17404b = anonymousClass1mn.f22626D == 0 ? anonymousClass1mn.f22625C : -3.4028235E38f;
        int i5 = count - 1;
        this.f17411i = anonymousClass1mn.f22626D == i5 ? (anonymousClass1mn.f22625C + anonymousClass1mn.f22628F) - 1.0f : Float.MAX_VALUE;
        i2 = i - 1;
        while (i2 >= 0) {
            AnonymousClass1mn anonymousClass1mn5 = (AnonymousClass1mn) this.f17384H.get(i2);
            while (i4 > anonymousClass1mn5.f22626D) {
                f4 -= this.f17378B.m10835B(i4) + f;
                i4--;
            }
            f4 -= anonymousClass1mn5.f22628F + f;
            anonymousClass1mn5.f22625C = f4;
            if (anonymousClass1mn5.f22626D == 0) {
                this.f17404b = f4;
            }
            i2--;
            i4--;
        }
        float f5 = (anonymousClass1mn.f22625C + anonymousClass1mn.f22628F) + f;
        i4 = anonymousClass1mn.f22626D + 1;
        int i6 = i + 1;
        while (i6 < size) {
            anonymousClass1mn5 = (AnonymousClass1mn) this.f17384H.get(i6);
            while (i4 < anonymousClass1mn5.f22626D) {
                f5 += this.f17378B.m10835B(i4) + f;
                i4++;
            }
            if (anonymousClass1mn5.f22626D == i5) {
                this.f17411i = (anonymousClass1mn5.f22628F + f5) - 1.0f;
            }
            anonymousClass1mn5.f22625C = f5;
            f5 += anonymousClass1mn5.f22628F + f;
            i6++;
            i4++;
        }
    }

    /* renamed from: C */
    private void m10868C(boolean z) {
        Object obj = this.f17424v == 2 ? 1 : null;
        if (obj != null) {
            setScrollingCacheEnabled(false);
            if ((this.f17425w.isFinished() ^ 1) != 0) {
                this.f17425w.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f17425w.getCurrX();
                int currY = this.f17425w.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m10873H(currX);
                    }
                }
            }
        }
        this.f17419q = false;
        for (scrollY = 0; scrollY < this.f17384H.size(); scrollY++) {
            AnonymousClass1mn anonymousClass1mn = (AnonymousClass1mn) this.f17384H.get(scrollY);
            if (anonymousClass1mn.f22627E) {
                anonymousClass1mn.f22627E = false;
                obj = 1;
            }
        }
        if (obj == null) {
            return;
        }
        if (z) {
            AnonymousClass0mE.m7521K(this, this.f17400X);
        } else {
            this.f17400X.run();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: C */
    public final boolean m10881C(int r8) {
        /*
        r7 = this;
        r4 = r7.findFocus();
        r5 = 1;
        r1 = 0;
        r3 = 0;
        if (r4 != r7) goto L_0x000a;
    L_0x0009:
        goto L_0x0069;
    L_0x000a:
        if (r4 == 0) goto L_0x0068;
    L_0x000c:
        r2 = r4.getParent();
    L_0x0010:
        r0 = r2 instanceof android.view.ViewGroup;
        if (r0 == 0) goto L_0x001d;
    L_0x0014:
        if (r2 != r7) goto L_0x0018;
    L_0x0016:
        r0 = 1;
        goto L_0x001e;
    L_0x0018:
        r2 = r2.getParent();
        goto L_0x0010;
    L_0x001d:
        r0 = 0;
    L_0x001e:
        if (r0 != 0) goto L_0x0068;
    L_0x0020:
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r0 = r4.getClass();
        r0 = r0.getSimpleName();
        r6.append(r0);
        r2 = r4.getParent();
    L_0x0034:
        r0 = r2 instanceof android.view.ViewGroup;
        if (r0 == 0) goto L_0x004d;
    L_0x0038:
        r0 = " => ";
        r6.append(r0);
        r0 = r2.getClass();
        r0 = r0.getSimpleName();
        r6.append(r0);
        r2 = r2.getParent();
        goto L_0x0034;
    L_0x004d:
        r4 = "ViewPager";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = "arrowScroll tried to find focus based on non-child current focused view ";
        r2.append(r0);
        r0 = r6.toString();
        r2.append(r0);
        r0 = r2.toString();
        android.util.Log.e(r4, r0);
        goto L_0x0069;
    L_0x0068:
        r3 = r4;
    L_0x0069:
        r0 = android.view.FocusFinder.getInstance();
        r2 = r0.findNextFocus(r7, r3, r8);
        r4 = 66;
        r0 = 17;
        if (r2 == 0) goto L_0x00b4;
    L_0x0077:
        if (r2 == r3) goto L_0x00b4;
    L_0x0079:
        if (r8 != r0) goto L_0x0099;
    L_0x007b:
        r0 = r7.f17428z;
        r0 = r7.m10870E(r0, r2);
        r1 = r0.left;
        r0 = r7.f17428z;
        r0 = r7.m10870E(r0, r3);
        r0 = r0.left;
        if (r3 == 0) goto L_0x0094;
    L_0x008d:
        if (r1 < r0) goto L_0x0094;
    L_0x008f:
        r1 = r7.m10889L();
        goto L_0x00bf;
    L_0x0094:
        r1 = r2.requestFocus();
        goto L_0x00bf;
    L_0x0099:
        if (r8 != r4) goto L_0x00bf;
    L_0x009b:
        r0 = r7.f17428z;
        r0 = r7.m10870E(r0, r2);
        r1 = r0.left;
        r0 = r7.f17428z;
        r0 = r7.m10870E(r0, r3);
        r0 = r0.left;
        if (r3 == 0) goto L_0x0094;
    L_0x00ad:
        if (r1 > r0) goto L_0x0094;
    L_0x00af:
        r1 = r7.m10878M();
        goto L_0x00bf;
    L_0x00b4:
        if (r8 == r0) goto L_0x008f;
    L_0x00b6:
        if (r8 != r5) goto L_0x00b9;
    L_0x00b8:
        goto L_0x008f;
    L_0x00b9:
        if (r8 == r4) goto L_0x00af;
    L_0x00bb:
        r0 = 2;
        if (r8 != r0) goto L_0x00bf;
    L_0x00be:
        goto L_0x00af;
    L_0x00bf:
        if (r1 == 0) goto L_0x00c8;
    L_0x00c1:
        r0 = android.view.SoundEffectConstants.getContantForFocusDirection(r8);
        r7.playSoundEffect(r0);
    L_0x00c8:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.C(int):boolean");
    }

    /* renamed from: D */
    private void m10869D(int i) {
        AnonymousClass1Ar anonymousClass1Ar = this.f17386J;
        if (anonymousClass1Ar != null) {
            anonymousClass1Ar.onPageSelected(i);
        }
        List list = this.f17387K;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                anonymousClass1Ar = (AnonymousClass1Ar) this.f17387K.get(i2);
                if (anonymousClass1Ar != null) {
                    anonymousClass1Ar.onPageSelected(i);
                }
            }
        }
        anonymousClass1Ar = this.f17381E;
        if (anonymousClass1Ar != null) {
            anonymousClass1Ar.onPageSelected(i);
        }
    }

    /* renamed from: D */
    public boolean mo2476D(View view, boolean z, int i, int i2, int i3) {
        int i4 = i;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight()) {
                    int i6 = i3 + scrollY;
                    if (i6 >= childAt.getTop() && i6 < childAt.getBottom() && mo2476D(childAt, true, i4, i5 - childAt.getLeft(), i6 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (z && view.canScrollHorizontally(-i)) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    private Rect m10870E(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewPager parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* renamed from: F */
    private AnonymousClass1mn m10871F() {
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f = clientWidth > 0 ? ((float) this.f17417o) / ((float) clientWidth) : 0.0f;
        AnonymousClass1mn anonymousClass1mn = null;
        int i = 0;
        Object obj = 1;
        int i2 = -1;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (i < this.f17384H.size()) {
            AnonymousClass1mn anonymousClass1mn2 = (AnonymousClass1mn) this.f17384H.get(i);
            if (obj == null) {
                i2++;
                if (anonymousClass1mn2.f22626D != i2) {
                    anonymousClass1mn2 = this.f17427y;
                    anonymousClass1mn2.f22625C = (f2 + f3) + f;
                    anonymousClass1mn2.f22626D = i2;
                    anonymousClass1mn2.f22628F = this.f17378B.m10835B(anonymousClass1mn2.f22626D);
                    i--;
                }
            }
            f2 = anonymousClass1mn2.f22625C;
            f3 = (anonymousClass1mn2.f22628F + f2) + f;
            if (obj == null) {
                if (scrollX < f2) {
                    break;
                }
            }
            if (scrollX >= f3) {
                if (i != this.f17384H.size() - 1) {
                    i2 = anonymousClass1mn2.f22626D;
                    f3 = anonymousClass1mn2.f22628F;
                    i++;
                    anonymousClass1mn = anonymousClass1mn2;
                    obj = null;
                }
            }
            return anonymousClass1mn2;
        }
        return anonymousClass1mn;
    }

    /* renamed from: F */
    public final void m10883F() {
        int count = this.f17378B.getCount();
        this.f17401Y = count;
        Object obj = (this.f17384H.size() >= (this.f17416n * 2) + 1 || this.f17384H.size() >= count) ? null : 1;
        int i = this.f17379C;
        int i2 = 0;
        Object obj2 = null;
        while (i2 < this.f17384H.size()) {
            AnonymousClass1mn anonymousClass1mn = (AnonymousClass1mn) this.f17384H.get(i2);
            int itemPosition = this.f17378B.getItemPosition(anonymousClass1mn.f22624B);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f17384H.remove(i2);
                    i2--;
                    if (obj2 == null) {
                        this.f17378B.mo2433H(this);
                        obj2 = 1;
                    }
                    this.f17378B.destroyItem(this, anonymousClass1mn.f22626D, anonymousClass1mn.f22624B);
                    if (this.f17379C == anonymousClass1mn.f22626D) {
                        i = Math.max(0, Math.min(this.f17379C, count - 1));
                    }
                } else if (anonymousClass1mn.f22626D != itemPosition) {
                    if (anonymousClass1mn.f22626D == this.f17379C) {
                        i = itemPosition;
                    }
                    anonymousClass1mn.f22626D = itemPosition;
                }
                obj = 1;
            }
            i2++;
        }
        if (obj2 != null) {
            this.f17378B.mo2429A(this);
        }
        Collections.sort(this.f17384H, CB);
        if (obj != null) {
            count = getChildCount();
            for (i2 = 0; i2 < count; i2++) {
                AnonymousClass1mo anonymousClass1mo = (AnonymousClass1mo) getChildAt(i2).getLayoutParams();
                if (!anonymousClass1mo.f22631D) {
                    anonymousClass1mo.f22634G = 0.0f;
                }
            }
            m10894Q(i, false, true);
            requestLayout();
        }
    }

    /* renamed from: G */
    public final AnonymousClass1mn m10884G(View view) {
        while (true) {
            View parent = view.getParent();
            if (parent == this) {
                return m10885H(view);
            }
            if (parent == null) {
                break;
            } else if (!(parent instanceof View)) {
                break;
            } else {
                view = parent;
            }
        }
        return null;
    }

    /* renamed from: G */
    private void m10872G(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f17390N) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f17409g = motionEvent.getX(i);
            this.f17390N = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f17389M;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: H */
    public final AnonymousClass1mn m10885H(View view) {
        for (int i = 0; i < this.f17384H.size(); i++) {
            AnonymousClass1mn anonymousClass1mn = (AnonymousClass1mn) this.f17384H.get(i);
            if (this.f17378B.isViewFromObject(view, anonymousClass1mn.f22624B)) {
                return anonymousClass1mn;
            }
        }
        return null;
    }

    /* renamed from: H */
    private boolean m10873H(int i) {
        if (this.f17384H.size() == 0) {
            if (!this.f17403a) {
                this.f17393Q = false;
                mo2471K(0, 0.0f, 0);
                if (this.f17393Q) {
                }
            }
            return false;
        }
        AnonymousClass1mn F = m10871F();
        int clientWidth = getClientWidth();
        int i2 = this.f17417o;
        int i3 = clientWidth + i2;
        float f = (float) i2;
        float f2 = (float) clientWidth;
        f /= f2;
        int i4 = F.f22626D;
        float f3 = ((((float) i) / f2) - F.f22625C) / (F.f22628F + f);
        i2 = (int) (((float) i3) * f3);
        this.f17393Q = false;
        mo2471K(i4, f3, i2);
        if (this.f17393Q) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* renamed from: I */
    public final AnonymousClass1mn m10886I(int i) {
        for (int i2 = 0; i2 < this.f17384H.size(); i2++) {
            AnonymousClass1mn anonymousClass1mn = (AnonymousClass1mn) this.f17384H.get(i2);
            if (anonymousClass1mn.f22626D == i) {
                return anonymousClass1mn;
            }
        }
        return null;
    }

    /* renamed from: I */
    private boolean m10874I(float f) {
        Object obj;
        Object obj2;
        float f2 = this.f17409g - f;
        this.f17409g = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.f17404b * clientWidth;
        float f4 = this.f17411i * clientWidth;
        boolean z = false;
        AnonymousClass1mn anonymousClass1mn = (AnonymousClass1mn) this.f17384H.get(0);
        ArrayList arrayList = this.f17384H;
        AnonymousClass1mn anonymousClass1mn2 = (AnonymousClass1mn) arrayList.get(arrayList.size() - 1);
        if (anonymousClass1mn.f22626D != 0) {
            f3 = anonymousClass1mn.f22625C * clientWidth;
            obj = null;
        } else {
            obj = 1;
        }
        if (anonymousClass1mn2.f22626D != this.f17378B.getCount() - 1) {
            f4 = anonymousClass1mn2.f22625C * clientWidth;
            obj2 = null;
        } else {
            obj2 = 1;
        }
        if (scrollX < f3) {
            if (obj != null) {
                this.f17412j.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (obj2 != null) {
                this.f17423u.onPull(Math.abs(scrollX - f4) / clientWidth);
                z = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f17409g += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        m10873H(i);
        return z;
    }

    /* renamed from: J */
    public final void m10887J() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f17425w = new Scroller(context, EB);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.BB = viewConfiguration.getScaledPagingTouchSlop();
        this.f17385I = (int) (400.0f * f);
        this.f17414l = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f17412j = new EdgeEffect(context);
        this.f17423u = new EdgeEffect(context);
        this.f17380D = (int) (25.0f * f);
        this.f17395S = (int) (2.0f * f);
        this.f17397U = (int) (f * 16.0f);
        AnonymousClass0mE.m7523M(this, new AnonymousClass1mp(this));
        if (AnonymousClass0mE.m7512B(this) == 0) {
            AnonymousClass0mE.m7525O(this, 1);
        }
        AnonymousClass0mE.f9733B.m9031f(this, new AnonymousClass2OY(this));
    }

    /* renamed from: J */
    private void m10875J(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f17384H.isEmpty()) {
            AnonymousClass1mn I = m10886I(this.f17379C);
            int min = (int) ((I != null ? Math.min(I.f22625C, this.f17411i) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                m10868C(false);
                scrollTo(min, getScrollY());
            }
        } else if (this.f17425w.isFinished()) {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3))), getScrollY());
        } else {
            this.f17425w.setFinalX(getCurrentItem() * getClientWidth());
        }
    }

    /* renamed from: K */
    public void mo2471K(int i, float f, int i2) {
        int i3;
        int i4;
        int measuredWidth;
        if (this.f17396T > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                AnonymousClass1mo anonymousClass1mo = (AnonymousClass1mo) childAt.getLayoutParams();
                if (anonymousClass1mo.f22631D) {
                    i4 = anonymousClass1mo.f22630C & 7;
                    if (i4 != 1) {
                        if (i4 == 3) {
                            i4 = childAt.getWidth() + paddingLeft;
                        } else if (i4 != 5) {
                            i4 = paddingLeft;
                        } else {
                            measuredWidth = (width - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        paddingLeft = (paddingLeft + scrollX) - childAt.getLeft();
                        if (paddingLeft != 0) {
                            childAt.offsetLeftAndRight(paddingLeft);
                        }
                        paddingLeft = i4;
                    } else {
                        measuredWidth = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    i4 = paddingLeft;
                    paddingLeft = measuredWidth;
                    paddingLeft = (paddingLeft + scrollX) - childAt.getLeft();
                    if (paddingLeft != 0) {
                        childAt.offsetLeftAndRight(paddingLeft);
                    }
                    paddingLeft = i4;
                }
            }
        }
        AnonymousClass1Ar anonymousClass1Ar = this.f17386J;
        if (anonymousClass1Ar != null) {
            anonymousClass1Ar.onPageScrolled(i, f, i2);
        }
        List list = this.f17387K;
        if (list != null) {
            i4 = list.size();
            for (measuredWidth = 0; measuredWidth < i4; measuredWidth++) {
                anonymousClass1Ar = (AnonymousClass1Ar) this.f17387K.get(measuredWidth);
                if (anonymousClass1Ar != null) {
                    anonymousClass1Ar.onPageScrolled(i, f, i2);
                }
            }
        }
        anonymousClass1Ar = this.f17381E;
        if (anonymousClass1Ar != null) {
            anonymousClass1Ar.onPageScrolled(i, f, i2);
        }
        if (this.f17418p != null) {
            i3 = getScrollX();
            int childCount2 = getChildCount();
            for (int i5 = 0; i5 < childCount2; i5++) {
                View childAt2 = getChildAt(i5);
                if (!((AnonymousClass1mo) childAt2.getLayoutParams()).f22631D) {
                    this.f17418p.transformPage(childAt2, ((float) (childAt2.getLeft() - i3)) / ((float) getClientWidth()));
                }
            }
        }
        this.f17393Q = true;
    }

    /* renamed from: K */
    private boolean m10876K() {
        this.f17390N = -1;
        this.f17382F = false;
        this.f17383G = false;
        VelocityTracker velocityTracker = this.f17389M;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f17389M = null;
        }
        this.f17412j.onRelease();
        this.f17423u.onRelease();
        if (!this.f17412j.isFinished()) {
            if (!this.f17423u.isFinished()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: L */
    private void m10877L(int i, boolean z, int i2, boolean z2) {
        AnonymousClass1mn I = m10886I(i);
        int clientWidth = I != null ? (int) (((float) getClientWidth()) * Math.max(this.f17404b, Math.min(I.f22625C, this.f17411i))) : 0;
        if (z) {
            m10896S(clientWidth, 0, i2);
            if (z2) {
                m10869D(i);
                return;
            }
            return;
        }
        if (z2) {
            m10869D(i);
        }
        m10868C(false);
        scrollTo(clientWidth, 0);
        m10873H(clientWidth);
    }

    /* renamed from: L */
    public final boolean m10889L() {
        int i = this.f17379C;
        if (i <= 0) {
            return false;
        }
        mo2479P(i - 1, true);
        return true;
    }

    /* renamed from: M */
    private void m10878M() {
        if (this.f17398V != 0) {
            ArrayList arrayList = this.f17399W;
            if (arrayList == null) {
                this.f17399W = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f17399W.add(getChildAt(i));
            }
            Collections.sort(this.f17399W, FB);
        }
    }

    /* renamed from: M */
    public final boolean m10890M() {
        AnonymousClass1LO anonymousClass1LO = this.f17378B;
        if (anonymousClass1LO == null || this.f17379C >= anonymousClass1LO.getCount() - 1) {
            return false;
        }
        mo2479P(this.f17379C + 1, true);
        return true;
    }

    /* renamed from: N */
    public final void m10891N() {
        m10892O(this.f17379C);
    }

    /* renamed from: O */
    public final void m10892O(int r16) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r15 = this;
        r4 = r15;
        r0 = r15.f17379C;
        r1 = r16;
        if (r0 == r1) goto L_0x000e;
    L_0x0007:
        r10 = r15.m10886I(r0);
        r15.f17379C = r1;
        goto L_0x000f;
    L_0x000e:
        r10 = 0;
    L_0x000f:
        r0 = r15.f17378B;
        if (r0 != 0) goto L_0x0017;
    L_0x0013:
        r15.m10878M();
        return;
    L_0x0017:
        r0 = r15.f17419q;
        if (r0 == 0) goto L_0x001c;
    L_0x001b:
        goto L_0x0013;
    L_0x001c:
        r0 = r15.getWindowToken();
        if (r0 != 0) goto L_0x0023;
    L_0x0022:
        return;
    L_0x0023:
        r0 = r15.f17378B;
        r0.mo2433H(r15);
        r2 = r15.f17416n;
        r1 = r15.f17379C;
        r1 = r1 - r2;
        r0 = 0;
        r11 = java.lang.Math.max(r0, r1);
        r0 = r15.f17378B;
        r5 = r0.getCount();
        r1 = r5 + -1;
        r0 = r15.f17379C;
        r0 = r0 + r2;
        r9 = java.lang.Math.min(r1, r0);
        r0 = r15.f17401Y;
        if (r5 != r0) goto L_0x01f1;
    L_0x0045:
        r8 = 0;
    L_0x0046:
        r0 = r15.f17384H;
        r0 = r0.size();
        if (r8 >= r0) goto L_0x0066;
    L_0x004e:
        r0 = r15.f17384H;
        r7 = r0.get(r8);
        r7 = (X.AnonymousClass1mn) r7;
        r1 = r7.f22626D;
        r0 = r15.f17379C;
        if (r1 < r0) goto L_0x0063;
    L_0x005c:
        r1 = r7.f22626D;
        r0 = r15.f17379C;
        if (r1 != r0) goto L_0x0066;
    L_0x0062:
        goto L_0x0067;
    L_0x0063:
        r8 = r8 + 1;
        goto L_0x0046;
    L_0x0066:
        r7 = 0;
    L_0x0067:
        if (r7 != 0) goto L_0x0071;
    L_0x0069:
        if (r5 <= 0) goto L_0x0071;
    L_0x006b:
        r0 = r15.f17379C;
        r7 = r15.m10879A(r0, r8);
    L_0x0071:
        r16 = 0;
        if (r7 == 0) goto L_0x0171;
    L_0x0075:
        r6 = r8 + -1;
        if (r6 < 0) goto L_0x0082;
    L_0x0079:
        r0 = r15.f17384H;
        r2 = r0.get(r6);
        r2 = (X.AnonymousClass1mn) r2;
        goto L_0x0083;
    L_0x0082:
        r2 = 0;
    L_0x0083:
        r1 = r15.getClientWidth();
        r15 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r1 > 0) goto L_0x008d;
    L_0x008b:
        r14 = 0;
        goto L_0x0099;
    L_0x008d:
        r0 = r7.f22628F;
        r14 = r15 - r0;
        r0 = r4.getPaddingLeft();
        r3 = (float) r0;
        r0 = (float) r1;
        r3 = r3 / r0;
        r14 = r14 + r3;
    L_0x0099:
        r0 = r4.f17379C;
        r3 = r0 + -1;
        r13 = 0;
    L_0x009e:
        if (r3 < 0) goto L_0x00ec;
    L_0x00a0:
        r0 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1));
        if (r0 < 0) goto L_0x00cc;
    L_0x00a4:
        if (r3 >= r11) goto L_0x00cc;
    L_0x00a6:
        if (r2 != 0) goto L_0x00a9;
    L_0x00a8:
        goto L_0x00ec;
    L_0x00a9:
        r0 = r2.f22626D;
        if (r3 != r0) goto L_0x00e9;
    L_0x00ad:
        r0 = r2.f22627E;
        if (r0 != 0) goto L_0x00e9;
    L_0x00b1:
        r0 = r4.f17384H;
        r0.remove(r6);
        r12 = r4.f17378B;
        r0 = r2.f22624B;
        r12.destroyItem(r4, r3, r0);
        r6 = r6 + -1;
        r8 = r8 + -1;
        if (r6 < 0) goto L_0x00e8;
    L_0x00c3:
        r0 = r4.f17384H;
        r2 = r0.get(r6);
        r2 = (X.AnonymousClass1mn) r2;
        goto L_0x00e9;
    L_0x00cc:
        if (r2 == 0) goto L_0x00da;
    L_0x00ce:
        r0 = r2.f22626D;
        if (r3 != r0) goto L_0x00da;
    L_0x00d2:
        r0 = r2.f22628F;
        r13 = r13 + r0;
        r6 = r6 + -1;
        if (r6 < 0) goto L_0x00e8;
    L_0x00d9:
        goto L_0x00c3;
    L_0x00da:
        r0 = r6 + 1;
        r0 = r4.m10879A(r3, r0);
        r0 = r0.f22628F;
        r13 = r13 + r0;
        r8 = r8 + 1;
        if (r6 < 0) goto L_0x00e8;
    L_0x00e7:
        goto L_0x00c3;
    L_0x00e8:
        r2 = 0;
    L_0x00e9:
        r3 = r3 + -1;
        goto L_0x009e;
    L_0x00ec:
        r6 = r7.f22628F;
        r3 = r8 + 1;
        r0 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1));
        if (r0 >= 0) goto L_0x016e;
    L_0x00f4:
        r0 = r4.f17384H;
        r0 = r0.size();
        if (r3 >= r0) goto L_0x0105;
    L_0x00fc:
        r0 = r4.f17384H;
        r12 = r0.get(r3);
        r12 = (X.AnonymousClass1mn) r12;
        goto L_0x0106;
    L_0x0105:
        r12 = 0;
    L_0x0106:
        if (r1 > 0) goto L_0x010a;
    L_0x0108:
        r2 = 0;
        goto L_0x0112;
    L_0x010a:
        r0 = r4.getPaddingRight();
        r2 = (float) r0;
        r0 = (float) r1;
        r2 = r2 / r0;
        r2 = r2 + r15;
    L_0x0112:
        r1 = r4.f17379C;
    L_0x0114:
        r1 = r1 + 1;
        if (r1 >= r5) goto L_0x016e;
    L_0x0118:
        r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r0 < 0) goto L_0x0148;
    L_0x011c:
        if (r1 <= r9) goto L_0x0148;
    L_0x011e:
        if (r12 != 0) goto L_0x0121;
    L_0x0120:
        goto L_0x016e;
    L_0x0121:
        r0 = r12.f22626D;
        if (r1 != r0) goto L_0x0114;
    L_0x0125:
        r0 = r12.f22627E;
        if (r0 != 0) goto L_0x0114;
    L_0x0129:
        r0 = r4.f17384H;
        r0.remove(r3);
        r11 = r4.f17378B;
        r0 = r12.f22624B;
        r11.destroyItem(r4, r1, r0);
        r0 = r4.f17384H;
        r0 = r0.size();
        if (r3 >= r0) goto L_0x0146;
    L_0x013d:
        r0 = r4.f17384H;
        r12 = r0.get(r3);
        r12 = (X.AnonymousClass1mn) r12;
        goto L_0x0114;
    L_0x0146:
        r12 = 0;
        goto L_0x0114;
    L_0x0148:
        if (r12 == 0) goto L_0x015c;
    L_0x014a:
        r0 = r12.f22626D;
        if (r1 != r0) goto L_0x015c;
    L_0x014e:
        r0 = r12.f22628F;
        r6 = r6 + r0;
        r3 = r3 + 1;
        r0 = r4.f17384H;
        r0 = r0.size();
        if (r3 >= r0) goto L_0x0146;
    L_0x015b:
        goto L_0x013d;
    L_0x015c:
        r0 = r4.m10879A(r1, r3);
        r3 = r3 + 1;
        r0 = r0.f22628F;
        r6 = r6 + r0;
        r0 = r4.f17384H;
        r0 = r0.size();
        if (r3 >= r0) goto L_0x0146;
    L_0x016d:
        goto L_0x013d;
    L_0x016e:
        r4.m10867B(r7, r8, r10);
    L_0x0171:
        r2 = r4.f17378B;
        r1 = r4.f17379C;
        if (r7 == 0) goto L_0x017a;
    L_0x0177:
        r0 = r7.f22624B;
        goto L_0x017b;
    L_0x017a:
        r0 = 0;
    L_0x017b:
        r2.mo2432G(r4, r1, r0);
        r0 = r4.f17378B;
        r0.mo2429A(r4);
        r5 = r4.getChildCount();
        r3 = 0;
    L_0x0188:
        if (r3 >= r5) goto L_0x01b1;
    L_0x018a:
        r1 = r4.getChildAt(r3);
        r2 = r1.getLayoutParams();
        r2 = (X.AnonymousClass1mo) r2;
        r2.f22629B = r3;
        r0 = r2.f22631D;
        if (r0 != 0) goto L_0x01ae;
    L_0x019a:
        r0 = r2.f22634G;
        r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1));
        if (r0 != 0) goto L_0x01ae;
    L_0x01a0:
        r1 = r4.m10885H(r1);
        if (r1 == 0) goto L_0x01ae;
    L_0x01a6:
        r0 = r1.f22628F;
        r2.f22634G = r0;
        r0 = r1.f22626D;
        r2.f22633F = r0;
    L_0x01ae:
        r3 = r3 + 1;
        goto L_0x0188;
    L_0x01b1:
        r4.m10878M();
        r0 = r4.hasFocus();
        if (r0 == 0) goto L_0x0022;
    L_0x01ba:
        r0 = r4.findFocus();
        if (r0 == 0) goto L_0x01c5;
    L_0x01c0:
        r0 = r4.m10884G(r0);
        goto L_0x01c6;
    L_0x01c5:
        r0 = 0;
    L_0x01c6:
        if (r0 == 0) goto L_0x01ce;
    L_0x01c8:
        r1 = r0.f22626D;
        r0 = r4.f17379C;
        if (r1 == r0) goto L_0x0022;
    L_0x01ce:
        r3 = 0;
    L_0x01cf:
        r0 = r4.getChildCount();
        if (r3 >= r0) goto L_0x0022;
    L_0x01d5:
        r2 = r4.getChildAt(r3);
        r0 = r4.m10885H(r2);
        if (r0 == 0) goto L_0x01ee;
    L_0x01df:
        r1 = r0.f22626D;
        r0 = r4.f17379C;
        if (r1 != r0) goto L_0x01ee;
    L_0x01e5:
        r0 = 2;
        r0 = r2.requestFocus(r0);
        if (r0 == 0) goto L_0x01ee;
    L_0x01ec:
        goto L_0x0022;
    L_0x01ee:
        r3 = r3 + 1;
        goto L_0x01cf;
    L_0x01f1:
        r1 = r15.getResources();	 Catch:{ NotFoundException -> 0x01fe }
        r0 = r15.getId();	 Catch:{ NotFoundException -> 0x01fe }
        r3 = r1.getResourceName(r0);	 Catch:{ NotFoundException -> 0x01fe }
        goto L_0x0206;	 Catch:{ NotFoundException -> 0x01fe }
    L_0x01fe:
        r0 = r15.getId();
        r3 = java.lang.Integer.toHexString(r0);
    L_0x0206:
        r2 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ";
        r1.append(r0);
        r0 = r15.f17401Y;
        r1.append(r0);
        r0 = ", found: ";
        r1.append(r0);
        r1.append(r5);
        r0 = " Pager id: ";
        r1.append(r0);
        r1.append(r3);
        r0 = " Pager class: ";
        r1.append(r0);
        r0 = r15.getClass();
        r1.append(r0);
        r0 = " Problematic adapter: ";
        r1.append(r0);
        r0 = r15.f17378B;
        r0 = r0.getClass();
        r1.append(r0);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.O(int):void");
    }

    /* renamed from: P */
    public void mo2479P(int i, boolean z) {
        this.f17419q = false;
        m10894Q(i, z, false);
    }

    /* renamed from: Q */
    public final void m10894Q(int i, boolean z, boolean z2) {
        mo2472R(i, z, z2, 0);
    }

    /* renamed from: R */
    public void mo2472R(int i, boolean z, boolean z2, int i2) {
        AnonymousClass1LO anonymousClass1LO = this.f17378B;
        if (anonymousClass1LO != null) {
            if (anonymousClass1LO.getCount() > 0) {
                if (z2 || this.f17379C != i || this.f17384H.size() == 0) {
                    boolean z3 = true;
                    if (i < 0) {
                        i = 0;
                    } else if (i >= this.f17378B.getCount()) {
                        i = this.f17378B.getCount() - 1;
                    }
                    int i3 = this.f17416n;
                    int i4 = this.f17379C;
                    if (i > i4 + i3 || i < i4 - i3) {
                        for (i4 = 0; i4 < this.f17384H.size(); i4++) {
                            ((AnonymousClass1mn) this.f17384H.get(i4)).f22627E = true;
                        }
                    }
                    if (this.f17379C == i) {
                        z3 = false;
                    }
                    if (this.f17403a) {
                        this.f17379C = i;
                        if (z3) {
                            m10869D(i);
                        }
                        requestLayout();
                    } else {
                        m10892O(i);
                        m10877L(i, z, i2, z3);
                    }
                    return;
                }
            }
        }
        setScrollingCacheEnabled(false);
    }

    /* renamed from: S */
    public final void m10896S(int i, int i2, int i3) {
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int currX;
        Scroller scroller = this.f17425w;
        Object obj = (scroller == null || scroller.isFinished()) ? null : 1;
        if (obj != null) {
            currX = this.f17408f ? this.f17425w.getCurrX() : this.f17425w.getStartX();
            this.f17425w.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            currX = getScrollX();
        }
        int scrollY = getScrollY();
        int i4 = i - currX;
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            m10868C(false);
            m10891N();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        float f = (float) clientWidth;
        float f2 = (float) (clientWidth / 2);
        f2 += ((float) Math.sin((double) ((Math.min(1.0f, (((float) Math.abs(i4)) * 1.0f) / f) - 0.5f) * 0.47123894f))) * f2;
        int abs = Math.abs(i3);
        if (abs > 0) {
            clientWidth = Math.round(Math.abs(f2 / ((float) abs)) * 1000.0f) * 4;
        } else {
            clientWidth = (int) (((((float) Math.abs(i4)) / ((f * this.f17378B.m10835B(this.f17379C)) + ((float) this.f17417o))) + 1.0f) * 100.0f);
        }
        int min = Math.min(clientWidth, 600);
        this.f17408f = false;
        this.f17425w.startScroll(currX, scrollY, i4, i5, min);
        AnonymousClass0mE.m7520J(this);
    }

    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    AnonymousClass1mn H = m10885H(childAt);
                    if (H != null && H.f22626D == this.f17379C) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            if (arrayList != null) {
                arrayList.add(this);
            }
        }
    }

    public final void addTouchables(ArrayList arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                AnonymousClass1mn H = m10885H(childAt);
                if (H != null && H.f22626D == this.f17379C) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public final void addView(View view, int i, LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        AnonymousClass1mo anonymousClass1mo = (AnonymousClass1mo) layoutParams;
        anonymousClass1mo.f22631D |= view.getClass().getAnnotation(ViewPager$DecorView.class) != null ? 1 : 0;
        if (this.f17405c) {
            if (anonymousClass1mo != null) {
                if (anonymousClass1mo.f22631D) {
                    throw new IllegalStateException("Cannot add pager decor view during layout");
                }
            }
            anonymousClass1mo.f22632E = true;
            addViewInLayout(view, i, layoutParams);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public final boolean canScrollHorizontally(int i) {
        if (this.f17378B == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX <= ((int) (((float) clientWidth) * this.f17404b))) {
                return false;
            }
        } else if (i <= 0 || scrollX >= ((int) (((float) clientWidth) * this.f17411i))) {
            return false;
        }
        return true;
    }

    public final boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof AnonymousClass1mo) && super.checkLayoutParams(layoutParams);
    }

    public final void computeScroll() {
        this.f17408f = true;
        if (this.f17425w.isFinished() || !this.f17425w.computeScrollOffset()) {
            m10868C(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f17425w.getCurrX();
        int currY = this.f17425w.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m10873H(currX)) {
                this.f17425w.abortAnimation();
                scrollTo(0, currY);
            }
        }
        AnonymousClass0mE.m7520J(this);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent)) {
            boolean C;
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                int i = 2;
                if (keyCode != 61) {
                    switch (keyCode) {
                        case 21:
                            if (!keyEvent.hasModifiers(2)) {
                                C = m10881C(17);
                                break;
                            }
                            C = m10889L();
                            break;
                        case 22:
                            if (!keyEvent.hasModifiers(2)) {
                                C = m10881C(66);
                                break;
                            }
                            C = m10878M();
                            break;
                        default:
                            break;
                    }
                }
                if (!keyEvent.hasNoModifiers()) {
                    i = 1;
                    if (keyEvent.hasModifiers(1)) {
                    }
                }
                C = m10881C(i);
                if (C) {
                    return false;
                }
            }
            C = false;
            if (C) {
                return false;
            }
        }
        return true;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == DexStore.LOAD_RESULT_DEX2OAT_QUICKEN_ATTEMPTED) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                AnonymousClass1mn H = m10885H(childAt);
                if (H != null && H.f22626D == this.f17379C && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        int i = 0;
        if (overScrollMode != 0) {
            if (overScrollMode == 1) {
                AnonymousClass1LO anonymousClass1LO = this.f17378B;
                if (anonymousClass1LO != null && anonymousClass1LO.getCount() > 1) {
                }
            }
            this.f17412j.finish();
            this.f17423u.finish();
            if (i != 0) {
                AnonymousClass0mE.m7520J(this);
            }
        }
        if (!this.f17412j.isFinished()) {
            int save = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((float) ((-height) + getPaddingTop()), this.f17404b * ((float) width));
            this.f17412j.setSize(height, width);
            i = 0 | this.f17412j.draw(canvas);
            canvas.restoreToCount(save);
        }
        if (!this.f17423u.isFinished()) {
            width = canvas.save();
            save = getWidth();
            height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate((float) (-getPaddingTop()), (-(this.f17411i + 1.0f)) * ((float) save));
            this.f17423u.setSize(height, save);
            i |= this.f17423u.draw(canvas);
            canvas.restoreToCount(width);
        }
        if (i != 0) {
            AnonymousClass0mE.m7520J(this);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f17413k;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public final LayoutParams generateDefaultLayoutParams() {
        return new AnonymousClass1mo();
    }

    public final LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new AnonymousClass1mo(getContext(), attributeSet);
    }

    public final LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AnonymousClass1LO getAdapter() {
        return this.f17378B;
    }

    public final int getChildDrawingOrder(int i, int i2) {
        if (this.f17398V == 2) {
            i2 = (i - 1) - i2;
        }
        return ((AnonymousClass1mo) ((View) this.f17399W.get(i2)).getLayoutParams()).f22629B;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public int getCurrentItem() {
        return this.f17379C;
    }

    public int getOffscreenPageLimit() {
        return this.f17416n;
    }

    public int getPageMargin() {
        return this.f17417o;
    }

    public void onAttachedToWindow() {
        int N = AnonymousClass0cQ.m5864N(this, -1082060476);
        super.onAttachedToWindow();
        this.f17403a = true;
        AnonymousClass0cQ.m5865O(this, 1017043608, N);
    }

    public void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.m5864N(this, 814782289);
        removeCallbacks(this.f17400X);
        Scroller scroller = this.f17425w;
        if (!(scroller == null || scroller.isFinished())) {
            this.f17425w.abortAnimation();
        }
        super.onDetachedFromWindow();
        AnonymousClass0cQ.m5865O(this, -1155817088, N);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f17417o > 0 && r9.f17413k != null && r9.f17384H.size() > 0 && r9.f17378B != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f = (float) width;
            float f2 = ((float) r9.f17417o) / f;
            int i = 0;
            AnonymousClass1mn anonymousClass1mn = (AnonymousClass1mn) r9.f17384H.get(0);
            float f3 = anonymousClass1mn.f22625C;
            int size = r9.f17384H.size();
            int i2 = anonymousClass1mn.f22626D;
            int i3 = ((AnonymousClass1mn) r9.f17384H.get(size - 1)).f22626D;
            while (i2 < i3) {
                float f4;
                while (i2 > anonymousClass1mn.f22626D && i < size) {
                    i++;
                    anonymousClass1mn = (AnonymousClass1mn) r9.f17384H.get(i);
                }
                if (i2 == anonymousClass1mn.f22626D) {
                    f4 = (anonymousClass1mn.f22625C + anonymousClass1mn.f22628F) * f;
                    f3 = (anonymousClass1mn.f22625C + anonymousClass1mn.f22628F) + f2;
                } else {
                    float B = r9.f17378B.m10835B(i2);
                    f4 = (f3 + B) * f;
                    f3 += B + f2;
                }
                if (((float) r9.f17417o) + f4 > ((float) scrollX)) {
                    r9.f17413k.setBounds(Math.round(f4), r9.AB, Math.round(((float) r9.f17417o) + f4), r9.f17392P);
                    r9.f17413k.draw(canvas);
                }
                if (f4 <= ((float) (scrollX + width))) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent2.getAction() & 255;
        View view = this;
        if (action != 3) {
            if (action != 1) {
                if (action != 0) {
                    if (view.f17382F) {
                        return true;
                    }
                    if (view.f17383G) {
                        return false;
                    }
                }
                ViewParent parent;
                if (action == 0) {
                    float x = motionEvent2.getX();
                    view.f17406d = x;
                    view.f17409g = x;
                    x = motionEvent2.getY();
                    view.f17407e = x;
                    view.f17410h = x;
                    view.f17390N = motionEvent2.getPointerId(0);
                    view.f17383G = false;
                    view.f17408f = true;
                    view.f17425w.computeScrollOffset();
                    if (view.f17424v != 2 || Math.abs(view.f17425w.getFinalX() - view.f17425w.getCurrX()) <= view.f17395S) {
                        m10868C(false);
                        view.f17382F = false;
                    } else {
                        view.f17425w.abortAnimation();
                        view.f17419q = false;
                        m10891N();
                        view.f17382F = true;
                        parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        setScrollState(1);
                    }
                } else if (action == 2) {
                    int i = view.f17390N;
                    if (i != -1) {
                        i = motionEvent2.findPointerIndex(i);
                        float x2 = motionEvent2.getX(i);
                        float f = x2 - view.f17409g;
                        float abs = Math.abs(f);
                        float y = motionEvent2.getY(i);
                        float abs2 = Math.abs(y - view.f17407e);
                        if (f != 0.0f) {
                            float f2 = view.f17409g;
                            Object obj = ((f2 >= ((float) view.mGutterSize) || f <= 0.0f) && (f2 <= ((float) (getWidth() - view.mGutterSize)) || f >= 0.0f)) ? null : 1;
                            if (obj == null) {
                                if (mo2476D(view, false, (int) f, (int) x2, (int) y)) {
                                    view.f17409g = x2;
                                    view.f17410h = y;
                                    view.f17383G = true;
                                    return false;
                                }
                            }
                        }
                        if (abs > ((float) view.BB) && abs * 0.5f > abs2) {
                            view.f17382F = true;
                            parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            setScrollState(1);
                            view.f17409g = f > 0.0f ? view.f17406d + ((float) view.BB) : view.f17406d - ((float) view.BB);
                            view.f17410h = y;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > ((float) view.BB)) {
                            view.f17383G = true;
                        }
                        if (view.f17382F && m10874I(x2)) {
                            AnonymousClass0mE.m7520J(view);
                        }
                    }
                } else if (action == 6) {
                    m10872G(motionEvent2);
                }
                if (view.f17389M == null) {
                    view.f17389M = VelocityTracker.obtain();
                }
                view.f17389M.addMovement(motionEvent2);
                return view.f17382F;
            }
        }
        m10876K();
        return false;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean z2;
        int childCount = getChildCount();
        int i6 = i3 - i;
        int i7 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                AnonymousClass1mo anonymousClass1mo = (AnonymousClass1mo) childAt.getLayoutParams();
                if (anonymousClass1mo.f22631D) {
                    int max;
                    i5 = anonymousClass1mo.f22630C & 7;
                    int i10 = anonymousClass1mo.f22630C & 112;
                    if (i5 == 1) {
                        i5 = Math.max((i6 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else if (i5 == 3) {
                        i5 = paddingLeft;
                        paddingLeft = childAt.getMeasuredWidth() + paddingLeft;
                    } else if (i5 != 5) {
                        i5 = paddingLeft;
                    } else {
                        i5 = (i6 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    if (i10 == 16) {
                        max = Math.max((i7 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    } else if (i10 == 48) {
                        max = paddingTop;
                        paddingTop = childAt.getMeasuredHeight() + paddingTop;
                    } else if (i10 != 80) {
                        max = paddingTop;
                    } else {
                        max = (i7 - paddingBottom) - childAt.getMeasuredHeight();
                        paddingBottom += childAt.getMeasuredHeight();
                    }
                    i5 += scrollX;
                    childAt.layout(i5, max, childAt.getMeasuredWidth() + i5, childAt.getMeasuredHeight() + max);
                    i8++;
                }
            }
        }
        i6 = (i6 - paddingLeft) - paddingRight;
        for (i5 = 0; i5 < childCount; i5++) {
            View childAt2 = getChildAt(i5);
            if (childAt2.getVisibility() != 8) {
                AnonymousClass1mo anonymousClass1mo2 = (AnonymousClass1mo) childAt2.getLayoutParams();
                if (!anonymousClass1mo2.f22631D) {
                    AnonymousClass1mn H = m10885H(childAt2);
                    if (H != null) {
                        float f = (float) i6;
                        int i11 = ((int) (H.f22625C * f)) + paddingLeft;
                        if (anonymousClass1mo2.f22632E) {
                            anonymousClass1mo2.f22632E = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (f * anonymousClass1mo2.f22634G), 1073741824), MeasureSpec.makeMeasureSpec((i7 - paddingTop) - paddingBottom, 1073741824));
                        }
                        childAt2.layout(i11, paddingTop, childAt2.getMeasuredWidth() + i11, childAt2.getMeasuredHeight() + paddingTop);
                    }
                }
            }
        }
        this.AB = paddingTop;
        this.f17392P = i7 - paddingBottom;
        this.f17396T = i8;
        if (this.f17403a) {
            z2 = false;
            m10877L(this.f17379C, false, 0, false);
        } else {
            z2 = false;
        }
        this.f17403a = z2;
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.f17397U);
        measuredWidth = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i3 = 0;
        while (true) {
            boolean z = true;
            int i4 = 1073741824;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                AnonymousClass1mo anonymousClass1mo = (AnonymousClass1mo) childAt.getLayoutParams();
                if (anonymousClass1mo != null && anonymousClass1mo.f22631D) {
                    Object obj;
                    int i5;
                    int i6;
                    int i7;
                    int i8 = anonymousClass1mo.f22630C & 7;
                    int i9 = anonymousClass1mo.f22630C & 112;
                    if (i9 != 48) {
                        if (i9 != 80) {
                            obj = null;
                            if (i8 != 3) {
                                if (i8 == 5) {
                                    z = false;
                                }
                            }
                            i5 = Process.WAIT_RESULT_TIMEOUT;
                            if (obj != null) {
                                i5 = 1073741824;
                            } else if (z) {
                                i6 = 1073741824;
                                if (anonymousClass1mo.width == -2) {
                                    i9 = anonymousClass1mo.width == -1 ? anonymousClass1mo.width : measuredWidth;
                                    i5 = 1073741824;
                                } else {
                                    i9 = measuredWidth;
                                }
                                if (anonymousClass1mo.height != -2) {
                                    i7 = anonymousClass1mo.height == -1 ? anonymousClass1mo.height : measuredHeight;
                                } else {
                                    i7 = measuredHeight;
                                    i4 = i6;
                                }
                                childAt.measure(MeasureSpec.makeMeasureSpec(i9, i5), MeasureSpec.makeMeasureSpec(i7, i4));
                                if (obj == null) {
                                    measuredHeight -= childAt.getMeasuredHeight();
                                } else if (!z) {
                                    measuredWidth -= childAt.getMeasuredWidth();
                                }
                            }
                            i6 = Process.WAIT_RESULT_TIMEOUT;
                            if (anonymousClass1mo.width == -2) {
                                i9 = measuredWidth;
                            } else {
                                if (anonymousClass1mo.width == -1) {
                                }
                                i5 = 1073741824;
                            }
                            if (anonymousClass1mo.height != -2) {
                                i7 = measuredHeight;
                                i4 = i6;
                            } else if (anonymousClass1mo.height == -1) {
                            }
                            childAt.measure(MeasureSpec.makeMeasureSpec(i9, i5), MeasureSpec.makeMeasureSpec(i7, i4));
                            if (obj == null) {
                                measuredHeight -= childAt.getMeasuredHeight();
                            } else if (!z) {
                                measuredWidth -= childAt.getMeasuredWidth();
                            }
                        }
                    }
                    obj = 1;
                    if (i8 != 3) {
                        if (i8 == 5) {
                            z = false;
                        }
                    }
                    i5 = Process.WAIT_RESULT_TIMEOUT;
                    if (obj != null) {
                        i5 = 1073741824;
                    } else if (z) {
                        i6 = 1073741824;
                        if (anonymousClass1mo.width == -2) {
                            if (anonymousClass1mo.width == -1) {
                            }
                            i5 = 1073741824;
                        } else {
                            i9 = measuredWidth;
                        }
                        if (anonymousClass1mo.height != -2) {
                            i7 = measuredHeight;
                            i4 = i6;
                        } else if (anonymousClass1mo.height == -1) {
                        }
                        childAt.measure(MeasureSpec.makeMeasureSpec(i9, i5), MeasureSpec.makeMeasureSpec(i7, i4));
                        if (obj == null) {
                            measuredHeight -= childAt.getMeasuredHeight();
                        } else if (!z) {
                            measuredWidth -= childAt.getMeasuredWidth();
                        }
                    }
                    i6 = Process.WAIT_RESULT_TIMEOUT;
                    if (anonymousClass1mo.width == -2) {
                        i9 = measuredWidth;
                    } else {
                        if (anonymousClass1mo.width == -1) {
                        }
                        i5 = 1073741824;
                    }
                    if (anonymousClass1mo.height != -2) {
                        i7 = measuredHeight;
                        i4 = i6;
                    } else if (anonymousClass1mo.height == -1) {
                    }
                    childAt.measure(MeasureSpec.makeMeasureSpec(i9, i5), MeasureSpec.makeMeasureSpec(i7, i4));
                    if (obj == null) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (!z) {
                        measuredWidth -= childAt.getMeasuredWidth();
                    }
                }
            }
            i3++;
        }
        MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        this.f17394R = MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f17405c = true;
        m10891N();
        int i10 = 0;
        this.f17405c = false;
        measuredHeight = getChildCount();
        while (i10 < measuredHeight) {
            View childAt2 = getChildAt(i10);
            if (childAt2.getVisibility() != 8) {
                AnonymousClass1mo anonymousClass1mo2 = (AnonymousClass1mo) childAt2.getLayoutParams();
                if (anonymousClass1mo2 == null || !anonymousClass1mo2.f22631D) {
                    childAt2.measure(MeasureSpec.makeMeasureSpec((int) (((float) measuredWidth) * anonymousClass1mo2.f22634G), 1073741824), this.f17394R);
                }
            }
            i10++;
        }
    }

    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
        }
        while (i2 != i4) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                AnonymousClass1mn H = m10885H(childAt);
                if (H != null && H.f22626D == this.f17379C && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            i2 += i3;
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof ViewPager$SavedState) {
            ViewPager$SavedState viewPager$SavedState = (ViewPager$SavedState) parcelable;
            super.onRestoreInstanceState(viewPager$SavedState.f13609B);
            AnonymousClass1LO anonymousClass1LO = this.f17378B;
            if (anonymousClass1LO != null) {
                anonymousClass1LO.mo2430E(viewPager$SavedState.f22637B, viewPager$SavedState.f22638C);
                m10894Q(viewPager$SavedState.f22639D, false, true);
            } else {
                this.f17422t = viewPager$SavedState.f22639D;
                this.f17420r = viewPager$SavedState.f22637B;
                this.f17421s = viewPager$SavedState.f22638C;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable viewPager$SavedState = new ViewPager$SavedState(super.onSaveInstanceState());
        viewPager$SavedState.f22639D = this.f17379C;
        AnonymousClass1LO anonymousClass1LO = this.f17378B;
        if (anonymousClass1LO != null) {
            viewPager$SavedState.f22637B = anonymousClass1LO.mo2431F();
        }
        return viewPager$SavedState;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.m5864N(this, 665317803);
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f17417o;
            m10875J(i, i3, i5, i5);
        }
        AnonymousClass0cQ.m5865O(this, 2145710515, N);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.m5863M(this, 1225455073);
        if (this.f17402Z) {
            AnonymousClass0cQ.m5862L(this, 658367851, M);
            return true;
        }
        boolean z = false;
        if (motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) {
            AnonymousClass1LO anonymousClass1LO = this.f17378B;
            if (anonymousClass1LO != null) {
                if (anonymousClass1LO.getCount() != 0) {
                    if (this.f17389M == null) {
                        this.f17389M = VelocityTracker.obtain();
                    }
                    this.f17389M.addMovement(motionEvent);
                    float x;
                    int scrollX;
                    float f;
                    switch (motionEvent.getAction() & 255) {
                        case 0:
                            this.f17425w.abortAnimation();
                            this.f17419q = false;
                            m10891N();
                            x = motionEvent.getX();
                            this.f17406d = x;
                            this.f17409g = x;
                            x = motionEvent.getY();
                            this.f17407e = x;
                            this.f17410h = x;
                            this.f17390N = motionEvent.getPointerId(0);
                            break;
                        case 1:
                            if (this.f17382F) {
                                VelocityTracker velocityTracker = this.f17389M;
                                velocityTracker.computeCurrentVelocity(JsonMappingException.MAX_REFS_TO_LIST, (float) this.f17414l);
                                int xVelocity = (int) velocityTracker.getXVelocity(this.f17390N);
                                this.f17419q = true;
                                int clientWidth = getClientWidth();
                                scrollX = getScrollX();
                                AnonymousClass1mn F = m10871F();
                                x = (float) clientWidth;
                                float f2 = ((float) this.f17417o) / x;
                                clientWidth = F.f22626D;
                                f = ((((float) scrollX) / x) - F.f22625C) / (F.f22628F + f2);
                                if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f17390N)) - this.f17406d)) <= this.f17380D || Math.abs(xVelocity) <= this.f17385I) {
                                    clientWidth += (int) (f + (clientWidth >= this.f17379C ? 0.4f : 0.6f));
                                } else if (xVelocity <= 0) {
                                    clientWidth++;
                                }
                                if (this.f17384H.size() > 0) {
                                    AnonymousClass1mn anonymousClass1mn = (AnonymousClass1mn) this.f17384H.get(0);
                                    ArrayList arrayList = this.f17384H;
                                    clientWidth = Math.max(anonymousClass1mn.f22626D, Math.min(clientWidth, ((AnonymousClass1mn) arrayList.get(arrayList.size() - 1)).f22626D));
                                }
                                mo2472R(clientWidth, true, true, xVelocity);
                                z = m10876K();
                                break;
                            }
                            break;
                        case 2:
                            if (!this.f17382F) {
                                scrollX = motionEvent.findPointerIndex(this.f17390N);
                                if (scrollX == -1) {
                                    z = m10876K();
                                    break;
                                }
                                float x2 = motionEvent.getX(scrollX);
                                float abs = Math.abs(x2 - this.f17409g);
                                float y = motionEvent.getY(scrollX);
                                f = Math.abs(y - this.f17410h);
                                if (abs > ((float) this.BB) && abs > f) {
                                    this.f17382F = true;
                                    ViewParent parent = getParent();
                                    if (parent != null) {
                                        parent.requestDisallowInterceptTouchEvent(true);
                                    }
                                    f = this.f17406d;
                                    this.f17409g = x2 - f > 0.0f ? f + ((float) this.BB) : f - ((float) this.BB);
                                    this.f17410h = y;
                                    setScrollState(1);
                                    setScrollingCacheEnabled(true);
                                    parent = getParent();
                                    if (parent != null) {
                                        parent.requestDisallowInterceptTouchEvent(true);
                                    }
                                }
                            }
                            if (this.f17382F) {
                                z = false | m10874I(motionEvent.getX(motionEvent.findPointerIndex(this.f17390N)));
                                break;
                            }
                            break;
                        case 3:
                            if (this.f17382F) {
                                m10877L(this.f17379C, true, 0, false);
                                z = m10876K();
                                break;
                            }
                            break;
                        case 4:
                            break;
                        case 5:
                            scrollX = motionEvent.getActionIndex();
                            this.f17409g = motionEvent.getX(scrollX);
                            this.f17390N = motionEvent.getPointerId(scrollX);
                            break;
                        case 6:
                            m10872G(motionEvent);
                            this.f17409g = motionEvent.getX(motionEvent.findPointerIndex(this.f17390N));
                            break;
                        default:
                            break;
                    }
                    if (z) {
                        AnonymousClass0mE.m7520J(this);
                    }
                    AnonymousClass0cQ.m5862L(this, -668873660, M);
                    return true;
                }
            }
            AnonymousClass0cQ.m5862L(this, 124400264, M);
            return false;
        }
        AnonymousClass0cQ.m5862L(this, 1272481566, M);
        return false;
    }

    public final void removeView(View view) {
        if (this.f17405c) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setAdapter(X.AnonymousClass1LO r8) {
        /*
        r7 = this;
        r1 = r7.f17378B;
        r6 = 0;
        r4 = 0;
        if (r1 == 0) goto L_0x0058;
    L_0x0006:
        monitor-enter(r1);
        r1.f17330B = r6;	 Catch:{ all -> 0x00c8 }
        monitor-exit(r1);	 Catch:{ all -> 0x00c8 }
        r0 = r7.f17378B;
        r0.mo2433H(r7);
        r3 = 0;
    L_0x0010:
        r0 = r7.f17384H;
        r0 = r0.size();
        if (r3 >= r0) goto L_0x002c;
    L_0x0018:
        r0 = r7.f17384H;
        r0 = r0.get(r3);
        r0 = (X.AnonymousClass1mn) r0;
        r2 = r7.f17378B;
        r1 = r0.f22626D;
        r0 = r0.f22624B;
        r2.destroyItem(r7, r1, r0);
        r3 = r3 + 1;
        goto L_0x0010;
    L_0x002c:
        r0 = r7.f17378B;
        r0.mo2429A(r7);
        r0 = r7.f17384H;
        r0.clear();
        r1 = 0;
    L_0x0037:
        r0 = r7.getChildCount();
        if (r1 >= r0) goto L_0x0053;
    L_0x003d:
        r0 = r7.getChildAt(r1);
        r0 = r0.getLayoutParams();
        r0 = (X.AnonymousClass1mo) r0;
        r0 = r0.f22631D;
        if (r0 != 0) goto L_0x0050;
    L_0x004b:
        r7.removeViewAt(r1);
        r1 = r1 + -1;
    L_0x0050:
        r1 = r1 + 1;
        goto L_0x0037;
    L_0x0053:
        r7.f17379C = r4;
        r7.scrollTo(r4, r4);
    L_0x0058:
        r3 = r7.f17378B;
        r7.f17378B = r8;
        r7.f17401Y = r4;
        r0 = r7.f17378B;
        if (r0 == 0) goto L_0x00a7;
    L_0x0062:
        r0 = r7.f17415m;
        if (r0 != 0) goto L_0x006d;
    L_0x0066:
        r0 = new X.1ms;
        r0.<init>(r7);
        r7.f17415m = r0;
    L_0x006d:
        r1 = r7.f17378B;
        r0 = r7.f17415m;
        monitor-enter(r1);
        r1.f17330B = r0;	 Catch:{ all -> 0x00cb }
        monitor-exit(r1);	 Catch:{ all -> 0x00cb }
        r7.f17419q = r4;
        r1 = r7.f17403a;
        r5 = 1;
        r7.f17403a = r5;
        r0 = r7.f17378B;
        r0 = r0.getCount();
        r7.f17401Y = r0;
        r0 = r7.f17422t;
        if (r0 < 0) goto L_0x009e;
    L_0x0088:
        r2 = r7.f17378B;
        r1 = r7.f17420r;
        r0 = r7.f17421s;
        r2.mo2430E(r1, r0);
        r0 = r7.f17422t;
        r7.m10894Q(r0, r4, r5);
        r0 = -1;
        r7.f17422t = r0;
        r7.f17420r = r6;
        r7.f17421s = r6;
        goto L_0x00a7;
    L_0x009e:
        if (r1 != 0) goto L_0x00a4;
    L_0x00a0:
        r7.m10891N();
        goto L_0x00a7;
    L_0x00a4:
        r7.requestLayout();
    L_0x00a7:
        r0 = r7.f17391O;
        if (r0 == 0) goto L_0x00c7;
    L_0x00ab:
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x00c7;
    L_0x00b1:
        r0 = r7.f17391O;
        r1 = r0.size();
    L_0x00b7:
        if (r4 >= r1) goto L_0x00c7;
    L_0x00b9:
        r0 = r7.f17391O;
        r0 = r0.get(r4);
        r0 = (X.AnonymousClass1mq) r0;
        r0.onAdapterChanged(r7, r3, r8);
        r4 = r4 + 1;
        goto L_0x00b7;
    L_0x00c7:
        return;
    L_0x00c8:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00c8 }
    L_0x00ca:
        throw r0;
    L_0x00cb:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00cb }
        goto L_0x00ca;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.setAdapter(X.1LO):void");
    }

    public void setCurrentItem(int i) {
        this.f17419q = false;
        m10894Q(i, this.f17403a ^ 1, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Requested offscreen page limit ");
            stringBuilder.append(i);
            stringBuilder.append(" too small; defaulting to ");
            stringBuilder.append(1);
            Log.w("ViewPager", stringBuilder.toString());
            i = 1;
        }
        if (i != this.f17416n) {
            this.f17416n = i;
            m10891N();
        }
    }

    public void setOnPageChangeListener(AnonymousClass1Ar anonymousClass1Ar) {
        this.f17386J = anonymousClass1Ar;
    }

    public void setPageMargin(int i) {
        int i2 = this.f17417o;
        this.f17417o = i;
        int width = getWidth();
        m10875J(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(AnonymousClass0Ca.m939E(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f17413k = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.f17424v != i) {
            this.f17424v = i;
            if (this.f17418p != null) {
                Object obj = i != 0 ? 1 : null;
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    getChildAt(i2).setLayerType(obj != null ? this.f17388L : 0, null);
                }
            }
            AnonymousClass1Ar anonymousClass1Ar = this.f17386J;
            if (anonymousClass1Ar != null) {
                anonymousClass1Ar.onPageScrollStateChanged(i);
            }
            List list = this.f17387K;
            if (list != null) {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    anonymousClass1Ar = (AnonymousClass1Ar) this.f17387K.get(i3);
                    if (anonymousClass1Ar != null) {
                        anonymousClass1Ar.onPageScrollStateChanged(i);
                    }
                }
            }
            anonymousClass1Ar = this.f17381E;
            if (anonymousClass1Ar != null) {
                anonymousClass1Ar.onPageScrollStateChanged(i);
            }
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f17426x != z) {
            this.f17426x = z;
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            if (drawable != this.f17413k) {
                return false;
            }
        }
        return true;
    }
}
