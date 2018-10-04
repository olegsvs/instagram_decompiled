package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.4AO */
public final class AnonymousClass4AO implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Ru f51100B;

    public AnonymousClass4AO(AnonymousClass5Ru anonymousClass5Ru) {
        this.f51100B = anonymousClass5Ru;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1841224068);
        if (!AnonymousClass1Ba.D(this.f51100B.f63574B, "android.permission.CAMERA") && this.f51100B.f63592T) {
            AnonymousClass1Ba.F(this.f51100B.f63574B);
        } else {
            this.f51100B.C();
        }
        AnonymousClass0cQ.L(this, 924312316, M);
    }
}
