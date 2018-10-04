package com.instagram.save.activity;

import X.AnonymousClass0IL;
import X.AnonymousClass0IV;
import X.AnonymousClass0Jf;
import X.AnonymousClass0cQ;
import X.AnonymousClass5xZ;
import X.AnonymousClass5y4;
import android.os.Bundle;
import com.facebook.C0164R;
import com.instagram.base.activity.BaseFragmentActivity;

public class CreateCollectionActivity extends BaseFragmentActivity {
    /* renamed from: B */
    public AnonymousClass5xZ f70356B;

    /* renamed from: T */
    public final void m28674T() {
        AnonymousClass0Jf.f2933B.A();
        AnonymousClass0IL anonymousClass5y4 = new AnonymousClass5y4();
        anonymousClass5y4.setArguments(getIntent().getExtras());
        AnonymousClass0IV B = D().B();
        B.M(C0164R.id.layout_container_main, anonymousClass5y4);
        B.F();
    }

    public final void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.B(this, 97809645);
        super.onCreate(bundle);
        this.f70356B = new AnonymousClass5xZ();
        AnonymousClass0cQ.C(this, 1816097005, B);
    }
}
