package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.1mV */
public final class AnonymousClass1mV implements Iterator {
    /* renamed from: B */
    public boolean f22609B = false;
    /* renamed from: C */
    public int f22610C;
    /* renamed from: D */
    public final int f22611D;
    /* renamed from: E */
    public int f22612E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass0gG f22613F;

    public AnonymousClass1mV(AnonymousClass0gG anonymousClass0gG, int i) {
        this.f22613F = anonymousClass0gG;
        this.f22611D = i;
        this.f22612E = anonymousClass0gG.D();
    }

    public final boolean hasNext() {
        return this.f22610C < this.f22612E;
    }

    public final Object next() {
        if (hasNext()) {
            Object B = this.f22613F.B(this.f22610C, this.f22611D);
            this.f22610C++;
            this.f22609B = true;
            return B;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.f22609B) {
            this.f22610C--;
            this.f22612E--;
            this.f22609B = false;
            this.f22613F.H(this.f22610C);
            return;
        }
        throw new IllegalStateException();
    }
}
