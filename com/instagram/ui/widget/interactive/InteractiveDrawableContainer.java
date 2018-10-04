package com.instagram.ui.widget.interactive;

import X.AnonymousClass0HT;
import X.AnonymousClass0QP;
import X.AnonymousClass0Wj;
import X.AnonymousClass0cN;
import X.AnonymousClass0cQ;
import X.AnonymousClass0dh;
import X.AnonymousClass0e5;
import X.AnonymousClass0e6;
import X.AnonymousClass2I7;
import X.AnonymousClass2I8;
import X.AnonymousClass2La;
import X.AnonymousClass2Lc;
import X.AnonymousClass2Ld;
import X.AnonymousClass2Le;
import X.AnonymousClass2Lg;
import X.AnonymousClass2Lh;
import X.AnonymousClass2Li;
import X.AnonymousClass2cS;
import X.AnonymousClass4Ph;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class InteractiveDrawableContainer extends FrameLayout implements AnonymousClass0QP, OnGestureListener, AnonymousClass2I7, OnScaleGestureListener {
    /* renamed from: s */
    private static final AnonymousClass0e5 f31641s = AnonymousClass0e5.C(80.0d, 9.0d);
    /* renamed from: B */
    public final AnonymousClass2La f31642B;
    /* renamed from: C */
    public final int f31643C;
    /* renamed from: D */
    public final List f31644D;
    /* renamed from: E */
    public int f31645E;
    /* renamed from: F */
    public int f31646F;
    /* renamed from: G */
    public final Set f31647G;
    /* renamed from: H */
    public final RectF f31648H;
    /* renamed from: I */
    public final Matrix f31649I;
    /* renamed from: J */
    public final float[] f31650J;
    /* renamed from: K */
    public final View f31651K;
    /* renamed from: L */
    public final View f31652L;
    /* renamed from: M */
    public boolean f31653M;
    /* renamed from: N */
    private float f31654N;
    /* renamed from: O */
    private final GestureDetector f31655O;
    /* renamed from: P */
    private final GestureDetector f31656P;
    /* renamed from: Q */
    private boolean f31657Q;
    /* renamed from: R */
    private boolean f31658R;
    /* renamed from: S */
    private boolean f31659S;
    /* renamed from: T */
    private boolean f31660T;
    /* renamed from: U */
    private long f31661U;
    /* renamed from: V */
    private long f31662V;
    /* renamed from: W */
    private float f31663W;
    /* renamed from: X */
    private float f31664X;
    /* renamed from: Y */
    private int f31665Y;
    /* renamed from: Z */
    private boolean f31666Z;
    /* renamed from: a */
    private final PointF f31667a;
    /* renamed from: b */
    private final AnonymousClass2I8 f31668b;
    /* renamed from: c */
    private final ScaleGestureDetector f31669c;
    /* renamed from: d */
    private final PointF f31670d;
    /* renamed from: e */
    private PointF f31671e;
    /* renamed from: f */
    private boolean f31672f;
    /* renamed from: g */
    private float f31673g;
    /* renamed from: h */
    private final RectF f31674h;
    /* renamed from: i */
    private boolean f31675i;
    /* renamed from: j */
    private final View f31676j;
    /* renamed from: k */
    private boolean f31677k;
    /* renamed from: l */
    private final Rect f31678l;
    /* renamed from: m */
    private final int f31679m;
    /* renamed from: n */
    private float f31680n;
    /* renamed from: o */
    private float f31681o;
    /* renamed from: p */
    private final AnonymousClass0cN f31682p;
    /* renamed from: q */
    private float f31683q;
    /* renamed from: r */
    private float f31684r;

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean tx(AnonymousClass2I8 anonymousClass2I8) {
        return true;
    }

    public final void ux(AnonymousClass2I8 anonymousClass2I8) {
    }

    public InteractiveDrawableContainer(Context context) {
        this(context, null);
    }

    public InteractiveDrawableContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InteractiveDrawableContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31678l = new Rect();
        this.f31644D = new ArrayList();
        this.f31647G = new CopyOnWriteArraySet();
        this.f31649I = new Matrix();
        this.f31648H = new RectF();
        this.f31674h = new RectF();
        this.f31670d = new PointF();
        this.f31667a = new PointF();
        this.f31650J = new float[2];
        this.f31653M = true;
        this.f31675i = true;
        this.f31671e = new PointF();
        setWillNotDraw(false);
        this.f31642B = new AnonymousClass2La(context);
        this.f31655O = new GestureDetector(context, new AnonymousClass2Lg(this));
        this.f31656P = new GestureDetector(context, this);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, this);
        this.f31669c = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        this.f31668b = new AnonymousClass2I8(context, this);
        this.f31682p = AnonymousClass0e6.B().C().O(f31641s);
        this.f31643C = context.getResources().getDimensionPixelSize(C0164R.dimen.interactive_drawable_min_touch_size);
        this.f31679m = context.getResources().getDimensionPixelSize(C0164R.dimen.trash_can_touch_padding);
        this.f31645E = context.getResources().getDimensionPixelSize(C0164R.dimen.interactive_drawable_fully_visible_on_screen_horizontal_padding);
        this.f31646F = context.getResources().getDimensionPixelSize(C0164R.dimen.interactive_drawable_fully_visible_on_screen_vertical_padding);
        View inflate = LayoutInflater.from(context).inflate(C0164R.layout.trash_can, this, false);
        this.f31651K = inflate;
        this.f31652L = inflate.findViewById(C0164R.id.trash_can_label);
        this.f31676j = this.f31651K.findViewById(C0164R.id.trash_can_circle);
        addView(this.f31651K);
    }

    /* renamed from: A */
    public final int m16520A(Drawable drawable, AnonymousClass2Lc anonymousClass2Lc) {
        AnonymousClass2cS H = m16516H(drawable, anonymousClass2Lc);
        this.f31644D.add(H);
        Collections.sort(this.f31644D);
        invalidate();
        return H.f31620H;
    }

    /* renamed from: B */
    public final void m16521B(AnonymousClass2Lh anonymousClass2Lh) {
        this.f31647G.add(anonymousClass2Lh);
    }

    /* renamed from: B */
    public static boolean m16510B(InteractiveDrawableContainer interactiveDrawableContainer, float f, float f2) {
        AnonymousClass2cS anonymousClass2cS = null;
        for (int size = interactiveDrawableContainer.f31644D.size() - 1; size >= 0; size--) {
            AnonymousClass2cS anonymousClass2cS2 = (AnonymousClass2cS) interactiveDrawableContainer.f31644D.get(size);
            if (anonymousClass2cS2.f31616D.isVisible()) {
                Object obj = (anonymousClass2cS2.f31618F && anonymousClass2cS2.f31617E) ? 1 : null;
                if (obj != null) {
                    int B = anonymousClass2cS2.m16499B(f, f2);
                    if (B == 0) {
                        interactiveDrawableContainer.setActiveDrawable(anonymousClass2cS2);
                        return true;
                    } else if (B == 1 && anonymousClass2cS == null) {
                        anonymousClass2cS = anonymousClass2cS2;
                    }
                }
            }
        }
        if (anonymousClass2cS == null) {
            return false;
        }
        interactiveDrawableContainer.setActiveDrawable(anonymousClass2cS);
        return true;
    }

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
        if (anonymousClass0cN.f7106D == 1.0d) {
            AnonymousClass2cS activeDrawable = getActiveDrawable();
            this.f31680n = activeDrawable.m16500C();
            this.f31681o = activeDrawable.m16501D();
            this.f31654N = activeDrawable.m16503F();
            float height = ((float) this.f31676j.getHeight()) / 2.0f;
            float y = (this.f31651K.getY() + this.f31676j.getY()) + height;
            this.f31683q = (this.f31651K.getX() + this.f31676j.getX()) + height;
            this.f31684r = y;
            height = ((height / ((float) Math.sqrt(2.0d))) * 2.0f) * 1.3f;
            Rect bounds = activeDrawable.f31616D.getBounds();
            if (bounds.width() > bounds.height()) {
                height /= (float) bounds.width();
            } else {
                height /= (float) bounds.height();
            }
            this.f31673g = height;
            AnonymousClass0HT.f2637C.D(20);
        }
    }

    /* renamed from: C */
    public static AnonymousClass2cS m16511C(InteractiveDrawableContainer interactiveDrawableContainer, int i) {
        for (AnonymousClass2cS anonymousClass2cS : interactiveDrawableContainer.f31644D) {
            if (anonymousClass2cS.f31620H == i) {
                return anonymousClass2cS;
            }
        }
        return null;
    }

    /* renamed from: C */
    public final void m16522C(AnonymousClass0Wj anonymousClass0Wj) {
        for (AnonymousClass2cS anonymousClass2cS : this.f31644D) {
            anonymousClass0Wj.RC(Integer.valueOf(anonymousClass2cS.f31620H));
        }
    }

    /* renamed from: D */
    public final AnonymousClass2Li m16523D(int i) {
        i = m16511C(this, i);
        if (i == 0) {
            return null;
        }
        return new AnonymousClass2Li(i);
    }

    /* renamed from: D */
    public static AnonymousClass2cS m16512D(InteractiveDrawableContainer interactiveDrawableContainer, Drawable drawable) {
        for (AnonymousClass2cS anonymousClass2cS : interactiveDrawableContainer.f31644D) {
            if (anonymousClass2cS.f31616D == drawable) {
                return anonymousClass2cS;
            }
        }
        return null;
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
        if (this.f31657Q) {
            m16517I();
        }
    }

    /* renamed from: E */
    public final Map m16524E(Class cls, AnonymousClass4Ph anonymousClass4Ph) {
        Map hashMap = new HashMap();
        for (AnonymousClass2cS anonymousClass2cS : this.f31644D) {
            if (((anonymousClass4Ph.f53777B.f67428a.f64414N.get(anonymousClass2cS.f31620H) != null ? 1 : 0) ^ 1) != 0) {
                Drawable drawable = anonymousClass2cS.f31616D;
                if (cls.isInstance(drawable)) {
                    hashMap.put(cls.cast(drawable), new AnonymousClass2Li(anonymousClass2cS));
                }
            }
        }
        return hashMap;
    }

    /* renamed from: E */
    public static void m16513E(InteractiveDrawableContainer interactiveDrawableContainer, AnonymousClass2cS anonymousClass2cS) {
        if (anonymousClass2cS != null) {
            if (anonymousClass2cS == interactiveDrawableContainer.getActiveDrawable()) {
                if (interactiveDrawableContainer.f31658R) {
                    interactiveDrawableContainer.f31660T = true;
                    return;
                } else if (interactiveDrawableContainer.f31682p.f7106D == 1.0d) {
                }
            }
            interactiveDrawableContainer.f31644D.remove(anonymousClass2cS);
            interactiveDrawableContainer.invalidate();
            for (AnonymousClass2Lh aw : interactiveDrawableContainer.f31647G) {
                aw.aw(anonymousClass2cS.f31620H, anonymousClass2cS.f31616D, false);
            }
        }
    }

    /* renamed from: F */
    public final List m16525F(Class cls) {
        List arrayList = new ArrayList();
        for (AnonymousClass2cS anonymousClass2cS : this.f31644D) {
            Drawable drawable = anonymousClass2cS.f31616D;
            if (cls.isInstance(drawable)) {
                arrayList.add(cls.cast(drawable));
            }
        }
        return arrayList;
    }

    /* renamed from: F */
    public static void m16514F(AnonymousClass2cS anonymousClass2cS, float f, float f2) {
        if (anonymousClass2cS != null) {
            Rect bounds = anonymousClass2cS.f31616D.getBounds();
            anonymousClass2cS.m16506I(f - bounds.exactCenterX());
            anonymousClass2cS.m16507J(f2 - bounds.exactCenterY());
        }
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        AnonymousClass2cS activeDrawable = getActiveDrawable();
        activeDrawable.m16506I(activeDrawable.f31625M + (((float) AnonymousClass0dh.C(anonymousClass0cN.E(), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) this.f31680n, (double) this.f31683q)) - activeDrawable.m16500C()));
        activeDrawable.m16507J(activeDrawable.f31626N + (((float) AnonymousClass0dh.C(anonymousClass0cN.E(), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) this.f31681o, (double) this.f31684r)) - activeDrawable.m16501D()));
        activeDrawable.f31632T *= ((float) AnonymousClass0dh.C(anonymousClass0cN.E(), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) this.f31654N, (double) this.f31673g)) / activeDrawable.m16503F();
        activeDrawable.f31638Z.invalidate();
        activeDrawable.f31628P.by(activeDrawable.m16503F());
        float C = (float) AnonymousClass0dh.C(anonymousClass0cN.E(), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, 1.0d, 1.2999999523162842d);
        this.f31676j.setScaleX(C);
        this.f31676j.setScaleY(C);
    }

    /* renamed from: G */
    public final Drawable m16526G(int i) {
        AnonymousClass2cS C = m16511C(this, i);
        if (C == null) {
            return null;
        }
        return C.f31616D;
    }

    /* renamed from: G */
    private boolean m16515G(MotionEvent motionEvent) {
        int i = 0;
        if (this.f31672f) {
            return false;
        }
        int pointerCount = motionEvent.getPointerCount();
        float f = 0.0f;
        float f2 = 0.0f;
        while (i < pointerCount) {
            f += motionEvent.getX(i);
            f2 += motionEvent.getY(i);
            i++;
        }
        float f3 = (float) pointerCount;
        return m16510B(this, f / f3, f2 / f3);
    }

    /* renamed from: H */
    private AnonymousClass2cS m16516H(Drawable drawable, AnonymousClass2Lc anonymousClass2Lc) {
        if (anonymousClass2Lc == null) {
            return new AnonymousClass2cS(this, drawable, getNextAvailableZ(), true);
        }
        AnonymousClass2cS anonymousClass2cS = new AnonymousClass2cS(this, drawable, getNextAvailableZ(), anonymousClass2Lc.f29379O);
        if (anonymousClass2Lc.f29366B) {
            anonymousClass2cS.f31614B.L(0.949999988079071d).N(1.0d);
        }
        anonymousClass2cS.f31634V = anonymousClass2Lc.f29373I;
        anonymousClass2cS.f31621I = anonymousClass2Lc.f29371G;
        anonymousClass2cS.f31633U = anonymousClass2Lc.f29372H;
        if (anonymousClass2Lc.f29369E != -1.0f) {
            anonymousClass2cS.f31624L = anonymousClass2Lc.f29369E;
            anonymousClass2cS.m16509L(anonymousClass2cS.f31632T * 1.0f);
        }
        if (anonymousClass2Lc.f29368D != -1.0f) {
            anonymousClass2cS.f31623K = anonymousClass2Lc.f29368D;
            anonymousClass2cS.m16509L(anonymousClass2cS.f31632T * 1.0f);
        }
        if (anonymousClass2Lc.f29370F != null) {
            AnonymousClass2Ld anonymousClass2Ld = anonymousClass2Lc.f29370F;
            anonymousClass2cS.f31628P = anonymousClass2Ld;
            anonymousClass2Ld.No(anonymousClass2cS.f31620H);
        }
        if (anonymousClass2Lc.f29375K != null) {
            Rect bounds = anonymousClass2cS.f31616D.getBounds();
            float f = anonymousClass2Lc.f29375K[1] - ((float) bounds.top);
            anonymousClass2cS.m16506I(anonymousClass2Lc.f29375K[0] - ((float) bounds.left));
            anonymousClass2cS.m16507J(f);
        }
        if (anonymousClass2Lc.f29377M != -1.0f) {
            anonymousClass2cS.m16509L(anonymousClass2Lc.f29377M);
        }
        if (anonymousClass2Lc.f29376L != -1.0f) {
            anonymousClass2cS.m16508K(anonymousClass2Lc.f29376L);
        }
        if (anonymousClass2Lc.f29374J != anonymousClass2cS.f31622J) {
            anonymousClass2cS.f31622J = anonymousClass2Lc.f29374J;
        }
        if (anonymousClass2Lc.f29367C) {
            anonymousClass2cS.f31619G = anonymousClass2Lc.f29367C;
        }
        anonymousClass2cS.f31635W = anonymousClass2Lc.f29378N;
        return anonymousClass2cS;
    }

    /* renamed from: H */
    public final boolean m16527H(int i) {
        return m16511C(this, i) != null;
    }

    /* renamed from: I */
    private void m16517I() {
        this.f31676j.setScaleX(1.0f);
        this.f31676j.setScaleY(1.0f);
        this.f31651K.setVisibility(8);
        if (this.f31682p.E() > StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) {
            AnonymousClass2cS J = m16518J();
            for (AnonymousClass2Lh aw : this.f31647G) {
                aw.aw(J.f31620H, J.f31616D, true);
            }
            this.f31682p.J(this).L(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        }
        for (AnonymousClass2Lh AEA : this.f31647G) {
            AEA.AEA();
        }
    }

    /* renamed from: I */
    public final boolean m16528I(AnonymousClass2Le anonymousClass2Le) {
        for (int i = 0; i < this.f31644D.size(); i++) {
            if (((AnonymousClass2cS) this.f31644D.get(i)).f31634V == anonymousClass2Le) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    private AnonymousClass2cS m16518J() {
        AnonymousClass2cS activeDrawable = getActiveDrawable();
        this.f31644D.remove(activeDrawable);
        invalidate();
        return activeDrawable;
    }

    /* renamed from: J */
    public final void m16529J(Drawable drawable) {
        for (AnonymousClass2cS anonymousClass2cS : this.f31644D) {
            if (anonymousClass2cS.f31616D == drawable) {
                break;
            }
        }
        AnonymousClass2cS anonymousClass2cS2 = null;
        m16513E(this, anonymousClass2cS2);
    }

    /* renamed from: K */
    public final void m16530K(AnonymousClass2Lh anonymousClass2Lh) {
        this.f31647G.remove(anonymousClass2Lh);
    }

    /* renamed from: K */
    private boolean m16519K(float f, float f2) {
        if (this.f31651K.getVisibility() != 0) {
            return false;
        }
        if (this.f31678l.isEmpty()) {
            this.f31676j.getHitRect(this.f31678l);
            this.f31678l.offset((int) this.f31651K.getX(), (int) this.f31651K.getY());
            if (!this.f31678l.isEmpty()) {
                Rect rect = this.f31678l;
                int i = this.f31679m;
                rect.inset(-i, -i);
            }
        }
        return this.f31678l.contains((int) f, (int) f2);
    }

    /* renamed from: L */
    public final void m16531L(int i, int i2) {
        m16511C(this, i).f31622J = i2;
        Collections.sort(this.f31644D);
        invalidate();
    }

    /* renamed from: M */
    public final void m16532M(int i, boolean z) {
        AnonymousClass2cS C = m16511C(this, i);
        if (C != null) {
            C.f31617E = z;
        }
    }

    /* renamed from: N */
    public final void m16533N(Drawable drawable, boolean z) {
        for (AnonymousClass2cS anonymousClass2cS : this.f31644D) {
            if (anonymousClass2cS.f31616D == drawable) {
                m16532M(anonymousClass2cS.f31620H, z);
                return;
            }
        }
    }

    /* renamed from: O */
    public final void m16534O(int i, boolean z) {
        m16511C(this, i).f31616D.setVisible(z, false);
    }

    /* renamed from: P */
    public final void m16535P(int i, AnonymousClass2Li anonymousClass2Li) {
        i = m16511C(this, i);
        if (i != 0) {
            i.m16509L(anonymousClass2Li.f29394L);
            i.m16506I(anonymousClass2Li.f29389G);
            i.m16507J(anonymousClass2Li.f29390H);
            i.m16508K(anonymousClass2Li.f29393K);
        }
    }

    /* renamed from: Q */
    public final void m16536Q(int i, float f) {
        i = m16511C(this, i);
        if (i != 0) {
            i.m16509L(f / ((float) i.f31616D.getBounds().width()));
        }
    }

    private AnonymousClass2cS getActiveDrawable() {
        AnonymousClass2cS anonymousClass2cS = null;
        int i = 0;
        for (int i2 = 0; i2 < this.f31644D.size(); i2++) {
            AnonymousClass2cS anonymousClass2cS2 = (AnonymousClass2cS) this.f31644D.get(i2);
            int i3 = anonymousClass2cS2.f31637Y;
            if (i3 >= i) {
                anonymousClass2cS = anonymousClass2cS2;
                i = i3;
            }
        }
        return anonymousClass2cS;
    }

    public int getActiveDrawableId() {
        if (getActiveDrawable() == null) {
            return -1;
        }
        return getActiveDrawable().f31620H;
    }

    public int getDrawableCount() {
        return this.f31644D.size();
    }

    private int getNextAvailableZ() {
        int i = this.f31665Y + 1;
        this.f31665Y = i;
        return i;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        this.f31659S = true;
        this.f31672f = false;
        this.f31657Q = false;
        return true;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        AnonymousClass2cS activeDrawable = getActiveDrawable();
        for (int i = 0; i < this.f31644D.size(); i++) {
            AnonymousClass2cS anonymousClass2cS = (AnonymousClass2cS) this.f31644D.get(i);
            if (anonymousClass2cS.f31616D.isVisible()) {
                if (anonymousClass2cS.equals(activeDrawable)) {
                    this.f31642B.m15164A(canvas);
                }
                canvas.save();
                if (anonymousClass2cS.m16502E() != 0.0f) {
                    canvas.rotate(anonymousClass2cS.m16502E(), anonymousClass2cS.m16500C(), anonymousClass2cS.m16501D());
                }
                if (anonymousClass2cS.m16503F() != 1.0f) {
                    canvas.scale(anonymousClass2cS.m16503F(), anonymousClass2cS.m16503F(), anonymousClass2cS.m16500C(), anonymousClass2cS.m16501D());
                }
                canvas.translate(anonymousClass2cS.f31625M, anonymousClass2cS.f31626N);
                anonymousClass2cS.f31616D.draw(canvas);
                canvas.restore();
            }
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        z = this.f31642B;
        z.f29325K.setBounds(i, i2, i3, i4);
        z.f29323I.setBounds(i, i2, i3, i4);
        z.f29338X.setBounds(i, i2, i3, i4);
        z.f29343c.setBounds(i, i2, i3, i4);
        z.f29349i.setBounds(i, i2, i3, i4);
        z.f29320F.setBounds(i, i2, i3, i4);
        z.f29346f.setBounds(i, i2, i3, i4);
        z.f29327M = ((float) (i3 + i)) / 2.0f;
        z.f29328N = ((float) (i4 + i2)) / 2.0f;
        int i5 = z.f29329O;
        z.f29340Z = (float) (i + i5);
        z.f29345e = (float) (i3 - i5);
        View view = z.f29319E;
        if (view != null) {
            i5 = view.getMeasuredHeight();
            z.f29351k = (float) (i2 + i5);
            z.f29349i.m15172A(0, i5, 0, 0);
        }
        view = z.f29317C;
        if (view != null) {
            i5 = view.getMeasuredHeight();
            z.f29322H = (float) (i4 - i5);
            z.f29320F.m15172A(0, 0, 0, i5);
        }
    }

    public final void onLongPress(MotionEvent motionEvent) {
        if (!this.f31647G.isEmpty()) {
            motionEvent = getActiveDrawable();
            if (this.f31658R) {
                for (AnonymousClass2Lh Wq : this.f31647G) {
                    Wq.Wq(motionEvent.f31620H, motionEvent.f31616D);
                }
            }
        }
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.f31658R) {
            this.f31667a.x = this.f31670d.x;
            this.f31667a.y = this.f31670d.y;
            this.f31670d.x = scaleGestureDetector.getFocusX();
            this.f31670d.y = scaleGestureDetector.getFocusY();
            AnonymousClass2cS activeDrawable = getActiveDrawable();
            activeDrawable.m16509L(activeDrawable.f31632T * scaleGestureDetector.getScaleFactor());
            for (AnonymousClass2Lh Ty : this.f31647G) {
                Ty.Ty(activeDrawable.f31616D, activeDrawable.m16503F());
            }
        }
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f31667a.x = scaleGestureDetector.getFocusX();
        this.f31667a.y = scaleGestureDetector.getFocusY();
        this.f31670d.x = scaleGestureDetector.getFocusX();
        this.f31670d.y = scaleGestureDetector.getFocusY();
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3 = f2;
        float f4 = f;
        if (this.f31659S) {
            this.f31659S = false;
            return true;
        } else if (!this.f31658R) {
            return true;
        } else {
            if (this.f31669c.isInProgress()) {
                f4 = this.f31667a.x - this.f31670d.x;
                f3 = this.f31667a.y - this.f31670d.y;
            }
            AnonymousClass2cS activeDrawable = getActiveDrawable();
            if (this.f31682p.E() > StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) {
                this.f31680n -= f4;
                this.f31681o -= f3;
            } else {
                float eventTime = (float) (motionEvent2.getEventTime() - this.f31662V);
                float x = motionEvent2.getX();
                float y = motionEvent2.getY();
                float f5 = (x - this.f31663W) / eventTime;
                float f6 = (y - this.f31664X) / eventTime;
                activeDrawable.m16504G(this.f31649I);
                this.f31674h.set(activeDrawable.f31616D.getBounds());
                this.f31649I.mapRect(this.f31674h);
                PointF pointF = this.f31671e;
                pointF.x = -f4;
                pointF.y = -f3;
                this.f31642B.m15168E(pointF, this.f31674h, x, y, f5, f6);
                activeDrawable.m16506I(activeDrawable.f31625M + this.f31671e.x);
                activeDrawable.m16507J(activeDrawable.f31626N + this.f31671e.y);
            }
            if (this.f31677k) {
                if (motionEvent2.getPointerCount() > 1) {
                    this.f31651K.setVisibility(8);
                } else if (activeDrawable.f31621I) {
                    int i = 0;
                    this.f31651K.setVisibility(0);
                    View view = this.f31652L;
                    if (!this.f31653M) {
                        i = 8;
                    }
                    view.setVisibility(i);
                }
            }
            activeDrawable.m16505H();
            for (AnonymousClass2Lh ny : this.f31647G) {
                ny.ny(activeDrawable.f31616D, f4, f3);
            }
            this.f31663W = motionEvent2.getX();
            this.f31664X = motionEvent2.getY();
            this.f31662V = motionEvent2.getEventTime();
            this.f31672f = true;
            return true;
        }
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (!this.f31647G.isEmpty()) {
            AnonymousClass2cS activeDrawable = getActiveDrawable();
            for (AnonymousClass2Lh anonymousClass2Lh : this.f31647G) {
                if (this.f31658R) {
                    anonymousClass2Lh.bAA(activeDrawable.f31620H, activeDrawable.f31616D);
                } else {
                    anonymousClass2Lh.cAA(activeDrawable.f31620H, activeDrawable.f31616D);
                }
            }
        }
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.M(this, 605984351);
        boolean z = false;
        if (this.f31675i) {
            if (this.f31644D.isEmpty()) {
                boolean onTouchEvent = this.f31655O.onTouchEvent(motionEvent);
                AnonymousClass0cQ.L(this, -1739037479, M);
                return onTouchEvent;
            }
            if (motionEvent.getPointerCount() == 1) {
                AnonymousClass2La anonymousClass2La = this.f31642B;
                anonymousClass2La.f29336V = false;
                anonymousClass2La.f29347g.N(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
            }
            if (!this.f31657Q || this.f31682p.G()) {
                AnonymousClass0cN anonymousClass0cN;
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0 && m16510B(this, motionEvent.getX(), motionEvent.getY())) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.f31658R = true;
                    AnonymousClass2cS activeDrawable = getActiveDrawable();
                    activeDrawable.f31629Q = false;
                    anonymousClass0cN = activeDrawable.f31614B;
                    anonymousClass0cN.f7108F = true;
                    anonymousClass0cN.N(0.949999988079071d);
                } else if (actionMasked == 5 && m16515G(motionEvent)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.f31658R = true;
                }
                if (m16519K(motionEvent.getX(), motionEvent.getY())) {
                    anonymousClass0cN = this.f31682p.A(this);
                    anonymousClass0cN.f7108F = false;
                    anonymousClass0cN.N(1.0d);
                    this.f31642B.m15167D();
                } else if (this.f31682p.E() > StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) {
                    this.f31656P.onTouchEvent(motionEvent);
                    AnonymousClass0cN anonymousClass0cN2 = this.f31682p;
                    anonymousClass0cN2.f7108F = true;
                    anonymousClass0cN2.N(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
                    this.f31642B.m15167D();
                } else {
                    this.f31669c.onTouchEvent(motionEvent);
                    this.f31668b.m14973A(motionEvent);
                    this.f31656P.onTouchEvent(motionEvent);
                }
                if (actionMasked == 1 || actionMasked == 3) {
                    this.f31657Q = true;
                    this.f31658R = false;
                    this.f31642B.m15167D();
                    invalidate();
                    if (this.f31660T) {
                        this.f31660T = false;
                        m16513E(this, getActiveDrawable());
                    } else {
                        getActiveDrawable().m16505H();
                    }
                    if (this.f31651K.getVisibility() != 0) {
                        for (AnonymousClass2Lh AEA : this.f31647G) {
                            AEA.AEA();
                        }
                    } else if (this.f31682p.G()) {
                        m16517I();
                    }
                }
            } else {
                AnonymousClass0cQ.L(this, -881066568, M);
                return true;
            }
        }
        if (this.f31675i && (!this.f31666Z || this.f31658R)) {
            z = true;
        }
        AnonymousClass0cQ.L(this, -1403659898, M);
        return z;
    }

    private void setActiveDrawable(AnonymousClass2cS anonymousClass2cS) {
        anonymousClass2cS.f31637Y = getNextAvailableZ();
        Collections.sort(this.f31644D);
        for (AnonymousClass2Lh uj : this.f31647G) {
            uj.uj(anonymousClass2cS.f31620H, anonymousClass2cS.f31616D);
        }
    }

    public void setAlignmentGuideEnabled(boolean z) {
        this.f31642B.f29330P = z;
    }

    public void setAlignmentGuideFooter(int i) {
        View inflate = LayoutInflater.from(getContext()).inflate(i, this, false);
        Object obj = this.f31642B;
        obj.f29317C = inflate;
        AnonymousClass0cN A = obj.f29348h.C().A(obj);
        A.f7108F = true;
        obj.f29316B = A.O(AnonymousClass2La.f29315l).L(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        addView(inflate);
    }

    public void setAlignmentGuideHeader(View view) {
        Object obj = this.f31642B;
        obj.f29319E = view;
        AnonymousClass0cN A = obj.f29348h.C().A(obj);
        A.f7108F = true;
        obj.f29318D = A.O(AnonymousClass2La.f29315l).L(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        addView(view);
    }

    public void setLongPressEnabled(boolean z) {
        this.f31656P.setIsLongpressEnabled(z);
    }

    public void setOnlyHandleTouchesOnActiveDrawables(boolean z) {
        this.f31666Z = z;
    }

    public void setTouchEnabled(boolean z) {
        this.f31675i = z;
    }

    public void setTrashCanEnabled(boolean z) {
        this.f31677k = z;
    }

    public void setTrashCanLabelEnabled(boolean z) {
        this.f31653M = z;
    }

    public final boolean sx(AnonymousClass2I8 anonymousClass2I8) {
        if (!this.f31658R) {
            return true;
        }
        AnonymousClass2cS activeDrawable = getActiveDrawable();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        float f = -AnonymousClass2I8.m14972B(anonymousClass2I8.f28632E, anonymousClass2I8.f28631D, anonymousClass2I8.f28630C, anonymousClass2I8.f28629B);
        float f2 = f / ((float) (elapsedRealtime - this.f31661U));
        float F = this.f31642B.m15169F(activeDrawable.m16500C(), activeDrawable.m16501D(), f2, activeDrawable.m16502E(), f);
        AnonymousClass2cS activeDrawable2 = getActiveDrawable();
        activeDrawable2.m16508K((activeDrawable2.f31630R + F) % 360.0f);
        this.f31661U = elapsedRealtime;
        return true;
    }
}
