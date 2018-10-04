package X;

import android.util.Pair;

/* renamed from: X.2ue */
public abstract class AnonymousClass2ue {
    /* renamed from: B */
    public static final AnonymousClass2ue f35665B = new AnonymousClass3v0();

    /* renamed from: B */
    public abstract int mo4487B(Object obj);

    /* renamed from: G */
    public abstract AnonymousClass2uc mo4488G(int i, AnonymousClass2uc anonymousClass2uc, boolean z);

    /* renamed from: H */
    public abstract int mo4489H();

    /* renamed from: L */
    public abstract AnonymousClass2ud mo4490L(int i, AnonymousClass2ud anonymousClass2ud, boolean z, long j);

    /* renamed from: M */
    public abstract int mo4491M();

    /* renamed from: A */
    public final int m17724A(boolean z) {
        return m17737N() ? -1 : 0;
    }

    /* renamed from: C */
    public final int m17726C(boolean z) {
        return m17737N() ? -1 : mo4491M() - 1;
    }

    /* renamed from: D */
    public final int m17727D(int i, AnonymousClass2uc anonymousClass2uc, AnonymousClass2ud anonymousClass2ud, int i2, boolean z) {
        int i3 = m17729F(i, anonymousClass2uc).f35658F;
        if (m17734K(i3, anonymousClass2ud).f35663F != i) {
            return i + 1;
        }
        i3 = m17728E(i3, i2, z);
        if (i3 == -1) {
            return -1;
        }
        return m17734K(i3, anonymousClass2ud).f35661D;
    }

    /* renamed from: E */
    public final int m17728E(int i, int i2, boolean z) {
        switch (i2) {
            case 0:
                if (i == m17726C(z)) {
                    return -1;
                }
                break;
            case 1:
                return i;
            case 2:
                if (i == m17726C(z)) {
                    return m17724A(z);
                }
                break;
            default:
                throw new IllegalStateException();
        }
        return i + 1;
    }

    /* renamed from: F */
    public final AnonymousClass2uc m17729F(int i, AnonymousClass2uc anonymousClass2uc) {
        return mo4488G(i, anonymousClass2uc, false);
    }

    /* renamed from: I */
    public final Pair m17732I(AnonymousClass2ud anonymousClass2ud, AnonymousClass2uc anonymousClass2uc, int i, long j) {
        return m17733J(anonymousClass2ud, anonymousClass2uc, i, j, 0);
    }

    /* renamed from: J */
    public final Pair m17733J(AnonymousClass2ud anonymousClass2ud, AnonymousClass2uc anonymousClass2uc, int i, long j, long j2) {
        long j3 = j;
        int i2 = i;
        AnonymousClass2yO.m18015D(i2, 0, mo4491M());
        AnonymousClass2ud anonymousClass2ud2 = anonymousClass2ud;
        mo4490L(i2, anonymousClass2ud2, false, j2);
        if (j == -9223372036854775807L) {
            j3 = anonymousClass2ud2.f35659B;
            if (j3 == -9223372036854775807L) {
                return null;
            }
        }
        int i3 = anonymousClass2ud2.f35661D;
        long j4 = anonymousClass2ud2.f35664G + j3;
        long j5 = m17729F(i3, anonymousClass2uc).f35655C;
        while (j5 != -9223372036854775807L && j4 >= j5 && i3 < anonymousClass2ud2.f35663F) {
            j4 -= j5;
            i3++;
            j5 = m17729F(i3, anonymousClass2uc).f35655C;
        }
        return Pair.create(Integer.valueOf(i3), Long.valueOf(j4));
    }

    /* renamed from: K */
    public final AnonymousClass2ud m17734K(int i, AnonymousClass2ud anonymousClass2ud) {
        return mo4490L(i, anonymousClass2ud, false, 0);
    }

    /* renamed from: N */
    public final boolean m17737N() {
        return mo4491M() == 0;
    }
}
