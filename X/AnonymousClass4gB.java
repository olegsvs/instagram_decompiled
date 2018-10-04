package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: X.4gB */
public final class AnonymousClass4gB {
    /* renamed from: B */
    public final Set f56221B;
    /* renamed from: C */
    public final Map f56222C;
    /* renamed from: D */
    private final AnonymousClass5WK f56223D;
    /* renamed from: E */
    private final AnonymousClass0Ch f56224E;

    public AnonymousClass4gB(AnonymousClass5WK anonymousClass5WK) {
        this(anonymousClass5WK, AnonymousClass0Cg.f1704B);
    }

    public AnonymousClass4gB(AnonymousClass5WK anonymousClass5WK, AnonymousClass0Ch anonymousClass0Ch) {
        this.f56222C = new HashMap();
        this.f56221B = new HashSet();
        this.f56223D = anonymousClass5WK;
        this.f56224E = anonymousClass0Ch;
    }

    /* renamed from: A */
    public final Map m24732A() {
        if (this.f56222C.isEmpty()) {
            return Collections.emptyMap();
        }
        Map hashMap = new HashMap();
        for (Entry entry : this.f56222C.entrySet()) {
            int intValue = ((Integer) entry.getValue()).intValue();
            if (intValue == 1 || intValue == 2) {
                hashMap.put(entry.getKey(), Integer.valueOf(intValue));
            }
        }
        return hashMap;
    }

    /* renamed from: B */
    private static void m24731B(AnonymousClass4gB anonymousClass4gB, String str, int i) {
        AnonymousClass0Ci B = anonymousClass4gB.f56224E.B(str);
        if (B != null) {
            str = anonymousClass4gB.f56223D;
            anonymousClass4gB = new AnonymousClass5WL(B, i);
            boolean c = str.f65601C.c();
            str.f65602D.b(anonymousClass4gB);
            if (c) {
                str.f65601C.g();
            }
        }
    }

    /* renamed from: B */
    public final void m24733B(String str, boolean z) {
        if (z != this.f56221B.contains(str)) {
            if (z) {
                this.f56221B.add(str);
            } else {
                this.f56221B.remove(str);
            }
            AnonymousClass5VY anonymousClass5VY = this.f56223D.f65604F;
            if (anonymousClass5VY != null) {
                AnonymousClass4d0 anonymousClass4d0 = anonymousClass5VY.f65347F;
                if (anonymousClass4d0 != null && anonymousClass4d0.qTA(anonymousClass5VY.f65377j)) {
                    AnonymousClass0eT.D(AnonymousClass5VY.B(anonymousClass5VY));
                }
            }
            if (!this.f56222C.containsKey(str)) {
                AnonymousClass4gB.m24731B(this, str, z ? 3 : 0);
            }
        }
    }

    /* renamed from: C */
    public final void m24734C(String str, int i) {
        boolean z = true;
        if (!(i == 0 || i == 1)) {
            if (i != 2) {
                z = false;
            }
        }
        AnonymousClass0LH.B(z);
        Integer num = (Integer) this.f56222C.get(str);
        if (!(num == null && i == 0) && (num == null || num.intValue() != i)) {
            Object obj = i == 0 ? 1 : null;
            if (obj != null) {
                this.f56222C.remove(str);
            } else {
                this.f56222C.put(str, Integer.valueOf(i));
            }
            if (obj != null && this.f56221B.contains(str)) {
                i = 3;
            }
            AnonymousClass4gB.m24731B(this, str, i);
        }
    }
}
