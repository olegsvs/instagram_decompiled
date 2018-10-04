package X;

import android.view.View;

/* renamed from: X.5gz */
public final class AnonymousClass5gz implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ View f68164B;

    public AnonymousClass5gz(AnonymousClass5h0 anonymousClass5h0, View view) {
        this.f68164B = view;
    }

    public final void run() {
        if (this.f68164B.getVisibility() != 8) {
            this.f68164B.setVisibility(8);
        }
    }
}
