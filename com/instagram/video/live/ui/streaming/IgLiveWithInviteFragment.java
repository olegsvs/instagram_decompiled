package com.instagram.video.live.ui.streaming;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ca;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0E6;
import X.AnonymousClass0GA;
import X.AnonymousClass0IE;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IL;
import X.AnonymousClass0IS;
import X.AnonymousClass0Nm;
import X.AnonymousClass0Pt;
import X.AnonymousClass0Pu;
import X.AnonymousClass0Px;
import X.AnonymousClass0Pz;
import X.AnonymousClass0VB;
import X.AnonymousClass0bz;
import X.AnonymousClass0cQ;
import X.AnonymousClass0ip;
import X.AnonymousClass1ev;
import X.AnonymousClass3dl;
import X.AnonymousClass3e1;
import X.AnonymousClass3ig;
import X.AnonymousClass3ih;
import X.AnonymousClass3j1;
import X.AnonymousClass3kY;
import X.AnonymousClass3nX;
import X.AnonymousClass3oc;
import X.AnonymousClass5MP;
import X.AnonymousClass5aa;
import X.AnonymousClass694;
import X.AnonymousClass69B;
import X.AnonymousClass69C;
import X.AnonymousClass69D;
import X.AnonymousClass69E;
import X.AnonymousClass69G;
import X.AnonymousClass69H;
import X.AnonymousClass69I;
import X.AnonymousClass69J;
import X.AnonymousClass69K;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class IgLiveWithInviteFragment extends AnonymousClass0IJ implements AnonymousClass3ih, AnonymousClass0IS, AnonymousClass0VB, AnonymousClass3j1, AnonymousClass3kY, AnonymousClass1ev {
    /* renamed from: R */
    public static final long f73714R;
    /* renamed from: S */
    public static final long f73715S;
    /* renamed from: T */
    public static final long f73716T;
    /* renamed from: B */
    public AnonymousClass69K f73717B;
    /* renamed from: C */
    public Drawable f73718C;
    /* renamed from: D */
    public Drawable f73719D;
    /* renamed from: E */
    public final Runnable f73720E = new AnonymousClass69D(this);
    /* renamed from: F */
    public final Runnable f73721F = new AnonymousClass69C(this);
    /* renamed from: G */
    public final Handler f73722G = new Handler();
    /* renamed from: H */
    public boolean f73723H = false;
    /* renamed from: I */
    public List f73724I = new ArrayList();
    /* renamed from: J */
    public int f73725J;
    /* renamed from: K */
    public AnonymousClass3e1 f73726K;
    /* renamed from: L */
    public boolean f73727L = true;
    /* renamed from: M */
    public AnonymousClass0Cm f73728M;
    /* renamed from: N */
    public List f73729N = new ArrayList();
    /* renamed from: O */
    public AnonymousClass5aa f73730O;
    /* renamed from: P */
    private String f73731P;
    /* renamed from: Q */
    private AnonymousClass69B f73732Q;
    public TextView mActionButton;
    public ViewGroup mBottomControlsContainer;
    public View mInviteDescription;
    public ListView mListView;
    public View mMainView;
    public View mNullStateView;
    public View mSpinner;
    public TypeaheadHeader mTypeaheadHeader;

    public final void Dz() {
    }

    public final int FK() {
        return -1;
    }

    public final String getModuleName() {
        return "live_with_invite";
    }

    public final boolean nW() {
        return true;
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f73716T = timeUnit.toMillis(2);
        f73715S = timeUnit.toMillis(2);
        f73714R = timeUnit.toMillis(10);
    }

    /* renamed from: B */
    public static void m29770B(IgLiveWithInviteFragment igLiveWithInviteFragment) {
        String str = igLiveWithInviteFragment.f73731P;
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(igLiveWithInviteFragment.f73728M);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        AnonymousClass0GA H = anonymousClass0Pt.L("live/%s/get_join_requests/", new Object[]{str}).M(AnonymousClass3nX.class).H();
        H.f2849B = new AnonymousClass69J(igLiveWithInviteFragment);
        igLiveWithInviteFragment.schedule(H);
    }

    /* renamed from: C */
    public static void m29771C(IgLiveWithInviteFragment igLiveWithInviteFragment) {
        AnonymousClass0GA D = AnonymousClass0Pz.D(igLiveWithInviteFragment.f73728M, igLiveWithInviteFragment.f73731P);
        D.f2849B = new AnonymousClass69I(igLiveWithInviteFragment);
        igLiveWithInviteFragment.schedule(D);
    }

    public final void Cz() {
        if (this.f73726K.UX()) {
            AnonymousClass3e1 anonymousClass3e1 = this.f73726K;
            anonymousClass3e1.mQA(anonymousClass3e1.LQ());
        }
    }

    /* renamed from: D */
    public static AnonymousClass69B m29772D(IgLiveWithInviteFragment igLiveWithInviteFragment) {
        if (igLiveWithInviteFragment.f73732Q == null) {
            igLiveWithInviteFragment.f73732Q = new AnonymousClass69B(igLiveWithInviteFragment.getContext(), igLiveWithInviteFragment);
        }
        return igLiveWithInviteFragment.f73732Q;
    }

    /* renamed from: E */
    public static AnonymousClass3oc m29773E(AnonymousClass694 anonymousClass694) {
        return anonymousClass694 == AnonymousClass694.JOIN_REQUESTS ? AnonymousClass3oc.INVITE_SCREEN_REQUESTS_SECTION : AnonymousClass3oc.INVITE_SCREEN;
    }

    /* renamed from: F */
    public static void m29774F(IgLiveWithInviteFragment igLiveWithInviteFragment, AnonymousClass69K anonymousClass69K) {
        int i;
        int i2;
        Drawable drawable;
        switch (anonymousClass69K.ordinal()) {
            case 0:
                i = C0164R.string.cancel;
                i2 = C0164R.color.grey_9;
                if (igLiveWithInviteFragment.f73719D == null) {
                    Drawable stateListDrawable = new StateListDrawable();
                    stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(AnonymousClass0Ca.C(igLiveWithInviteFragment.getContext(), C0164R.color.grey_1)));
                    stateListDrawable.addState(new int[0], new ColorDrawable(AnonymousClass0Ca.C(igLiveWithInviteFragment.getContext(), C0164R.color.white)));
                    igLiveWithInviteFragment.f73719D = stateListDrawable;
                }
                drawable = igLiveWithInviteFragment.f73719D;
                break;
            case 1:
                i = C0164R.string.add;
                i2 = C0164R.color.white;
                if (igLiveWithInviteFragment.f73718C == null) {
                    igLiveWithInviteFragment.f73718C = AnonymousClass0Ca.E(igLiveWithInviteFragment.getContext(), C0164R.drawable.iglive_send_button);
                }
                drawable = igLiveWithInviteFragment.f73718C;
                break;
            default:
                throw new IllegalArgumentException("Unhandled ActionButtonMode.");
        }
        igLiveWithInviteFragment.mActionButton.setText(i);
        igLiveWithInviteFragment.mActionButton.setTextColor(AnonymousClass0Ca.C(igLiveWithInviteFragment.getContext(), i2));
        igLiveWithInviteFragment.mActionButton.setBackground(drawable);
        igLiveWithInviteFragment.f73717B = anonymousClass69K;
    }

    /* renamed from: G */
    public static void m29775G(IgLiveWithInviteFragment igLiveWithInviteFragment) {
        m29772D(igLiveWithInviteFragment).m29222G(TextUtils.isEmpty(igLiveWithInviteFragment.f73726K.LQ()));
    }

    /* renamed from: H */
    public static void m29776H(IgLiveWithInviteFragment igLiveWithInviteFragment) {
        m29774F(igLiveWithInviteFragment, Collections.unmodifiableSet(m29772D(igLiveWithInviteFragment).f72279L).isEmpty() ? AnonymousClass69K.CANCEL : AnonymousClass69K.ADD);
    }

    /* renamed from: I */
    private void m29777I(int i) {
        this.f73725J = i;
        if (this.mMainView != null) {
            AnonymousClass0Nm.a(this.mListView, this.f73725J + (AnonymousClass0ip.B(getContext()) + getResources().getDimensionPixelSize(C0164R.dimen.action_bar_item_padding)));
        }
    }

    public final float PW() {
        return AnonymousClass0bz.f6936Q;
    }

    public final void Pv(AnonymousClass3e1 anonymousClass3e1) {
        AnonymousClass69B D;
        if (TextUtils.isEmpty(anonymousClass3e1.LQ())) {
            m29772D(this).f72280M = false;
            D = m29772D(this);
            Collection collection = this.f73729N;
            D.f72281N.clear();
            D.f72281N.addAll(collection);
            AnonymousClass69B.m29220E(D);
            D = m29772D(this);
            collection = this.f73724I;
            D.f72272E.clear();
            D.f72272E.addAll(collection);
            AnonymousClass69B.m29220E(D);
            m29772D(this).m29221F((List) anonymousClass3e1.uQ());
        } else {
            boolean uX = anonymousClass3e1.uX();
            boolean UX = anonymousClass3e1.UX();
            if ((uX || UX) && ((List) anonymousClass3e1.uQ()).isEmpty()) {
                String string;
                int C;
                if (UX) {
                    string = getResources().getString(C0164R.string.search_for_x, new Object[]{r5});
                    C = AnonymousClass0Ca.C(getContext(), C0164R.color.blue_5);
                } else {
                    string = getContext().getString(C0164R.string.searching);
                    C = AnonymousClass0Ca.C(getContext(), C0164R.color.grey_5);
                }
                AnonymousClass69B D2 = m29772D(this);
                if (D2.f72275H != null) {
                    D2.f72280M = true;
                    D2.f72277J.f43664B = uX;
                    D2.f72276I.A(string, C);
                }
            } else {
                m29772D(this).f72280M = false;
            }
            D = m29772D(this);
            List list = (List) anonymousClass3e1.uQ();
            D.f72281N.retainAll(list);
            D.f72272E.retainAll(list);
            D.m29221F(list);
        }
        m29775G(this);
    }

    public final void Tp() {
        m29777I(0);
    }

    public final void Up(int i) {
        m29777I(i);
    }

    public final boolean VY() {
        ListView listView = this.mListView;
        if (!(listView == null || listView.getChildCount() == 0)) {
            if (this.mListView.canScrollVertically(-1)) {
                return false;
            }
        }
        return true;
    }

    public final void We() {
        if (getTargetFragment() != null && getTargetRequestCode() == 1 && this.f73723H) {
            this.f73723H = false;
            getTargetFragment().onActivityResult(getTargetRequestCode(), -1, null);
        }
    }

    public final void Xe(int i, int i2) {
        this.mBottomControlsContainer.setTranslationY((float) ((-i) - i2));
    }

    /* renamed from: b */
    public final void m29778b(int i, int i2, int i3, int i4) {
        if (this.f73727L) {
            this.mSpinner.setVisibility(0);
            this.mInviteDescription.setVisibility(8);
            this.mTypeaheadHeader.setVisibility(8);
            this.mNullStateView.setVisibility(8);
            return;
        }
        this.mSpinner.setVisibility(8);
        if (i == 0 && TextUtils.isEmpty(this.f73726K.LQ())) {
            this.mTypeaheadHeader.setVisibility(8);
            this.mInviteDescription.setVisibility(8);
            this.mNullStateView.setVisibility(0);
            View view = this.mMainView;
            if (view != null) {
                AnonymousClass0Nm.N(view);
            }
        } else {
            this.mTypeaheadHeader.setVisibility(0);
            this.mInviteDescription.setVisibility(0);
            this.mNullStateView.setVisibility(8);
        }
        m29776H(this);
        if (TextUtils.isEmpty(this.f73726K.LQ())) {
            this.f73730O.m27745I(i3, i4, i2, AnonymousClass3oc.INVITE_SCREEN);
        }
    }

    public final View oS() {
        return getView();
    }

    public final boolean onBackPressed() {
        View view = this.mMainView;
        if (view != null) {
            AnonymousClass0Nm.N(view);
        }
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1450022171);
        super.onCreate(bundle);
        this.f73728M = AnonymousClass0Ce.G(getArguments());
        this.f73731P = getArguments().getString("IgLiveWithInviteFragment.ARGUMENTS_KEY_EXTRA_BROADCAST_ID");
        this.f73730O = AnonymousClass5MP.m26326B(this.f73728M).f62619B;
        AnonymousClass0cQ.G(this, 1947922352, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AnonymousClass0IL anonymousClass0IL = this;
        int F = AnonymousClass0cQ.F(this, -1809235867);
        View inflate = layoutInflater.inflate(C0164R.layout.fragment_live_with_invite, viewGroup, false);
        this.mMainView = inflate;
        this.mInviteDescription = inflate.findViewById(C0164R.id.live_with_invite_description);
        this.mListView = (ListView) this.mMainView.findViewById(16908298);
        this.mBottomControlsContainer = (ViewGroup) this.mMainView.findViewById(C0164R.id.live_with_invite_bottom_control_container);
        this.mActionButton = (TextView) this.mMainView.findViewById(C0164R.id.live_with_invite_action_button);
        this.mNullStateView = this.mMainView.findViewById(C0164R.id.live_with_no_viewers);
        this.mSpinner = this.mMainView.findViewById(C0164R.id.live_with_invite_spinner);
        if (((Boolean) AnonymousClass0CC.jR.H(this.f73728M)).booleanValue()) {
            AnonymousClass3ig.B(this.mMainView, C0164R.id.live_pivot_reshare).A().findViewById(C0164R.id.live_direct_invite_button).setOnClickListener(new AnonymousClass69E(this));
        }
        TypeaheadHeader typeaheadHeader = (TypeaheadHeader) this.mMainView.findViewById(C0164R.id.typeahead_header);
        this.mTypeaheadHeader = typeaheadHeader;
        typeaheadHeader.setDelegate(this);
        this.mTypeaheadHeader.D(getString(C0164R.string.search));
        this.mListView.setAdapter(m29772D(this));
        m29774F(this, AnonymousClass69K.CANCEL);
        this.mActionButton.setOnClickListener(new AnonymousClass69H(this));
        m29771C(this);
        m29770B(this);
        AnonymousClass3e1 B = AnonymousClass3dl.B(this.f73728M, new AnonymousClass0Px(getContext(), getLoaderManager()), anonymousClass0IL, (String) AnonymousClass0E6.D(AnonymousClass0CC.XS, this.f73728M), new AnonymousClass69G(anonymousClass0IL), null, anonymousClass0IL, true);
        anonymousClass0IL.f73726K = B;
        B.EPA(anonymousClass0IL);
        inflate = anonymousClass0IL.mMainView;
        AnonymousClass0cQ.G(anonymousClass0IL, -892026507, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, -684839579);
        super.onDestroy();
        this.f73730O = null;
        AnonymousClass0cQ.G(this, 213027060, F);
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -1566084188);
        super.onDestroyView();
        this.f73722G.removeCallbacksAndMessages(null);
        AnonymousClass0cQ.G(this, 2146786497, F);
    }

    public final void searchTextChanged(String str) {
        Object G = AnonymousClass0IE.G(str);
        if (TextUtils.isEmpty(G)) {
            m29772D(this).f72280M = false;
        } else {
            AnonymousClass0CC.XS.E(this.f73728M);
        }
        this.f73726K.mQA(G);
    }
}
