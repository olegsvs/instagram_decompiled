package X;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

/* renamed from: X.4D1 */
public final class AnonymousClass4D1 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4D8 f51520B;

    public AnonymousClass4D1(AnonymousClass4D8 anonymousClass4D8) {
        this.f51520B = anonymousClass4D8;
    }

    public final void onClick(View view) {
        String str;
        int M = AnonymousClass0cQ.M(this, 1959805190);
        AnonymousClass2W3 anonymousClass2W3 = this.f51520B.f51536H.f47297B;
        String str2 = "create_page";
        String str3 = this.f51520B.f51532D;
        List list = this.f51520B.f51534F;
        if (anonymousClass2W3 == null) {
            str = null;
        } else {
            str = anonymousClass2W3.f31095I;
        }
        AnonymousClass33a.m18358C(str2, str3, list, str, AnonymousClass0a2.I(this.f51520B.f51538J));
        AnonymousClass0IL N = AnonymousClass0Ir.f2848B.A().N(this.f51520B.f51532D, this.f51520B.getArguments().getString("edit_profile_entry"), null, false, true, null);
        N.setTargetFragment(this.f51520B, 0);
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f51520B.getActivity());
        anonymousClass0IZ.f2754D = N;
        anonymousClass0IZ.f2752B = AnonymousClass4D8.f51529N;
        anonymousClass0IZ.B();
        AnonymousClass0cQ.L(this, -331875021, M);
    }
}
