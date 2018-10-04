package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igtv.viewer.IGTVViewerFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.4xM */
public final class AnonymousClass4xM implements AnonymousClass0QP {
    /* renamed from: B */
    public AnonymousClass0n8 f58823B;
    /* renamed from: C */
    public final AnonymousClass5Yb f58824C;
    /* renamed from: D */
    public boolean f58825D;
    /* renamed from: E */
    public final AnonymousClass0cN f58826E;
    /* renamed from: F */
    public final AnonymousClass0F8 f58827F = new AnonymousClass4xI(this);
    /* renamed from: G */
    private final View f58828G;
    /* renamed from: H */
    private final TextView f58829H;
    /* renamed from: I */
    private final FollowButton f58830I;
    /* renamed from: J */
    private final TextView f58831J;
    /* renamed from: K */
    private final TextView f58832K;
    /* renamed from: L */
    private final View f58833L;
    /* renamed from: M */
    private final View f58834M;
    /* renamed from: N */
    private final View f58835N;
    /* renamed from: O */
    private final View f58836O;
    /* renamed from: P */
    private final IgImageView f58837P;
    /* renamed from: Q */
    private final View f58838Q;
    /* renamed from: R */
    private final AnonymousClass0Cm f58839R;
    /* renamed from: S */
    private final TextView f58840S;

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public AnonymousClass4xM(AnonymousClass0Cm anonymousClass0Cm, View view, View view2, AnonymousClass5Yb anonymousClass5Yb) {
        this.f58839R = anonymousClass0Cm;
        this.f58835N = view;
        this.f58836O = view2;
        this.f58824C = anonymousClass5Yb;
        this.f58826E = AnonymousClass0e6.B().C().O(AnonymousClass0e5.C(40.0d, 8.0d)).A(this);
        this.f58829H = (TextView) view2.findViewById(C0164R.id.bio);
        this.f58832K = (TextView) view2.findViewById(C0164R.id.full_name);
        this.f58837P = (IgImageView) view2.findViewById(C0164R.id.profile_picture);
        this.f58831J = (TextView) view2.findViewById(C0164R.id.follower_count);
        this.f58830I = (FollowButton) view2.findViewById(C0164R.id.user_follow_button);
        this.f58840S = (TextView) view2.findViewById(C0164R.id.username);
        this.f58833L = view2.findViewById(C0164R.id.info_separator);
        ((TextView) this.f58836O.findViewById(C0164R.id.back_text)).setTypeface(AnonymousClass0nA.E());
        this.f58828G = this.f58836O.findViewById(C0164R.id.back_navigation);
        AnonymousClass15z anonymousClass15z = new AnonymousClass15z(this.f58828G);
        anonymousClass15z.f14386F = true;
        anonymousClass15z.f14385E = new AnonymousClass4xJ(this);
        anonymousClass15z.A();
        this.f58834M = this.f58836O.findViewById(C0164R.id.line);
        this.f58838Q = this.f58836O.findViewById(C0164R.id.upload_button);
        anonymousClass15z = new AnonymousClass15z(this.f58838Q);
        anonymousClass15z.f14385E = new AnonymousClass4xK(this);
        anonymousClass15z.f14386F = true;
        anonymousClass15z.A();
        anonymousClass15z = new AnonymousClass15z(view2.findViewById(C0164R.id.profile_info));
        anonymousClass15z.f14385E = new AnonymousClass4xL(this);
        anonymousClass15z.f14389I = 0.965f;
        anonymousClass15z.f14386F = true;
        anonymousClass15z.A();
        AnonymousClass0F4.f2058E.A(AnonymousClass0Za.class, this.f58827F);
        m25482F();
    }

    /* renamed from: A */
    public final void m25483A(boolean z) {
        this.f58826E.N(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
    }

    /* renamed from: B */
    public final AnonymousClass0Ci m25484B() {
        AnonymousClass0n8 anonymousClass0n8 = this.f58823B;
        if (anonymousClass0n8 != null) {
            return anonymousClass0n8.f10015K;
        }
        return null;
    }

    /* renamed from: B */
    public static void m25478B(AnonymousClass4xM anonymousClass4xM, AnonymousClass0Ci anonymousClass0Ci) {
        Object obj;
        CharSequence spannableStringBuilder;
        View view;
        anonymousClass4xM.f58829H.setText(anonymousClass0Ci.O());
        int i = 0;
        if (!(AnonymousClass0LQ.B(anonymousClass0Ci, anonymousClass4xM.f58839R.B()) || anonymousClass0Ci.qB == AnonymousClass0Lo.PrivacyStatusPublic)) {
            if (anonymousClass0Ci.f1751t != AnonymousClass0Lq.FollowStatusFollowing) {
                obj = null;
                anonymousClass4xM.f58829H.setVisibility(obj == null ? 0 : 8);
                spannableStringBuilder = new SpannableStringBuilder(anonymousClass0Ci.T());
                if (anonymousClass0Ci.u()) {
                    spannableStringBuilder.append("  ");
                    spannableStringBuilder.setSpan(new ImageSpan(anonymousClass4xM.f58832K.getContext(), C0164R.drawable.verified_profile), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                anonymousClass4xM.f58832K.setText(spannableStringBuilder);
                anonymousClass4xM.f58837P.setUrl(anonymousClass0Ci.DQ());
                anonymousClass4xM.f58840S.setText(anonymousClass0Ci.uT());
                if (anonymousClass0Ci.f1752u != null) {
                    anonymousClass4xM.f58831J.setVisibility(8);
                    anonymousClass4xM.f58833L.setVisibility(8);
                } else {
                    anonymousClass4xM.f58831J.setText(anonymousClass4xM.f58831J.getResources().getQuantityString(C0164R.plurals.igtv_profile_follower_count, anonymousClass0Ci.f1752u.intValue(), new Object[]{AnonymousClass3nt.C(anonymousClass0Ci.f1752u)}));
                    anonymousClass4xM.f58831J.setVisibility(0);
                    anonymousClass4xM.f58833L.setVisibility(0);
                }
                anonymousClass4xM.f58838Q.setVisibility(anonymousClass4xM.m25481E() ? 0 : 4);
                anonymousClass4xM.f58830I.setFollowButtonSize(AnonymousClass0er.B(anonymousClass4xM.f58839R).Q(anonymousClass0Ci).equals(AnonymousClass0Lq.FollowStatusNotFollowing) ? AnonymousClass19U.FULL : AnonymousClass19U.CONDENSED);
                anonymousClass4xM.f58830I.A(anonymousClass4xM.f58839R, anonymousClass0Ci, null);
                anonymousClass4xM.f58828G.setVisibility(anonymousClass4xM.f58825D ? 4 : 0);
                view = anonymousClass4xM.f58834M;
                if (anonymousClass4xM.f58825D && !anonymousClass4xM.m25481E()) {
                    i = 4;
                }
                view.setVisibility(i);
            }
        }
        obj = 1;
        if (obj == null) {
        }
        anonymousClass4xM.f58829H.setVisibility(obj == null ? 0 : 8);
        spannableStringBuilder = new SpannableStringBuilder(anonymousClass0Ci.T());
        if (anonymousClass0Ci.u()) {
            spannableStringBuilder.append("  ");
            spannableStringBuilder.setSpan(new ImageSpan(anonymousClass4xM.f58832K.getContext(), C0164R.drawable.verified_profile), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        anonymousClass4xM.f58832K.setText(spannableStringBuilder);
        anonymousClass4xM.f58837P.setUrl(anonymousClass0Ci.DQ());
        anonymousClass4xM.f58840S.setText(anonymousClass0Ci.uT());
        if (anonymousClass0Ci.f1752u != null) {
            anonymousClass4xM.f58831J.setText(anonymousClass4xM.f58831J.getResources().getQuantityString(C0164R.plurals.igtv_profile_follower_count, anonymousClass0Ci.f1752u.intValue(), new Object[]{AnonymousClass3nt.C(anonymousClass0Ci.f1752u)}));
            anonymousClass4xM.f58831J.setVisibility(0);
            anonymousClass4xM.f58833L.setVisibility(0);
        } else {
            anonymousClass4xM.f58831J.setVisibility(8);
            anonymousClass4xM.f58833L.setVisibility(8);
        }
        if (anonymousClass4xM.m25481E()) {
        }
        anonymousClass4xM.f58838Q.setVisibility(anonymousClass4xM.m25481E() ? 0 : 4);
        if (AnonymousClass0er.B(anonymousClass4xM.f58839R).Q(anonymousClass0Ci).equals(AnonymousClass0Lq.FollowStatusNotFollowing)) {
        }
        anonymousClass4xM.f58830I.setFollowButtonSize(AnonymousClass0er.B(anonymousClass4xM.f58839R).Q(anonymousClass0Ci).equals(AnonymousClass0Lq.FollowStatusNotFollowing) ? AnonymousClass19U.FULL : AnonymousClass19U.CONDENSED);
        anonymousClass4xM.f58830I.A(anonymousClass4xM.f58839R, anonymousClass0Ci, null);
        if (anonymousClass4xM.f58825D) {
        }
        anonymousClass4xM.f58828G.setVisibility(anonymousClass4xM.f58825D ? 4 : 0);
        view = anonymousClass4xM.f58834M;
        i = 4;
        view.setVisibility(i);
    }

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
        this.f58824C.m27552G(this, (int) this.f58826E.f7106D);
    }

    /* renamed from: C */
    public static void m25479C(AnonymousClass4xM anonymousClass4xM) {
        if (!anonymousClass4xM.f58825D) {
            anonymousClass4xM.m25483A(true);
        }
    }

    /* renamed from: C */
    public final boolean m25485C() {
        return this.f58826E.f7106D != StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
    }

    /* renamed from: D */
    public static void m25480D(AnonymousClass4xM anonymousClass4xM) {
        if (anonymousClass4xM.f58823B.f10015K != null) {
            AnonymousClass5Yb anonymousClass5Yb = anonymousClass4xM.f58824C;
            String id = anonymousClass4xM.f58823B.f10015K.getId();
            AnonymousClass0IL anonymousClass0IL = anonymousClass5Yb.f66229O;
            anonymousClass0IL.f66103R.B(IGTVViewerFragment.m27457E(anonymousClass0IL));
            Bundle bundle = new Bundle();
            bundle.putString("UserDetailFragment.EXTRA_USER_ID", id);
            new AnonymousClass0Sn(ModalActivity.class, "profile", bundle, anonymousClass0IL.getActivity(), anonymousClass0IL.f66102Q.f1759C).B(anonymousClass0IL.getActivity().getApplicationContext());
        }
    }

    /* renamed from: D */
    public final boolean m25486D() {
        if (this.f58825D || !m25485C()) {
            return false;
        }
        m25483A(true);
        return true;
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
    }

    /* renamed from: E */
    private boolean m25481E() {
        return AnonymousClass0LQ.B(this.f58823B.f10015K, this.f58839R.B());
    }

    /* renamed from: F */
    private void m25482F() {
        float E = (float) this.f58826E.E();
        int width = this.f58835N.getWidth();
        float E2 = AnonymousClass0nB.E(E, 0.0f, 1.0f, 0.0f, 1.0f, true);
        float D = AnonymousClass0nB.D(E, 0.0f, 1.0f, ((float) width) * 0.333f, 0.0f);
        float E3 = AnonymousClass0nB.E(E, 0.0f, 1.0f, 1.0f, 0.0f, true);
        float D2 = AnonymousClass0nB.D(E, 0.0f, 1.0f, 0.0f, ((float) (-width)) * 0.333f);
        this.f58835N.setAlpha(E3);
        this.f58835N.setTranslationX(D2);
        this.f58836O.setAlpha(E2);
        this.f58836O.setTranslationX(D);
        int i = 0;
        this.f58835N.setVisibility(E3 > 0.0f ? 0 : 4);
        View view = this.f58836O;
        if (E2 <= 0.0f) {
            i = 4;
        }
        view.setVisibility(i);
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        m25482F();
    }
}
