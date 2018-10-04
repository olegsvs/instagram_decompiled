package com.instagram.archive.fragment;

import X.AnonymousClass0Ca;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0Gs;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IS;
import X.AnonymousClass0Iz;
import X.AnonymousClass0LQ;
import X.AnonymousClass0Ls;
import X.AnonymousClass0Nm;
import X.AnonymousClass0OA;
import X.AnonymousClass0P2;
import X.AnonymousClass0PG;
import X.AnonymousClass0RL;
import X.AnonymousClass0aa;
import X.AnonymousClass0bt;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eT;
import X.AnonymousClass0rm;
import X.AnonymousClass0sF;
import X.AnonymousClass1Iu;
import X.AnonymousClass1Qc;
import X.AnonymousClass2Ca;
import X.AnonymousClass2Mg;
import X.AnonymousClass2Mh;
import X.AnonymousClass2zb;
import X.AnonymousClass30Y;
import X.AnonymousClass30n;
import X.AnonymousClass49Q;
import X.AnonymousClass49R;
import X.AnonymousClass49S;
import X.AnonymousClass49T;
import X.AnonymousClass49U;
import X.AnonymousClass49V;
import X.AnonymousClass5Rq;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.PunchedOverlayView;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.touchimageview.TouchImageView;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.io.File;

public class SelectHighlightsCoverFragment extends AnonymousClass0IJ implements AnonymousClass0IS, AnonymousClass0PG, AnonymousClass0RL, AnonymousClass0bt {
    /* renamed from: B */
    public boolean f50924B;
    /* renamed from: C */
    public AnonymousClass2zb f50925C;
    /* renamed from: D */
    public AnonymousClass30n f50926D;
    /* renamed from: E */
    public AnonymousClass30Y f50927E;
    /* renamed from: F */
    public AnonymousClass0Cm f50928F;
    /* renamed from: G */
    private AnonymousClass0aa f50929G;
    /* renamed from: H */
    private AnonymousClass5Rq f50930H;
    public PunchedOverlayView mPunchedOverlayView;
    public View mRootView;
    public TouchImageView mTouchImageView;
    public ReboundViewPager mViewPager;

    public final void AV(Intent intent) {
    }

    public final void Ao(AnonymousClass0aa anonymousClass0aa) {
    }

    public final void Bo(AnonymousClass0aa anonymousClass0aa, int i) {
    }

    public final void VUA(File file, int i) {
    }

    public final boolean bW() {
        return true;
    }

    public final String getModuleName() {
        return "reel_highlights_cover_pic";
    }

    public final void yc(int i, int i2) {
    }

    /* renamed from: B */
    public static void m23433B(SelectHighlightsCoverFragment selectHighlightsCoverFragment) {
        AnonymousClass0aa A = AnonymousClass0Gs.f2431j.D(selectHighlightsCoverFragment.f50926D.f36863D.f3295F).C(selectHighlightsCoverFragment).A();
        selectHighlightsCoverFragment.f50929G = A;
        A.G();
    }

    /* renamed from: C */
    public static void m23434C(SelectHighlightsCoverFragment selectHighlightsCoverFragment) {
        selectHighlightsCoverFragment.mViewPager.setCustomMinimumOffset(Integer.valueOf(selectHighlightsCoverFragment.f50926D.f36864E != null ? 1 : 0));
    }

    /* renamed from: D */
    public static void m23435D(SelectHighlightsCoverFragment selectHighlightsCoverFragment) {
        selectHighlightsCoverFragment.mViewPager.G(selectHighlightsCoverFragment.f50925C.m18141B(selectHighlightsCoverFragment.f50926D.f36864E));
    }

    /* renamed from: E */
    private static boolean m23436E(int i, int i2) {
        return Math.abs(i - i2) < 10;
    }

    public final void Se(AnonymousClass0aa anonymousClass0aa, Bitmap bitmap) {
        TouchImageView touchImageView = this.mTouchImageView;
        if (touchImageView != null) {
            if (this.f50929G == anonymousClass0aa) {
                touchImageView.post(new AnonymousClass49T(this, bitmap));
            }
        }
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        if (getContext() != null) {
            anonymousClass0eT.n(true);
            anonymousClass0eT.l(false);
            anonymousClass0eT.a(getContext().getResources().getString(C0164R.string.highlights_select_image));
            AnonymousClass0eT.E(getActivity()).Q(getContext().getResources().getString(C0164R.string.done), new AnonymousClass49U(this));
        }
    }

    public final void jUA(Intent intent, int i) {
        AnonymousClass0Iz.f2854L.J(getActivity(), "new_highlight_cover_photo");
        startActivityForResult(intent, i);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10001 && i2 == -1) {
            Uri fromFile = Uri.fromFile(new File(intent.getAction()));
            AnonymousClass0OA A = PendingMediaStore.C().A(intent.getStringExtra(AnonymousClass2Mg.f29573B));
            Rect I = AnonymousClass0rm.I(fromFile.getPath());
            AnonymousClass0Ls anonymousClass0Ls = new AnonymousClass0Ls();
            anonymousClass0Ls.f3295F = fromFile.toString();
            anonymousClass0Ls.f3296G = I.width();
            anonymousClass0Ls.f3292C = I.height();
            this.f50926D = new AnonymousClass30n(anonymousClass0Ls, AnonymousClass2Mh.m15230B(new Rect(0, 0, anonymousClass0Ls.f3296G, anonymousClass0Ls.f3292C)), null, A.pC);
            m23433B(this);
            m23434C(this);
            m23435D(this);
        }
    }

    public final boolean onBackPressed() {
        if (this.f50924B) {
            this.f50924B = false;
            return false;
        }
        Rect rect = this.f50926D.f36861B;
        Rect cropRect = this.mTouchImageView.getCropRect();
        Object obj = (m23436E(rect.bottom, cropRect.bottom) && m23436E(rect.left, cropRect.left) && m23436E(rect.right, cropRect.right) && m23436E(rect.top, cropRect.top)) ? 1 : null;
        if (obj != null && AnonymousClass0LQ.B(this.f50926D.f36864E, this.f50927E.f36821B.f36864E)) {
            if (AnonymousClass0LQ.B(this.f50926D.f36865F, this.f50927E.f36821B.f36865F)) {
                return false;
            }
        }
        new AnonymousClass0P2(getContext()).V(C0164R.string.unsaved_changes_title).K(C0164R.string.unsaved_changes_message).U(getString(C0164R.string.discard_changes), new AnonymousClass49V(this), true, AnonymousClass2Ca.RED).N(C0164R.string.cancel, null).A().show();
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -341543928);
        super.onCreate(bundle);
        AnonymousClass30Y E = AnonymousClass30Y.m18171E();
        this.f50927E = E;
        this.f50926D = E.f36821B;
        this.f50928F = AnonymousClass0Ce.G(getArguments());
        getActivity().getWindow().setSoftInputMode(48);
        AnonymousClass0cQ.G(this, 1387928429, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1037935326);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_highlights_cover_frame_fragment, viewGroup, false);
        AnonymousClass0cQ.G(this, -1268641305, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -987346653);
        super.onDestroyView();
        SelectHighlightsCoverFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.G(this, -1625114656, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, 605428199);
        super.onPause();
        getActivity().getWindow().setSoftInputMode(0);
        AnonymousClass0cQ.G(this, -1189756124, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mRootView = view;
        PunchedOverlayView punchedOverlayView = (PunchedOverlayView) view.findViewById(C0164R.id.punched_overlay_view);
        this.mPunchedOverlayView = punchedOverlayView;
        punchedOverlayView.setDarkenColor(AnonymousClass0Ca.C(getContext(), C0164R.color.white_90_transparent));
        this.mPunchedOverlayView.addOnLayoutChangeListener(new AnonymousClass49Q(this));
        this.mTouchImageView = (TouchImageView) view.findViewById(C0164R.id.highlights_cover_image_preview);
        this.f50930H = new AnonymousClass5Rq();
        this.mTouchImageView.setBoundsDelegate(this.f50930H);
        this.mTouchImageView.setTouchEnabled(true);
        m23433B(this);
        this.mViewPager = (ReboundViewPager) view.findViewById(C0164R.id.media_view_pager);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0164R.dimen.image_selector_thumbnail_size);
        int round = Math.round(((float) AnonymousClass0Nm.J(getContext())) / ((float) dimensionPixelSize));
        this.mViewPager.setOverridePageWidth(dimensionPixelSize);
        this.mViewPager.setExtraBufferSize(((round - 1) / 2) + 2);
        this.mViewPager.setPageSpacing(0.0f);
        this.mViewPager.setScrollMode(AnonymousClass1Iu.WHEEL_OF_FORTUNE);
        this.mViewPager.A(new AnonymousClass1Qc(this));
        this.mViewPager.setItemPositioner(new AnonymousClass0sF(dimensionPixelSize, 0, 1.0f, 1.0f));
        this.mViewPager.A(new AnonymousClass49S(this));
        m23434C(this);
        this.f50925C = new AnonymousClass2zb(this.f50927E.m18177F(), new AnonymousClass49R(this));
        this.mViewPager.setAdapter(this.f50925C);
        m23435D(this);
    }
}
