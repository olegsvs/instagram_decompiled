package X;

import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.creation.fragment.ThumbnailPreviewFragment;
import java.util.List;

/* renamed from: X.4WP */
public final class AnonymousClass4WP implements AnonymousClass0nn {
    /* renamed from: B */
    public final /* synthetic */ ThumbnailPreviewFragment f54826B;

    public final void Hr(AnonymousClass0fq anonymousClass0fq) {
    }

    public AnonymousClass4WP(ThumbnailPreviewFragment thumbnailPreviewFragment) {
        this.f54826B = thumbnailPreviewFragment;
    }

    public final void Gr(AnonymousClass0Q6 anonymousClass0Q6) {
        Toast.makeText(this.f54826B.getActivity(), C0164R.string.could_not_refresh_feed, 0).show();
    }

    public final void Ir() {
        this.f54826B.mEmptyStateView.m14962F();
    }

    public final void Jr() {
        this.f54826B.mEmptyStateView.m14965I();
    }

    public final /* bridge */ /* synthetic */ void Kr(AnonymousClass0Pn anonymousClass0Pn) {
        List list = ((AnonymousClass0ft) anonymousClass0Pn).f8015E;
        int size = list.size();
        AnonymousClass1ex anonymousClass1ex = ThumbnailPreviewFragment.f54827H;
        size = Math.min(size, (anonymousClass1ex.f21066B * 3) - 1);
        if (size == (anonymousClass1ex.f21066B * 3) - 1) {
            AnonymousClass0Ig anonymousClass0Ig = this.f54826B;
            anonymousClass0Ig.mThumbnailPreviewContainer.setGravity(0);
            anonymousClass0Ig.mContainer.setOnClickListener(null);
            anonymousClass0Ig.setListAdapter(anonymousClass0Ig.f54828B);
            anonymousClass0Ig.getListView().setClipChildren(true);
            anonymousClass0Ig.getListView().setClipToPadding(true);
            anonymousClass0Ig.f54830D.KO().setVisibility(0);
            AnonymousClass4Vr anonymousClass4Vr = this.f54826B.f54828B;
            for (AnonymousClass0P7 anonymousClass0P7 : list.subList(0, size)) {
                anonymousClass4Vr.f54770F.add(new AnonymousClass4Vy(anonymousClass0P7, anonymousClass0P7.HA()));
            }
            anonymousClass4Vr.m24392F();
            return;
        }
        ThumbnailPreviewFragment.m24402B(this.f54826B);
    }

    public final void Lr(AnonymousClass0Pn anonymousClass0Pn) {
        AnonymousClass0ft anonymousClass0ft = (AnonymousClass0ft) anonymousClass0Pn;
    }
}
