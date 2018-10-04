package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.C0164R;
import com.instagram.school.fragment.UpdateSchoolFragment;

/* renamed from: X.60d */
public final class AnonymousClass60d implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ UpdateSchoolFragment f70832B;

    public AnonymousClass60d(UpdateSchoolFragment updateSchoolFragment) {
        this.f70832B = updateSchoolFragment;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1451771005);
        if (this.f70832B.f70847I.m28759A(this.f70832B.f70840B)) {
            AnonymousClass0IL anonymousClass0IL = this.f70832B;
            new AnonymousClass0P2(anonymousClass0IL.getContext()).V(C0164R.string.unsaved_changes_title).K(C0164R.string.unsaved_changes_message).S(C0164R.string.yes, new AnonymousClass60f(anonymousClass0IL)).N(C0164R.string.no, new AnonymousClass60e(anonymousClass0IL)).E(true).A().show();
        } else {
            UpdateSchoolFragment.m28750B(this.f70832B);
        }
        AnonymousClass0cQ.L(this, -1719833034, M);
    }
}
