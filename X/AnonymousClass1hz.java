package X;

import java.util.Locale;

/* renamed from: X.1hz */
public final class AnonymousClass1hz extends AnonymousClass5ig {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6AU f21567B;

    public AnonymousClass1hz(AnonymousClass6AU anonymousClass6AU, String str) {
        this.f21567B = anonymousClass6AU;
        super(str);
    }

    /* renamed from: A */
    public final String m12641A() {
        return String.format(Locale.US, "%s_local", new Object[]{this.f21567B.f72528B});
    }

    /* renamed from: B */
    public final String m12642B(String str) {
        return String.format(Locale.US, "%s_%s_remote", new Object[]{this.f21567B.f72528B, str});
    }
}
