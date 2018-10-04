package X;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.0ZY */
public final class AnonymousClass0ZY {
    /* renamed from: B */
    public int f6356B;
    /* renamed from: C */
    public int f6357C;
    /* renamed from: D */
    public HashMap f6358D;
    /* renamed from: E */
    public long f6359E;

    public AnonymousClass0ZY(int i, int i2) {
        this.f6357C = i;
        this.f6356B = i2;
        this.f6358D = new HashMap();
    }

    /* renamed from: A */
    public final Long m5376A(long j, String str) {
        AnonymousClass18a B = AnonymousClass0ZY.m5374B(this, str);
        if (B.f15011E.size() >= this.f6357C) {
            ArrayList arrayList = B.f15009C;
            ArrayList arrayList2 = B.f15011E;
            long j2 = 0;
            long j3 = 0;
            for (int i = 0; i < arrayList.size(); i++) {
                j2 += ((Long) arrayList.get(i)).longValue();
                j3 += ((Long) arrayList2.get(i)).longValue();
            }
            if (j2 != 0) {
                double d = (double) j3;
                double d2 = (double) j2;
                Double.isNaN(d);
                Double.isNaN(d2);
                d /= d2;
                d2 = (double) j;
                Double.isNaN(d2);
                return Long.valueOf((long) (d * d2));
            }
        }
        return null;
    }

    /* renamed from: B */
    public static AnonymousClass18a m5374B(AnonymousClass0ZY anonymousClass0ZY, String str) {
        AnonymousClass18a anonymousClass18a = (AnonymousClass18a) anonymousClass0ZY.f6358D.get(str);
        if (anonymousClass18a != null) {
            return anonymousClass18a;
        }
        anonymousClass0ZY = new AnonymousClass18a();
        anonymousClass0ZY.f15009C = new ArrayList();
        anonymousClass0ZY.f15011E = new ArrayList();
        anonymousClass0ZY.f15014H = str;
        return anonymousClass0ZY;
    }

    /* renamed from: B */
    public final boolean m5377B() {
        if (this.f6356B >= 1) {
            for (AnonymousClass18a anonymousClass18a : this.f6358D.values()) {
                if (anonymousClass18a.f15008B >= this.f6356B) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public static AnonymousClass0ZY m5375C(AnonymousClass0ZY anonymousClass0ZY, File file) {
        Closeable fileInputStream;
        Throwable e;
        Throwable th;
        if (!file.exists()) {
            return anonymousClass0ZY;
        }
        Closeable closeable = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                closeable = AnonymousClass0Lm.f3274B.createParser((InputStream) fileInputStream);
            } catch (IOException e2) {
                e = e2;
                try {
                    AnonymousClass0Gn.m1885L("RenderSpeedOracle", e);
                    AnonymousClass0Du.m1315C(closeable);
                    AnonymousClass0Du.m1315C(fileInputStream);
                    return anonymousClass0ZY;
                } catch (Throwable th2) {
                    th = th2;
                    AnonymousClass0Du.m1315C(closeable);
                    AnonymousClass0Du.m1315C(fileInputStream);
                    throw th;
                }
            }
            try {
                closeable.nextToken();
                AnonymousClass0ZY parseFromJson = AnonymousClass0Zh.parseFromJson(closeable);
                if (parseFromJson != null) {
                    if (parseFromJson.m5377B()) {
                        anonymousClass0ZY = parseFromJson;
                    }
                }
            } catch (IOException e3) {
                e = e3;
                AnonymousClass0Gn.m1885L("RenderSpeedOracle", e);
                AnonymousClass0Du.m1315C(closeable);
                AnonymousClass0Du.m1315C(fileInputStream);
                return anonymousClass0ZY;
            } catch (Throwable th3) {
                th = th3;
                AnonymousClass0Du.m1315C(closeable);
                AnonymousClass0Du.m1315C(fileInputStream);
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
            fileInputStream = null;
            AnonymousClass0Gn.m1885L("RenderSpeedOracle", e);
            AnonymousClass0Du.m1315C(closeable);
            AnonymousClass0Du.m1315C(fileInputStream);
            return anonymousClass0ZY;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            AnonymousClass0Du.m1315C(closeable);
            AnonymousClass0Du.m1315C(fileInputStream);
            throw th;
        }
        AnonymousClass0Du.m1315C(closeable);
        AnonymousClass0Du.m1315C(fileInputStream);
        return anonymousClass0ZY;
    }
}
