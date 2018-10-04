package com.instagram.business.instantexperiences.ui;

import X.AnonymousClass0IL;
import X.AnonymousClass0cQ;
import X.AnonymousClass6Cz;
import android.os.Bundle;
import com.facebook.C0164R;
import com.instagram.base.activity.IgFragmentActivity;

public class InstantExperiencesBrowserActivity extends IgFragmentActivity {
    /* renamed from: B */
    private AnonymousClass0IL f68171B;

    public final void onBackPressed() {
        if (!((AnonymousClass6Cz) this.f68171B).onBackPressed()) {
            super.onBackPressed();
        }
    }

    public final void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.B(this, 410757087);
        super.onCreate(bundle);
        setContentView(C0164R.layout.instant_experiences_browser_main);
        if (bundle == null) {
            AnonymousClass0IL anonymousClass6Cz = new AnonymousClass6Cz();
            this.f68171B = anonymousClass6Cz;
            anonymousClass6Cz.setArguments(getIntent().getExtras());
            D().B().A(C0164R.id.instant_experience_fragment_container, this.f68171B).F();
        } else {
            this.f68171B = D().I(bundle, "instant_experiences_browser_fragment");
        }
        AnonymousClass0cQ.C(this, 499206163, B);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        D().R(bundle, "instant_experiences_browser_fragment", this.f68171B);
    }
}
