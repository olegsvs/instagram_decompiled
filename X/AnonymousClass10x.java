package X;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.10x */
public final class AnonymousClass10x implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass10v f13349B;
    /* renamed from: C */
    public final /* synthetic */ Dialog f13350C;

    public AnonymousClass10x(AnonymousClass10v anonymousClass10v, Dialog dialog) {
        this.f13349B = anonymousClass10v;
        this.f13350C = dialog;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.m5863M(this, -1176574225);
        this.f13349B.f13344H = 0;
        AnonymousClass10v.m8773C(this.f13349B);
        this.f13350C.dismiss();
        AnonymousClass0cQ.m5862L(this, -1273793513, M);
    }
}
