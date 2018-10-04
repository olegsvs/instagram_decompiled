package com.instagram.arlink.ui;

import X.AnonymousClass0cQ;
import X.AnonymousClass0rm;
import X.AnonymousClass1lz;
import X.AnonymousClass2Jb;
import X.AnonymousClass2ff;
import X.AnonymousClass2fg;
import X.AnonymousClass2fi;
import X.AnonymousClass2fj;
import X.AnonymousClass2fk;
import X.AnonymousClass31F;
import X.AnonymousClass31G;
import X.AnonymousClass3x0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import com.facebook.C0164R;
import com.instagram.arlink.fragment.NametagBackgroundController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GridPatternView extends View {
    /* renamed from: Z */
    private static final float[][] f37006Z = new float[][]{new float[]{-45.0f, 0.0f, 45.0f, 0.0f}, new float[]{0.0f, 0.0f, 0.0f, 45.0f}, new float[]{45.0f, 0.0f, 0.0f, 0.0f}, new float[]{0.0f, -45.0f, 0.0f, 45.0f}};
    /* renamed from: B */
    public NametagBackgroundController f37007B;
    /* renamed from: C */
    public Integer f37008C;
    /* renamed from: D */
    private final Matrix f37009D = new Matrix();
    /* renamed from: E */
    private final Paint f37010E = new Paint();
    /* renamed from: F */
    private int f37011F;
    /* renamed from: G */
    private int f37012G;
    /* renamed from: H */
    private int f37013H;
    /* renamed from: I */
    private Bitmap f37014I;
    /* renamed from: J */
    private final TextPaint f37015J = new TextPaint();
    /* renamed from: K */
    private float f37016K;
    /* renamed from: L */
    private String f37017L;
    /* renamed from: M */
    private Bitmap f37018M;
    /* renamed from: N */
    private int f37019N;
    /* renamed from: O */
    private float f37020O;
    /* renamed from: P */
    private Bitmap f37021P;
    /* renamed from: Q */
    private AnonymousClass31G f37022Q = AnonymousClass31G.NONE;
    /* renamed from: R */
    private int f37023R;
    /* renamed from: S */
    private Bitmap f37024S;
    /* renamed from: T */
    private int f37025T;
    /* renamed from: U */
    private int f37026U;
    /* renamed from: V */
    private int f37027V;
    /* renamed from: W */
    private int f37028W;
    /* renamed from: X */
    private int f37029X;
    /* renamed from: Y */
    private int f37030Y;

    public GridPatternView(Context context) {
        super(context);
        m18221E();
    }

    public GridPatternView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m18221E();
    }

    public GridPatternView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m18221E();
    }

    /* renamed from: B */
    public static int m18218B(AnonymousClass2fk anonymousClass2fk) {
        List<AnonymousClass2fj> arrayList = new ArrayList(Collections.unmodifiableList(anonymousClass2fk.f32264D));
        Collections.sort(arrayList, new AnonymousClass31F());
        for (AnonymousClass2fj anonymousClass2fj : arrayList) {
            float[] A = anonymousClass2fj.m16840A();
            if (A[2] < 0.4f) {
                return anonymousClass2fj.f32254D;
            }
            if (A[2] < 0.5f) {
                A[2] = 0.4f;
                return AnonymousClass1lz.m12957B(A);
            }
        }
        return -16777216;
    }

    /* renamed from: C */
    private void m18219C() {
        Bitmap emojiBitmap;
        switch (this.f37022Q.ordinal()) {
            case 1:
                emojiBitmap = getEmojiBitmap();
                break;
            case 2:
                Resources resources = getResources();
                int i = this.f37026U;
                int i2 = this.f37025T;
                Rect rect = new Rect();
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeResource(resources, i, options);
                rect.right = options.outWidth;
                rect.bottom = options.outHeight;
                int min = Math.min(Math.max(rect.width() / i2, rect.height() / i2), Math.max(rect.width() / i2, rect.height() / i2));
                options = new Options();
                options.inSampleSize = Math.max(min, 1);
                options.inPreferredConfig = Config.ARGB_8888;
                emojiBitmap = AnonymousClass0rm.Q(BitmapFactory.decodeResource(resources, i, options), i2, i2);
                break;
            case 3:
                emojiBitmap = getSelfieWithStickerBitmap();
                break;
            default:
                emojiBitmap = null;
                break;
        }
        if (emojiBitmap != null && !emojiBitmap.isRecycled()) {
            m18220D(emojiBitmap, this.f37018M, 4);
            int i3 = this.f37027V;
            if (i3 % 4 > 0) {
                m18220D(emojiBitmap, this.f37021P, i3 % 4);
            }
        }
    }

    /* renamed from: D */
    private void m18220D(Bitmap bitmap, Bitmap bitmap2, int i) {
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            bitmap2.eraseColor(0);
            Canvas canvas = new Canvas(bitmap2);
            float width = (((float) (this.f37028W - bitmap.getWidth())) / 2.0f) + ((float) this.f37012G);
            float height = (((float) (this.f37028W - bitmap.getHeight())) / 2.0f) + ((float) this.f37012G);
            float width2 = ((float) bitmap.getWidth()) / 2.0f;
            float height2 = ((float) bitmap.getHeight()) / 2.0f;
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < 4; i3++) {
                    if (i2 % 2 == i3 % 2) {
                        canvas.save();
                        int i4 = this.f37028W;
                        canvas.translate(((float) (i3 * i4)) + width, ((float) (i4 * i2)) + height);
                        this.f37009D.reset();
                        this.f37009D.setRotate(f37006Z[i2][i3], width2, height2);
                        canvas.drawBitmap(bitmap, this.f37009D, this.f37010E);
                        canvas.restore();
                    }
                }
            }
        }
    }

    /* renamed from: E */
    private void m18221E() {
        this.f37015J.setAntiAlias(true);
        this.f37015J.setDither(true);
        this.f37015J.setFilterBitmap(true);
        this.f37010E.setAntiAlias(true);
        this.f37010E.setDither(true);
        this.f37010E.setFilterBitmap(true);
        this.f37016K = (float) getResources().getDimensionPixelSize(C0164R.dimen.emoji_text_size);
    }

    /* renamed from: F */
    private void m18222F() {
        if (this.f37030Y > 0 && this.f37019N > 0) {
            m18219C();
            invalidate();
        }
    }

    public Integer getDominantColor() {
        return this.f37008C;
    }

    private Bitmap getEmojiBitmap() {
        Bitmap bitmap = this.f37014I;
        int i = this.f37028W;
        this.f37014I = AnonymousClass0rm.O(bitmap, i, i);
        Canvas canvas = new Canvas(this.f37014I);
        this.f37015J.setTextSize(this.f37016K);
        float measureText = this.f37015J.measureText(this.f37017L);
        if (measureText > 0.0f) {
            this.f37015J.setTextSize((((float) this.f37028W) * this.f37016K) / measureText);
        }
        Layout staticLayout = new StaticLayout(this.f37017L, this.f37015J, this.f37030Y, Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        canvas.save();
        canvas.translate((float) (-AnonymousClass2Jb.m15014B(staticLayout)), 0.0f);
        staticLayout.draw(canvas);
        canvas.restore();
        AnonymousClass2fg anonymousClass2fg = new AnonymousClass2fg(this.f37014I);
        AnonymousClass2fi anonymousClass3x0 = new AnonymousClass3x0(this);
        if (anonymousClass3x0 != null) {
            new AnonymousClass2ff(anonymousClass2fg, anonymousClass3x0).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Bitmap[]{anonymousClass2fg.f32244B});
            return this.f37014I;
        }
        throw new IllegalArgumentException("listener can not be null");
    }

    private Bitmap getSelfieWithStickerBitmap() {
        Bitmap bitmap = this.f37024S;
        if (bitmap != null && (bitmap.getWidth() > this.f37025T || this.f37024S.getHeight() > this.f37025T)) {
            Bitmap bitmap2 = this.f37024S;
            int i = this.f37025T;
            this.f37024S = AnonymousClass0rm.Q(bitmap2, i, i);
        }
        return this.f37024S;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.clipRect(0, this.f37029X, this.f37030Y, this.f37019N - this.f37011F);
        Bitmap bitmap = this.f37018M;
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap = this.f37021P;
            Object obj = (bitmap == null || bitmap.isRecycled()) ? null : 1;
            int i = 0;
            while (i < this.f37023R) {
                for (int i2 = 0; i2 < this.f37013H; i2++) {
                    canvas.save();
                    canvas.translate((((float) (this.f37018M.getWidth() * i2)) - this.f37020O) - ((float) (((i2 * 2) + 1) * this.f37012G)), (float) (((this.f37018M.getHeight() * i) + this.f37029X) - ((i * 2) * this.f37012G)));
                    Bitmap bitmap2 = (i != this.f37023R - 1 || obj == null) ? this.f37018M : this.f37021P;
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, null);
                    canvas.restore();
                }
                i++;
            }
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, 1477078933);
        super.onSizeChanged(i, i2, i3, i4);
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            View view = (View) parent;
            View findViewById = view.findViewById(C0164R.id.top_bar);
            if (findViewById != null) {
                this.f37029X = findViewById.getMeasuredHeight();
            }
            findViewById = view.findViewById(C0164R.id.bottom_bar);
            if (findViewById != null) {
                this.f37011F = findViewById.getMeasuredHeight();
            }
            if (this.f37029X > 0 && this.f37011F > 0) {
                break;
            }
        }
        this.f37030Y = i;
        this.f37019N = i2;
        i2 = (i2 - this.f37029X) - this.f37011F;
        float f = (float) i;
        this.f37027V = (int) Math.ceil((double) (((float) i2) / (0.2f * f)));
        double d = (double) i2;
        double d2 = (double) this.f37027V;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d2);
        d2 = (d2 + sqrt) - 1.0d;
        Double.isNaN(d);
        int i5 = (int) (d / d2);
        this.f37028W = i5;
        d = (double) i5;
        d2 = Math.sqrt(2.0d) - 1.0d;
        Double.isNaN(d);
        this.f37012G = (int) ((d * d2) / 2.0d);
        int i6 = this.f37028W;
        this.f37025T = (int) (((float) i6) * 0.75f);
        this.f37020O = Math.max(((((float) Math.ceil((double) (f / ((float) i6)))) * ((float) this.f37028W)) - f) / 2.0f, 0.0f);
        int ceil = (int) Math.ceil((double) ((this.f37028W * 4) + (this.f37012G * 2)));
        this.f37023R = (int) Math.ceil((double) (((float) this.f37027V) / 4.0f));
        this.f37013H = (int) Math.ceil((double) (f / (((float) this.f37028W) * 4.0f)));
        this.f37018M = AnonymousClass0rm.O(this.f37018M, ceil, ceil);
        int i7 = this.f37027V;
        if (i7 % 4 > 0) {
            this.f37021P = AnonymousClass0rm.O(this.f37021P, ceil, ((i7 % 4) * this.f37028W) + (this.f37012G * 2));
        } else {
            Bitmap bitmap = this.f37021P;
            if (!(bitmap == null || bitmap.isRecycled())) {
                this.f37021P.recycle();
            }
            this.f37021P = null;
        }
        m18219C();
        AnonymousClass0cQ.O(this, 939819688, N);
    }

    public void setColorUpdateCallback(NametagBackgroundController nametagBackgroundController) {
        this.f37007B = nametagBackgroundController;
    }

    public void setEmoji(String str) {
        this.f37017L = str;
        this.f37008C = null;
        this.f37022Q = AnonymousClass31G.EMOJI;
        m18222F();
    }

    public void setSelfieWithSticker(Bitmap bitmap) {
        if (this.f37028W > 0) {
            int i = this.f37025T;
            this.f37024S = AnonymousClass0rm.Q(bitmap, i, i);
        } else {
            this.f37024S = bitmap;
        }
        this.f37022Q = AnonymousClass31G.SELFIE_WITH_STICKER;
        m18222F();
    }

    public void setSticker(int i) {
        this.f37026U = i;
        this.f37022Q = AnonymousClass31G.STICKER;
        m18222F();
    }
}
