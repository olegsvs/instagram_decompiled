package X;

import java.io.FileFilter;
import java.util.ArrayDeque;
import java.util.Iterator;

/* renamed from: X.46I */
public final class AnonymousClass46I implements Iterator {
    /* renamed from: E */
    public static final FileFilter f50282E = new AnonymousClass46B();
    /* renamed from: B */
    private AnonymousClass46G f50283B;
    /* renamed from: C */
    private boolean f50284C;
    /* renamed from: D */
    private final ArrayDeque f50285D = new ArrayDeque();

    public AnonymousClass46I(AnonymousClass5bC anonymousClass5bC) {
        Iterator A = anonymousClass5bC.A();
        while (A.hasNext()) {
            this.f50285D.addLast(new AnonymousClass46H((AnonymousClass46E) A.next()));
        }
    }

    /* renamed from: A */
    public final AnonymousClass46G m23224A() {
        if (hasNext()) {
            AnonymousClass46G anonymousClass46G = this.f50283B;
            this.f50283B = null;
            this.f50284C = false;
            return anonymousClass46G;
        }
        throw new IllegalStateException();
    }

    /* renamed from: B */
    private AnonymousClass46G m23223B() {
        while (!this.f50285D.isEmpty()) {
            AnonymousClass46H anonymousClass46H = (AnonymousClass46H) this.f50285D.getLast();
            AnonymousClass46E anonymousClass46E = anonymousClass46H.f50280C;
            if (AnonymousClass46H.m23222B(anonymousClass46H).hasNext()) {
                anonymousClass46H.f50279B++;
                this.f50285D.addLast(new AnonymousClass46H((AnonymousClass46E) AnonymousClass46H.m23222B(anonymousClass46H).next()));
                Object obj = 1;
                if (anonymousClass46H.f50279B == 1) {
                    continue;
                } else {
                    obj = null;
                    continue;
                }
                if (obj != null) {
                    return new AnonymousClass46G(anonymousClass46E, 1);
                }
            }
            this.f50285D.removeLast();
            if (anonymousClass46E instanceof AnonymousClass5RD) {
                return new AnonymousClass46G(anonymousClass46E, 2);
            }
            return new AnonymousClass46G(anonymousClass46E, 3);
        }
        return null;
    }

    public final boolean hasNext() {
        if (!this.f50284C) {
            this.f50284C = true;
            this.f50283B = m23223B();
        }
        if (this.f50283B != null) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return m23224A();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
