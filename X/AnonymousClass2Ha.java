package X;

import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.2Ha */
public final class AnonymousClass2Ha implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Sb f28547B;
    /* renamed from: C */
    public final /* synthetic */ DialogInterface.OnClickListener f28548C;
    /* renamed from: D */
    public final /* synthetic */ int f28549D;

    public AnonymousClass2Ha(AnonymousClass0Sb anonymousClass0Sb, DialogInterface.OnClickListener onClickListener, int i) {
        this.f28547B = anonymousClass0Sb;
        this.f28548C = onClickListener;
        this.f28549D = i;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1150719562);
        DialogInterface.OnClickListener onClickListener = this.f28548C;
        if (onClickListener != null) {
            onClickListener.onClick(this.f28547B.f4940D, this.f28549D);
        }
        this.f28547B.f4940D.dismiss();
        AnonymousClass0cQ.L(this, -1327472340, M);
    }
}
