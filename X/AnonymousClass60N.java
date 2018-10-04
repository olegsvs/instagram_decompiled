package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.facebook.C0164R;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.util.Collection;

/* renamed from: X.60N */
public final class AnonymousClass60N extends AnonymousClass0Ie implements OnScrollListener, AnonymousClass2Hy {
    /* renamed from: B */
    public final AnonymousClass0Iw f70801B = new AnonymousClass60M(this);
    /* renamed from: C */
    public String f70802C;
    /* renamed from: D */
    public AnonymousClass5LD f70803D;
    /* renamed from: E */
    public AnonymousClass5zi f70804E;
    /* renamed from: F */
    public AnonymousClass5z9 f70805F;
    /* renamed from: G */
    public AnonymousClass0Cm f70806G;
    /* renamed from: H */
    private final AnonymousClass0hi f70807H = new AnonymousClass0hi();
    /* renamed from: I */
    private AnonymousClass6F9 f70808I;

    public final void Vk() {
    }

    public final String getModuleName() {
        return "school_class_year_list";
    }

    public final void Uk() {
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(getActivity());
        anonymousClass0IZ.f2754D = new AnonymousClass60K();
        anonymousClass0IZ.B();
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int F = AnonymousClass0cQ.F(this, -117435092);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f70806G = AnonymousClass0Ce.G(arguments);
        AnonymousClass0LH.B(getParentFragment() instanceof AnonymousClass6F9);
        this.f70804E = ((AnonymousClass6F9) getParentFragment()).f73276G;
        AnonymousClass6F8 anonymousClass6F8 = new AnonymousClass6F8((AnonymousClass0Ie) getParentFragment(), this.f70806G);
        this.f70803D = new AnonymousClass60L(this, this);
        this.f70805F = new AnonymousClass5z9(getContext(), this.f70806G, this.f70803D, false, anonymousClass6F8);
        anonymousClass6F8.f73266F = this.f70805F;
        this.f70802C = arguments.getString("SchoolDirectoryListFragment.ARGUMENT_DIRECTORY_GROUP_KEY");
        AnonymousClass5zi anonymousClass5zi = this.f70804E;
        this.f70805F.m28716F(AnonymousClass0Ow.D((Collection) anonymousClass5zi.f70709C.get(this.f70802C)));
        anonymousClass5zi = this.f70804E;
        AnonymousClass5zM anonymousClass5zM = (AnonymousClass5zM) anonymousClass5zi.f70708B.get(this.f70802C);
        AnonymousClass5LD anonymousClass5LD = this.f70803D;
        if (anonymousClass5zM.f70685C) {
            str = null;
        } else {
            str = anonymousClass5zM.f70684B;
        }
        anonymousClass5LD.f62385E = str;
        this.f70803D.f62382B = this.f70805F;
        AnonymousClass0cQ.G(this, 1672824636, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 613862359);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_refreshablelistview_with_empty_state, viewGroup, false);
        AnonymousClass0cQ.G(this, -1945861820, F);
        return inflate;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.I(this, -30648801);
        AnonymousClass6F9 anonymousClass6F9 = this.f70808I;
        if (anonymousClass6F9 != null && anonymousClass6F9.m29611A().equals(this.f70802C)) {
            this.f70807H.onScroll(absListView, i, i2, i3);
        }
        AnonymousClass0cQ.H(this, 225613949, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.I(this, 1952409886);
        AnonymousClass6F9 anonymousClass6F9 = this.f70808I;
        if (anonymousClass6F9 != null && anonymousClass6F9.m29611A().equals(this.f70802C)) {
            this.f70807H.onScrollStateChanged(absListView, i);
        }
        AnonymousClass0cQ.H(this, -1268381160, I);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f70805F.f70631D.size() > 0) {
            this.f70807H.A(this.f70803D);
            getListView().setOnScrollListener(this);
            AnonymousClass0IL parentFragment = getParentFragment();
            if (parentFragment instanceof AnonymousClass6F9) {
                AnonymousClass6F9 anonymousClass6F9 = (AnonymousClass6F9) parentFragment;
                this.f70808I = anonymousClass6F9;
                OnScrollListener iM = anonymousClass6F9.iM();
                iM.G(getListView(), this.f70805F, this.f70808I.f73273D);
                this.f70807H.A(iM);
            }
            setListAdapter(this.f70805F);
            return;
        }
        EmptyStateView emptyStateView = (EmptyStateView) getListView().getEmptyView();
        if (getParentFragment() instanceof AnonymousClass6F9) {
            emptyStateView.setPadding(0, ((AnonymousClass6F9) getParentFragment()).f73273D, 0, 0);
        }
        AnonymousClass2I0 anonymousClass2I0 = AnonymousClass2I0.EMPTY;
        emptyStateView = emptyStateView.G(C0164R.drawable.empty_state_follow, anonymousClass2I0).N(C0164R.string.school_directory_empty_state_title, anonymousClass2I0).L(C0164R.string.school_direcroty_empty_state_description, anonymousClass2I0).B(C0164R.string.school_directory_empty_state_invite_cta, anonymousClass2I0).C(this, anonymousClass2I0);
        int C = AnonymousClass0Ca.C(getContext(), C0164R.color.white);
        for (AnonymousClass2Hx anonymousClass2Hx : emptyStateView.f28623B.values()) {
            anonymousClass2Hx.f28596B = C;
        }
        emptyStateView.A();
    }
}
