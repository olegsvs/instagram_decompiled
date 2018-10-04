package X;

import android.app.Dialog;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.1TW */
public final class AnonymousClass1TW implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0bS f18927B;

    public AnonymousClass1TW(AnonymousClass0bS anonymousClass0bS) {
        this.f18927B = anonymousClass0bS;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.m5863M(this, -696469730);
        if (this.f18927B.f6787H == null) {
            AnonymousClass0cQ.m5862L(this, 205236084, M);
            return;
        }
        AnonymousClass0HP.f2625M.m1993A(null);
        if (this.f18927B.f6786G == null) {
            AnonymousClass0bS anonymousClass0bS = this.f18927B;
            anonymousClass0bS.f6786G = new AnonymousClass2ft(anonymousClass0bS.getContext());
        }
        AnonymousClass2ft anonymousClass2ft = this.f18927B.f6786G;
        view.getContext();
        Uri uri = this.f18927B.f6787H;
        Dialog UF = anonymousClass2ft.f32286D.bPA(anonymousClass2ft.f32287E).YQA(anonymousClass2ft.f32288F, new AnonymousClass2fp(anonymousClass2ft, uri)).sPA(anonymousClass2ft.f32285C.getResources().getString(17039360), new AnonymousClass2fo(anonymousClass2ft, uri)).UF();
        UF.setOnCancelListener(new AnonymousClass2fq(anonymousClass2ft, uri));
        UF.show();
        AnonymousClass0cQ.m5862L(this, -1237510872, M);
    }
}
