package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.xplat.fbglog.FbGlog;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Dc */
public final class AnonymousClass0Dc {
    /* renamed from: B */
    public static final List f1891B = new ArrayList();
    /* renamed from: C */
    public static volatile AnonymousClass0De f1892C = AnonymousClass0Dd.f1893C;

    static {
        f1892C.gPA(5);
        AnonymousClass0De anonymousClass0De = f1892C;
        if (anonymousClass0De != null) {
            AnonymousClass0Df.f1895B = anonymousClass0De;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: B */
    public static void m1239B(Class cls, String str) {
        if (f1892C.wX(6)) {
            f1892C.xG(AnonymousClass013.m67B(cls), str);
        }
    }

    /* renamed from: C */
    public static void m1240C(Class cls, String str, Throwable th) {
        if (f1892C.wX(6)) {
            f1892C.yG(AnonymousClass013.m67B(cls), str, th);
        }
    }

    /* renamed from: D */
    public static void m1241D(Class cls, String str, Object... objArr) {
        if (f1892C.wX(6)) {
            AnonymousClass0Dc.m1243F(AnonymousClass013.m67B(cls), StringFormatUtil.formatStrLocaleSafe(str, objArr));
        }
    }

    /* renamed from: E */
    public static void m1242E(Class cls, Throwable th, String str, Object... objArr) {
        if (f1892C.wX(6)) {
            AnonymousClass0Dc.m1244G(AnonymousClass013.m67B(cls), StringFormatUtil.formatStrLocaleSafe(str, objArr), th);
        }
    }

    /* renamed from: F */
    public static void m1243F(String str, String str2) {
        if (f1892C.wX(6)) {
            f1892C.xG(str, str2);
        }
    }

    /* renamed from: G */
    public static void m1244G(String str, String str2, Throwable th) {
        if (f1892C.wX(6)) {
            f1892C.yG(str, str2, th);
        }
    }

    /* renamed from: H */
    public static void m1245H(String str, String str2, Object... objArr) {
        if (f1892C.wX(6)) {
            AnonymousClass0Dc.m1243F(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr));
        }
    }

    /* renamed from: I */
    public static void m1246I(String str, Throwable th, String str2, Object... objArr) {
        if (f1892C.wX(6)) {
            AnonymousClass0Dc.m1244G(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr), th);
        }
    }

    /* renamed from: J */
    public static boolean m1247J(int i) {
        return f1892C.wX(i);
    }

    /* renamed from: K */
    public static synchronized void m1248K(int i) {
        synchronized (AnonymousClass0Dc.class) {
            f1892C.gPA(i);
            for (AnonymousClass1CJ anonymousClass1CJ : f1891B) {
                FbGlog.setLogLevel(i);
            }
        }
    }

    /* renamed from: L */
    public static void m1249L(Class cls, String str) {
        if (f1892C.wX(5)) {
            f1892C.wWA(AnonymousClass013.m67B(cls), str);
        }
    }

    /* renamed from: M */
    public static void m1250M(Class cls, String str, Throwable th) {
        if (f1892C.wX(5)) {
            f1892C.xWA(AnonymousClass013.m67B(cls), str, th);
        }
    }

    /* renamed from: N */
    public static void m1251N(Class cls, String str, Object... objArr) {
        if (f1892C.wX(5)) {
            AnonymousClass0Dc.m1253P(AnonymousClass013.m67B(cls), StringFormatUtil.formatStrLocaleSafe(str, objArr));
        }
    }

    /* renamed from: O */
    public static void m1252O(Class cls, Throwable th, String str, Object... objArr) {
        if (f1892C.wX(5)) {
            AnonymousClass0Dc.m1254Q(AnonymousClass013.m67B(cls), StringFormatUtil.formatStrLocaleSafe(str, objArr), th);
        }
    }

    /* renamed from: P */
    public static void m1253P(String str, String str2) {
        if (f1892C.wX(5)) {
            f1892C.wWA(str, str2);
        }
    }

    /* renamed from: Q */
    public static void m1254Q(String str, String str2, Throwable th) {
        if (f1892C.wX(5)) {
            f1892C.xWA(str, str2, th);
        }
    }

    /* renamed from: R */
    public static void m1255R(String str, String str2, Object... objArr) {
        if (f1892C.wX(5)) {
            AnonymousClass0Dc.m1253P(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr));
        }
    }

    /* renamed from: S */
    public static void m1256S(String str, Throwable th, String str2, Object... objArr) {
        if (f1892C.wX(5)) {
            AnonymousClass0Dc.m1254Q(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr), th);
        }
    }

    /* renamed from: T */
    public static void m1257T(String str, String str2) {
        if (f1892C.wX(6)) {
            f1892C.HXA(str, str2);
        }
    }

    /* renamed from: U */
    public static void m1258U(String str, String str2, Throwable th) {
        if (f1892C.wX(6)) {
            f1892C.IXA(str, str2, th);
        }
    }

    /* renamed from: V */
    public static void m1259V(String str, String str2, Object... objArr) {
        if (f1892C.wX(6)) {
            AnonymousClass0Dc.m1257T(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr));
        }
    }

    /* renamed from: W */
    public static void m1260W(String str, Throwable th, String str2, Object... objArr) {
        if (f1892C.wX(6)) {
            AnonymousClass0Dc.m1258U(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr), th);
        }
    }
}
