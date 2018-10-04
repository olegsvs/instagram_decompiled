package com.instagram.ui.widget.nametag;

import X.AnonymousClass0Ci;
import X.AnonymousClass0Lu;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eS;
import X.AnonymousClass0rm;
import X.AnonymousClass31B;
import X.AnonymousClass3jh;
import X.AnonymousClass3ji;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.facebook.C0164R;

public class NametagCardView extends View {
    /* renamed from: M */
    public static final int[][] f43797M = new int[][]{new int[]{-6092870, -3790966, -160462}, new int[]{-3078039, -160462}, new int[]{-6092870, -14170891}, new int[]{-15502644, -11216897}, new int[]{-14170891, -9387952}};
    /* renamed from: B */
    public float f43798B;
    /* renamed from: C */
    private float f43799C;
    /* renamed from: D */
    private ColorFilter f43800D;
    /* renamed from: E */
    private Bitmap f43801E;
    /* renamed from: F */
    private final RectF f43802F = new RectF();
    /* renamed from: G */
    private int f43803G;
    /* renamed from: H */
    private boolean f43804H;
    /* renamed from: I */
    private final Paint f43805I = new Paint();
    /* renamed from: J */
    private Drawable f43806J;
    /* renamed from: K */
    private int f43807K;
    /* renamed from: L */
    private UsernameTextView f43808L;

    public NametagCardView(Context context) {
        super(context);
        m20528C(null, 0);
    }

    public NametagCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m20528C(attributeSet, 0);
    }

    public NametagCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m20528C(attributeSet, i);
    }

    /* renamed from: B */
    public static void m20527B(NametagCardView nametagCardView) {
        Paint paint;
        nametagCardView.f43801E = AnonymousClass0rm.O(nametagCardView.f43801E, (int) nametagCardView.f43802F.width(), (int) nametagCardView.f43802F.height());
        Canvas canvas = new Canvas(nametagCardView.f43801E);
        nametagCardView.f43806J.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        if (nametagCardView.f43804H) {
            nametagCardView.f43805I.setShader(new LinearGradient(nametagCardView.f43802F.width(), 0.0f, 0.0f, nametagCardView.f43802F.height(), nametagCardView.f43807K, nametagCardView.f43803G, TileMode.CLAMP));
            nametagCardView.f43805I.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
            paint = null;
        } else {
            paint = new Paint();
            paint.setColorFilter(nametagCardView.f43800D);
            nametagCardView.f43806J.mutate().setColorFilter(nametagCardView.f43800D);
        }
        nametagCardView.f43806J.draw(canvas);
        nametagCardView.f43808L.setDrawingCacheEnabled(true);
        nametagCardView.f43808L.buildDrawingCache();
        canvas.drawBitmap(nametagCardView.f43808L.getDrawingCache(), (nametagCardView.f43802F.width() - ((float) nametagCardView.f43808L.getMeasuredWidth())) / 2.0f, (nametagCardView.f43802F.height() - ((float) nametagCardView.f43808L.getMeasuredHeight())) / 2.0f, paint);
        nametagCardView.f43808L.destroyDrawingCache();
        nametagCardView.f43808L.setDrawingCacheEnabled(false);
        if (nametagCardView.f43804H) {
            canvas.drawRect(new RectF(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight()), nametagCardView.f43805I);
        }
    }

    /* renamed from: C */
    private void m20528C(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0eS.NametagCardView, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, C0164R.dimen.username_font_size);
        obtainStyledAttributes.recycle();
        this.f43806J = new AnonymousClass3ji();
        UsernameTextView usernameTextView = new UsernameTextView(getContext());
        this.f43808L = usernameTextView;
        usernameTextView.setLayoutParams(new LayoutParams(-2, -2));
        this.f43808L.setTextSize(0, (float) getContext().getResources().getDimensionPixelSize(resourceId));
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.f43801E;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.f43798B * 0.085f, this.f43799C * 0.085f, null);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, -1687045333);
        super.onSizeChanged(i, i2, i3, i4);
        float f = (float) i;
        this.f43798B = f;
        float f2 = (float) i2;
        this.f43799C = f2;
        this.f43802F.set(f * 0.085f, 0.085f * f2, f * 0.915f, 0.915f * f2);
        this.f43808L.m20532A((int) (0.138f * f), (int) (0.057f * f2));
        this.f43808L.m20533B((f2 * 0.038f) - this.f43808L.getPaint().getFontMetrics().ascent, (int) (f * 0.8f));
        m20527B(this);
        AnonymousClass0cQ.O(this, -1271930356, N);
    }

    public void setGradientTintColors(int i) {
        if (i >= f43797M.length) {
            i = 0;
        }
        this.f43804H = true;
        int[][] iArr = f43797M;
        this.f43807K = iArr[i][0];
        this.f43803G = iArr[i][1];
        if (this.f43798B > 0.0f) {
            m20527B(this);
            invalidate();
        }
    }

    public void setName(String str, String str2) {
        this.f43808L.setName(str, str2);
    }

    public void setTintColor(int i) {
        if (i == 0) {
            i = -16777216;
        }
        this.f43804H = false;
        this.f43800D = new PorterDuffColorFilter(i, Mode.SRC_IN);
        if (this.f43798B > 0.0f) {
            m20527B(this);
            invalidate();
        }
    }

    public void setUser(AnonymousClass0Ci anonymousClass0Ci) {
        int i;
        int i2;
        setName(anonymousClass0Ci.uT(), anonymousClass0Ci.f1757z);
        AnonymousClass31B anonymousClass31B = AnonymousClass31B.COLOR;
        AnonymousClass0Lu anonymousClass0Lu = anonymousClass0Ci.iB;
        if (anonymousClass0Lu != null) {
            anonymousClass31B = AnonymousClass31B.m18212B(anonymousClass0Lu.f3306E);
            i = anonymousClass0Lu.f3305D;
            i2 = anonymousClass0Lu.f3304C;
        } else {
            i = 0;
            i2 = -16777216;
        }
        switch (AnonymousClass3jh.f43796B[anonymousClass31B.ordinal()]) {
            case 1:
                setGradientTintColors(i);
                return;
            case 2:
                setTintColor(i2);
                return;
            case 3:
                setTintColor(-16777216);
                return;
            default:
                return;
        }
    }
}
