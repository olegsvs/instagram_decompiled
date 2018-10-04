package X;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.facebook.C0164R;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5ox */
public final class AnonymousClass5ox extends AnonymousClass0Ie implements AnonymousClass0Ro, AnonymousClass0PZ, OnScrollListener, AnonymousClass0Ii, AnonymousClass0gg, AnonymousClass3Lk, AnonymousClass0IT, AnonymousClass1fG, AnonymousClass3Ny {
    /* renamed from: B */
    public AnonymousClass40P f69161B;
    /* renamed from: C */
    public EmptyStateView f69162C;
    /* renamed from: D */
    public AnonymousClass0jO f69163D;
    /* renamed from: E */
    public String f69164E;
    /* renamed from: F */
    public AnonymousClass0Cm f69165F;
    /* renamed from: G */
    public boolean f69166G;
    /* renamed from: H */
    private AnonymousClass0kd f69167H;
    /* renamed from: I */
    private AnonymousClass0ng f69168I;
    /* renamed from: J */
    private final AnonymousClass0hi f69169J = new AnonymousClass0hi();
    /* renamed from: K */
    private final AnonymousClass0hr f69170K = new AnonymousClass0hr(new AnonymousClass5om(this));
    /* renamed from: L */
    private AnonymousClass0MC f69171L;
    /* renamed from: M */
    private String f69172M;

    public final String getModuleName() {
        return "feed_photos_of_you";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* renamed from: B */
    public static void m28481B(AnonymousClass5ox anonymousClass5ox, boolean z) {
        String str;
        AnonymousClass0ng anonymousClass0ng = anonymousClass5ox.f69168I;
        if (z) {
            str = null;
        } else {
            str = anonymousClass0ng.f10109E;
        }
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass5ox.f69165F);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        AnonymousClass0Pt M = anonymousClass0Pt.L("usertags/%s/feed/", new Object[]{anonymousClass5ox.f69164E}).M(AnonymousClass1Rt.class);
        AnonymousClass0It.F(M, str);
        anonymousClass0ng.C(M.H(), new AnonymousClass5or(anonymousClass5ox, z));
    }

    /* renamed from: C */
    public static void m28482C(AnonymousClass5ox anonymousClass5ox) {
        if (anonymousClass5ox.f69162C != null) {
            ListView listViewSafe = anonymousClass5ox.getListViewSafe();
            if (anonymousClass5ox.uX()) {
                anonymousClass5ox.f69162C.I();
                if (listViewSafe != null) {
                    ((RefreshableListView) listViewSafe).setIsLoading(true);
                    return;
                }
                return;
            }
            if (anonymousClass5ox.UX()) {
                anonymousClass5ox.f69162C.E();
            } else {
                anonymousClass5ox.f69162C.D().A();
            }
            if (listViewSafe != null) {
                ((RefreshableListView) listViewSafe).setIsLoading(false);
            }
        }
    }

    /* renamed from: D */
    private String m28483D() {
        int size = this.f69161B.YR().size();
        if (size == 0) {
            return getString(this.f69166G ? C0164R.string.photos_and_videos_of_you_select_to_hide_title : C0164R.string.photos_of_you_select_to_hide_title);
        }
        return getContext().getResources().getQuantityString(C0164R.plurals.x_selected, size, new Object[]{Integer.valueOf(size)});
    }

    public final void EWA() {
        if (AnonymousClass0cJ.E(getFragmentManager())) {
            getFragmentManager().L();
        }
    }

    public final Map GIA() {
        if (this.f69164E == null) {
            return null;
        }
        Map hashMap = new HashMap();
        hashMap.put("HidePhotosOfYouFragment.USERNAME", this.f69172M);
        hashMap.put("HidePhotosOfYouFragment.USER_ID", this.f69164E);
        return hashMap;
    }

    public final boolean NV() {
        return this.f69161B.isEmpty() ^ 1;
    }

    public final void OZ() {
        AnonymousClass5ox.m28481B(this, false);
    }

    public final boolean QV() {
        return this.f69168I.A();
    }

    public final boolean UX() {
        return this.f69168I.f10111G == AnonymousClass0nq.NEEDS_RETRY;
    }

    public final void Un(AnonymousClass0P7 anonymousClass0P7) {
        this.f69161B.G(anonymousClass0P7);
        AnonymousClass0eT.D(AnonymousClass0eT.E(getActivity()));
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.a(m28483D());
        anonymousClass0eT.n(true);
        if (this.f69161B.YR().size() > 0) {
            anonymousClass0eT.G(C0164R.drawable.hide, this.f69166G ? C0164R.string.photos_and_videos_of_you_hide_option : C0164R.string.photos_of_you_hide_option, new AnonymousClass5os(this));
        }
        AnonymousClass22r A = AnonymousClass0eW.B(AnonymousClass0eV.HIGHLIGHT).A(AnonymousClass0Ca.C(getContext(), C0164R.color.blue_5));
        A.f25416J = AnonymousClass0Ca.C(getContext(), C0164R.color.white);
        A.f25418L = AnonymousClass0Ca.C(getContext(), C0164R.color.blue_6);
        float[] fArr = new float[3];
        Color.colorToHSV(AnonymousClass0Ca.C(getContext(), C0164R.color.blue_5), fArr);
        fArr[2] = fArr[2] * 0.9f;
        A.f25419M = Color.HSVToColor(fArr);
        A.f25417K = false;
        A.f25413G = null;
        A.f25414H = C0164R.drawable.instagram_x_outline_24;
        anonymousClass0eT.d(A.B());
    }

    public final void gC() {
        if (this.f69168I.B()) {
            AnonymousClass5ox.m28481B(this, false);
        }
    }

    public final void oLA() {
        if (getView() != null) {
            AnonymousClass0ib.C(this, getListView());
        }
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 807699113);
        super.onCreate(bundle);
        this.f69165F = AnonymousClass0Ce.G(getArguments());
        this.f69166G = ((Boolean) AnonymousClass0CC.fl.H(this.f69165F)).booleanValue();
        this.f69164E = getArguments().getString("HidePhotosOfYouFragment.USER_ID");
        this.f69172M = getArguments().getString("HidePhotosOfYouFragment.USERNAME");
        AnonymousClass0LH.B(this.f69165F.f1759C.equals(this.f69164E));
        AnonymousClass0MC FD = new AnonymousClass0MD(getContext()).A().XB("com.instagram.android.people.fragment.PhotosOfYouFragment.PHOTOS_OF_YOU_UPDATED", new AnonymousClass5on(this)).FD();
        this.f69171L = FD;
        FD.A();
        this.f69168I = new AnonymousClass0ng(getContext(), this.f69165F.f1759C, getLoaderManager());
        this.f69167H = new AnonymousClass0kd(AnonymousClass0ke.DOWN, 6, this);
        AnonymousClass1ew anonymousClass5oo = new AnonymousClass5oo(this);
        this.f69161B = new AnonymousClass40P(getContext(), this, anonymousClass5oo, this, this, this.f69165F, AnonymousClass1ex.f21064C, false, null);
        this.f69169J.A(this.f69167H);
        AnonymousClass0lj anonymousClass0lj = new AnonymousClass0lj();
        anonymousClass0lj.L(this.f69170K);
        anonymousClass0lj.L(AnonymousClass0kr.B(getActivity()));
        registerLifecycleListenerSet(anonymousClass0lj);
        setListAdapter(this.f69161B);
        this.f69163D = new AnonymousClass0jO(getContext(), this, this.f69165F);
        AnonymousClass5ox.m28481B(this, true);
        AnonymousClass0cQ.G(this, -2123267751, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1394773954);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_feed, viewGroup, false);
        AnonymousClass0cQ.G(this, 1238734942, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, 1254507190);
        this.f69171L.B();
        super.onDestroy();
        AnonymousClass0cQ.G(this, -1032655693, F);
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 1519033700);
        super.onDestroyView();
        this.f69162C = null;
        AnonymousClass0cQ.G(this, 1435352097, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 1665763023);
        super.onResume();
        AnonymousClass0rF.B(this.f69161B, 62160601);
        AnonymousClass0bm.C(this.f69165F).G(0);
        AnonymousClass0cQ.G(this, 2120655785, F);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.I(this, -535422019);
        this.f69169J.onScroll(absListView, i, i2, i3);
        AnonymousClass0cQ.H(this, -356073382, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.I(this, 1010742465);
        this.f69169J.onScrollStateChanged(absListView, i);
        AnonymousClass0cQ.H(this, -257328942, I);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        int i = this.f69166G ? C0164R.string.photos_and_videos_of_you : C0164R.string.photos_of_you;
        EmptyStateView G = ((EmptyStateView) getListView().getEmptyView()).G(C0164R.drawable.empty_state_tag, AnonymousClass2I0.EMPTY);
        int C = AnonymousClass0Ca.C(getContext(), C0164R.color.grey_9);
        AnonymousClass2I0 anonymousClass2I0 = AnonymousClass2I0.EMPTY;
        EmptyStateView L = G.H(C, anonymousClass2I0).N(i, anonymousClass2I0).L(this.f69166G ? C0164R.string.photos_and_videos_of_you_empty_body : C0164R.string.photos_of_you_empty_body, anonymousClass2I0);
        anonymousClass2I0 = AnonymousClass2I0.ERROR;
        L = L.G(C0164R.drawable.loadmore_icon_refresh_compound, anonymousClass2I0);
        this.f69162C = L;
        L.J(new AnonymousClass5oq(this), anonymousClass2I0);
        this.f69162C.A();
        AnonymousClass5ox.m28482C(this);
        RefreshableListView refreshableListView = (RefreshableListView) getListView();
        refreshableListView.setupAndEnableRefresh(new AnonymousClass5op(this, refreshableListView));
        refreshableListView.setOnScrollListener(this);
    }

    public final boolean tX() {
        if (uX()) {
            if (this.f69161B.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public final boolean uX() {
        return this.f69168I.f10111G == AnonymousClass0nq.LOADING;
    }
}
