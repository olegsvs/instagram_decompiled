package X;

import android.content.Intent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.630 */
public final class AnonymousClass630 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6FI f71278B;
    /* renamed from: C */
    public final /* synthetic */ Set f71279C;

    public AnonymousClass630(AnonymousClass6FI anonymousClass6FI, Set set) {
        this.f71278B = anonymousClass6FI;
        this.f71279C = set;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 1300120870);
        AnonymousClass6FI.m29626B(this.f71278B);
        AnonymousClass0cQ.H(this, -873473407, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 260863162);
        AnonymousClass0ft anonymousClass0ft = (AnonymousClass0ft) obj;
        int I2 = AnonymousClass0cQ.I(this, 2081060741);
        AnonymousClass0eT.E(this.f71278B.getActivity()).Y(false);
        Serializable arrayList = new ArrayList();
        for (AnonymousClass0P7 id : anonymousClass0ft.f8015E) {
            arrayList.add(id.getId());
        }
        Intent intent = new Intent();
        intent.putExtra("ugc_edit_mode", this.f71278B.f73341C);
        intent.putExtra("media_ids", new ArrayList(this.f71279C));
        intent.putExtra("pdp_media_ids", arrayList);
        intent.putExtra("pdp_show_see_all", anonymousClass0ft.f8017G.booleanValue());
        this.f71278B.getActivity().setResult(-1, intent);
        this.f71278B.getActivity().finish();
        AnonymousClass0cQ.H(this, -873933103, I2);
        AnonymousClass0cQ.H(this, 1841620960, I);
    }
}
