package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.4XN */
public final class AnonymousClass4XN implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Uc f54967B;

    public AnonymousClass4XN(AnonymousClass5Uc anonymousClass5Uc) {
        this.f54967B = anonymousClass5Uc;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 1719558095);
        if (this.f54967B.f64981J != null) {
            this.f54967B.f64988Q.setText(JsonProperty.USE_DEFAULT_NAME);
        } else {
            this.f54967B.f64991T = false;
            AnonymousClass5Uc.B(this.f54967B);
        }
        AnonymousClass0IL anonymousClass0IL = this.f54967B;
        AnonymousClass0ib.C(anonymousClass0IL, anonymousClass0IL.f64980I);
        AnonymousClass0cQ.L(this, -495516704, M);
    }
}
