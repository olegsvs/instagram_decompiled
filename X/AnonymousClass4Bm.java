package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.ui.widget.refresh.RefreshableListView;

/* renamed from: X.4Bm */
public final class AnonymousClass4Bm extends AnonymousClass0Ie implements AnonymousClass0IT {
    /* renamed from: B */
    public AnonymousClass33Q f51265B;
    /* renamed from: C */
    public View f51266C;
    /* renamed from: D */
    public String f51267D;
    /* renamed from: E */
    public AnonymousClass0Cm f51268E;

    public final String getModuleName() {
        return "boosted_posts_management";
    }

    /* renamed from: B */
    public static void m23497B(AnonymousClass4Bm anonymousClass4Bm) {
        String str = anonymousClass4Bm.f51268E.f1759C;
        AnonymousClass0GA A = AnonymousClass1Dj.B(AnonymousClass0a2.B(anonymousClass4Bm.f51268E)).C(new AnonymousClass29f(AnonymousClass0IE.E("{\"%s\":\"%s\"}", new Object[]{"0", str}))).A();
        AnonymousClass4Bm.m23498C(anonymousClass4Bm, true);
        A.f2849B = new AnonymousClass4Bl(anonymousClass4Bm);
        anonymousClass4Bm.schedule(A);
    }

    /* renamed from: C */
    public static void m23498C(AnonymousClass4Bm anonymousClass4Bm, boolean z) {
        if (anonymousClass4Bm.getListViewSafe() != null) {
            ((RefreshableListView) anonymousClass4Bm.getListViewSafe()).setIsLoading(z);
        }
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.Z(C0164R.string.promotions);
        anonymousClass0eT.n(getFragmentManager().H() > 0);
        anonymousClass0eT.F(AnonymousClass0eb.CREATE_PROMOTION, new AnonymousClass4Bk(this));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 64206) {
            if (i2 == -1) {
                AnonymousClass4Bm.m23497B(this);
                return;
            }
            AnonymousClass0IG.F(C0164R.string.login_to_continue);
            getFragmentManager().L();
        }
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1987493010);
        super.onCreate(bundle);
        this.f51268E = AnonymousClass0Ce.G(getArguments());
        this.f51265B = new AnonymousClass33Q(getContext(), this);
        this.f51267D = getArguments().getString("entry_point");
        AnonymousClass0cQ.G(this, -1121538040, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1007072080);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C0164R.layout.layout_refreshablelistview_with_progress, viewGroup, false);
        View inflate = layoutInflater.inflate(C0164R.layout.ads_manager_empty_view, viewGroup2, false);
        this.f51266C = inflate;
        inflate.findViewById(C0164R.id.create_a_new_promotion).setVisibility(0);
        this.f51266C.findViewById(C0164R.id.create_a_new_promotion).setOnClickListener(new AnonymousClass4Bi(this));
        viewGroup2.addView(this.f51266C);
        AnonymousClass0cQ.G(this, -248486896, F);
        return viewGroup2;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, -2109187653);
        super.onDestroy();
        AnonymousClass2NW.ADS_MANAGER_CANCEL.m15343A().F("step", "landing_page").F("entry_point", this.f51267D).R();
        AnonymousClass0cQ.G(this, -4259606, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        setListAdapter(this.f51265B);
        AnonymousClass2IF.m14981B(true, view);
        AnonymousClass0Rq anonymousClass0Rq = this.f51265B;
        anonymousClass0Rq.C();
        anonymousClass0Rq.E();
        if (AnonymousClass0a2.K(this.f51268E)) {
            AnonymousClass4Bm.m23497B(this);
        } else {
            AnonymousClass0FO.C(this.f51268E, this, AnonymousClass2HL.READ_ONLY);
        }
        ((RefreshableListView) getListView()).setupAndEnableRefresh(new AnonymousClass4Bj(this));
    }
}
