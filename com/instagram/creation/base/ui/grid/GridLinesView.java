package com.instagram.creation.base.ui.grid;

import X.AnonymousClass0cQ;
import X.AnonymousClass0eS;
import X.AnonymousClass3DD;
import X.AnonymousClass3zL;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class GridLinesView extends View {
    /* renamed from: B */
    private final Rect f39176B;
    /* renamed from: C */
    private int f39177C;
    /* renamed from: D */
    private final AnonymousClass3DD f39178D;
    /* renamed from: E */
    private AnonymousClass3zL f39179E;
    /* renamed from: F */
    private final int f39180F;

    public GridLinesView(Context context) {
        this(context, null);
    }

    public GridLinesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GridLinesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39177C = 3;
        this.f39180F = ((double) getResources().getDisplayMetrics().density) >= 1.5d ? 2 : 1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0eS.GridLinesView);
            this.f39177C = obtainStyledAttributes.getInteger(0, this.f39177C);
            obtainStyledAttributes.recycle();
        }
        this.f39176B = new Rect();
        this.f39178D = new AnonymousClass3DD(this.f39177C, (float) this.f39180F);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f39178D.m19048A(canvas);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, -1527950090);
        super.onSizeChanged(i, i2, i3, i4);
        this.f39176B.set(0, 0, i, i2);
        this.f39178D.m19050C(this.f39176B);
        AnonymousClass3zL anonymousClass3zL = this.f39179E;
        if (anonymousClass3zL != null) {
            anonymousClass3zL.m21879A(this, i, i2);
        }
        AnonymousClass0cQ.O(this, 1069032219, N);
    }

    public void setGridlinesRect(Rect rect) {
        this.f39178D.m19050C(rect);
    }

    public void setSizeChangedListener(AnonymousClass3zL anonymousClass3zL) {
        this.f39179E = anonymousClass3zL;
    }
}
