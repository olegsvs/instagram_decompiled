package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.0tt */
public final class AnonymousClass0tt {
    /* renamed from: B */
    private static volatile Integer f11769B;

    /* renamed from: B */
    public static int m8192B(Context context) {
        if (f11769B == null) {
            synchronized (AnonymousClass0tt.class) {
                if (f11769B == null) {
                    f11769B = Integer.valueOf(AnonymousClass0tt.m8194D(context));
                }
            }
        }
        return f11769B.intValue();
    }

    /* renamed from: C */
    private static int m8193C(Context context) {
        ArrayList arrayList = new ArrayList();
        AnonymousClass0tt.m8195E(arrayList, AnonymousClass0tt.m8197G());
        AnonymousClass0tt.m8195E(arrayList, AnonymousClass0tt.m8196F());
        AnonymousClass0tt.m8195E(arrayList, AnonymousClass0tt.m8198H(context));
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        if ((arrayList.size() & 1) == 1) {
            return ((Integer) arrayList.get(arrayList.size() / 2)).intValue();
        }
        int size = (arrayList.size() / 2) - 1;
        return ((Integer) arrayList.get(size)).intValue() + ((((Integer) arrayList.get(size + 1)).intValue() - ((Integer) arrayList.get(size)).intValue()) / 2);
    }

    /* renamed from: D */
    private static int m8194D(Context context) {
        long E = AnonymousClass1Ah.m9751E(context);
        if (E == -1) {
            return AnonymousClass0tt.m8193C(context);
        }
        int i;
        if (E <= 805306368) {
            i = AnonymousClass1Ah.m9750D() <= 1 ? 2009 : 2010;
        } else {
            int i2 = 2012;
            if (E <= 1073741824) {
                if (AnonymousClass1Ah.m9748B() < 1300000) {
                    i2 = 2011;
                }
            } else if (E <= 1610612736) {
                if (AnonymousClass1Ah.m9748B() >= 1800000) {
                    i2 = 2013;
                }
            } else if (E <= 2147483648L) {
                return 2013;
            } else {
                if (E <= 3221225472L) {
                    return 2014;
                }
                i = E <= 5368709120L ? 2015 : 2016;
            }
            return i2;
        }
        return i;
    }

    /* renamed from: E */
    private static void m8195E(ArrayList arrayList, int i) {
        if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    /* renamed from: F */
    private static int m8196F() {
        long B = (long) AnonymousClass1Ah.m9748B();
        if (B == -1) {
            return -1;
        }
        if (B <= 528000) {
            return 2008;
        }
        if (B <= 620000) {
            return 2009;
        }
        if (B <= 1020000) {
            return 2010;
        }
        if (B <= 1220000) {
            return 2011;
        }
        if (B <= 1520000) {
            return 2012;
        }
        return B <= 2020000 ? 2013 : 2014;
    }

    /* renamed from: G */
    private static int m8197G() {
        int D = AnonymousClass1Ah.m9750D();
        if (D < 1) {
            return -1;
        }
        if (D == 1) {
            return 2008;
        }
        return D <= 3 ? 2011 : 2012;
    }

    /* renamed from: H */
    private static int m8198H(Context context) {
        long E = AnonymousClass1Ah.m9751E(context);
        if (E <= 0) {
            return -1;
        }
        if (E <= 201326592) {
            return 2008;
        }
        if (E <= 304087040) {
            return 2009;
        }
        if (E <= 536870912) {
            return 2010;
        }
        if (E <= 1073741824) {
            return 2011;
        }
        if (E <= 1610612736) {
            return 2012;
        }
        return E <= 2147483648L ? 2013 : 2014;
    }
}
