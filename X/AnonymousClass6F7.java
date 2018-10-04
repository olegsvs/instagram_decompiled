package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.6F7 */
public final class AnonymousClass6F7 extends AnonymousClass0Ie implements AnonymousClass0hq, AnonymousClass0PZ, AnonymousClass0Ii, AnonymousClass0Pb, AnonymousClass0gg, AnonymousClass3Lk, AnonymousClass0IT {
    /* renamed from: B */
    public AnonymousClass5xo f73252B;
    /* renamed from: C */
    public EmptyStateView f73253C;
    /* renamed from: D */
    public AnonymousClass0ng f73254D;
    /* renamed from: E */
    public boolean f73255E;
    /* renamed from: F */
    public String f73256F;
    /* renamed from: G */
    public AnonymousClass0Cm f73257G;
    /* renamed from: H */
    private final AnonymousClass0hi f73258H = new AnonymousClass0hi();
    /* renamed from: I */
    private final AnonymousClass0F8 f73259I = new AnonymousClass5yg(this);
    /* renamed from: J */
    private AnonymousClass0iW f73260J;
    /* renamed from: K */
    private String f73261K;

    public final String getModuleName() {
        return "instagram_shopping_save_product_collection";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* renamed from: B */
    public static void m29607B(AnonymousClass6F7 anonymousClass6F7, boolean z, boolean z2) {
        String str;
        AnonymousClass0Cn anonymousClass0Cn = anonymousClass6F7.f73257G;
        if (z) {
            str = null;
        } else {
            str = anonymousClass6F7.f73254D.f10109E;
        }
        String str2 = "save/products/feed/";
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        anonymousClass0Pt.f4229M = str2;
        anonymousClass0Pt.f4228L = new AnonymousClass0R8(AnonymousClass3dC.class);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(str);
        anonymousClass0Pt.f4219C = stringBuilder.toString();
        anonymousClass0Pt.f4220D = AnonymousClass0Ny.UseCacheWithTimeout;
        AnonymousClass0It.F(anonymousClass0Pt, str);
        anonymousClass6F7.f73254D.C(anonymousClass0Pt.H(), new AnonymousClass5yi(anonymousClass6F7, z, z2));
    }

    /* renamed from: C */
    public static void m29608C(AnonymousClass6F7 anonymousClass6F7) {
        AnonymousClass3dL.D(anonymousClass6F7.f73253C, (RefreshableListView) anonymousClass6F7.getListViewSafe(), anonymousClass6F7.f73254D.f10111G == AnonymousClass0nq.LOADING, anonymousClass6F7.f73254D.f10111G == AnonymousClass0nq.NEEDS_RETRY);
    }

    public final Map GIA() {
        Map hashMap = new HashMap();
        hashMap.put(MemoryDumpUploadJob.EXTRA_USER_ID, this.f73257G.f1759C);
        return hashMap;
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.j(this);
        anonymousClass0eT.n(getFragmentManager().H() > 0);
        anonymousClass0eT.l(true);
        View X = anonymousClass0eT.X(C0164R.layout.contextual_feed_title, 0, 0);
        ((TextView) X.findViewById(C0164R.id.feed_type)).setText(C0164R.string.saved_feed);
        ((TextView) X.findViewById(C0164R.id.feed_title)).setText(C0164R.string.save_home_product_collection_name);
    }

    public final void gC() {
        if (this.f73254D.B()) {
            AnonymousClass6F7.m29607B(this, false, false);
        }
    }

    public final AnonymousClass0iW iM() {
        return this.f73260J;
    }

    public final String kR() {
        return this.f73261K;
    }

    public final void oLA() {
        if (getView() != null) {
            AnonymousClass0ib.C(this, getListView());
        }
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1403951796);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f73261K = UUID.randomUUID().toString();
        this.f73257G = AnonymousClass0Ce.G(arguments);
        this.f73256F = arguments.getString("prior_module");
        this.f73260J = new AnonymousClass0iW(getContext());
        this.f73258H.A(this.f73260J);
        this.f73258H.A(new AnonymousClass0kd(AnonymousClass0ke.DOWN, 6, this));
        ListAdapter anonymousClass5xo = new AnonymousClass5xo(getContext(), this);
        this.f73252B = anonymousClass5xo;
        setListAdapter(anonymousClass5xo);
        AnonymousClass0F4.f2058E.A(AnonymousClass2EU.class, this.f73259I);
        this.f73254D = new AnonymousClass0ng(getContext(), this.f73257G.f1759C, getLoaderManager());
        AnonymousClass6F7.m29607B(this, true, false);
        AnonymousClass0cQ.G(this, -1671928244, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -552425893);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_refreshablelistview_with_empty_state, viewGroup, false);
        AnonymousClass0cQ.G(this, -2124646394, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, 520908176);
        super.onDestroy();
        AnonymousClass0F4.f2058E.D(AnonymousClass2EU.class, this.f73259I);
        AnonymousClass0cQ.G(this, 1334352064, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f73260J.G(getListView(), this.f73252B, getContext().getResources().getDimensionPixelSize(C0164R.dimen.saved_product_feed_top_margin) + AnonymousClass0ip.B(getContext()));
        this.f73253C = (EmptyStateView) getListView().getEmptyView();
        AnonymousClass3dL.C(getContext(), this.f73253C, new AnonymousClass5yj(this));
        EmptyStateView emptyStateView = this.f73253C;
        AnonymousClass2I0 anonymousClass2I0 = AnonymousClass2I0.EMPTY;
        emptyStateView.N(C0164R.string.save_explanation_title, anonymousClass2I0).L(C0164R.string.save_explanation_subtitle, anonymousClass2I0);
        AnonymousClass6F7.m29608C(this);
        this.f73253C.A();
        RefreshableListView refreshableListView = (RefreshableListView) getListView();
        refreshableListView.setupAndEnableRefresh(new AnonymousClass5yh(this));
        refreshableListView.setDrawBorder(false);
        refreshableListView.setOnScrollListener(this.f73258H);
    }
}
