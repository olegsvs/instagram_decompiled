package X;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.facebook.C0164R;

/* renamed from: X.58G */
public final class AnonymousClass58G implements OnFocusChangeListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass58O f60434B;

    public AnonymousClass58G(AnonymousClass58O anonymousClass58O) {
        this.f60434B = anonymousClass58O;
    }

    public final void onFocusChange(View view, boolean z) {
        if (!z && this.f60434B.f60452J.C()) {
            view = this.f60434B;
            view.AUA(view.getString(C0164R.string.please_create_a_username), AnonymousClass22w.USERNAME);
        }
    }
}
