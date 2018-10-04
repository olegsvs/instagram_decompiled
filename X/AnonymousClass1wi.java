package X;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1wi */
public final class AnonymousClass1wi implements AnonymousClass0QP {
    /* renamed from: H */
    private static int f24545H = 0;
    /* renamed from: I */
    private static final AnonymousClass1wj f24546I = AnonymousClass1wj.f24553C;
    /* renamed from: B */
    public int f24547B;
    /* renamed from: C */
    public final CopyOnWriteArrayList f24548C;
    /* renamed from: D */
    private final AnonymousClass0e5 f24549D;
    /* renamed from: E */
    private final CopyOnWriteArrayList f24550E;
    /* renamed from: F */
    private final AnonymousClass0e5 f24551F;
    /* renamed from: G */
    private final AnonymousClass0e6 f24552G;

    public AnonymousClass1wi() {
        this(40, 6, 70, 10);
    }

    private AnonymousClass1wi(int i, int i2, int i3, int i4) {
        this.f24552G = AnonymousClass0e6.B();
        this.f24550E = new CopyOnWriteArrayList();
        this.f24548C = new CopyOnWriteArrayList();
        this.f24547B = -1;
        this.f24551F = AnonymousClass0e5.C((double) i, (double) i2);
        this.f24549D = AnonymousClass0e5.C((double) i3, (double) i4);
        AnonymousClass1wj anonymousClass1wj = f24546I;
        AnonymousClass0e5 anonymousClass0e5 = this.f24551F;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("main spring ");
        int i5 = f24545H;
        f24545H = i5 + 1;
        stringBuilder.append(i5);
        anonymousClass1wj.m13898A(anonymousClass0e5, stringBuilder.toString());
        anonymousClass0e5 = this.f24549D;
        stringBuilder = new StringBuilder();
        stringBuilder.append("attachment spring ");
        i5 = f24545H;
        f24545H = i5 + 1;
        stringBuilder.append(i5);
        anonymousClass1wj.m13898A(anonymousClass0e5, stringBuilder.toString());
    }

    /* renamed from: A */
    public final AnonymousClass1wi m13896A(AnonymousClass0QP anonymousClass0QP) {
        this.f24548C.add(this.f24552G.C().A(this).O(this.f24549D));
        this.f24550E.add(anonymousClass0QP);
        return this;
    }

    /* renamed from: B */
    public final AnonymousClass1wi m13897B(int i) {
        this.f24547B = i;
        if (((AnonymousClass0cN) this.f24548C.get(this.f24547B)) == null) {
            return null;
        }
        for (AnonymousClass0cN O : this.f24552G.D()) {
            O.O(this.f24549D);
        }
        ((AnonymousClass0cN) this.f24548C.get(this.f24547B)).O(this.f24551F);
        return this;
    }

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
        ((AnonymousClass0QP) this.f24550E.get(this.f24548C.indexOf(anonymousClass0cN))).BBA(anonymousClass0cN);
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
        ((AnonymousClass0QP) this.f24550E.get(this.f24548C.indexOf(anonymousClass0cN))).DBA(anonymousClass0cN);
    }

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
        ((AnonymousClass0QP) this.f24550E.get(this.f24548C.indexOf(anonymousClass0cN))).EBA(anonymousClass0cN);
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        int i;
        int indexOf = this.f24548C.indexOf(anonymousClass0cN);
        AnonymousClass0QP anonymousClass0QP = (AnonymousClass0QP) this.f24550E.get(indexOf);
        int i2 = this.f24547B;
        if (indexOf == i2) {
            i = indexOf - 1;
            indexOf++;
        } else if (indexOf < i2) {
            i = indexOf - 1;
            indexOf = -1;
        } else {
            indexOf = indexOf > i2 ? indexOf + 1 : -1;
            i = -1;
        }
        if (indexOf > -1 && indexOf < this.f24548C.size()) {
            ((AnonymousClass0cN) this.f24548C.get(indexOf)).N(anonymousClass0cN.E());
        }
        if (i > -1 && i < this.f24548C.size()) {
            ((AnonymousClass0cN) this.f24548C.get(i)).N(anonymousClass0cN.E());
        }
        anonymousClass0QP.FBA(anonymousClass0cN);
    }
}
