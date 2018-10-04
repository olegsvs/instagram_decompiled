package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.63Z */
public final class AnonymousClass63Z extends AnonymousClass2Cc {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass63a f71333B;

    public AnonymousClass63Z(AnonymousClass63a anonymousClass63a) {
        this.f71333B = anonymousClass63a;
    }

    public final void sDA(AnonymousClass0iq anonymousClass0iq) {
        AnonymousClass0Cm anonymousClass0Cm = this.f71333B.f71334B.f71338C;
        String str = "tag_products_tooltip_seen_count";
        AnonymousClass2FT.B(anonymousClass0Cm).edit().putInt(str, AnonymousClass2FT.B(anonymousClass0Cm).getInt(str, 0) + 1).apply();
        AnonymousClass2FT.B(this.f71333B.f71334B.f71338C).edit().putLong("tag_products_tooltip_last_shown_time_sec", TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())).apply();
    }
}
