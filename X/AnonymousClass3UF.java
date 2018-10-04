package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.3UF */
public final class AnonymousClass3UF implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ double f41585B;
    /* renamed from: C */
    public final /* synthetic */ double f41586C;
    /* renamed from: D */
    public final /* synthetic */ OnClickListener f41587D;

    public AnonymousClass3UF(double d, double d2, OnClickListener onClickListener) {
        this.f41585B = d;
        this.f41586C = d2;
        this.f41587D = onClickListener;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 615274412);
        AnonymousClass3UM.m19726B(view.getContext(), this.f41585B, this.f41586C);
        OnClickListener onClickListener = this.f41587D;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        AnonymousClass0cQ.L(this, 1444718156, M);
    }
}
