package X;

import java.util.List;

/* renamed from: X.6Fi */
public final class AnonymousClass6Fi implements AnonymousClass64y {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass65U f73458B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass64y f73459C;

    public AnonymousClass6Fi(AnonymousClass65U anonymousClass65U, AnonymousClass64y anonymousClass64y) {
        this.f73458B = anonymousClass65U;
        this.f73459C = anonymousClass64y;
    }

    public final /* bridge */ /* synthetic */ void ls(Object obj) {
        this.f73458B.f71616B.m28945B((List) obj);
        AnonymousClass652.m28922D(this.f73458B.f71616B.m28944A(), this.f73459C);
    }

    public final void onComplete() {
        AnonymousClass652.m28920B(this.f73459C);
    }

    public final void tk(Throwable th) {
        AnonymousClass652.m28921C(th, this.f73459C);
    }
}
