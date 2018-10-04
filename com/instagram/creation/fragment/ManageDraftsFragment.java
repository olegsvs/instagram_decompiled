package com.instagram.creation.fragment;

import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0IJ;
import X.AnonymousClass0OA;
import X.AnonymousClass0PI;
import X.AnonymousClass0Ze;
import X.AnonymousClass0cQ;
import X.AnonymousClass24o;
import X.AnonymousClass4Is;
import X.AnonymousClass4Vp;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.gallery.Draft;
import com.instagram.creation.base.CreationSession;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.ArrayList;
import java.util.List;

public class ManageDraftsFragment extends AnonymousClass0IJ {
    /* renamed from: B */
    public AnonymousClass4Is f64953B;
    /* renamed from: C */
    public boolean f64954C;
    /* renamed from: D */
    public CreationSession f64955D;
    /* renamed from: E */
    public AnonymousClass0Cm f64956E;
    public TextView mActionBarActionButton;
    public TextView mActionBarTitleTextView;

    public final String getModuleName() {
        return "manage_drafts";
    }

    /* renamed from: B */
    public static List m27053B() {
        List<AnonymousClass0OA> C = PendingMediaStore.C().C(AnonymousClass0Ze.ALL_SHARES);
        List arrayList = new ArrayList();
        for (AnonymousClass0OA anonymousClass0OA : C) {
            switch (anonymousClass0OA.gB.ordinal()) {
                case 0:
                    arrayList.add(new Draft(anonymousClass0OA.UB, anonymousClass0OA.DB, false, false, 0, anonymousClass0OA.h()));
                    break;
                case 1:
                    arrayList.add(new Draft(anonymousClass0OA.UB, anonymousClass0OA.DB, true, false, anonymousClass0OA.bC.getDuration(), false));
                    break;
                case 4:
                    AnonymousClass0OA A = PendingMediaStore.C().A((String) PendingMediaStore.C().A(anonymousClass0OA.UB).E().get(0));
                    arrayList.add(new Draft(anonymousClass0OA.UB, A.DB, A.s(), true, A.s() ? A.bC.getDuration() : 0, false));
                    break;
                default:
                    break;
            }
        }
        return arrayList;
    }

    /* renamed from: C */
    public static void m27054C(ManageDraftsFragment manageDraftsFragment) {
        manageDraftsFragment.f64954C ^= 1;
        AnonymousClass4Is anonymousClass4Is = manageDraftsFragment.f64953B;
        anonymousClass4Is.f52550B = manageDraftsFragment.f64954C;
        AnonymousClass4Is.C(anonymousClass4Is);
        manageDraftsFragment.m27055D();
    }

    /* renamed from: D */
    private void m27055D() {
        int i = this.f64954C ? C0164R.string.dialog_option_discard : C0164R.string.draft_section_title;
        int i2 = this.f64954C ? C0164R.string.done : C0164R.string.edit;
        this.mActionBarTitleTextView.setText(i);
        this.mActionBarActionButton.setText(i2);
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 2027553342);
        super.onCreate(bundle);
        int round = Math.round((float) (getResources().getDisplayMetrics().widthPixels / 3));
        this.f64956E = AnonymousClass0Ce.G(getArguments());
        this.f64953B = new AnonymousClass4Is(getContext(), new AnonymousClass24o(round), this);
        this.f64953B.F(m27053B());
        this.f64955D = ((AnonymousClass0PI) getContext()).VK();
        AnonymousClass0cQ.G(this, 639969163, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 703151268);
        View inflate = layoutInflater.inflate(C0164R.layout.fragment_drafts_grid, viewGroup, false);
        AnonymousClass0cQ.G(this, -561857714, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -581468953);
        super.onDestroyView();
        ManageDraftsFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.G(this, -430434364, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        GridView gridView = (GridView) view.findViewById(C0164R.id.drafts_grid);
        gridView.setAdapter(this.f64953B);
        gridView.setNumColumns(3);
        this.mActionBarActionButton = (TextView) getActivity().findViewById(C0164R.id.next_button_textview);
        this.mActionBarTitleTextView = (TextView) getActivity().findViewById(C0164R.id.action_bar_textview_title);
        this.mActionBarActionButton.setOnClickListener(new AnonymousClass4Vp(this));
        m27055D();
    }
}
