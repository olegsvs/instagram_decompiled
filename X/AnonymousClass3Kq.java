package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: X.3Kq */
public final class AnonymousClass3Kq implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0xX f40241B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Ci f40242C;

    public AnonymousClass3Kq(AnonymousClass0xX anonymousClass0xX, AnonymousClass0Ci anonymousClass0Ci) {
        this.f40241B = anonymousClass0xX;
        this.f40242C = anonymousClass0Ci;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass3lf.DIALOG_CONFIRMED.m20608A(this.f40242C);
        AnonymousClass0xX.D(this.f40241B);
    }
}
