package X;

import java.util.UUID;

/* renamed from: X.69f */
public final class AnonymousClass69f extends AnonymousClass0NT {
    /* renamed from: B */
    public final /* synthetic */ String f72425B;
    /* renamed from: C */
    private String f72426C = UUID.randomUUID().toString();
    /* renamed from: D */
    private long f72427D;

    public AnonymousClass69f(String str) {
        this.f72425B = str;
    }

    /* renamed from: C */
    public final synchronized void m29238C() {
        if (this.f72427D == 0) {
            this.f72427D = System.currentTimeMillis();
        }
    }

    /* renamed from: D */
    public final String m29239D() {
        return this.f72425B;
    }

    /* renamed from: E */
    public final synchronized String m29240E() {
        m29238C();
        return this.f72426C;
    }

    /* renamed from: F */
    public final synchronized long m29241F() {
        m29238C();
        return this.f72427D;
    }
}
