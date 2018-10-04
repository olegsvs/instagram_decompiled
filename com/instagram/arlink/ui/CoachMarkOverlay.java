package com.instagram.arlink.ui;

import X.AnonymousClass0Ca;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.C0164R;

public class CoachMarkOverlay extends View {
    /* renamed from: B */
    public Bitmap f36973B;
    /* renamed from: C */
    public final Paint f36974C = new Paint();
    /* renamed from: D */
    public final RectF f36975D = new RectF();
    /* renamed from: E */
    private int f36976E;

    public CoachMarkOverlay(Context context) {
        super(context);
        m18214B();
    }

    public CoachMarkOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m18214B();
    }

    public CoachMarkOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m18214B();
    }

    /* renamed from: B */
    private void m18214B() {
        this.f36976E = AnonymousClass0Ca.C(getContext(), C0164R.color.black_60_transparent);
    }

    public final void onDraw(Canvas canvas) {
        canvas.drawColor(this.f36976E);
        Bitmap bitmap = this.f36973B;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.f36975D.left, this.f36975D.top, this.f36974C);
        }
        super.onDraw(canvas);
    }

    public void setSpotlightAlpha(int i) {
        this.f36974C.setAlpha(i);
        invalidate();
    }
}
