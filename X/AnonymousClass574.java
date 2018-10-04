package X;

import android.view.View;
import android.view.View.OnFocusChangeListener;

/* renamed from: X.574 */
public final class AnonymousClass574 implements OnFocusChangeListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass57K f60266B;

    public AnonymousClass574(AnonymousClass57K anonymousClass57K) {
        this.f60266B = anonymousClass57K;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            AnonymousClass0Fr.LogInPasswordFocus.F(AnonymousClass2Na.LOGIN_STEP).D("field", "password").E();
        }
    }
}
