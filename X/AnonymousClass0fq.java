package X;

import java.io.Serializable;

/* renamed from: X.0fq */
public abstract class AnonymousClass0fq implements Serializable {
    /* renamed from: A */
    public abstract Object mo1545A();

    /* renamed from: B */
    public abstract boolean mo1546B();

    /* renamed from: C */
    public abstract Object m6567C(Object obj);

    /* renamed from: D */
    public abstract Object mo1548D();

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract String toString();

    /* renamed from: B */
    public static AnonymousClass0fq m6563B(Object obj) {
        if (obj == null) {
            return AnonymousClass0fp.f7999B;
        }
        return new AnonymousClass19q(obj);
    }

    /* renamed from: C */
    public static AnonymousClass0fq mo1547C(Object obj) {
        return new AnonymousClass19q(AnonymousClass0LR.m2961D(obj));
    }
}
