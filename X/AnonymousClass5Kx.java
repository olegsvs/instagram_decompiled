package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.C0164R;

/* renamed from: X.5Kx */
public final class AnonymousClass5Kx implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Id f62345B;

    public AnonymousClass5Kx(AnonymousClass0Id anonymousClass0Id) {
        this.f62345B = anonymousClass0Id;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 599952453);
        AnonymousClass0IL anonymousClass0IL = this.f62345B;
        AnonymousClass0Cm anonymousClass0Cm = anonymousClass0IL.f2809P;
        CharSequence[] charSequenceArr = new CharSequence[]{anonymousClass0IL.getString(C0164R.string.disconnect_contacts)};
        new AnonymousClass0Sb(anonymousClass0IL.getContext()).G(charSequenceArr, new AnonymousClass3Bu(anonymousClass0IL, anonymousClass0IL.getString(C0164R.string.disconnect_contacts), charSequenceArr, anonymousClass0IL, anonymousClass0Cm)).E(true).F(true).C().show();
        AnonymousClass0cQ.L(this, 396308272, M);
    }
}
