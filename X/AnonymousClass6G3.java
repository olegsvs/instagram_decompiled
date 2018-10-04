package X;

import android.os.SystemClock;
import android.view.View;
import com.facebook.C0164R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.6G3 */
public final class AnonymousClass6G3 extends AnonymousClass66O implements AnonymousClass66N {
    /* renamed from: B */
    public final Set f73543B = new HashSet();
    /* renamed from: C */
    public final AnonymousClass66X f73544C;
    /* renamed from: D */
    public boolean f73545D;
    /* renamed from: E */
    public final AnonymousClass5aa f73546E;
    /* renamed from: F */
    public final AnonymousClass0QL f73547F;
    /* renamed from: G */
    public AnonymousClass5NB f73548G;
    /* renamed from: H */
    public AnonymousClass6Fy f73549H;
    /* renamed from: I */
    public final AnonymousClass0Ch f73550I;
    /* renamed from: J */
    private final AnonymousClass68O f73551J;
    /* renamed from: K */
    private final AnonymousClass0F8 f73552K = new AnonymousClass66P(this);

    public AnonymousClass6G3(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass1ax anonymousClass1ax, AnonymousClass5aa anonymousClass5aa, AnonymousClass0QL anonymousClass0QL, AnonymousClass68O anonymousClass68O) {
        super(anonymousClass0Cm, anonymousClass1ax);
        this.f73546E = anonymousClass5aa;
        this.f73547F = anonymousClass0QL;
        this.f73551J = (AnonymousClass68O) AnonymousClass0LH.E(anonymousClass68O);
        this.f73550I = AnonymousClass0Cg.f1704B;
        this.f73544C = new AnonymousClass66X(this);
    }

    /* renamed from: B */
    public static void m29669B(AnonymousClass6G3 anonymousClass6G3, String str, AnonymousClass5Mw anonymousClass5Mw, AnonymousClass3AG anonymousClass3AG) {
        AnonymousClass3oZ E = anonymousClass6G3.f73551J.m29163E();
        if (E.f44810C) {
            AnonymousClass1ax anonymousClass1ax = anonymousClass6G3.f71811D;
            String str2 = (String) AnonymousClass0LH.E(E.f44809B);
            AnonymousClass3AG anonymousClass66T = new AnonymousClass66T(anonymousClass6G3, str, anonymousClass3AG);
            AnonymousClass0Cn anonymousClass0Cn = anonymousClass1ax.f20394G;
            String str3 = anonymousClass1ax.f20392E;
            String str4 = anonymousClass1ax.f20391D;
            String toLowerCase = anonymousClass5Mw.name().toLowerCase(Locale.ENGLISH);
            Iterable anonymousClass5Ms = new AnonymousClass5Ms(anonymousClass1ax, str);
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
            AnonymousClass0GA H = anonymousClass0Pt.L("live/%s/kickout/", new Object[]{str2}).D("users_to_be_removed", AnonymousClass0RR.B(',').A(anonymousClass5Ms)).D("encoded_server_data_info", str3).D("device_id", str4).D("reason", toLowerCase).M(AnonymousClass0Pv.class).N().H();
            H.f2849B = AnonymousClass1ax.C(anonymousClass1ax, "Kicking out from Broadcast", anonymousClass66T);
            AnonymousClass0Px.B(anonymousClass1ax.f20390C, anonymousClass1ax.f20393F, H);
        }
    }

    /* renamed from: C */
    public static void m29670C(AnonymousClass6G3 anonymousClass6G3, AnonymousClass64k anonymousClass64k) {
        AnonymousClass0LH.H(anonymousClass6G3.f73548G != null);
        AnonymousClass5NB anonymousClass5NB;
        String E;
        AnonymousClass5aa anonymousClass5aa;
        switch (anonymousClass64k.f71537C.ordinal()) {
            case 2:
                return;
            case 3:
                anonymousClass6G3.f73548G.m26349B();
                anonymousClass6G3.f73544C.m29021A(AnonymousClass3ob.INVITE_EXPIRED);
                return;
            case 4:
                anonymousClass6G3.f73548G.m26349B();
                anonymousClass6G3.f73543B.remove(anonymousClass64k.f71536B);
                anonymousClass6G3.f73546E.m27744H(AnonymousClass3ob.GUEST_REJECT, anonymousClass64k.f71536B);
                anonymousClass5NB = anonymousClass6G3.f73548G;
                E = AnonymousClass6G3.m29672E(anonymousClass64k.f71536B);
                AnonymousClass5NB.m26347B(anonymousClass5NB.f62703B.getString(C0164R.string.live_cobroadcast_invitee_decline, new Object[]{E}), anonymousClass5NB.f62706E);
                return;
            case 5:
                long j;
                anonymousClass6G3.f73548G.m26349B();
                anonymousClass6G3.f73548G.m26353F();
                anonymousClass6G3.m29679K(true);
                anonymousClass6G3.f73543B.remove(anonymousClass64k.f71536B);
                anonymousClass5aa = anonymousClass6G3.f73546E;
                String str = anonymousClass64k.f71536B;
                Long l = (Long) anonymousClass5aa.f66667L.get(str);
                if (l == null) {
                    j = -1;
                } else {
                    j = SystemClock.elapsedRealtime() - l.longValue();
                }
                if (anonymousClass5aa.f66666K.containsKey(str)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Guest not removed before added again: ");
                    stringBuilder.append(str);
                    AnonymousClass0Gn.C("IgLiveBroadcastWaterfall", stringBuilder.toString());
                }
                anonymousClass5aa.f66672Q.incrementAndGet();
                anonymousClass5aa.f66666K.put(str, Long.valueOf(anonymousClass5aa.f66658C));
                anonymousClass5aa.f66696o.add(str);
                AnonymousClass5aa.m27728B(anonymousClass5aa, AnonymousClass5MJ.GUEST_COBROADCAST_STARTED).F("guest_id", str).A("respond_time", (double) AnonymousClass5aa.m27734H(j)).B("current_guest_count", anonymousClass5aa.f66666K.size()).B("guest_join_counter", anonymousClass5aa.f66672Q.get()).R();
                anonymousClass6G3.f71811D.B(anonymousClass6G3.m29671D(), anonymousClass6G3.f73547F.DI(), anonymousClass64k.f71536B, AnonymousClass5Mv.JOINED, new AnonymousClass66U(anonymousClass6G3));
                return;
            case 6:
                anonymousClass6G3.f73548G.f62705D.m26355A();
                return;
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                anonymousClass6G3.f73548G.m26353F();
                return;
            case 8:
            case 9:
            case 10:
                anonymousClass6G3.f73548G.m26349B();
                anonymousClass6G3.f73548G.m26350C();
                anonymousClass6G3.f73548G.f62705D.m26355A();
                if (anonymousClass6G3.f73543B.contains(anonymousClass64k.f71536B)) {
                    anonymousClass6G3.f73543B.remove(anonymousClass64k.f71536B);
                    anonymousClass6G3.f73546E.m27744H(AnonymousClass3ob.GUEST_REJECT, anonymousClass64k.f71536B);
                    anonymousClass6G3.f73548G.m26352E(AnonymousClass6G3.m29672E(anonymousClass64k.f71536B));
                    return;
                } else if (anonymousClass64k.f71538D) {
                    long j2;
                    anonymousClass5aa = anonymousClass6G3.f73546E;
                    AnonymousClass5ME anonymousClass5ME = anonymousClass64k.f71537C == AnonymousClass1R4.DISMISSED ? AnonymousClass5ME.BROADCASTER_INITIATED : AnonymousClass5ME.GUEST_INITIATED;
                    String str2 = anonymousClass64k.f71536B;
                    Long l2 = (Long) anonymousClass5aa.f66666K.get(str2);
                    if (l2 == null) {
                        j2 = -1;
                    } else {
                        j2 = anonymousClass5aa.f66658C - l2.longValue();
                    }
                    if (l2 != null) {
                        anonymousClass5aa.f66689h.addAndGet(anonymousClass5aa.f66658C - l2.longValue());
                    }
                    if (!anonymousClass5aa.f66666K.containsKey(str2)) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Guest not previously added to conference: ");
                        stringBuilder2.append(str2);
                        AnonymousClass0Gn.C("IgLiveBroadcastWaterfall", stringBuilder2.toString());
                    }
                    anonymousClass5aa.f66666K.remove(str2);
                    AnonymousClass5aa.m27728B(anonymousClass5aa, AnonymousClass5MJ.GUEST_COBROADCAST_ENDED).F("reason", anonymousClass5ME.name()).F("guest_id", str2).A("cobroadcast_duration", (double) AnonymousClass5aa.m27734H(j2)).B("current_guest_count", anonymousClass5aa.f66666K.size()).B("guest_join_counter", anonymousClass5aa.f66672Q.get()).R();
                    if (anonymousClass64k.f71537C == AnonymousClass1R4.DISCONNECTED) {
                        anonymousClass5NB = anonymousClass6G3.f73548G;
                        E = AnonymousClass6G3.m29672E(anonymousClass64k.f71536B);
                        AnonymousClass5NB.m26347B(anonymousClass5NB.f62703B.getString(C0164R.string.live_cobroadcaster_left, new Object[]{E}), anonymousClass5NB.f62706E);
                    }
                    anonymousClass6G3.f71811D.B(anonymousClass6G3.m29671D(), anonymousClass6G3.f73547F.DI(), anonymousClass64k.f71536B, AnonymousClass5Mv.LEFT, new AnonymousClass66V(anonymousClass6G3));
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: D */
    private String m29671D() {
        return (String) AnonymousClass0LH.E(((AnonymousClass3oZ) AnonymousClass0LH.E(this.f73551J.m29163E())).f44809B);
    }

    /* renamed from: E */
    private static String m29672E(String str) {
        return ((AnonymousClass0Ci) AnonymousClass0LH.E(AnonymousClass0Cg.f1704B.B(str))).uT();
    }

    /* renamed from: E */
    public final void mo6600E(AnonymousClass64k anonymousClass64k) {
        super.mo6600E(anonymousClass64k);
        if (!anonymousClass64k.f71536B.equals(this.f71812E.f1759C)) {
            AnonymousClass6G3.m29670C(this, anonymousClass64k);
        }
    }

    /* renamed from: F */
    public final void mo6601F(String str) {
        super.mo6601F(str);
        AnonymousClass0F4.f2058E.A(AnonymousClass0Za.class, this.f73552K);
    }

    /* renamed from: G */
    public final void mo6602G() {
        super.mo6602G();
        AnonymousClass5NB anonymousClass5NB = this.f73548G;
        if (anonymousClass5NB != null) {
            anonymousClass5NB.m26349B();
        }
        AnonymousClass0F4.f2058E.D(AnonymousClass0Za.class, this.f73552K);
        AnonymousClass3oZ E = this.f73551J.m29163E();
        this.f73545D = false;
        if (E.f44810C && E.f44809B != null) {
            int C = m29005C(AnonymousClass1R4.ACTIVE, true) + m29005C(AnonymousClass1R4.STALLED, true);
            this.f71811D.A(E.f44809B, AnonymousClass5Mx.LEAVE_BROADCAST, Integer.valueOf(C), null);
        }
    }

    /* renamed from: H */
    public final Set m29676H() {
        Set hashSet = new HashSet();
        hashSet.addAll(m29004B(AnonymousClass1R4.ACTIVE, false));
        hashSet.addAll(m29004B(AnonymousClass1R4.STALLED, false));
        hashSet.addAll(m29004B(AnonymousClass1R4.CONNECTED, false));
        return hashSet;
    }

    /* renamed from: I */
    public final Set m29677I() {
        Set hashSet = new HashSet();
        hashSet.addAll(m29004B(AnonymousClass1R4.ACTIVE, false));
        hashSet.addAll(m29004B(AnonymousClass1R4.STALLED, false));
        hashSet.addAll(m29004B(AnonymousClass1R4.CONNECTING, false));
        hashSet.addAll(m29004B(AnonymousClass1R4.CONNECTED, false));
        hashSet.addAll(m29004B(AnonymousClass1R4.INVITED, false));
        return hashSet;
    }

    /* renamed from: J */
    public final void m29678J(Set set, AnonymousClass3oc anonymousClass3oc) {
        AnonymousClass0LH.H(this.f73548G != null);
        if (set.size() != 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Exactly one invitee is expected. Size: ");
            stringBuilder.append(set.size());
            AnonymousClass0Gn.C("IgLiveWithHostController", stringBuilder.toString());
            return;
        }
        if (!this.f73543B.isEmpty()) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Set of current invites is not empty. Size: ");
            stringBuilder.append(this.f73543B.size());
            AnonymousClass0Gn.C("IgLiveWithHostController", stringBuilder.toString());
        }
        this.f73543B.addAll(set);
        AnonymousClass0Ci anonymousClass0Ci = (AnonymousClass0Ci) AnonymousClass0LH.E(this.f73550I.B((String) set.iterator().next()));
        if (anonymousClass0Ci.gB == AnonymousClass2EC.ELIGIBLE_GUEST) {
            this.f73548G.m26351D(anonymousClass0Ci, this.f73544C);
            AnonymousClass5aa anonymousClass5aa = this.f73546E;
            String id = anonymousClass0Ci.getId();
            anonymousClass5aa.f66667L.put(id, Long.valueOf(SystemClock.elapsedRealtime()));
            anonymousClass5aa.f66691j.incrementAndGet();
            AnonymousClass5aa.m27728B(anonymousClass5aa, AnonymousClass5MJ.GUEST_INVITE_SENT).F("source", anonymousClass3oc.A()).F("guest_id", id).B("is_viewer", AnonymousClass5aa.m27735I(Boolean.valueOf(true))).B("current_guest_count", anonymousClass5aa.f66666K.size()).B("guest_join_counter", anonymousClass5aa.f66672Q.get()).R();
            this.f73551J.m29167I(new AnonymousClass66R(this, new HashSet(set), anonymousClass0Ci));
        } else {
            this.f73548G.m26352E(anonymousClass0Ci.uT());
            this.f73543B.remove(anonymousClass0Ci.getId());
        }
    }

    /* renamed from: K */
    public final void m29679K(boolean z) {
        if (this.f73548G != null) {
            if (!z || m29676H().isEmpty() || this.f73545D) {
                this.f73548G.m26350C();
                return;
            }
            AnonymousClass5NB anonymousClass5NB = this.f73548G;
            if (!anonymousClass5NB.f62712K.B()) {
                anonymousClass5NB.f62711J = (ColorFilterAlphaImageView) anonymousClass5NB.f62712K.A().findViewById(C0164R.id.iglive_livewith_kickout);
            }
            AnonymousClass14H.H(true, new View[]{anonymousClass5NB.f62711J});
            this.f73548G.m26348A(true, this.f73544C);
        }
    }

    /* renamed from: L */
    public final boolean m29680L() {
        if (m29676H().isEmpty()) {
            return false;
        }
        this.f73544C.m29022B();
        return true;
    }

    public final void Rt(AnonymousClass64k anonymousClass64k) {
        AnonymousClass6Fy anonymousClass6Fy = this.f73549H;
        if (anonymousClass6Fy != null && !anonymousClass64k.f71536B.equals(anonymousClass6Fy.f73531i.f1759C)) {
            int A = anonymousClass6Fy.f73510N.m29003A() - 1;
            AnonymousClass6G8 anonymousClass6G8 = anonymousClass6Fy.f73520X;
            if (anonymousClass6G8 != null) {
                AnonymousClass6GA anonymousClass6GA = anonymousClass6G8.f73591L;
                if (anonymousClass6GA.f73615T) {
                    anonymousClass6GA.f73600E.mo6625J(A);
                    View view = anonymousClass6GA.f73609N.m29736B().f63132I;
                    if (view != null) {
                        view.setVisibility(anonymousClass6GA.f73605J.A(1) ? 0 : 8);
                    }
                }
            }
            if (AnonymousClass1R4.CONNECTED.equals(anonymousClass64k.f71537C)) {
                anonymousClass6Fy.f73507K = true;
            }
        }
    }
}
