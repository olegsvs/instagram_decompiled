package X;

import android.app.Activity;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.common.gallery.Medium;
import java.io.File;

/* renamed from: X.5vH */
public final class AnonymousClass5vH extends AnonymousClass0IJ implements AnonymousClass0IS {
    /* renamed from: B */
    public AnonymousClass0dF f70025B;
    /* renamed from: C */
    private String f70026C;
    /* renamed from: D */
    private RectF f70027D;
    /* renamed from: E */
    private File f70028E;
    /* renamed from: F */
    private AnonymousClass0P7 f70029F;
    /* renamed from: G */
    private AnonymousClass4QZ f70030G;
    /* renamed from: H */
    private AnonymousClass0MI f70031H;
    /* renamed from: I */
    private final AnonymousClass3De f70032I = new AnonymousClass5vG(this);
    /* renamed from: J */
    private AnonymousClass0Cm f70033J;

    public final String getModuleName() {
        return "reel_highlight_share_fragment";
    }

    public final boolean onBackPressed() {
        AnonymousClass0dF anonymousClass0dF = this.f70025B;
        return anonymousClass0dF != null ? anonymousClass0dF.E() : false;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1597038557);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f70033J = AnonymousClass0Ce.G(arguments);
        this.f70026C = arguments.getString("ReelHighlightShareFragment.ARGUMENTS_KEY_ENTRY_POINT");
        this.f70027D = (RectF) arguments.getParcelable("ReelHighlightShareFragment.ARGUMENTS_KEY_EXIT_VIEW_TARGET");
        AnonymousClass0MI D = AnonymousClass0MB.C(this.f70033J).D(arguments.getString("ReelHighlightShareFragment.ARGUMENTS_KEY_REEL_ID "));
        this.f70031H = D;
        AnonymousClass0LH.E(D);
        AnonymousClass0LH.B(this.f70031H.V() ^ 1);
        this.f70029F = this.f70031H.E(0).f4134F;
        this.f70028E = new File(arguments.getString("ReelHighlightShareFragment.ARGUMENTS_KEY_FIRST_MEDIA_FILE_PATH"));
        AnonymousClass0cQ.G(this, 990810191, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 169703704);
        View inflate = layoutInflater.inflate(C0164R.layout.reel_highlight_share_fragment, viewGroup, false);
        AnonymousClass0cQ.G(this, 329770705, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 1274289291);
        super.onDestroyView();
        this.f70025B = null;
        unregisterLifecycleListener(this.f70030G);
        this.f70030G.gi();
        this.f70030G = null;
        AnonymousClass0cQ.G(this, -1503640619, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 1727290804);
        super.onResume();
        AnonymousClass0ea.E(Z().getWindow(), Z().getWindow().getDecorView(), false);
        if (this.f70029F != null) {
            if (this.f70028E.exists()) {
                if (this.f70033J.B().qB == AnonymousClass0Lo.PrivacyStatusPrivate && AnonymousClass0LQ.B(this.f70033J.B(), this.f70029F.MA())) {
                    Toast.makeText(getContext(), getString(C0164R.string.highlight_sticker_private_user_toast), 1).show();
                }
                AnonymousClass0cQ.G(this, 1098239510, F);
            }
        }
        AnonymousClass0IU fragmentManager = getFragmentManager();
        Activity activity = getActivity();
        if (!(fragmentManager == null || !AnonymousClass0cJ.E(fragmentManager) || activity == null)) {
            activity.onBackPressed();
        }
        AnonymousClass0cQ.G(this, 1098239510, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        AnonymousClass0IL anonymousClass0IL = this;
        View view2 = view;
        super.onViewCreated(view2, bundle);
        AnonymousClass0TK anonymousClass4QZ = new AnonymousClass4QZ();
        this.f70030G = anonymousClass4QZ;
        registerLifecycleListener(anonymousClass4QZ);
        if (this.f70029F != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Medium medium = new Medium(0, 1, anonymousClass0IL.f70028E.getAbsolutePath(), 0, null, 0, 0, currentTimeMillis / 1000, currentTimeMillis, Uri.fromFile(anonymousClass0IL.f70028E));
            ViewGroup viewGroup = (ViewGroup) view2.findViewById(C0164R.id.quick_camera_container);
            float J = (float) AnonymousClass0Nm.J(getContext());
            float I = (float) AnonymousClass0Nm.I(getContext());
            RectF rectF = new RectF(0.0f, 0.0f, J, I);
            rectF.offsetTo(0.0f, I);
            anonymousClass0IL.f70025B = new AnonymousClass0dF(AnonymousClass4Ni.B().m26847C(anonymousClass0IL.f70032I).m26851G(anonymousClass0IL.f70033J).m26845A(getActivity()).m26849E(anonymousClass0IL).m26848D(anonymousClass0IL.f70030G).m26850F(viewGroup).m26846B(anonymousClass0IL.f70026C).dMA(rectF, anonymousClass0IL.f70027D, true, false, false, 150).wRA(0).FNA().xRA(true).XRA(true).GNA(false).lRA().mRA().dQA(medium).WOA(anonymousClass0IL.f70031H).jOA(true).GD());
        }
    }
}
