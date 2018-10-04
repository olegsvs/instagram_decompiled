package com.instagram.creation.fragment;

import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0Ie;
import X.AnonymousClass0PI;
import X.AnonymousClass0PJ;
import X.AnonymousClass0PK;
import X.AnonymousClass0cQ;
import X.AnonymousClass0ng;
import X.AnonymousClass1Qd;
import X.AnonymousClass1ex;
import X.AnonymousClass3zz;
import X.AnonymousClass4Vr;
import X.AnonymousClass4WO;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.C0164R;
import com.instagram.creation.base.CreationSession;
import com.instagram.ui.emptystaterow.EmptyStateView;

public class ThumbnailPreviewFragment extends AnonymousClass0Ie {
    /* renamed from: H */
    public static final AnonymousClass1ex f54827H = AnonymousClass1ex.f21064C;
    /* renamed from: B */
    public AnonymousClass4Vr f54828B;
    /* renamed from: C */
    public AnonymousClass0ng f54829C;
    /* renamed from: D */
    public AnonymousClass0PK f54830D;
    /* renamed from: E */
    public AnonymousClass0Cm f54831E;
    /* renamed from: F */
    private AnonymousClass0PJ f54832F;
    /* renamed from: G */
    private CreationSession f54833G;
    public View mContainer;
    public EmptyStateView mEmptyStateView;
    public LinearLayout mThumbnailPreviewContainer;

    public final String getModuleName() {
        return "metadata_thumbnail_preview";
    }

    /* renamed from: B */
    public static void m24402B(ThumbnailPreviewFragment thumbnailPreviewFragment) {
        thumbnailPreviewFragment.mThumbnailPreviewContainer.setGravity(16);
        thumbnailPreviewFragment.mContainer.setOnClickListener(new AnonymousClass1Qd(thumbnailPreviewFragment));
        thumbnailPreviewFragment.setListAdapter(thumbnailPreviewFragment.f54828B);
        thumbnailPreviewFragment.f54828B.m24392F();
        thumbnailPreviewFragment.getListView().setClipChildren(false);
        thumbnailPreviewFragment.getListView().setClipToPadding(false);
        thumbnailPreviewFragment.f54830D.KO().setVisibility(8);
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1504068968);
        super.onCreate(bundle);
        this.f54833G = ((AnonymousClass0PI) getContext()).VK();
        this.f54831E = AnonymousClass0Ce.G(getArguments() == null ? new Bundle() : getArguments());
        this.f54830D = (AnonymousClass0PK) getContext();
        this.f54832F = (AnonymousClass0PJ) getContext();
        this.f54828B = new AnonymousClass4Vr(getContext(), this.f54833G, this.f54831E, this.f54832F, f54827H, this);
        this.f54829C = new AnonymousClass0ng(getContext(), this.f54831E.f1759C, getLoaderManager());
        AnonymousClass0cQ.G(this, -858169238, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1484800811);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(C0164R.layout.fragment_thumbnail_preview, viewGroup, false);
        AnonymousClass0cQ.G(this, 1575442222, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 1707289080);
        super.onDestroyView();
        ThumbnailPreviewFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.G(this, 536000550, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -1326168773);
        super.onPause();
        for (AnonymousClass3zz F2 : this.f54828B.f54767C.f54781B) {
            F2.m21973F();
        }
        AnonymousClass0cQ.G(this, -1133041808, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 1933910440);
        super.onResume();
        for (AnonymousClass3zz H : this.f54828B.f54767C.f54781B) {
            H.m21975H();
        }
        AnonymousClass0cQ.G(this, 963987410, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mContainer = view;
        this.mThumbnailPreviewContainer = (LinearLayout) view.findViewById(C0164R.id.thumbnail_preview_container);
        this.mEmptyStateView = (EmptyStateView) getListView().getEmptyView();
        this.f54832F.HJA(new AnonymousClass4WO(this));
        this.f54830D.KO().setVisibility(8);
    }
}
