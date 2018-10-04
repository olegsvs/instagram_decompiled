package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.52N */
public final class AnonymousClass52N implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass52P f59442B;

    public AnonymousClass52N(AnonymousClass52P anonymousClass52P) {
        this.f59442B = anonymousClass52P;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1977086083);
        AnonymousClass0IL anonymousClass0IL = this.f59442B;
        AnonymousClass0IL B = AnonymousClass0GQ.f2360B.A().m27573B(anonymousClass0IL.getArguments(), JsonProperty.USE_DEFAULT_NAME, AnonymousClass2Dx.AUTHENTICATOR_APP, false);
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass0IL.getActivity());
        anonymousClass0IZ.f2754D = B;
        anonymousClass0IZ.B();
        AnonymousClass0cQ.L(this, -1360877197, M);
    }
}
