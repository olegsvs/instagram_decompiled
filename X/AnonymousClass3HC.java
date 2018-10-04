package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.3HC */
public final class AnonymousClass3HC implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3zL f39760B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass3HF f39761C;

    public AnonymousClass3HC(AnonymousClass3zL anonymousClass3zL, AnonymousClass3HF anonymousClass3HF) {
        this.f39760B = anonymousClass3zL;
        this.f39761C = anonymousClass3HF;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 371940473);
        if (this.f39761C != this.f39760B.f47941P) {
            AnonymousClass3zL.m21870C(this.f39760B, this.f39761C);
            this.f39760B.f47928C.m19067B(AnonymousClass3zL.m21869B(this.f39760B, this.f39761C), false);
        } else if (AnonymousClass3zL.m21869B(this.f39760B, this.f39761C) != 0.0f) {
            this.f39760B.f47928C.m19067B(0.0f, false);
        }
        AnonymousClass0cQ.L(this, -1414377230, M);
    }
}
