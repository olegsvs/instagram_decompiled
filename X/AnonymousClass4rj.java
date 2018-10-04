package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.C0164R;
import com.instagram.genericsurvey.fragment.GenericSurveyFragment;

/* renamed from: X.4rj */
public final class AnonymousClass4rj implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ GenericSurveyFragment f57939B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0P7 f57940C;

    public AnonymousClass4rj(GenericSurveyFragment genericSurveyFragment, AnonymousClass0P7 anonymousClass0P7, AnonymousClass4rk anonymousClass4rk) {
        this.f57939B = genericSurveyFragment;
        this.f57940C = anonymousClass0P7;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 70057831);
        AnonymousClass0IL anonymousClass0IL = this.f57939B;
        AnonymousClass0P7 anonymousClass0P7 = this.f57940C;
        AnonymousClass1Vp anonymousClass5hY = new AnonymousClass5hY();
        anonymousClass5hY.f68249O = anonymousClass0IL.getResources().getString(C0164R.string.feed_item_page_title);
        AnonymousClass0IL DD = anonymousClass5hY.WPA(anonymousClass0P7.NO()).DD();
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass0IL.getActivity());
        anonymousClass0IZ.f2754D = DD;
        anonymousClass0IZ.B();
        AnonymousClass0cQ.L(this, 778442240, M);
    }
}
