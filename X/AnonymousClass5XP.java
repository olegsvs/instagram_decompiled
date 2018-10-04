package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.5XP */
public final class AnonymousClass5XP implements AnonymousClass4ob {
    /* renamed from: B */
    public final List f65839B = new ArrayList();
    /* renamed from: C */
    private List f65840C = Collections.unmodifiableList(new ArrayList());
    /* renamed from: D */
    private final AnonymousClass0EE f65841D;

    public AnonymousClass5XP(AnonymousClass0EE anonymousClass0EE) {
        this.f65841D = anonymousClass0EE;
    }

    /* renamed from: B */
    private static boolean m27384B(AnonymousClass3JS anonymousClass3JS, Set set) {
        for (int i = 0; i < anonymousClass3JS.RN(); i++) {
            if (set.contains(anonymousClass3JS.QN(i).B())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    private static boolean m27385C(AnonymousClass3JS anonymousClass3JS, AnonymousClass3JJ anonymousClass3JJ) {
        for (int i = 0; i < anonymousClass3JS.RN(); i++) {
            AnonymousClass1du QN = anonymousClass3JS.QN(i);
            if (QN.f20802L == AnonymousClass1dy.LIVE_REPLAY) {
                AnonymousClass3JH anonymousClass3JH = (AnonymousClass3JH) QN.f20795E;
                if (anonymousClass3JH == null || !anonymousClass3JJ.aTA(anonymousClass3JH)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: D */
    private static boolean m27386D(AnonymousClass3JS anonymousClass3JS, AnonymousClass1ew anonymousClass1ew) {
        for (int i = 0; i < anonymousClass3JS.RN(); i++) {
            AnonymousClass1du QN = anonymousClass3JS.QN(i);
            if (QN.f20802L == AnonymousClass1dy.MEDIA || QN.f20802L == AnonymousClass1dy.CHANNEL) {
                AnonymousClass0P7 C = AnonymousClass3Jf.C(QN);
                if (C != null) {
                    if (anonymousClass1ew.aTA(C)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean DKA(String str, AnonymousClass0P7 anonymousClass0P7) {
        if (!JF(anonymousClass0P7)) {
            for (AnonymousClass3JS anonymousClass3JS : this.f65840C) {
                for (int i = 0; i < anonymousClass3JS.RN(); i++) {
                    AnonymousClass1du QN = anonymousClass3JS.QN(i);
                    if (QN.f20802L == AnonymousClass1dy.MEDIA && QN.B().equals(str)) {
                        QN.E(anonymousClass0P7);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean JF(AnonymousClass0P7 anonymousClass0P7) {
        for (AnonymousClass3JS HF : this.f65840C) {
            if (HF.HF(anonymousClass0P7)) {
                return true;
            }
        }
        return false;
    }

    public final boolean LF(String str) {
        for (AnonymousClass3JS IF : this.f65840C) {
            if (IF.IF(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean NV() {
        return this.f65840C.isEmpty() ^ 1;
    }

    public final void YB(List list, String str) {
        Set hashSet = new HashSet(this.f65839B.size());
        for (AnonymousClass3JS B : this.f65839B) {
            hashSet.addAll(AnonymousClass3Je.B(B));
        }
        int i = 0;
        for (AnonymousClass3JS anonymousClass3JS : list) {
            if (AnonymousClass5XP.m27384B(anonymousClass3JS, hashSet)) {
                i++;
            } else {
                this.f65839B.add(anonymousClass3JS);
                hashSet.addAll(AnonymousClass3Je.B(anonymousClass3JS));
            }
        }
        if (i > 0) {
            AnonymousClass4pE.m25149B(this.f65841D, i, str);
        }
    }

    public final void clear() {
        this.f65839B.clear();
        this.f65840C = Collections.unmodifiableList(new ArrayList());
    }

    public final void dH(List list, AnonymousClass3JJ anonymousClass3JJ) {
        List arrayList = new ArrayList();
        for (AnonymousClass3JS anonymousClass3JS : this.f65839B) {
            Object obj = 1;
            for (AnonymousClass1ew D : list) {
                if (!AnonymousClass5XP.m27386D(anonymousClass3JS, D)) {
                    obj = null;
                    break;
                }
            }
            if (!(anonymousClass3JJ == null || AnonymousClass5XP.m27385C(anonymousClass3JS, anonymousClass3JJ))) {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(anonymousClass3JS);
            }
        }
        this.f65840C = Collections.unmodifiableList(arrayList);
    }

    public final AnonymousClass1UV hJ(AnonymousClass1e0 anonymousClass1e0) {
        AnonymousClass0Gn.C("ExploreSectionalObjects", "getChannelExploreItem not supported on ExploreSectionalObjects");
        return null;
    }

    public final void iPA(AnonymousClass0nS anonymousClass0nS, boolean z) {
        AnonymousClass0Gn.C("ExploreSectionalObjects", "setMode not supported on ExploreSectionalObjects");
    }

    public final Iterator iterator() {
        return this.f65840C.iterator();
    }
}
