package X;

import android.view.View;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.reels.fragment.ReelResharesViewerFragment;
import java.util.List;

/* renamed from: X.5vn */
public final class AnonymousClass5vn implements AnonymousClass3bF {
    /* renamed from: B */
    public final /* synthetic */ ReelResharesViewerFragment f70099B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0MI f70100C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0lG f70101D;
    /* renamed from: E */
    public final /* synthetic */ List f70102E;
    /* renamed from: F */
    public final /* synthetic */ View f70103F;
    /* renamed from: G */
    public final /* synthetic */ int f70104G;

    public final void yu(float f) {
    }

    public AnonymousClass5vn(ReelResharesViewerFragment reelResharesViewerFragment, List list, AnonymousClass0MI anonymousClass0MI, int i, AnonymousClass0lG anonymousClass0lG, View view) {
        this.f70099B = reelResharesViewerFragment;
        this.f70102E = list;
        this.f70100C = anonymousClass0MI;
        this.f70104G = i;
        this.f70101D = anonymousClass0lG;
        this.f70103F = view;
    }

    public final void mx(String str) {
        if (this.f70099B.isResumed()) {
            AnonymousClass1Q8 B = new AnonymousClass1Q8().B(this.f70102E, this.f70100C.getId(), this.f70099B.f70108E);
            B.f18309M = AnonymousClass0Qf.RESHARED_REELS_VIEWER;
            B.f18316T = this.f70099B.f70107D;
            B.f18317U = this.f70099B.f70108E.f1759C;
            B.f18314R = Integer.valueOf(this.f70104G);
            AnonymousClass0IL anonymousClass0IL = this.f70099B;
            AnonymousClass0lG anonymousClass0lG = this.f70101D;
            AnonymousClass3bH anonymousClass41P = new AnonymousClass41P(anonymousClass0IL.getListView(), anonymousClass0IL.f70105B, anonymousClass0IL);
            anonymousClass0IL.mHideAnimationCoordinator = anonymousClass41P;
            B.f18308L = anonymousClass41P.f42593C;
            B.f18307K = anonymousClass0lG.f9469M;
            AnonymousClass0Sn anonymousClass0Sn = new AnonymousClass0Sn(TransparentModalActivity.class, "reel_viewer", B.A(), anonymousClass0IL.getActivity(), anonymousClass0IL.f70108E.f1759C);
            anonymousClass0Sn.f5013B = ModalActivity.f5023D;
            anonymousClass0Sn.B(anonymousClass0IL.getContext());
            this.f70103F.setVisibility(0);
            return;
        }
        onCancel();
    }

    public final void onCancel() {
        this.f70103F.setVisibility(0);
    }
}
