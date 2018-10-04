package X;

import com.facebook.C0164R;
import com.instagram.archive.fragment.ArchiveReelFragment;

/* renamed from: X.48n */
public final class AnonymousClass48n implements AnonymousClass2Hy {
    /* renamed from: B */
    public final /* synthetic */ ArchiveReelFragment f50789B;

    public final void Vk() {
    }

    public AnonymousClass48n(ArchiveReelFragment archiveReelFragment) {
        this.f50789B = archiveReelFragment;
    }

    public final void Uk() {
        AnonymousClass0Ur anonymousClass0Ur = new AnonymousClass0Ur(this.f50789B.getContext());
        anonymousClass0Ur.A(this.f50789B.getActivity().getString(C0164R.string.stories_archive_saving));
        anonymousClass0Ur.show();
        this.f50789B.schedule(AnonymousClass0hR.F(this.f50789B.f50805J, true, false, new AnonymousClass48m(this, anonymousClass0Ur)));
    }
}
