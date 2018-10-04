package X;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.20h */
public final class AnonymousClass20h {
    /* renamed from: D */
    public static final Status f25220D = new Status(8, "The connection to Google Play services was lost");
    /* renamed from: E */
    public static final AnonymousClass2Sq[] f25221E = new AnonymousClass2Sq[0];
    /* renamed from: B */
    public final Set f25222B = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    /* renamed from: C */
    private final AnonymousClass20i f25223C = new AnonymousClass2TN(this);

    public AnonymousClass20h(Map map) {
    }

    /* renamed from: A */
    public final void m14157A() {
        for (AnonymousClass2Sq anonymousClass2Sq : (AnonymousClass2Sq[]) this.f25222B.toArray(f25221E)) {
            anonymousClass2Sq.m15839I(null);
            synchronized (anonymousClass2Sq.f30628B) {
                if (((AnonymousClass1yt) anonymousClass2Sq.f30629C.get()) == null || !anonymousClass2Sq.f30631E) {
                    anonymousClass2Sq.m15835E();
                }
            }
            if (anonymousClass2Sq.m15836F()) {
                this.f25222B.remove(anonymousClass2Sq);
            }
        }
    }

    /* renamed from: B */
    public final void m14158B(AnonymousClass2Sq anonymousClass2Sq) {
        this.f25222B.add(anonymousClass2Sq);
        anonymousClass2Sq.m15839I(this.f25223C);
    }
}
