package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.C0164R;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Pw */
public final class AnonymousClass1Pw {
    /* renamed from: B */
    private static final Calendar f18270B = Calendar.getInstance();
    /* renamed from: C */
    private static final Calendar f18271C = Calendar.getInstance();

    /* renamed from: B */
    public static int m11305B(long j) {
        Calendar calendar = f18270B;
        calendar.setTimeInMillis(j);
        j = calendar.get(6);
        int i = f18271C.get(6);
        return i < j ? (i + f18270B.getActualMaximum(6)) - j : i - j;
    }

    /* renamed from: C */
    public static int m11306C(String str, List list) {
        int i = 0;
        for (AnonymousClass1Hi anonymousClass1Hi : list) {
            if (anonymousClass1Hi.f16794B.contains(str)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: D */
    public static String m11307D(String str, boolean z, List list, Resources resources) {
        list = AnonymousClass1Pw.m11306C(str, list);
        if (!z) {
            return list == 1 ? resources.getString(C0164R.string.direct_activity_indicator_in_chat) : null;
        } else {
            return resources.getQuantityString(true, list, new Object[]{Integer.valueOf(list)});
        }
    }

    /* renamed from: E */
    public static String m11308E(boolean z, List list, Resources resources) {
        AnonymousClass0Sy.m4434C();
        if (!list.isEmpty()) {
            long currentTimeMillis = System.currentTimeMillis();
            f18271C.setTimeInMillis(currentTimeMillis);
            AnonymousClass1Hi anonymousClass1Hi = (AnonymousClass1Hi) list.get(0);
            if (z) {
                int i = 0;
                for (AnonymousClass1Hi anonymousClass1Hi2 : list) {
                    if (AnonymousClass1Pw.m11305B(anonymousClass1Hi2.f16796D) == 0) {
                        i++;
                    }
                }
                if (i > 0) {
                    return resources.getQuantityString(C0164R.plurals.direct_digest_num_active_recipients_today, i, new Object[]{Integer.valueOf(i)});
                }
            } else if (anonymousClass1Hi.f16796D > 0) {
                if (AnonymousClass1Pw.m11316M(anonymousClass1Hi, currentTimeMillis)) {
                    return resources.getString(C0164R.string.direct_digest_is_active_now);
                }
                return AnonymousClass1Pw.m11309F(resources, anonymousClass1Hi.f16796D);
            }
        }
        return null;
    }

    /* renamed from: F */
    public static String m11309F(Resources resources, long j) {
        int toMinutes = (int) TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - j);
        long j2 = (long) toMinutes;
        if (j2 <= 4) {
            return resources.getString(C0164R.string.direct_digest_is_active_now);
        }
        if (j2 <= 59) {
            return resources.getQuantityString(C0164R.plurals.direct_digest_is_active_x_mins_ago, toMinutes, new Object[]{Integer.valueOf(toMinutes)});
        } else if (j2 <= 480) {
            return resources.getQuantityString(C0164R.plurals.direct_digest_is_active_x_hours_ago, (int) TimeUnit.MINUTES.toHours(j2), new Object[]{Integer.valueOf((int) TimeUnit.MINUTES.toHours(j2))});
        } else {
            int B = AnonymousClass1Pw.m11305B(j);
            if (B == 0) {
                return resources.getString(C0164R.string.direct_digest_active_today);
            }
            return B == 1 ? resources.getString(C0164R.string.direct_digest_active_yesterday) : null;
        }
    }

    /* renamed from: G */
    public static String m11310G(Context context, AnonymousClass0Tj anonymousClass0Tj, DirectShareTarget directShareTarget) {
        DirectThreadKey directThreadKey = directShareTarget.f5604E;
        if (directThreadKey != null) {
            List list = directThreadKey.f5870B;
            if (list != null) {
                return AnonymousClass1Pw.m11308E(directShareTarget.m4806D(), AnonymousClass1Pw.m11312I(anonymousClass0Tj, list), context.getResources());
            }
        }
        return null;
    }

    /* renamed from: H */
    public static List m11311H(AnonymousClass0Tj anonymousClass0Tj, List list) {
        if (list == null) {
            return Collections.emptyList();
        }
        List arrayList = new ArrayList(list.size());
        for (AnonymousClass0Ci id : list) {
            AnonymousClass1Hi A = anonymousClass0Tj.m4537A(id.getId());
            if (A != null) {
                arrayList.add(A);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: I */
    public static List m11312I(AnonymousClass0Tj anonymousClass0Tj, List list) {
        if (list == null) {
            return Collections.emptyList();
        }
        List arrayList = new ArrayList(list.size());
        for (String A : list) {
            AnonymousClass1Hi A2 = anonymousClass0Tj.m4537A(A);
            if (A2 != null) {
                arrayList.add(A2);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: J */
    public static boolean m11313J(List list) {
        if (list.isEmpty()) {
            return false;
        }
        AnonymousClass1Hi anonymousClass1Hi = (AnonymousClass1Hi) list.get(0);
        if (anonymousClass1Hi.f16796D <= 0 || !AnonymousClass1Pw.m11316M(anonymousClass1Hi, AnonymousClass0Gd.m1838C())) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    public static boolean m11314K(AnonymousClass0Tj anonymousClass0Tj, DirectShareTarget directShareTarget) {
        DirectThreadKey directThreadKey = directShareTarget.f5604E;
        if (directThreadKey != null) {
            List list = directThreadKey.f5870B;
            if (list != null) {
                return AnonymousClass1Pw.m11313J(AnonymousClass1Pw.m11312I(anonymousClass0Tj, list));
            }
        }
        return false;
    }

    /* renamed from: L */
    public static boolean m11315L(AnonymousClass0Tj anonymousClass0Tj, AnonymousClass0Ck anonymousClass0Ck) {
        return AnonymousClass1Pw.m11313J(AnonymousClass1Pw.m11312I(anonymousClass0Tj, Collections.singletonList(anonymousClass0Ck.getId())));
    }

    /* renamed from: M */
    private static boolean m11316M(AnonymousClass1Hi anonymousClass1Hi, long j) {
        int toMinutes = (int) TimeUnit.MILLISECONDS.toMinutes(j - anonymousClass1Hi.f16796D);
        if (!anonymousClass1Hi.f16795C) {
            if (((long) toMinutes) > 4) {
                return false;
            }
        }
        return true;
    }
}
