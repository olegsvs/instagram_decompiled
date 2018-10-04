package X;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.1YG */
public final class AnonymousClass1YG {
    /* renamed from: B */
    public static void m11831B(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass33c.f37408D.A().m3298F("entry_point", str).m3298F("action", str2).m3298F("step", str3).m3298F("consumer_user_id", str4).m3298F("follow_status", str5).m3310R();
    }

    /* renamed from: C */
    public static void m11832C(String str, String str2) {
        AnonymousClass0db C = AnonymousClass0db.m6067C();
        String str3 = "page_id";
        if (str == null) {
            str = JsonProperty.USE_DEFAULT_NAME;
        }
        C = C.m6074G(str3, str);
        str3 = "location_id";
        if (str2 == null) {
            str2 = JsonProperty.USE_DEFAULT_NAME;
        }
        str = AnonymousClass33c.f37411G.A().m3298F("step", "location_feed").m3296D("default_values", C.m6074G(str3, str2));
        String B = AnonymousClass3Sf.B();
        if (B != null) {
            str.m3298F("entry_point", B);
        }
        str.m3310R();
    }

    /* renamed from: D */
    public static void m11833D(String str) {
        AnonymousClass33c.f37410F.A().m3298F("step", "location_feed").m3296D("available_options", AnonymousClass0db.m6067C().m6074G("error_message", str)).m3310R();
    }

    /* renamed from: E */
    public static void m11834E(String str) {
        AnonymousClass33c.f37409E.A().m3298F("step", "location_feed").m3296D("available_options", AnonymousClass0db.m6067C().m6074G("business_user_id", str)).m3310R();
    }

    /* renamed from: F */
    public static void m11835F(String str) {
        AnonymousClass33c.f37413I.A().m3298F("step", "location_feed").m3298F("consumer_user_id", str).m3310R();
    }

    /* renamed from: G */
    public static void m11836G(String str) {
        AnonymousClass33c.f37412H.A().m3298F("step", "location_feed").m3298F("consumer_user_id", str).m3310R();
    }
}
