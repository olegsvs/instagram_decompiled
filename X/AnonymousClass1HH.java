package X;

import com.instagram.video.common.events.IgVideoRealtimeEventPayload$Type;

/* renamed from: X.1HH */
public final class AnonymousClass1HH {
    /* renamed from: B */
    public AnonymousClass1HI f16718B;
    /* renamed from: C */
    public String f16719C;
    /* renamed from: D */
    public AnonymousClass1HL f16720D;
    /* renamed from: E */
    public IgVideoRealtimeEventPayload$Type f16721E;
    /* renamed from: F */
    public String f16722F;

    public final String toString() {
        String str = "IgVideoRealtimeEventPayload[broadcast=%s, type=%s, transaction=%s]";
        Object[] objArr = new Object[3];
        objArr[0] = this.f16719C;
        objArr[1] = this.f16721E;
        AnonymousClass1HL anonymousClass1HL = this.f16720D;
        objArr[2] = anonymousClass1HL != null ? anonymousClass1HL.f16748C : null;
        return AnonymousClass0IE.m2137E(str, objArr);
    }
}
