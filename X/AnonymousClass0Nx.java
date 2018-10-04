package X;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashMap;

/* renamed from: X.0Nx */
public final class AnonymousClass0Nx {
    /* renamed from: B */
    public final LinkedHashMap f3752B = new LinkedHashMap(0, 0.75f, false);
    /* renamed from: C */
    public final Handler f3753C = new AnonymousClass0O6(this, Looper.getMainLooper());
    /* renamed from: D */
    public final AnonymousClass0HV f3754D;

    public AnonymousClass0Nx(AnonymousClass0Cm anonymousClass0Cm) {
        this.f3754D = AnonymousClass0HV.m2008D(anonymousClass0Cm);
    }

    /* renamed from: A */
    public final void m3490A(String str, Long l) {
        Long l2 = (Long) this.f3752B.remove(str);
        if (l2 != null) {
            l = Long.valueOf(Math.max(l.longValue(), l2.longValue()));
        }
        this.f3752B.put(str, l);
    }
}
