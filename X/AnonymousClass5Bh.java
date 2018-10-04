package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import java.util.Collection;

/* renamed from: X.5Bh */
public final class AnonymousClass5Bh extends AnonymousClass0Ie implements OnScrollListener, AnonymousClass3dy, AnonymousClass0IT, AnonymousClass3kY {
    /* renamed from: B */
    public AnonymousClass1Wl f60982B;
    /* renamed from: C */
    public String f60983C = JsonProperty.USE_DEFAULT_NAME;
    /* renamed from: D */
    public AnonymousClass3e0 f60984D;
    /* renamed from: E */
    public AnonymousClass0Cm f60985E;
    /* renamed from: F */
    private final AnonymousClass41j f60986F = new AnonymousClass41j();
    /* renamed from: G */
    private final AnonymousClass0hi f60987G = new AnonymousClass0hi();
    /* renamed from: H */
    private TypeaheadHeader f60988H;

    public final String getModuleName() {
        return "reel_viewer_settings";
    }

    public final void Ax(String str, AnonymousClass0Q6 anonymousClass0Q6) {
        if (this.f60983C.equals(str)) {
            Toast.makeText(getContext(), C0164R.string.request_error, 1).show();
        }
    }

    public final void Fx(String str) {
        AnonymousClass2IF.B(false, getView());
    }

    public final void Lx(String str) {
        AnonymousClass2IF.B(true, getView());
    }

    public final /* bridge */ /* synthetic */ void Qx(String str, AnonymousClass0Pn anonymousClass0Pn) {
        AnonymousClass3nW anonymousClass3nW = (AnonymousClass3nW) anonymousClass0Pn;
        if (this.f60983C.equals(str)) {
            str = this.f60982B;
            str.f19606F.addAll(anonymousClass3nW.VN());
            str.f19602B = false;
            AnonymousClass1Wl.B(str);
        }
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.g(C0164R.string.reel_settings_viewers_title_blocked, new AnonymousClass5Be(this, anonymousClass0eT));
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -915364421);
        super.onCreate(bundle);
        AnonymousClass3e0 anonymousClass3e0 = new AnonymousClass3e0(this, this.f60986F);
        this.f60984D = anonymousClass3e0;
        anonymousClass3e0.f42947D = this;
        ListAdapter anonymousClass1Wl = new AnonymousClass1Wl(getContext());
        this.f60982B = anonymousClass1Wl;
        setListAdapter(anonymousClass1Wl);
        this.f60985E = AnonymousClass0Ce.G(getArguments());
        AnonymousClass0GA B = AnonymousClass3nM.B(this.f60985E);
        B.f2849B = new AnonymousClass5Bd(this);
        schedule(B);
        this.f60984D.C(this.f60983C);
        AnonymousClass0cQ.G(this, 1261287060, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1721870875);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_listview_with_progress, viewGroup, false);
        ListView listView = (ListView) inflate.findViewById(16908298);
        TypeaheadHeader typeaheadHeader = new TypeaheadHeader(getContext());
        this.f60988H = typeaheadHeader;
        typeaheadHeader.setDelegate(this);
        this.f60988H.D(getString(C0164R.string.search_followers));
        this.f60988H.E(this.f60983C);
        listView.addHeaderView(this.f60988H);
        AnonymousClass0cQ.G(this, -1347099044, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, 1242723171);
        super.onDestroy();
        this.f60984D.ei();
        AnonymousClass0cQ.G(this, -1584001425, F);
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -1862783456);
        super.onDestroyView();
        this.f60984D.gi();
        this.f60987G.B(this.f60988H);
        this.f60988H = null;
        AnonymousClass0cQ.G(this, -1468493489, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, 360175779);
        super.onPause();
        AnonymousClass0Nm.N(getView());
        AnonymousClass0cQ.G(this, -200325665, F);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.I(this, 1438876071);
        this.f60987G.onScroll(absListView, i, i2, i3);
        AnonymousClass0cQ.H(this, 980304367, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.I(this, 1134378494);
        this.f60987G.onScrollStateChanged(absListView, i);
        AnonymousClass0cQ.H(this, 12264463, I);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AnonymousClass2IF.B(this.f60984D.A(), view);
        this.f60987G.A(this.f60988H);
        getListView().setOnScrollListener(this);
    }

    public final void searchTextChanged(String str) {
        this.f60983C = str;
        AnonymousClass1Wl anonymousClass1Wl = this.f60982B;
        boolean isEmpty = this.f60983C.isEmpty();
        if (anonymousClass1Wl.f19605E != isEmpty) {
            anonymousClass1Wl.f19605E = isEmpty;
            AnonymousClass1Wl.B(anonymousClass1Wl);
        }
        AnonymousClass3e3 KQ = this.f60986F.KQ(this.f60983C);
        if (KQ.f42956F == AnonymousClass3e4.FULL) {
            anonymousClass1Wl = this.f60982B;
            Collection collection = KQ.f42954D;
            anonymousClass1Wl.f19606F.clear();
            anonymousClass1Wl.f19606F.addAll(collection);
            anonymousClass1Wl.f19602B = false;
            AnonymousClass1Wl.B(anonymousClass1Wl);
            return;
        }
        AnonymousClass1Wl anonymousClass1Wl2 = this.f60982B;
        anonymousClass1Wl2.f19606F.clear();
        anonymousClass1Wl2.f19602B = true;
        AnonymousClass1Wl.B(anonymousClass1Wl2);
        this.f60984D.C(this.f60983C);
    }

    public final AnonymousClass0Iu tF(String str) {
        return AnonymousClass3nV.B(this.f60985E, AnonymousClass0IE.E("friendships/%s/followers/", new Object[]{this.f60985E.f1759C}), str, null, null);
    }
}
