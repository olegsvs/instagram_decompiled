package X;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: X.65m */
public final class AnonymousClass65m extends AnonymousClass0rv {
    /* renamed from: B */
    public final int f71656B;
    /* renamed from: C */
    private final int f71657C;

    public AnonymousClass65m(int i, int i2) {
        this.f71656B = i;
        this.f71657C = i2;
    }

    /* renamed from: A */
    public final void m28963A(Rect rect, View view, RecyclerView recyclerView, AnonymousClass0or anonymousClass0or) {
        int i;
        int i2;
        int i3;
        AnonymousClass0la layoutManager = recyclerView.getLayoutManager();
        int J = RecyclerView.J(view);
        int a = layoutManager.a();
        int i4 = this.f71656B;
        if (J % i4 == 0) {
            i = this.f71657C;
            i4 = i / 2;
        } else if (J % i4 == i4 - 1) {
            i4 = this.f71657C;
            i = i4 / 2;
        } else {
            i2 = this.f71657C;
            i = i2 / 2;
            i4 = i2 / 2;
        }
        if ((this.f71656B - J > 0 ? 1 : null) != null) {
            i3 = this.f71657C;
            i2 = i3 / 2;
        } else {
            i3 = this.f71656B;
            if ((J >= (a % i3 != 0 ? a - (a % i3) : a - i3) ? 1 : null) != null) {
                i2 = this.f71657C;
                i3 = i2 / 2;
            } else {
                i2 = this.f71657C;
                i3 = i2 / 2;
                i2 /= 2;
            }
        }
        rect.set(i, i3, i4, i2);
    }
}
