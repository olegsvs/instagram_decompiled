package X;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.25N */
public abstract class AnonymousClass25N implements Iterator {
    /* renamed from: B */
    public AnonymousClass0Li f25742B;
    /* renamed from: C */
    public AtomicReferenceArray f25743C;
    /* renamed from: D */
    public AnonymousClass2Uq f25744D;
    /* renamed from: E */
    public AnonymousClass0Lw f25745E;
    /* renamed from: F */
    public AnonymousClass2Uq f25746F;
    /* renamed from: G */
    public int f25747G;
    /* renamed from: H */
    public int f25748H = -1;
    /* renamed from: I */
    public final /* synthetic */ AnonymousClass0LM f25749I;

    public abstract Object next();

    public AnonymousClass25N(AnonymousClass0LM anonymousClass0LM) {
        this.f25749I = anonymousClass0LM;
        this.f25747G = anonymousClass0LM.f3233O.length - 1;
        m14366A();
    }

    /* renamed from: A */
    public final void m14366A() {
        this.f25746F = null;
        if (!m14369D()) {
            if (!m14370E()) {
                while (this.f25747G >= 0) {
                    AnonymousClass0Li[] anonymousClass0LiArr = this.f25749I.f3233O;
                    int i = this.f25747G;
                    this.f25747G = i - 1;
                    AnonymousClass0Li anonymousClass0Li = anonymousClass0LiArr[i];
                    this.f25742B = anonymousClass0Li;
                    if (anonymousClass0Li.f3253B != 0) {
                        AtomicReferenceArray atomicReferenceArray = this.f25742B.f3262K;
                        this.f25743C = atomicReferenceArray;
                        this.f25748H = atomicReferenceArray.length() - 1;
                        if (m14370E()) {
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: B */
    public final boolean m14367B(AnonymousClass0Lw anonymousClass0Lw) {
        try {
            boolean z;
            Object key = anonymousClass0Lw.getKey();
            Object D = this.f25749I.D(anonymousClass0Lw);
            if (D != null) {
                this.f25746F = new AnonymousClass2Uq(this.f25749I, key, D);
                z = true;
            } else {
                z = false;
            }
            this.f25742B.N();
            return z;
        } catch (Throwable th) {
            this.f25742B.N();
        }
    }

    /* renamed from: C */
    public final AnonymousClass2Uq m14368C() {
        AnonymousClass2Uq anonymousClass2Uq = this.f25746F;
        if (anonymousClass2Uq != null) {
            this.f25744D = anonymousClass2Uq;
            m14366A();
            return this.f25744D;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: D */
    public final boolean m14369D() {
        AnonymousClass0Lw anonymousClass0Lw = this.f25745E;
        if (anonymousClass0Lw != null) {
            while (true) {
                anonymousClass0Lw = anonymousClass0Lw.gO();
                this.f25745E = anonymousClass0Lw;
                if (anonymousClass0Lw == null) {
                    break;
                } else if (m14367B(anonymousClass0Lw)) {
                    return true;
                } else {
                    anonymousClass0Lw = this.f25745E;
                }
            }
        }
        return false;
    }

    /* renamed from: E */
    public final boolean m14370E() {
        while (true) {
            int i = this.f25748H;
            if (i < 0) {
                return false;
            }
            AtomicReferenceArray atomicReferenceArray = this.f25743C;
            this.f25748H = i - 1;
            AnonymousClass0Lw anonymousClass0Lw = (AnonymousClass0Lw) atomicReferenceArray.get(i);
            this.f25745E = anonymousClass0Lw;
            if (anonymousClass0Lw == null || !(m14367B(this.f25745E) || m14369D())) {
            }
        }
        return true;
    }

    public final boolean hasNext() {
        return this.f25746F != null;
    }

    public final void remove() {
        AnonymousClass0LH.I(this.f25744D != null, "no calls to next() since the last call to remove()");
        this.f25749I.remove(this.f25744D.getKey());
        this.f25744D = null;
    }
}
