package X;

import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: X.36t */
public final class AnonymousClass36t {
    /* renamed from: G */
    public static final HashMap f37945G = new HashMap();
    /* renamed from: B */
    public HashMap f37946B;
    /* renamed from: C */
    public long f37947C;
    /* renamed from: D */
    public HashMap f37948D;
    /* renamed from: E */
    public long f37949E;
    /* renamed from: F */
    public AnonymousClass36x f37950F;

    public AnonymousClass36t(AnonymousClass36t anonymousClass36t) {
        if (anonymousClass36t != null) {
            this.f37947C = anonymousClass36t.f37947C;
            if (anonymousClass36t.f37946B != null) {
                this.f37946B = new HashMap();
                for (Entry entry : anonymousClass36t.f37946B.entrySet()) {
                    this.f37946B.put(entry.getKey(), new AnonymousClass36r((AnonymousClass36r) entry.getValue()));
                }
            } else {
                this.f37946B = null;
            }
            this.f37949E = anonymousClass36t.f37949E;
            if (anonymousClass36t.f37948D != null) {
                this.f37948D = new HashMap();
                for (Entry entry2 : anonymousClass36t.f37948D.entrySet()) {
                    this.f37948D.put(entry2.getKey(), new AnonymousClass36r((AnonymousClass36r) entry2.getValue()));
                }
            } else {
                this.f37948D = null;
            }
            if (anonymousClass36t.f37950F != null) {
                this.f37950F = this.f37950F;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass36t)) {
            return false;
        }
        AnonymousClass36t anonymousClass36t = (AnonymousClass36t) obj;
        if (this.f37947C != anonymousClass36t.f37947C) {
            return false;
        }
        if (AnonymousClass0LQ.B(this.f37946B, anonymousClass36t.f37946B) && AnonymousClass0LQ.B(this.f37948D, anonymousClass36t.f37948D)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass0LQ.D(new Object[]{Long.valueOf(this.f37947C), this.f37946B, this.f37948D});
    }
}
