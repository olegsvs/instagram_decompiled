package X;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: X.49z */
public final class AnonymousClass49z extends AnonymousClass0rv {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Rt f51021B;

    public AnonymousClass49z(AnonymousClass5Rt anonymousClass5Rt) {
        this.f51021B = anonymousClass5Rt;
    }

    /* renamed from: A */
    public final void m23453A(Rect rect, View view, RecyclerView recyclerView, AnonymousClass0or anonymousClass0or) {
        super.A(rect, view, recyclerView, anonymousClass0or);
        int J = RecyclerView.J(view) % 3;
        int i = this.f51021B.f63554M / 2;
        rect.left = J == 0 ? 0 : i;
        if (J == 2) {
            i = 0;
        }
        rect.right = i;
        rect.bottom = this.f51021B.f63554M;
    }
}
