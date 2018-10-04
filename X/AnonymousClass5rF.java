package X;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5rF */
public final class AnonymousClass5rF implements AnonymousClass19O {
    /* renamed from: B */
    private final long f69415B;

    public AnonymousClass5rF(int i) {
        this.f69415B = TimeUnit.SECONDS.toMillis((long) i);
    }

    public final boolean GHA(AnonymousClass0T7 anonymousClass0T7, AnonymousClass0oj anonymousClass0oj) {
        Long valueOf;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (anonymousClass0oj) {
            List list = anonymousClass0oj.f10328B;
            long j = 0;
            if (!list.isEmpty()) {
                j = ((Long) list.get(list.size() - 1)).longValue();
            }
            valueOf = Long.valueOf(j);
        }
        return currentTimeMillis - valueOf.longValue() > this.f69415B;
    }
}
