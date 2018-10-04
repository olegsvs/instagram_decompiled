package X;

import android.content.Context;
import android.widget.Toast;
import com.facebook.C0164R;

/* renamed from: X.31V */
public final class AnonymousClass31V extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1gn f37088B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass5pB f37089C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Ci f37090D;

    public AnonymousClass31V(AnonymousClass1gn anonymousClass1gn, AnonymousClass5pB anonymousClass5pB, AnonymousClass0Ci anonymousClass0Ci) {
        this.f37088B = anonymousClass1gn;
        this.f37089C = anonymousClass5pB;
        this.f37090D = anonymousClass0Ci;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 780478361);
        AnonymousClass5pB anonymousClass5pB = this.f37089C;
        if (anonymousClass5pB != null) {
            AnonymousClass1fe.B(anonymousClass5pB.f69201B.f69203B);
        }
        AnonymousClass0cQ.H(this, -772902217, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, 1377770124);
        AnonymousClass5pB anonymousClass5pB = this.f37089C;
        if (!(anonymousClass5pB == null || anonymousClass5pB.f69201B.f69203B.f21192E == null)) {
            anonymousClass5pB.f69201B.f69203B.f21192E.setSelected(false);
        }
        AnonymousClass0cQ.H(this, -180294938, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 2034216693);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.I(this, -1348089498);
        this.f37090D.w(false);
        this.f37088B.f21437F.B().K();
        AnonymousClass5pB anonymousClass5pB = this.f37089C;
        if (anonymousClass5pB != null) {
            AnonymousClass0Ci anonymousClass0Ci = this.f37090D;
            Context context = anonymousClass5pB.f69201B.f69203B.f21191D.f21433B;
            Toast.makeText(context, context.getString(C0164R.string.removed_from_close_friends, new Object[]{anonymousClass0Ci.uT()}), 0).show();
            AnonymousClass1fe.B(anonymousClass5pB.f69201B.f69203B);
        }
        AnonymousClass0cQ.H(this, -1150142670, I2);
        AnonymousClass0cQ.H(this, -1177836349, I);
    }
}
