package X;

import android.os.Build.VERSION;
import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Locale;

/* renamed from: X.1mQ */
public final class AnonymousClass1mQ {
    /* renamed from: B */
    public static final Locale f22588B;

    static {
        String str = JsonProperty.USE_DEFAULT_NAME;
        f22588B = new Locale(str, str);
    }

    /* renamed from: B */
    public static int m12987B(Locale locale) {
        if (VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (!(locale == null || locale.equals(f22588B))) {
            String A = AnonymousClass1mN.f22584B.mo2769A(locale);
            if (A == null) {
                return AnonymousClass1mQ.m12988C(locale);
            }
            if (A.equalsIgnoreCase("Arab") || A.equalsIgnoreCase("Hebr")) {
                return 1;
            }
        }
        return 0;
    }

    /* renamed from: C */
    private static int m12988C(Locale locale) {
        switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
            case (byte) 1:
            case (byte) 2:
                return 1;
            default:
                return 0;
        }
    }
}
