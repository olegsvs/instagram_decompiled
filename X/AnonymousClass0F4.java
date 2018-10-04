package X;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0F4 */
public final class AnonymousClass0F4 {
    /* renamed from: E */
    public static AnonymousClass0F4 f2058E = new AnonymousClass0F4(Looper.getMainLooper());
    /* renamed from: B */
    public final List f2059B = new ArrayList();
    /* renamed from: C */
    private final Handler f2060C;
    /* renamed from: D */
    private final Map f2061D = new HashMap();

    public AnonymousClass0F4(Looper looper) {
        this.f2060C = new AnonymousClass0P4(this, looper);
    }

    /* renamed from: A */
    public final synchronized AnonymousClass0F4 m1504A(Class cls, AnonymousClass0F8 anonymousClass0F8) {
        Set set = (Set) this.f2061D.get(cls);
        if (set == null) {
            set = new HashSet();
            this.f2061D.put(cls, set);
        }
        synchronized (set) {
            set.add(anonymousClass0F8);
        }
        return this;
    }

    /* renamed from: B */
    public final void m1505B(AnonymousClass0F6 anonymousClass0F6) {
        synchronized (this.f2059B) {
            this.f2059B.add(anonymousClass0F6);
            if (!this.f2060C.hasMessages(1)) {
                this.f2060C.sendEmptyMessage(1);
            }
        }
    }

    /* renamed from: B */
    public static boolean m1503B(AnonymousClass0F4 anonymousClass0F4, AnonymousClass0F6 anonymousClass0F6) {
        int I = AnonymousClass0cQ.m5859I(anonymousClass0F4, 706386583);
        synchronized (anonymousClass0F4) {
            try {
                Set set = (Set) anonymousClass0F4.f2061D.get(anonymousClass0F6.getClass());
            } catch (Throwable th) {
                while (true) {
                    AnonymousClass0cQ.m5858H(anonymousClass0F4, 1449738836, I);
                }
            }
        }
        boolean z = false;
        if (set != null) {
            boolean z2;
            synchronized (set) {
                ArrayList B;
                try {
                    B = AnonymousClass0hU.m6753B(set);
                    int size = B.size();
                    z2 = false;
                    int i;
                    while (i < size) {
                        AnonymousClass0F8 anonymousClass0F8 = (AnonymousClass0F8) B.get(i);
                        if (set.contains(anonymousClass0F8)) {
                            if (!(anonymousClass0F8 instanceof AnonymousClass0Qc) || ((AnonymousClass0Qc) anonymousClass0F8).RB(anonymousClass0F6)) {
                                anonymousClass0F8.onEvent(anonymousClass0F6);
                                z2 = true;
                            }
                        }
                        i++;
                    }
                    AnonymousClass0hU.m6754C(B);
                } catch (Throwable th2) {
                    AnonymousClass0cQ.m5858H(anonymousClass0F4, 1209129528, I);
                }
            }
            z = z2;
        }
        AnonymousClass0cQ.m5858H(anonymousClass0F4, 981701433, I);
        return z;
    }

    /* renamed from: C */
    public final boolean m1506C(AnonymousClass0F6 anonymousClass0F6) {
        int I = AnonymousClass0cQ.m5859I(this, 537261483);
        boolean B = AnonymousClass0F4.m1503B(this, anonymousClass0F6);
        AnonymousClass0cQ.m5858H(this, -1985616095, I);
        return B;
    }

    /* renamed from: D */
    public final synchronized AnonymousClass0F4 m1507D(Class cls, AnonymousClass0F8 anonymousClass0F8) {
        Set set = (Set) this.f2061D.get(cls);
        if (set != null) {
            synchronized (set) {
                set.remove(anonymousClass0F8);
                if (set.isEmpty()) {
                    this.f2061D.remove(cls);
                }
            }
        }
        return this;
    }
}
