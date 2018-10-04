package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.facebook.C0164R;

/* renamed from: X.10d */
public final class AnonymousClass10d extends AnonymousClass0rv {
    /* renamed from: B */
    private final int f13289B;
    /* renamed from: C */
    private final int f13290C;
    /* renamed from: D */
    private final int f13291D;
    /* renamed from: E */
    private final int f13292E;
    /* renamed from: F */
    private final Paint f13293F;
    /* renamed from: G */
    private final int f13294G;

    public AnonymousClass10d(Context context, int i, int i2, int i3) {
        this.f13290C = context.getResources().getDimensionPixelSize(C0164R.dimen.tray_item_vertical_divider_width);
        this.f13289B = i;
        this.f13291D = i2;
        this.f13294G = i3;
        this.f13292E = context.getResources().getDimensionPixelSize(C0164R.dimen.tray_item_padding);
        Paint paint = new Paint();
        this.f13293F = paint;
        paint.setColor(AnonymousClass0Ca.m937C(context, C0164R.color.grey_3));
    }

    /* renamed from: A */
    public final void mo1900A(Rect rect, View view, RecyclerView recyclerView, AnonymousClass0or anonymousClass0or) {
        if (AnonymousClass10d.m8720B(RecyclerView.m6933J(view), recyclerView)) {
            rect.left = (this.f13292E * 2) + this.f13290C;
        }
    }

    /* renamed from: B */
    public final void mo2022B(Canvas canvas, RecyclerView recyclerView, AnonymousClass0or anonymousClass0or) {
        AnonymousClass0rr anonymousClass0rr = (AnonymousClass0rr) recyclerView.getLayoutManager();
        for (int aA = anonymousClass0rr.aA(); aA <= anonymousClass0rr.cA(); aA++) {
            if (AnonymousClass10d.m8720B(aA, recyclerView)) {
                View view = recyclerView.m6980c(aA).f10370B;
                AnonymousClass12d anonymousClass12d = (AnonymousClass12d) view.getLayoutParams();
                int top = (view.getTop() + this.f13294G) + (this.f13291D / 2);
                int i = this.f13289B;
                int i2 = top - (i / 2);
                top += i / 2;
                i = (view.getLeft() - anonymousClass12d.leftMargin) - this.f13292E;
                canvas.drawRect((float) (i - this.f13290C), (float) i2, (float) i, (float) top, this.f13293F);
            }
        }
    }

    /* renamed from: B */
    private static boolean m8720B(int i, RecyclerView recyclerView) {
        if (recyclerView.getAdapter() instanceof AnonymousClass0ot) {
            boolean z = true;
            if (i >= 1) {
                int E = recyclerView.m6980c(i).m7713E();
                if (E != -1) {
                    AnonymousClass0ot anonymousClass0ot = (AnonymousClass0ot) recyclerView.getAdapter();
                    AnonymousClass0ov anonymousClass0ov = (AnonymousClass0ov) anonymousClass0ot.f10428J.get(E);
                    AnonymousClass0ov anonymousClass0ov2 = (AnonymousClass0ov) anonymousClass0ot.f10428J.get(E - 1);
                    Object obj = (!anonymousClass0ov.f10440D.f3378K || anonymousClass0ov2.f10440D.f3378K) ? null : 1;
                    Object obj2 = (anonymousClass0ov.m7761K() && anonymousClass0ov2.f10440D.f3378K) ? 1 : null;
                    if (obj == null) {
                        if (obj2 == null) {
                            z = false;
                        }
                    }
                    return z;
                }
            }
        }
        return false;
    }
}
