package X;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.305 */
public final class AnonymousClass305 {
    /* renamed from: B */
    private static final SimpleDateFormat f36770B = new SimpleDateFormat("d", Locale.getDefault());
    /* renamed from: C */
    private static final SimpleDateFormat f36771C = new SimpleDateFormat("MMM", Locale.getDefault());

    static {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        f36770B.setTimeZone(timeZone);
        f36771C.setTimeZone(timeZone);
    }

    /* renamed from: B */
    public static void m18152B(AnonymousClass304 anonymousClass304, boolean z, long j) {
        if (z) {
            Date date = new Date(j * 1000);
            CharSequence format = f36770B.format(date);
            CharSequence format2 = f36771C.format(date);
            anonymousClass304.f36762D.setText(format);
            anonymousClass304.f36766H.setText(format2);
            anonymousClass304.f36760B.setVisibility(0);
            return;
        }
        anonymousClass304.f36760B.setVisibility(8);
    }

    /* renamed from: C */
    public static void m18153C(AnonymousClass304 anonymousClass304) {
        anonymousClass304.f36763E.setVisibility(8);
        anonymousClass304.f36764F.E();
        anonymousClass304.f36768J = null;
        anonymousClass304.f36760B.setVisibility(8);
        anonymousClass304.f36761C.setVisibility(8);
        anonymousClass304.f36765G.setVisibility(8);
        anonymousClass304.f36763E.setBackgroundDrawable(null);
    }
}
