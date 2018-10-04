package X;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.C0164R;

/* renamed from: X.4rK */
public final class AnonymousClass4rK implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Xk f57907B;

    public AnonymousClass4rK(AnonymousClass5Xk anonymousClass5Xk) {
        this.f57907B = anonymousClass5Xk;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 370070848);
        ((Activity) this.f57907B.getContext()).onBackPressed();
        AnonymousClass3Pn anonymousClass3Pn = this.f57907B;
        AnonymousClass0Ss.F(anonymousClass3Pn.getContext(), AnonymousClass0Ce.E(anonymousClass3Pn.getArguments()), "https://help.instagram.com/176296189679904?ref=tos", anonymousClass3Pn.getString(C0164R.string.help_center), anonymousClass3Pn, anonymousClass3Pn);
        AnonymousClass0cQ.L(this, 1595433270, M);
    }
}
