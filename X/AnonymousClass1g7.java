package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.C0164R;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.1g7 */
public final class AnonymousClass1g7 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ UserDetailFragment f21297B;

    public AnonymousClass1g7(UserDetailFragment userDetailFragment) {
        this.f21297B = userDetailFragment;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.m5863M(this, 1196981966);
        if (this.f21297B.mTopAccountInsightsDialog != null) {
            this.f21297B.mTopAccountInsightsDialog.dismiss();
            this.f21297B.f8257p.m11238C(C0164R.string.get_insights_here);
            this.f21297B.f8257p.m11239D(AnonymousClass1ff.ORGANIC_INSIGHT, this.f21297B.getView(), this.f21297B.f8217B.f21195H, true);
        }
        AnonymousClass0cQ.m5862L(this, -1829639095, M);
    }
}
