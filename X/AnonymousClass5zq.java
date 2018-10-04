package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.school.fragment.UpdateSchoolFragment;
import com.instagram.school.fragment.UpdateSchoolViewModel;

/* renamed from: X.5zq */
public final class AnonymousClass5zq implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5zz f70719B;

    public AnonymousClass5zq(AnonymousClass5zz anonymousClass5zz) {
        this.f70719B = anonymousClass5zz;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 2061306670);
        AnonymousClass5zL.m28720D("ig_school_onboarding_tap_change_school", this.f70719B.f70741M).R();
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f70719B.getActivity());
        anonymousClass0IZ.f2754D = UpdateSchoolFragment.m28753E(this.f70719B.f70733E, new UpdateSchoolViewModel());
        anonymousClass0IZ.B();
        AnonymousClass0cQ.L(this, 626814929, M);
    }
}
