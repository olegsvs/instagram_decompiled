package com.instagram.igtv.uploadflow;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ca;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0G5;
import X.AnonymousClass0Gn;
import X.AnonymousClass0IG;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IL;
import X.AnonymousClass0IS;
import X.AnonymousClass0IT;
import X.AnonymousClass0IZ;
import X.AnonymousClass0Nm;
import X.AnonymousClass0OA;
import X.AnonymousClass0PZ;
import X.AnonymousClass0TJ;
import X.AnonymousClass0TU;
import X.AnonymousClass0TV;
import X.AnonymousClass0TW;
import X.AnonymousClass0Ur;
import X.AnonymousClass0bN;
import X.AnonymousClass0bP;
import X.AnonymousClass0cQ;
import X.AnonymousClass0dd;
import X.AnonymousClass0eT;
import X.AnonymousClass0eV;
import X.AnonymousClass0eW;
import X.AnonymousClass0ea;
import X.AnonymousClass0ip;
import X.AnonymousClass0rF;
import X.AnonymousClass0rm;
import X.AnonymousClass1Ba;
import X.AnonymousClass1Bb;
import X.AnonymousClass1SF;
import X.AnonymousClass1oG;
import X.AnonymousClass24y;
import X.AnonymousClass25A;
import X.AnonymousClass2CI;
import X.AnonymousClass2CO;
import X.AnonymousClass2CP;
import X.AnonymousClass2FI;
import X.AnonymousClass2Uf;
import X.AnonymousClass3B8;
import X.AnonymousClass3BB;
import X.AnonymousClass3BD;
import X.AnonymousClass3BE;
import X.AnonymousClass3I1;
import X.AnonymousClass3RE;
import X.AnonymousClass3pG;
import X.AnonymousClass4Me;
import X.AnonymousClass4v2;
import X.AnonymousClass4v3;
import X.AnonymousClass4v4;
import X.AnonymousClass4v5;
import X.AnonymousClass4v6;
import X.AnonymousClass4v7;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.gallery.Medium;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.ui.widget.base.TriangleSpinner;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class IGTVUploadGalleryFragment extends AnonymousClass0IJ implements AnonymousClass0PZ, AnonymousClass0IS, AnonymousClass0TU, AnonymousClass0TV, AnonymousClass0IT, AnonymousClass0TW, OnItemSelectedListener {
    /* renamed from: B */
    public AnonymousClass1SF f5205B;
    /* renamed from: C */
    public AnonymousClass4Me f5206C;
    /* renamed from: D */
    public AnonymousClass2CO f5207D;
    /* renamed from: E */
    private AnonymousClass0eT f5208E;
    /* renamed from: F */
    private AnonymousClass3RE f5209F;
    /* renamed from: G */
    private boolean f5210G;
    /* renamed from: H */
    private AnonymousClass1oG f5211H;
    /* renamed from: I */
    private AnonymousClass3BD f5212I;
    /* renamed from: J */
    private String f5213J;
    /* renamed from: K */
    private String f5214K;
    /* renamed from: L */
    private AnonymousClass2Uf f5215L;
    /* renamed from: M */
    private AnonymousClass0Cm f5216M;
    public ViewGroup mContainer;
    public AnonymousClass0Ur mCoverFrameRenderingProgressDialog;
    public TextView mEmptyGalleryText;
    public RecyclerView mGalleryGridView;
    public TriangleSpinner mGalleryPickerView;
    public View mLoadingSpinner;
    public AnonymousClass2FI mPermissionEmptyStateController;

    public final String getModuleName() {
        return "igtv_upload_gallery_fragment";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    /* renamed from: B */
    private void m4516B(boolean z) {
        if (z) {
            this.mLoadingSpinner.setVisibility(0);
            this.mGalleryGridView.setVisibility(8);
            this.mEmptyGalleryText.setVisibility(8);
            return;
        }
        this.mLoadingSpinner.setVisibility(8);
        if (this.f5206C.getCount() > 0) {
            this.mGalleryGridView.setVisibility(0);
            this.mEmptyGalleryText.setVisibility(8);
            return;
        }
        this.mGalleryGridView.setVisibility(8);
        this.mEmptyGalleryText.setText(this.f5207D == AnonymousClass2CO.f27394D ? C0164R.string.igtv_empty_gallery_video : C0164R.string.igtv_empty_gallery_photo);
        this.mEmptyGalleryText.setVisibility(0);
    }

    public final void Qr(AnonymousClass3BD anonymousClass3BD, List list, List list2) {
        if (isResumed()) {
            m4516B(false);
        }
        BaseAdapter baseAdapter = this.f5206C;
        if (baseAdapter != null) {
            AnonymousClass0rF.m7947B(baseAdapter, 1993700618);
        }
    }

    public final void Zt(Map map) {
        if (map.containsKey("android.permission.READ_EXTERNAL_STORAGE")) {
            AnonymousClass1Bb anonymousClass1Bb = (AnonymousClass1Bb) map.get("android.permission.READ_EXTERNAL_STORAGE");
            if (AnonymousClass1Bb.GRANTED.equals(anonymousClass1Bb)) {
                this.f5212I.B();
                AnonymousClass2FI anonymousClass2FI = this.mPermissionEmptyStateController;
                if (anonymousClass2FI != null) {
                    anonymousClass2FI.A();
                    return;
                }
                return;
            }
            if (this.mPermissionEmptyStateController == null) {
                this.mPermissionEmptyStateController = new AnonymousClass2FI(this.mContainer, C0164R.layout.permission_empty_state_view);
            }
            Context context = getContext();
            String H = AnonymousClass0G5.m1727H(context, C0164R.attr.appName);
            this.mPermissionEmptyStateController.H(context.getString(C0164R.string.igtv_storage_permission_rationale_title)).G(context.getString(C0164R.string.igtv_storage_permission_rationale_message, new Object[]{H})).E(C0164R.string.igtv_storage_permission_rationale_link).F(new AnonymousClass4v5(this, anonymousClass1Bb));
        }
    }

    /* renamed from: b */
    public final void m4517b(Medium medium, float f) {
        if (this.f5207D == AnonymousClass2CO.f27394D) {
            AnonymousClass3pG B = AnonymousClass3pG.B(medium.f30924N);
            String stringBuilder;
            if (B.f44944I == null) {
                AnonymousClass0IG.m2160B(getContext(), getString(C0164R.string.igtv_failed_to_import_error), 0, 0);
                long j = B.f44939D;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(B.f44939D);
                stringBuilder = stringBuilder2.toString();
                if (((long) AnonymousClass3pG.f44936M) == j) {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(stringBuilder);
                    stringBuilder3.append(" ");
                    stringBuilder3.append(B.f44943H);
                    stringBuilder = stringBuilder3.toString();
                }
                AnonymousClass0Gn.m1881H("Clip import error", stringBuilder);
                return;
            }
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(getActivity());
            AnonymousClass2CP.f27395B.D();
            String str = this.f5209F.f41200C;
            stringBuilder = this.f5209F.f41199B;
            Bundle bundle = new Bundle();
            bundle.putParcelable("igtv_gallery_medium_arg", medium);
            bundle.putString("igtv_session_id_arg", str);
            bundle.putString("igtv_creation_session_id_arg", stringBuilder);
            AnonymousClass0IL iGTVUploadPreviewFragment = new IGTVUploadPreviewFragment();
            iGTVUploadPreviewFragment.setArguments(bundle);
            anonymousClass0IZ.f2754D = iGTVUploadPreviewFragment;
            if (VERSION.SDK_INT > 21) {
                anonymousClass0IZ.m2310D(C0164R.anim.right_in, C0164R.anim.left_nudge, C0164R.anim.right_nudge, C0164R.anim.right_out);
            }
            AnonymousClass0bP B2 = AnonymousClass3RE.B(this.f5209F, "igtv_composer_video_selected");
            B2.NB = (double) medium.getDuration();
            B2.f6739O = f;
            AnonymousClass0bN.m5568f(B2.m5577B(), AnonymousClass0dd.REGULAR);
            anonymousClass0IZ.m2308B();
        } else {
            AnonymousClass0OA A = PendingMediaStore.m3537C().m3539A(this.f5214K);
            AnonymousClass0Ur anonymousClass0Ur = new AnonymousClass0Ur(getContext());
            this.mCoverFrameRenderingProgressDialog = anonymousClass0Ur;
            anonymousClass0Ur.m4776A(getString(C0164R.string.processing));
            this.mCoverFrameRenderingProgressDialog.show();
            Context context = getContext();
            int J = AnonymousClass0Nm.m3431J(getContext());
            int I = AnonymousClass0Nm.m3430I(getContext());
            AnonymousClass3I1.B(context, AnonymousClass0rm.m7982K(BitmapFactory.decodeFile(medium.f30924N), J, I, 0, false), A, AnonymousClass2CI.D(getContext(), this.f5216M));
            this.mCoverFrameRenderingProgressDialog.hide();
            this.f5213J = "tap_done";
            getActivity().onBackPressed();
        }
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        AnonymousClass0eT anonymousClass0eT2 = anonymousClass0eT;
        anonymousClass0eT.m6355d(AnonymousClass0eW.m6366B(AnonymousClass0eV.DEFAULT).A(AnonymousClass0Ca.m937C(getContext(), C0164R.color.igtv_upload_action_bar_color)).B());
        anonymousClass0eT.m6363l(true);
        anonymousClass0eT2.m6329D(AnonymousClass0TJ.m4488D(getContext(), C0164R.drawable.instagram_x_outline_24, C0164R.color.white, C0164R.drawable.instagram_x_outline_24, C0164R.color.white_50_transparent), C0164R.string.igtv_upload_flow_prev, new AnonymousClass4v6(this), null, false);
        TriangleSpinner triangleSpinner = (TriangleSpinner) anonymousClass0eT.m6349X(C0164R.layout.gallery_picker_layout, 0, 0);
        this.mGalleryPickerView = triangleSpinner;
        triangleSpinner.setDropDownVerticalOffset(-AnonymousClass0ip.m7031B(getContext()));
        AnonymousClass4Me anonymousClass4Me = new AnonymousClass4Me(this);
        this.f5206C = anonymousClass4Me;
        anonymousClass4Me.f53240C = C0164R.layout.gallery_picker_title_layout;
        this.f5206C.f53239B = C0164R.layout.gallery_picker_item_layout;
        this.mGalleryPickerView.setAdapter(this.f5206C);
        this.mGalleryPickerView.setOnItemSelectedListener(this);
    }

    public final AnonymousClass3B8 getCurrentFolder() {
        return this.f5212I.f38669D;
    }

    public final List getFolders() {
        return AnonymousClass3BB.B(this.f5212I, new AnonymousClass4v7(this));
    }

    public final boolean onBackPressed() {
        String str = this.f5213J;
        if (str == null) {
            str = "tap_exit";
        }
        if (this.f5207D == AnonymousClass2CO.f27393C) {
            this.f5209F.B(str);
        } else if (this.f5207D == AnonymousClass2CO.f27394D) {
            this.f5209F.A(str);
        }
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.m5856F(this, 40858812);
        super.onCreate(bundle);
        this.f5216M = AnonymousClass0Ce.m950G(getArguments());
        Window window = m2190Z().getWindow();
        this.f5210G = AnonymousClass0ea.m6384B(window, window.getDecorView());
        int J = AnonymousClass0Nm.m3431J(getContext()) / 3;
        int H = (int) (((float) J) / AnonymousClass0Nm.m3429H(getContext().getResources().getDisplayMetrics()));
        Bundle arguments = getArguments();
        this.f5207D = (AnonymousClass2CO) arguments.getSerializable("igtv_upload_gallery_fragment_mode_arg");
        this.f5214K = arguments.getString("igtv_pending_media_key_arg");
        this.f5215L = new AnonymousClass2Uf(getContext(), J, H, AnonymousClass25A.f25726B, false, true);
        this.f5205B = new AnonymousClass1SF(getContext(), this, this.f5207D, this.f5215L, H);
        AnonymousClass3BE anonymousClass3BE = new AnonymousClass3BE(getLoaderManager(), this.f5215L);
        AnonymousClass2CO anonymousClass2CO = this.f5207D;
        AnonymousClass2CO anonymousClass2CO2 = AnonymousClass2CO.f27394D;
        anonymousClass3BE.f38692L = anonymousClass2CO == anonymousClass2CO2 ? AnonymousClass24y.f25693F : AnonymousClass24y.f25692E;
        anonymousClass3BE.f38683C = r11;
        if (r11.f5207D == anonymousClass2CO2) {
            anonymousClass3BE.f38691K = Long.valueOf(((long) ((Integer) AnonymousClass0CC.HM.m846H(r11.f5216M)).intValue()) * 1000).longValue();
            anonymousClass3BE.f38688H = Long.valueOf(((long) ((Integer) AnonymousClass0CC.GM.m846H(r11.f5216M)).intValue()) * 1000).longValue();
        }
        r11.f5212I = new AnonymousClass3BD(anonymousClass3BE.A(), r11.f5205B, getContext());
        r11.f5209F = new AnonymousClass3RE(r11, arguments.getString("igtv_creation_session_id_arg", UUID.randomUUID().toString()), arguments.getString("igtv_session_id_arg"));
        if (r11.f5207D == AnonymousClass2CO.f27394D) {
            AnonymousClass0bN.m5568f(AnonymousClass3RE.B(r11.f5209F, "igtv_composer_start").m5577B(), AnonymousClass0dd.REGULAR);
        }
        AnonymousClass0cQ.m5857G(r11, 935151501, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.m5856F(this, 2036008528);
        View inflate = layoutInflater.inflate(C0164R.layout.upload_gallery, viewGroup, false);
        this.f5208E = new AnonymousClass0eT((ViewGroup) inflate.findViewById(C0164R.id.action_bar_container), new AnonymousClass4v2(this));
        AnonymousClass0cQ.m5857G(this, -1240738726, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.m5856F(this, -163186590);
        super.onDestroy();
        AnonymousClass0cQ.m5857G(this, -1111645380, F);
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.m5856F(this, 478800463);
        super.onDestroyView();
        IGTVUploadGalleryFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.m5857G(this, 1943934095, F);
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        AnonymousClass3B8 anonymousClass3B8 = (AnonymousClass3B8) getFolders().get(i);
        if (getCurrentFolder() != null && getCurrentFolder().f38661B != anonymousClass3B8.f38661B) {
            this.f5212I.E(anonymousClass3B8.f38661B);
            this.mGalleryGridView.FA(0);
        }
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.m5856F(this, 1764042053);
        super.onPause();
        this.f5212I.C();
        AnonymousClass0ea.m6387E(m2190Z().getWindow(), m2190Z().getWindow().getDecorView(), this.f5210G);
        AnonymousClass0cQ.m5857G(this, -903818793, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.m5856F(this, 1036926302);
        super.onResume();
        this.f5208E.m6343R(this);
        AnonymousClass0ea.m6387E(m2190Z().getWindow(), m2190Z().getWindow().getDecorView(), false);
        if (AnonymousClass1Ba.m9838D(getContext(), "android.permission.READ_EXTERNAL_STORAGE")) {
            AnonymousClass2FI anonymousClass2FI = this.mPermissionEmptyStateController;
            if (anonymousClass2FI != null) {
                anonymousClass2FI.A();
            }
            if ((this.f5212I.f38671F.D() ^ 1) == 0) {
                m4516B(true);
                this.f5212I.B();
            } else {
                m4516B(false);
            }
        } else {
            AnonymousClass1Ba.m9842H(getActivity(), this, "android.permission.READ_EXTERNAL_STORAGE");
        }
        AnonymousClass0cQ.m5857G(this, -69067988, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mContainer = (FrameLayout) view;
        this.mLoadingSpinner = view.findViewById(C0164R.id.loading_spinner);
        this.mGalleryGridView = (RecyclerView) view.findViewById(C0164R.id.gallery_recycler_view);
        this.mEmptyGalleryText = (TextView) view.findViewById(C0164R.id.no_media_text);
        AnonymousClass1oG anonymousClass1oG = new AnonymousClass1oG(getContext(), 3);
        this.f5211H = anonymousClass1oG;
        anonymousClass1oG.f22918I = new AnonymousClass4v3(this);
        this.mGalleryGridView.setLayoutManager(this.f5211H);
        this.mGalleryGridView.setAdapter(this.f5205B);
        this.mGalleryGridView.m6955A(new AnonymousClass4v4(this, (int) AnonymousClass0Nm.m3424C(getContext(), 2)));
    }
}
