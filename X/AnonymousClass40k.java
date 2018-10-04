package X;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.NestedScrollView;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.leadads.model.LeadAdsDisclaimerResponse;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.40k */
public final class AnonymousClass40k extends AnonymousClass0IJ implements AnonymousClass0IS, AnonymousClass3Rm, AnonymousClass1Yx, AnonymousClass3SH {
    /* renamed from: B */
    public View f48325B;
    /* renamed from: C */
    public String f48326C;
    /* renamed from: D */
    public ProgressButton f48327D;
    /* renamed from: E */
    private LinearLayout f48328E;
    /* renamed from: F */
    private String f48329F;
    /* renamed from: G */
    private View f48330G;
    /* renamed from: H */
    private AnonymousClass3S1 f48331H;
    /* renamed from: I */
    private AnonymousClass3Rn f48332I;

    public final String getModuleName() {
        return "lead_ad_custom_disclaimer_page";
    }

    /* renamed from: B */
    private AnonymousClass0Ow m22035B() {
        AnonymousClass1jJ anonymousClass1jJ = new AnonymousClass1jJ();
        for (int i = 0; i < this.f48328E.getChildCount(); i++) {
            View childAt = this.f48328E.getChildAt(i);
            if (childAt.getTag() instanceof AnonymousClass44x) {
                anonymousClass1jJ.E((AnonymousClass44x) childAt.getTag());
            }
        }
        return anonymousClass1jJ.H();
    }

    /* renamed from: C */
    private void m22036C(boolean z) {
        Bundle arguments = getArguments();
        arguments.putBoolean("submission_successful", z);
        AnonymousClass0OR.D(new Handler(), new AnonymousClass3Rk(this, arguments), 392695747);
    }

    public final void It(boolean z) {
        this.f48325B.setVisibility(z ? 0 : 8);
    }

    public final boolean onBackPressed() {
        AnonymousClass3Ra.m19659B(this.f48326C, "click_back_button_on_disclaimer");
        AnonymousClass3S1 anonymousClass3S1 = this.f48331H;
        String str = this.f48329F;
        AnonymousClass0Ow B = m22035B();
        ArrayList arrayList = new ArrayList();
        int size = B.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass44x anonymousClass44x = (AnonymousClass44x) B.get(i);
            arrayList.add(new LeadAdsDisclaimerResponse(anonymousClass44x.f49622E.f41297D, anonymousClass44x.f49619B.isChecked()));
        }
        anonymousClass3S1.f41315B.put(str, arrayList);
        AnonymousClass3S1 anonymousClass3S12 = this.f48331H;
        anonymousClass3S12.f41316C.put(this.f48329F, Boolean.valueOf(this.f48327D.isEnabled()));
        return false;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -694704525);
        View inflate = layoutInflater.inflate(C0164R.layout.lead_ads_page_fragment, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0164R.id.page_container);
        this.f48326C = getArguments().getString("mediaID");
        this.f48329F = getArguments().getString("formID");
        AnonymousClass3Ry A = AnonymousClass1LD.f17296C.A(this.f48329F);
        AnonymousClass0LH.E(A);
        AnonymousClass3SL.m19670B(new AnonymousClass3SK(linearLayout), A.m19665B(), getArguments().getString("brandingImageURI"));
        AnonymousClass3SP.m19673B(new AnonymousClass3SO(linearLayout), A.m19664A(), getArguments().getString("profilePicURI"));
        AnonymousClass3Rr A2 = A.m19664A();
        View findViewById = inflate.findViewById(C0164R.id.lead_ad_action_bar);
        this.f48325B = findViewById;
        ((TextView) findViewById.findViewById(C0164R.id.lead_ad_action_bar_title)).setText(A2.f41283B);
        AnonymousClass3S1 B = AnonymousClass3S1.m19666B(AnonymousClass0Ce.G(getArguments()));
        this.f48331H = B;
        List list = (List) B.f41315B.get(this.f48329F);
        AnonymousClass3Rw anonymousClass3Rw = A.f41310B.f41306E;
        AnonymousClass0LH.E(anonymousClass3Rw);
        AnonymousClass3S2 anonymousClass3S2 = A.f41310B.f41307F;
        View inflate2 = LayoutInflater.from(linearLayout.getContext()).inflate(C0164R.layout.lead_ads_custom_disclaimer, linearLayout, false);
        inflate2.setTag(new AnonymousClass3SE(inflate2));
        AnonymousClass3SE anonymousClass3SE = (AnonymousClass3SE) inflate2.getTag();
        if (TextUtils.isEmpty(anonymousClass3Rw.f41302E)) {
            anonymousClass3SE.f41359D.setVisibility(8);
        } else {
            anonymousClass3SE.f41359D.setVisibility(0);
            anonymousClass3SE.f41359D.setText(anonymousClass3Rw.f41302E);
        }
        AnonymousClass3Rt anonymousClass3Rt = anonymousClass3Rw.f41301D;
        AnonymousClass0Ow anonymousClass0Ow = anonymousClass3Rt.f41290B;
        CharSequence spannableStringBuilder = new SpannableStringBuilder(anonymousClass3Rt.f41291C);
        if (anonymousClass0Ow != null) {
            int size = anonymousClass0Ow.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass3Ru anonymousClass3Ru = (AnonymousClass3Ru) anonymousClass0Ow.get(i);
                spannableStringBuilder = AnonymousClass1g3.C(spannableStringBuilder.subSequence(anonymousClass3Ru.f41293C, anonymousClass3Ru.f41293C + anonymousClass3Ru.f41292B).toString(), spannableStringBuilder, new AnonymousClass3Sa(Uri.parse(anonymousClass3Ru.f41294D)));
            }
            anonymousClass3SE.f41357B.setMovementMethod(LinkMovementMethod.getInstance());
        }
        anonymousClass3SE.f41357B.setText(spannableStringBuilder);
        AnonymousClass0Ow anonymousClass0Ow2 = anonymousClass3Rw.f41300C;
        if (!(anonymousClass0Ow2 == null || anonymousClass0Ow2.isEmpty())) {
            Object obj = anonymousClass0Ow2.size() == 1 ? 1 : null;
            for (int i2 = 0; i2 < anonymousClass0Ow2.size(); i2++) {
                AnonymousClass3Rv anonymousClass3Rv = (AnonymousClass3Rv) anonymousClass0Ow2.get(i2);
                ViewGroup viewGroup2 = anonymousClass3SE.f41358C;
                View inflate3 = LayoutInflater.from(viewGroup2.getContext()).inflate(C0164R.layout.lead_ads_checkbox_view, viewGroup2, false);
                inflate3.setTag(new AnonymousClass44x(inflate3));
                AnonymousClass44x anonymousClass44x = (AnonymousClass44x) inflate3.getTag();
                boolean z = list != null && ((LeadAdsDisclaimerResponse) list.get(i2)).f41312C;
                anonymousClass44x.f49622E = anonymousClass3Rv;
                if (obj != null) {
                    anonymousClass44x.f49620C.setVisibility(8);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(" ");
                stringBuilder.append(anonymousClass44x.f49621D.getResources().getString(C0164R.string.lead_ad_optional_checkbox));
                String stringBuilder2 = stringBuilder.toString();
                String str = anonymousClass44x.f49622E.f41298E;
                String str2 = str;
                AnonymousClass0LH.E(str);
                CharSequence spannableStringBuilder2 = new SpannableStringBuilder(str);
                if (!anonymousClass3Rv.f41296C) {
                    spannableStringBuilder2.append(stringBuilder2);
                    str = str2;
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(AnonymousClass0Ca.C(anonymousClass44x.f49621D.getContext(), C0164R.color.grey_5)), str.length(), str.length() + stringBuilder2.length(), 33);
                }
                anonymousClass44x.f49621D.setText(spannableStringBuilder2);
                anonymousClass44x.f49619B.setChecked(anonymousClass44x.f49622E.f41295B);
                anonymousClass44x.f49619B.setChecked(z);
                anonymousClass44x.f49619B.setOnCheckedChangeListener(new AnonymousClass3SA(anonymousClass44x));
                anonymousClass44x.f49623F.setOnClickListener(new AnonymousClass3SB(anonymousClass44x));
                anonymousClass3SE.f41358C.addView(inflate3);
            }
        }
        View C = AnonymousClass3SN.m19672C(anonymousClass3SE.f41358C);
        AnonymousClass3SN.m19671B((AnonymousClass3SM) C.getTag(), anonymousClass3S2);
        anonymousClass3SE.f41358C.addView(C);
        linearLayout.addView(inflate2);
        ViewStub viewStub = (ViewStub) inflate.findViewById(C0164R.id.lead_ads_footer_stub);
        String str3 = anonymousClass3Rw.f41299B;
        viewStub.setLayoutResource(C0164R.layout.lead_ads_footer_button);
        findViewById = viewStub.inflate();
        AnonymousClass3SJ.m19669B(new AnonymousClass3SI(findViewById), str3, r3);
        r3.f48327D = (ProgressButton) findViewById.findViewById(C0164R.id.lead_ad_cta);
        r3.f48328E = (LinearLayout) linearLayout.findViewById(C0164R.id.custom_disclaimer_root_container);
        inflate.findViewById(C0164R.id.lead_ad_close_button).setOnClickListener(new AnonymousClass3Rj(r3));
        r3.f48332I = new AnonymousClass3Rn((NestedScrollView) inflate.findViewById(C0164R.id.lead_ads_scroll_view), ((int) getResources().getDimension(C0164R.dimen.lead_ad_header_image_height)) - AnonymousClass0ip.B(getContext()), r3);
        if (!r3.f48331H.m19667A(r3.f48329F)) {
            r3.f48327D.setEnabled(false);
            r3.f48330G = inflate.findViewById(C0164R.id.lead_ad_privacy_policy);
            r3.f48332I.m19662A(r3.f48330G);
        }
        AnonymousClass0cQ.G(r3, -97082590, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -1893185697);
        this.f48332I.m19663B(this.f48330G);
        this.f48332I = null;
        this.f48328E = null;
        this.f48330G = null;
        this.f48327D = null;
        this.f48325B = null;
        super.onDestroyView();
        AnonymousClass0cQ.G(this, -264360700, F);
    }

    public final void onFailure() {
        AnonymousClass3Ra.m19659B(this.f48326C, "submit_fail");
        m22036C(false);
    }

    public final void onSuccess() {
        Bundle arguments = getArguments();
        AnonymousClass3Ra.m19659B(this.f48326C, "submit_success");
        AnonymousClass3Mh.m19478B().m19480B(arguments.getString("adID"), true);
        AnonymousClass3Rb.m19660B(arguments, this);
        m22036C(true);
    }

    public final void qe() {
        AnonymousClass0Ow B = m22035B();
        int size = B.size();
        AnonymousClass3SF anonymousClass3SF = null;
        for (int i = 0; i < size; i++) {
            AnonymousClass44x anonymousClass44x = (AnonymousClass44x) B.get(i);
            if (AnonymousClass3Sb.m19674B(anonymousClass44x.f49619B.isChecked(), anonymousClass44x.f49622E)) {
                anonymousClass44x.YE();
            } else {
                if (anonymousClass3SF == null) {
                    anonymousClass3SF = anonymousClass44x;
                }
                anonymousClass44x.zTA();
            }
        }
        if (anonymousClass3SF == null) {
            this.f48327D.setShowProgressBar(true);
            this.f48327D.setEnabled(false);
            ArrayList arrayList = new ArrayList();
            int size2 = B.size();
            for (int i2 = 0; i2 < size2; i2++) {
                AnonymousClass44x anonymousClass44x2 = (AnonymousClass44x) B.get(i2);
                if (!anonymousClass44x2.f49622E.f41296C) {
                    arrayList.add(new LeadAdsDisclaimerResponse(anonymousClass44x2.f49622E.f41297D, anonymousClass44x2.f49619B.isChecked()));
                }
            }
            AnonymousClass3Ra.m19659B(this.f48326C, "click_submit_button");
            AnonymousClass3Rf.m19661B(getContext(), getLoaderManager(), getArguments(), this, arrayList);
            return;
        }
        anonymousClass3SF.BLA();
    }

    public final void qu() {
        this.f48327D.setEnabled(true);
    }
}
