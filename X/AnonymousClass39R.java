package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.39R */
public final class AnonymousClass39R {
    /* renamed from: B */
    public int f38406B;
    /* renamed from: C */
    public List f38407C = new ArrayList();
    /* renamed from: D */
    public String f38408D;

    public AnonymousClass39R(AnonymousClass2XL anonymousClass2XL) {
        this.f38408D = anonymousClass2XL.f31188E;
        this.f38406B = anonymousClass2XL.f31186C;
        if (anonymousClass2XL.f31187D != null) {
            for (AnonymousClass2XK anonymousClass39S : anonymousClass2XL.f31187D) {
                this.f38407C.add(new AnonymousClass3yM(new AnonymousClass39S(anonymousClass39S)));
            }
        }
    }

    /* renamed from: A */
    public final AnonymousClass3yL m18771A() {
        return new AnonymousClass3yL(this);
    }
}
