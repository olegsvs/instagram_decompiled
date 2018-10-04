package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.4DQ */
public final class AnonymousClass4DQ implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4DS f51588B;

    public AnonymousClass4DQ(AnonymousClass4DS anonymousClass4DS) {
        this.f51588B = anonymousClass4DS;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1149908290);
        AnonymousClass0IL anonymousClass0IL = this.f51588B;
        AnonymousClass2W3 anonymousClass2W3 = anonymousClass0IL.f51590B;
        if (anonymousClass2W3 != null) {
            String str;
            if (anonymousClass2W3.m16158B() == null) {
                str = null;
            } else {
                str = anonymousClass0IL.f51590B.m16158B().f31080B;
            }
            if (str != null) {
                AnonymousClass0Mt.O(anonymousClass0IL.f51590B.f31095I, anonymousClass0IL.f51590B.f31097K, str);
            }
        }
        anonymousClass0IL.getActivity().onBackPressed();
        AnonymousClass0cQ.L(this, -1573634405, M);
    }
}
