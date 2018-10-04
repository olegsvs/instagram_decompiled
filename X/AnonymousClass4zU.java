package X;

import android.content.Context;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import com.facebook.AccessToken;

/* renamed from: X.4zU */
public final class AnonymousClass4zU extends AnonymousClass3TG {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4zV f59117B;
    /* renamed from: C */
    public final /* synthetic */ AccessToken f59118C;

    public AnonymousClass4zU(AnonymousClass4zV anonymousClass4zV, Context context, Handler handler, AnonymousClass0IU anonymousClass0IU, FragmentActivity fragmentActivity, boolean z, AnonymousClass0Ci anonymousClass0Ci, AccessToken accessToken) {
        this.f59117B = anonymousClass4zV;
        this.f59118C = accessToken;
        super(context, handler, anonymousClass0IU, fragmentActivity, z, anonymousClass0Ci);
    }

    /* renamed from: A */
    public final void m25535A(AnonymousClass2DU anonymousClass2DU) {
        int I = AnonymousClass0cQ.I(this, -466153328);
        if (this.f59117B.f59126I.B() != null && this.f59117B.f59126I.B().getId().equals(anonymousClass2DU.f27598C.getId())) {
            AnonymousClass2H3.B(this.f59117B.f59126I, this.f59118C);
        }
        super.A(anonymousClass2DU);
        AnonymousClass0cQ.H(this, 839587411, I);
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -1998273205);
        if (this.f59117B.getView() != null) {
            this.f59117B.f59124G.setEnabled(true);
        }
        super.onFail(anonymousClass0Q6);
        AnonymousClass0cQ.H(this, 1788520447, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, 325237073);
        if (this.f59117B.getView() != null) {
            this.f59117B.f59124G.setEnabled(false);
        }
        super.onStart();
        AnonymousClass0cQ.H(this, 444858669, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 962592685);
        m25535A((AnonymousClass2DU) obj);
        AnonymousClass0cQ.H(this, -362658428, I);
    }
}
