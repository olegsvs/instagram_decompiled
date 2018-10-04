package com.instagram.creation.capture;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0F4;
import X.AnonymousClass0F8;
import X.AnonymousClass0G5;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IS;
import X.AnonymousClass0JI;
import X.AnonymousClass0NN;
import X.AnonymousClass0Nm;
import X.AnonymousClass0PI;
import X.AnonymousClass0PM;
import X.AnonymousClass0cQ;
import X.AnonymousClass0e8;
import X.AnonymousClass0g0;
import X.AnonymousClass0g3;
import X.AnonymousClass0ip;
import X.AnonymousClass0uR;
import X.AnonymousClass1Ag;
import X.AnonymousClass1Qk;
import X.AnonymousClass1h1;
import X.AnonymousClass27D;
import X.AnonymousClass2nA;
import X.AnonymousClass3B8;
import X.AnonymousClass3DI;
import X.AnonymousClass3DM;
import X.AnonymousClass3DN;
import X.AnonymousClass3fE;
import X.AnonymousClass4HJ;
import X.AnonymousClass4HK;
import X.AnonymousClass4HL;
import X.AnonymousClass4HM;
import X.AnonymousClass4HO;
import X.AnonymousClass4HP;
import X.AnonymousClass4HX;
import X.AnonymousClass4Hx;
import X.AnonymousClass4I1;
import X.AnonymousClass4IV;
import X.AnonymousClass4IW;
import X.AnonymousClass4IX;
import X.AnonymousClass4IZ;
import X.AnonymousClass4Jx;
import X.AnonymousClass5ST;
import X.AnonymousClass5SU;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.facebook.C0164R;
import com.facebook.common.dextricks.DexStore;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.ui.mediatabbar.MediaTabHost;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MediaCaptureFragment extends AnonymousClass0IJ implements AnonymousClass0IS {
    /* renamed from: B */
    public AnonymousClass3fE f64003B;
    /* renamed from: C */
    public AnonymousClass0uR f64004C;
    /* renamed from: D */
    public boolean f64005D;
    /* renamed from: E */
    public AnonymousClass4Jx f64006E;
    /* renamed from: F */
    public AnonymousClass3DM f64007F;
    /* renamed from: G */
    public File f64008G;
    /* renamed from: H */
    public boolean f64009H;
    /* renamed from: I */
    public float f64010I;
    /* renamed from: J */
    public boolean f64011J;
    /* renamed from: K */
    public AnonymousClass4HL f64012K;
    /* renamed from: L */
    public SharedPreferences f64013L;
    /* renamed from: M */
    public boolean f64014M;
    /* renamed from: N */
    private final AnonymousClass0F8 f64015N = new AnonymousClass4IW(this);
    /* renamed from: O */
    private final AnonymousClass1Qk f64016O = new AnonymousClass1Qk(this);
    /* renamed from: P */
    private AnonymousClass3DM f64017P;
    /* renamed from: Q */
    private boolean f64018Q;
    /* renamed from: R */
    private CreationSession f64019R;
    /* renamed from: S */
    private AnonymousClass0Cm f64020S;
    public MediaCaptureActionBar mActionBar;
    public View mActionBarShadow;
    public AnonymousClass4HO mCaptureProvider;
    public View mCaptureView;
    public AnonymousClass4HJ mGalleryPickerView;
    public MediaTabHost mMediaTabHost;

    public final String getModuleName() {
        return "tabbed_gallery_camera";
    }

    /* renamed from: B */
    public static void m26738B(MediaCaptureFragment mediaCaptureFragment) {
        if (mediaCaptureFragment.mCaptureProvider.JV()) {
            mediaCaptureFragment.mMediaTabHost.B(AnonymousClass4HP.f52331D, false);
            mediaCaptureFragment.mMediaTabHost.C(false, true);
        } else {
            mediaCaptureFragment.mMediaTabHost.C(true, true);
        }
        mediaCaptureFragment.mActionBar.m26737A();
    }

    /* renamed from: C */
    public static void m26739C(MediaCaptureFragment mediaCaptureFragment, float f) {
        float tabCount;
        mediaCaptureFragment.mGalleryPickerView.setTranslationX(mediaCaptureFragment.f64018Q ? ((float) ((mediaCaptureFragment.mMediaTabHost.getTabCount() - 1) * mediaCaptureFragment.mActionBar.getWidth())) - f : -f);
        View view = mediaCaptureFragment.mCaptureView;
        if (mediaCaptureFragment.f64018Q) {
            tabCount = ((float) ((mediaCaptureFragment.mMediaTabHost.getTabCount() - 2) * mediaCaptureFragment.mActionBar.getWidth())) - f;
        } else {
            tabCount = ((float) mediaCaptureFragment.mGalleryPickerView.getRight()) + (-f);
        }
        view.setTranslationX(tabCount);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Activity m26740b() {
        return super.getActivity();
    }

    /* renamed from: c */
    public final boolean m26741c(MediaCaptureActionBar mediaCaptureActionBar, AnonymousClass3B8 anonymousClass3B8) {
        AnonymousClass0NN A = AnonymousClass0g3.ClickFolderInPicker.A();
        A.F("folder_name", anonymousClass3B8.B());
        A.B("folder_size", anonymousClass3B8.f38662C.size());
        A.R();
        if (anonymousClass3B8.f38661B == -4) {
            File F = AnonymousClass1Ag.F(getContext());
            this.f64008G = F;
            AnonymousClass1h1.D(this, 0, F);
            return false;
        } else if (anonymousClass3B8.D()) {
            return false;
        } else {
            this.mGalleryPickerView.setCurrentFolderById(anonymousClass3B8.f38661B);
            return true;
        }
    }

    /* renamed from: d */
    public final void m26742d(int i) {
        AnonymousClass4HO anonymousClass4HO = this.mCaptureProvider;
        if (anonymousClass4HO != null) {
            anonymousClass4HO.setFocusIndicatorOrientation(i);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 0) {
                ((AnonymousClass0PM) getActivity()).Ec(AnonymousClass1h1.B(intent, r2.f64008G));
            } else if (i == 1) {
                AnonymousClass4IV.B(r2, 1, -1, intent2, r2.f64008G, r2.f64006E.f52740D);
            } else if (i == 2) {
                AnonymousClass4HK.B(r2, i, i2, intent);
            }
        }
    }

    public final boolean onBackPressed() {
        if (this.mGalleryPickerView.C()) {
            return true;
        }
        if (!this.f64005D) {
            return this.mCaptureProvider.ELA();
        }
        this.f64005D = false;
        return this.mCaptureProvider.CLA();
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 679246545);
        super.onCreate(bundle);
        this.f64013L = getActivity().getPreferences(0);
        this.f64007F = AnonymousClass4HP.f52329B;
        this.f64012K = new AnonymousClass4HL(this, getActivity());
        this.f64003B = new AnonymousClass3fE(this);
        this.f64019R = ((AnonymousClass0PI) getContext()).VK();
        this.f64020S = AnonymousClass0Ce.G(getArguments());
        this.f64009H = (getArguments() == null ? new Bundle() : getArguments()).getBoolean("standalone_mode", false);
        if (bundle == null) {
            int intExtra = getActivity().getIntent().getIntExtra("mediaCaptureTab", -1);
            if (intExtra >= 0 && !this.f64009H) {
                this.f64017P = AnonymousClass4HP.B(intExtra);
            }
        }
        this.f64018Q = AnonymousClass0e8.D(getContext());
        AnonymousClass0cQ.G(this, -1004418587, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 810733209);
        Context context = getContext();
        this.mMediaTabHost = new MediaTabHost(context);
        this.mGalleryPickerView = new AnonymousClass5ST(context, this.f64009H, -1, 10, this.f64020S);
        boolean z = false;
        if (this.f64019R.Q()) {
            AnonymousClass5ST anonymousClass5ST = (AnonymousClass5ST) this.mGalleryPickerView;
            anonymousClass5ST.f63924b.D(new AnonymousClass4HX(anonymousClass5ST, -1, AnonymousClass4I1.B().f52431D));
        } else {
            this.mGalleryPickerView.F(-1, 0);
        }
        this.mGalleryPickerView.setId(C0164R.id.gallery_picker_view);
        this.mGalleryPickerView.setTopOffset(AnonymousClass0ip.B(getContext()));
        this.mGalleryPickerView.setTabBarHeight(this.mMediaTabHost.getTabHeight());
        this.f64014M = AnonymousClass27D.E(getContext());
        View inflate = layoutInflater.inflate(C0164R.layout.delete_clip_button, this.mMediaTabHost, false);
        LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, 0);
        inflate.setLayoutParams(layoutParams);
        if (this.f64014M) {
            layoutParams.height = AnonymousClass0ip.B(getContext());
            layoutParams.gravity = 49;
            AnonymousClass0Nm.a(inflate, (int) AnonymousClass0Nm.C(getContext(), 2));
        } else {
            layoutParams.height = this.mMediaTabHost.getTabHeight();
            layoutParams.gravity = 81;
        }
        AnonymousClass4HO anonymousClass5SU = new AnonymousClass5SU(context);
        anonymousClass5SU.setDeleteClipButton(inflate, new AnonymousClass4IX(this, inflate));
        this.mCaptureView = anonymousClass5SU;
        this.mCaptureProvider = anonymousClass5SU;
        anonymousClass5SU.setListener(this);
        this.mCaptureProvider.setNavigationDelegate((AnonymousClass0PM) getActivity());
        this.mActionBar = new MediaCaptureActionBar(context);
        if (this.f64009H) {
            MediaCaptureActionBar mediaCaptureActionBar = this.mActionBar;
            mediaCaptureActionBar.f64001N = true;
            mediaCaptureActionBar.f63992E = AnonymousClass4HP.f52329B;
            mediaCaptureActionBar.jCA((float) (mediaCaptureActionBar.f63997J ? (mediaCaptureActionBar.getChildCount() - 1) - mediaCaptureActionBar.f63992E.f39243B : mediaCaptureActionBar.f63992E.f39243B), 0.0f);
            mediaCaptureActionBar.jCA((float) mediaCaptureActionBar.f63992E.f39243B, 0.0f);
            MediaCaptureActionBar.m26735B(mediaCaptureActionBar, true, true, false);
            mediaCaptureActionBar.f63991D.setImageResource(C0164R.drawable.instagram_arrow_back_24);
            mediaCaptureActionBar.f64000M.setText(C0164R.string.done);
        }
        this.mActionBar.setBaseDelegate(this);
        this.mActionBar.setGalleryDelegate(this);
        this.mActionBar.setFeedCaptureDelegate(this);
        this.mMediaTabHost.A(this.mGalleryPickerView);
        this.mMediaTabHost.addView(this.mGalleryPickerView, 0);
        this.mMediaTabHost.A(this.mCaptureProvider);
        this.mMediaTabHost.addView(this.mCaptureView, 1);
        this.mMediaTabHost.A(this.mActionBar);
        this.mMediaTabHost.addView(this.mActionBar, 2);
        this.mMediaTabHost.addView(inflate, 3);
        this.mActionBarShadow = layoutInflater.inflate(C0164R.layout.action_bar_shadow, this.mMediaTabHost, false);
        this.mMediaTabHost.addView(this.mActionBarShadow);
        Object obj = this.f64019R.f38951E != AnonymousClass0g0.PROFILE_PHOTO ? 1 : null;
        AnonymousClass3DN anonymousClass4IZ = new AnonymousClass4IZ(this);
        List arrayList = new ArrayList();
        arrayList.add(AnonymousClass4HP.f52329B);
        if (this.f64019R.f38950D.f17261E) {
            arrayList.add(AnonymousClass4HP.f52330C);
        }
        if (obj != null) {
            arrayList.add(AnonymousClass4HP.f52331D);
        }
        MediaTabHost mediaTabHost = this.mMediaTabHost;
        mediaTabHost.f39229J.setTabs(arrayList, new AnonymousClass3DI(mediaTabHost, true));
        MediaTabHost mediaTabHost2 = this.mMediaTabHost;
        if (arrayList.size() > 1) {
            z = true;
        }
        mediaTabHost2.D(z);
        this.mMediaTabHost.A(anonymousClass4IZ);
        this.mGalleryPickerView.setListener(this);
        this.f64010I = 0.0f;
        AnonymousClass0F4.f2058E.A(AnonymousClass4Hx.class, this.f64015N);
        View view = this.mMediaTabHost;
        AnonymousClass0cQ.G(this, -2134920274, F);
        return view;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, 1748398873);
        super.onDestroy();
        this.f64003B.A();
        this.f64006E = null;
        AnonymousClass0cQ.G(this, -68504693, F);
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -1138467989);
        super.onDestroyView();
        AnonymousClass0F4.f2058E.D(AnonymousClass4Hx.class, this.f64015N);
        this.mGalleryPickerView.setListener(null);
        this.mMediaTabHost.f39225F.clear();
        this.mActionBar.setBaseDelegate(null);
        this.mActionBar.setGalleryDelegate(null);
        this.mActionBar.setFeedCaptureDelegate(null);
        this.mCaptureProvider.setListener(null);
        getActivity().getWindow().setBackgroundDrawable(new ColorDrawable(-1));
        MediaCaptureFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.G(this, 695626853, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, 2027390713);
        super.onPause();
        Editor edit = this.f64013L.edit();
        edit.putInt("__CAPTURE_TAB_V2__", this.mMediaTabHost.getCurrentTab().f39243B);
        if (this.mCaptureProvider.getCameraFacing() != null) {
            edit.putInt("__CAMERA_FACING__", this.mCaptureProvider.getCameraFacing().f33989B);
        }
        edit.apply();
        AnonymousClass0JI.getInstance().removeLocationUpdates(this.f64006E);
        AnonymousClass0JI.getInstance().cancelSignalPackageRequest(this.f64006E);
        this.f64016O.removeMessages(1);
        AnonymousClass0uR anonymousClass0uR = this.f64004C;
        if (anonymousClass0uR != null) {
            Dialog dialog = anonymousClass0uR.f11832C;
            if (dialog != null) {
                dialog.dismiss();
            }
        }
        this.f64012K.A();
        this.mGalleryPickerView.D();
        this.mCaptureProvider.St();
        AnonymousClass0cQ.G(this, -2049000454, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 396772774);
        super.onResume();
        AnonymousClass4HM anonymousClass4HM = new AnonymousClass4HM();
        anonymousClass4HM.f52323C = AnonymousClass4HP.B(this.f64013L.getInt("__CAPTURE_TAB_V2__", this.f64007F.f39243B));
        anonymousClass4HM.f52322B = AnonymousClass2nA.C(this.f64013L.getInt("__CAMERA_FACING__", AnonymousClass2nA.BACK.f33989B));
        getActivity().getWindow().addFlags(DexStore.LOAD_RESULT_MIXED_MODE);
        getActivity().getWindow().setBackgroundDrawable(new ColorDrawable(AnonymousClass0G5.D(getContext(), C0164R.attr.mediaPickerBackground)));
        if (!this.f64009H) {
            this.f64019R.f38966T.clear();
        }
        this.f64006E = new AnonymousClass4Jx(this.f64019R, getActivity(), this.f64020S, this.mCaptureProvider, this.f64012K);
        if (((Boolean) AnonymousClass0CC.ei.H(this.f64020S)).booleanValue()) {
            AnonymousClass0JI.getInstance().requestLocationSignalPackage(this.f64006E, "MediaCaptureFragment");
        } else {
            AnonymousClass0JI.getInstance().requestLocationUpdates(this.f64006E, "MediaCaptureFragment");
        }
        MediaTabHost mediaTabHost = this.mMediaTabHost;
        AnonymousClass3DM anonymousClass3DM = this.f64017P;
        if (anonymousClass3DM == null) {
            anonymousClass3DM = anonymousClass4HM.f52323C;
        }
        mediaTabHost.B(anonymousClass3DM, false);
        this.mCaptureProvider.setInitialCameraFacing(anonymousClass4HM.f52322B);
        this.f64016O.sendEmptyMessage(1);
        this.mGalleryPickerView.E();
        this.mCaptureProvider.gx();
        getActivity().setRequestedOrientation(1);
        AnonymousClass0cQ.G(this, 1797210174, F);
    }
}
