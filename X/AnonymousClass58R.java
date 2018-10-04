package X;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.facebook.C0164R;

/* renamed from: X.58R */
public final class AnonymousClass58R implements OnFocusChangeListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass58c f60463B;

    public AnonymousClass58R(AnonymousClass58c anonymousClass58c) {
        this.f60463B = anonymousClass58c;
    }

    public final void onFocusChange(View view, boolean z) {
        if (!z && this.f60463B.f60484I.C()) {
            view = this.f60463B;
            view.AUA(view.getString(C0164R.string.please_create_a_username), AnonymousClass22w.USERNAME);
        }
    }
}
