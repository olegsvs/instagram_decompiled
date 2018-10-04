package X;

import com.facebook.C0164R;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/* renamed from: X.6Go */
public final class AnonymousClass6Go {
    /* renamed from: B */
    public long f73822B;
    /* renamed from: C */
    public boolean f73823C;
    /* renamed from: D */
    public AnonymousClass6Gw f73824D;
    /* renamed from: E */
    public final Queue f73825E;
    /* renamed from: F */
    public final Map f73826F;
    /* renamed from: G */
    public final Map f73827G;
    /* renamed from: H */
    public final AnonymousClass1dS f73828H;
    /* renamed from: I */
    public final AnonymousClass1EF f73829I;
    /* renamed from: J */
    public final AnonymousClass0Cm f73830J;
    /* renamed from: K */
    private final AnonymousClass0Ch f73831K;

    public AnonymousClass6Go(AnonymousClass0Cm anonymousClass0Cm) {
        this(anonymousClass0Cm, AnonymousClass0Cg.f1704B, AnonymousClass1EF.f15875C, new PriorityQueue());
    }

    public AnonymousClass6Go(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ch anonymousClass0Ch, AnonymousClass1EF anonymousClass1EF, Queue queue) {
        this.f73822B = 0;
        this.f73830J = anonymousClass0Cm;
        this.f73826F = new LinkedHashMap(16);
        this.f73827G = new AnonymousClass0O7(16);
        this.f73831K = anonymousClass0Ch;
        this.f73829I = anonymousClass1EF;
        this.f73828H = new AnonymousClass1dS(this);
        this.f73825E = queue;
    }

    /* renamed from: A */
    public final boolean m29810A(AnonymousClass6Ae anonymousClass6Ae) {
        AnonymousClass6Aj B = AnonymousClass6Go.m29807B(m29808C(), this.f73831K, anonymousClass6Ae, AnonymousClass6Ai.JOINING);
        if (B == null) {
            String A = anonymousClass6Ae.m29281A();
            this.f73827G.put(A, new AnonymousClass6Gm(anonymousClass6Ae));
            this.f73829I.A(A, this.f73828H, this.f73830J);
            return true;
        }
        String id = B.f72592E.getId();
        AnonymousClass6Aj anonymousClass6Aj = (AnonymousClass6Aj) this.f73826F.get(id);
        if (anonymousClass6Aj == null) {
            this.f73826F.put(id, B);
            if (this.f73822B == 0 && this.f73826F.size() > 1) {
                this.f73822B = AnonymousClass0Gd.E();
            }
            AnonymousClass6Gw anonymousClass6Gw = this.f73824D;
            if (anonymousClass6Gw != null) {
                anonymousClass6Gw.m29838B(B);
            }
            this.f73826F.put(id, new AnonymousClass6Aj(B.f72589B, B.f72592E, B.f72590C, AnonymousClass6Ai.ACTIVE));
            return true;
        } else if ((anonymousClass6Aj.f72590C.equals(B.f72590C) ^ 1) == 0) {
            return false;
        } else {
            return m29809D(anonymousClass6Aj, new AnonymousClass6Aj(B.f72589B, B.f72592E, B.f72590C, AnonymousClass6Ai.ACTIVE));
        }
    }

    /* renamed from: B */
    private static AnonymousClass6Aj m29807B(int i, AnonymousClass0Ch anonymousClass0Ch, AnonymousClass6Ae anonymousClass6Ae, AnonymousClass6Ai anonymousClass6Ai) {
        AnonymousClass0Ci B = anonymousClass0Ch.B(anonymousClass6Ae.m29281A());
        if (B != null) {
            return new AnonymousClass6Aj(i, B, anonymousClass6Ae, anonymousClass6Ai);
        }
        AnonymousClass0Dc.R("VideoCallParticipantsManager", "user not found for %s", new Object[]{r4});
        return null;
    }

    /* renamed from: B */
    public final boolean m29811B() {
        return this.f73822B > 0;
    }

    /* renamed from: C */
    private int m29808C() {
        if (this.f73825E.isEmpty()) {
            return m29813D();
        }
        return ((Integer) this.f73825E.poll()).intValue();
    }

    /* renamed from: C */
    public final Collection m29812C() {
        return this.f73826F.values();
    }

    /* renamed from: D */
    public final int m29813D() {
        return this.f73826F.size();
    }

    /* renamed from: D */
    private boolean m29809D(AnonymousClass6Aj anonymousClass6Aj, AnonymousClass6Aj anonymousClass6Aj2) {
        if (!anonymousClass6Aj.equals(anonymousClass6Aj2)) {
            return false;
        }
        this.f73826F.put(anonymousClass6Aj2.m29285A(), anonymousClass6Aj2);
        AnonymousClass6Gw anonymousClass6Gw = this.f73824D;
        if (anonymousClass6Gw != null) {
            anonymousClass6Gw.m29839C(anonymousClass6Aj);
            this.f73824D.m29838B(anonymousClass6Aj2);
        }
        return true;
    }

    /* renamed from: E */
    public final AnonymousClass6Aj m29814E() {
        return (AnonymousClass6Aj) this.f73826F.get(this.f73830J.f1759C);
    }

    /* renamed from: F */
    public final boolean m29815F(AnonymousClass6Ae anonymousClass6Ae) {
        AnonymousClass6Aj anonymousClass6Aj = (AnonymousClass6Aj) this.f73826F.get(anonymousClass6Ae.m29281A());
        AnonymousClass6Aj B = AnonymousClass6Go.m29807B(anonymousClass6Aj != null ? anonymousClass6Aj.f72589B : -1, this.f73831K, anonymousClass6Ae, AnonymousClass6Ai.LEAVING);
        if (B == null) {
            String A = anonymousClass6Ae.m29281A();
            if (this.f73827G.containsKey(A)) {
                this.f73827G.remove(A);
            } else {
                this.f73827G.put(A, new AnonymousClass6Gn(anonymousClass6Ae));
                this.f73829I.A(A, this.f73828H, this.f73830J);
            }
            return true;
        }
        String id = B.f72592E.getId();
        if (anonymousClass6Aj == null || (anonymousClass6Aj.f72590C.equals(B.f72590C) ^ 1) != 0) {
            return false;
        }
        AnonymousClass6Gw anonymousClass6Gw = this.f73824D;
        if (anonymousClass6Gw != null) {
            anonymousClass6Gw.m29839C(B);
        }
        this.f73826F.remove(id);
        this.f73825E.add(Integer.valueOf(anonymousClass6Aj.f72589B));
        return true;
    }

    /* renamed from: G */
    public final boolean m29816G(AnonymousClass6Ae anonymousClass6Ae) {
        AnonymousClass6Aj anonymousClass6Aj = (AnonymousClass6Aj) this.f73826F.get(anonymousClass6Ae.m29281A());
        AnonymousClass6Aj B = AnonymousClass6Go.m29807B(anonymousClass6Aj != null ? anonymousClass6Aj.f72589B : -1, this.f73831K, anonymousClass6Ae, AnonymousClass6Ai.ACTIVE);
        if (B == null) {
            String A = anonymousClass6Ae.m29281A();
            if (this.f73827G.containsKey(A)) {
                ((AnonymousClass6Al) this.f73827G.get(A)).f72599B = anonymousClass6Ae;
            } else {
                AnonymousClass0Gn.C("VideoCallParticipantsManager_queueUpdateParticipant", "Attempt to update a participant that is not in cache and is not currently being fetched.");
            }
        } else {
            String id = B.f72592E.getId();
            StringBuilder stringBuilder;
            if (anonymousClass6Aj == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Attempt to update non-existent participant. mediaStreamInfo.streamId: ");
                stringBuilder.append(anonymousClass6Ae.f72556C);
                AnonymousClass0Gn.C("VideoCallParticipantsManager_updateParticipant", stringBuilder.toString());
            } else if ((anonymousClass6Aj.f72590C.equals(B.f72590C) ^ 1) != 0) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Attempt to update non-existent stream. mediaStreamInfo.streamId: ");
                stringBuilder.append(anonymousClass6Ae.f72556C);
                AnonymousClass0Gn.C("VideoCallParticipantsManager_updateParticipant", stringBuilder.toString());
            } else {
                Object obj;
                AnonymousClass6Gw anonymousClass6Gw;
                Object obj2;
                AnonymousClass6Bh anonymousClass6Bh;
                AnonymousClass0Ci anonymousClass0Ci;
                if (B != null && anonymousClass6Aj.equals(B)) {
                    AnonymousClass6Ae anonymousClass6Ae2 = anonymousClass6Aj.f72590C;
                    AnonymousClass6Ae anonymousClass6Ae3 = B.f72590C;
                    obj = (anonymousClass6Ae3 == null || !anonymousClass6Ae2.equals(anonymousClass6Ae3) || (anonymousClass6Ae2.f72555B == anonymousClass6Ae3.f72555B && anonymousClass6Ae2.f72557D == anonymousClass6Ae3.f72557D)) ? null : 1;
                    if (!(obj == null && anonymousClass6Aj.f72591D == B.f72591D)) {
                        obj = 1;
                        if (obj != null) {
                            this.f73826F.put(id, B);
                            anonymousClass6Gw = this.f73824D;
                            if (anonymousClass6Gw != null) {
                                AnonymousClass6Gw.m29833F(anonymousClass6Gw, B);
                                obj2 = (anonymousClass6Aj.m29287C() || B.m29287C()) ? null : 1;
                                if (!(anonymousClass6Gw.f73851D || obj2 == null || B.m29286B(anonymousClass6Gw.f73856I))) {
                                    anonymousClass6Bh = anonymousClass6Gw.f73859L;
                                    anonymousClass0Ci = B.f72592E;
                                    AnonymousClass6Bh.m29355G(anonymousClass6Bh, anonymousClass6Bh.f72796E.getString(C0164R.string.videocall_participant_turned_camera_off, new Object[]{anonymousClass0Ci.uT()}));
                                }
                            }
                        }
                    }
                }
                obj = null;
                if (obj != null) {
                    this.f73826F.put(id, B);
                    anonymousClass6Gw = this.f73824D;
                    if (anonymousClass6Gw != null) {
                        AnonymousClass6Gw.m29833F(anonymousClass6Gw, B);
                        if (anonymousClass6Aj.m29287C()) {
                        }
                        anonymousClass6Bh = anonymousClass6Gw.f73859L;
                        anonymousClass0Ci = B.f72592E;
                        AnonymousClass6Bh.m29355G(anonymousClass6Bh, anonymousClass6Bh.f72796E.getString(C0164R.string.videocall_participant_turned_camera_off, new Object[]{anonymousClass0Ci.uT()}));
                    }
                }
            }
            return false;
        }
        return true;
    }
}
