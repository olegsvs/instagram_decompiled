package X;

import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.reels.fragment.ReelViewerFragment;

/* renamed from: X.5wh */
public final class AnonymousClass5wh implements AnonymousClass5AA {
    /* renamed from: B */
    public final /* synthetic */ ReelViewerFragment f70201B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Pj f70202C;

    public AnonymousClass5wh(ReelViewerFragment reelViewerFragment, AnonymousClass0Pj anonymousClass0Pj) {
        this.f70201B = reelViewerFragment;
        this.f70202C = anonymousClass0Pj;
    }

    public final void pn(AnonymousClass0x3 anonymousClass0x3) {
        ReelViewerFragment.I(this.f70201B, this.f70202C.getId(), anonymousClass0x3);
    }

    public final void qn() {
        Toast.makeText(this.f70201B.getContext(), C0164R.string.stories_show_less_toast, 1).show();
        ReelViewerFragment.Q(this.f70201B);
    }
}
