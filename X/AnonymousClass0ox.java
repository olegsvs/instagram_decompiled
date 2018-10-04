package X;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: X.0ox */
public final class AnonymousClass0ox {
    /* renamed from: B */
    private final AnonymousClass0EE f10442B;
    /* renamed from: C */
    private final Set f10443C;
    /* renamed from: D */
    private final AnonymousClass0hq f10444D;

    public AnonymousClass0ox(Set set, AnonymousClass0hq anonymousClass0hq, AnonymousClass0EE anonymousClass0EE) {
        this.f10443C = set;
        this.f10444D = anonymousClass0hq;
        this.f10442B = anonymousClass0EE;
    }

    /* renamed from: A */
    public final void m7765A(AnonymousClass0SD anonymousClass0SD, int i, Map map) {
        String str;
        AnonymousClass0SD anonymousClass0SD2 = anonymousClass0SD;
        if (this.f10443C.contains(anonymousClass0SD.getId())) {
            str = "instagram_netego_sub_impression";
        } else {
            this.f10443C.add(anonymousClass0SD.getId());
            str = "instagram_netego_impression";
        }
        AnonymousClass0ox.m7764B(str, anonymousClass0SD2, i, null, this.f10444D.kR(), this.f10442B, map);
    }

    /* renamed from: B */
    public final void m7766B(AnonymousClass0SD anonymousClass0SD, int i, Long l) {
        AnonymousClass0ox.m7764B("instagram_netego_long_impression", anonymousClass0SD, i, l, this.f10444D.kR(), this.f10442B, null);
    }

    /* renamed from: B */
    private static void m7764B(String str, AnonymousClass0SD anonymousClass0SD, int i, Long l, String str2, AnonymousClass0EE anonymousClass0EE, Map map) {
        AnonymousClass0NN B = AnonymousClass0NN.m3291B(str, anonymousClass0EE);
        String anonymousClass0mZ = anonymousClass0SD.nL().toString();
        if (anonymousClass0SD instanceof AnonymousClass0r1) {
            anonymousClass0mZ = "business_conversion";
        }
        B.m3298F("id", anonymousClass0SD.getId()).m3298F("tracking_token", anonymousClass0SD.YT()).m3298F("type", anonymousClass0mZ).m3294B("position", i).m3298F("session_id", str2);
        if (!"instagram_netego_long_impression".equals(str)) {
            AnonymousClass0qj anonymousClass0qj = AnonymousClass0qj.f10992C;
            B.m3298F("gap_to_last_ad", Integer.toString(anonymousClass0qj.m7936A(AnonymousClass0qk.AD, i))).m3298F("gap_to_last_netego", Integer.toString(anonymousClass0qj.m7936A(AnonymousClass0qk.NETEGO, i))).m3298F("async_ad_source", AnonymousClass11W.m8802B(anonymousClass0SD.getId()));
        }
        if (l != null) {
            B.m3295C("impression_length", l.longValue());
        }
        if (anonymousClass0SD instanceof AnonymousClass0pn) {
            B.m3298F("media_id", AnonymousClass11g.m8818B(((AnonymousClass0pn) anonymousClass0SD).AO().NO()));
        }
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                B.m3298F((String) entry.getKey(), (String) entry.getValue());
            }
        }
        B.m3311S();
    }
}
