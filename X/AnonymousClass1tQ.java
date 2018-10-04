package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.1tQ */
public final class AnonymousClass1tQ {
    /* renamed from: B */
    public List f23788B = new ArrayList();

    /* renamed from: A */
    public final String m13618A(AnonymousClass1ta anonymousClass1ta) {
        if (this.f23788B.isEmpty()) {
            return anonymousClass1ta.toString().toLowerCase(Locale.US);
        }
        for (AnonymousClass1tP anonymousClass1tP : this.f23788B) {
            if (anonymousClass1tP.jb(anonymousClass1ta)) {
                return anonymousClass1tP.getName();
            }
        }
        return null;
    }

    /* renamed from: B */
    public final int m13619B(AnonymousClass1ta anonymousClass1ta) {
        int i = 0;
        for (AnonymousClass1tP jb : this.f23788B) {
            if (jb.jb(anonymousClass1ta)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
