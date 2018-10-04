package com.instagram.feed.sponsored.adctabutton;

import X.AnonymousClass0Ca;
import X.AnonymousClass0cQ;
import X.AnonymousClass1Qu;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.C0164R;

public class AdCTAButton extends View {
    /* renamed from: B */
    public final AnonymousClass1Qu f12528B;
    /* renamed from: C */
    public final AnonymousClass1Qu f12529C;
    /* renamed from: D */
    public ValueAnimator f12530D;
    /* renamed from: E */
    public int f12531E;
    /* renamed from: F */
    public int f12532F;
    /* renamed from: G */
    public int f12533G;
    /* renamed from: H */
    public final AnonymousClass1Qu f12534H;
    /* renamed from: I */
    private final int f12535I;
    /* renamed from: J */
    private final Paint f12536J;
    /* renamed from: K */
    private RectF f12537K;
    /* renamed from: L */
    private final int f12538L;
    /* renamed from: M */
    private String f12539M;
    /* renamed from: N */
    private final Paint f12540N;
    /* renamed from: O */
    private final Rect f12541O;

    public AdCTAButton(Context context) {
        this(context, null);
    }

    public AdCTAButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdCTAButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12536J = new Paint();
        this.f12540N = new Paint();
        this.f12541O = new Rect();
        Resources resources = getResources();
        this.f12535I = resources.getDimensionPixelSize(C0164R.dimen.button_corner_radius_redesign);
        this.f12538L = resources.getDimensionPixelSize(C0164R.dimen.button_border_stroke);
        this.f12539M = resources.getString(C0164R.string.default_link_text);
        this.f12534H = new AnonymousClass1Qu(AnonymousClass0Ca.m937C(getContext(), C0164R.color.grey_9), -1);
        this.f12528B = new AnonymousClass1Qu(-1, AnonymousClass0Ca.m937C(getContext(), C0164R.color.blue_5));
        this.f12529C = new AnonymousClass1Qu(AnonymousClass0Ca.m937C(getContext(), C0164R.color.grey_2), AnonymousClass0Ca.m937C(getContext(), C0164R.color.blue_5));
        this.f12536J.setAntiAlias(true);
        this.f12540N.setTextAlign(Align.LEFT);
        this.f12540N.setTextSize((float) getResources().getDimensionPixelSize(C0164R.dimen.font_medium));
        this.f12540N.setFakeBoldText(true);
        this.f12540N.setAntiAlias(true);
        this.f12533G = this.f12534H.f18491C;
        this.f12531E = this.f12528B.f18491C;
        this.f12532F = this.f12529C.f18491C;
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.m5864N(this, 508185529);
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f12530D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        AnonymousClass0cQ.m5865O(this, 313894331, N);
    }

    public final void onDraw(Canvas canvas) {
        int i;
        setAlpha(isPressed() ? 0.8f : 1.0f);
        if (this.f12537K == null) {
            i = this.f12538L;
            this.f12537K = new RectF((float) i, (float) i, (float) (getWidth() - this.f12538L), (float) (getHeight() - this.f12538L));
        }
        this.f12536J.setStyle(Style.FILL);
        this.f12536J.setColor(this.f12531E);
        RectF rectF = this.f12537K;
        i = this.f12535I;
        canvas.drawRoundRect(rectF, (float) i, (float) i, this.f12536J);
        this.f12536J.setStyle(Style.STROKE);
        this.f12536J.setStrokeWidth((float) this.f12538L);
        this.f12536J.setColor(this.f12532F);
        rectF = this.f12537K;
        i = this.f12535I;
        canvas.drawRoundRect(rectF, (float) i, (float) i, this.f12536J);
        Paint paint = this.f12540N;
        String str = this.f12539M;
        paint.getTextBounds(str, 0, str.length(), this.f12541O);
        this.f12540N.setColor(this.f12533G);
        canvas.drawText(this.f12539M, ((((float) (getWidth() - this.f12538L)) / 2.0f) - (((float) this.f12541O.width()) / 2.0f)) - ((float) this.f12541O.left), ((((float) (getHeight() - this.f12538L)) / 2.0f) + (((float) this.f12541O.height()) / 2.0f)) - ((float) this.f12541O.bottom), this.f12540N);
    }

    public void setPressed(boolean z) {
        super.setPressed(z);
        invalidate();
    }

    public void setText(String str) {
        this.f12539M = str;
        invalidate();
    }
}
