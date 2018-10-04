package X;

import android.support.v7.widget.RecyclerView;

/* renamed from: X.0lX */
public final class AnonymousClass0lX implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0PY f9540B;

    public AnonymousClass0lX(AnonymousClass0PY anonymousClass0PY) {
        this.f9540B = anonymousClass0PY;
    }

    public final void run() {
        if (this.f9540B.getView() != null) {
            if (this.f9540B.f4093P) {
                AnonymousClass0IL anonymousClass0IL = this.f9540B;
                AnonymousClass0ib.m6923C(anonymousClass0IL, anonymousClass0IL.getListView());
            } else {
                this.f9540B.getListView().setSelection(0);
            }
            if (this.f9540B.f4106c != null) {
                RecyclerView recyclerView = this.f9540B.f4106c.f8402R;
                if (recyclerView != null) {
                    recyclerView.FA(0);
                }
            }
        }
    }
}
