package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.model.direct.DirectVisualMessageReplyViewModel;

/* renamed from: X.4Zk */
public final class AnonymousClass4Zk extends AnonymousClass0IJ implements AnonymousClass0IS {
    /* renamed from: B */
    public AnonymousClass0cN f55418B;
    /* renamed from: C */
    public String f55419C;
    /* renamed from: D */
    public DirectVisualMessageReplyViewModel f55420D;
    /* renamed from: E */
    public boolean f55421E;
    /* renamed from: F */
    public AnonymousClass0dF f55422F;
    /* renamed from: G */
    public AnonymousClass0Cm f55423G;
    /* renamed from: H */
    private RectF f55424H;
    /* renamed from: I */
    private String f55425I;
    /* renamed from: J */
    private boolean f55426J;
    /* renamed from: K */
    private AnonymousClass4QZ f55427K;
    /* renamed from: L */
    private RectF f55428L;
    /* renamed from: M */
    private boolean f55429M;
    /* renamed from: N */
    private boolean f55430N;
    /* renamed from: O */
    private int f55431O;

    public final String getModuleName() {
        return "direct_quick_camera_fragment";
    }

    public final boolean onBackPressed() {
        return this.f55422F.E();
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -380106409);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f55423G = AnonymousClass0Ce.G(getArguments());
        this.f55420D = (DirectVisualMessageReplyViewModel) arguments.getParcelable("DirectReplyCameraFragments.ARG_REPLY_VIEW_MODEL");
        this.f55428L = (RectF) arguments.getParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_ON_DIRECT_SEND_SUCCESS_EXIT_BOUNDS");
        this.f55425I = arguments.getString("DirectReplyCameraFragments.ARG_REPLY_ENTRY_POINT");
        this.f55431O = arguments.getInt("DirectVisualReplyFragment.REPLY_CAM_ARG_SWIPE_BACKGROUND_COLOR", -1);
        this.f55429M = arguments.getBoolean("DirectVisualReplyFragment.REPLY_CAM_ARG_OPEN_TEXT_MODE_WITH_OPAQUE_TRANSPARENCY", false);
        this.f55419C = arguments.getString("DirectQuickReplyCameraFragment.REPLY_CAM_ARG_CAMERA_INIT_MODE", AnonymousClass0cD.NORMAL.toString());
        this.f55430N = arguments.getBoolean("DirectQuickReplyCameraFragment.SHOULD_APPLY_SIMPLE_FILTER", false);
        boolean B = AnonymousClass0G5.B(getContext(), C0164R.attr.quickCaptureVerticalTransitionAndBlackBackgroundEnabled, false);
        this.f55426J = B;
        if (B) {
            float J = (float) AnonymousClass0Nm.J(getContext());
            float I = (float) AnonymousClass0Nm.I(getContext());
            RectF rectF = new RectF(0.0f, 0.0f, J, I);
            rectF.offsetTo(0.0f, I);
            this.f55424H = rectF;
        } else {
            this.f55424H = (RectF) arguments.getParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_ENTRY_VIEW_BOUNDS");
        }
        AnonymousClass0cQ.G(this, -1087654744, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1094063899);
        int i = getArguments().getInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THEME");
        if (i != 0) {
            layoutInflater = layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), i));
        }
        View inflate = layoutInflater.inflate(C0164R.layout.direct_quick_camera_fragment_layout, viewGroup, false);
        AnonymousClass0cQ.G(this, 1903519434, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 481000542);
        super.onDestroyView();
        this.f55422F = null;
        unregisterLifecycleListener(this.f55427K);
        this.f55427K.gi();
        this.f55427K = null;
        AnonymousClass0cQ.G(this, -460219361, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -1245021628);
        super.onPause();
        AnonymousClass0cN anonymousClass0cN = this.f55418B;
        if (anonymousClass0cN != null) {
            anonymousClass0cN.K();
            this.f55418B = null;
        }
        AnonymousClass0cQ.G(this, 1015277554, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 685566133);
        super.onResume();
        AnonymousClass0ea.E(Z().getWindow(), Z().getWindow().getDecorView(), false);
        if (!(AnonymousClass0LQ.B(this.f55419C, AnonymousClass0cD.TEXT.toString()) || ((Boolean) AnonymousClass0CC.mH.H(this.f55423G)).booleanValue())) {
            AnonymousClass0Gs.f2431j.D(this.f55420D.f27810E).C(new AnonymousClass4Zj(this)).B();
            AnonymousClass0dF anonymousClass0dF = this.f55422F;
            AnonymousClass1Tb anonymousClass1Tb = new AnonymousClass1Tb(this);
            AnonymousClass0eB anonymousClass0eB = anonymousClass0dF.f7367G;
            anonymousClass0eB.HB = anonymousClass1Tb;
            AnonymousClass44I anonymousClass44I = anonymousClass0eB.f7596J;
            if (anonymousClass44I != null) {
                anonymousClass44I.mo5412f(new AnonymousClass4Ke(anonymousClass0eB, anonymousClass1Tb));
            }
        }
        AnonymousClass0cQ.G(this, 1159869657, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(C0164R.id.direct_quick_camera_container);
        AnonymousClass0TK anonymousClass4QZ = new AnonymousClass4QZ();
        this.f55427K = anonymousClass4QZ;
        registerLifecycleListener(anonymousClass4QZ);
        AnonymousClass4Ng DRA = AnonymousClass4Ni.m24066B().C(AnonymousClass3De.f39326B).G(this.f55423G).A(getActivity()).E(this).D(this.f55427K).F(viewGroup).B(this.f55425I).DRA(this.f55420D);
        RectF rectF = this.f55424H;
        boolean z = this.f55426J;
        DRA = DRA.dMA(rectF, rectF, z, z ^ 1, z, 0).zPA(this.f55428L).FNA().wRA(this.f55431O).xRA(true).ZRA(this.f55426J ^ true).bSA(1).jRA(true).ZQA(AnonymousClass4TO.DIRECT_REPLY);
        AnonymousClass4PG B = new AnonymousClass4PG().m24146B(C0164R.string.direct_text_mode_hint_text, C0164R.string.direct_text_mode_hint_text);
        B.f53705D = true;
        B.f53706E = this.f55429M;
        B.f53707F = true;
        B.f53709H = true;
        B.f53708G = true;
        this.f55422F = new AnonymousClass0dF(DRA.HSA(B.m24145A()).GNA(AnonymousClass0G5.B(getContext(), C0164R.attr.quickCaptureControllerCaptureStateTransitionAnimationsEnabled, true)).CNA(AnonymousClass0cD.B(this.f55419C)).jOA(true).xMA(this.f55430N ? AnonymousClass2nA.FRONT : null).WRA(this.f55430N).GD());
    }
}
