package X;

import java.util.concurrent.Callable;

/* renamed from: X.5Cm */
public final class AnonymousClass5Cm implements Callable {
    /* renamed from: B */
    public final /* synthetic */ float f61141B;
    /* renamed from: C */
    public final /* synthetic */ boolean f61142C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass15I f61143D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0ZF f61144E;

    public AnonymousClass5Cm(AnonymousClass15I anonymousClass15I, float f, AnonymousClass0ZF anonymousClass0ZF, boolean z) {
        this.f61143D = anonymousClass15I;
        this.f61141B = f;
        this.f61144E = anonymousClass0ZF;
        this.f61142C = z;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        AnonymousClass15d.D(this.f61143D, this.f61141B, this.f61144E, this.f61142C);
        return Boolean.valueOf(true);
    }
}
