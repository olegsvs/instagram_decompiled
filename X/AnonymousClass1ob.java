package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.facebook.C0164R;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1ob */
public final class AnonymousClass1ob extends AnonymousClass0rv implements AnonymousClass12l {
    /* renamed from: B */
    public int f22959B = 0;
    /* renamed from: C */
    public int f22960C = -1;
    /* renamed from: D */
    public AnonymousClass1oW f22961D;
    /* renamed from: E */
    public List f22962E;
    /* renamed from: F */
    public float f22963F;
    /* renamed from: G */
    public float f22964G;
    /* renamed from: H */
    public AnonymousClass1md f22965H;
    /* renamed from: I */
    public float f22966I;
    /* renamed from: J */
    public float f22967J;
    /* renamed from: K */
    public float f22968K;
    /* renamed from: L */
    public final AnonymousClass12b f22969L = new AnonymousClass1oR(this);
    /* renamed from: M */
    public View f22970M = null;
    /* renamed from: N */
    public int f22971N = -1;
    /* renamed from: O */
    public final List f22972O = new ArrayList();
    /* renamed from: P */
    public List f22973P = new ArrayList();
    /* renamed from: Q */
    public RecyclerView f22974Q;
    /* renamed from: R */
    public final Runnable f22975R = new AnonymousClass1oQ(this);
    /* renamed from: S */
    public AnonymousClass0oo f22976S = null;
    /* renamed from: T */
    public int f22977T;
    /* renamed from: U */
    public float f22978U;
    /* renamed from: V */
    public float f22979V;
    /* renamed from: W */
    public int f22980W;
    /* renamed from: X */
    public List f22981X;
    /* renamed from: Y */
    public float f22982Y;
    /* renamed from: Z */
    public VelocityTracker f22983Z;
    /* renamed from: a */
    private AnonymousClass12t f22984a = null;
    /* renamed from: b */
    private long f22985b;
    /* renamed from: c */
    private final float[] f22986c = new float[2];
    /* renamed from: d */
    private Rect f22987d;

    public final void Zf(View view) {
    }

    public AnonymousClass1ob(AnonymousClass1oW anonymousClass1oW) {
        this.f22961D = anonymousClass1oW;
    }

    /* renamed from: A */
    public final void m13298A(Rect rect, View view, RecyclerView recyclerView, AnonymousClass0or anonymousClass0or) {
        rect.setEmpty();
    }

    /* renamed from: B */
    public static void m13290B(AnonymousClass1ob anonymousClass1ob) {
        if (anonymousClass1ob.f22965H == null) {
            anonymousClass1ob.f22965H = new AnonymousClass1md(anonymousClass1ob.f22974Q.getContext(), new AnonymousClass1oX(anonymousClass1ob));
        }
    }

    /* renamed from: B */
    public final void m13299B(Canvas canvas, RecyclerView recyclerView, AnonymousClass0or anonymousClass0or) {
        float f;
        float f2;
        this.f22971N = -1;
        if (this.f22976S != null) {
            m13295G(r2.f22986c);
            float[] fArr = r2.f22986c;
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        AnonymousClass0oo anonymousClass0oo = r2.f22976S;
        List list = r2.f22973P;
        int i = r2.f22959B;
        int size = list.size();
        int i2 = 0;
        while (true) {
            Canvas canvas2 = canvas;
            RecyclerView recyclerView2 = recyclerView;
            if (i2 >= size) {
                break;
            }
            AnonymousClass1oZ anonymousClass1oZ = (AnonymousClass1oZ) list.get(i2);
            float f3 = anonymousClass1oZ.f22951H;
            float f4 = anonymousClass1oZ.f22953J;
            if (f3 == f4) {
                anonymousClass1oZ.f22957N = anonymousClass1oZ.f22956M.f10370B.getTranslationX();
            } else {
                anonymousClass1oZ.f22957N = f3 + (anonymousClass1oZ.f22948E * (f4 - f3));
            }
            f3 = anonymousClass1oZ.f22952I;
            f4 = anonymousClass1oZ.f22954K;
            if (f3 == f4) {
                anonymousClass1oZ.f22958O = anonymousClass1oZ.f22956M.f10370B.getTranslationY();
            } else {
                anonymousClass1oZ.f22958O = f3 + (anonymousClass1oZ.f22948E * (f4 - f3));
            }
            int save = canvas2.save();
            AnonymousClass1oW.m13280F(canvas2, recyclerView2, anonymousClass1oZ.f22956M, anonymousClass1oZ.f22957N, anonymousClass1oZ.f22958O, anonymousClass1oZ.f22945B, false);
            canvas2.restoreToCount(save);
            i2++;
        }
        if (anonymousClass0oo != null) {
            save = canvas2.save();
            AnonymousClass1oW.m13280F(canvas2, recyclerView2, anonymousClass0oo, f, f2, i, true);
            canvas2.restoreToCount(save);
        }
    }

    /* renamed from: C */
    private void m13291C() {
        if (VERSION.SDK_INT < 21) {
            if (this.f22984a == null) {
                this.f22984a = new AnonymousClass1oT(this);
            }
            this.f22974Q.setChildDrawingOrderCallback(this.f22984a);
        }
    }

    /* renamed from: C */
    public final void m13300C(Canvas canvas, RecyclerView recyclerView, AnonymousClass0or anonymousClass0or) {
        float f;
        float f2;
        if (this.f22976S != null) {
            m13295G(r2.f22986c);
            float[] fArr = r2.f22986c;
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        AnonymousClass0oo anonymousClass0oo = r2.f22976S;
        List list = r2.f22973P;
        int i = r2.f22959B;
        List list2 = list;
        int size = list.size();
        Object obj = null;
        int i2 = 0;
        while (true) {
            Canvas canvas2 = canvas;
            if (i2 >= size) {
                break;
            }
            AnonymousClass1oZ anonymousClass1oZ = (AnonymousClass1oZ) list2.get(i2);
            int save = canvas2.save();
            AnonymousClass1oW.m13281G(canvas2, recyclerView, anonymousClass1oZ.f22956M, anonymousClass1oZ.f22957N, anonymousClass1oZ.f22958O, anonymousClass1oZ.f22945B, false);
            canvas2.restoreToCount(save);
            i2++;
        }
        if (anonymousClass0oo != null) {
            save = canvas2.save();
            AnonymousClass1oW.m13281G(canvas2, recyclerView, anonymousClass0oo, f, f2, i, true);
            canvas2.restoreToCount(save);
        }
        for (size--; size >= 0; size--) {
            anonymousClass1oZ = (AnonymousClass1oZ) list2.get(size);
            if (anonymousClass1oZ.f22947D && !anonymousClass1oZ.f22949F) {
                list2.remove(size);
            } else if (!anonymousClass1oZ.f22947D) {
                obj = 1;
            }
        }
        if (obj != null) {
            recyclerView.invalidate();
        }
    }

    /* renamed from: D */
    private static int m13292D(AnonymousClass1ob anonymousClass1ob, AnonymousClass0oo anonymousClass0oo, int i) {
        if ((i & 12) != 0) {
            float abs;
            int i2 = 8;
            int i3 = anonymousClass1ob.f22963F > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker = anonymousClass1ob.f22983Z;
            if (velocityTracker != null && anonymousClass1ob.f22960C > -1) {
                velocityTracker.computeCurrentVelocity(JsonMappingException.MAX_REFS_TO_LIST, anonymousClass1ob.f22968K);
                float xVelocity = anonymousClass1ob.f22983Z.getXVelocity(anonymousClass1ob.f22960C);
                float yVelocity = anonymousClass1ob.f22983Z.getYVelocity(anonymousClass1ob.f22960C);
                if (xVelocity <= 0.0f) {
                    i2 = 4;
                }
                abs = Math.abs(xVelocity);
                if ((i2 & i) != 0 && i3 == i2 && abs >= anonymousClass1ob.f22982Y && abs > Math.abs(yVelocity)) {
                    return i2;
                }
            }
            abs = ((float) anonymousClass1ob.f22974Q.getWidth()) * 0.5f;
            if ((i & i3) != 0 && Math.abs(anonymousClass1ob.f22963F) > abs) {
                return i3;
            }
        }
        return 0;
    }

    /* renamed from: D */
    public final void m13301D(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f22974Q;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                this.f22974Q.y(this);
                this.f22974Q.AA(this.f22969L);
                this.f22974Q.z(this);
                for (int size = this.f22973P.size() - 1; size >= 0; size--) {
                    AnonymousClass1oW.m13276B(this.f22974Q, ((AnonymousClass1oZ) this.f22973P.get(0)).f22956M);
                }
                this.f22973P.clear();
                this.f22970M = null;
                this.f22971N = -1;
                VelocityTracker velocityTracker = this.f22983Z;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f22983Z = null;
                }
            }
            this.f22974Q = recyclerView;
            if (this.f22974Q != null) {
                Resources resources = recyclerView.getResources();
                this.f22982Y = resources.getDimension(C0164R.dimen.item_touch_helper_swipe_escape_velocity);
                this.f22968K = resources.getDimension(C0164R.dimen.item_touch_helper_swipe_escape_max_velocity);
                this.f22980W = ViewConfiguration.get(this.f22974Q.getContext()).getScaledTouchSlop();
                this.f22974Q.A(this);
                this.f22974Q.C(this.f22969L);
                this.f22974Q.B(this);
                AnonymousClass1ob.m13290B(this);
            }
        }
    }

    /* renamed from: E */
    private static int m13293E(AnonymousClass1ob anonymousClass1ob, AnonymousClass0oo anonymousClass0oo, int i) {
        if ((i & 3) != 0) {
            float yVelocity;
            int i2 = 2;
            int i3 = anonymousClass1ob.f22964G > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker = anonymousClass1ob.f22983Z;
            if (velocityTracker != null && anonymousClass1ob.f22960C > -1) {
                velocityTracker.computeCurrentVelocity(JsonMappingException.MAX_REFS_TO_LIST, anonymousClass1ob.f22968K);
                float xVelocity = anonymousClass1ob.f22983Z.getXVelocity(anonymousClass1ob.f22960C);
                yVelocity = anonymousClass1ob.f22983Z.getYVelocity(anonymousClass1ob.f22960C);
                if (yVelocity <= 0.0f) {
                    i2 = 1;
                }
                yVelocity = Math.abs(yVelocity);
                if ((i2 & i) != 0 && i2 == i3 && yVelocity >= anonymousClass1ob.f22982Y && yVelocity > Math.abs(xVelocity)) {
                    return i2;
                }
            }
            yVelocity = ((float) anonymousClass1ob.f22974Q.getHeight()) * 0.5f;
            if ((i & i3) != 0 && Math.abs(anonymousClass1ob.f22964G) > yVelocity) {
                return i3;
            }
        }
        return 0;
    }

    /* renamed from: E */
    public final boolean m13302E(int i, MotionEvent motionEvent, int i2) {
        if (this.f22976S == null && i == 2 && this.f22959B != 2) {
            if (this.f22961D.m13286D()) {
                if (this.f22974Q.getScrollState() != 1) {
                    AnonymousClass0oo F = m13294F(motionEvent);
                    if (F != null) {
                        int A = (this.f22961D.m13283A(this.f22974Q, F) & 65280) >> 8;
                        if (A != 0) {
                            float x = motionEvent.getX(i2);
                            x -= this.f22966I;
                            float y = motionEvent.getY(i2) - this.f22967J;
                            float abs = Math.abs(x);
                            float abs2 = Math.abs(y);
                            int i3 = this.f22980W;
                            if (abs >= ((float) i3) || abs2 >= ((float) i3)) {
                                if (abs > abs2) {
                                    if (x >= 0.0f || (A & 4) != 0) {
                                        if (x > 0.0f && (A & 8) == 0) {
                                        }
                                    }
                                } else if (y >= 0.0f || (A & 1) != 0) {
                                    if (y > 0.0f && (A & 2) == 0) {
                                    }
                                }
                                this.f22964G = 0.0f;
                                this.f22963F = 0.0f;
                                this.f22960C = motionEvent.getPointerId(0);
                                m13310M(F, 1);
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: F */
    public final int m13303F(AnonymousClass0oo anonymousClass0oo, boolean z) {
        for (int size = this.f22973P.size() - 1; size >= 0; size--) {
            AnonymousClass1oZ anonymousClass1oZ = (AnonymousClass1oZ) this.f22973P.get(size);
            if (anonymousClass1oZ.f22956M == anonymousClass0oo) {
                anonymousClass1oZ.f22950G |= z;
                if (!anonymousClass1oZ.f22947D) {
                    anonymousClass1oZ.f22955L.cancel();
                }
                this.f22973P.remove(size);
                return anonymousClass1oZ.f22946C;
            }
        }
        return 0;
    }

    /* renamed from: F */
    private AnonymousClass0oo m13294F(MotionEvent motionEvent) {
        AnonymousClass0la layoutManager = this.f22974Q.getLayoutManager();
        int i = this.f22960C;
        if (i != -1) {
            i = motionEvent.findPointerIndex(i);
            float x = motionEvent.getX(i) - this.f22966I;
            float y = motionEvent.getY(i) - this.f22967J;
            float abs = Math.abs(x);
            x = Math.abs(y);
            i = this.f22980W;
            if (abs >= ((float) i) || x >= ((float) i)) {
                if (abs <= x || !layoutManager.C()) {
                    if (x <= abs || !layoutManager.D()) {
                        View H = m13305H(motionEvent);
                        if (H != null) {
                            return this.f22974Q.h(H);
                        }
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: G */
    public final AnonymousClass1oZ m13304G(MotionEvent motionEvent) {
        if (!this.f22973P.isEmpty()) {
            View H = m13305H(motionEvent);
            for (int size = this.f22973P.size() - 1; size >= 0; size--) {
                AnonymousClass1oZ anonymousClass1oZ = (AnonymousClass1oZ) this.f22973P.get(size);
                if (anonymousClass1oZ.f22956M.f10370B == H) {
                    return anonymousClass1oZ;
                }
            }
        }
        return null;
    }

    /* renamed from: G */
    private void m13295G(float[] fArr) {
        if ((this.f22977T & 12) != 0) {
            fArr[0] = (this.f22978U + this.f22963F) - ((float) this.f22976S.f10370B.getLeft());
        } else {
            fArr[0] = this.f22976S.f10370B.getTranslationX();
        }
        if ((this.f22977T & 3) != 0) {
            fArr[1] = (this.f22979V + this.f22964G) - ((float) this.f22976S.f10370B.getTop());
        } else {
            fArr[1] = this.f22976S.f10370B.getTranslationY();
        }
    }

    /* renamed from: H */
    public final View m13305H(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        AnonymousClass0oo anonymousClass0oo = this.f22976S;
        if (anonymousClass0oo != null) {
            View view = anonymousClass0oo.f10370B;
            if (AnonymousClass1ob.m13296H(view, x, y, this.f22978U + this.f22963F, this.f22979V + this.f22964G)) {
                return view;
            }
        }
        for (int size = this.f22973P.size() - 1; size >= 0; size--) {
            AnonymousClass1oZ anonymousClass1oZ = (AnonymousClass1oZ) this.f22973P.get(size);
            View view2 = anonymousClass1oZ.f22956M.f10370B;
            if (AnonymousClass1ob.m13296H(view2, x, y, anonymousClass1oZ.f22957N, anonymousClass1oZ.f22958O)) {
                return view2;
            }
        }
        return this.f22974Q.Y(x, y);
    }

    /* renamed from: H */
    private static boolean m13296H(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: I */
    private int m13297I(X.AnonymousClass0oo r6) {
        /*
        r5 = this;
        r1 = r5.f22959B;
        r4 = 0;
        r0 = 2;
        if (r1 != r0) goto L_0x0007;
    L_0x0006:
        return r4;
    L_0x0007:
        r1 = r5.f22961D;
        r0 = r5.f22974Q;
        r2 = r1.m13276B(r0, r6);
        r0 = r5.f22974Q;
        r0 = X.AnonymousClass0mE.C(r0);
        r1 = X.AnonymousClass1oW.m13277C(r2, r0);
        r0 = 65280; // 0xff00 float:9.1477E-41 double:3.22526E-319;
        r1 = r1 & r0;
        r3 = r1 >> 8;
        if (r3 != 0) goto L_0x0022;
    L_0x0021:
        goto L_0x0006;
    L_0x0022:
        r2 = r2 & r0;
        r2 = r2 >> 8;
        r0 = r5.f22963F;
        r1 = java.lang.Math.abs(r0);
        r0 = r5.f22964G;
        r0 = java.lang.Math.abs(r0);
        r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x0051;
    L_0x0035:
        r1 = X.AnonymousClass1ob.m13292D(r5, r6, r3);
        if (r1 <= 0) goto L_0x004a;
    L_0x003b:
        r2 = r2 & r1;
        if (r2 != 0) goto L_0x0049;
    L_0x003e:
        r0 = r5.f22974Q;
        r0 = X.AnonymousClass0mE.C(r0);
        r0 = X.AnonymousClass1oW.m13278D(r1, r0);
        return r0;
    L_0x0049:
        return r1;
    L_0x004a:
        r1 = X.AnonymousClass1ob.m13293E(r5, r6, r3);
        if (r1 <= 0) goto L_0x0006;
    L_0x0050:
        goto L_0x0049;
    L_0x0051:
        r1 = X.AnonymousClass1ob.m13293E(r5, r6, r3);
        if (r1 <= 0) goto L_0x0058;
    L_0x0057:
        goto L_0x0049;
    L_0x0058:
        r1 = X.AnonymousClass1ob.m13292D(r5, r6, r3);
        if (r1 <= 0) goto L_0x0006;
    L_0x005e:
        r2 = r2 & r1;
        if (r2 != 0) goto L_0x0049;
    L_0x0061:
        goto L_0x003e;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1ob.I(X.0oo):int");
    }

    /* renamed from: I */
    public final boolean m13306I() {
        int size = this.f22973P.size();
        for (int i = 0; i < size; i++) {
            if (!((AnonymousClass1oZ) this.f22973P.get(i)).f22947D) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    public final void m13307J(AnonymousClass0oo anonymousClass0oo) {
        if (!this.f22974Q.isLayoutRequested()) {
            if (r6.f22959B == 2) {
                int i = (int) (r6.f22978U + r6.f22963F);
                int i2 = (int) (r6.f22979V + r6.f22964G);
                AnonymousClass0oo anonymousClass0oo2 = anonymousClass0oo;
                if (((float) Math.abs(i2 - anonymousClass0oo2.f10370B.getTop())) >= ((float) anonymousClass0oo2.f10370B.getHeight()) * 0.5f || ((float) Math.abs(i - anonymousClass0oo2.f10370B.getLeft())) >= ((float) anonymousClass0oo2.f10370B.getWidth()) * 0.5f) {
                    int abs;
                    int abs2;
                    int size;
                    int i3;
                    List list = r6.f22981X;
                    if (list == null) {
                        r6.f22981X = new ArrayList();
                        r6.f22962E = new ArrayList();
                    } else {
                        list.clear();
                        r6.f22962E.clear();
                    }
                    int round = Math.round(r6.f22978U + r6.f22963F) - 0;
                    int round2 = Math.round(r6.f22979V + r6.f22964G) - 0;
                    int i4 = 0 * 2;
                    int width = (anonymousClass0oo2.f10370B.getWidth() + round) + i4;
                    int height = (anonymousClass0oo2.f10370B.getHeight() + round2) + i4;
                    anonymousClass0oo = (round + width) / 2;
                    int i5 = (round2 + height) / 2;
                    AnonymousClass0la layoutManager = r6.f22974Q.getLayoutManager();
                    int T = layoutManager.T();
                    for (int i6 = 0; i6 < T; i6++) {
                        View S = layoutManager.S(i6);
                        if (S != anonymousClass0oo2.f10370B) {
                            if (S.getBottom() >= round2 && S.getTop() <= height && S.getRight() >= round) {
                                if (S.getLeft() <= width) {
                                    AnonymousClass0oo h = r6.f22974Q.h(S);
                                    abs = Math.abs(anonymousClass0oo - ((S.getLeft() + S.getRight()) / 2));
                                    abs2 = Math.abs(i5 - ((S.getTop() + S.getBottom()) / 2));
                                    abs = (abs * abs) + (abs2 * abs2);
                                    size = r6.f22981X.size();
                                    i4 = 0;
                                    i3 = 0;
                                    while (i4 < size && abs > ((Integer) r6.f22962E.get(i4)).intValue()) {
                                        i3++;
                                        i4++;
                                    }
                                    r6.f22981X.add(i3, h);
                                    r6.f22962E.add(i3, Integer.valueOf(abs));
                                }
                            }
                        }
                    }
                    List list2 = r6.f22981X;
                    if (list2.size() != 0) {
                        i5 = i + anonymousClass0oo2.f10370B.getWidth();
                        int height2 = i2 + anonymousClass0oo2.f10370B.getHeight();
                        size = i - anonymousClass0oo2.f10370B.getLeft();
                        int top = i2 - anonymousClass0oo2.f10370B.getTop();
                        round2 = list2.size();
                        AnonymousClass0oo anonymousClass0oo3 = null;
                        abs = -1;
                        for (width = 0; width < round2; width++) {
                            AnonymousClass0oo anonymousClass0oo4 = (AnonymousClass0oo) list2.get(width);
                            if (size > 0) {
                                i3 = anonymousClass0oo4.f10370B.getRight() - i5;
                                if (i3 < 0 && anonymousClass0oo4.f10370B.getRight() > anonymousClass0oo2.f10370B.getRight()) {
                                    T = Math.abs(i3);
                                    if (T > abs) {
                                        anonymousClass0oo3 = anonymousClass0oo4;
                                        if (size < 0) {
                                            i3 = anonymousClass0oo4.f10370B.getLeft() - i;
                                            if (i3 > 0 && anonymousClass0oo4.f10370B.getLeft() < anonymousClass0oo2.f10370B.getLeft()) {
                                                abs2 = Math.abs(i3);
                                                if (abs2 > T) {
                                                    T = abs2;
                                                    anonymousClass0oo3 = anonymousClass0oo4;
                                                }
                                            }
                                        }
                                        if (top < 0) {
                                            i3 = anonymousClass0oo4.f10370B.getTop() - i2;
                                            if (i3 > 0 && anonymousClass0oo4.f10370B.getTop() < anonymousClass0oo2.f10370B.getTop()) {
                                                abs2 = Math.abs(i3);
                                                if (abs2 > T) {
                                                    T = abs2;
                                                    anonymousClass0oo3 = anonymousClass0oo4;
                                                }
                                            }
                                        }
                                        if (top > 0) {
                                            i3 = anonymousClass0oo4.f10370B.getBottom() - height2;
                                            if (i3 < 0 && anonymousClass0oo4.f10370B.getBottom() > anonymousClass0oo2.f10370B.getBottom()) {
                                                abs = Math.abs(i3);
                                                if (abs > T) {
                                                    anonymousClass0oo3 = anonymousClass0oo4;
                                                }
                                            }
                                        }
                                        abs = T;
                                    }
                                }
                            }
                            T = abs;
                            if (size < 0) {
                                i3 = anonymousClass0oo4.f10370B.getLeft() - i;
                                abs2 = Math.abs(i3);
                                if (abs2 > T) {
                                    T = abs2;
                                    anonymousClass0oo3 = anonymousClass0oo4;
                                }
                            }
                            if (top < 0) {
                                i3 = anonymousClass0oo4.f10370B.getTop() - i2;
                                abs2 = Math.abs(i3);
                                if (abs2 > T) {
                                    T = abs2;
                                    anonymousClass0oo3 = anonymousClass0oo4;
                                }
                            }
                            if (top > 0) {
                                i3 = anonymousClass0oo4.f10370B.getBottom() - height2;
                                abs = Math.abs(i3);
                                if (abs > T) {
                                    anonymousClass0oo3 = anonymousClass0oo4;
                                }
                            }
                            abs = T;
                        }
                        if (anonymousClass0oo3 == null) {
                            r6.f22981X.clear();
                            r6.f22962E.clear();
                            return;
                        }
                        width = anonymousClass0oo3.E();
                        T = anonymousClass0oo2.E();
                        if (r6.f22961D.m13288F(r6.f22974Q, anonymousClass0oo2, anonymousClass0oo3)) {
                            AnonymousClass1oW.m13282H(r6.f22974Q, anonymousClass0oo2, T, anonymousClass0oo3, width, i, i2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: K */
    public final void m13308K(View view) {
        if (view == this.f22970M) {
            this.f22970M = null;
            if (this.f22984a != null) {
                this.f22974Q.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* renamed from: L */
    public final boolean m13309L() {
        if (this.f22976S != null) {
            int i;
            int paddingLeft;
            int paddingTop;
            long currentTimeMillis = System.currentTimeMillis();
            long j = r5.f22985b;
            long j2 = j == Long.MIN_VALUE ? 0 : currentTimeMillis - j;
            AnonymousClass0la layoutManager = r5.f22974Q.getLayoutManager();
            if (r5.f22987d == null) {
                r5.f22987d = new Rect();
            }
            layoutManager.B(r5.f22976S.f10370B, r5.f22987d);
            if (layoutManager.C()) {
                i = (int) (r5.f22978U + r5.f22963F);
                paddingLeft = (i - r5.f22987d.left) - r5.f22974Q.getPaddingLeft();
                if (r5.f22963F < 0.0f && paddingLeft < 0) {
                    if (layoutManager.D()) {
                        i = (int) (r5.f22979V + r5.f22964G);
                        paddingTop = (i - r5.f22987d.top) - r5.f22974Q.getPaddingTop();
                        if (r5.f22964G >= 0.0f) {
                        }
                        if (r5.f22964G > 0.0f) {
                            paddingTop = ((i + r5.f22976S.f10370B.getHeight()) + r5.f22987d.bottom) - (r5.f22974Q.getHeight() - r5.f22974Q.getPaddingBottom());
                            if (paddingTop > 0) {
                                if (paddingLeft != 0) {
                                    paddingLeft = r5.f22961D.m13285C(r5.f22974Q, r5.f22976S.f10370B.getWidth(), paddingLeft, r5.f22974Q.getWidth(), j2);
                                }
                                if (paddingTop != 0) {
                                    paddingTop = r5.f22961D.m13285C(r5.f22974Q, r5.f22976S.f10370B.getHeight(), paddingTop, r5.f22974Q.getHeight(), j2);
                                }
                                if (r5.f22985b == Long.MIN_VALUE) {
                                    r5.f22985b = currentTimeMillis;
                                }
                                r5.f22974Q.scrollBy(paddingLeft, paddingTop);
                                return true;
                            }
                        }
                    }
                    paddingTop = 0;
                    if (paddingLeft != 0) {
                        paddingLeft = r5.f22961D.m13285C(r5.f22974Q, r5.f22976S.f10370B.getWidth(), paddingLeft, r5.f22974Q.getWidth(), j2);
                    }
                    if (paddingTop != 0) {
                        paddingTop = r5.f22961D.m13285C(r5.f22974Q, r5.f22976S.f10370B.getHeight(), paddingTop, r5.f22974Q.getHeight(), j2);
                    }
                    if (r5.f22985b == Long.MIN_VALUE) {
                        r5.f22985b = currentTimeMillis;
                    }
                    r5.f22974Q.scrollBy(paddingLeft, paddingTop);
                    return true;
                } else if (r5.f22963F > 0.0f) {
                    i = ((i + r5.f22976S.f10370B.getWidth()) + r5.f22987d.right) - (r5.f22974Q.getWidth() - r5.f22974Q.getPaddingRight());
                    if (i > 0) {
                        paddingLeft = i;
                        if (layoutManager.D()) {
                            i = (int) (r5.f22979V + r5.f22964G);
                            paddingTop = (i - r5.f22987d.top) - r5.f22974Q.getPaddingTop();
                            if (r5.f22964G >= 0.0f && paddingTop < 0) {
                                if (paddingLeft != 0) {
                                    paddingLeft = r5.f22961D.m13285C(r5.f22974Q, r5.f22976S.f10370B.getWidth(), paddingLeft, r5.f22974Q.getWidth(), j2);
                                }
                                if (paddingTop != 0) {
                                    paddingTop = r5.f22961D.m13285C(r5.f22974Q, r5.f22976S.f10370B.getHeight(), paddingTop, r5.f22974Q.getHeight(), j2);
                                }
                                if (r5.f22985b == Long.MIN_VALUE) {
                                    r5.f22985b = currentTimeMillis;
                                }
                                r5.f22974Q.scrollBy(paddingLeft, paddingTop);
                                return true;
                            } else if (r5.f22964G > 0.0f) {
                                paddingTop = ((i + r5.f22976S.f10370B.getHeight()) + r5.f22987d.bottom) - (r5.f22974Q.getHeight() - r5.f22974Q.getPaddingBottom());
                                if (paddingTop > 0) {
                                    if (paddingLeft != 0) {
                                        paddingLeft = r5.f22961D.m13285C(r5.f22974Q, r5.f22976S.f10370B.getWidth(), paddingLeft, r5.f22974Q.getWidth(), j2);
                                    }
                                    if (paddingTop != 0) {
                                        paddingTop = r5.f22961D.m13285C(r5.f22974Q, r5.f22976S.f10370B.getHeight(), paddingTop, r5.f22974Q.getHeight(), j2);
                                    }
                                    if (!(paddingLeft == 0 && paddingTop == 0)) {
                                        if (r5.f22985b == Long.MIN_VALUE) {
                                            r5.f22985b = currentTimeMillis;
                                        }
                                        r5.f22974Q.scrollBy(paddingLeft, paddingTop);
                                        return true;
                                    }
                                }
                            }
                        }
                        paddingTop = 0;
                        if (paddingLeft != 0) {
                            paddingLeft = r5.f22961D.m13285C(r5.f22974Q, r5.f22976S.f10370B.getWidth(), paddingLeft, r5.f22974Q.getWidth(), j2);
                        }
                        if (paddingTop != 0) {
                            paddingTop = r5.f22961D.m13285C(r5.f22974Q, r5.f22976S.f10370B.getHeight(), paddingTop, r5.f22974Q.getHeight(), j2);
                        }
                        if (r5.f22985b == Long.MIN_VALUE) {
                            r5.f22985b = currentTimeMillis;
                        }
                        r5.f22974Q.scrollBy(paddingLeft, paddingTop);
                        return true;
                    }
                }
            }
            paddingLeft = 0;
            if (layoutManager.D()) {
                i = (int) (r5.f22979V + r5.f22964G);
                paddingTop = (i - r5.f22987d.top) - r5.f22974Q.getPaddingTop();
                if (r5.f22964G >= 0.0f) {
                }
                if (r5.f22964G > 0.0f) {
                    paddingTop = ((i + r5.f22976S.f10370B.getHeight()) + r5.f22987d.bottom) - (r5.f22974Q.getHeight() - r5.f22974Q.getPaddingBottom());
                    if (paddingTop > 0) {
                        if (paddingLeft != 0) {
                            paddingLeft = r5.f22961D.m13285C(r5.f22974Q, r5.f22976S.f10370B.getWidth(), paddingLeft, r5.f22974Q.getWidth(), j2);
                        }
                        if (paddingTop != 0) {
                            paddingTop = r5.f22961D.m13285C(r5.f22974Q, r5.f22976S.f10370B.getHeight(), paddingTop, r5.f22974Q.getHeight(), j2);
                        }
                        if (r5.f22985b == Long.MIN_VALUE) {
                            r5.f22985b = currentTimeMillis;
                        }
                        r5.f22974Q.scrollBy(paddingLeft, paddingTop);
                        return true;
                    }
                }
            }
            paddingTop = 0;
            if (paddingLeft != 0) {
                paddingLeft = r5.f22961D.m13285C(r5.f22974Q, r5.f22976S.f10370B.getWidth(), paddingLeft, r5.f22974Q.getWidth(), j2);
            }
            if (paddingTop != 0) {
                paddingTop = r5.f22961D.m13285C(r5.f22974Q, r5.f22976S.f10370B.getHeight(), paddingTop, r5.f22974Q.getHeight(), j2);
            }
            if (r5.f22985b == Long.MIN_VALUE) {
                r5.f22985b = currentTimeMillis;
            }
            r5.f22974Q.scrollBy(paddingLeft, paddingTop);
            return true;
        }
        r5.f22985b = Long.MIN_VALUE;
        return false;
    }

    /* renamed from: M */
    public final void m13310M(AnonymousClass0oo anonymousClass0oo, int i) {
        AnonymousClass0oo anonymousClass0oo2 = anonymousClass0oo;
        int i2 = i;
        if (anonymousClass0oo2 != this.f22976S || i2 != r11.f22959B) {
            Object obj;
            boolean z;
            ViewParent parent;
            AnonymousClass0oo anonymousClass0oo3;
            r11.f22985b = Long.MIN_VALUE;
            int i3 = r11.f22959B;
            m13303F(anonymousClass0oo2, true);
            r11.f22959B = i2;
            if (i2 == 2) {
                r11.f22970M = anonymousClass0oo2.f10370B;
                m13291C();
            }
            int i4 = (1 << ((i * 8) + 8)) - 1;
            AnonymousClass0oo anonymousClass0oo4 = r11.f22976S;
            if (anonymousClass0oo4 != null) {
                if (anonymousClass0oo4.f10370B.getParent() != null) {
                    int i5;
                    float signum;
                    float f;
                    if (i3 == 2) {
                        i5 = 0;
                    } else {
                        i5 = m13297I(anonymousClass0oo4);
                    }
                    VelocityTracker velocityTracker = r11.f22983Z;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        r11.f22983Z = null;
                    }
                    if (i5 != 4 && i5 != 8 && i5 != 16 && i5 != 32) {
                        switch (i5) {
                            case 1:
                            case 2:
                                signum = Math.signum(r11.f22964G) * ((float) r11.f22974Q.getHeight());
                                f = 0.0f;
                                break;
                            default:
                                f = 0.0f;
                                break;
                        }
                    }
                    f = Math.signum(r11.f22963F) * ((float) r11.f22974Q.getWidth());
                    signum = 0.0f;
                    int i6 = i3 == 2 ? 8 : i5 > 0 ? 2 : 4;
                    m13295G(r11.f22986c);
                    float[] fArr = r11.f22986c;
                    float f2 = fArr[0];
                    float f3 = fArr[1];
                    AnonymousClass1oZ anonymousClass2Op = new AnonymousClass2Op(r11, anonymousClass0oo4, i6, i3, f2, f3, f, signum, i5, anonymousClass0oo4);
                    anonymousClass2Op.f22955L.setDuration(AnonymousClass1oW.m13279E(r11.f22974Q, i6, f - f2, signum - f3));
                    r11.f22973P.add(anonymousClass2Op);
                    anonymousClass2Op.f22956M.S(false);
                    anonymousClass2Op.f22955L.start();
                    obj = 1;
                } else {
                    m13308K(anonymousClass0oo4.f10370B);
                    AnonymousClass1oW.m13276B(r11.f22974Q, anonymousClass0oo4);
                    obj = null;
                }
                r11.f22976S = null;
            } else {
                obj = null;
            }
            if (anonymousClass0oo2 != null) {
                r11.f22977T = (r11.f22961D.m13283A(r11.f22974Q, anonymousClass0oo2) & i4) >> (r11.f22959B * 8);
                r11.f22978U = (float) anonymousClass0oo2.f10370B.getLeft();
                r11.f22979V = (float) anonymousClass0oo2.f10370B.getTop();
                r11.f22976S = anonymousClass0oo2;
                if (i2 == 2) {
                    z = false;
                    r11.f22976S.f10370B.performHapticFeedback(0);
                    parent = r11.f22974Q.getParent();
                    if (parent != null) {
                        if (r11.f22976S != null) {
                            z = true;
                        }
                        parent.requestDisallowInterceptTouchEvent(z);
                    }
                    if (obj == null) {
                        r11.f22974Q.getLayoutManager().f9553L = true;
                    }
                    anonymousClass0oo3 = r11.f22976S;
                    if (anonymousClass0oo3 != null) {
                        AnonymousClass1oW.f22941E.Vz(anonymousClass0oo3.f10370B);
                    }
                    r11.f22974Q.invalidate();
                }
            }
            z = false;
            parent = r11.f22974Q.getParent();
            if (parent != null) {
                if (r11.f22976S != null) {
                    z = true;
                }
                parent.requestDisallowInterceptTouchEvent(z);
            }
            if (obj == null) {
                r11.f22974Q.getLayoutManager().f9553L = true;
            }
            anonymousClass0oo3 = r11.f22976S;
            if (anonymousClass0oo3 != null) {
                AnonymousClass1oW.f22941E.Vz(anonymousClass0oo3.f10370B);
            }
            r11.f22974Q.invalidate();
        }
    }

    /* renamed from: N */
    public final void m13311N(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        this.f22963F = x - this.f22966I;
        this.f22964G = y - this.f22967J;
        if ((i & 4) == 0) {
            this.f22963F = Math.max(0.0f, this.f22963F);
        }
        if ((i & 8) == 0) {
            this.f22963F = Math.min(0.0f, this.f22963F);
        }
        if ((i & 1) == 0) {
            this.f22964G = Math.max(0.0f, this.f22964G);
        }
        if ((i & 2) == 0) {
            this.f22964G = Math.min(0.0f, this.f22964G);
        }
    }

    public final void af(View view) {
        m13308K(view);
        AnonymousClass0oo h = this.f22974Q.h(view);
        if (h != null) {
            AnonymousClass0oo anonymousClass0oo = this.f22976S;
            if (anonymousClass0oo == null || h != anonymousClass0oo) {
                m13303F(h, false);
                if (this.f22972O.remove(h.f10370B)) {
                    AnonymousClass1oW.m13276B(this.f22974Q, h);
                    return;
                }
                return;
            }
            m13310M(null, 0);
        }
    }
}
