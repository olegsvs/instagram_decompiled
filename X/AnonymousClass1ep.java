package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.1ep */
public final class AnonymousClass1ep implements Iterator {
    /* renamed from: B */
    private final Object[] f21045B;
    /* renamed from: C */
    private boolean f21046C = false;
    /* renamed from: D */
    private int f21047D;
    /* renamed from: E */
    private int f21048E;
    /* renamed from: F */
    private int f21049F;
    /* renamed from: G */
    private final AnonymousClass1en f21050G;

    public AnonymousClass1ep(AnonymousClass1en anonymousClass1en, AnonymousClass1en anonymousClass1en2) {
        this.f21050G = anonymousClass1en2;
        this.f21045B = anonymousClass1en2.f21041B;
        this.f21048E = anonymousClass1en2.f21042C;
        int A = anonymousClass1en2.m12338A();
        this.f21047D = A;
        this.f21049F = A;
    }

    public final boolean hasNext() {
        return this.f21047D >= 0;
    }

    public final Object next() {
        if (this.f21048E == this.f21050G.f21042C) {
            int i = this.f21047D;
            if (i >= 0) {
                Object obj = this.f21045B[i];
                if (obj == AnonymousClass1en.f21040G) {
                    obj = null;
                }
                int i2 = this.f21047D;
                this.f21049F = i2;
                this.f21046C = true;
                i2++;
                while (true) {
                    Object[] objArr = this.f21045B;
                    if (i2 >= objArr.length) {
                        this.f21047D = -1;
                        return obj;
                    } else if (objArr[i2] != null) {
                        this.f21047D = i2;
                        return obj;
                    } else {
                        i2++;
                    }
                }
            } else {
                throw new NoSuchElementException();
            }
        }
        throw new ConcurrentModificationException();
    }

    public final void remove() {
        if (this.f21048E != this.f21050G.f21042C) {
            throw new ConcurrentModificationException();
        } else if (this.f21046C) {
            this.f21046C = false;
            this.f21050G.remove(this.f21045B[this.f21049F]);
            this.f21048E++;
            int i = this.f21049F;
            while (true) {
                Object[] objArr = this.f21045B;
                if (i >= objArr.length) {
                    this.f21047D = -1;
                    return;
                } else if (objArr[i] != null) {
                    this.f21047D = i;
                    return;
                } else {
                    i++;
                }
            }
        } else {
            throw new IllegalStateException();
        }
    }
}
