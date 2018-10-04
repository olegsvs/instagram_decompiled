package X;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.NestedScrollView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.instagram.leadads.model.LeadAdsInputFieldResponse;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.40l */
public final class AnonymousClass40l extends AnonymousClass0IJ implements AnonymousClass0IS, AnonymousClass3Rm, AnonymousClass1Yx, AnonymousClass3SH {
    /* renamed from: B */
    public View f48333B;
    /* renamed from: C */
    public String f48334C;
    /* renamed from: D */
    public String f48335D;
    /* renamed from: E */
    public ProgressButton f48336E;
    /* renamed from: F */
    public AnonymousClass3S1 f48337F;
    /* renamed from: G */
    private boolean f48338G;
    /* renamed from: H */
    private boolean f48339H;
    /* renamed from: I */
    private View f48340I;
    /* renamed from: J */
    private LinearLayout f48341J;
    /* renamed from: K */
    private AnonymousClass3Rn f48342K;

    public final String getModuleName() {
        return "lead_ad_question_page";
    }

    /* renamed from: B */
    public static ArrayList m22037B(AnonymousClass0Ow anonymousClass0Ow) {
        ArrayList arrayList = new ArrayList();
        int size = anonymousClass0Ow.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass40n anonymousClass40n = (AnonymousClass40n) anonymousClass0Ow.get(i);
            arrayList.add(new LeadAdsInputFieldResponse(anonymousClass40n.MQ().f41328G, anonymousClass40n.oL()));
        }
        return arrayList;
    }

    /* renamed from: C */
    public static AnonymousClass0Ow m22038C(AnonymousClass40l anonymousClass40l) {
        AnonymousClass1jJ anonymousClass1jJ = new AnonymousClass1jJ();
        for (int i = 0; i < anonymousClass40l.f48341J.getChildCount(); i++) {
            View childAt = anonymousClass40l.f48341J.getChildAt(i);
            if (childAt.getTag() instanceof AnonymousClass40n) {
                anonymousClass1jJ.E((AnonymousClass40n) childAt.getTag());
            }
        }
        return anonymousClass1jJ.H();
    }

    /* renamed from: D */
    private void m22039D(boolean z) {
        Bundle arguments = getArguments();
        arguments.putBoolean("submission_successful", z);
        AnonymousClass0OR.D(new Handler(), new AnonymousClass3Rp(this, arguments), 337480406);
    }

    public final void It(boolean z) {
        this.f48333B.setVisibility(z ? 0 : 8);
    }

    public final boolean onBackPressed() {
        if (this.f48338G) {
            AnonymousClass3Ra.m19659B(this.f48335D, "click_back_button_on_questions");
        } else {
            AnonymousClass3Ra.m19659B(this.f48335D, "back_out");
        }
        AnonymousClass3S1 anonymousClass3S1 = this.f48337F;
        anonymousClass3S1.f41317D.put(this.f48334C, AnonymousClass40l.m22037B(AnonymousClass40l.m22038C(this)));
        if (!this.f48339H) {
            AnonymousClass3S1 anonymousClass3S12 = this.f48337F;
            anonymousClass3S12.f41316C.put(this.f48334C, Boolean.valueOf(this.f48336E.isEnabled()));
        }
        return false;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1540899078);
        View inflate = layoutInflater.inflate(C0164R.layout.lead_ads_page_fragment, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0164R.id.page_container);
        this.f48335D = getArguments().getString("mediaID");
        this.f48334C = getArguments().getString("formID");
        AnonymousClass3Ry A = AnonymousClass1LD.f17296C.A(this.f48334C);
        AnonymousClass0LH.E(A);
        this.f48339H = AnonymousClass3Sc.m19676B(A);
        r6.f48338G = A.m19665B() != null;
        AnonymousClass3SL.m19670B(new AnonymousClass3SK(linearLayout), A.m19665B(), getArguments().getString("brandingImageURI"));
        AnonymousClass3SP.m19673B(new AnonymousClass3SO(linearLayout), A.m19664A(), getArguments().getString("profilePicURI"));
        AnonymousClass3Rr A2 = A.m19664A();
        View findViewById = inflate.findViewById(C0164R.id.lead_ad_action_bar);
        r6.f48333B = findViewById;
        ((TextView) findViewById.findViewById(C0164R.id.lead_ad_action_bar_title)).setText(A2.f41283B);
        AnonymousClass3S1 B = AnonymousClass3S1.m19666B(AnonymousClass0Ce.G(getArguments()));
        r6.f48337F = B;
        List list = (List) B.f41317D.get(r6.f48334C);
        AnonymousClass3S4 anonymousClass3S4 = A.f41310B.f41308G;
        int i = r6.f48339H ^ 1;
        AnonymousClass3S2 anonymousClass3S2 = A.f41310B.f41307F;
        View inflate2 = LayoutInflater.from(linearLayout.getContext()).inflate(C0164R.layout.lead_ads_questions, linearLayout, false);
        inflate2.setTag(new AnonymousClass3SR(inflate2));
        AnonymousClass3SR anonymousClass3SR = (AnonymousClass3SR) inflate2.getTag();
        anonymousClass3SR.f41368C.setText(anonymousClass3S4.f41335D);
        AnonymousClass0Ow anonymousClass0Ow = anonymousClass3S4.f41334C;
        for (int i2 = 0; i2 < anonymousClass0Ow.size(); i2++) {
            View inflate3;
            AnonymousClass3S3 anonymousClass3S3 = (AnonymousClass3S3) anonymousClass0Ow.get(i2);
            AnonymousClass2Bx anonymousClass2Bx = anonymousClass3S3.f41325D;
            AnonymousClass0LH.E(anonymousClass2Bx);
            CharSequence charSequence = null;
            ViewGroup viewGroup2;
            switch (AnonymousClass3SQ.f41366B[anonymousClass2Bx.ordinal()]) {
                case 1:
                    int i3;
                    viewGroup2 = anonymousClass3SR.f41367B;
                    inflate3 = LayoutInflater.from(viewGroup2.getContext()).inflate(C0164R.layout.lead_ads_text_question, viewGroup2, false);
                    inflate3.setTag(new AnonymousClass1V3(inflate3));
                    AnonymousClass1V3 anonymousClass1V3 = (AnonymousClass1V3) inflate3.getTag();
                    if (list != null) {
                        charSequence = ((LeadAdsInputFieldResponse) list.get(i2)).f41313B;
                    }
                    int i4 = 1;
                    if (i2 != anonymousClass0Ow.size() - 1) {
                        i4 = 0;
                    }
                    anonymousClass1V3.f19273E = anonymousClass3S3;
                    anonymousClass1V3.f19272D.setText(anonymousClass3S3.f41329H);
                    anonymousClass1V3.f19270B.setOnFocusChangeListener(null);
                    anonymousClass1V3.f19270B.setOnEditorActionListener(null);
                    anonymousClass1V3.f19270B.setEnabled(anonymousClass3S3.f41326E);
                    anonymousClass1V3.f19270B.setHint(anonymousClass3S3.f41331J);
                    anonymousClass1V3.f19270B.setSaveEnabled(false);
                    anonymousClass1V3.f19270B.setImeOptions(i4 != 0 ? 6 : 5);
                    AnonymousClass0LH.E(anonymousClass3S3.f41324C);
                    AnonymousClass2Bw anonymousClass2Bw = anonymousClass3S3.f41324C;
                    if (anonymousClass2Bw != null) {
                        switch (anonymousClass2Bw.ordinal()) {
                            case 1:
                                i3 = 33;
                                break;
                            case 2:
                                i3 = 3;
                                break;
                            case 8:
                            case 9:
                            case 11:
                            case 12:
                            case ParserMinimalBase.INT_CR /*13*/:
                                i3 = 2;
                                break;
                            case 10:
                                i3 = 528497;
                                break;
                            default:
                                break;
                        }
                    }
                    i3 = 16385;
                    anonymousClass1V3.f19270B.setInputType(i3);
                    AnonymousClass0Ow anonymousClass0Ow2 = anonymousClass3S3.f41332K;
                    if (!anonymousClass0Ow2.isEmpty()) {
                        anonymousClass1V3.f19270B.setText((String) anonymousClass0Ow2.get(0));
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        anonymousClass1V3.f19270B.setText(charSequence);
                    }
                    anonymousClass1V3.f19270B.setOnFocusChangeListener(new AnonymousClass3SW(anonymousClass1V3, anonymousClass3S3));
                    anonymousClass1V3.f19270B.setOnEditorActionListener(new AnonymousClass3SX(anonymousClass1V3, anonymousClass3S3));
                    break;
                case 2:
                case 3:
                    viewGroup2 = anonymousClass3SR.f41367B;
                    inflate3 = LayoutInflater.from(viewGroup2.getContext()).inflate(C0164R.layout.lead_ads_select_question, viewGroup2, false);
                    inflate3.setTag(new AnonymousClass44y(inflate3));
                    AnonymousClass44y anonymousClass44y = (AnonymousClass44y) inflate3.getTag();
                    if (list != null) {
                        charSequence = ((LeadAdsInputFieldResponse) list.get(i2)).f41313B;
                    }
                    anonymousClass44y.f49627D = anonymousClass3S3;
                    anonymousClass44y.f49626C.setText(anonymousClass3S3.f41329H);
                    anonymousClass44y.f49628E.setOnItemSelectedListener(null);
                    AnonymousClass0LH.E(anonymousClass3S3.f41331J);
                    AnonymousClass3S9 anonymousClass3S9 = new AnonymousClass3S9(anonymousClass44y.f49628E.getContext(), anonymousClass3S3.f41330I, anonymousClass3S3.f41331J);
                    anonymousClass44y.f49628E.setAdapter(anonymousClass3S9);
                    anonymousClass44y.f49628E.setSelection(anonymousClass3S9.getCount());
                    if (!TextUtils.isEmpty(charSequence)) {
                        anonymousClass44y.f49628E.setSelection(anonymousClass3S3.f41330I.indexOf(charSequence));
                    }
                    anonymousClass44y.f49628E.setOnItemSelectedListener(new AnonymousClass3SS(anonymousClass44y));
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unsupported input type: ");
                    stringBuilder.append(anonymousClass2Bx);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
            anonymousClass3SR.f41367B.addView(inflate3);
        }
        if (i != 0) {
            View C = AnonymousClass3SN.m19672C(anonymousClass3SR.f41367B);
            AnonymousClass3SN.m19671B((AnonymousClass3SM) C.getTag(), anonymousClass3S2);
            anonymousClass3SR.f41367B.addView(C);
        }
        linearLayout.addView(inflate2);
        AnonymousClass0LH.E(anonymousClass3S4.f41333B);
        ViewStub viewStub = (ViewStub) inflate.findViewById(C0164R.id.lead_ads_footer_stub);
        String str = anonymousClass3S4.f41333B;
        viewStub.setLayoutResource(C0164R.layout.lead_ads_footer_button);
        View inflate4 = viewStub.inflate();
        AnonymousClass3SJ.m19669B(new AnonymousClass3SI(inflate4), str, r6);
        r6.f48336E = (ProgressButton) inflate4.findViewById(C0164R.id.lead_ad_cta);
        r6.f48341J = (LinearLayout) linearLayout.findViewById(C0164R.id.questions_root_container);
        inflate.findViewById(C0164R.id.lead_ad_close_button).setOnClickListener(new AnonymousClass3Ro(r6));
        NestedScrollView nestedScrollView = (NestedScrollView) inflate.findViewById(C0164R.id.lead_ads_scroll_view);
        r6.f48342K = new AnonymousClass3Rn(nestedScrollView, ((int) getResources().getDimension(C0164R.dimen.lead_ad_header_image_height)) - AnonymousClass0ip.B(getContext()), r6);
        if (!(r6.f48339H || r6.f48337F.m19667A(r6.f48334C))) {
            r6.f48336E.setEnabled(false);
            r6.f48340I = inflate.findViewById(C0164R.id.lead_ad_privacy_policy);
            r6.f48342K.m19662A(r6.f48340I);
        }
        nestedScrollView.setDescendantFocusability(131072);
        nestedScrollView.setFocusable(true);
        nestedScrollView.setFocusableInTouchMode(true);
        AnonymousClass0cQ.G(r6, -1012287048, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 605294427);
        this.f48342K.m19663B(this.f48340I);
        this.f48342K = null;
        this.f48341J = null;
        this.f48340I = null;
        this.f48336E = null;
        this.f48333B = null;
        super.onDestroyView();
        AnonymousClass0cQ.G(this, 1714941574, F);
    }

    public final void onFailure() {
        AnonymousClass3Ra.m19659B(this.f48335D, "submit_fail");
        m22039D(false);
    }

    public final void onSuccess() {
        Bundle arguments = getArguments();
        AnonymousClass3Ra.m19659B(this.f48335D, "submit_success");
        AnonymousClass3Mh.m19478B().m19480B(arguments.getString("adID"), true);
        AnonymousClass3Rb.m19660B(arguments, this);
        m22039D(true);
    }

    public final void qe() {
        AnonymousClass0Ow C = AnonymousClass40l.m22038C(this);
        int size = C.size();
        AnonymousClass3SF anonymousClass3SF = null;
        for (int i = 0; i < size; i++) {
            AnonymousClass40n anonymousClass40n = (AnonymousClass40n) C.get(i);
            if (AnonymousClass3Sb.m19675C(anonymousClass40n.oL(), anonymousClass40n.MQ())) {
                anonymousClass40n.YE();
            } else {
                if (anonymousClass3SF == null) {
                    anonymousClass3SF = anonymousClass40n;
                }
                anonymousClass40n.zTA();
            }
        }
        if (anonymousClass3SF == null) {
            ArrayList B = AnonymousClass40l.m22037B(C);
            FragmentActivity activity = getActivity();
            Bundle arguments = getArguments();
            arguments.putParcelableArrayList("inputFieldResponse", B);
            AnonymousClass3Ry A = AnonymousClass1LD.f17296C.A(this.f48334C);
            if (A != null) {
                if (AnonymousClass3Sc.m19676B(A)) {
                    AnonymousClass3S1 anonymousClass3S1 = this.f48337F;
                    anonymousClass3S1.f41317D.put(this.f48334C, AnonymousClass40l.m22037B(AnonymousClass40l.m22038C(this)));
                    AnonymousClass3Ra.m19659B(this.f48335D, "click_next_button_on_questions");
                    new AnonymousClass0IZ(activity).F(new AnonymousClass40k(), arguments).B();
                } else {
                    AnonymousClass0Nm.N(this.f48336E);
                    AnonymousClass3Ra.m19659B(this.f48335D, "click_submit_button");
                    AnonymousClass3Rf.m19661B(getContext(), getLoaderManager(), arguments, this, null);
                }
            }
            ProgressButton progressButton = this.f48336E;
            if (progressButton != null) {
                progressButton.setShowProgressBar(true);
                this.f48336E.setEnabled(false);
                return;
            }
            return;
        }
        anonymousClass3SF.BLA();
    }

    public final void qu() {
        this.f48336E.setEnabled(true);
    }
}
