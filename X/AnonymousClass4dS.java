package X;

import com.instagram.direct.fragment.visual.DirectVisualMessageViewerFragment;

/* renamed from: X.4dS */
public final class AnonymousClass4dS implements AnonymousClass14J {
    /* renamed from: B */
    public final /* synthetic */ DirectVisualMessageViewerFragment f55848B;

    public AnonymousClass4dS(DirectVisualMessageViewerFragment directVisualMessageViewerFragment) {
        this.f55848B = directVisualMessageViewerFragment;
    }

    public final void onFinish() {
        DirectVisualMessageViewerFragment.D(this.f55848B, false);
        this.f55848B.getActivity().finish();
    }
}
