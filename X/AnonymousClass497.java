package X;

import android.content.Intent;
import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.archive.fragment.HighlightsMetadataFragment;

/* renamed from: X.497 */
public final class AnonymousClass497 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ HighlightsMetadataFragment f50862B;

    public AnonymousClass497(HighlightsMetadataFragment highlightsMetadataFragment) {
        this.f50862B = highlightsMetadataFragment;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 164821913);
        AnonymousClass0Sy.G(new AnonymousClass496(this.f50862B));
        Toast.makeText(this.f50862B.getContext(), this.f50862B.getString(C0164R.string.unknown_error_occured), 0).show();
        AnonymousClass0cQ.H(this, -1636662614, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1233525362);
        AnonymousClass30S anonymousClass30S = (AnonymousClass30S) obj;
        int I2 = AnonymousClass0cQ.I(this, 569346630);
        AnonymousClass0Sy.G(new AnonymousClass496(this.f50862B));
        AnonymousClass0MI J = AnonymousClass0Jd.f2931B.M(this.f50862B.f50865D).J(anonymousClass30S.f36810B, true);
        for (AnonymousClass0Pj anonymousClass0Pj : J.F()) {
            if (anonymousClass0Pj.f4137I == AnonymousClass17B.MEDIA) {
                anonymousClass0Pj.f4134F.A(J.getId());
            }
        }
        AnonymousClass0F4.f2058E.C(new AnonymousClass10U(J));
        if (this.f50862B.mLaunchStoryCreationWithHighlightStickerSwitch != null) {
            Intent intent = new Intent();
            intent.putExtra("should_auto_launch_highlight_reshare", this.f50862B.mLaunchStoryCreationWithHighlightStickerSwitch.isChecked());
            intent.putExtra("auto_launch_highlight_reshare_reel_id", J.getId());
            this.f50862B.getActivity().setResult(-1, intent);
        }
        this.f50862B.getActivity().finish();
        AnonymousClass0cQ.H(this, -830353054, I2);
        AnonymousClass0cQ.H(this, -1256367901, I);
    }
}
