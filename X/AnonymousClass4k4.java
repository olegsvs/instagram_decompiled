package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;

/* renamed from: X.4k4 */
public final class AnonymousClass4k4 extends AnonymousClass0Tz {
    /* renamed from: C */
    public static final AnonymousClass0Oc f56716C = new AnonymousClass4k3();
    /* renamed from: B */
    public AnonymousClass4db f56717B;

    /* renamed from: A */
    public final String m24945A() {
        return "send_animated_media_message";
    }

    public AnonymousClass4k4(DirectThreadKey directThreadKey, AnonymousClass4db anonymousClass4db, Long l, long j) {
        super(Collections.singletonList(directThreadKey), l, j);
        this.f56717B = anonymousClass4db;
    }

    /* renamed from: E */
    public final /* bridge */ /* synthetic */ Object m24946E() {
        return this.f56717B;
    }

    /* renamed from: F */
    public final AnonymousClass0V0 m24947F() {
        return AnonymousClass0V0.ANIMATED_MEDIA;
    }
}
