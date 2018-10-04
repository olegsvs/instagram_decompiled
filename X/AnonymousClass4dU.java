package X;

import com.instagram.direct.fragment.visual.DirectVisualMessageViewerFragment;
import java.util.List;

/* renamed from: X.4dU */
public final class AnonymousClass4dU implements AnonymousClass1jQ {
    /* renamed from: B */
    public final /* synthetic */ DirectVisualMessageViewerFragment f55850B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass4go f55851C;

    public final void onFailure() {
    }

    public AnonymousClass4dU(DirectVisualMessageViewerFragment directVisualMessageViewerFragment, AnonymousClass4go anonymousClass4go) {
        this.f55850B = directVisualMessageViewerFragment;
        this.f55851C = anonymousClass4go;
    }

    public final void xBA(List list) {
        if (this.f55850B.isResumed()) {
            AnonymousClass4go C = AnonymousClass4gp.m24779C((AnonymousClass0W7) list.get(0), this.f55850B.getContext());
            if (this.f55850B.f65486f.m24785E(this.f55851C, C)) {
                DirectVisualMessageViewerFragment.X(this.f55850B, C);
            }
        }
    }
}
