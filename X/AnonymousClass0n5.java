package X;

import android.content.Context;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.0n5 */
public final class AnonymousClass0n5 implements AnonymousClass0Qe {
    /* renamed from: B */
    public final AnonymousClass2CW f9996B;
    /* renamed from: C */
    public final AnonymousClass0TL f9997C;
    /* renamed from: D */
    public AnonymousClass0MC f9998D;
    /* renamed from: E */
    private final Context f9999E;
    /* renamed from: F */
    private final Runnable f10000F = new AnonymousClass13c(this);
    /* renamed from: G */
    private final Set f10001G = new HashSet();

    public AnonymousClass0n5(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0TL anonymousClass0TL, AnonymousClass2CW anonymousClass2CW) {
        this.f9999E = context;
        this.f9997C = anonymousClass0TL;
        this.f9996B = anonymousClass2CW;
    }

    /* renamed from: A */
    public final AnonymousClass0n8 m7599A() {
        return this.f9996B.D();
    }

    /* renamed from: B */
    public final void m7600B() {
        AnonymousClass0MC FD = new AnonymousClass0MD(this.f9999E).m3100A().XB("PendingMediaStore.INTENT_ACTION_PENDING_MEDIA_CHANGED", new AnonymousClass13d(this)).FD();
        this.f9998D = FD;
        FD.m3095A();
        m7601C();
    }

    /* renamed from: B */
    public static boolean m7597B(AnonymousClass0n8 anonymousClass0n8) {
        for (AnonymousClass2CT R : anonymousClass0n8.m7605H()) {
            if (R.R()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    public final void m7601C() {
        AnonymousClass0OA anonymousClass0OA;
        PendingMediaStore C = PendingMediaStore.m3537C();
        AnonymousClass0Ze anonymousClass0Ze = AnonymousClass0Ze.IGTV_SHARES;
        List<AnonymousClass0OA> arrayList = new ArrayList(C.f3787B.size());
        for (AnonymousClass0OA anonymousClass0OA2 : C.f3787B.values()) {
            if (anonymousClass0Ze.m5378A(anonymousClass0OA2)) {
                arrayList.add(anonymousClass0OA2);
            }
        }
        Set hashSet = new HashSet();
        AnonymousClass0n8 A;
        if (arrayList.isEmpty()) {
            A = m7599A();
            A.f10011G.clear();
            A.f10010F.clear();
            AnonymousClass0F4.f2058E.m1505B(new AnonymousClass13e(A));
        } else {
            AnonymousClass0n8 A2 = m7599A();
            for (AnonymousClass0OA anonymousClass0OA3 : arrayList) {
                A2.m7611N(m7599A().m7604G(anonymousClass0OA3));
                if (!this.f10001G.contains(anonymousClass0OA3)) {
                    anonymousClass0OA3.m3555A(this);
                    this.f10001G.add(anonymousClass0OA3);
                }
                hashSet.add(anonymousClass0OA3);
                A = m7599A();
                if (anonymousClass0OA3.eB == null && anonymousClass0OA3.iC != AnonymousClass0OC.NOT_UPLOADED && !A.f10011G.containsKey(anonymousClass0OA3.getId())) {
                    A.f10011G.put(anonymousClass0OA3.getId(), anonymousClass0OA3);
                    A.f10010F.add(0, anonymousClass0OA3);
                    AnonymousClass0F4.f2058E.m1505B(new AnonymousClass13e(A));
                } else if (anonymousClass0OA3.eB != null && A.f10011G.containsKey(anonymousClass0OA3.getId())) {
                    A.f10011G.remove(anonymousClass0OA3.getId());
                    A.f10010F.remove(anonymousClass0OA3);
                    AnonymousClass0P7 anonymousClass0P7 = anonymousClass0OA3.eB;
                    A.f10009E.put(anonymousClass0P7.getId(), anonymousClass0P7);
                    A.f10007C.add(0, anonymousClass0P7);
                    AnonymousClass0F4.f2058E.m1505B(new AnonymousClass13e(A));
                } else if (anonymousClass0OA3.iC == AnonymousClass0OC.NOT_UPLOADED) {
                    anonymousClass0OA2 = (AnonymousClass0OA) A.f10011G.remove(anonymousClass0OA3.getId());
                    if (anonymousClass0OA2 != null) {
                        A.f10010F.remove(anonymousClass0OA2);
                    }
                    AnonymousClass0F4.f2058E.m1505B(new AnonymousClass13e(A));
                }
            }
        }
        Iterator it = this.f10001G.iterator();
        while (it.hasNext()) {
            anonymousClass0OA2 = (AnonymousClass0OA) it.next();
            if (!hashSet.contains(anonymousClass0OA2)) {
                anonymousClass0OA2.m3602v(this);
                it.remove();
            }
        }
        this.f9997C.xn(AnonymousClass0n5.m7597B(this.f9996B.D()), AnonymousClass0n5.m7598C(this.f9996B.D()));
    }

    /* renamed from: C */
    public static boolean m7598C(AnonymousClass0n8 anonymousClass0n8) {
        for (AnonymousClass2CT anonymousClass2CT : anonymousClass0n8.m7605H()) {
            if (!anonymousClass2CT.V()) {
                if (anonymousClass2CT.U()) {
                }
            }
            return true;
        }
        return false;
    }

    public final void Cv(AnonymousClass0OA anonymousClass0OA) {
        AnonymousClass0Sy.m4437F(this.f10000F);
    }
}
