package X;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0H4 */
public final class AnonymousClass0H4 {
    /* renamed from: B */
    public Set f2523B;
    /* renamed from: C */
    public String f2524C;

    public AnonymousClass0H4() {
        Set hashSet;
        String str = (String) AnonymousClass0CC.CP.m845G();
        this.f2524C = str;
        if (str != null) {
            if (!str.isEmpty()) {
                hashSet = new HashSet(Arrays.asList(this.f2524C.split(",")));
                this.f2523B = hashSet;
            }
        }
        hashSet = null;
        this.f2523B = hashSet;
    }

    /* renamed from: A */
    public final int m1944A() {
        return ((Integer) AnonymousClass0CC.wO.m845G()).intValue();
    }
}
