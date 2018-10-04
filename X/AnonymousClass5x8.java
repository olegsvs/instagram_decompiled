package X;

import android.content.Context;
import android.widget.Toast;
import com.facebook.C0164R;

/* renamed from: X.5x8 */
public final class AnonymousClass5x8 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5xD f70264B;
    /* renamed from: C */
    public final /* synthetic */ Context f70265C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Ur f70266D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0MI f70267E;

    public AnonymousClass5x8(AnonymousClass5xD anonymousClass5xD, AnonymousClass0MI anonymousClass0MI, Context context, AnonymousClass0Ur anonymousClass0Ur) {
        this.f70264B = anonymousClass5xD;
        this.f70267E = anonymousClass0MI;
        this.f70265C = context;
        this.f70266D = anonymousClass0Ur;
    }

    /* renamed from: B */
    public static void m28659B(AnonymousClass5x8 anonymousClass5x8) {
        anonymousClass5x8 = anonymousClass5x8.f70265C;
        Toast.makeText(anonymousClass5x8, anonymousClass5x8.getString(C0164R.string.unknown_error_occured), 0).show();
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 155907856);
        AnonymousClass0Sy.G(new AnonymousClass5x6(this));
        AnonymousClass0cQ.H(this, 2058358216, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, -1540825862);
        AnonymousClass0Sy.G(new AnonymousClass5x7(this));
        AnonymousClass0cQ.H(this, -946522960, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 684471984);
        AnonymousClass30S anonymousClass30S = (AnonymousClass30S) obj;
        int I2 = AnonymousClass0cQ.I(this, 272520804);
        AnonymousClass0Sy.G(new AnonymousClass5x5(this, anonymousClass30S));
        AnonymousClass0cQ.H(this, -1717558470, I2);
        AnonymousClass0cQ.H(this, 328044979, I);
    }
}
