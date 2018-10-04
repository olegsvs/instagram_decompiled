package X;

import android.net.Uri;
import android.view.View;

/* renamed from: X.4zg */
public final class AnonymousClass4zg extends AnonymousClass1g2 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4zn f59146B;

    public AnonymousClass4zg(AnonymousClass4zn anonymousClass4zn, int i) {
        this.f59146B = anonymousClass4zn;
        super(i);
    }

    public final void onClick(View view) {
        AnonymousClass0Fr.ForgotHelpCenter.C(AnonymousClass2Na.USER_LOOKUP).R();
        AnonymousClass0IW.U(Uri.parse(AnonymousClass0rE.B("https://help.instagram.com/", this.f59146B.getActivity())), this.f59146B);
    }
}
