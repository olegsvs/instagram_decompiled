package X;

import com.instagram.ui.widget.refresh.RefreshableListView;

/* renamed from: X.4aX */
public final class AnonymousClass4aX implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4aY f55511B;

    public AnonymousClass4aX(AnonymousClass4aY anonymousClass4aY) {
        this.f55511B = anonymousClass4aY;
    }

    public final void run() {
        if (this.f55511B.f55512B.getListViewSafe() != null) {
            ((RefreshableListView) this.f55511B.f55512B.getListViewSafe()).setIsLoading(true);
            AnonymousClass5Uw.E(this.f55511B.f55512B);
        }
    }
}
