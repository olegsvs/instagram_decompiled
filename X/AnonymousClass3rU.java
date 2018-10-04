package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3rU */
public final class AnonymousClass3rU implements AnonymousClass2gm {
    /* renamed from: B */
    public final /* synthetic */ int f45415B;
    /* renamed from: C */
    public final /* synthetic */ AtomicReference f45416C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass3qz f45417D;
    /* renamed from: E */
    public final /* synthetic */ AtomicReference f45418E;

    public AnonymousClass3rU(AnonymousClass3rV anonymousClass3rV, AnonymousClass3qz anonymousClass3qz, AtomicReference atomicReference, AtomicReference atomicReference2, int i) {
        this.f45417D = anonymousClass3qz;
        this.f45418E = atomicReference;
        this.f45416C = atomicReference2;
        this.f45415B = i;
    }

    public final void xu(double d) {
        if (this.f45417D != null) {
            AtomicReference atomicReference = this.f45418E;
            double doubleValue = ((Double) atomicReference.get()).doubleValue();
            double doubleValue2 = d - ((Double) this.f45416C.get()).doubleValue();
            double d2 = (double) this.f45415B;
            Double.isNaN(d2);
            atomicReference.set(Double.valueOf(doubleValue + (doubleValue2 / d2)));
            this.f45416C.set(Double.valueOf(d));
            this.f45417D.m20902A(((Double) this.f45418E.get()).doubleValue());
        }
    }
}
