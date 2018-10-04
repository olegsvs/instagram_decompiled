package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.facebook.C0164R;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.5Rw */
public final class AnonymousClass5Rw extends AnonymousClass0IJ implements AnonymousClass0IS, AnonymousClass0IT, AnonymousClass4ro, AnonymousClass0Pg {
    /* renamed from: B */
    public AnonymousClass0MI f63618B;
    /* renamed from: C */
    public RectF f63619C;
    /* renamed from: D */
    public AnonymousClass0lG f63620D;
    /* renamed from: E */
    public SpinnerImageView f63621E;
    /* renamed from: F */
    public AnonymousClass0Cm f63622F;
    /* renamed from: G */
    public ViewGroup f63623G;
    /* renamed from: H */
    public AnonymousClass4BN f63624H;
    /* renamed from: I */
    private String f63625I;

    public final String getModuleName() {
        return "brandedcontent_violation";
    }

    public final void or(AnonymousClass3Kl anonymousClass3Kl) {
    }

    public final void pr(AnonymousClass0XM anonymousClass0XM) {
    }

    public final void qr(AnonymousClass0XM anonymousClass0XM) {
    }

    /* renamed from: B */
    public static void m26584B(AnonymousClass5Rw anonymousClass5Rw, ViewGroup viewGroup) {
        View D = AnonymousClass52q.m25625D(anonymousClass5Rw.getContext(), anonymousClass5Rw.f63624H.f51220D);
        AnonymousClass52q.m25623B(anonymousClass5Rw.getContext(), anonymousClass5Rw.f63622F, D, anonymousClass5Rw.f63624H.f51220D, anonymousClass5Rw);
        viewGroup.addView(D, 0);
        anonymousClass5Rw.rr(anonymousClass5Rw.f63624H.f51220D);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(C0164R.id.branded_content_preview);
        AnonymousClass4BN anonymousClass4BN = anonymousClass5Rw.f63624H;
        if (anonymousClass4BN.f51221E != null) {
            anonymousClass5Rw.f63618B = AnonymousClass0Jd.f2931B.M(anonymousClass5Rw.f63622F).J(anonymousClass4BN.f51221E, true);
            View D2 = AnonymousClass4rq.m25225D(viewGroup2);
            AnonymousClass4rp C = AnonymousClass4rq.m25224C(D2);
            AnonymousClass0MI anonymousClass0MI = anonymousClass5Rw.f63618B;
            AnonymousClass4rq.m25223B(C, anonymousClass0MI, anonymousClass5Rw, Collections.singletonList(anonymousClass0MI), false);
            viewGroup2.addView(D2);
        } else if (anonymousClass4BN.f51218B != null) {
            AnonymousClass0IL P = AnonymousClass0Ir.f2848B.A().P(anonymousClass4BN.f51218B.B().NO());
            P.getArguments().putString("IgSessionManager.USER_ID", anonymousClass5Rw.f63622F.f1759C);
            anonymousClass5Rw.getChildFragmentManager().B().M(C0164R.id.branded_content_preview, P).F();
        }
    }

    /* renamed from: C */
    public static void m26585C(AnonymousClass5Rw anonymousClass5Rw) {
        String str;
        anonymousClass5Rw.f63621E.setLoadingStatus(AnonymousClass2M2.LOADING);
        AnonymousClass0Cn anonymousClass0Cn = anonymousClass5Rw.f63622F;
        if (TextUtils.isEmpty(anonymousClass5Rw.f63625I)) {
            str = "business/branded_content/bc_policy_violation/";
        } else {
            str = AnonymousClass0IE.E("%s%s/", new Object[]{"business/branded_content/bc_policy_violation/", AnonymousClass0q1.B(anonymousClass5Rw.f63625I)});
        }
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        anonymousClass0Pt.f4229M = str;
        AnonymousClass0GA H = anonymousClass0Pt.M(AnonymousClass4BO.class).H();
        H.f2849B = new AnonymousClass4B7(anonymousClass5Rw);
        anonymousClass5Rw.schedule(H);
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT = anonymousClass0eT.X(C0164R.layout.action_bar_title_logo, 0, 0);
        LayoutParams layoutParams = (LayoutParams) anonymousClass0eT.getLayoutParams();
        layoutParams.gravity = 17;
        anonymousClass0eT.setLayoutParams(layoutParams);
    }

    public final void nr(AnonymousClass0XM anonymousClass0XM, AnonymousClass0le anonymousClass0le) {
        if ("branded_content_violation_edit".equals(anonymousClass0le.f9573B)) {
            AnonymousClass0iN.B(this.f63622F, anonymousClass0XM, AnonymousClass0iM.BRANDED_CONTENT_VIOLATION_EDIT, AnonymousClass0iL.BRANDED_CONTENT_VIOLATION);
            AnonymousClass3i1.C(getActivity(), this.f63622F.f1759C, new AnonymousClass4B8(this), false, null);
        } else if ("clicked".equals(anonymousClass0le.f9573B)) {
            AnonymousClass0iN.B(this.f63622F, anonymousClass0XM, AnonymousClass0iM.CLICKED, AnonymousClass0iL.BRANDED_CONTENT_VIOLATION);
            AnonymousClass0MI anonymousClass0MI = this.f63618B;
            if (anonymousClass0MI != null) {
                anonymousClass0MI.O();
            }
            AnonymousClass114.E(getFragmentManager());
            AnonymousClass0GA B = AnonymousClass1Q7.B(this.f63622F, this.f63624H.f51222F, this.f63624H.f51219C, null);
            B.f2849B = new AnonymousClass4BB(this);
            schedule(B);
        } else if ("branded_content_violation_appeal".equals(anonymousClass0le.f9573B)) {
            AnonymousClass0iN.B(this.f63622F, anonymousClass0XM, AnonymousClass0iM.BRANDED_CONTENT_VIOLATION_APPEAL, AnonymousClass0iL.BRANDED_CONTENT_VIOLATION);
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(getActivity());
            anonymousClass0IZ.f2752B = AnonymousClass4B1.f51175G;
            anonymousClass0IZ.f2754D = AnonymousClass0IY.B().J(this.f63624H.f51219C, this.f63622F);
            anonymousClass0IZ.B();
        }
    }

    public final boolean onBackPressed() {
        getActivity().finish();
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -209757151);
        super.onCreate(bundle);
        this.f63622F = AnonymousClass0Ce.G(getArguments());
        this.f63625I = getArguments().getString("com.instagram.brandedcontent.violation.ARGUMENT_EXTRA_VIOLATION_MEDIA_ID");
        AnonymousClass0cQ.G(this, 1877514280, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1974301393);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C0164R.layout.violation_alert_fragment, viewGroup, false);
        this.f63623G = (ViewGroup) viewGroup2.findViewById(C0164R.id.branded_content_violation_alert_list);
        this.f63621E = (SpinnerImageView) viewGroup2.findViewById(C0164R.id.preview_image_spinner);
        if (this.f63624H == null) {
            AnonymousClass5Rw.m26585C(this);
        } else {
            this.f63621E.setLoadingStatus(AnonymousClass2M2.SUCCESS);
            AnonymousClass5Rw.m26584B(this, this.f63623G);
        }
        this.f63620D = AnonymousClass0Jd.f2931B.O(getActivity(), this.f63622F);
        AnonymousClass0cQ.G(this, 970935871, F);
        return viewGroup2;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -184045119);
        super.onDestroyView();
        this.f63623G = null;
        this.f63621E = null;
        AnonymousClass0cQ.G(this, -1792280227, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, 594043949);
        super.onPause();
        this.f63620D.K();
        AnonymousClass0cQ.G(this, 1998958907, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -1995436251);
        super.onResume();
        AnonymousClass0lG anonymousClass0lG = this.f63620D;
        if (anonymousClass0lG != null && anonymousClass0lG.G()) {
            getView().getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass4B5(this));
        }
        AnonymousClass0cQ.G(this, 1404069371, F);
    }

    public final void rr(AnonymousClass0XM anonymousClass0XM) {
        AnonymousClass0iN.B(this.f63622F, anonymousClass0XM, AnonymousClass0iM.SEEN, AnonymousClass0iL.BRANDED_CONTENT_VIOLATION);
    }

    public final void zv(AnonymousClass0MI anonymousClass0MI, AnonymousClass4rp anonymousClass4rp, List list) {
        String NO = ((AnonymousClass0P7) this.f63624H.f51221E.f11118N.get(0)).NO();
        Set hashSet = new HashSet();
        hashSet.add(NO);
        this.f63619C = AnonymousClass0Nm.L(anonymousClass4rp.f57956B);
        this.f63620D.F(anonymousClass0MI, null, -1, null, this.f63619C, new AnonymousClass4BC(this, anonymousClass0MI, hashSet), true, AnonymousClass0Qf.BRANDED_CONTENT, hashSet);
    }
}
