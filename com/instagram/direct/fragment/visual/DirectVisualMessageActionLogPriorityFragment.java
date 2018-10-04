package com.instagram.direct.fragment.visual;

import X.AnonymousClass0IJ;
import X.AnonymousClass0cQ;
import X.AnonymousClass0la;
import X.AnonymousClass0nJ;
import X.AnonymousClass0rr;
import X.AnonymousClass2M2;
import X.AnonymousClass4dE;
import X.AnonymousClass4dF;
import X.AnonymousClass4dG;
import X.AnonymousClass4dH;
import X.AnonymousClass4kh;
import X.AnonymousClass4ki;
import X.AnonymousClass5X1;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.List;

public class DirectVisualMessageActionLogPriorityFragment extends AnonymousClass0IJ implements AnonymousClass4dE, AnonymousClass4kh {
    /* renamed from: B */
    public AnonymousClass4dF f65437B;
    /* renamed from: C */
    public OnClickListener f65438C;
    /* renamed from: D */
    private AnonymousClass4ki f65439D;
    public SpinnerImageView mSpinner;

    public final void PFA(String str) {
    }

    public final String getModuleName() {
        return "direct_story_action_log_priority_fragment";
    }

    public final void Mn() {
        this.mSpinner.setLoadingStatus(AnonymousClass2M2.FAILED);
        SpinnerImageView spinnerImageView = this.mSpinner;
        if (this.f65438C == null) {
            this.f65438C = new AnonymousClass4dH(this);
        }
        spinnerImageView.setOnClickListener(this.f65438C);
    }

    public final void Nn() {
        this.mSpinner.setLoadingStatus(AnonymousClass2M2.LOADING);
    }

    public final void On(List list) {
        this.mSpinner.setLoadingStatus(AnonymousClass2M2.SUCCESS);
        AnonymousClass0nJ anonymousClass0nJ = this.f65439D;
        anonymousClass0nJ.f56802B.clear();
        anonymousClass0nJ.f56802B.addAll(list);
        anonymousClass0nJ.notifyDataSetChanged();
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1684508102);
        super.onCreate(bundle);
        this.f65437B = new AnonymousClass4dF(getArguments(), this, getContext(), false);
        this.f65439D = new AnonymousClass5X1(this);
        AnonymousClass0cQ.G(this, -531196968, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1685277967);
        View inflate = layoutInflater.inflate(C0164R.layout.fragment_direct_recycler_view_with_header, viewGroup, false);
        AnonymousClass0cQ.G(this, 2110200656, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -1042420617);
        super.onDestroyView();
        DirectVisualMessageActionLogPriorityFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.G(this, -1676227200, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C0164R.id.recycler_view);
        AnonymousClass0la anonymousClass0rr = new AnonymousClass0rr(getContext(), 1, false);
        anonymousClass0rr.f9543B = true;
        recyclerView.setLayoutManager(anonymousClass0rr);
        recyclerView.setAdapter(this.f65439D);
        this.mSpinner = (SpinnerImageView) view.findViewById(C0164R.id.direct_recycler_view_spinner);
        view.findViewById(C0164R.id.header_done_button).setOnClickListener(new AnonymousClass4dG(this));
        schedule(this.f65437B.A());
    }
}
