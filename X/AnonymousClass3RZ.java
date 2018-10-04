package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.leadads.activity.LeadAdsActivity;

/* renamed from: X.3RZ */
public final class AnonymousClass3RZ implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ LeadAdsActivity f41253B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Cm f41254C;

    public AnonymousClass3RZ(LeadAdsActivity leadAdsActivity, AnonymousClass0Cm anonymousClass0Cm) {
        this.f41253B = leadAdsActivity;
        this.f41254C = anonymousClass0Cm;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 154655452);
        AnonymousClass3Ra.m19659B(this.f41253B.f48321C, "form_load_retry");
        this.f41253B.f48322D.setLoadingStatus(AnonymousClass2M2.LOADING);
        LeadAdsActivity leadAdsActivity = this.f41253B;
        LeadAdsActivity.m22034B(leadAdsActivity, leadAdsActivity.f48320B, this.f41254C, true);
        AnonymousClass0cQ.L(this, 529866002, M);
    }
}
