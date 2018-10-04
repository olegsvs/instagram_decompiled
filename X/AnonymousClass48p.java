package X;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.archive.fragment.ArchiveReelFragment;
import com.instagram.archive.fragment.HighlightsMetadataFragment;
import java.io.Serializable;

/* renamed from: X.48p */
public final class AnonymousClass48p implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ ArchiveReelFragment f50791B;

    public AnonymousClass48p(ArchiveReelFragment archiveReelFragment) {
        this.f50791B = archiveReelFragment;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -346529179);
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f50791B.getActivity());
        AnonymousClass0JK.f2907B.C();
        String str = this.f50791B.f50805J.f1759C;
        Serializable serializable = this.f50791B.f50804I;
        AnonymousClass0IL highlightsMetadataFragment = new HighlightsMetadataFragment();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.USER_ID", str);
        bundle.putSerializable("highlight_management_source", serializable);
        highlightsMetadataFragment.setArguments(bundle);
        anonymousClass0IZ.f2754D = highlightsMetadataFragment;
        anonymousClass0IZ.B();
        AnonymousClass0cQ.L(this, -1247367516, M);
    }
}
