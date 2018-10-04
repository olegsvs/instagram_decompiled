package X;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.modal.ModalActivity;
import com.instagram.pendingmedia.model.PendingRecipient;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.5Uw */
public final class AnonymousClass5Uw extends AnonymousClass0Ie implements AnonymousClass4eU, AnonymousClass0Ii, AnonymousClass0IT {
    /* renamed from: S */
    public static final String f65103S = "DirectPermissionsInboxFragment";
    /* renamed from: B */
    public final Handler f65104B = new Handler(Looper.getMainLooper());
    /* renamed from: C */
    public AnonymousClass0Ud f65105C;
    /* renamed from: D */
    public final HashSet f65106D = new HashSet();
    /* renamed from: E */
    public boolean f65107E;
    /* renamed from: F */
    public AnonymousClass0Tw f65108F;
    /* renamed from: G */
    public AnonymousClass0Cm f65109G;
    /* renamed from: H */
    private AnonymousClass4Yn f65110H;
    /* renamed from: I */
    private TextView f65111I;
    /* renamed from: J */
    private final AnonymousClass3Lk f65112J = new AnonymousClass4aO(this);
    /* renamed from: K */
    private View f65113K;
    /* renamed from: L */
    private TextView f65114L;
    /* renamed from: M */
    private EmptyStateView f65115M;
    /* renamed from: N */
    private boolean f65116N;
    /* renamed from: O */
    private final Set f65117O = new HashSet();
    /* renamed from: P */
    private View f65118P;
    /* renamed from: Q */
    private AnonymousClass4aY f65119Q;
    /* renamed from: R */
    private final AnonymousClass0F8 f65120R = new AnonymousClass4aN(this);

    public final boolean By(AnonymousClass0Vw anonymousClass0Vw) {
        return false;
    }

    public final void GVA(String str, AnonymousClass2LY anonymousClass2LY) {
    }

    public final void Tm(RectF rectF) {
    }

    public final void fGA(AnonymousClass0Vw anonymousClass0Vw, RectF rectF, AnonymousClass5bS anonymousClass5bS) {
    }

    public final String getModuleName() {
        return "direct_permissions_inbox";
    }

    public final void jv(AnonymousClass0Vw anonymousClass0Vw, AnonymousClass0MI anonymousClass0MI, AnonymousClass10I anonymousClass10I) {
    }

    public final boolean xx(AnonymousClass0Vw anonymousClass0Vw, RectF rectF) {
        return false;
    }

    /* renamed from: A */
    public final AnonymousClass4Yn m27113A() {
        AnonymousClass5Uw anonymousClass5Uw = this;
        if (this.f65110H == null) {
            anonymousClass5Uw.f65110H = new AnonymousClass4Yn(getContext(), this.f65109G, anonymousClass5Uw, anonymousClass5Uw, false, false, this.f65116N);
        }
        return anonymousClass5Uw.f65110H;
    }

    /* renamed from: B */
    public static void m27106B(AnonymousClass5Uw anonymousClass5Uw, boolean z) {
        anonymousClass5Uw.f65107E = z;
        anonymousClass5Uw.f65105C.f5498G.C(true);
    }

    /* renamed from: C */
    public static void m27107C(AnonymousClass5Uw anonymousClass5Uw) {
        if (anonymousClass5Uw.isResumed()) {
            anonymousClass5Uw.f65118P.setVisibility(8);
            AnonymousClass0OR.D(anonymousClass5Uw.f65104B, new AnonymousClass4aM(anonymousClass5Uw), -1026866813);
        }
    }

    /* renamed from: D */
    public static void m27108D(AnonymousClass5Uw anonymousClass5Uw, boolean z) {
        anonymousClass5Uw.f65116N = z;
        if (!z) {
            anonymousClass5Uw.f65106D.clear();
        }
        AnonymousClass0eT.D(AnonymousClass0eT.E(anonymousClass5Uw.getActivity()));
        BaseAdapter baseAdapter = anonymousClass5Uw.f65110H;
        Object obj = baseAdapter.f55213B != z ? 1 : null;
        baseAdapter.f55213B = z;
        if (obj != null) {
            AnonymousClass0rF.B(baseAdapter, -2138276683);
        }
        AnonymousClass5Uw.m27110F(anonymousClass5Uw);
    }

    /* renamed from: E */
    public static void m27109E(AnonymousClass5Uw anonymousClass5Uw) {
        if (anonymousClass5Uw.f65115M == null) {
            return;
        }
        if ((anonymousClass5Uw.m27113A().f28662D.isEmpty() ^ 1) != 0) {
            anonymousClass5Uw.f65115M.setVisibility(8);
            return;
        }
        anonymousClass5Uw.f65115M.setVisibility(0);
        if (anonymousClass5Uw.f65105C.f5498G.f14900G) {
            anonymousClass5Uw.f65115M.I();
        } else {
            anonymousClass5Uw.f65115M.D();
        }
    }

    /* renamed from: F */
    public static void m27110F(AnonymousClass5Uw anonymousClass5Uw) {
        if (anonymousClass5Uw.f65106D.isEmpty()) {
            anonymousClass5Uw.f65113K.setVisibility(8);
            anonymousClass5Uw.f65111I.setVisibility(8);
            anonymousClass5Uw.f65114L.setText(C0164R.string.direct_permissions_choice_decline_all);
            return;
        }
        anonymousClass5Uw.f65113K.setVisibility(0);
        anonymousClass5Uw.f65114L.setText(anonymousClass5Uw.getResources().getQuantityString(C0164R.plurals.direct_permissions_choice_decline, anonymousClass5Uw.f65106D.size(), new Object[]{Integer.valueOf(anonymousClass5Uw.f65106D.size())}));
        anonymousClass5Uw.f65111I.setVisibility(0);
        anonymousClass5Uw.f65111I.setText(anonymousClass5Uw.getResources().getQuantityString(C0164R.plurals.direct_permissions_choice_allow, anonymousClass5Uw.f65106D.size(), new Object[]{Integer.valueOf(anonymousClass5Uw.f65106D.size())}));
    }

    /* renamed from: G */
    public static void m27111G(AnonymousClass5Uw anonymousClass5Uw) {
        Collection a = anonymousClass5Uw.f65108F.a(true);
        BaseAdapter A = anonymousClass5Uw.m27113A();
        A.f28662D.clear();
        A.f28662D.addAll(a);
        A.f28660B = true;
        AnonymousClass0rF.B(A, 712575397);
        if (anonymousClass5Uw.isVisible()) {
            AnonymousClass18J anonymousClass18J = anonymousClass5Uw.f65105C.f5498G;
            if (!anonymousClass18J.f14900G && anonymousClass18J.f14896C && (anonymousClass5Uw.m27113A().f28662D.isEmpty() ^ 1) == 0) {
                anonymousClass5Uw.f65108F.I();
                AnonymousClass5Uw.m27107C(anonymousClass5Uw);
            }
            AnonymousClass5Uw.m27109E(anonymousClass5Uw);
        }
    }

    /* renamed from: H */
    private void m27112H(int i) {
        if (getActivity().getParent() != null) {
            ((AnonymousClass0Hj) getActivity().getParent()).CSA(i);
        }
    }

    public final void Jo(AnonymousClass0Vw anonymousClass0Vw) {
        if (this.f65117O.add(anonymousClass0Vw.O())) {
            anonymousClass0Vw = anonymousClass0Vw.J();
            AnonymousClass0NN B = AnonymousClass0NN.B("direct_candidates_impression", this);
            AnonymousClass0V1.B(B, anonymousClass0Vw);
            if (anonymousClass0Vw.size() == 1) {
                B.F("a_pk", ((AnonymousClass0Ck) anonymousClass0Vw.get(0)).getId());
            }
            B.R();
        }
    }

    public final boolean aY(String str) {
        return this.f65106D.contains(str);
    }

    public final void cDA(String str) {
        if (!this.f65106D.add(str)) {
            this.f65106D.remove(str);
        }
        AnonymousClass5Uw.m27110F(this);
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        if (this.f65116N) {
            anonymousClass0eT.g(C0164R.string.direct_permission_select, new AnonymousClass4aV(this));
            anonymousClass0eT.j(this);
            anonymousClass0eT.n(false);
            return;
        }
        anonymousClass0eT.Z(C0164R.string.direct_message_requests);
        anonymousClass0eT.j(this);
        anonymousClass0eT.n(true);
        AnonymousClass22r B = AnonymousClass0eW.B(AnonymousClass0eV.DEFAULT);
        B.f25413G = new AnonymousClass4aT(this);
        anonymousClass0eT.d(B.B());
        anonymousClass0eT.F(AnonymousClass0eb.OVERFLOW, new AnonymousClass4aU(this));
    }

    public final void oLA() {
        if (getView() != null) {
            AnonymousClass0ib.C(this, getListView());
        }
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 529685951);
        super.onCreate(bundle);
        this.f65109G = AnonymousClass0Ce.G(getArguments());
        this.f65119Q = new AnonymousClass4aY(this, this.f65109G);
        this.f65105C = AnonymousClass0Ud.B(this.f65109G);
        this.f65108F = AnonymousClass0Tw.C(this.f65109G);
        AnonymousClass5Uw.m27106B(this, true);
        AnonymousClass0F4.f2058E.A(AnonymousClass0W6.class, this.f65120R);
        AnonymousClass0cQ.G(this, 1481536170, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1179830502);
        View inflate = layoutInflater.inflate(C0164R.layout.fragment_direct_permissions_inbox, viewGroup, false);
        this.f65115M = (EmptyStateView) inflate.findViewById(C0164R.id.direct_empty_view);
        AnonymousClass0cQ.G(this, -22299505, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, 282872806);
        super.onDestroy();
        AnonymousClass0F4.f2058E.D(AnonymousClass0W6.class, this.f65120R);
        AnonymousClass0cQ.G(this, 453286693, F);
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -135863150);
        super.onDestroyView();
        this.f65113K = null;
        this.f65115M = null;
        this.f65118P = null;
        this.f65114L = null;
        this.f65111I = null;
        AnonymousClass18J anonymousClass18J = this.f65105C.f5498G;
        anonymousClass18J.f14895B.remove(this.f65119Q);
        AnonymousClass0cQ.G(this, 131390146, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -1470964181);
        super.onPause();
        m27112H(0);
        AnonymousClass0cQ.G(this, -1405384663, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -2021153068);
        super.onResume();
        AnonymousClass0eT.E(getActivity()).R(this);
        AnonymousClass5Uw.m27108D(this, this.f65116N);
        AnonymousClass5Uw.m27111G(this);
        m27112H(8);
        AnonymousClass0cQ.G(this, 1353305428, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Context context = getContext();
        ViewGroup listView = getListView();
        View inflate = LayoutInflater.from(context).inflate(C0164R.layout.direct_permissions_inbox_header, listView, false);
        TextView textView = (TextView) inflate.findViewById(C0164R.id.permissions_inbox_header_title);
        if (((Boolean) AnonymousClass0CC.KG.H(this.f65109G)).booleanValue()) {
            textView.setText(C0164R.string.direct_blended_inbox_header_description);
        } else {
            textView.setText(C0164R.string.direct_pending_inbox_instructions);
        }
        listView.addHeaderView(inflate);
        setListAdapter(m27113A());
        ((RefreshableListView) listView).setupAndEnableRefresh(new AnonymousClass4aP(this));
        listView.setOnScrollListener(new AnonymousClass0kd(AnonymousClass0ke.DOWN, 5, this.f65112J));
        this.f65115M.J(new AnonymousClass4aQ(this), AnonymousClass2I0.ERROR).A();
        this.f65118P = view.findViewById(C0164R.id.permissions_all);
        this.f65113K = view.findViewById(C0164R.id.permissions_choice_button_divider);
        TextView textView2 = (TextView) view.findViewById(C0164R.id.permissions_choice_decline_all);
        this.f65114L = textView2;
        textView2.setOnClickListener(new AnonymousClass4aR(this, context));
        textView2 = (TextView) view.findViewById(C0164R.id.permissions_choice_allow_all);
        this.f65111I = textView2;
        textView2.setOnClickListener(new AnonymousClass4aS(this, context));
        AnonymousClass18J anonymousClass18J = this.f65105C.f5498G;
        AnonymousClass0Iw anonymousClass0Iw = this.f65119Q;
        anonymousClass18J.f14895B.add(anonymousClass0Iw);
        if (anonymousClass18J.f14900G) {
            anonymousClass0Iw.onStart();
        }
        AnonymousClass5Uw.m27109E(this);
        AnonymousClass0NN.B("direct_requests_enter_pending_inbox", this).B("total_requests", this.f65108F.X()).R();
    }

    public final void wr(int i, AnonymousClass0Vw anonymousClass0Vw) {
        String str = "pending_inbox";
        AnonymousClass0Sn anonymousClass0Sn = new AnonymousClass0Sn(ModalActivity.class, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, AnonymousClass0J7.f2895B.N().C(anonymousClass0Vw.F().f5871C, null, PendingRecipient.B(anonymousClass0Vw.J()), true, 0, str, null, null, AnonymousClass4lG.B(str).f56888B), getActivity(), this.f65109G.f1759C);
        anonymousClass0Sn.f5013B = ModalActivity.f5023D;
        anonymousClass0Sn.B(getContext());
    }

    public final boolean zr(int i, AnonymousClass0Vw anonymousClass0Vw, RectF rectF) {
        if (this.f65116N) {
            return false;
        }
        new AnonymousClass0Sb(getContext()).G(new String[]{getString(C0164R.string.direct_permissions_choice_allow), getString(C0164R.string.direct_permissions_choice_decline)}, new AnonymousClass4aL(this, anonymousClass0Vw)).E(true).F(true).C().show();
        return true;
    }
}
