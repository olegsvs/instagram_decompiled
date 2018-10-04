package X;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: X.4UE */
public final class AnonymousClass4UE {
    /* renamed from: B */
    public int f54560B;
    /* renamed from: C */
    public final List f54561C = new ArrayList();
    /* renamed from: D */
    public AnonymousClass4QH f54562D = AnonymousClass4QH.HIDDEN;
    /* renamed from: E */
    public final AnonymousClass4Ql f54563E;
    /* renamed from: F */
    public final AnonymousClass4Sb f54564F;
    /* renamed from: G */
    public AnonymousClass4OK f54565G;
    /* renamed from: H */
    public AnonymousClass4OL f54566H;
    /* renamed from: I */
    public AnonymousClass4Oc f54567I;
    /* renamed from: J */
    public String f54568J = UUID.randomUUID().toString();
    /* renamed from: K */
    public AnonymousClass4UF f54569K;
    /* renamed from: L */
    public boolean f54570L;

    public AnonymousClass4UE(AnonymousClass4Sb anonymousClass4Sb, AnonymousClass4Ql anonymousClass4Ql) {
        this.f54564F = anonymousClass4Sb;
        this.f54563E = anonymousClass4Ql;
    }

    /* renamed from: A */
    public final AnonymousClass3FJ m24338A() {
        return (AnonymousClass3FJ) this.f54561C.get(this.f54560B);
    }

    /* renamed from: B */
    public final AnonymousClass3FK m24339B() {
        if (this.f54561C.isEmpty()) {
            return AnonymousClass3FK.TYPE_MODE;
        }
        return ((AnonymousClass3FJ) this.f54561C.get(this.f54560B)).f39427C;
    }

    /* renamed from: C */
    public final AnonymousClass3nl m24340C() {
        return ((AnonymousClass3FJ) this.f54561C.get(this.f54560B)).f39426B;
    }

    /* renamed from: D */
    public final AnonymousClass3nn m24341D() {
        return ((AnonymousClass3FJ) this.f54561C.get(this.f54560B)).f39428D;
    }

    /* renamed from: E */
    public final AnonymousClass3FR m24342E() {
        AnonymousClass4OL anonymousClass4OL = this.f54566H;
        if (anonymousClass4OL != null) {
            return anonymousClass4OL.f53534B;
        }
        AnonymousClass4Oc anonymousClass4Oc = this.f54567I;
        if (anonymousClass4Oc != null) {
            return anonymousClass4Oc.f53575B;
        }
        AnonymousClass4OK anonymousClass4OK = this.f54565G;
        if (anonymousClass4OK != null) {
            return anonymousClass4OK.f53530B;
        }
        throw new IllegalStateException("CaptureSession tried to access a null waterfall");
    }

    /* renamed from: F */
    public final boolean m24343F() {
        return this.f54563E != null;
    }

    /* renamed from: G */
    public final void m24344G() {
        this.f54568J = UUID.randomUUID().toString();
    }

    /* renamed from: H */
    public final void m24345H(List list) {
        boolean z = true;
        if (list.size() <= 1) {
            z = false;
        }
        AnonymousClass0LH.C(z, "This method should only be called with more than one CapturedMedia");
        this.f54561C.clear();
        this.f54560B = 0;
        this.f54561C.addAll(list);
        this.f54562D = AnonymousClass4QH.MULTI_MEDIA;
    }

    /* renamed from: I */
    public final void m24346I(AnonymousClass3nl anonymousClass3nl) {
        this.f54561C.clear();
        this.f54560B = 0;
        this.f54561C.add(new AnonymousClass3FJ(anonymousClass3nl));
        this.f54562D = AnonymousClass4QH.SINGLE_MEDIA;
    }
}
