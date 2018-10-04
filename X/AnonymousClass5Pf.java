package X;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

/* renamed from: X.5Pf */
public final class AnonymousClass5Pf implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5b4 f63152B;
    /* renamed from: C */
    public final /* synthetic */ EditText f63153C;

    public AnonymousClass5Pf(AnonymousClass5b4 anonymousClass5b4, EditText editText) {
        this.f63152B = anonymousClass5b4;
        this.f63153C = editText;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -291833259);
        if (this.f63152B.f66803H != null) {
            AnonymousClass6GG anonymousClass6GG = this.f63152B.f66803H;
            boolean isFocusable = this.f63153C.isFocusable();
            AnonymousClass6GC anonymousClass6GC = anonymousClass6GG.f73650D;
            if (anonymousClass6GC != null) {
                anonymousClass6GC.mo6813A(isFocusable);
            }
        }
        AnonymousClass0cQ.L(this, 935969233, M);
    }
}
