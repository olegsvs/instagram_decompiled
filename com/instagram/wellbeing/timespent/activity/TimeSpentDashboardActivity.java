package com.instagram.wellbeing.timespent.activity;

import X.AnonymousClass0Ce;
import X.AnonymousClass0GS;
import X.AnonymousClass0IL;
import X.AnonymousClass0IV;
import X.AnonymousClass0cQ;
import X.AnonymousClass5Qc;
import android.os.Bundle;
import com.facebook.C0164R;
import com.instagram.base.activity.BaseFragmentActivity;

public class TimeSpentDashboardActivity extends BaseFragmentActivity {
    /* renamed from: T */
    public final void m26474T() {
        if (D().E(C0164R.id.layout_container_main) == null) {
            AnonymousClass0IL A = AnonymousClass0GS.f2363B.A().A(AnonymousClass5Qc.IG_TS_EDIT_REMINDER_DIALOG, AnonymousClass0Ce.G(getIntent().getExtras()));
            A.setArguments(getIntent().getExtras());
            AnonymousClass0IV B = D().B();
            B.M(C0164R.id.layout_container_main, A);
            B.F();
        }
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(C0164R.anim.left_in, C0164R.anim.right_out);
    }

    public final void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.B(this, 595417369);
        super.onCreate(bundle);
        overridePendingTransition(C0164R.anim.right_in, C0164R.anim.left_out);
        AnonymousClass0cQ.C(this, -746640960, B);
    }
}
