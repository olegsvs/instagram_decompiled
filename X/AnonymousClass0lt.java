package X;

import android.support.v7.widget.RecyclerView;

/* renamed from: X.0lt */
public final class AnonymousClass0lt implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0PY f9611B;
    /* renamed from: C */
    public final /* synthetic */ String f9612C;

    public AnonymousClass0lt(AnonymousClass0PY anonymousClass0PY, String str) {
        this.f9611B = anonymousClass0PY;
        this.f9612C = str;
    }

    public final void run() {
        RecyclerView recyclerView = this.f9611B.f4106c.f8402R;
        if (recyclerView != null) {
            recyclerView.FA(0);
        }
        AnonymousClass0hO anonymousClass0hO = this.f9611B.f4106c;
        anonymousClass0hO.f8402R.post(new AnonymousClass10L(anonymousClass0hO, this.f9612C));
    }
}
