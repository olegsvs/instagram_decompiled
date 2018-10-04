package com.instagram.common.ui.widget.imageview;

import X.AnonymousClass0ES;
import X.AnonymousClass0Gs;
import X.AnonymousClass0H6;
import X.AnonymousClass0HB;
import X.AnonymousClass0LH;
import X.AnonymousClass0LQ;
import X.AnonymousClass0RJ;
import X.AnonymousClass0RL;
import X.AnonymousClass0aa;
import X.AnonymousClass0ac;
import X.AnonymousClass0ag;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eS;
import X.AnonymousClass0h5;
import X.AnonymousClass0h6;
import X.AnonymousClass0h7;
import X.AnonymousClass0p8;
import X.AnonymousClass0z0;
import X.AnonymousClass15r;
import X.AnonymousClass15t;
import X.AnonymousClass15u;
import X.AnonymousClass269;
import X.AnonymousClass26D;
import X.AnonymousClass2V1;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

public class IgImageView extends ImageView {
    /* renamed from: f */
    public static AnonymousClass0H6 f2537f;
    /* renamed from: g */
    public static AnonymousClass0HB f2538g;
    /* renamed from: h */
    public static AnonymousClass0ES f2539h;
    /* renamed from: i */
    public static boolean f2540i;
    /* renamed from: j */
    private static boolean f2541j;
    /* renamed from: B */
    public Bitmap f2542B;
    /* renamed from: C */
    public final AnonymousClass0RL f2543C = new AnonymousClass0h7(this);
    /* renamed from: D */
    public int f2544D;
    /* renamed from: E */
    public AnonymousClass269 f2545E = null;
    /* renamed from: F */
    public AnonymousClass0z0 f2546F;
    /* renamed from: G */
    public AnonymousClass0aa f2547G;
    /* renamed from: H */
    public boolean f2548H;
    /* renamed from: I */
    public final AnonymousClass2V1 f2549I = new AnonymousClass2V1(this);
    /* renamed from: J */
    public boolean f2550J = false;
    /* renamed from: K */
    public int f2551K = 1;
    /* renamed from: L */
    public int f2552L = 3;
    /* renamed from: M */
    public final AnonymousClass0h5 f2553M = new AnonymousClass0h5(this);
    /* renamed from: N */
    public AnonymousClass15u f2554N;
    /* renamed from: O */
    public boolean f2555O;
    /* renamed from: P */
    public String f2556P;
    /* renamed from: Q */
    public AnonymousClass0z0 f2557Q;
    /* renamed from: R */
    public AnonymousClass15r f2558R;
    /* renamed from: S */
    public final AnonymousClass0ac f2559S = new AnonymousClass0ac(this);
    /* renamed from: T */
    public AnonymousClass0ag f2560T;
    /* renamed from: U */
    public AnonymousClass15t f2561U;
    /* renamed from: V */
    public boolean f2562V = false;
    /* renamed from: W */
    public AnonymousClass0aa f2563W;
    /* renamed from: X */
    public AnonymousClass26D f2564X;
    /* renamed from: Y */
    public String f2565Y;
    /* renamed from: Z */
    public String f2566Z;
    /* renamed from: a */
    private int f2567a;
    /* renamed from: b */
    private int f2568b;
    /* renamed from: c */
    private final AnonymousClass0RL f2569c = new AnonymousClass0h6(this);
    /* renamed from: d */
    private AnonymousClass0p8 f2570d;
    /* renamed from: e */
    private Drawable f2571e;

    public IgImageView(Context context) {
        super(context);
        m1958D();
    }

    public IgImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1957C(attributeSet);
        m1958D();
    }

    public IgImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1957C(attributeSet);
        m1958D();
    }

    /* renamed from: A */
    public final void m1960A() {
        m1959E();
        m1964F();
    }

    /* renamed from: B */
    public static void m1956B(IgImageView igImageView, Bitmap bitmap) {
        AnonymousClass0p8 anonymousClass0p8 = igImageView.f2570d;
        if (anonymousClass0p8 != null) {
            anonymousClass0p8.AKA(igImageView, bitmap);
        } else {
            igImageView.setImageBitmap(bitmap);
        }
    }

    /* renamed from: B */
    public void m1961B(String str, int i) {
        AnonymousClass0LH.m2927E(str);
        this.f2547G = null;
        this.f2551K = Math.max(i, 1);
        m1962C(str, false);
    }

    /* renamed from: C */
    private void m1957C(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0eS.IgImageView);
        int color = obtainStyledAttributes.getColor(0, 0);
        if (color != 0) {
            this.f2571e = new ColorDrawable(color);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: C */
    public final void m1962C(String str, boolean z) {
        AnonymousClass0LH.m2927E(str);
        m1963D(str, z, false, false);
    }

    /* renamed from: D */
    private void m1958D() {
        if (f2540i) {
            this.f2545E = new AnonymousClass269();
        }
    }

    /* renamed from: D */
    public final void m1963D(String str, boolean z, boolean z2, boolean z3) {
        AnonymousClass0LH.m2927E(str);
        if (f2541j && AnonymousClass0LQ.m2954B(this.f2566Z, str) && this.f2550J) {
            Bitmap bitmap = this.f2542B;
            if (bitmap != null) {
                AnonymousClass0z0 anonymousClass0z0 = this.f2557Q;
                if (anonymousClass0z0 != null) {
                    anonymousClass0z0.kp(bitmap);
                }
                m1956B(this, this.f2542B);
                return;
            }
        }
        if (this.f2563W != null) {
            AnonymousClass0Gs.f2431j.m1921G(this.f2563W, false);
        }
        if (z2) {
            m1959E();
        } else {
            m1960A();
        }
        this.f2566Z = str;
        AnonymousClass0RJ D = AnonymousClass0Gs.f2431j.m1908D(this.f2566Z);
        D.f4635F = false;
        String str2 = this.f2565Y;
        if (str2 != null) {
            D.f4645P = str2;
        }
        AnonymousClass0ag anonymousClass0ag = this.f2560T;
        if (anonymousClass0ag != null) {
            D.f4642M = anonymousClass0ag;
            D.f4641L = new WeakReference(this.f2559S);
        }
        D = D.m4149C(this.f2543C);
        D.f4636G = this.f2551K;
        D.f4643N = this.f2562V;
        D.f4632C = z;
        D.f4639J = new WeakReference(this.f2553M);
        D.f4640K = this.f2556P;
        D.f4638I = this.f2552L;
        D.f4647R = z3;
        D.f4634E = new WeakReference(this.f2549I);
        this.f2563W = D.m4147A();
        AnonymousClass26D anonymousClass26D = this.f2564X;
        if (anonymousClass26D != null) {
            anonymousClass26D.Jx();
        }
        AnonymousClass269 anonymousClass269 = this.f2545E;
        if (anonymousClass269 != null) {
            anonymousClass269.f25947C = this.f2563W.f6574K;
        }
        this.f2563W.m5476G();
    }

    /* renamed from: E */
    private void m1959E() {
        this.f2542B = null;
        this.f2550J = false;
        this.f2563W = null;
        this.f2547G = null;
        this.f2548H = false;
        this.f2555O = false;
        this.f2544D = 0;
        AnonymousClass269 anonymousClass269 = this.f2545E;
        if (anonymousClass269 != null) {
            anonymousClass269.f25946B = 0;
        }
    }

    /* renamed from: F */
    public final void m1964F() {
        setImageDrawable(this.f2571e);
    }

    public int getCurrentScans() {
        return this.f2544D;
    }

    public AnonymousClass269 getDebugInfo() {
        return this.f2545E;
    }

    public String getUrl() {
        return this.f2566Z;
    }

    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (VERSION.SDK_INT < 23 && drawable == getDrawable() && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth != this.f2568b || intrinsicHeight != this.f2567a) {
                this.f2568b = intrinsicWidth;
                this.f2567a = intrinsicHeight;
                setSelected(false);
            }
        }
    }

    public void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.m5864N(this, 181573684);
        super.onDetachedFromWindow();
        if (!(this.f2550J || this.f2563W == null)) {
            AnonymousClass0Gs.f2431j.m1921G(this.f2563W, false);
            this.f2563W = null;
        }
        AnonymousClass0cQ.m5865O(this, -961628347, N);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        AnonymousClass0HB anonymousClass0HB = f2538g;
        if (anonymousClass0HB != null) {
            anonymousClass0HB.m1966A(canvas, this, this.f2542B);
        }
    }

    public static void setDebugOverlayDrawer(AnonymousClass0HB anonymousClass0HB) {
        if (f2540i) {
            f2538g = anonymousClass0HB;
        }
    }

    public static void setDecodeIntermediateSupplier(AnonymousClass0ES anonymousClass0ES) {
        f2539h = anonymousClass0ES;
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable != null) {
            this.f2568b = drawable.getIntrinsicWidth();
            this.f2567a = drawable.getIntrinsicHeight();
        }
    }

    public void setImageRenderer(AnonymousClass0p8 anonymousClass0p8) {
        this.f2570d = anonymousClass0p8;
    }

    public static void setKeepBitmapReference(boolean z) {
        f2541j = z;
    }

    public void setMiniPreviewBlurRadius(int i) {
        this.f2552L = i;
    }

    public void setMiniPreviewLoadListener(AnonymousClass15u anonymousClass15u) {
        this.f2554N = anonymousClass15u;
    }

    public void setMiniPreviewPayload(String str) {
        this.f2556P = str;
    }

    public void setOnFallbackListener(AnonymousClass0z0 anonymousClass0z0) {
        this.f2546F = anonymousClass0z0;
    }

    public void setOnLoadListener(AnonymousClass0z0 anonymousClass0z0) {
        this.f2557Q = anonymousClass0z0;
    }

    public void setPlaceHolderColor(int i) {
        this.f2571e = new ColorDrawable(i);
    }

    public void setPlaceHolderColor(ColorDrawable colorDrawable) {
        if (this.f2571e != colorDrawable) {
            this.f2571e = colorDrawable;
        }
    }

    public void setProgressListener(AnonymousClass15r anonymousClass15r) {
        this.f2558R = anonymousClass15r;
    }

    public void setProgressiveImageConfig(AnonymousClass0ag anonymousClass0ag) {
        this.f2560T = anonymousClass0ag;
    }

    public void setProgressiveImageListener(AnonymousClass15t anonymousClass15t) {
        this.f2561U = anonymousClass15t;
    }

    public void setReportProgress(boolean z) {
        this.f2562V = z;
    }

    public void setRequestStartListener(AnonymousClass26D anonymousClass26D) {
        this.f2564X = anonymousClass26D;
    }

    public void setSource(String str) {
        this.f2565Y = str;
    }

    public void setUrl(String str) {
        AnonymousClass0LH.m2927E(str);
        AnonymousClass0LH.m2927E(str);
        this.f2547G = null;
        m1962C(str, false);
    }

    public void setUrlWithFallback(String str, String str2, AnonymousClass0z0 anonymousClass0z0) {
        AnonymousClass0LH.m2927E(str);
        m1962C(str, false);
        if (str2 != null) {
            AnonymousClass0RJ C = AnonymousClass0Gs.f2431j.m1908D(str2).m4149C(this.f2569c);
            C.f4647R = true;
            String str3 = this.f2565Y;
            if (str3 != null) {
                C.f4645P = str3;
            }
            this.f2547G = C.m4147A();
            this.f2546F = anonymousClass0z0;
            this.f2547G.m5476G();
        }
    }

    public void setUrlWithoutPlaceholder(String str) {
        AnonymousClass0LH.m2927E(str);
        m1963D(str, false, true, false);
    }
}
