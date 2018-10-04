package X;

import android.content.Context;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: X.0bc */
public final class AnonymousClass0bc {
    /* renamed from: E */
    public static final Pattern f6819E = Pattern.compile("^[0-9]+L$");
    /* renamed from: F */
    private static AnonymousClass0bd f6820F;
    /* renamed from: B */
    public final String f6821B;
    /* renamed from: C */
    private final Context f6822C;
    /* renamed from: D */
    private final AnonymousClass00u f6823D;

    public AnonymousClass0bc(Context context, AnonymousClass00u anonymousClass00u) {
        this.f6822C = context;
        if (anonymousClass00u != null) {
            this.f6823D = anonymousClass00u;
            this.f6821B = this.f6822C.getPackageName();
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: B */
    public static AnonymousClass0bd m5604B(Context context) {
        if (f6820F == null) {
            long parseLong;
            AnonymousClass0bc anonymousClass0bc = new AnonymousClass0bc(context, new AnonymousClass00u(context));
            String str = anonymousClass0bc.f6821B;
            String C = AnonymousClass0bc.m5605C(anonymousClass0bc, "com.facebook.versioncontrol.revision", str);
            String C2 = AnonymousClass0bc.m5605C(anonymousClass0bc, "com.facebook.versioncontrol.branch", str);
            String C3 = AnonymousClass0bc.m5605C(anonymousClass0bc, "com.facebook.build_time", str);
            context = JsonProperty.USE_DEFAULT_NAME;
            Object obj = (C3 == null || !f6819E.matcher(C3).matches()) ? null : 1;
            if (obj != null) {
                parseLong = Long.parseLong(C3.substring(0, C3.length() - 1));
                DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(1, 0, Locale.US);
                dateTimeInstance.setTimeZone(TimeZone.getTimeZone("PST8PDT"));
                context = dateTimeInstance.format(new Date(parseLong));
            } else {
                parseLong = 0;
            }
            f6820F = new AnonymousClass0bd(C, C2, parseLong, context);
        }
        return f6820F;
    }

    /* renamed from: C */
    public static String m5605C(AnonymousClass0bc anonymousClass0bc, String str, String str2) {
        anonymousClass0bc = anonymousClass0bc.f6823D.m60A(str, str2);
        return anonymousClass0bc == null ? JsonProperty.USE_DEFAULT_NAME : anonymousClass0bc;
    }
}
