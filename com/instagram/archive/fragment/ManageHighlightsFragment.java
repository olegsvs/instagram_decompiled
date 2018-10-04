package com.instagram.archive.fragment;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IL;
import X.AnonymousClass0IS;
import X.AnonymousClass0IT;
import X.AnonymousClass0Ih;
import X.AnonymousClass0Iz;
import X.AnonymousClass0JK;
import X.AnonymousClass0Jd;
import X.AnonymousClass0P2;
import X.AnonymousClass0bw;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eT;
import X.AnonymousClass1LM;
import X.AnonymousClass1LP;
import X.AnonymousClass2zg;
import X.AnonymousClass30A;
import X.AnonymousClass30B;
import X.AnonymousClass30V;
import X.AnonymousClass30X;
import X.AnonymousClass30Y;
import X.AnonymousClass30i;
import X.AnonymousClass30m;
import X.AnonymousClass30o;
import X.AnonymousClass30z;
import X.AnonymousClass491;
import X.AnonymousClass49L;
import X.AnonymousClass49N;
import X.AnonymousClass49P;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.C0164R;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import java.util.ArrayList;
import java.util.List;

public class ManageHighlightsFragment extends AnonymousClass0IJ implements AnonymousClass0IS, AnonymousClass0bw, AnonymousClass0IT, AnonymousClass30X, AnonymousClass30i, AnonymousClass30o {
    /* renamed from: B */
    public boolean f50905B;
    /* renamed from: C */
    public AnonymousClass49P f50906C;
    /* renamed from: D */
    public boolean f50907D;
    /* renamed from: E */
    public String f50908E;
    /* renamed from: F */
    public AnonymousClass30Y f50909F;
    /* renamed from: G */
    public AnonymousClass30z f50910G;
    /* renamed from: H */
    public AnonymousClass0Cm f50911H;
    /* renamed from: I */
    private List f50912I;
    public AnonymousClass1LM mTabbedFragmentController;

    /* renamed from: B */
    public static void m23431B(ManageHighlightsFragment manageHighlightsFragment) {
        AnonymousClass30Y.m18168B();
        manageHighlightsFragment.f50909F = null;
        if (!manageHighlightsFragment.f50907D) {
            synchronized (AnonymousClass30V.class) {
                if (AnonymousClass30V.f36813C != null) {
                    AnonymousClass30V.f36813C = null;
                }
            }
        }
    }

    /* renamed from: C */
    private boolean m23432C() {
        if (!(AnonymousClass30Y.m18171E().f36823D.isEmpty() && ((Boolean) AnonymousClass0CC.oN.H(this.f50911H)).booleanValue())) {
            if (this.f50907D) {
                AnonymousClass30Y anonymousClass30Y = this.f50909F;
                if (anonymousClass30Y != null && anonymousClass30Y.m18178G().isEmpty()) {
                }
            }
            return true;
        }
        return false;
    }

    public final void JC(String str) {
        String trim = str.trim();
        if (trim.isEmpty() && !((Boolean) AnonymousClass0CC.oN.H(this.f50911H)).booleanValue()) {
            trim = getString(C0164R.string.highlights_name_hint);
        }
        AnonymousClass30Y.m18171E().f36823D = trim;
        AnonymousClass0eT.D(AnonymousClass0eT.E(getActivity()));
    }

    public final void Zi() {
        getActivity().setResult(-1);
        getActivity().finish();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0IL aF(Object obj) {
        switch (((AnonymousClass49P) obj).ordinal()) {
            case 0:
                AnonymousClass0IL anonymousClass491 = new AnonymousClass491();
                anonymousClass491.setArguments(getArguments());
                return anonymousClass491;
            case 1:
                Bundle arguments = getArguments();
                arguments.putSerializable("highlight_management_source", this.f50910G);
                arguments.putBoolean("hide_footer", true);
                return AnonymousClass0JK.f2907B.C().A(arguments);
            default:
                throw new IllegalArgumentException("invalid position");
        }
    }

    public final void ar() {
        AnonymousClass0eT.D(AnonymousClass0eT.E(getActivity()));
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.Z(C0164R.string.highlights_management_title);
        anonymousClass0eT.n(true);
        anonymousClass0eT.l(false);
        if (m23432C()) {
            anonymousClass0eT.Q(getResources().getString(C0164R.string.done), new AnonymousClass49L(this));
        } else {
            anonymousClass0eT.P(getResources().getString(C0164R.string.done));
        }
    }

    public final String getModuleName() {
        return this.f50906C == AnonymousClass49P.SELECTED ? "edit_reel_highlights" : "reel_highlights_gallery";
    }

    public final /* bridge */ /* synthetic */ void oCA(Object obj) {
        AnonymousClass49P anonymousClass49P = (AnonymousClass49P) obj;
        if (isResumed() && anonymousClass49P != this.f50906C) {
            AnonymousClass0Iz anonymousClass0Iz = AnonymousClass0Iz.f2854L;
            anonymousClass0Iz.K(this, getFragmentManager().H(), getModuleName());
            ((AnonymousClass0Ih) this.mTabbedFragmentController.L(this.f50906C)).zs();
            this.f50906C = anonymousClass49P;
            anonymousClass0Iz.H(this);
            ((AnonymousClass0Ih) this.mTabbedFragmentController.L(this.f50906C)).Jt();
        }
    }

    public final boolean onBackPressed() {
        if (this.f50905B) {
            this.f50905B = false;
            return false;
        }
        if (this.f50907D) {
            AnonymousClass30Y anonymousClass30Y = this.f50909F;
            if (anonymousClass30Y != null) {
                if (anonymousClass30Y.m18174C().m18167A()) {
                    m23431B(this);
                    return false;
                }
                new AnonymousClass0P2(getContext()).V(C0164R.string.suggested_highlight_discard_changes_dialog_title).K(C0164R.string.suggested_highlight_discard_changes_dialog_body).N(C0164R.string.suggested_highlight_discard_changes_dialog_discard_button, new AnonymousClass49N(this)).S(C0164R.string.suggested_highlight_discard_changes_dialog_keep_button, null).A().show();
                return true;
            }
        }
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -510116525);
        super.onCreate(bundle);
        AnonymousClass30Y.m18168B();
        this.f50911H = AnonymousClass0Ce.G(getArguments());
        this.f50909F = AnonymousClass30Y.m18171E();
        this.f50908E = getArguments().getString("edit_highlights_reel_id");
        this.f50907D = getArguments().getBoolean("edit_highlights_is_suggested_highlight", false);
        this.f50910G = (AnonymousClass30z) getArguments().getSerializable("highlight_management_source");
        List arrayList = new ArrayList();
        this.f50912I = arrayList;
        arrayList.add(AnonymousClass49P.SELECTED);
        this.f50912I.add(AnonymousClass49P.ARCHIVE);
        AnonymousClass0cQ.G(this, 384228140, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -2122518221);
        View inflate = layoutInflater.inflate(AnonymousClass30m.m18193G(this.f50911H) ? C0164R.layout.archive_tabbed_fragment : C0164R.layout.archive_legacy_tabbed_fragment, viewGroup, false);
        AnonymousClass0cQ.G(this, 1175930167, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -2051229930);
        super.onDestroyView();
        AnonymousClass30Y anonymousClass30Y = this.f50909F;
        if (anonymousClass30Y != null) {
            anonymousClass30Y.m18180I(this);
        }
        AnonymousClass0cQ.G(this, 2114966907, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AnonymousClass1LM anonymousClass1LM = new AnonymousClass1LM(this, getChildFragmentManager(), (ViewPager) view.findViewById(C0164R.id.tabs_viewpager), (FixedTabBar) view.findViewById(C0164R.id.fixed_tabbar_view), this.f50912I);
        this.mTabbedFragmentController = anonymousClass1LM;
        AnonymousClass49P anonymousClass49P = AnonymousClass49P.SELECTED;
        anonymousClass1LM.O(anonymousClass49P);
        this.f50906C = anonymousClass49P;
        this.f50909F.m18172A(this);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(C0164R.id.edit_highlights_metadata_container);
        if (frameLayout != null) {
            AnonymousClass30Y.m18171E().m18179H(AnonymousClass0Jd.f2931B.M(r5.f50911H).D(getArguments().getString("edit_highlights_reel_id")));
            View C = AnonymousClass30B.m18157C(frameLayout);
            frameLayout.addView(C);
            AnonymousClass30B.m18156B(getContext(), (AnonymousClass30A) C.getTag(), new AnonymousClass2zg(r5.f50909F.m18171E(), r5.f50909F.f36823D), r5, r5.f50911H);
        }
    }

    public final AnonymousClass1LP vF(Object obj) {
        return AnonymousClass1LP.D(((AnonymousClass49P) obj).f50916B);
    }
}
