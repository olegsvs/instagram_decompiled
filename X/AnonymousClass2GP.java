package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.reels.fragment.ReelDashboardFragment;

/* renamed from: X.2GP */
public final class AnonymousClass2GP implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ ReelDashboardFragment f28264B;
    /* renamed from: C */
    public final /* synthetic */ String f28265C;
    /* renamed from: D */
    public final /* synthetic */ String f28266D;

    public AnonymousClass2GP(ReelDashboardFragment reelDashboardFragment, String str, String str2) {
        this.f28264B = reelDashboardFragment;
        this.f28265C = str;
        this.f28266D = str2;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -949698870);
        AnonymousClass0IL anonymousClass0IL = this.f28264B;
        String str = this.f28265C;
        String str2 = this.f28266D;
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass0IL.getActivity());
        anonymousClass0IZ.f2754D = AnonymousClass0Jd.f2931B.H().A(str, str2);
        anonymousClass0IZ.B();
        AnonymousClass0cQ.L(this, 970241329, M);
    }
}
