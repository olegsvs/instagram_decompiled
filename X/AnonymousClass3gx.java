package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.survey.structuredsurvey.views.SurveyListView;
import com.instagram.survey.ui.RapidFeedbackPageView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3gx */
public final class AnonymousClass3gx extends AnonymousClass0IJ implements AnonymousClass0IS, AnonymousClass0IT {
    /* renamed from: D */
    public static final String f43342D = "RapidFeedbackOutroFragment";
    /* renamed from: B */
    public String f43343B;
    /* renamed from: C */
    private View f43344C;

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.n(false);
        anonymousClass0eT.Z(C0164R.string.rapidfeedback_survey_title);
        AnonymousClass22r B = AnonymousClass0eW.B(AnonymousClass0eV.MODAL);
        B.f25410D = C0164R.drawable.check;
        B.f25409C = C0164R.string.confirm;
        B.f25408B = AnonymousClass0ca.B(AnonymousClass0Ca.C(getContext(), C0164R.color.blue_5));
        anonymousClass0eT.m(true, new AnonymousClass3gw(this));
        anonymousClass0eT.d(B.m14277B());
    }

    public final String getModuleName() {
        return f43342D;
    }

    public final boolean onBackPressed() {
        getActivity().finish();
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 2119421527);
        super.onCreate(bundle);
        this.f43343B = getArguments().getString("ARG_TOAST_TEXT");
        AnonymousClass0lj anonymousClass0lj = new AnonymousClass0lj();
        anonymousClass0lj.L(new AnonymousClass235(getActivity()));
        a(anonymousClass0lj);
        AnonymousClass0cQ.G(this, -1223269361, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 647407664);
        View inflate = layoutInflater.inflate(C0164R.layout.rapidfeedback_outro_view, viewGroup, false);
        this.f43344C = inflate;
        AnonymousClass0cQ.G(this, -146751303, F);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        SurveyListView surveyListView = (SurveyListView) ((RapidFeedbackPageView) this.f43344C.findViewById(C0164R.id.rapidfeedback_page)).findViewById(C0164R.id.rapidfeedback_page_list);
        Context context = getContext();
        List arrayList = new ArrayList();
        arrayList.add(new AnonymousClass41v(this.f43343B));
        surveyListView.setAdapter(new AnonymousClass3hD(context, (ArrayList) arrayList));
    }
}
