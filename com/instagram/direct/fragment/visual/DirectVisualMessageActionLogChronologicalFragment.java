package com.instagram.direct.fragment.visual;

import X.AnonymousClass0IJ;
import X.AnonymousClass0bz;
import X.AnonymousClass0cQ;
import X.AnonymousClass0la;
import X.AnonymousClass0nJ;
import X.AnonymousClass0rr;
import X.AnonymousClass2M2;
import X.AnonymousClass3ih;
import X.AnonymousClass4dC;
import X.AnonymousClass4dE;
import X.AnonymousClass4dF;
import X.AnonymousClass4kh;
import X.AnonymousClass4ki;
import X.AnonymousClass5X0;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.List;

public class DirectVisualMessageActionLogChronologicalFragment extends AnonymousClass0IJ implements AnonymousClass3ih, AnonymousClass4dE, AnonymousClass4kh {
    /* renamed from: B */
    public AnonymousClass4dF f65434B;
    /* renamed from: C */
    public OnClickListener f65435C;
    /* renamed from: D */
    private AnonymousClass4ki f65436D;
    public RecyclerView mRecyclerView;
    public SpinnerImageView mSpinner;

    public final int FK() {
        return -2;
    }

    public final void PFA(String str) {
    }

    public final void Tp() {
    }

    public final void Up(int i) {
    }

    public final void We() {
    }

    public final void Xe(int i, int i2) {
    }

    public final String getModuleName() {
        return "direct_story_action_log_chronological_fragment";
    }

    public final boolean nW() {
        return true;
    }

    public final void Mn() {
        this.mSpinner.setLoadingStatus(AnonymousClass2M2.FAILED);
        SpinnerImageView spinnerImageView = this.mSpinner;
        if (this.f65435C == null) {
            this.f65435C = new AnonymousClass4dC(this);
        }
        spinnerImageView.setOnClickListener(this.f65435C);
    }

    public final void Nn() {
        this.mSpinner.setLoadingStatus(AnonymousClass2M2.LOADING);
    }

    public final void On(List list) {
        this.mSpinner.setLoadingStatus(AnonymousClass2M2.SUCCESS);
        AnonymousClass0nJ anonymousClass0nJ = this.f65436D;
        anonymousClass0nJ.f56802B.clear();
        anonymousClass0nJ.f56802B.addAll(list);
        anonymousClass0nJ.notifyDataSetChanged();
    }

    public final float PW() {
        return AnonymousClass0bz.f6937R;
    }

    public final boolean VY() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (!(recyclerView == null || recyclerView.getChildCount() == 0)) {
            if (this.mRecyclerView.computeVerticalScrollOffset() != 0) {
                return false;
            }
        }
        return true;
    }

    public final View oS() {
        return getView();
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1067048164);
        super.onCreate(bundle);
        this.f65434B = new AnonymousClass4dF(getArguments(), this, getContext(), true);
        this.f65436D = new AnonymousClass5X0(this);
        AnonymousClass0cQ.G(this, -2031464351, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1874296581);
        View inflate = layoutInflater.inflate(C0164R.layout.fragment_direct_action_log_chronological, viewGroup, false);
        AnonymousClass0cQ.G(this, -139527763, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -339784033);
        super.onDestroyView();
        DirectVisualMessageActionLogChronologicalFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.G(this, -376726794, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mRecyclerView = (RecyclerView) view.findViewById(C0164R.id.recycler_view);
        AnonymousClass0la anonymousClass0rr = new AnonymousClass0rr(getContext(), 1, false);
        anonymousClass0rr.f9543B = true;
        this.mRecyclerView.setLayoutManager(anonymousClass0rr);
        this.mRecyclerView.setAdapter(this.f65436D);
        this.mSpinner = (SpinnerImageView) view.findViewById(C0164R.id.direct_recycler_view_spinner);
        schedule(this.f65434B.A());
    }
}
