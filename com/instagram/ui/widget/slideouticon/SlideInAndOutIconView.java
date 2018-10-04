package com.instagram.ui.widget.slideouticon;

import X.AnonymousClass0Ca;
import X.AnonymousClass0cQ;
import X.AnonymousClass0e8;
import X.AnonymousClass0eS;
import X.AnonymousClass0vJ;
import X.AnonymousClass0vK;
import X.AnonymousClass0zg;
import X.AnonymousClass1Do;
import X.AnonymousClass3k9;
import X.AnonymousClass40Q;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.C0164R;

public class SlideInAndOutIconView extends RelativeLayout implements AnonymousClass0vJ {
    /* renamed from: B */
    public final TextView f12005B;
    /* renamed from: C */
    public AnonymousClass40Q f12006C;
    /* renamed from: D */
    private final RectF f12007D;
    /* renamed from: E */
    private final boolean f12008E;
    /* renamed from: F */
    private final ImageView f12009F;
    /* renamed from: G */
    private float f12010G;
    /* renamed from: H */
    private final Paint f12011H;
    /* renamed from: I */
    private final Paint f12012I;
    /* renamed from: J */
    private AnonymousClass1Do f12013J;
    /* renamed from: K */
    private AnonymousClass0vK f12014K;
    /* renamed from: L */
    private String f12015L;

    public final void Tl() {
    }

    public final void Ul() {
    }

    public final void Xl() {
    }

    public SlideInAndOutIconView(Context context) {
        this(context, null);
    }

    public SlideInAndOutIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlideInAndOutIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12012I = new Paint(1);
        this.f12011H = new Paint(1);
        this.f12007D = new RectF();
        this.f12013J = AnonymousClass1Do.LEFT;
        this.f12014K = AnonymousClass0vK.SLIDE_OUT;
        Resources resources = getResources();
        int C = AnonymousClass0Ca.m937C(getContext(), C0164R.color.default_slideout_icon_text_color);
        int C2 = AnonymousClass0Ca.m937C(getContext(), C0164R.color.default_slideout_icon_background);
        int C3 = AnonymousClass0Ca.m937C(getContext(), C0164R.color.default_slideout_icon_background_border);
        float dimension = resources.getDimension(C0164R.dimen.default_slideout_icon_text_size);
        LayoutInflater.from(context).inflate(C0164R.layout.slideout_icon, this);
        this.f12009F = (ImageView) findViewById(C0164R.id.slideout_iconview_icon);
        this.f12005B = (TextView) findViewById(C0164R.id.slideout_iconview_text);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0eS.SlideInAndOutIconView);
        setText(obtainStyledAttributes.getString(4));
        setTextSize(obtainStyledAttributes.getDimension(8, dimension));
        this.f12005B.setTextColor(obtainStyledAttributes.getColor(5, C));
        this.f12005B.setPivotX(0.0f);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(7, 0);
        boolean D = AnonymousClass0e8.m6200D(getContext());
        TextView textView = this.f12005B;
        int i2 = D ? dimensionPixelSize2 : dimensionPixelSize;
        if (!D) {
            dimensionPixelSize = dimensionPixelSize2;
        }
        textView.setPadding(i2, 0, dimensionPixelSize, 0);
        setIcon(obtainStyledAttributes.getDrawable(3));
        this.f12012I.setStyle(Style.FILL);
        this.f12012I.setColor(obtainStyledAttributes.getColor(0, C2));
        this.f12008E = obtainStyledAttributes.getBoolean(2, false);
        this.f12011H.setStyle(Style.STROKE);
        this.f12011H.setColor(obtainStyledAttributes.getColor(1, C3));
        this.f12011H.setStrokeWidth(1.0f);
        this.f12011H.setAntiAlias(true);
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
    }

    /* renamed from: A */
    public final void m8309A() {
        setVisibility(8);
        setAlpha(1.0f);
        this.f12005B.setScaleX(1.0f);
        this.f12005B.setScaleY(1.0f);
        this.f12005B.setVisibility(8);
    }

    /* renamed from: B */
    public final void m8310B() {
        this.f12005B.setVisibility(8);
    }

    public final void IBA(AnonymousClass0zg anonymousClass0zg) {
        if (anonymousClass0zg != AnonymousClass0zg.STOPPED) {
            setVisibility(0);
            String str = this.f12015L;
            RectF rectF;
            if (str == null || str.isEmpty() || anonymousClass0zg != AnonymousClass0zg.FULLTEXT) {
                this.f12005B.setVisibility(8);
                rectF = this.f12007D;
                rectF.set(0.0f, 0.0f, rectF.height(), this.f12007D.height());
                return;
            }
            this.f12005B.setVisibility(0);
            rectF = this.f12007D;
            rectF.set(0.0f, 0.0f, rectF.height() + ((float) this.f12005B.getMeasuredWidth()), this.f12007D.height());
        }
    }

    public final void Vl(float f) {
        setAlpha(f);
    }

    public final void Wl() {
        m8309A();
    }

    public final void Yl(float f) {
        setAlpha(f);
    }

    public final void gAA(AnonymousClass0vK anonymousClass0vK) {
        if (anonymousClass0vK != AnonymousClass0vK.SLIDE_IN) {
            this.f12005B.setVisibility(8);
            this.f12009F.setTranslationX(0.0f);
        }
    }

    public AnonymousClass0vK getSlideEffect() {
        return this.f12014K;
    }

    public final void iAA(AnonymousClass0vK anonymousClass0vK) {
        if (anonymousClass0vK != AnonymousClass0vK.SLIDE_IN) {
            TextView textView = this.f12005B;
            textView.setPivotY((float) (textView.getMeasuredHeight() / 2));
            this.f12005B.setPivotX(this.f12013J == AnonymousClass1Do.LEFT ? 0.0f : (float) this.f12005B.getWidth());
            this.f12010G = this.f12007D.height() + ((float) this.f12005B.getWidth());
        }
    }

    public final void kAA(AnonymousClass0vK anonymousClass0vK, float f) {
        this.f12005B.setScaleX(f);
        this.f12005B.setScaleY(f);
        RectF rectF;
        switch (AnonymousClass3k9.f43906B[this.f12013J.ordinal()]) {
            case 1:
                rectF = this.f12007D;
                rectF.set(0.0f, 0.0f, rectF.height() + (((float) this.f12005B.getMeasuredWidth()) * f), this.f12007D.height());
                break;
            case 2:
                float height = (this.f12010G - this.f12007D.height()) - (((float) this.f12005B.getMeasuredWidth()) * f);
                this.f12009F.setTranslationX(height);
                rectF = this.f12007D;
                rectF.set(height, 0.0f, this.f12010G, rectF.height());
                break;
            default:
                break;
        }
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f12007D;
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f12007D.height() / 2.0f, this.f12012I);
        if (this.f12008E) {
            rectF = this.f12007D;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f12007D.height() / 2.0f, this.f12011H);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.m5864N(this, -1561329543);
        super.onSizeChanged(i, i2, i3, i4);
        float f = (float) i2;
        this.f12007D.set(0.0f, 0.0f, (float) i, f);
        if (this.f12014K == AnonymousClass0vK.SLIDE_IN) {
            this.f12007D.set(0.0f, 0.0f, f, f);
        }
        AnonymousClass0cQ.m5865O(this, 2017869721, N);
    }

    public void setIcon(Drawable drawable) {
        this.f12009F.setImageDrawable(drawable);
    }

    public void setPaintFill(int i) {
        this.f12012I.setColor(i);
        invalidate();
    }

    public void setSlideDirection(AnonymousClass1Do anonymousClass1Do) {
        this.f12013J = anonymousClass1Do;
    }

    public void setSlideEffect(AnonymousClass0vK anonymousClass0vK) {
        this.f12014K = anonymousClass0vK;
    }

    public void setText(String str) {
        this.f12015L = str;
        if (str == null || str.isEmpty()) {
            this.f12005B.setVisibility(8);
            return;
        }
        this.f12005B.setText(str);
        this.f12005B.setVisibility(0);
    }

    public void setTextSize(float f) {
        this.f12005B.setTextSize(0, f);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        AnonymousClass40Q anonymousClass40Q = this.f12006C;
        if (anonymousClass40Q != null && i == 0) {
            anonymousClass40Q.B(anonymousClass40Q.f48215D);
        }
    }
}
