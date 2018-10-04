package X;

import java.util.concurrent.ExecutionException;

/* renamed from: X.1k2 */
public final class AnonymousClass1k2 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1Fs f22057B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass1Fk f22058C;

    public AnonymousClass1k2(AnonymousClass1Fk anonymousClass1Fk, AnonymousClass1Fs anonymousClass1Fs) {
        this.f22058C = anonymousClass1Fk;
        this.f22057B = anonymousClass1Fs;
    }

    public final void run() {
        try {
            this.f22057B.uBA(AnonymousClass1Ft.m10390C(this.f22058C));
        } catch (ExecutionException e) {
            this.f22057B.jl(e.getCause());
        } catch (Throwable e2) {
            this.f22057B.jl(e2);
        } catch (Throwable e22) {
            this.f22057B.jl(e22);
        }
    }
}
