package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.43g */
public final class AnonymousClass43g extends AnonymousClass3uE implements AnonymousClass2rh {
    /* renamed from: B */
    private final AnonymousClass3uF f49132B;

    /* renamed from: A */
    public final long mo5182A() {
        return -1;
    }

    /* renamed from: B */
    public final long mo5183B() {
        return -1;
    }

    /* renamed from: D */
    public final AnonymousClass2rh mo5185D() {
        return this;
    }

    /* renamed from: E */
    public final AnonymousClass2rs mo5186E() {
        return null;
    }

    public AnonymousClass43g(String str, long j, AnonymousClass2rO anonymousClass2rO, AnonymousClass3uF anonymousClass3uF, String str2, String str3) {
        super(str, j, anonymousClass2rO, anonymousClass3uF, str2, str3);
        this.f49132B = anonymousClass3uF;
    }

    /* renamed from: C */
    public final List mo5184C() {
        AnonymousClass3uF anonymousClass3uF = this.f49132B;
        return anonymousClass3uF instanceof AnonymousClass43j ? ((AnonymousClass43j) anonymousClass3uF).f49138B : null;
    }

    /* renamed from: F */
    public final long m22410F(int i) {
        return this.f49132B.m21338B(i);
    }

    /* renamed from: G */
    public final void m22411G(long j) {
        AnonymousClass2rv anonymousClass2rv = this.f49132B;
        List list = anonymousClass2rv.f46398C;
        if (list != null) {
            long j2 = 0;
            int size = list.size();
            int i = size - 1;
            while (i >= 0 && ((AnonymousClass2rt) anonymousClass2rv.f46398C.get(i)).f35154D) {
                i--;
            }
            int i2 = i + 1;
            while (i2 > 0 && j2 < j) {
                i2--;
                AnonymousClass2rt anonymousClass2rt = (AnonymousClass2rt) anonymousClass2rv.f46398C.get(i2);
                j2 += AnonymousClass2u6.m17659L(anonymousClass2rt.f35152B * ((long) anonymousClass2rt.f35157G), 1000000, anonymousClass2rv.f35164D);
            }
            Collection arrayList = new ArrayList(anonymousClass2rv.f46398C.subList(i2, size));
            anonymousClass2rv.f46398C.clear();
            anonymousClass2rv.f46398C.addAll(arrayList);
            anonymousClass2rv.f46400E = anonymousClass2rv.f46398C.size();
        }
    }

    public final boolean RX() {
        return this.f49132B.mo5189J();
    }

    public final String SR(int i) {
        return this.f49132B.mo5191E(this, i);
    }

    public final int TR(long j, long j2) {
        return this.f49132B.m21342F(j, j2);
    }

    public final long VL(int i, long j) {
        return this.f49132B.m21340D(i, j);
    }

    public final AnonymousClass2rs VR(int i) {
        return this.f49132B.mo5188I(this, i);
    }

    public final boolean ZY(int i) {
        return this.f49132B.mo5193K(this, i);
    }

    public final int gN(long j) {
        return this.f49132B.mo5187C(j);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("format:");
        stringBuilder2.append(this.f46394D.f35068Q);
        stringBuilder2.append("\n");
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("segments:");
        stringBuilder2.append(this.f49132B.toString());
        stringBuilder.append(stringBuilder2.toString());
        return stringBuilder.toString();
    }

    public final long wS(int i) {
        return this.f49132B.m21343G(i);
    }

    public final int xL() {
        return this.f49132B.f46399D;
    }
}
