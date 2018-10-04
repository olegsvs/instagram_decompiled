package X;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.business.instantexperiences.ui.InstantExperiencesBrowserChrome;

/* renamed from: X.5h7 */
public final class AnonymousClass5h7 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ InstantExperiencesBrowserChrome f68175B;

    public AnonymousClass5h7(InstantExperiencesBrowserChrome instantExperiencesBrowserChrome) {
        this.f68175B = instantExperiencesBrowserChrome;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -197136483);
        Activity activity = this.f68175B.f68183G.f72972B.getActivity();
        if (activity != null) {
            activity.finish();
        }
        AnonymousClass0cQ.L(this, -2082787230, M);
    }
}
