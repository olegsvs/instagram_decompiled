package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.63b */
public final class AnonymousClass63b extends AnonymousClass0VA implements AnonymousClass0TK {
    /* renamed from: B */
    public AnonymousClass0iq f71337B;
    /* renamed from: C */
    public final AnonymousClass0Cm f71338C;

    public AnonymousClass63b(AnonymousClass0Cm anonymousClass0Cm) {
        this.f71338C = anonymousClass0Cm;
    }

    /* renamed from: B */
    public static boolean m28840B(AnonymousClass63b anonymousClass63b) {
        if (AnonymousClass2FT.B(anonymousClass63b.f71338C).getLong("tag_products_tooltip_last_shown_time_sec", 0) == 0) {
            return true;
        }
        if (TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - AnonymousClass2FT.B(anonymousClass63b.f71338C).getLong("tag_products_tooltip_last_shown_time_sec", 0) > 518400) {
            return true;
        }
        return false;
    }

    public final void St() {
        AnonymousClass0iq anonymousClass0iq = this.f71337B;
        if (anonymousClass0iq != null && anonymousClass0iq.B()) {
            this.f71337B.A(false);
            this.f71337B = null;
        }
    }

    public final void gi() {
        this.f71337B = null;
    }
}
