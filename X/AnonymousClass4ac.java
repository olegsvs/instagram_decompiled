package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.C0164R;

/* renamed from: X.4ac */
public final class AnonymousClass4ac implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4ah f55517B;

    public AnonymousClass4ac(AnonymousClass4ah anonymousClass4ah) {
        this.f55517B = anonymousClass4ah;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 691511037);
        AnonymousClass0EE anonymousClass0EE = this.f55517B;
        String str = anonymousClass0EE.f55523B.f55542B;
        String str2 = anonymousClass0EE.f55523B.f55544D;
        String str3 = anonymousClass0EE.f55523B.f55543C;
        String A = anonymousClass0EE.f55526E.m24789A();
        AnonymousClass0NN L = AnonymousClass0V1.L(anonymousClass0EE, "creation_delete_tap", str, str2, str3);
        L.F("quick_reply_id", A);
        L.R();
        AnonymousClass0IL anonymousClass0IL = this.f55517B;
        new AnonymousClass0Sb(anonymousClass0IL.getContext()).Q(C0164R.string.direct_edit_quick_reply_delete_title).H(C0164R.string.direct_edit_quick_reply_delete_message).L(C0164R.string.no, null).O(C0164R.string.yes, new AnonymousClass4ag(anonymousClass0IL)).C().show();
        AnonymousClass0cQ.L(this, -767991313, M);
    }
}
