package com.instagram.nux.ui;

import X.AnonymousClass0cQ;
import X.AnonymousClass3Y4;
import X.AnonymousClass3Y5;
import X.AnonymousClass3Y6;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;

public class ContextualNuxHighlightView extends View {
    /* renamed from: B */
    public AnonymousClass3Y6 f42155B;
    /* renamed from: C */
    public View f42156C;
    /* renamed from: D */
    private int f42157D;
    /* renamed from: E */
    private int f42158E;
    /* renamed from: F */
    private final int[] f42159F;
    /* renamed from: G */
    private OnLayoutChangeListener f42160G;
    /* renamed from: H */
    private Paint f42161H;
    /* renamed from: I */
    private float f42162I;
    /* renamed from: J */
    private final int[] f42163J;
    /* renamed from: K */
    private boolean f42164K;
    /* renamed from: L */
    private final Rect f42165L;

    public ContextualNuxHighlightView(Context context) {
        super(context);
        this.f42159F = new int[2];
        this.f42163J = new int[2];
        this.f42165L = new Rect();
        m19926C();
    }

    public ContextualNuxHighlightView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42159F = new int[2];
        this.f42163J = new int[2];
        this.f42165L = new Rect();
        m19926C();
    }

    public ContextualNuxHighlightView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42159F = new int[2];
        this.f42163J = new int[2];
        this.f42165L = new Rect();
        m19926C();
    }

    public ContextualNuxHighlightView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f42159F = new int[2];
        this.f42163J = new int[2];
        this.f42165L = new Rect();
        m19926C();
    }

    /* renamed from: B */
    public static void m19925B(ContextualNuxHighlightView contextualNuxHighlightView, View view, int i, int i2) {
        view.getLocationInWindow(contextualNuxHighlightView.f42159F);
        int i3 = i / 2;
        int[] iArr = contextualNuxHighlightView.f42159F;
        contextualNuxHighlightView.f42157D = i3 + iArr[0];
        contextualNuxHighlightView.f42158E = (i2 / 2) + iArr[1];
        contextualNuxHighlightView.f42162I = (float) (Math.max(i, i2) / 2);
        i2 = contextualNuxHighlightView.f42165L;
        i3 = contextualNuxHighlightView.f42157D;
        float f = (float) i3;
        i = contextualNuxHighlightView.f42162I;
        view = (int) (f - i);
        contextualNuxHighlightView = contextualNuxHighlightView.f42158E;
        i2.set(view, (int) (((float) contextualNuxHighlightView) - i), (int) (((float) i3) + i), (int) (((float) contextualNuxHighlightView) + i));
    }

    /* renamed from: C */
    private void m19926C() {
        setLayerType(2, null);
        Paint paint = new Paint();
        this.f42161H = paint;
        paint.setColor(0);
        this.f42161H.setAlpha(0);
        this.f42161H.setAntiAlias(true);
        this.f42161H.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        super.setOnClickListener(new AnonymousClass3Y4(this));
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getLocationInWindow(this.f42163J);
        int i = this.f42157D;
        int[] iArr = this.f42163J;
        canvas.drawCircle((float) (i - iArr[0]), (float) (this.f42158E - iArr[1]), this.f42162I, this.f42161H);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int M = AnonymousClass0cQ.M(this, 272517563);
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (motionEvent.getActionMasked() == 0) {
            this.f42164K = this.f42165L.contains(x, y);
        } else {
            z = true;
            if (motionEvent.getAction() == 1) {
                if (!this.f42164K || !this.f42165L.contains(x, y)) {
                    z = false;
                }
                this.f42164K = z;
            }
        }
        z = super.onTouchEvent(motionEvent);
        AnonymousClass0cQ.L(this, -379273714, M);
        return z;
    }

    public final boolean performClick() {
        if (!this.f42164K || !super.performClick()) {
            return false;
        }
        AnonymousClass3Y6 anonymousClass3Y6 = this.f42155B;
        if (anonymousClass3Y6 != null) {
            anonymousClass3Y6.onHighlightClick(this.f42156C);
        }
        return true;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        throw new RuntimeException("Please use OnHighlightClickListener");
    }

    public void setOnHighlightClickListener(AnonymousClass3Y6 anonymousClass3Y6) {
        this.f42155B = anonymousClass3Y6;
    }

    public void setViewToHighlight(View view) {
        View view2 = this.f42156C;
        if (view2 != null) {
            view2.removeOnLayoutChangeListener(this.f42160G);
        }
        m19925B(this, view, view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f42160G = new AnonymousClass3Y5(this);
        this.f42156C = view;
        view.addOnLayoutChangeListener(this.f42160G);
        postInvalidate();
    }
}
