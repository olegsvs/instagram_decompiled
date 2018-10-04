package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.facebook.C0164R;

/* renamed from: X.5KG */
public final class AnonymousClass5KG extends AnonymousClass0Ie implements AnonymousClass0IT {
    /* renamed from: B */
    public AnonymousClass3mb f62265B;
    /* renamed from: C */
    public AnonymousClass5LD f62266C;
    /* renamed from: D */
    public AnonymousClass0Cm f62267D;
    /* renamed from: E */
    private final AnonymousClass0Iw f62268E = new AnonymousClass5KF(this);

    public final String getModuleName() {
        return "blocked_list";
    }

    /* renamed from: B */
    public static void m26257B(AnonymousClass5KG anonymousClass5KG) {
        anonymousClass5KG.f62266C.f62384D = true;
        anonymousClass5KG.f62266C.f62383C = false;
        AnonymousClass0Cn anonymousClass0Cn = anonymousClass5KG.f62267D;
        Object obj = anonymousClass5KG.f62266C.f62385E;
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        anonymousClass0Pt.f4229M = "users/blocked_list/";
        anonymousClass0Pt = anonymousClass0Pt.M(AnonymousClass3nO.class);
        if (!TextUtils.isEmpty(obj)) {
            anonymousClass0Pt.D("max_id", obj);
        }
        AnonymousClass0GA H = anonymousClass0Pt.H();
        H.f2849B = anonymousClass5KG.f62268E;
        anonymousClass5KG.schedule(H);
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.Z(C0164R.string.gdpr_blocked_accounts);
        anonymousClass0eT.n(true);
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1010097881);
        super.onCreate(bundle);
        this.f62267D = AnonymousClass0Ce.G(getArguments());
        this.f62266C = new AnonymousClass5aO(this, this);
        this.f62265B = new AnonymousClass3mb(getContext(), this, this.f62266C);
        this.f62266C.f62382B = this.f62265B;
        AnonymousClass5KG.m26257B(this);
        AnonymousClass0cQ.G(this, -1160973431, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        getListView().setOnScrollListener(this.f62266C);
        setListAdapter(this.f62265B);
    }
}
