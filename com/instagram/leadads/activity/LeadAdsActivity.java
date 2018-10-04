package com.instagram.leadads.activity;

import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0IL;
import X.AnonymousClass0IZ;
import X.AnonymousClass0cQ;
import X.AnonymousClass0dy;
import X.AnonymousClass11k;
import X.AnonymousClass11l;
import X.AnonymousClass11m;
import X.AnonymousClass2M2;
import X.AnonymousClass3RZ;
import X.AnonymousClass3Ra;
import X.AnonymousClass3Re;
import X.AnonymousClass3Ry;
import X.AnonymousClass3S1;
import X.AnonymousClass40j;
import X.AnonymousClass40l;
import X.AnonymousClass40m;
import android.os.Bundle;
import com.facebook.C0164R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public class LeadAdsActivity extends IgFragmentActivity implements AnonymousClass3Re {
    /* renamed from: B */
    public String f48320B;
    /* renamed from: C */
    public String f48321C;
    /* renamed from: D */
    public SpinnerImageView f48322D;

    /* renamed from: B */
    public static void m22034B(LeadAdsActivity leadAdsActivity, String str, AnonymousClass0Cm anonymousClass0Cm, boolean z) {
        AnonymousClass11k anonymousClass11k = new AnonymousClass11k(str, anonymousClass0Cm);
        anonymousClass11k.f13441C = z;
        anonymousClass11k.f13440B = leadAdsActivity;
        AnonymousClass11m.B(new AnonymousClass11l(anonymousClass11k));
    }

    public final void finish() {
        super.finish();
        AnonymousClass0dy.B().f7558B.J(AnonymousClass3Ra.f41255B, (long) this.f48321C.hashCode());
        AnonymousClass3S1 B = AnonymousClass3S1.m19666B(AnonymousClass0Ce.G(getIntent().getExtras()));
        String str = this.f48320B;
        B.f41317D.remove(str);
        B.f41315B.remove(str);
        B.f41316C.remove(str);
        overridePendingTransition(C0164R.anim.fade_in, C0164R.anim.bottom_out);
    }

    public final void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.B(this, 2038850393);
        super.onCreate(bundle);
        setContentView(C0164R.layout.lead_ads_activity);
        this.f48322D = (SpinnerImageView) findViewById(C0164R.id.lead_ads_loading_spinner);
        Bundle extras = getIntent().getExtras();
        this.f48321C = extras.getString("mediaID");
        this.f48320B = extras.getString("formID");
        AnonymousClass0Cm G = AnonymousClass0Ce.G(extras);
        this.f48322D.setLoadingStatus(AnonymousClass2M2.LOADING);
        m22034B(this, this.f48320B, G, false);
        this.f48322D.setOnClickListener(new AnonymousClass3RZ(this, G));
        overridePendingTransition(C0164R.anim.bottom_in, C0164R.anim.fade_out);
        AnonymousClass0cQ.C(this, 1990127963, B);
    }

    public final void onFailure() {
        AnonymousClass3Ra.m19659B(this.f48321C, "form_load_error");
        this.f48322D.setLoadingStatus(AnonymousClass2M2.FAILED);
    }

    public final void tBA(AnonymousClass3Ry anonymousClass3Ry) {
        AnonymousClass0IL anonymousClass40m;
        AnonymousClass3Ra.m19659B(this.f48321C, "form_load_success");
        this.f48322D.setLoadingStatus(AnonymousClass2M2.SUCCESS);
        Bundle extras = getIntent().getExtras();
        if (extras.getBoolean("submitted")) {
            anonymousClass40m = new AnonymousClass40m();
            extras.putBoolean("submission_successful", true);
        } else {
            if ((anonymousClass3Ry.m19665B() != null ? 1 : null) != null) {
                anonymousClass40m = new AnonymousClass40j();
            } else {
                anonymousClass40m = new AnonymousClass40l();
            }
        }
        new AnonymousClass0IZ(this).F(anonymousClass40m, extras).C().B();
    }
}
