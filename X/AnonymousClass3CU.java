package X;

import android.content.DialogInterface.OnClickListener;

/* renamed from: X.3CU */
public final class AnonymousClass3CU implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3Cd f39047B;
    /* renamed from: C */
    public final /* synthetic */ OnClickListener f39048C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass3Cc f39049D;

    public AnonymousClass3CU(AnonymousClass3Cd anonymousClass3Cd, AnonymousClass3Cc anonymousClass3Cc, OnClickListener onClickListener) {
        this.f39047B = anonymousClass3Cd;
        this.f39049D = anonymousClass3Cc;
        this.f39048C = onClickListener;
    }

    public final void run() {
        AnonymousClass3Cd.m19012D(this.f39047B, this.f39049D, this.f39048C);
    }
}
