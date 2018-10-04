package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: X.1Mj */
public final class AnonymousClass1Mj extends AnonymousClass0rv {
    /* renamed from: B */
    public int f17722B;
    /* renamed from: C */
    private final int f17723C;
    /* renamed from: D */
    private final int f17724D;
    /* renamed from: E */
    private final int f17725E;
    /* renamed from: F */
    private final int f17726F;
    /* renamed from: G */
    private final int f17727G;
    /* renamed from: H */
    private final int f17728H;
    /* renamed from: I */
    private final boolean f17729I;
    /* renamed from: J */
    private final Paint f17730J;

    public AnonymousClass1Mj(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.f17728H = i;
        this.f17723C = i2;
        this.f17727G = i3;
        this.f17725E = i4;
        this.f17726F = i5;
        this.f17724D = i6;
        Paint paint = new Paint();
        this.f17730J = paint;
        paint.setColor(i7);
        this.f17729I = z;
        this.f17722B = -1;
    }

    public AnonymousClass1Mj(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this(i, i, i2, i3, i4, i5, i6, z);
    }

    /* renamed from: A */
    public final void mo1900A(Rect rect, View view, RecyclerView recyclerView, AnonymousClass0or anonymousClass0or) {
        int i;
        int i2;
        int i3 = 0;
        rect.top = 0;
        rect.bottom = 0;
        int J = RecyclerView.m6933J(view);
        if (J == 0) {
            i = this.f17728H;
        } else {
            i2 = this.f17722B;
            if (i2 == -1 || J != i2 + 1) {
                i = this.f17723C;
            } else {
                i = this.f17723C + this.f17725E;
            }
        }
        if (J == recyclerView.getAdapter().mo1813B() - 1) {
            i3 = this.f17728H;
        } else {
            i2 = this.f17722B;
            if (i2 != -1 && J == i2) {
                i3 = (this.f17723C + this.f17725E) + this.f17727G;
            }
        }
        rect.left = this.f17729I ? i3 : i;
        if (this.f17729I) {
            i3 = i;
        }
        rect.right = i3;
    }

    /* renamed from: B */
    public final void mo2022B(Canvas canvas, RecyclerView recyclerView, AnonymousClass0or anonymousClass0or) {
        if (this.f17722B != -1) {
            for (int i = 0; i < recyclerView.getChildCount(); i++) {
                View childAt = recyclerView.getChildAt(i);
                if (RecyclerView.m6933J(childAt) == this.f17722B) {
                    int left;
                    int i2;
                    if (this.f17729I) {
                        left = (childAt.getLeft() - this.f17723C) - this.f17725E;
                        i2 = left - this.f17727G;
                    } else {
                        i2 = this.f17725E + (childAt.getRight() + this.f17723C);
                        left = this.f17727G + i2;
                    }
                    Canvas canvas2 = canvas;
                    canvas2.drawRect((float) i2, (float) Math.max(childAt.getTop(), childAt.getTop() + this.f17726F), (float) left, (float) Math.min(childAt.getBottom(), childAt.getBottom() - this.f17724D), this.f17730J);
                    return;
                }
            }
        }
    }
}
