package com.instagram.ui.text;

import X.AnonymousClass0Ca;
import X.AnonymousClass0G5;
import X.AnonymousClass0cQ;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.facebook.C0164R;
import com.instagram.common.ui.text.TitleTextView;

public class TabTextView extends TitleTextView {
    /* renamed from: B */
    private int f28862B;
    /* renamed from: C */
    private final Paint f28863C = new Paint();
    /* renamed from: D */
    private final Rect f28864D = new Rect();

    public TabTextView(Context context) {
        super(context);
        m15024B();
    }

    public TabTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m15024B();
    }

    public TabTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m15024B();
    }

    /* renamed from: B */
    private void m15024B() {
        this.f28862B = getResources().getDimensionPixelSize(AnonymousClass0G5.F(getContext(), C0164R.attr.segmentedUnderlineWidth));
        this.f28863C.setColor(AnonymousClass0Ca.C(getContext(), AnonymousClass0G5.F(getContext(), C0164R.attr.textColorSelected)));
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.drawRect(this.f28864D, this.f28863C);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, 101637289);
        super.onSizeChanged(i, i2, i3, i4);
        this.f28864D.set(0, i2 - this.f28862B, i, i2);
        AnonymousClass0cQ.O(this, -690833775, N);
    }
}
