package X;

import java.util.Map.Entry;

/* renamed from: X.2Uq */
public final class AnonymousClass2Uq extends AnonymousClass25H {
    /* renamed from: B */
    public final Object f30941B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0LM f30942C;
    /* renamed from: D */
    public Object f30943D;

    public AnonymousClass2Uq(AnonymousClass0LM anonymousClass0LM, Object obj, Object obj2) {
        this.f30942C = anonymousClass0LM;
        this.f30941B = obj;
        this.f30943D = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        if (this.f30941B.equals(entry.getKey()) && this.f30943D.equals(entry.getValue())) {
            return true;
        }
        return false;
    }

    public final Object getKey() {
        return this.f30941B;
    }

    public final Object getValue() {
        return this.f30943D;
    }

    public final int hashCode() {
        return this.f30941B.hashCode() ^ this.f30943D.hashCode();
    }

    public final Object setValue(Object obj) {
        Object put = this.f30942C.put(this.f30941B, obj);
        this.f30943D = obj;
        return put;
    }
}
