package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.C0164R;

/* renamed from: X.5I4 */
public final class AnonymousClass5I4 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5I5 f61813B;
    /* renamed from: C */
    public final /* synthetic */ String f61814C;

    public AnonymousClass5I4(AnonymousClass5I5 anonymousClass5I5, String str) {
        this.f61813B = anonymousClass5I5;
        this.f61814C = str;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 529472601);
        AnonymousClass2Go.B("payment_settings_entered");
        AnonymousClass0Il.getInstance().newReactNativeLauncher(this.f61813B.f61817D).KRA(this.f61814C).LSA(this.f61813B.f61815B.getResources().getString(C0164R.string.payments)).GZ(this.f61813B.f61815B);
        AnonymousClass0cQ.L(this, -120600042, M);
    }
}
