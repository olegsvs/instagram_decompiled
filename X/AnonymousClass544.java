package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;

/* renamed from: X.544 */
public final class AnonymousClass544 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1LU f59741B;
    /* renamed from: C */
    public final /* synthetic */ int f59742C;
    /* renamed from: D */
    public final /* synthetic */ StackedAvatarView f59743D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass1Oq f59744E;

    public AnonymousClass544(StackedAvatarView stackedAvatarView, AnonymousClass1LU anonymousClass1LU, AnonymousClass1Oq anonymousClass1Oq, int i) {
        this.f59743D = stackedAvatarView;
        this.f59741B = anonymousClass1LU;
        this.f59744E = anonymousClass1Oq;
        this.f59742C = i;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 237399969);
        this.f59741B.uu(this.f59744E, this.f59742C, AnonymousClass0Nm.L(this.f59743D));
        AnonymousClass0cQ.L(this, 1931310601, M);
    }
}
