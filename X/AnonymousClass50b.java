package X;

import android.content.Context;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import com.facebook.C0164R;

/* renamed from: X.50b */
public final class AnonymousClass50b extends AnonymousClass3TG {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass50c f59261B;

    public AnonymousClass50b(AnonymousClass50c anonymousClass50c, Context context, Handler handler, AnonymousClass0IU anonymousClass0IU, FragmentActivity fragmentActivity, boolean z, AnonymousClass0Ci anonymousClass0Ci) {
        this.f59261B = anonymousClass50c;
        super(context, handler, anonymousClass0IU, fragmentActivity, z, anonymousClass0Ci);
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 1890573254);
        if (this.f59261B.f59262B.getView() != null) {
            this.f59261B.f59262B.getView().findViewById(C0164R.id.fragment_user_password_recovery_button_connect_with_facebook).setEnabled(true);
        }
        super.onFail(anonymousClass0Q6);
        AnonymousClass0cQ.H(this, -513139272, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, 934703249);
        if (this.f59261B.f59262B.getView() != null) {
            this.f59261B.f59262B.getView().findViewById(C0164R.id.fragment_user_password_recovery_button_connect_with_facebook).setEnabled(false);
        }
        super.onStart();
        AnonymousClass0cQ.H(this, 1933272133, I);
    }
}
