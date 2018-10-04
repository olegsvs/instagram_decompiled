package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.C0164R;

/* renamed from: X.5yM */
public final class AnonymousClass5yM implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5yQ f70466B;

    public AnonymousClass5yM(AnonymousClass5yQ anonymousClass5yQ) {
        this.f70466B = anonymousClass5yQ;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -310999040);
        AnonymousClass5yQ anonymousClass5yQ = this.f70466B;
        anonymousClass5yQ.f70485N.getText().clear();
        AnonymousClass0Nm.N(anonymousClass5yQ.f70493V);
        anonymousClass5yQ.f70489R.setVisibility(0);
        AnonymousClass5yQ.m28688D(anonymousClass5yQ).setVisibility(8);
        anonymousClass5yQ.f70473B.setText(C0164R.string.save_to);
        anonymousClass5yQ.f70477F.setVisibility(0);
        AnonymousClass5yQ.m28689E(anonymousClass5yQ).setVisibility(8);
        AnonymousClass0cQ.L(this, 1000358432, M);
    }
}
