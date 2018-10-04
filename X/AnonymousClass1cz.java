package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1cz */
public final class AnonymousClass1cz {
    /* renamed from: B */
    public final List f20682B;
    /* renamed from: C */
    public int f20683C = 0;
    /* renamed from: D */
    public int f20684D = 0;
    /* renamed from: E */
    public int f20685E = 0;
    /* renamed from: F */
    private final Map f20686F;

    public AnonymousClass1cz(int i) {
        this.f20682B = new ArrayList(i);
        this.f20686F = new HashMap();
    }

    /* renamed from: A */
    public final void m12169A(AnonymousClass0p5 anonymousClass0p5, long j) {
        List list = this.f20682B;
        int i = this.f20683C;
        this.f20683C = i + 1;
        list.add(i, anonymousClass0p5);
        if (!this.f20686F.containsKey(anonymousClass0p5)) {
            AnonymousClass1d3 anonymousClass1d3 = (AnonymousClass1d3) AnonymousClass1d3.f20696F.acquire();
            if (anonymousClass1d3 == null) {
                anonymousClass1d3 = new AnonymousClass1d3();
            }
            anonymousClass1d3.f20697B = -1;
            anonymousClass1d3.f20699D = -1;
            anonymousClass1d3.f20700E = -1;
            anonymousClass1d3.f20698C = true;
            anonymousClass1d3.f20697B = j;
            this.f20686F.put(anonymousClass0p5.f10475B, anonymousClass1d3);
        }
    }

    /* renamed from: B */
    public final void m12170B(AnonymousClass0p5 anonymousClass0p5) {
        this.f20682B.add(this.f20683C + this.f20685E, anonymousClass0p5);
        this.f20685E++;
    }

    /* renamed from: C */
    public final void m12171C() {
        m12177I();
        this.f20685E = 0;
        this.f20683C = 0;
        this.f20684D = this.f20682B.size();
        for (AnonymousClass0p5 anonymousClass0p5 : this.f20682B) {
            if (anonymousClass0p5.f10477D) {
                m12178J(anonymousClass0p5, 0);
                m12179K(anonymousClass0p5, 0);
            }
        }
    }

    /* renamed from: D */
    public final AnonymousClass0p5 m12172D(AnonymousClass1cy anonymousClass1cy, int i) {
        if (i >= 0) {
            int i2 = 0;
            switch (AnonymousClass1d4.f20701B[anonymousClass1cy.ordinal()]) {
                case 1:
                    anonymousClass1cy = this.f20683C;
                    break;
                case 2:
                    i2 = this.f20683C;
                    anonymousClass1cy = this.f20685E;
                    break;
                case 3:
                    i2 = this.f20685E + this.f20683C;
                    anonymousClass1cy = this.f20684D;
                    break;
                default:
                    anonymousClass1cy = null;
                    break;
            }
            if (i < anonymousClass1cy) {
                return (AnonymousClass0p5) this.f20682B.get(i + i2);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Index: ");
            stringBuilder.append(i);
            stringBuilder.append(", Size: ");
            stringBuilder.append(anonymousClass1cy);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Index: ");
        stringBuilder.append(i);
        stringBuilder.append(" must be positive");
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    /* renamed from: E */
    public final int m12173E(AnonymousClass1cy anonymousClass1cy) {
        switch (anonymousClass1cy.ordinal()) {
            case 0:
                return this.f20683C;
            case 1:
                return this.f20685E;
            case 2:
                return this.f20684D;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown event ");
                stringBuilder.append(anonymousClass1cy);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: F */
    public final long m12174F(AnonymousClass0p5 anonymousClass0p5, long j) {
        AnonymousClass1d3 anonymousClass1d3 = (AnonymousClass1d3) this.f20686F.get(anonymousClass0p5.f10475B);
        return anonymousClass1d3 != null ? j - anonymousClass1d3.f20697B : -1;
    }

    /* renamed from: G */
    public final int m12175G(AnonymousClass0p5 anonymousClass0p5) {
        AnonymousClass1d3 anonymousClass1d3 = (AnonymousClass1d3) this.f20686F.get(anonymousClass0p5.f10475B);
        return anonymousClass1d3 != null ? anonymousClass1d3.f20699D : -1;
    }

    /* renamed from: H */
    public final int m12176H(AnonymousClass0p5 anonymousClass0p5) {
        AnonymousClass1d3 anonymousClass1d3 = (AnonymousClass1d3) this.f20686F.get(anonymousClass0p5.f10475B);
        return anonymousClass1d3 != null ? anonymousClass1d3.f20700E : -1;
    }

    /* renamed from: I */
    public final void m12177I() {
        int i = this.f20683C + this.f20685E;
        for (int size = this.f20682B.size() - 1; size >= i; size--) {
            AnonymousClass1d3 anonymousClass1d3 = (AnonymousClass1d3) this.f20686F.remove(((AnonymousClass0p5) this.f20682B.remove(size)).f10475B);
            if (anonymousClass1d3 != null) {
                if (anonymousClass1d3.f20698C) {
                    anonymousClass1d3.f20698C = AnonymousClass1d3.f20696F.release(anonymousClass1d3);
                } else {
                    AnonymousClass0Gn.m1876C("ViewportItemInfo", "trying to recycle item already in the pool");
                }
            }
        }
        this.f20684D = 0;
    }

    /* renamed from: J */
    public final void m12178J(AnonymousClass0p5 anonymousClass0p5, int i) {
        AnonymousClass1d3 anonymousClass1d3 = (AnonymousClass1d3) this.f20686F.get(anonymousClass0p5.f10475B);
        if (anonymousClass1d3 != null) {
            anonymousClass1d3.f20699D = i;
        }
    }

    /* renamed from: K */
    public final void m12179K(AnonymousClass0p5 anonymousClass0p5, int i) {
        AnonymousClass1d3 anonymousClass1d3 = (AnonymousClass1d3) this.f20686F.get(anonymousClass0p5.f10475B);
        if (anonymousClass1d3 != null) {
            anonymousClass1d3.f20700E = i;
        }
    }
}
