package X;

import android.content.Context;
import android.os.Handler;
import android.widget.Toast;
import com.facebook.C0164R;

/* renamed from: X.30G */
public final class AnonymousClass30G extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ Context f36791B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0yh f36792C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0IU f36793D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0P7 f36794E;

    public AnonymousClass30G(AnonymousClass0IU anonymousClass0IU, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0yh anonymousClass0yh, Context context) {
        this.f36793D = anonymousClass0IU;
        this.f36794E = anonymousClass0P7;
        this.f36792C = anonymousClass0yh;
        this.f36791B = context;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 521337578);
        Toast.makeText(this.f36791B, this.f36792C == AnonymousClass0yh.ARCHIVED ? C0164R.string.hide_post_failed : C0164R.string.unhide_post_failed, 0).show();
        AnonymousClass0cQ.H(this, -1543292009, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, -623392524);
        AnonymousClass0OR.D(new Handler(), new AnonymousClass30F(this), -1751303869);
        AnonymousClass0cQ.H(this, 1453480031, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 2055546518);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.I(this, 46733725);
        this.f36794E.HD = this.f36792C;
        this.f36794E.yC();
        AnonymousClass0Ci MA = this.f36794E.MA();
        if (this.f36792C == AnonymousClass0yh.ARCHIVED) {
            MA.N();
        } else if (this.f36792C == AnonymousClass0yh.DEFAULT) {
            MA.g();
        }
        MA.D();
        AnonymousClass0cQ.H(this, -2054318332, I2);
        AnonymousClass0cQ.H(this, -1338545924, I);
    }
}
