package X;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.14R */
public final class AnonymousClass14R extends AnonymousClass0Gn {
    /* renamed from: E */
    public static final String f13891E = "IgErrorReporterImpl";
    /* renamed from: B */
    public final ExecutorService f13892B;
    /* renamed from: C */
    private final boolean f13893C = (AnonymousClass0CB.m840J() ^ 1);
    /* renamed from: D */
    private final Random f13894D = new Random();

    public AnonymousClass14R() {
        synchronized (AnonymousClass14S.class) {
            if (AnonymousClass14S.f13895B == null) {
                AnonymousClass14S.f13895B = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new AnonymousClass14T("ErrorReportingThread-"));
            }
        }
        this.f13892B = AnonymousClass14S.f13895B;
    }

    /* renamed from: A */
    public final void mo2103A(String str, String str2) {
        AnonymousClass0DE.m1113F();
        AnonymousClass0DE.m1118K(str, str2);
    }

    /* renamed from: B */
    public final void mo2104B() {
        AnonymousClass0DE.m1113F().m1181V(10);
    }

    /* renamed from: C */
    public final void mo2105C(String str) {
        AnonymousClass0DE.m1113F().m1184Y(str);
    }

    /* renamed from: D */
    public final void mo2106D(String str, String str2) {
        AnonymousClass0GG.m1763B(this.f13892B, new AnonymousClass24e(this, str, str2, null), -1316059892);
    }

    /* renamed from: E */
    public final void mo2107E(String str, Throwable th) {
        AnonymousClass0GG.m1763B(this.f13892B, new AnonymousClass24e(this, str, th.getMessage(), th), -1316059892);
    }

    /* renamed from: F */
    public final void mo2108F(String str, String str2, Throwable th, boolean z) {
        AnonymousClass18k B = AnonymousClass18j.m9637B(str, str2);
        B.f15027D = z;
        B.f15026C = th;
        m9186O(new AnonymousClass18j(B));
    }

    /* renamed from: G */
    public final void mo2109G(String str, String str2, Throwable th, boolean z, int i) {
        AnonymousClass18k B = AnonymousClass18j.m9637B(str, str2);
        B.f15027D = z;
        B.f15026C = th;
        B.f15030G = i;
        m9186O(new AnonymousClass18j(B));
    }

    /* renamed from: H */
    public final void mo2110H(String str, String str2, boolean z, int i) {
        AnonymousClass18k B = AnonymousClass18j.m9637B(str, str2);
        B.f15027D = z;
        B.f15030G = i;
        m9186O(new AnonymousClass18j(B));
    }

    /* renamed from: I */
    public final void mo2111I(String str, Throwable th, boolean z) {
        mo2108F(str, th.getMessage(), th, z);
    }

    /* renamed from: M */
    public static String m9184M(AnonymousClass14R anonymousClass14R, String str, int i, boolean z) {
        if ((!anonymousClass14R.f13893C ? null : 1) == null) {
            if (!z) {
                if (anonymousClass14R.f13894D.nextInt() % i == 0) {
                    if (i != 1) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(str);
                        stringBuilder.append(" [freq=");
                        stringBuilder.append(i);
                        stringBuilder.append("]");
                        return stringBuilder.toString();
                    }
                }
            }
            return null;
        }
        return str;
    }

    /* renamed from: N */
    private String m9185N(AnonymousClass18j anonymousClass18j) {
        boolean z = this.f13893C;
        if (!anonymousClass18j.f15021D || !z) {
            return anonymousClass18j.f15019B;
        }
        AnonymousClass0DE.m1113F();
        AnonymousClass0DE.m1118K("soft_error_message", anonymousClass18j.f15022E);
        AnonymousClass0Dc.m1245H(f13891E, "category: %s message: %s", anonymousClass18j.f15019B, anonymousClass18j.f15022E);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Soft error FAILING HARDER: ");
        stringBuilder.append(anonymousClass18j.f15019B);
        stringBuilder.append(", ");
        stringBuilder.append(anonymousClass18j.f15022E);
        AnonymousClass0DZ.m1229D(Thread.currentThread(), new RuntimeException(stringBuilder.toString(), anonymousClass18j.f15020C));
        return null;
    }

    /* renamed from: O */
    private void m9186O(AnonymousClass18j anonymousClass18j) {
        if (m9185N(anonymousClass18j) != null) {
            String str = anonymousClass18j.f15022E;
            AnonymousClass0GG.m1763B(this.f13892B, new AnonymousClass18n(this, anonymousClass18j, str, new AnonymousClass18l(str, anonymousClass18j.f15020C)), 1165297005);
        }
    }
}
