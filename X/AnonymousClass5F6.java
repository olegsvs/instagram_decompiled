package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.5F6 */
public final class AnonymousClass5F6 {
    /* renamed from: B */
    private final Set f61554B = new HashSet();
    /* renamed from: C */
    private final AnonymousClass5Ev f61555C;

    public AnonymousClass5F6(AnonymousClass5Ev anonymousClass5Ev) {
        this.f61555C = anonymousClass5Ev;
    }

    /* renamed from: A */
    public final boolean m26066A(String str) {
        return this.f61554B.add(m26067B(str));
    }

    /* renamed from: B */
    public final String m26067B(String str) {
        String str2 = (String) AnonymousClass0LH.E(this.f61555C.EIA());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(":");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
