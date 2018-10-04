package X;

import android.view.View;
import com.instagram.archive.fragment.ArchiveReelCalendarFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.48k */
public final class AnonymousClass48k implements AnonymousClass3bF {
    /* renamed from: B */
    public final /* synthetic */ ArchiveReelCalendarFragment f50775B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0MI f50776C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0lG f50777D;
    /* renamed from: E */
    public final /* synthetic */ View f50778E;

    public final void yu(float f) {
    }

    public AnonymousClass48k(ArchiveReelCalendarFragment archiveReelCalendarFragment, AnonymousClass0MI anonymousClass0MI, View view, AnonymousClass0lG anonymousClass0lG) {
        this.f50775B = archiveReelCalendarFragment;
        this.f50776C = anonymousClass0MI;
        this.f50778E = view;
        this.f50777D = anonymousClass0lG;
    }

    public final void mx(String str) {
        AnonymousClass1Q8 B = new AnonymousClass1Q8().B(this.f50775B.f50779B.f36721C, this.f50776C.getId(), this.f50775B.f50784G);
        B.f18309M = AnonymousClass0Qf.ARCHIVE;
        B.f18316T = this.f50775B.f50782E;
        B.f18317U = this.f50775B.f50784G.f1759C;
        B.f18314R = Integer.valueOf(0);
        AnonymousClass0IL anonymousClass0IL;
        if (((Boolean) AnonymousClass0CC.tg.H(this.f50775B.f50784G)).booleanValue()) {
            anonymousClass0IL = this.f50775B;
            AnonymousClass0lG anonymousClass0lG = this.f50777D;
            B.f18308L = new AnonymousClass41N(anonymousClass0IL.mCalendar, anonymousClass0IL.f50779B, anonymousClass0IL).f42593C;
            B.f18307K = anonymousClass0lG.f9469M;
            AnonymousClass0Sn anonymousClass0Sn = new AnonymousClass0Sn(TransparentModalActivity.class, "reel_viewer", B.A(), anonymousClass0IL.getActivity(), anonymousClass0IL.f50784G.f1759C);
            anonymousClass0Sn.f5013B = ModalActivity.f5023D;
            anonymousClass0Sn.B(anonymousClass0IL.getContext());
        } else {
            anonymousClass0IL = this.f50775B;
            AnonymousClass0IL C = AnonymousClass0Jd.f2931B.H().C(B.A());
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass0IL.getActivity());
            anonymousClass0IZ.f2754D = C;
            anonymousClass0IZ.f2752B = "ReelViewerFragment.BACK_STACK_NAME";
            anonymousClass0IZ.B();
        }
        this.f50778E.setVisibility(0);
    }

    public final void onCancel() {
        this.f50778E.setVisibility(0);
    }
}
