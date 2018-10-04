package X;

import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.25a */
public final class AnonymousClass25a implements Iterator {
    /* renamed from: B */
    public final String[] f25771B = Locale.getISOCountries();
    /* renamed from: C */
    public final String f25772C;
    /* renamed from: D */
    public int f25773D;

    public AnonymousClass25a(String str) {
        this.f25772C = str;
    }

    public final boolean hasNext() {
        return this.f25773D < this.f25771B.length;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Locale locale = new Locale(this.f25772C, this.f25771B[this.f25773D]);
        this.f25773D++;
        return locale;
    }

    public final void remove() {
        throw new UnsupportedOperationException("remove not supported");
    }
}
