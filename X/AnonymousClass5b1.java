package X;

import android.view.View;
import com.instagram.video.live.livewith.fragment.IgLiveWithGuestFragment;

/* renamed from: X.5b1 */
public final class AnonymousClass5b1 implements AnonymousClass15J {
    /* renamed from: B */
    public IgLiveWithGuestFragment f66793B;
    /* renamed from: C */
    public final AnonymousClass5Pa f66794C;

    public AnonymousClass5b1(AnonymousClass5Pa anonymousClass5Pa) {
        this.f66794C = anonymousClass5Pa;
        AnonymousClass15z anonymousClass15z = new AnonymousClass15z(this.f66794C.f63143B);
        anonymousClass15z.f14385E = this;
        anonymousClass15z.A();
        anonymousClass15z = new AnonymousClass15z(this.f66794C.f63145D);
        anonymousClass15z.f14385E = this;
        anonymousClass15z.A();
    }

    /* renamed from: A */
    public final void m27776A(boolean z) {
        View view = this.f66794C.f63143B;
        if (view.getVisibility() == 8) {
            return;
        }
        if (z) {
            AnonymousClass14H.E(true, new View[]{this.f66794C.f63143B});
            return;
        }
        view.setVisibility(8);
    }

    /* renamed from: B */
    public final void m27777B(boolean z) {
        View view = this.f66794C.f63143B;
        if (view.getVisibility() == 0) {
            return;
        }
        if (z) {
            AnonymousClass14H.H(true, new View[]{view});
            return;
        }
        view.setVisibility(0);
    }

    public final void Xq(View view) {
        if (this.f66793B != null && view == this.f66794C.f63144C) {
            this.f66793B.f73561G.m26399C();
        }
    }

    public final boolean yCA(View view) {
        if (this.f66793B == null) {
            return false;
        }
        if (view == this.f66794C.f63143B) {
            IgLiveWithGuestFragment.m29684E(this.f66793B);
        } else if (view == this.f66794C.f63145D) {
            view = this.f66793B;
            view.f73561G.m26401E(IgLiveWithGuestFragment.m29682C(view).D(), view.f73558D);
            AnonymousClass66J.m28985B(view.f73568N, AnonymousClass66I.VIEWER_COUNT_BUTTON_TAP).R();
        } else {
            View view2 = this.f66794C.f63144C;
        }
        return true;
    }
}
