package X;

import android.content.Context;
import android.view.View;
import com.facebook.C0164R;

/* renamed from: X.5NJ */
public final class AnonymousClass5NJ {
    /* renamed from: B */
    public final AnonymousClass5ad f62729B;
    /* renamed from: C */
    private final Context f62730C;

    public AnonymousClass5NJ(Context context) {
        this.f62730C = context;
        AnonymousClass5ad anonymousClass5ad = new AnonymousClass5ad(context);
        anonymousClass5ad.f66722D.setText(this.f62730C.getString(C0164R.string.cancel));
        this.f62729B = anonymousClass5ad;
    }

    /* renamed from: A */
    public final void m26356A(View view, AnonymousClass0Ci anonymousClass0Ci, AnonymousClass0Ci anonymousClass0Ci2, AnonymousClass5NI anonymousClass5NI, boolean z) {
        int i = z ? C0164R.string.live_cobroadcast_view_join_request_message : C0164R.string.live_cobroadcast_invite_sheet_message;
        AnonymousClass5ad anonymousClass5ad = this.f62729B;
        anonymousClass5ad.f66721C.setText(this.f62730C.getString(i, new Object[]{anonymousClass0Ci2.uT()}));
        anonymousClass5ad.f66724F.setText(this.f62730C.getString(C0164R.string.live_cobroadcast_invite_sheet_description, new Object[]{anonymousClass0Ci2.uT()}));
        anonymousClass5ad.f66723E.setText(this.f62730C.getString(C0164R.string.live_broadcast_invite_option, new Object[]{anonymousClass0Ci2.uT()}));
        anonymousClass5ad.m27747A(view, anonymousClass0Ci, anonymousClass0Ci2, new AnonymousClass5NH(this, anonymousClass5NI));
    }
}
