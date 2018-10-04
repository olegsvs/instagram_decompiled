package com.facebook.browser.lite.chrome.widgets.progressbar;

import X.AnonymousClass0Ca;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.facebook.C0164R;

public class BrowserLiteProgressBar extends ProgressBar {
    /* renamed from: B */
    private int f23291B;
    /* renamed from: C */
    private Paint f23292C;
    /* renamed from: D */
    private Rect f23293D;

    public BrowserLiteProgressBar(Context context) {
        super(context);
        m13416B();
    }

    public BrowserLiteProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m13416B();
    }

    public BrowserLiteProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m13416B();
    }

    /* renamed from: B */
    private void m13416B() {
        Paint paint = new Paint();
        this.f23292C = paint;
        paint.setStyle(Style.FILL);
        this.f23292C.setColor(AnonymousClass0Ca.C(getContext(), C0164R.color.browser_progress_bar_color));
        this.f23291B = getResources().getDimensionPixelSize(C0164R.dimen.browser_progress_overlay_height);
    }

    public final synchronized void onDraw(Canvas canvas) {
        canvas.drawRect(this.f23293D, this.f23292C);
        super.onDraw(canvas);
    }

    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f23293D == null) {
            this.f23293D = new Rect();
        }
        this.f23293D.set(0, 0, getMeasuredWidth(), this.f23291B);
    }

    public synchronized void setProgress(int i) {
        super.setProgress(i == 100 ? 0 : Math.max(i, 5));
    }
}
