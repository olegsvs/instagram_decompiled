package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: X.4av */
public final class AnonymousClass4av extends AnonymousClass0rv {
    /* renamed from: B */
    private final int f55560B;
    /* renamed from: C */
    private final int f55561C;
    /* renamed from: D */
    private final Paint f55562D;

    public AnonymousClass4av(Context context, int i, int i2, int i3) {
        Paint paint = new Paint();
        this.f55562D = paint;
        paint.setColor(i);
        this.f55562D.setStrokeWidth((float) i2);
        this.f55560B = i2;
        this.f55561C = i3;
    }

    /* renamed from: A */
    public final void m24544A(Rect rect, View view, RecyclerView recyclerView, AnonymousClass0or anonymousClass0or) {
        super.A(rect, view, recyclerView, anonymousClass0or);
        rect.set(0, 0, 0, this.f55560B);
    }

    /* renamed from: B */
    public final void m24545B(Canvas canvas, RecyclerView recyclerView, AnonymousClass0or anonymousClass0or) {
        Canvas canvas2 = canvas;
        super.B(canvas, recyclerView, anonymousClass0or);
        int paddingLeft = recyclerView.getPaddingLeft() + this.f55561C;
        int width = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - this.f55561C;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            float bottom = (float) (childAt.getBottom() + ((AnonymousClass12d) childAt.getLayoutParams()).bottomMargin);
            canvas2.drawLine((float) paddingLeft, bottom, (float) width, bottom, this.f55562D);
        }
    }
}
