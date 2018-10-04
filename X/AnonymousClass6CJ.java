package X;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.6CJ */
public final class AnonymousClass6CJ {
    /* renamed from: G */
    public static AnonymousClass1ec f72894G;
    /* renamed from: H */
    public static AnonymousClass6CJ f72895H;
    /* renamed from: B */
    public AnonymousClass1eP f72896B;
    /* renamed from: C */
    public AnonymousClass1Lz f72897C;
    /* renamed from: D */
    public Set f72898D;
    /* renamed from: E */
    public AnonymousClass1eQ f72899E;
    /* renamed from: F */
    public AnonymousClass5ef f72900F;

    public AnonymousClass6CJ(AnonymousClass1eP anonymousClass1eP, AnonymousClass1Lz anonymousClass1Lz, AnonymousClass1eQ anonymousClass1eQ) {
        this(anonymousClass1eP, anonymousClass1Lz, anonymousClass1eQ, new HashSet(Arrays.asList(new String[]{"main.jsbundle"})));
    }

    public AnonymousClass6CJ(AnonymousClass1eP anonymousClass1eP, AnonymousClass1Lz anonymousClass1Lz, AnonymousClass1eQ anonymousClass1eQ, Set set) {
        this.f72900F = AnonymousClass5ef.NO_BUNDLE_LOADED;
        this.f72896B = anonymousClass1eP;
        this.f72897C = anonymousClass1Lz;
        this.f72899E = anonymousClass1eQ;
        this.f72898D = set;
    }

    /* renamed from: A */
    public final String m29423A(String str) {
        File B = m29424B(str);
        if (B == null) {
            return null;
        }
        return B.getAbsolutePath();
    }

    /* renamed from: B */
    public final File m29424B(String str) {
        this.f72897C.C();
        AnonymousClass1ec D = m29426D();
        this.f72897C.C();
        if (D == null) {
            return null;
        }
        return D.sQ(str);
    }

    /* renamed from: B */
    public static final void m29416B(int i, long j, long j2) {
        AnonymousClass0Dc.R("AutoUpdaterImpl", "Activated build %d JS bundle file failed file check: expected file of size %d but was %d", new Object[]{Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2)});
    }

    /* renamed from: C */
    public final AnonymousClass1ec m29425C() {
        return null;
    }

    /* renamed from: C */
    public static final void m29417C(int i, long j, long j2) {
        AnonymousClass0Dc.R("AutoUpdaterImpl", "Next build %d JS bundle file failed file check: expected file of size %d but was %d", new Object[]{Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2)});
    }

    /* renamed from: D */
    public final AnonymousClass1ec m29426D() {
        AnonymousClass1ec anonymousClass1ec;
        synchronized (AnonymousClass6CJ.class) {
            this.f72897C.C();
            if (this.f72900F == AnonymousClass5ef.NO_BUNDLE_LOADED) {
                f72894G = AnonymousClass6CJ.m29418D(this);
                if (f72894G != null) {
                    this.f72900F = AnonymousClass5ef.USE_NEW_OTA_BUNDLE;
                    this.f72897C.C();
                    anonymousClass1ec = f72894G;
                } else {
                    f72894G = AnonymousClass6CJ.m29419E(this);
                    if (f72894G != null) {
                        this.f72900F = AnonymousClass5ef.USE_EXISTING_OTA_BUNDLE;
                        this.f72897C.C();
                        anonymousClass1ec = f72894G;
                    } else {
                        this.f72900F = AnonymousClass5ef.USE_NATIVE;
                    }
                }
            }
            this.f72897C.C();
            anonymousClass1ec = f72894G;
        }
        return anonymousClass1ec;
    }

    /* renamed from: D */
    private static AnonymousClass1ec m29418D(AnonymousClass6CJ anonymousClass6CJ) {
        AnonymousClass1ec C = anonymousClass6CJ.m29425C();
        if (C != null) {
            return AnonymousClass6CJ.m29421G(anonymousClass6CJ, C);
        }
        int E = anonymousClass6CJ.f72897C.E();
        if (E == -1) {
            anonymousClass6CJ.f72897C.A();
            return null;
        } else if (E == 0) {
            return null;
        } else {
            return AnonymousClass6CJ.m29421G(anonymousClass6CJ, new AnonymousClass1ec(anonymousClass6CJ.f72899E, E));
        }
    }

    /* renamed from: E */
    private static AnonymousClass1ec m29419E(AnonymousClass6CJ anonymousClass6CJ) {
        int C = anonymousClass6CJ.f72897C.C();
        if (C == 0) {
            return null;
        }
        Object anonymousClass1ec = new AnonymousClass1ec(anonymousClass6CJ.f72899E, C);
        if (anonymousClass1ec.A(anonymousClass6CJ.f72898D)) {
            if (AnonymousClass6CJ.m29420F(anonymousClass6CJ, anonymousClass1ec)) {
                return anonymousClass1ec;
            }
        }
        anonymousClass6CJ.f72899E.A(anonymousClass6CJ.f72897C);
        anonymousClass6CJ.f72897C.A();
        return null;
    }

    /* renamed from: F */
    private static boolean m29420F(AnonymousClass6CJ anonymousClass6CJ, AnonymousClass1eY anonymousClass1eY) {
        int C = anonymousClass6CJ.f72897C.C();
        long E = AnonymousClass1Lz.C(anonymousClass6CJ.f72897C).E("activated_js_file_size", -1);
        if (E != -1) {
            File sQ = anonymousClass1eY.sQ("main.jsbundle");
            if (sQ != null) {
                if (sQ.isFile()) {
                    long length = sQ.length();
                    if (E != length) {
                        AnonymousClass6CJ.m29416B(C, E, length);
                        return false;
                    }
                }
            }
            AnonymousClass6CJ.m29416B(C, E, -1);
            return false;
        }
        return true;
    }

    /* renamed from: G */
    private static AnonymousClass1ec m29421G(AnonymousClass6CJ anonymousClass6CJ, AnonymousClass1ec anonymousClass1ec) {
        if (anonymousClass1ec.A(anonymousClass6CJ.f72898D)) {
            if (anonymousClass6CJ.m29422H(anonymousClass1ec)) {
                int i;
                AnonymousClass1Lz anonymousClass1Lz = anonymousClass6CJ.f72897C;
                AnonymousClass1Lz.C(anonymousClass1Lz).B().QIA("activated", anonymousClass1ec.f21004C).apply();
                AnonymousClass1Lz.D(anonymousClass6CJ.f72897C, anonymousClass1ec, "activated_js_file_size");
                anonymousClass6CJ.f72897C.B();
                int i2 = anonymousClass1ec.f21004C;
                long E = AnonymousClass1Lz.C(anonymousClass6CJ.f72897C).E("download_end_time", 0);
                if (E != 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis > E) {
                        i = ((int) (currentTimeMillis - E)) / JsonMappingException.MAX_REFS_TO_LIST;
                        Integer.valueOf(i2);
                        Integer.valueOf(i);
                        anonymousClass6CJ.f72896B.A(i2, (long) i);
                        return anonymousClass1ec;
                    }
                }
                i = 0;
                Integer.valueOf(i2);
                Integer.valueOf(i);
                anonymousClass6CJ.f72896B.A(i2, (long) i);
                return anonymousClass1ec;
            }
        }
        anonymousClass6CJ.f72899E.B(anonymousClass6CJ.f72897C);
        anonymousClass6CJ.f72897C.B();
        return null;
    }

    /* renamed from: H */
    private boolean m29422H(AnonymousClass1eY anonymousClass1eY) {
        int E = this.f72897C.E();
        long E2 = AnonymousClass1Lz.C(this.f72897C).E("next_js_file_size", -1);
        if (E2 != -1) {
            File sQ = anonymousClass1eY.sQ("main.jsbundle");
            if (sQ != null) {
                if (sQ.isFile()) {
                    long length = sQ.length();
                    if (E2 != length) {
                        AnonymousClass6CJ.m29417C(E, E2, length);
                        return false;
                    }
                }
            }
            AnonymousClass6CJ.m29417C(E, E2, -1);
            return false;
        }
        return true;
    }
}
