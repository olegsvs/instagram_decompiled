package X;

import java.util.Iterator;

/* renamed from: X.2Nn */
public abstract class AnonymousClass2Nn implements Iterator, AnonymousClass1kX {
    /* renamed from: B */
    public AnonymousClass1kW f29828B;
    /* renamed from: C */
    public AnonymousClass1kW f29829C;

    /* renamed from: A */
    public abstract AnonymousClass1kW mo3493A(AnonymousClass1kW anonymousClass1kW);

    public AnonymousClass2Nn(AnonymousClass1kW anonymousClass1kW, AnonymousClass1kW anonymousClass1kW2) {
        this.f29828B = anonymousClass1kW2;
        this.f29829C = anonymousClass1kW;
    }

    /* renamed from: B */
    public static AnonymousClass1kW m15371B(AnonymousClass2Nn anonymousClass2Nn) {
        AnonymousClass1kW anonymousClass1kW = anonymousClass2Nn.f29829C;
        AnonymousClass1kW anonymousClass1kW2 = anonymousClass2Nn.f29828B;
        if (anonymousClass1kW != anonymousClass1kW2) {
            if (anonymousClass1kW2 != null) {
                return anonymousClass2Nn.mo3493A(anonymousClass1kW);
            }
        }
        return null;
    }

    public final boolean hasNext() {
        return this.f29829C != null;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        AnonymousClass1kW anonymousClass1kW = this.f29829C;
        this.f29829C = AnonymousClass2Nn.m15371B(this);
        return anonymousClass1kW;
    }
}
