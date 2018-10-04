package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import com.facebook.C0164R;
import com.instagram.archive.fragment.ManageHighlightsFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.491 */
public final class AnonymousClass491 extends AnonymousClass0Ie implements AnonymousClass0Ih {
    /* renamed from: B */
    public AnonymousClass3wk f50851B;
    /* renamed from: C */
    private final AnonymousClass0hi f50852C = new AnonymousClass0hi();
    /* renamed from: D */
    private int f50853D;
    /* renamed from: E */
    private AnonymousClass0iW f50854E;
    /* renamed from: F */
    private AnonymousClass0Cm f50855F;

    public final void Jt() {
    }

    public final String getModuleName() {
        return "edit_reel_highlights";
    }

    public final boolean uX() {
        return false;
    }

    public final void wIA(boolean z) {
    }

    public final void oLA() {
        AnonymousClass0ib.C(this, getListView());
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -557114909);
        super.onCreate(bundle);
        this.f50855F = AnonymousClass0Ce.G(getArguments());
        ListAdapter anonymousClass3wk = new AnonymousClass3wk(getContext(), this.f50855F, this, (ManageHighlightsFragment) getParentFragment());
        this.f50851B = anonymousClass3wk;
        setListAdapter(anonymousClass3wk);
        AnonymousClass30Y.m18171E().m18179H(AnonymousClass0Jd.f2931B.M(this.f50855F).D(getArguments().getString("edit_highlights_reel_id")));
        AnonymousClass3wk anonymousClass3wk2 = this.f50851B;
        List<AnonymousClass0P7> arrayList = new ArrayList(AnonymousClass30Y.m18171E().m18177F());
        anonymousClass3wk2.f47222D.D();
        anonymousClass3wk2.f47221C.clear();
        anonymousClass3wk2.f47222D.B(arrayList);
        for (AnonymousClass0P7 anonymousClass0P7 : arrayList) {
            anonymousClass3wk2.f47220B.put(anonymousClass0P7.FA(), anonymousClass0P7);
        }
        anonymousClass3wk2.m21651F();
        this.f50853D = getResources().getDimensionPixelSize(C0164R.dimen.top_tabbar_height);
        this.f50854E = new AnonymousClass0iW(getContext());
        this.f50852C.A(this.f50854E);
        AnonymousClass0cQ.G(this, 1733694971, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1130593271);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_feed, viewGroup, false);
        AnonymousClass0cQ.G(this, 571127266, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 5672411);
        super.onDestroyView();
        AnonymousClass30Y.m18171E().m18180I(this.f50851B);
        AnonymousClass0cQ.G(this, 686907666, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, 1796964403);
        super.onPause();
        AnonymousClass0Nm.N(getView());
        AnonymousClass0cQ.G(this, -1220706044, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f50854E.G(getListView(), this.f50851B, this.f50853D);
        AnonymousClass30Y.m18171E().m18172A(this.f50851B);
        AnonymousClass0eT.D(AnonymousClass0eT.E(getActivity()));
    }

    public final void zs() {
        AnonymousClass0Nm.N(getView());
    }
}
