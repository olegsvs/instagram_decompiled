package android.support.v4.app;

import X.AnonymousClass0Hd;
import X.AnonymousClass0O8;
import X.AnonymousClass0cQ;
import X.AnonymousClass0dQ;
import X.AnonymousClass0dR;
import X.AnonymousClass0dU;
import X.AnonymousClass0eh;
import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;

public class SupportActivity extends Activity implements AnonymousClass0Hd {
    /* renamed from: B */
    private AnonymousClass0dQ f2718B = new AnonymousClass0dQ(this);

    public SupportActivity() {
        AnonymousClass0O8 anonymousClass0O8 = new AnonymousClass0O8();
    }

    public AnonymousClass0dR getLifecycle() {
        return this.f2718B;
    }

    public void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.m5852B(this, -1813286568);
        super.onCreate(bundle);
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new AnonymousClass0eh(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
        AnonymousClass0cQ.m5853C(this, -1932912863, B);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f2718B.f7448F = AnonymousClass0dU.CREATED;
        super.onSaveInstanceState(bundle);
    }
}
