package X;

import android.view.View;
import com.instagram.archive.fragment.ArchivePrivateHighlightsFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import java.util.List;

/* renamed from: X.48e */
public final class AnonymousClass48e implements AnonymousClass3bF {
    /* renamed from: B */
    public final /* synthetic */ ArchivePrivateHighlightsFragment f50760B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0lG f50761C;
    /* renamed from: D */
    public final /* synthetic */ List f50762D;
    /* renamed from: E */
    public final /* synthetic */ View f50763E;

    public final void yu(float f) {
    }

    public AnonymousClass48e(ArchivePrivateHighlightsFragment archivePrivateHighlightsFragment, List list, AnonymousClass0lG anonymousClass0lG, View view) {
        this.f50760B = archivePrivateHighlightsFragment;
        this.f50762D = list;
        this.f50761C = anonymousClass0lG;
        this.f50763E = view;
    }

    public final void mx(String str) {
        if (this.f50760B.isResumed()) {
            AnonymousClass1Q8 B = new AnonymousClass1Q8().B(this.f50762D, str, this.f50760B.f50770D);
            B.f18309M = AnonymousClass0Qf.ARCHIVE;
            B.f18316T = this.f50760B.f50769C;
            B.f18317U = this.f50760B.f50770D.f1759C;
            B.f18314R = Integer.valueOf(0);
            AnonymousClass0IL anonymousClass0IL;
            if (((Boolean) AnonymousClass0CC.tg.H(this.f50760B.f50770D)).booleanValue()) {
                anonymousClass0IL = this.f50760B;
                AnonymousClass0lG anonymousClass0lG = this.f50761C;
                AnonymousClass3bH anonymousClass41P = new AnonymousClass41P(anonymousClass0IL.getListView(), anonymousClass0IL.f50768B, anonymousClass0IL);
                anonymousClass0IL.mHideAnimationCoordinator = anonymousClass41P;
                B.f18308L = anonymousClass41P.f42593C;
                B.f18307K = anonymousClass0lG.f9469M;
                AnonymousClass0Sn anonymousClass0Sn = new AnonymousClass0Sn(TransparentModalActivity.class, "reel_viewer", B.A(), anonymousClass0IL.getActivity(), anonymousClass0IL.f50770D.f1759C);
                anonymousClass0Sn.f5013B = ModalActivity.f5023D;
                anonymousClass0Sn.B(anonymousClass0IL.getContext());
            } else {
                anonymousClass0IL = this.f50760B;
                AnonymousClass0IL C = AnonymousClass0Jd.f2931B.H().C(B.A());
                AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass0IL.getActivity());
                anonymousClass0IZ.f2754D = C;
                anonymousClass0IZ.f2752B = "ReelViewerFragment.BACK_STACK_NAME";
                anonymousClass0IZ.B();
            }
            this.f50763E.setVisibility(0);
            return;
        }
        onCancel();
    }

    public final void onCancel() {
        this.f50763E.setVisibility(0);
    }
}
