package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.igtv.feed.IGTVFeedController;
import java.util.List;

/* renamed from: X.4uN */
public final class AnonymousClass4uN implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5YI f58360B;

    public AnonymousClass4uN(AnonymousClass5YI anonymousClass5YI) {
        this.f58360B = anonymousClass5YI;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 642262787);
        AnonymousClass0P7 iK = this.f58360B.iK();
        AnonymousClass5YI anonymousClass5YI = this.f58360B;
        List list = anonymousClass5YI.f66035B;
        String str = (String) list.get(anonymousClass5YI.f66036C % list.size());
        if (iK != null) {
            if (this.f58360B.f66038E != null) {
                AnonymousClass0ij anonymousClass0ij = this.f58360B.f66038E;
                IGTVFeedController.B(anonymousClass0ij.f8899B, anonymousClass0ij.f8900C, str, iK.getId());
                AnonymousClass0cQ.L(this, 607931274, M);
                return;
            }
        }
        AnonymousClass0cQ.L(this, 1698266234, M);
    }
}
