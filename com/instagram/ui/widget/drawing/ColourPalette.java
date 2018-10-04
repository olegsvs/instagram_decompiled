package com.instagram.ui.widget.drawing;

import X.AnonymousClass0QP;
import X.AnonymousClass0cN;
import X.AnonymousClass0cQ;
import X.AnonymousClass0e6;
import X.AnonymousClass0e8;
import X.AnonymousClass0eS;
import X.AnonymousClass14H;
import X.AnonymousClass2Ke;
import X.AnonymousClass2Kf;
import X.AnonymousClass2Kg;
import X.AnonymousClass2Kh;
import X.AnonymousClass2Km;
import X.AnonymousClass4O1;
import X.AnonymousClass5Sw;
import X.AnonymousClass5bK;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.common.dextricks.StartupQEsConfig;
import java.util.ArrayList;

public class ColourPalette extends View {
    /* renamed from: T */
    public static final int f29048T = Color.rgb(230, 230, 230);
    /* renamed from: U */
    public static final int f29049U = Color.rgb(51, 51, 51);
    /* renamed from: V */
    private static final int[] f29050V = new int[2];
    /* renamed from: B */
    public final Paint f29051B;
    /* renamed from: C */
    public final Paint f29052C;
    /* renamed from: D */
    public final float f29053D;
    /* renamed from: E */
    public final AnonymousClass0cN f29054E;
    /* renamed from: F */
    public final ArrayList f29055F;
    /* renamed from: G */
    public AnonymousClass2Kh f29056G;
    /* renamed from: H */
    public float f29057H;
    /* renamed from: I */
    private final float f29058I;
    /* renamed from: J */
    private final float f29059J;
    /* renamed from: K */
    private float f29060K;
    /* renamed from: L */
    private float f29061L;
    /* renamed from: M */
    private final AnonymousClass2Kg f29062M;
    /* renamed from: N */
    private final ArrayList f29063N;
    /* renamed from: O */
    private int f29064O;
    /* renamed from: P */
    private boolean f29065P;
    /* renamed from: Q */
    private final GestureDetector f29066Q;
    /* renamed from: R */
    private AnonymousClass4O1 f29067R;
    /* renamed from: S */
    private final boolean f29068S;

    public ColourPalette(Context context) {
        this(context, null);
    }

    public ColourPalette(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColourPalette(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes;
        Throwable th;
        super(context, attributeSet, i);
        this.f29056G = AnonymousClass2Kh.SINGLE_COLOUR;
        this.f29063N = new ArrayList();
        this.f29055F = new ArrayList();
        this.f29068S = AnonymousClass0e8.D(context);
        try {
            obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0eS.ColourPalette);
            try {
                this.f29053D = obtainStyledAttributes.getDimension(2, 5.0f);
                this.f29059J = obtainStyledAttributes.getDimension(1, 0.0f);
                this.f29058I = obtainStyledAttributes.getDimension(0, 0.0f);
                this.f29057H = obtainStyledAttributes.getDimension(4, 0.0f);
                int color = obtainStyledAttributes.getColor(3, -16777216);
                if (obtainStyledAttributes != null) {
                    obtainStyledAttributes.recycle();
                }
                Paint paint = new Paint(1);
                this.f29052C = paint;
                paint.setStyle(Style.STROKE);
                this.f29052C.setStrokeWidth(this.f29053D);
                this.f29052C.setColor(-1);
                paint = new Paint(1);
                this.f29051B = paint;
                paint.setShadowLayer(this.f29057H, 0.0f, 0.0f, color);
                this.f29062M = new AnonymousClass2Kg(this);
                this.f29066Q = new GestureDetector(context, this.f29062M);
                AnonymousClass0QP anonymousClass2Ke = new AnonymousClass2Ke(this);
                AnonymousClass0cN K = AnonymousClass0e6.B().C().N(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED).K();
                K.f7108F = true;
                this.f29054E = K.A(anonymousClass2Ke);
                if (this.f29057H > 0.0f) {
                    setLayerType(1, null);
                }
            } catch (Throwable th2) {
                th = th2;
                if (obtainStyledAttributes != null) {
                    obtainStyledAttributes.recycle();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            obtainStyledAttributes = null;
            if (obtainStyledAttributes != null) {
                obtainStyledAttributes.recycle();
            }
            throw th;
        }
    }

    /* renamed from: A */
    public final boolean m15104A(float f) {
        return f >= this.f29061L && f <= this.f29060K;
    }

    /* renamed from: B */
    public static void m15101B(ColourPalette colourPalette, int i) {
        colourPalette.f29064O = i;
        colourPalette = colourPalette.f29067R;
        if (colourPalette != null) {
            AnonymousClass5bK.D(colourPalette.f53499B, i);
            colourPalette.f53499B.f66848O.m15105A();
        }
    }

    /* renamed from: C */
    public static void m15102C(ColourPalette colourPalette, int i, float f, float f2) {
        int i2 = i;
        colourPalette.f29064O = i;
        if (colourPalette.f29067R != null) {
            colourPalette.getLocationInWindow(f29050V);
            AnonymousClass4O1 anonymousClass4O1 = colourPalette.f29067R;
            int[] iArr = f29050V;
            float f3 = f + ((float) iArr[0]);
            float f4 = f2 + ((float) iArr[1]);
            AnonymousClass5bK.D(anonymousClass4O1.f53499B, i);
            anonymousClass4O1.f53499B.f66848O.m15106B(f3, f4, f3, f4 - anonymousClass4O1.f53499B.f66838E, anonymousClass4O1.f53499B.f66839F, i2, 1, StartupQEsConfig.DEFAULT_IDLE_MAX_INTERVAL_MS);
        }
    }

    /* renamed from: D */
    private void m15103D(boolean z) {
        AnonymousClass4O1 anonymousClass4O1 = this.f29067R;
        if (anonymousClass4O1 != null) {
            anonymousClass4O1.f53499B.f66840G.requestDisallowInterceptTouchEvent(z);
            if (!AnonymousClass5Sw.E(anonymousClass4O1.f53499B.f66844K)) {
                return;
            }
            if (z) {
                AnonymousClass14H.E(true, new View[]{r4.f64157L});
                return;
            }
            AnonymousClass14H.H(true, new View[]{r4.f64157L});
        }
    }

    public final void onDraw(Canvas canvas) {
        int size = this.f29055F.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass2Kf anonymousClass2Kf = (AnonymousClass2Kf) this.f29055F.get(i);
            if ((anonymousClass2Kf.f29040J.f29054E.G() ^ 1) != 0 || anonymousClass2Kf.f29040J.f29056G == AnonymousClass2Kh.GRADIENT) {
                RectF rectF = anonymousClass2Kf.f29037G;
                float f = anonymousClass2Kf.f29036F;
                canvas.drawRoundRect(rectF, f, f, anonymousClass2Kf.f29038H);
            }
            if (anonymousClass2Kf.f29039I) {
                if (anonymousClass2Kf.f29040J.f29057H > 0.0f && anonymousClass2Kf.f29040J.f29056G == AnonymousClass2Kh.SINGLE_COLOUR && (anonymousClass2Kf.f29040J.f29054E.G() ^ 1) == 0) {
                    rectF = anonymousClass2Kf.f29037G;
                    f = anonymousClass2Kf.f29036F;
                    canvas.drawRoundRect(rectF, f, f, anonymousClass2Kf.f29040J.f29051B);
                }
                rectF = anonymousClass2Kf.f29037G;
                f = anonymousClass2Kf.f29036F;
                canvas.drawRoundRect(rectF, f, f, anonymousClass2Kf.f29035E);
                rectF = anonymousClass2Kf.f29037G;
                f = anonymousClass2Kf.f29036F;
                canvas.drawRoundRect(rectF, f, f, anonymousClass2Kf.f29040J.f29052C);
            }
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f29055F.clear();
        int size = this.f29063N.size();
        float width = ((float) getWidth()) / ((float) size);
        float height = (float) getHeight();
        float f = this.f29059J;
        float f2 = f + 0.0f;
        z = width - f;
        int i5 = height - this.f29058I;
        float f3 = i5 - (z - f2);
        float f4 = width;
        float f5 = 0.0f;
        int i6 = 0;
        while (i6 < size) {
            boolean z2;
            float f6;
            int i7 = r10.f29068S ? (size - 1) - i6 : i6;
            int intValue = ((Integer) r10.f29063N.get(i7)).intValue();
            int intValue2 = ((Integer) (i7 == 0 ? r10.f29063N.get(i7) : r10.f29063N.get(i7 - 1))).intValue();
            int i8 = i7 + 1;
            i8 = i8 < size ? ((Integer) r10.f29063N.get(i8)).intValue() : -1;
            i4 = AnonymousClass2Km.m15107B(0.5f, intValue2, intValue);
            i8 = AnonymousClass2Km.m15107B(0.5f, intValue, i8);
            if (!r10.f29065P) {
                if (i7 == 0) {
                    z2 = false;
                    i3 = r10.f29068S ? i8 : i4;
                    if (r10.f29068S) {
                        i4 = i8;
                    }
                    i8 = i5;
                    r10.f29055F.add(new AnonymousClass2Kf(r10, z2, f5, 0.0f, f4, height, f2, f3, z, i5, intValue, i3, i4));
                    f = f4 + width;
                    f6 = r10.f29059J;
                    f2 = f4 + f6;
                    z = f - f6;
                    i6++;
                    f5 = f4;
                    i5 = i8;
                    f4 = f;
                }
            }
            z2 = true;
            if (r10.f29068S) {
            }
            if (r10.f29068S) {
                i4 = i8;
            }
            i8 = i5;
            r10.f29055F.add(new AnonymousClass2Kf(r10, z2, f5, 0.0f, f4, height, f2, f3, z, i5, intValue, i3, i4));
            f = f4 + width;
            f6 = r10.f29059J;
            f2 = f4 + f6;
            z = f - f6;
            i6++;
            f5 = f4;
            i5 = i8;
            f4 = f;
        }
        r10.f29061L = f3;
        r10.f29060K = i5;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.M(this, -109795200);
        boolean onTouchEvent = this.f29066Q.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 2) {
                if (action == 1 || action == 3) {
                    this.f29062M.f29043B = false;
                    if (this.f29056G == AnonymousClass2Kh.GRADIENT) {
                        setMode(this, AnonymousClass2Kh.SINGLE_COLOUR);
                        m15101B(this, this.f29064O);
                        AnonymousClass0cQ.L(this, 1072767541, M);
                        return true;
                    }
                }
                AnonymousClass0cQ.L(this, 917253589, M);
                return onTouchEvent;
            }
        }
        if (this.f29056G == AnonymousClass2Kh.GRADIENT) {
            float x = motionEvent.getX();
            float max = Math.max(0.0f, Math.min((float) getHeight(), motionEvent.getY()));
            int size = this.f29055F.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass2Kf anonymousClass2Kf = (AnonymousClass2Kf) this.f29055F.get(i);
                if (anonymousClass2Kf.m15100B(x, max)) {
                    m15102C(this, anonymousClass2Kf.m15099A(x, max), x, max);
                    AnonymousClass0cQ.L(this, 1499912005, M);
                    return true;
                }
            }
        }
        AnonymousClass0cQ.L(this, 917253589, M);
        return onTouchEvent;
    }

    public void setColourStops(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            this.f29063N.clear();
            this.f29063N.addAll(arrayList);
            this.f29064O = ((Integer) arrayList.get(0)).intValue();
            forceLayout();
        }
    }

    public void setDrawAllColourStops(boolean z) {
        this.f29065P = z;
    }

    public void setInteractionListener(AnonymousClass4O1 anonymousClass4O1) {
        this.f29067R = anonymousClass4O1;
    }

    public static void setMode(ColourPalette colourPalette, AnonymousClass2Kh anonymousClass2Kh) {
        if (colourPalette.f29056G != anonymousClass2Kh) {
            colourPalette.f29056G = anonymousClass2Kh;
            if (anonymousClass2Kh == AnonymousClass2Kh.SINGLE_COLOUR) {
                colourPalette.m15103D(false);
                colourPalette.f29054E.N(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
                return;
            }
            colourPalette.m15103D(true);
            colourPalette.f29054E.N(1.0d);
        }
    }
}
