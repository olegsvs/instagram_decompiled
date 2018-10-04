package com.instagram.ui.widget.segmentedprogressbar;

import X.AnonymousClass0Nm;
import X.AnonymousClass0e8;
import X.AnonymousClass0eS;
import X.AnonymousClass1ZZ;
import X.AnonymousClass2Lx;
import X.AnonymousClass2Ly;
import X.AnonymousClass2Lz;
import X.AnonymousClass2M0;
import X.AnonymousClass2cV;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.facebook.C0164R;
import com.fasterxml.jackson.core.base.ParserMinimalBase;

public class SegmentedProgressBar extends View {
    /* renamed from: i */
    private static final int f14117i = Color.argb(0, 255, 225, 255);
    /* renamed from: j */
    private static final int f14118j = Color.argb(255, 255, 226, 164);
    /* renamed from: k */
    public static final int[] f14119k = new int[]{C0164R.drawable.fuse_1, C0164R.drawable.fuse_2, C0164R.drawable.fuse_3, C0164R.drawable.fuse_4, C0164R.drawable.fuse_5, C0164R.drawable.fuse_6, C0164R.drawable.fuse_7, C0164R.drawable.fuse_8, C0164R.drawable.fuse_9};
    /* renamed from: B */
    public final SparseArray f14120B;
    /* renamed from: C */
    public int f14121C;
    /* renamed from: D */
    public float f14122D;
    /* renamed from: E */
    public int f14123E;
    /* renamed from: F */
    public int f14124F;
    /* renamed from: G */
    public final boolean f14125G;
    /* renamed from: H */
    public int f14126H;
    /* renamed from: I */
    public ValueAnimator f14127I;
    /* renamed from: J */
    public AnonymousClass2M0 f14128J;
    /* renamed from: K */
    public int f14129K;
    /* renamed from: L */
    public final Paint f14130L;
    /* renamed from: M */
    public float f14131M;
    /* renamed from: N */
    public AnonymousClass2cV f14132N;
    /* renamed from: O */
    public float f14133O;
    /* renamed from: P */
    public final int f14134P;
    /* renamed from: Q */
    public float f14135Q;
    /* renamed from: R */
    public int f14136R;
    /* renamed from: S */
    public boolean f14137S;
    /* renamed from: T */
    public final SparseArray f14138T;
    /* renamed from: U */
    public Bitmap f14139U;
    /* renamed from: V */
    public int f14140V;
    /* renamed from: W */
    public final Options f14141W;
    /* renamed from: X */
    public Bitmap[] f14142X;
    /* renamed from: Y */
    public long f14143Y;
    /* renamed from: Z */
    public final float f14144Z;
    /* renamed from: a */
    public final RectF f14145a;
    /* renamed from: b */
    public int f14146b;
    /* renamed from: c */
    private final SparseArray f14147c;
    /* renamed from: d */
    private String f14148d;
    /* renamed from: e */
    private boolean f14149e;
    /* renamed from: f */
    private final AnimatorUpdateListener f14150f;
    /* renamed from: g */
    private boolean f14151g;
    /* renamed from: h */
    private final RectF f14152h;

    public SegmentedProgressBar(Context context) {
        this(context, null);
    }

    public SegmentedProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SegmentedProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14150f = new AnonymousClass2Lx(this);
        this.f14120B = new SparseArray();
        this.f14147c = new SparseArray();
        this.f14138T = new SparseArray();
        this.f14123E = 0;
        Resources resources = getResources();
        this.f14135Q = 0.04f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.SegmentedProgressBar, i, 0);
        this.f14134P = obtainStyledAttributes.getDimensionPixelSize(0, resources.getDimensionPixelSize(C0164R.dimen.segmented_progress_bar_default_radius));
        this.f14140V = obtainStyledAttributes.getDimensionPixelOffset(3, resources.getDimensionPixelOffset(C0164R.dimen.segmented_progress_bar_default_spacing));
        this.f14124F = obtainStyledAttributes.getColor(1, Color.argb(255, 255, 255, 255));
        this.f14146b = obtainStyledAttributes.getColor(4, Color.argb(153, 255, 255, 255));
        this.f14129K = obtainStyledAttributes.getColor(2, Color.argb(ParserMinimalBase.INT_f, 255, 255, 255));
        obtainStyledAttributes.recycle();
        this.f14130L = new Paint(1);
        m9280H(this);
        this.f14145a = new RectF();
        this.f14152h = new RectF();
        this.f14125G = AnonymousClass0e8.m6200D(context);
        Options options = new Options();
        this.f14141W = options;
        options.inSampleSize = 3;
        this.f14144Z = AnonymousClass0Nm.m3424C(getContext(), 1);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f14127I = ofFloat;
        ofFloat.addUpdateListener(this.f14150f);
        this.f14127I.setInterpolator(new DecelerateInterpolator());
    }

    /* renamed from: A */
    public final void m9282A(int i) {
        if (this.f14125G) {
            i = (this.f14136R - 1) - i;
        }
        if (this.f14120B.get(i) == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f14122D, 0.0f});
            ofFloat.setDuration(250);
            this.f14120B.put(i, Float.valueOf(r3));
            ofFloat.addUpdateListener(new AnonymousClass2Ly(this, i));
            ofFloat.start();
        }
    }

    /* renamed from: B */
    public final void m9283B(int i, boolean z, String str) {
        int i2;
        if (str != null && str.equals(this.f14148d)) {
            i2 = this.f14121C;
            if (i != i2 && this.f14136R >= 3) {
                this.f14133O = this.f14131M;
                this.f14128J = i > i2 ? AnonymousClass2M0.f29478D : AnonymousClass2M0.f29477C;
                this.f14127I.cancel();
                this.f14127I.start();
            }
        }
        setProgress(0.0f);
        this.f14121C = Math.min(i, this.f14136R - 1);
        this.f14148d = str;
        this.f14137S = z;
        Resources resources = getResources();
        if (this.f14137S && this.f14142X == null) {
            this.f14142X = new Bitmap[f14119k.length];
            int i3 = 0;
            while (true) {
                int[] iArr = f14119k;
                if (i3 >= iArr.length) {
                    break;
                }
                this.f14142X[i3] = BitmapFactory.decodeResource(resources, iArr[i3], this.f14141W);
                i3++;
            }
        } else if (!(this.f14137S || this.f14142X == null)) {
            i2 = 0;
            while (true) {
                Bitmap[] bitmapArr = this.f14142X;
                if (i2 >= bitmapArr.length) {
                    break;
                }
                bitmapArr[i2].recycle();
                i2++;
            }
            this.f14142X = null;
        }
        if (this.f14137S && this.f14139U == null) {
            this.f14139U = BitmapFactory.decodeResource(resources, C0164R.drawable.smoke, this.f14141W);
        }
        this.f14143Y = -1;
        this.f14123E = -1;
        invalidate();
    }

    /* renamed from: B */
    public static void m9274B(SegmentedProgressBar segmentedProgressBar) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = segmentedProgressBar.f14143Y;
        if (j == -1 || currentTimeMillis - j > 30) {
            segmentedProgressBar.f14123E = (segmentedProgressBar.f14123E + 1) % f14119k.length;
            segmentedProgressBar.f14143Y = currentTimeMillis;
        }
    }

    /* renamed from: C */
    public static float m9275C(SegmentedProgressBar segmentedProgressBar) {
        float f = 0.0f;
        int i = 0;
        for (int i2 = 0; i2 < segmentedProgressBar.f14120B.size(); i2++) {
            f += ((Float) segmentedProgressBar.f14120B.valueAt(i2)).floatValue();
            if (f > 0.0f) {
                f += (float) segmentedProgressBar.f14140V;
            } else {
                i++;
            }
        }
        int size = segmentedProgressBar.f14136R - segmentedProgressBar.f14120B.size();
        return (((((float) segmentedProgressBar.getWidth()) - f) - ((float) (segmentedProgressBar.getResources().getDimensionPixelOffset(C0164R.dimen.segmented_progress_bar_default_margin_side) * 2))) - ((float) (((size - 1) - i) * segmentedProgressBar.f14140V))) / ((float) size);
    }

    /* renamed from: C */
    public final void m9284C(boolean z, int i, int i2) {
        this.f14149e = z;
        this.f14126H = i;
        this.f14127I.setDuration((long) i2);
    }

    /* renamed from: D */
    public static void m9276D(SegmentedProgressBar segmentedProgressBar, Canvas canvas, int i, float f, float f2, float f3, float f4) {
        segmentedProgressBar.f14130L.setShader(null);
        segmentedProgressBar.f14145a.set(f, f2, f3, f4);
        segmentedProgressBar.f14130L.setStyle(Style.FILL);
        segmentedProgressBar.f14130L.setColor(i);
        RectF rectF = segmentedProgressBar.f14145a;
        int i2 = segmentedProgressBar.f14134P;
        canvas.drawRoundRect(rectF, (float) i2, (float) i2, segmentedProgressBar.f14130L);
    }

    /* renamed from: E */
    public static LinearGradient m9277E(SegmentedProgressBar segmentedProgressBar, float f) {
        return new LinearGradient(segmentedProgressBar.f14145a.left, segmentedProgressBar.f14145a.top, segmentedProgressBar.f14145a.right, f, segmentedProgressBar.f14125G ? f14118j : f14117i, segmentedProgressBar.f14125G ? f14117i : f14118j, TileMode.CLAMP);
    }

    /* renamed from: F */
    public static void m9278F(SegmentedProgressBar segmentedProgressBar, int i, float f) {
        segmentedProgressBar.f14147c.put(i, Float.valueOf(f));
        if (segmentedProgressBar.f14138T.get(i) == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 2.0f});
            ofFloat.setDuration(1000);
            ofFloat.addListener(new AnonymousClass1ZZ(segmentedProgressBar, i));
            ofFloat.addUpdateListener(new AnonymousClass2Lz(segmentedProgressBar));
            segmentedProgressBar.f14138T.put(i, ofFloat);
        }
    }

    /* renamed from: G */
    public static void m9279G(SegmentedProgressBar segmentedProgressBar, Canvas canvas, int i) {
        ValueAnimator valueAnimator = (ValueAnimator) segmentedProgressBar.f14138T.get(i);
        if (valueAnimator != null) {
            Float f = (Float) segmentedProgressBar.f14120B.get(i);
            if (segmentedProgressBar.f14131M <= 0.95f) {
                if (f != null) {
                    if (f.floatValue() >= segmentedProgressBar.f14122D) {
                    }
                }
            }
            if (!valueAnimator.isStarted()) {
                valueAnimator.start();
            }
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f2 = floatValue - 1.0f;
            if (segmentedProgressBar.f14125G) {
                segmentedProgressBar.f14152h.left = ((Float) segmentedProgressBar.f14147c.get(i)).floatValue() - f2;
            } else {
                segmentedProgressBar.f14152h.left = ((Float) segmentedProgressBar.f14147c.get(i)).floatValue() + f2;
            }
            RectF rectF = segmentedProgressBar.f14152h;
            rectF.right = rectF.left + (((float) segmentedProgressBar.f14139U.getWidth()) * floatValue);
            segmentedProgressBar.f14152h.top = (((float) segmentedProgressBar.getHeight()) - (((float) segmentedProgressBar.f14139U.getHeight()) * floatValue)) / 2.0f;
            rectF = segmentedProgressBar.f14152h;
            rectF.bottom = rectF.top + (((float) segmentedProgressBar.f14139U.getHeight()) * floatValue);
            canvas.drawBitmap(segmentedProgressBar.f14139U, null, segmentedProgressBar.f14152h, segmentedProgressBar.f14130L);
        }
    }

    /* renamed from: H */
    public static void m9280H(SegmentedProgressBar segmentedProgressBar) {
        segmentedProgressBar.f14130L.setShadowLayer(segmentedProgressBar.getResources().getDisplayMetrics().density * 1.0f, 0.0f, 0.0f, Color.argb(39, 0, 0, 0));
    }

    /* renamed from: I */
    public static boolean m9281I(SegmentedProgressBar segmentedProgressBar, int i) {
        return segmentedProgressBar.f14137S && i == segmentedProgressBar.f14121C;
    }

    public int getCurrentSegment() {
        return this.f14121C;
    }

    public int getSegments() {
        return this.f14136R;
    }

    public final void onDraw(Canvas canvas) {
        if (this.f14136R != 0) {
            Canvas canvas2 = canvas;
            float dimensionPixelOffset;
            float height;
            float height2;
            float width;
            int i;
            if (r2.f14151g) {
                dimensionPixelOffset = (float) getResources().getDimensionPixelOffset(C0164R.dimen.segmented_progress_bar_default_margin_side);
                height = ((float) getHeight()) * r2.f14135Q;
                height2 = (((float) getHeight()) - height) / 2.0f;
                width = (((float) getWidth()) - (2.0f * dimensionPixelOffset)) / ((float) r2.f14136R);
                r2.f14130L.setShader(null);
                r2.f14130L.setStyle(Style.FILL);
                r2.f14130L.setAlpha(153);
                r2.f14130L.setColor(r2.f14146b);
                height += height2;
                r2.f14145a.set(dimensionPixelOffset, height2, ((float) getWidth()) - dimensionPixelOffset, height);
                RectF rectF = r2.f14145a;
                i = r2.f14134P;
                canvas2.drawRoundRect(rectF, (float) i, (float) i, r2.f14130L);
                r2.f14130L.setColor(r2.f14124F);
                r2.f14145a.set(dimensionPixelOffset, height2, ((((float) r2.f14121C) * width) + (width * r2.f14131M)) + dimensionPixelOffset, height);
                rectF = r2.f14145a;
                i = r2.f14134P;
                canvas2.drawRoundRect(rectF, (float) i, (float) i, r2.f14130L);
            } else if (r2.f14149e) {
                r2.f14122D = Math.max(m9275C(r2), AnonymousClass0Nm.m3424C(getContext(), r2.f14126H));
                r2.f14140V = (int) AnonymousClass0Nm.m3424C(getContext(), 3);
                float dimensionPixelOffset2 = (float) getResources().getDimensionPixelOffset(C0164R.dimen.segmented_progress_bar_default_margin_side);
                r2.f14135Q = 0.06f;
                float height3 = ((float) getHeight()) * r2.f14135Q;
                float height4 = (((float) getHeight()) - height3) / 2.0f;
                height2 = (float) getResources().getDimensionPixelOffset(C0164R.dimen.segmented_progress_bar_default_margin_side);
                height = ((((float) getWidth()) - (2.0f * height2)) - r2.f14122D) / ((float) (r2.f14136R - 1));
                float f = (((float) r2.f14121C) * height) - ((float) r2.f14140V);
                if (r2.f14127I.isRunning()) {
                    height = (height * ((float) (r2.f14128J == AnonymousClass2M0.f29478D ? r2.f14121C - 1 : r2.f14121C + 1))) - ((float) r2.f14140V);
                    f = ((f - height) * r2.f14127I.getAnimatedFraction()) + height;
                }
                if (f > 0.0f) {
                    m9276D(r2, canvas2, r2.f14124F, dimensionPixelOffset2, height4, dimensionPixelOffset2 + f, height4 + height3);
                    dimensionPixelOffset2 += r2.f14145a.width() + ((float) r2.f14140V);
                }
                height3 += height4;
                float f2 = height4;
                canvas = height3;
                m9276D(r2, canvas2, r2.f14129K, dimensionPixelOffset2, f2, dimensionPixelOffset2 + r2.f14122D, canvas);
                if (r2.f14127I.isRunning()) {
                    int argb = Color.argb((int) ((1.0f - r2.f14127I.getAnimatedFraction()) * 255.0f), 255, 255, 255);
                    r2.f14130L.clearShadowLayer();
                    m9276D(r12, canvas2, argb, dimensionPixelOffset2, f2, dimensionPixelOffset2 + (r2.f14122D * r2.f14133O), canvas);
                    m9280H(r2);
                }
                m9276D(r12, canvas2, r2.f14124F, dimensionPixelOffset2, f2, dimensionPixelOffset2 + (r2.f14122D * r2.f14131M), canvas);
                dimensionPixelOffset2 += r2.f14122D + ((float) r2.f14140V);
                f = (((float) getWidth()) - dimensionPixelOffset2) - height2;
                if (f > 0.0f) {
                    m9276D(r2, canvas2, r2.f14129K, dimensionPixelOffset2, height4, dimensionPixelOffset2 + f, height3);
                }
            } else {
                r2.f14122D = m9275C(r2);
                dimensionPixelOffset = ((float) getHeight()) * r2.f14135Q;
                height = (float) getResources().getDimensionPixelOffset(C0164R.dimen.segmented_progress_bar_default_margin_side);
                height2 = (((float) getHeight()) - dimensionPixelOffset) / 2.0f;
                int i2 = 0;
                while (i2 < r2.f14136R) {
                    Float f3 = (Float) r2.f14120B.get(i2);
                    if (f3 == null) {
                        f3 = Float.valueOf(r2.f14122D);
                    }
                    if (f3.floatValue() != 0.0f) {
                        r2.f14130L.setShader(null);
                        r2.f14145a.set(height, height2, f3.floatValue() + height, height2 + dimensionPixelOffset);
                        r2.f14130L.setStyle(Style.FILL);
                        int i3 = r2.f14125G ? (r2.f14136R - 1) - i2 : i2;
                        if (i3 < r2.f14121C) {
                            r2.f14130L.setColor(r2.f14124F);
                        } else {
                            r2.f14130L.setColor(r2.f14146b);
                            r2.f14130L.setAlpha(m9281I(r2, i3) ? (int) ((1.0f - r2.f14131M) * 153.0f) : 153);
                        }
                        RectF rectF2 = r2.f14145a;
                        i = r2.f14134P;
                        canvas2.drawRoundRect(rectF2, (float) i, (float) i, r2.f14130L);
                        r2.f14130L.setColor(r2.f14124F);
                        Object obj = (i3 != r2.f14121C || r2.f14125G) ? null : 1;
                        float floatValue;
                        RectF rectF3;
                        Bitmap bitmap;
                        AnonymousClass2cV anonymousClass2cV;
                        RectF rectF4;
                        if (obj != null) {
                            RectF rectF5 = r2.f14145a;
                            rectF5.right = rectF5.left + (r2.f14122D * r2.f14131M);
                            width = r2.f14145a.left;
                            if (m9281I(r2, i3)) {
                                floatValue = f3.floatValue();
                                rectF2 = r2.f14145a;
                                rectF2.left = Math.max(rectF2.left, r2.f14145a.right - ((1.0f - r2.f14131M) * floatValue));
                                r2.f14130L.setShader(m9277E(r2, dimensionPixelOffset));
                            }
                            rectF3 = r2.f14145a;
                            i = r2.f14134P;
                            canvas2.drawRoundRect(rectF3, (float) i, (float) i, r2.f14130L);
                            if (m9281I(r2, i3)) {
                                m9278F(r2, i2, r2.f14145a.left);
                                m9274B(r2);
                                bitmap = r2.f14142X[r2.f14123E];
                                canvas2.drawBitmap(bitmap, r2.f14145a.right - ((float) (bitmap.getWidth() / 2)), (r2.f14145a.top - ((float) (bitmap.getHeight() / 2))) + r2.f14144Z, r2.f14130L);
                            }
                            anonymousClass2cV = r2.f14132N;
                            if (anonymousClass2cV != null && anonymousClass2cV.A()) {
                                r2.f14132N.B(r2.f14145a.right, width, r2.f14122D + width);
                            }
                            rectF4 = r2.f14145a;
                            rectF4.left = width;
                            rectF4.right = rectF4.left + r2.f14122D;
                        } else {
                            obj = (i3 == r2.f14121C && r2.f14125G) ? 1 : null;
                            if (obj != null) {
                                width = r2.f14125G ? 1.0f - r2.f14131M : r2.f14131M;
                                rectF4 = r2.f14145a;
                                rectF4.left += r2.f14122D * width;
                                width = r2.f14145a.right;
                                if (m9281I(r2, i3)) {
                                    floatValue = f3.floatValue();
                                    rectF2 = r2.f14145a;
                                    rectF2.right = Math.min(rectF2.right, r2.f14145a.left + ((1.0f - r2.f14131M) * floatValue));
                                    r2.f14130L.setShader(m9277E(r2, dimensionPixelOffset));
                                }
                                rectF3 = r2.f14145a;
                                i = r2.f14134P;
                                canvas2.drawRoundRect(rectF3, (float) i, (float) i, r2.f14130L);
                                if (m9281I(r2, i3)) {
                                    m9278F(r2, i2, r2.f14145a.left);
                                    m9274B(r2);
                                    bitmap = r2.f14142X[r2.f14123E];
                                    canvas2.drawBitmap(bitmap, r2.f14145a.left - ((float) (bitmap.getWidth() / 2)), (r2.f14145a.top - ((float) (bitmap.getHeight() / 2))) + r2.f14144Z, r2.f14130L);
                                }
                                anonymousClass2cV = r2.f14132N;
                                if (anonymousClass2cV != null && anonymousClass2cV.A()) {
                                    r2.f14132N.B(r2.f14145a.left, width - r2.f14122D, width);
                                }
                                rectF4 = r2.f14145a;
                                rectF4.right = width;
                                rectF4.left = rectF4.right - r2.f14122D;
                            }
                        }
                        height += r2.f14145a.width() + ((float) r2.f14140V);
                    }
                    m9279G(r2, canvas2, i2);
                    i2++;
                }
            }
        }
    }

    public void setPositionAnchorDelegate(AnonymousClass2cV anonymousClass2cV) {
        this.f14132N = anonymousClass2cV;
    }

    public void setProgress(float f) {
        this.f14131M = Math.min(Math.max(f, 0.0f), 1.0f);
        invalidate();
    }

    public void setSegments(int i) {
        this.f14136R = i;
        invalidate();
    }

    public void setShowNoSpaceProgressBar(boolean z) {
        this.f14151g = z;
    }
}
