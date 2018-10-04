package X;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: X.4RQ */
public final class AnonymousClass4RQ extends AnonymousClass0rv {
    /* renamed from: B */
    private final int f54091B;
    /* renamed from: C */
    private final int f54092C;
    /* renamed from: D */
    private final boolean f54093D;
    /* renamed from: E */
    private final int f54094E;

    public AnonymousClass4RQ(Context context, int i, int i2, int i3) {
        this.f54093D = AnonymousClass0e8.D(context);
        this.f54094E = i;
        this.f54092C = i + i3;
        this.f54091B = i2;
    }

    /* renamed from: A */
    public final void m24225A(Rect rect, View view, RecyclerView recyclerView, AnonymousClass0or anonymousClass0or) {
        int J = RecyclerView.J(view);
        rect.top = 0;
        rect.bottom = 0;
        if (J == 0) {
            if (this.f54093D) {
                rect.right = this.f54094E;
            } else {
                rect.left = this.f54094E;
            }
        } else if (this.f54093D) {
            rect.right = 0;
        } else {
            rect.left = 0;
        }
        if (recyclerView.getAdapter() == null || J != recyclerView.getAdapter().B() - 1) {
            if (this.f54093D) {
                rect.left = this.f54091B;
            } else {
                rect.right = this.f54091B;
            }
        } else if (this.f54093D) {
            rect.left = this.f54092C;
        } else {
            rect.right = this.f54092C;
        }
    }
}
