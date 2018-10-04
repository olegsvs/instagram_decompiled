package X;

import android.view.View;
import com.instagram.archive.fragment.ArchiveReelFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import java.util.List;

/* renamed from: X.48q */
public final class AnonymousClass48q implements AnonymousClass3bF {
    /* renamed from: B */
    public final /* synthetic */ ArchiveReelFragment f50792B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0lG f50793C;
    /* renamed from: D */
    public final /* synthetic */ List f50794D;
    /* renamed from: E */
    public final /* synthetic */ View f50795E;
    /* renamed from: F */
    public final /* synthetic */ int f50796F;

    public final void yu(float f) {
    }

    public AnonymousClass48q(ArchiveReelFragment archiveReelFragment, List list, int i, AnonymousClass0lG anonymousClass0lG, View view) {
        this.f50792B = archiveReelFragment;
        this.f50794D = list;
        this.f50796F = i;
        this.f50793C = anonymousClass0lG;
        this.f50795E = view;
    }

    public final void mx(String str) {
        if (this.f50792B.isResumed()) {
            AnonymousClass1Q8 B = new AnonymousClass1Q8().B(this.f50794D, str, this.f50792B.f50805J);
            B.f18309M = AnonymousClass0Qf.ARCHIVE;
            B.f18316T = this.f50792B.f50803H;
            B.f18317U = this.f50792B.f50805J.f1759C;
            B.f18314R = Integer.valueOf(this.f50796F);
            if (((Boolean) AnonymousClass0CC.tg.H(this.f50792B.f50805J)).booleanValue()) {
                AnonymousClass0IL anonymousClass0IL = this.f50792B;
                AnonymousClass0lG anonymousClass0lG = this.f50793C;
                AnonymousClass3bH anonymousClass41P = new AnonymousClass41P(anonymousClass0IL.getListView(), anonymousClass0IL.f50797B, anonymousClass0IL);
                anonymousClass0IL.mHideAnimationCoordinator = anonymousClass41P;
                B.f18308L = anonymousClass41P.f42593C;
                B.f18307K = anonymousClass0lG.f9469M;
                AnonymousClass0Sn anonymousClass0Sn = new AnonymousClass0Sn(TransparentModalActivity.class, "reel_viewer", B.A(), anonymousClass0IL.getActivity(), anonymousClass0IL.f50805J.f1759C);
                anonymousClass0Sn.f5013B = ModalActivity.f5023D;
                anonymousClass0Sn.B(anonymousClass0IL.getContext());
            } else {
                AnonymousClass0IL anonymousClass0IL2 = this.f50792B;
                AnonymousClass0IL C = AnonymousClass0Jd.f2931B.H().C(B.A());
                AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass0IL2.getActivity());
                anonymousClass0IZ.f2754D = C;
                anonymousClass0IZ.f2752B = "ReelViewerFragment.BACK_STACK_NAME";
                anonymousClass0IZ.B();
            }
            this.f50795E.setVisibility(0);
            return;
        }
        onCancel();
    }

    public final void onCancel() {
        this.f50795E.setVisibility(0);
    }
}
