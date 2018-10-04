package X;

import android.content.Context;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.Map;

/* renamed from: X.08c */
public final class AnonymousClass08c {
    /* renamed from: B */
    public final RealtimeSinceBootClock f968B;
    /* renamed from: C */
    public final long f969C = this.f968B.now();
    /* renamed from: D */
    public final AnonymousClass06h f970D;
    /* renamed from: E */
    private final AnonymousClass1ih f971E;
    /* renamed from: F */
    private final String f972F;

    public AnonymousClass08c(Context context, AnonymousClass06h anonymousClass06h, RealtimeSinceBootClock realtimeSinceBootClock, AnonymousClass1ih anonymousClass1ih) {
        this.f972F = context.getPackageName();
        this.f970D = anonymousClass06h;
        this.f968B = realtimeSinceBootClock;
        this.f971E = anonymousClass1ih;
    }

    /* renamed from: A */
    public final void m527A(String str) {
        Map D = AnonymousClass05g.m343D("event_type", "verify_sender_failed");
        if (!AnonymousClass1Cn.m9924D(str)) {
            D.put("event_extra_info", str);
        }
        m528B("fbns_auth_intent_event", D);
    }

    /* renamed from: B */
    public final void m528B(String str, Map map) {
        AnonymousClass05f anonymousClass05f = new AnonymousClass05f(str, this.f972F);
        anonymousClass05f.m339A(map);
        this.f971E.reportEvent(anonymousClass05f);
    }

    /* renamed from: C */
    public final void m529C(AnonymousClass08Z anonymousClass08Z, String str, String str2) {
        Map D = AnonymousClass05g.m343D("event_type", anonymousClass08Z.name());
        if (!AnonymousClass1Cn.m9924D(str)) {
            D.put("event_extra_info", str);
        }
        if (!AnonymousClass1Cn.m9924D(str2)) {
            D.put("dpn", str2);
        }
        m528B("fbns_message_event", D);
    }

    /* renamed from: D */
    public final void m530D(AnonymousClass08a anonymousClass08a, String str) {
        Map D = AnonymousClass05g.m343D("event_type", anonymousClass08a.name());
        if (!AnonymousClass1Cn.m9924D(str)) {
            D.put("event_extra_info", str);
        }
        m528B("fbns_registration_event", D);
    }

    /* renamed from: E */
    public final void m531E(AnonymousClass08a anonymousClass08a, String str, String str2, String str3) {
        Map D = AnonymousClass05g.m343D("event_type", anonymousClass08a.name());
        if (!AnonymousClass1Cn.m9924D(str)) {
            D.put("event_extra_info", str);
        }
        if (!AnonymousClass1Cn.m9924D(str2)) {
            D.put("spn", str2);
        }
        if (!AnonymousClass1Cn.m9924D(str3)) {
            D.put("dpn", str3);
        }
        m528B("fbns_registration_event", D);
    }

    /* renamed from: F */
    public final void m532F(AnonymousClass08b anonymousClass08b, String str) {
        Map D = AnonymousClass05g.m343D("event_type", anonymousClass08b.name());
        if (!AnonymousClass1Cn.m9924D(str)) {
            D.put("event_extra_info", str);
        }
        m528B("fbns_service_event", D);
    }
}
