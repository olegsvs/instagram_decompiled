package X;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.archive.fragment.SelectHighlightsCoverFragment;

/* renamed from: X.49U */
public final class AnonymousClass49U implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ SelectHighlightsCoverFragment f50922B;

    public AnonymousClass49U(SelectHighlightsCoverFragment selectHighlightsCoverFragment) {
        this.f50922B = selectHighlightsCoverFragment;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -2139618773);
        AnonymousClass0IL anonymousClass0IL = this.f50922B;
        Activity activity = anonymousClass0IL.getActivity();
        anonymousClass0IL.f50927E.m18181J(anonymousClass0IL.f50926D.f36864E, anonymousClass0IL.f50926D.f36865F, anonymousClass0IL.f50926D.f36863D, anonymousClass0IL.mTouchImageView.getCropRect());
        AnonymousClass30n anonymousClass30n = anonymousClass0IL.f50927E.f36821B;
        anonymousClass0IL.f50926D = anonymousClass30n;
        if (anonymousClass30n.f36864E == null) {
            AnonymousClass0GA anonymousClass30d = new AnonymousClass30d(anonymousClass0IL.f50928F, anonymousClass0IL.f50926D, activity);
            AnonymousClass30V.m18165B().f36814B = anonymousClass30d;
            AnonymousClass0Ix.D(anonymousClass30d);
        }
        this.f50922B.getActivity().onBackPressed();
        AnonymousClass0cQ.L(this, 1160172741, M);
    }
}
