package X;

import com.facebook.C0164R;

/* renamed from: X.3IL */
public final class AnonymousClass3IL implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3zp f39921B;

    public AnonymousClass3IL(AnonymousClass3zp anonymousClass3zp) {
        this.f39921B = anonymousClass3zp;
    }

    public final void run() {
        if (this.f39921B.getView() != null) {
            this.f39921B.f48075M.m21984Q(this.f39921B.m19292c());
            this.f39921B.f48072J.setVisibility(0);
            this.f39921B.f48072J.setContentDescription(this.f39921B.getString(C0164R.string.video));
            this.f39921B.f48070H.setVisibility(0);
            AnonymousClass3zp anonymousClass3zp = this.f39921B;
            AnonymousClass0mE.M(anonymousClass3zp.f48072J, new AnonymousClass3IM(anonymousClass3zp));
        }
    }
}
