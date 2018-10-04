package com.instagram.reels.fragment;

import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IS;
import X.AnonymousClass0TK;
import X.AnonymousClass0cQ;
import X.AnonymousClass0dF;
import X.AnonymousClass0ea;
import X.AnonymousClass3De;
import X.AnonymousClass4Ni;
import X.AnonymousClass4QZ;
import X.AnonymousClass5ug;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.common.gallery.Medium;

public class ArchiveReelShareFragment extends AnonymousClass0IJ implements AnonymousClass0IS {
    /* renamed from: B */
    private String f69952B;
    /* renamed from: C */
    private AnonymousClass4QZ f69953C;
    /* renamed from: D */
    private Medium f69954D;
    /* renamed from: E */
    private final AnonymousClass3De f69955E = new AnonymousClass5ug(this);
    /* renamed from: F */
    private AnonymousClass0Cm f69956F;
    public View mLoadingView;
    public AnonymousClass0dF mQuickCaptureController;

    public final String getModuleName() {
        return "archive_reel_share";
    }

    public final boolean onBackPressed() {
        AnonymousClass0dF anonymousClass0dF = this.mQuickCaptureController;
        return anonymousClass0dF != null && anonymousClass0dF.E();
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 728651540);
        super.onCreate(bundle);
        this.f69956F = AnonymousClass0Ce.G(getArguments());
        this.f69952B = getArguments().getString("ArchiveReelShareFragment.ARGUMENTS_ARCHIVE_REEL_SHARE_MEDIA_ID");
        Uri uri = (Uri) getArguments().getParcelable("ArchiveReelShareFragment.ARGUMENTS_ARCHIVE_REEL_SHARE_MEDIA_URI");
        int i = getArguments().getInt("ArchiveReelShareFragment.ARGUMENTS_ARCHIVE_REEL_SHARE_MEDIA_TYPE");
        long currentTimeMillis = System.currentTimeMillis();
        this.f69954D = new Medium(0, i, uri.getPath(), 0, null, 0, 0, currentTimeMillis / 1000, currentTimeMillis, uri);
        AnonymousClass0cQ.G(this, -1485854142, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 917710124);
        View inflate = layoutInflater.inflate(C0164R.layout.fragment_reel_share, viewGroup, false);
        AnonymousClass0cQ.G(this, -1962981725, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 97054209);
        super.onDestroyView();
        ArchiveReelShareFragmentLifecycleUtil.cleanupReferences(this);
        unregisterLifecycleListener(this.f69953C);
        this.f69953C.gi();
        this.f69953C = null;
        AnonymousClass0cQ.G(this, -807732068, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -261155193);
        super.onResume();
        AnonymousClass0ea.E(Z().getWindow(), Z().getWindow().getDecorView(), false);
        AnonymousClass0cQ.G(this, -1088693500, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mLoadingView = view.findViewById(C0164R.id.loading_overlay);
        AnonymousClass0TK anonymousClass4QZ = new AnonymousClass4QZ();
        this.f69953C = anonymousClass4QZ;
        registerLifecycleListener(anonymousClass4QZ);
        this.mQuickCaptureController = new AnonymousClass0dF(AnonymousClass4Ni.B().m26847C(this.f69955E).m26851G(this.f69956F).m26845A(getActivity()).m26849E(this).m26848D(this.f69953C).m26850F((ViewGroup) getView()).m26846B("archive_reel_share_button").FNA().XRA(true).xRA(true).lRA().mRA().dQA(this.f69954D).hMA(this.f69952B).jOA(true).GD());
    }
}
