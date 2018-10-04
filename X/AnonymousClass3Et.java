package X;

import java.util.List;

/* renamed from: X.3Et */
public final class AnonymousClass3Et implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0eH f39380B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass36h f39381C;

    public AnonymousClass3Et(AnonymousClass0eH anonymousClass0eH, AnonymousClass36h anonymousClass36h) {
        this.f39380B = anonymousClass0eH;
        this.f39381C = anonymousClass36h;
    }

    public final void run() {
        if (this.f39380B.f7664J.equals(this.f39381C)) {
            AnonymousClass0eH anonymousClass0eH = this.f39380B;
            AnonymousClass0eH.B(anonymousClass0eH, anonymousClass0eH.f7664J, "effect_downloaded", this.f39380B.f7667M);
        }
        List I = this.f39380B.f7661G.m18691I();
        int indexOf = I.indexOf(this.f39381C);
        if (indexOf >= 0 && indexOf < I.size() && this.f39380B.f7677W) {
            this.f39381C.f37887Q = false;
            int i = indexOf + 1;
            AnonymousClass0eH.C(this.f39380B, this.f39381C, i);
            this.f39380B.f7657C.C(i);
        }
    }
}
