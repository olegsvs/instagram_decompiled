package X;

import com.instagram.reels.viewer.ReelViewGroup;
import java.util.Comparator;

/* renamed from: X.5Cw */
public final class AnonymousClass5Cw implements Comparator {
    public AnonymousClass5Cw(ReelViewGroup reelViewGroup) {
    }

    public final int compare(Object obj, Object obj2) {
        AnonymousClass0ZF anonymousClass0ZF = (AnonymousClass0ZF) obj;
        if (anonymousClass0ZF.f6322d > ((AnonymousClass0ZF) obj2).f6322d) {
            return -1;
        }
        return anonymousClass0ZF.f6322d == anonymousClass0ZF.f6322d ? 0 : 1;
    }
}
