package com.instagram.ui.widget.fixedtabbar;

import X.AnonymousClass0mE;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

public class FixedTabBarIndicator extends View {
    /* renamed from: B */
    public boolean f29292B;
    /* renamed from: C */
    public final Paint f29293C = new Paint();
    /* renamed from: D */
    public int f29294D = -1;
    /* renamed from: E */
    public List f29295E;
    /* renamed from: F */
    private boolean f29296F = false;
    /* renamed from: G */
    private final Rect f29297G = new Rect();
    /* renamed from: H */
    private int f29298H;

    public FixedTabBarIndicator(Context context) {
        super(context);
    }

    public FixedTabBarIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FixedTabBarIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: A */
    public final void m15161A(int i, float f) {
        this.f29294D = i;
        this.f29297G.offsetTo((int) (((float) this.f29298H) * (((float) i) + f)), 0);
        AnonymousClass0mE.J(this);
    }

    public final void onDraw(Canvas canvas) {
        List list = this.f29295E;
        if (list != null && !list.isEmpty() && this.f29294D >= 0) {
            canvas.drawRect(this.f29297G, this.f29293C);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f29296F || z) {
            List list = this.f29295E;
            if (list != null && !list.isEmpty()) {
                this.f29296F = false;
                this.f29292B = true;
                View view = (View) getParent();
                this.f29298H = ((view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight()) / this.f29295E.size();
                this.f29297G.set(0, 0, this.f29298H, getHeight());
                int i5 = this.f29294D;
                if (i5 >= 0) {
                    m15161A(i5, 0.0f);
                }
            }
        }
    }

    public void setTabs(List list) {
        List list2 = this.f29295E;
        if (list2 == null || list2.size() != list.size()) {
            this.f29296F = true;
        }
        this.f29295E = list;
    }
}
