package X;

import java.util.Comparator;

/* renamed from: X.1b3 */
public final class AnonymousClass1b3 implements Comparator {
    public final int compare(Object obj, Object obj2) {
        AnonymousClass0W7 anonymousClass0W7 = (AnonymousClass0W7) obj;
        AnonymousClass0W7 anonymousClass0W72 = (AnonymousClass0W7) obj2;
        if (anonymousClass0W7.f5885O != null && anonymousClass0W72.f5885O != null) {
            return AnonymousClass0Wx.f6072B.compare(anonymousClass0W7.f5885O, anonymousClass0W72.f5885O);
        }
        if (anonymousClass0W7.f5875E == null || anonymousClass0W72.f5875E == null || !AnonymousClass0LQ.m2954B(anonymousClass0W7.f5875E, anonymousClass0W72.f5875E) || anonymousClass0W7.f5915s != anonymousClass0W72.f5915s) {
            return AnonymousClass1f9.m12357B(anonymousClass0W7.m5009K(), anonymousClass0W72.m5009K());
        }
        return 0;
    }
}
