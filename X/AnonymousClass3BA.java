package X;

import com.facebook.forker.Process;
import java.util.Comparator;

/* renamed from: X.3BA */
public final class AnonymousClass3BA implements Comparator {
    /* renamed from: B */
    public static final int m18865B(AnonymousClass3B8 anonymousClass3B8) {
        anonymousClass3B8 = anonymousClass3B8.f38661B;
        if (anonymousClass3B8 == -3) {
            return 1;
        }
        if (anonymousClass3B8 == -1) {
            return 0;
        }
        switch (anonymousClass3B8) {
            case -7:
                return 4;
            case -6:
                return 3;
            case Process.SD_STDOUT /*-5*/:
                return 5;
            default:
                return Integer.MAX_VALUE;
        }
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return AnonymousClass3BA.m18865B((AnonymousClass3B8) obj) <= AnonymousClass3BA.m18865B((AnonymousClass3B8) obj2) ? -1 : 1;
    }
}
