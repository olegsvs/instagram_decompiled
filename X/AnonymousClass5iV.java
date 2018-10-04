package X;

import com.instagram.genericsurvey.fragment.GenericSurveyFragment;
import java.util.List;

/* renamed from: X.5iV */
public final class AnonymousClass5iV implements AnonymousClass3bF {
    /* renamed from: B */
    public final /* synthetic */ GenericSurveyFragment f68390B;
    /* renamed from: C */
    public final /* synthetic */ List f68391C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0MI f68392D;

    public final void onCancel() {
    }

    public final void yu(float f) {
    }

    public AnonymousClass5iV(GenericSurveyFragment genericSurveyFragment, List list, AnonymousClass0MI anonymousClass0MI) {
        this.f68390B = genericSurveyFragment;
        this.f68391C = list;
        this.f68392D = anonymousClass0MI;
    }

    public final void mx(String str) {
        if (this.f68390B.isResumed()) {
            AnonymousClass0ST H = AnonymousClass0Jd.f2931B.H();
            AnonymousClass1Q8 B = new AnonymousClass1Q8().B(this.f68391C, this.f68392D.getId(), this.f68390B.f73025M);
            B.f18309M = AnonymousClass0Qf.RATE_ADS;
            B.f18316T = this.f68390B.f73021I.kR();
            AnonymousClass0IL C = H.C(B.A());
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f68390B.getActivity());
            anonymousClass0IZ.f2754D = C;
            anonymousClass0IZ.f2752B = "ReelViewerFragment.BACK_STACK_NAME";
            anonymousClass0IZ.B();
            return;
        }
        onCancel();
    }
}
